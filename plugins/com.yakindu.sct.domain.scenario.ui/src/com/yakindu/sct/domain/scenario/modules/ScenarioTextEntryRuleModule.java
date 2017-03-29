/**
* Copyright (c) 2017 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	Andreas Muelder - itemis AG
*
*/
package com.yakindu.sct.domain.scenario.modules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParser;
import org.yakindu.sct.domain.generic.editor.EntryRuleRuntimeModule;

import com.yakindu.sct.domain.scenario.parser.EntryRuleAntlrScenarioTextParser;
/**
*
* @author andreas muelder - Initial contribution and API
*
*/
public class ScenarioTextEntryRuleModule extends EntryRuleRuntimeModule{

	public ScenarioTextEntryRuleModule(Class<? extends EObject> parserRule) {
		super(parserRule);
	}

	@Override
	public Class<? extends IParser> bindIParser() {
		return EntryRuleAntlrScenarioTextParser.class;
	}
	
}
