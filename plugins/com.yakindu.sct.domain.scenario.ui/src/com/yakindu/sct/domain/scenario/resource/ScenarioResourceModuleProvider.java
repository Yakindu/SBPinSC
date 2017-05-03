package com.yakindu.sct.domain.scenario.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.yakindu.sct.domain.extension.IDomain;
import org.yakindu.sct.domain.extension.IModuleProvider;
import org.yakindu.sct.model.stext.resource.StextResource;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import com.yakindu.sct.domain.scenario.ScenarioTextRuntimeModule;
import com.yakindu.sct.domain.scenario.ui.ScenarioTextUiModule;
import com.yakindu.sct.domain.scenario.ui.internal.ScenarioTextActivator;

public class ScenarioResourceModuleProvider implements IModuleProvider {

	@Override
	public Module getModule(String... options) {
		if (options.length == 1 && IDomain.OPTION_HEADLESS.equals(options[0])) {
			return getLanguageRuntimeModule();
		}
		Module module = Modules.override(getLanguageRuntimeModule())
				.with(new ScenarioTextUiModule(ScenarioTextActivator.getInstance()));
		module = Modules.override(module).with(new Module() {
			@Override
			public void configure(Binder binder) {
				binder.bind(Resource.class).to(StextResource.class);
			}
		});
		return Modules.override(module).with(new SharedStateModule());
	}

	protected Module getLanguageRuntimeModule() {
		return new ScenarioTextRuntimeModule();
	}

}
