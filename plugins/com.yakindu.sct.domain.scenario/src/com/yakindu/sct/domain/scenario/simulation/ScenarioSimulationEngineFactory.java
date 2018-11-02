package com.yakindu.sct.domain.scenario.simulation;

import org.eclipse.core.runtime.CoreException;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.lib.StatechartAnnotations;
import org.yakindu.sct.simulation.core.engine.ISimulationEngine;
import org.yakindu.sct.simulation.core.sexec.container.DefaultSimulationEngineFactory;

import com.google.inject.Inject;

public class ScenarioSimulationEngineFactory extends DefaultSimulationEngineFactory {

	@Inject
	private StatechartAnnotations annotations;

	
	@Override protected ISimulationEngine createController(Statechart statechart) throws CoreException {
		if (annotations.isEventDriven(statechart)) {
			return new ScenarioEventDrivenSimulationEngine(statechart);
		}
		return new ScenarioCycleBasedSimulationEngine(statechart);
	}

}
