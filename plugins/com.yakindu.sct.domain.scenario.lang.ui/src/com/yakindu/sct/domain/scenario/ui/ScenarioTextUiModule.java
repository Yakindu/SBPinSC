package com.yakindu.sct.domain.scenario.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.resource.clustering.DynamicResourceClusteringPolicy;
import org.eclipse.xtext.resource.clustering.IResourceClusteringPolicy;
import org.eclipse.xtext.ui.editor.contentassist.antlr.ParserBasedContentAssistContextFactory.StatefulFactory;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.ProblemAnnotationHover;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;
import org.yakindu.base.utils.jface.help.CrossRefObjectTextHover;
import org.yakindu.base.utils.jface.help.HelpHoverProvider;
import org.yakindu.sct.model.stext.ui.contentassist.STextStatefulFactory;
import org.yakindu.sct.model.stext.ui.help.STextUserHelpDocumentationProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

public class ScenarioTextUiModule extends AbstractScenarioTextUiModule {

	public ScenarioTextUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends StatefulFactory> bindStatefulFactory() {
		return STextStatefulFactory.class;
	}

	public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return STextUserHelpDocumentationProvider.class;
	}

	public Class<? extends DispatchingEObjectTextHover> bindDispatchingEObjectTextHover() {
		return CrossRefObjectTextHover.class;
	}

	@Override
	public Class<? extends IEObjectHover> bindIEObjectHover() {
		return CrossRefObjectTextHover.class;
	}

	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return HelpHoverProvider.class;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named("stylesheet")).toInstance("/StextHoverStyleSheet.css");
	}

	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		if (Access.getJdtHelper().get().isJavaCoreAvailable()) {
			return Access.getJavaProjectsState();
		} else {
			return Access.getWorkspaceProjectsState();
		}
	}

	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		if (Access.getJdtHelper().get().isJavaCoreAvailable()) {
			return XtextResourceSetProvider.class;
		} else {
			return SimpleResourceSetProvider.class;
		}
	}

	@Override
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		if (Access.getJdtHelper().get().isJavaCoreAvailable()) {
			return JavaClassPathResourceForIEditorInputFactory.class;
		} else {
			return ResourceForIEditorInputFactory.class;
		}
	}

	public Class<? extends org.eclipse.jface.text.ITextHover> bindITextHover() {
		return ProblemAnnotationHover.class;
	}

//	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
//		return SCTHighlightingConfiguration.class;
//	}
//
//	public Class<? extends ITaskFinder> bindITaskFinder() {
//		return STextTaskFinder.class;
//	}

	public Class<? extends IResourceClusteringPolicy> bindIResourceClusteringPolicy() {
		return DynamicResourceClusteringPolicy.class;
	}
}
