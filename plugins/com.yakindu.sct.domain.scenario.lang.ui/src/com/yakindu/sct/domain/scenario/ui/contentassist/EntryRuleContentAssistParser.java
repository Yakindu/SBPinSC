package com.yakindu.sct.domain.scenario.ui.contentassist;

import java.lang.reflect.Method;
import java.util.Collection;

import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.yakindu.sct.model.stext.parser.IParserConstants;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.yakindu.sct.domain.scenario.ui.contentassist.antlr.ScenarioTextParser;
import com.yakindu.sct.domain.scenario.ui.contentassist.antlr.internal.InternalScenarioTextParser;

/**
 * 
 *
 * @author andreas muelder - Initial contribution and API
 *
 */
public class EntryRuleContentAssistParser extends ScenarioTextParser implements IParserConstants {

	@Inject(optional = true)
	@Named(ENTRY_RULE)
	private String entryRule;

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		if (entryRule == null)
			return super.getFollowElements(parser);
		try {
			InternalScenarioTextParser typedParser = (InternalScenarioTextParser) parser;
			Method method = typedParser.getClass().getMethod(ENTRY_RULE + entryRule);
			method.invoke(typedParser);
			return typedParser.getFollowElements();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
