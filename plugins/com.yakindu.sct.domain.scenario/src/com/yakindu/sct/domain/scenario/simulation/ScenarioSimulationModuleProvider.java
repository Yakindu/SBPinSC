/**
* Copyright (c) 2017 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	Andreas Muelder - itemis AG
*
*/
package com.yakindu.sct.domain.scenario.simulation;

import org.yakindu.sct.domain.generic.simulation.GenericSimulationModule;
import org.yakindu.sct.domain.generic.simulation.SimulationModuleProvider;
import org.yakindu.sct.simulation.core.sexec.container.ISimulationEngineFactory;
import org.yakindu.sct.simulation.core.sexec.interpreter.IExecutionFlowInterpreter;

import com.google.inject.Module;

/**
 *
 * @author andreas muelder - Initial contribution and API
 * @author terfloth - override simulation module.
 *
 */
public class ScenarioSimulationModuleProvider extends SimulationModuleProvider {

	@Override
	public Module getModule(String... options) throws IllegalArgumentException {
		
		return new GenericSimulationModule(){

			@SuppressWarnings("unused")
			public Class<? extends ISimulationEngineFactory> bindISimulationEngineFactory() {
				return ScenarioSimulationEngineFactory.class;
			}

			@Override
			public Class<? extends IExecutionFlowInterpreter> bindIExecutionFlowInterpreter() {
				return ScenarioExecutionFlowInterpreter.class;
			}
			
		};

//		return Modules.override(baseModule).with(new AbstractGenericModule() {
//			
////			@SuppressWarnings("unused")
////			public Class<? extends ISimulationEngineFactory> bindISimulationEngineFactory() {
////				return ScenarioSimulationEngineFactory.class;
////			}
//			
//			@SuppressWarnings("unused")
//			public Class<? extends IExecutionFlowInterpreter> bindIExecutionFlowInterpreter() {
//				return ScenarioExecutionFlowInterpreter.class;
//			}
//			
//			
//		});
	}
	
	
	
}
