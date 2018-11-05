package com.yakindu.sct.domain.scenario.simulation;

import org.yakindu.sct.simulation.core.engine.scheduling.ITimeTaskScheduler.TimeTask;

public class InspectableTimeTask extends TimeTask {

	protected String myName; // TODO make name in superclass protected - is hidden (package visible) thus this work around...
	
	public InspectableTimeTask(String name, Runnable callBack) {
		this(name, callBack, Priority.NORMAL);
	}

	public InspectableTimeTask(String name, Runnable callBack, Priority priority) {
		super(name, callBack, priority);
		myName = name;
	}
	
	public String getName() {
		return myName;
	}
}
