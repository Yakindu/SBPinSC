package com.yakindu.sct.domain.scenario.simulation;

public interface IExecutionStep {
	void execute();
	String getDescription();
	long getTime();
}
