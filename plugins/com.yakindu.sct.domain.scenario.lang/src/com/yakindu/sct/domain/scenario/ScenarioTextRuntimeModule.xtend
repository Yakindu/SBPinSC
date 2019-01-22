package com.yakindu.sct.domain.scenario

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Constants
import org.eclipse.xtext.linking.ILinker
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.parser.antlr.IReferableElementsUnloader
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.validation.CompositeEValidator
import org.yakindu.base.expressions.terminals.ExpressionsValueConverterService
import org.yakindu.base.types.inferrer.ITypeSystemInferrer
import org.yakindu.base.types.typesystem.GenericTypeSystem
import org.yakindu.base.types.typesystem.ITypeSystem
import org.yakindu.sct.domain.^extension.DomainRegistry
import org.yakindu.sct.model.sgraph.resource.SCTLinker
import org.yakindu.sct.model.stext.inferrer.STextTypeInferrer
import org.yakindu.sct.model.stext.naming.StextNameProvider
import org.yakindu.sct.model.stext.resource.SCTResourceDescriptionStrategy
import org.yakindu.sct.model.stext.resource.StextResource
import org.yakindu.sct.model.stext.scoping.STextGlobalScopeProvider
import com.google.inject.Binder
import com.google.inject.name.Names

class ScenarioTextRuntimeModule extends AbstractScenarioTextRuntimeModule {

	override configureLanguageName(Binder binder) {
		binder.bind(String).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance(
			"com.yakindu.sct.domain.scenario.ScenarioText")
		binder.bind(String).annotatedWith(Names.named(DomainRegistry.DOMAIN_ID)).toInstance(
			"com.yakindu.domain.scenario")
	}

	// Copied from STextRuntimeModule
	override void configure(Binder binder) {
		super.configure(binder)
		binder.bind(IDefaultResourceDescriptionStrategy).to(SCTResourceDescriptionStrategy)
		// https://github.com/Yakindu/statecharts/issues/1199
		binder.bind(IReferableElementsUnloader).to(IReferableElementsUnloader.NullUnloader)
	}

	override Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return STextGlobalScopeProvider
	}

	override Class<? extends ILinker> bindILinker() {
		return SCTLinker
	}

	def Class<? extends Resource> bindResource() {
		return StextResource
	}

	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return StextNameProvider
	}

	override Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return ExpressionsValueConverterService
	}

	override void configureFileExtensions(Binder binder) {
		binder.bind(String).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("stext,sct")
	}

	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider).annotatedWith(
			com.google.inject.name.Names.named(
				org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(
			org.yakindu.sct.model.stext.scoping.StextImportAwareScopeProvider)
		binder.bind(ITypeSystem).toInstance(getTypeSystem())
		binder.bind(boolean).annotatedWith(Names.named(CompositeEValidator.USE_EOBJECT_VALIDATOR)).toInstance(false)
	}

	def protected ITypeSystem getTypeSystem() {
		return GenericTypeSystem.getInstance()
	}

	def Class<? extends ITypeSystemInferrer> bindITypeSystemInferrer() {
		return STextTypeInferrer
	}
}
