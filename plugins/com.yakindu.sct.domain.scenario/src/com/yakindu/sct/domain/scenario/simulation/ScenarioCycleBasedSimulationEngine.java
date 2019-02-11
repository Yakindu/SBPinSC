package com.yakindu.sct.domain.scenario.simulation;

import static org.yakindu.sct.model.stext.lib.StatechartAnnotations.CYCLE_BASED_ANNOTATION;

import org.yakindu.base.types.Annotation;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sruntime.SRuntimeFactory;
import org.yakindu.sct.simulation.core.engine.scheduling.ITimeTaskScheduler.TimeTask;
import org.yakindu.sct.simulation.core.engine.scheduling.ITimeTaskScheduler.TimeTask.Priority;
import org.yakindu.sct.simulation.core.sexec.container.CycleBasedSimulationEngine;

public class ScenarioCycleBasedSimulationEngine extends ScenarioBasedSimulationEngine  {

	
	public ScenarioCycleBasedSimulationEngine(Statechart statechart) {
		super(statechart);
	}

	@Override
	public void init() {
		super.init();
		scheduleCycleEvent();
	}

	protected void scheduleCycleEvent() {
		Long cyclePeriod = CycleBasedSimulationEngine.DEFAULT_CYCLE_PERIOD;
		Annotation cycleBased = (Annotation) getStatechart()
				.getAnnotationOfType(CYCLE_BASED_ANNOTATION);
		if (cycleBased != null) {
			cyclePeriod = (Long) statementInterpreter.evaluate(cycleBased.getArguments().get(0),
					SRuntimeFactory.eINSTANCE.createExecutionContext());
		}

		TimeTask cycleTask = new InspectableTimeTask("run cycle - super step", () -> {
			try {
				processRunCycle();
			} catch (Exception e) {
				handleException(e);
			}
		}, Priority.LOW);
		timeTaskScheduler.scheduleTimeTask(cycleTask, true, cyclePeriod);
	}
}


