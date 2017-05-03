package com.yakindu.sct.domain.scenario.generator.example

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yakindu.sct.generator.core.ISGraphGenerator
import org.yakindu.sct.model.sgen.GeneratorEntry
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Statechart
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope
import com.yakindu.sct.domain.scenario.scenariotext.BlockedEventSet
import com.yakindu.sct.domain.scenario.scenariotext.RequestedEventSet

/**
 * Simple example how to use Blocks / Requested Event sets in code generator based on SGraph Meta Model
 */
class ScenarioExampleGenerator implements ISGraphGenerator {

	override generate(Statechart sc, GeneratorEntry entry, IFileSystemAccess access) {
		access.generateFile(sc.name + '.txt', sc.info);
	}

	def info(
		Statechart sc) {
		'''
			The name of the state machine is '«sc.name»'
			
			The state machine has the following states:
			
				«FOR State state : sc.regions.map[vertices].flatten.filter(State)»
					«state.name»
					
					The state blocks the following events:
					«FOR blockedEventSet : state.scopes.filter(ScenarioStateScope).map[eventSets.filter(BlockedEventSet)].flatten»
						«FOR event : blockedEventSet.events»
							«event.name»
						«ENDFOR»
					«ENDFOR»
					
					The state requested the following events:
					«FOR requestedEventSet : state.scopes.filter(ScenarioStateScope).map[eventSets.filter(RequestedEventSet)].flatten»
						«FOR event : requestedEventSet.events»
							«event.name»
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
		'''.toString
	}
}
