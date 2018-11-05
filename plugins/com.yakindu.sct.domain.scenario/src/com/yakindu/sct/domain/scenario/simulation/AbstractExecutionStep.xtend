package com.yakindu.sct.domain.scenario.simulation

import com.yakindu.sct.domain.scenario.simulation.IExecutionStep

abstract class AbstractExecutionStep implements IExecutionStep {
	
	new (String description, long time) {
		this.description = description
		this.time = time
	}
	
	new (String description) {
		this(description, -1l)	
	}
	
	protected String	 description
	override String getDescription()	{ return description }

	protected long time
	override long getTime()	{ return time }
	
	
}