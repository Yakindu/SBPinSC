package com.yakindu.sct.domain.scenario.parser;

import org.yakindu.sct.model.stext.parser.IParserConstants;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.yakindu.sct.domain.scenario.parser.antlr.ScenarioTextParser;

/**
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class EntryRuleAntlrScenarioTextParser extends ScenarioTextParser implements IParserConstants {

	@Inject(optional = true)
	@Named(ENTRY_RULE)
	private String entryRule;

	@Override
	protected String getDefaultRuleName() {
		return entryRule != null ? entryRule : super.getDefaultRuleName();
	}

}