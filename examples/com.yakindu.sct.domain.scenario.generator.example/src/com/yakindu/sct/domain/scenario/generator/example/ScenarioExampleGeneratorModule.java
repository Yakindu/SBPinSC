package com.yakindu.sct.domain.scenario.generator.example;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.yakindu.sct.generator.core.GeneratorModule;
import org.yakindu.sct.generator.core.ISGraphGenerator;
import org.yakindu.sct.model.sgen.GeneratorEntry;
import org.yakindu.sct.model.stext.naming.StextNameProvider;

import com.google.inject.Binder;

public class ScenarioExampleGeneratorModule implements GeneratorModule {

	public void configure(GeneratorEntry entry, Binder binder) {
		binder.bind(ISGraphGenerator.class).to(ScenarioExampleGenerator.class);
		binder.bind(IQualifiedNameProvider.class).to(StextNameProvider.class);
	}
}
