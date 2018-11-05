package com.yakindu.sct.domain.scenario.simulation

import java.util.Queue
import java.util.LinkedList

class ExecutionProcess {

	protected Queue<IExecutionStep> stepQueue = new LinkedList<IExecutionStep>();
	
	def void schedule(IExecutionStep step) {
		stepQueue.add(step)
	}
	
	def boolean hasWork() { !stepQueue.empty }
	
	def void processQueue() {
		while (stepQueue.size > 0) {
			processStep
		}
	}
 	
 	def void processStep() {
 		val step = stepQueue.poll
 
		// System.out.println("process step: " + step)
 		if (step !== null) step.execute
 	}
	
}