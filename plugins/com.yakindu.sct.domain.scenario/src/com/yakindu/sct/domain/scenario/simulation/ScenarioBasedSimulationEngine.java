package com.yakindu.sct.domain.scenario.simulation;

import java.util.ArrayList;
import java.util.List;

import org.yakindu.base.expressions.interpreter.IExpressionInterpreter;
import org.yakindu.base.types.Event;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.simulation.core.engine.scheduling.ITimeTaskScheduler.TimeTask;
import org.yakindu.sct.simulation.core.sexec.container.AbstractExecutionFlowSimulationEngine;

import com.google.inject.Inject;

public class ScenarioBasedSimulationEngine extends AbstractExecutionFlowSimulationEngine implements IScenarioEvents, IExecutionProcess {

	@Inject
	protected IExpressionInterpreter statementInterpreter;

	public ScenarioBasedSimulationEngine(Statechart statechart) {
		super(statechart);
	}

	@Override
	public List<Event> getRequestedEvents() {
		if (interpreter instanceof IScenarioEvents ) 
			return ((IScenarioEvents)interpreter).getRequestedEvents();
	
		return null;
	}

	@Override
	public List<Event> getBlockedEvents() {
		if (interpreter instanceof IScenarioEvents ) 
			return ((IScenarioEvents)interpreter).getBlockedEvents();
	
		return null;
	}

	@Override
	public List<Event> getEnabledEvents() {
		if (interpreter instanceof IScenarioEvents ) 
			return ((IScenarioEvents)interpreter).getEnabledEvents();
	
		return null;
	}

	@Override
	public List<Event> getSelectedEvents() {
		if (interpreter instanceof IScenarioEvents ) 
			return ((IScenarioEvents)interpreter).getSelectedEvents();
	
		return null;
	}

	/**
	 * TODO: The simulator should not interfere in the runCycle behavior
	 */
	protected void processRunCycle() {
		interpreter.runCycle();
	
		if (interpreter instanceof ScenarioExecutionFlowInterpreter) 
			if (suspended) getScenarioInterpreter().getProcess().processStep();
			else  getScenarioInterpreter().getProcess().processQueue();
	}

	public void stepForward() {
		
		if ((getScenarioInterpreter() != null) && getScenarioInterpreter().getProcess().hasWork()) {
			try {
				getScenarioInterpreter().getProcess().processStep();
			} catch (Exception e) {
				handleException(e);
			}
		} else {
			super.stepForward();
		}
	}

	public void resume() {
		try {
			getScenarioInterpreter().getProcess().processQueue();
			
			context.getSuspendedElements().clear();
			suspended = false;
			timeTaskScheduler.resume();
		} catch (Exception ex) {
			handleException(ex);
		}
	}

	protected ScenarioExecutionFlowInterpreter getScenarioInterpreter() {
		if (interpreter instanceof ScenarioExecutionFlowInterpreter) 
			return ((ScenarioExecutionFlowInterpreter) interpreter);
		else 
			return null;
		
	}

	@Override
	public List<IExecutionStep> getExecutionSteps() {
		List<IExecutionStep> steps = new ArrayList<IExecutionStep>();
		
		if ( getScenarioInterpreter() != null ) {
			steps.addAll(getScenarioInterpreter().getProcess().stepQueue);
		}
		
		if ( timeTaskScheduler instanceof InspectableTimeTaskScheduler ) {
			InspectableTimeTaskScheduler scheduler = (InspectableTimeTaskScheduler) timeTaskScheduler;
			List<TimeTask> timeTasks = scheduler.getScheduledTimeTasks();
			
			for (TimeTask timeTask : timeTasks) {
				String descr;
				if (timeTask instanceof InspectableTimeTask) {
					descr =  ((InspectableTimeTask)timeTask).getName();
				} else {
					descr = "time task";
				}
	
				steps.add(new AbstractExecutionStep(descr, timeTask.getNextExecutionTime()) {
					
					@Override
					public void execute() {
						timeTask.run();
					}
					
				});
			}
		}
		
		return steps;
	}

}