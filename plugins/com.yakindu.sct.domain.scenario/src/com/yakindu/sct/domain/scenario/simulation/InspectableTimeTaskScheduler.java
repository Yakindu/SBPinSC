package com.yakindu.sct.domain.scenario.simulation;

import java.util.Arrays;
import java.util.List;

import org.yakindu.sct.simulation.core.engine.scheduling.DefaultTimeTaskScheduler;

import com.google.inject.Singleton;

@Singleton
public class InspectableTimeTaskScheduler extends DefaultTimeTaskScheduler {

	public InspectableTimeTaskScheduler() {
	}

	public List<TimeTask> getScheduledTimeTasks() {
		TimeTask[] taskArray =  new TimeTask[tasks.size()];
		taskArray = tasks.toArray(taskArray);
		Arrays.sort(taskArray);
		return Arrays.asList(taskArray);
	}
}
