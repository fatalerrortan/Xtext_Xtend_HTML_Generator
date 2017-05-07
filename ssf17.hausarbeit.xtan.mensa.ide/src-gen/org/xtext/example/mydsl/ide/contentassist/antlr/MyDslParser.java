/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMensamodelAccess().getGroup(), "rule__Mensamodel__Group__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getSiderbarAccess().getGroup(), "rule__Siderbar__Group__0");
					put(grammarAccess.getFooterAccess().getGroup(), "rule__Footer__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getNAVAccess().getGroup(), "rule__NAV__Group__0");
					put(grammarAccess.getRadioAccess().getGroup(), "rule__Radio__Group__0");
					put(grammarAccess.getRadioAccess().getGroup_4(), "rule__Radio__Group_4__0");
					put(grammarAccess.getCheckboxAccess().getGroup(), "rule__Checkbox__Group__0");
					put(grammarAccess.getCheckboxAccess().getGroup_4(), "rule__Checkbox__Group_4__0");
					put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup_4(), "rule__Selector__Group_4__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getMenuAccess().getGroup(), "rule__Menu__Group__0");
					put(grammarAccess.getMensamodelAccess().getHeaderAssignment_0(), "rule__Mensamodel__HeaderAssignment_0");
					put(grammarAccess.getMensamodelAccess().getSiderbarAssignment_1(), "rule__Mensamodel__SiderbarAssignment_1");
					put(grammarAccess.getMensamodelAccess().getFooterAssignment_2(), "rule__Mensamodel__FooterAssignment_2");
					put(grammarAccess.getMensamodelAccess().getMenusAssignment_3(), "rule__Mensamodel__MenusAssignment_3");
					put(grammarAccess.getHeaderAccess().getNameAssignment_1(), "rule__Header__NameAssignment_1");
					put(grammarAccess.getHeaderAccess().getDescriptionAssignment_3(), "rule__Header__DescriptionAssignment_3");
					put(grammarAccess.getHeaderAccess().getNavAssignment_4(), "rule__Header__NavAssignment_4");
					put(grammarAccess.getSiderbarAccess().getNameAssignment_1(), "rule__Siderbar__NameAssignment_1");
					put(grammarAccess.getSiderbarAccess().getDescriptionAssignment_3(), "rule__Siderbar__DescriptionAssignment_3");
					put(grammarAccess.getSiderbarAccess().getRadioAssignment_4(), "rule__Siderbar__RadioAssignment_4");
					put(grammarAccess.getSiderbarAccess().getCheckboxAssignment_5(), "rule__Siderbar__CheckboxAssignment_5");
					put(grammarAccess.getSiderbarAccess().getButtonAssignment_6(), "rule__Siderbar__ButtonAssignment_6");
					put(grammarAccess.getSiderbarAccess().getSelectorAssignment_7(), "rule__Siderbar__SelectorAssignment_7");
					put(grammarAccess.getFooterAccess().getNameAssignment_1(), "rule__Footer__NameAssignment_1");
					put(grammarAccess.getFooterAccess().getDescriptionAssignment_3(), "rule__Footer__DescriptionAssignment_3");
					put(grammarAccess.getFooterAccess().getLinksAssignment_4(), "rule__Footer__LinksAssignment_4");
					put(grammarAccess.getDescriptionAccess().getNameAssignment_1(), "rule__Description__NameAssignment_1");
					put(grammarAccess.getNAVAccess().getNameAssignment_1(), "rule__NAV__NameAssignment_1");
					put(grammarAccess.getNAVAccess().getHrefAssignment_4(), "rule__NAV__HrefAssignment_4");
					put(grammarAccess.getRadioAccess().getNameAssignment_1(), "rule__Radio__NameAssignment_1");
					put(grammarAccess.getRadioAccess().getTitleAssignment_3(), "rule__Radio__TitleAssignment_3");
					put(grammarAccess.getRadioAccess().getOptionsAssignment_4_1(), "rule__Radio__OptionsAssignment_4_1");
					put(grammarAccess.getCheckboxAccess().getNameAssignment_1(), "rule__Checkbox__NameAssignment_1");
					put(grammarAccess.getCheckboxAccess().getTitleAssignment_3(), "rule__Checkbox__TitleAssignment_3");
					put(grammarAccess.getCheckboxAccess().getOptionsAssignment_4_1(), "rule__Checkbox__OptionsAssignment_4_1");
					put(grammarAccess.getButtonAccess().getNameAssignment_1(), "rule__Button__NameAssignment_1");
					put(grammarAccess.getButtonAccess().getTitleAssignment_3(), "rule__Button__TitleAssignment_3");
					put(grammarAccess.getButtonAccess().getHrefAssignment_5(), "rule__Button__HrefAssignment_5");
					put(grammarAccess.getSelectorAccess().getNameAssignment_1(), "rule__Selector__NameAssignment_1");
					put(grammarAccess.getSelectorAccess().getTitleAssignment_3(), "rule__Selector__TitleAssignment_3");
					put(grammarAccess.getSelectorAccess().getOptionsAssignment_4_1(), "rule__Selector__OptionsAssignment_4_1");
					put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
					put(grammarAccess.getLinkAccess().getUrlAssignment_4(), "rule__Link__UrlAssignment_4");
					put(grammarAccess.getMenuAccess().getNameAssignment_1(), "rule__Menu__NameAssignment_1");
					put(grammarAccess.getMenuAccess().getDescriptionAssignment_3(), "rule__Menu__DescriptionAssignment_3");
					put(grammarAccess.getMenuAccess().getPriceAssignment_5(), "rule__Menu__PriceAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleMensamodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
