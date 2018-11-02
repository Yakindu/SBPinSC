package com.yakindu.sct.domain.scenario.simulation;

import java.util.List;

import org.yakindu.base.types.Event;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.simulation.core.sexec.container.CycleBasedSimulationEngine;

public class ScenarioCycleBasedSimulationEngine extends CycleBasedSimulationEngine implements IScenarioEvents {

	public ScenarioCycleBasedSimulationEngine(Statechart statechart) {
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
			return ((IScenarioEvents)interpreter).getSelectedEvents();

		return null;
	}

	@Override
	public List<Event> getSelectedEvents() {
		if (interpreter instanceof IScenarioEvents ) 
			return ((IScenarioEvents)interpreter).getSelectedEvents();

		return null;
	}

}
