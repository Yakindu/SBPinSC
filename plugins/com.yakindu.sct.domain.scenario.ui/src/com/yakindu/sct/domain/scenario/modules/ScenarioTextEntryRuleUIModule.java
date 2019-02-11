package com.yakindu.sct.domain.scenario.modules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.yakindu.sct.domain.generic.editor.EntryRuleUIModule;

import com.yakindu.sct.domain.scenario.ui.contentassist.EntryRuleContentAssistParser;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class ScenarioTextEntryRuleUIModule extends EntryRuleUIModule {

	public ScenarioTextEntryRuleUIModule(Class<? extends EObject> parserRule) {
		super(parserRule);
	}

	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return EntryRuleContentAssistParser.class;
	}

}
