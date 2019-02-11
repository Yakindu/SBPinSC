/**
* Copyright (c) 2017 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	Andreas Muelder - itemis AG
*
*/

package com.yakindu.sct.domain.scenario.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.domain.generic.editor.EditorModuleProvider;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.model.stext.stext.Guard;
import org.yakindu.sct.model.stext.stext.StateSpecification;
import org.yakindu.sct.model.stext.stext.StatechartSpecification;
import org.yakindu.sct.model.stext.stext.TransitionSpecification;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import com.yakindu.sct.domain.scenario.ScenarioTextRuntimeModule;
import com.yakindu.sct.domain.scenario.lang.ui.internal.LangActivator;
import com.yakindu.sct.domain.scenario.modules.ScenarioTextEntryRuleModule;
import com.yakindu.sct.domain.scenario.modules.ScenarioTextEntryRuleUIModule;
import com.yakindu.sct.domain.scenario.ui.ScenarioTextUiModule;

/**
 *
 * @author andreas muelder - Initial contribution and API
 *
 */
public class ScenarioEditorModuleProvider extends EditorModuleProvider {

	protected static final ImmutableMap<String, Class<? extends EObject>> GRAMMAR_RULE_MAP = ImmutableMap.of(
			Statechart.class.getName(), StatechartSpecification.class, Transition.class.getName(),
			TransitionSpecification.class, State.class.getName(), StateSpecification.class, Guard.class.getName(),
			Guard.class);

	protected Module getEmbeddedEditorModule(String semanticTarget) {
		Class<? extends EObject> rule = GRAMMAR_RULE_MAP.get(semanticTarget);
		return Modules.override(getLanguageModule()).with(new ScenarioTextEntryRuleModule(rule),
				new ScenarioTextEntryRuleUIModule(rule));
	}
	@Override
	protected Module getLanguageUiModule() {
		return (Module) new ScenarioTextUiModule(LangActivator.getInstance());
	}
	@Override
	protected Module getLanguageRuntimeModule() {
		return new ScenarioTextRuntimeModule();
	}

}
