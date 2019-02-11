/*
 * (c) by committers of YAKINDU */
package com.yakindu.sct.domain.scenario.ide

import com.google.inject.Guice
import com.yakindu.sct.domain.scenario.ScenarioTextRuntimeModule
import com.yakindu.sct.domain.scenario.ScenarioTextStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ScenarioTextIdeSetup extends ScenarioTextStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ScenarioTextRuntimeModule, new ScenarioTextIdeModule))
	}
	
}
