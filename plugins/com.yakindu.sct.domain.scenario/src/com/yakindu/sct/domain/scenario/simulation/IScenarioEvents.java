package com.yakindu.sct.domain.scenario.simulation;

import java.util.List;

import org.yakindu.base.types.Event;

public interface IScenarioEvents {

	List<Event> getRequestedEvents();
	List<Event> getBlockedEvents();
	List<Event> getEnabledEvents();
	List<Event> getSelectedEvents();
	
}
