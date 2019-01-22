/*
 * (c) by committers of YAKINDU */
package com.yakindu.sct.domain.scenario


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ScenarioTextStandaloneSetup extends ScenarioTextStandaloneSetupGenerated {

	def static void doSetup() {
		new ScenarioTextStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
