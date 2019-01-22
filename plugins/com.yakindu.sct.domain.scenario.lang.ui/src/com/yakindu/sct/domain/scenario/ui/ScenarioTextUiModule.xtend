package com.yakindu.sct.domain.scenario.ui

import com.google.inject.Binder
import com.google.inject.Provider
import com.google.inject.name.Names
import org.eclipse.jface.text.ITextHover
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.resource.clustering.DynamicResourceClusteringPolicy
import org.eclipse.xtext.resource.clustering.IResourceClusteringPolicy
import org.eclipse.xtext.resource.containers.IAllContainersState
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover
import org.eclipse.xtext.ui.editor.hover.IEObjectHover
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import org.eclipse.xtext.ui.editor.hover.ProblemAnnotationHover
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory
import org.eclipse.xtext.ui.resource.IResourceSetProvider
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import org.eclipse.xtext.ui.shared.Access
import org.yakindu.base.utils.jface.help.CrossRefObjectTextHover
import org.yakindu.base.utils.jface.help.HelpHoverProvider
import org.yakindu.sct.model.stext.ui.help.STextUserHelpDocumentationProvider

class ScenarioTextUiModule extends AbstractScenarioTextUiModule {
	new(AbstractUIPlugin plugin) {
		super(plugin)
	}

	def Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return STextUserHelpDocumentationProvider
	}

	def Class<? extends DispatchingEObjectTextHover> bindDispatchingEObjectTextHover() {
		return CrossRefObjectTextHover
	}

	override Class<? extends IEObjectHover> bindIEObjectHover() {
		return CrossRefObjectTextHover
	}

	def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return HelpHoverProvider
	}

	override void configure(Binder binder) {
		super.configure(binder)
		binder.bind(typeof(String)).annotatedWith(Names::named("stylesheet")).toInstance("/StextHoverStyleSheet.css")
	}

	override Provider<IAllContainersState> provideIAllContainersState() {
		if (Access::getJdtHelper().get().isJavaCoreAvailable()) {
			return Access::getJavaProjectsState()
		} else {
			return Access::getWorkspaceProjectsState()
		}
	}

	override Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		if (Access::getJdtHelper().get().isJavaCoreAvailable()) {
			return typeof(XtextResourceSetProvider)
		} else {
			return typeof(SimpleResourceSetProvider)
		}
	}

	override Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		if (Access::getJdtHelper().get().isJavaCoreAvailable()) {
			return typeof(JavaClassPathResourceForIEditorInputFactory)
		} else {
			return typeof(ResourceForIEditorInputFactory)
		}
	}

	override Class<? extends ITextHover> bindITextHover() {
		return typeof(ProblemAnnotationHover)
	}

	def Class<? extends IResourceClusteringPolicy> bindIResourceClusteringPolicy() {
		return typeof(DynamicResourceClusteringPolicy)
	}
}
