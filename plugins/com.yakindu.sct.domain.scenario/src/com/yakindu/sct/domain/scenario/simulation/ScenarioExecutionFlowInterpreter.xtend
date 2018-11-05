package com.yakindu.sct.domain.scenario.simulation

import com.google.inject.Inject
import com.yakindu.sct.domain.scenario.scenariotext.BlockedEventSet
import com.yakindu.sct.domain.scenario.scenariotext.RequestedEventSet
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope
import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sruntime.ExecutionEvent
import org.yakindu.sct.simulation.core.sexec.interpreter.DefaultExecutionFlowInterpreter
import com.google.inject.Singleton
import org.yakindu.sct.model.sexec.ScheduleTimeEvent

@Singleton
class ScenarioExecutionFlowInterpreter extends DefaultExecutionFlowInterpreter implements IScenarioEvents {


	protected ExecutionProcess process = new ExecutionProcess()
	def ExecutionProcess getProcess() { return this.process }
	

	@Inject
	protected extension IQualifiedNameProvider nameProvider
	
	@Inject
	protected extension InspectableTimeTaskScheduler timeTaskScheduler // TODO: make timeScheduler in base class protected!!
	
	protected List<org.yakindu.base.types.Event> requestedEvents
	protected List<org.yakindu.base.types.Event> blockedEvents
	protected List<org.yakindu.base.types.Event> enabledEvents
	protected List<org.yakindu.base.types.Event> selectedEvents
	
	protected int superCycleCount = 0
	protected int microCycleCount = 0

	
	
	override getRequestedEvents() {
		return this.requestedEvents
	}
	
	override getBlockedEvents() {
		return this.blockedEvents
	}
	
	override getEnabledEvents() {
		return this.enabledEvents
	}
	
	override getSelectedEvents() {
		return this.selectedEvents
	}
	
	

	def void doRunCycle() {
		
		
		// execute all environment events of the state machine ... 
		super.runCycle
	
		// determineEnabledEvents
		
//		while (enabledEvents !== null && enabledEvents.size > 0) {
//			
//			//System.out.println("enabled (" + superCycleCount + "." + microCycleCount + ") :" + enabledEvents.map([ e | e.fullyQualifiedName.toString]));
//			
//			enabledEvents.forEach[ e | (executionContext.getSlot(e.fullyQualifiedName.toString) as ExecutionEvent).raised = true]
//			super.runCycle
//			
//			determineEnabledEvents
//			
//			microCycleCount += 1
//		}
		
		superCycleCount += 1
	}
	
		
	def void doSelectEnabledEvents() {
		determineEnabledEvents
		
		if (enabledEvents !== null && enabledEvents.size > 0) {
			selectedEvents = new ArrayList<org.yakindu.base.types.Event>();
			selectedEvents.addAll(enabledEvents)
			
			// selectedEvents.forEach[ e | (executionContext.getSlot(e.fullyQualifiedName.toString) as ExecutionEvent).raised = true]
			
			processEnabledEvents
			microCycleCount += 1
			
		}
	}
	
	
	def void doProcessEnabledEvents() {

		selectedEvents.forEach[ e | (executionContext.getSlot(e.fullyQualifiedName.toString) as ExecutionEvent).raised = true]		
		super.runCycle
		selectedEvents.clear
		enabledEvents.clear
		requestedEvents.clear
		blockedEvents.clear
		
		selectEnabledEvents
	}
	
		 
	override void runCycle() {
		
		processCycle
		selectEnabledEvents		
	}
	
	
	def void processCycle() {
		
		val runCycleStep = new AbstractExecutionStep("run cycle - super step") {
			
			override execute() {
				doRunCycle				
			}
			
		}
		process.schedule(runCycleStep)
		
				
	}
	
	
	def void selectEnabledEvents() {

		val step = new AbstractExecutionStep("select scenario events") {
			
			override execute() {
				doSelectEnabledEvents				
			}
			
			
		}
		process.schedule(step)
		
	}
	
	
	def void processEnabledEvents() {

		val step = new AbstractExecutionStep("process selected events") {
			
			override execute() {
				doProcessEnabledEvents				
			}
			
		}
		process.schedule(step)
		
	}
	
	
	def void determineEnabledEvents() {
		requestedEvents = collectRequestedEvents
		blockedEvents = collectBlockedEvents
		
		var List<org.yakindu.base.types.Event> enabled = new ArrayList<org.yakindu.base.types.Event>(requestedEvents)
		enabled.removeAll(blockedEvents)
		enabledEvents = enabled
		
		// System.out.println("requested: " + requestedEvents.map([ e | e.fullyQualifiedName.toString]));
		// System.out.println("- blocked: " + blockedEvents.map([ e | e.fullyQualifiedName.toString]));
	}


	def List<org.yakindu.base.types.Event> collectRequestedEvents() {
		val eventList = new ArrayList<org.yakindu.base.types.Event>();
		this.activeStateConfiguration.forEach[ s | if (s!==null) (s.sourceElement as State).collectReqested(eventList) ]	
		
		return eventList
	}

	def dispatch void collectReqested(State state, List<org.yakindu.base.types.Event> eventList) {
		// add requested events from state to eventList
		state.scopes
			.filter(ScenarioStateScope)
			.forEach[ s | s.eventSets
				.filter(RequestedEventSet)
				.forEach[ es | es.events
						.forEach[ e | if (! eventList.contains(e)) eventList.add(e)]]]
						
		// also add requested events from parent
		state.parentRegion.collectReqested(eventList)
	}
	
	
	def dispatch void collectReqested(Region region, List<org.yakindu.base.types.Event> eventList) {
		// just add events from parent
		region.composite.collectReqested(eventList)
	}

	def dispatch void collectReqested(Object any, List<org.yakindu.base.types.Event> eventList) {
		// just do nothing
	}



	def List<org.yakindu.base.types.Event> collectBlockedEvents() {
		val eventList = new ArrayList<org.yakindu.base.types.Event>();
		this.activeStateConfiguration.forEach[ s | if (s!==null) (s.sourceElement as State).collectBlocked(eventList) ]	
		
		return eventList
	}


	def dispatch void collectBlocked(State state, List<org.yakindu.base.types.Event> eventList) {
		// add requested events from state to eventList
		state.scopes
			.filter(ScenarioStateScope)
			.forEach[ s | s.eventSets
				.filter(BlockedEventSet)
				.forEach[ es | es.events
						.forEach[ e | if (! eventList.contains(e)) eventList.add(e)]]]
						
		// also add requested events from parent
		state.parentRegion.collectBlocked(eventList)
	}
	
	
	def dispatch void collectBlocked(Region region, List<org.yakindu.base.types.Event> eventList) {
		// just add events from parent
		region.composite.collectBlocked(eventList)
	}

	def dispatch void collectBlocked(Object any, List<org.yakindu.base.types.Event> eventList) {
		// just do nothing
	}
	


	override dispatch Object execute(ScheduleTimeEvent scheduleTimeEvent) {
		val timeEvent = scheduleTimeEvent.timeEvent
		val duration = statementInterpreter.evaluate(scheduleTimeEvent.timeValue, executionContext)
		timeTaskScheduler.scheduleTimeTask(new InspectableTimeTask(timeEvent.name, [
			executionContext.getEvent(timeEvent.name).raised = true
		]), timeEvent.periodic, duration as Long)
		null
	}

}