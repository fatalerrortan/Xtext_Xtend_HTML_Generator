/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MensamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Mensamodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTagParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Mensamodel:
		//	elements+=Tag*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Tag*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Tag
		public RuleCall getElementsTagParserRuleCall_0() { return cElementsTagParserRuleCall_0; }
	}
	public class TagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Tag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTagKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIdAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIdHtml_IdParserRuleCall_3_0 = (RuleCall)cIdAssignment_3.eContents().get(0);
		private final Assignment cClass_hAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cClass_hHtml_ClassParserRuleCall_4_0 = (RuleCall)cClass_hAssignment_4.eContents().get(0);
		private final Assignment cContentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cContentContentParserRuleCall_5_0 = (RuleCall)cContentAssignment_5.eContents().get(0);
		private final Assignment cChildrenAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cChildrenTagParserRuleCall_6_0 = (RuleCall)cChildrenAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Tag:
		//	'tag' name=STRING '{'
		//	id=Html_Id?
		//	class_h=Html_Class?
		//	content=Content?
		//	children+=Tag*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'tag' name=STRING '{' id=Html_Id? class_h=Html_Class? content=Content? children+=Tag* '}'
		public Group getGroup() { return cGroup; }
		
		//'tag'
		public Keyword getTagKeyword_0() { return cTagKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//id=Html_Id?
		public Assignment getIdAssignment_3() { return cIdAssignment_3; }
		
		//Html_Id
		public RuleCall getIdHtml_IdParserRuleCall_3_0() { return cIdHtml_IdParserRuleCall_3_0; }
		
		//class_h=Html_Class?
		public Assignment getClass_hAssignment_4() { return cClass_hAssignment_4; }
		
		//Html_Class
		public RuleCall getClass_hHtml_ClassParserRuleCall_4_0() { return cClass_hHtml_ClassParserRuleCall_4_0; }
		
		//content=Content?
		public Assignment getContentAssignment_5() { return cContentAssignment_5; }
		
		//Content
		public RuleCall getContentContentParserRuleCall_5_0() { return cContentContentParserRuleCall_5_0; }
		
		//children+=Tag*
		public Assignment getChildrenAssignment_6() { return cChildrenAssignment_6; }
		
		//Tag
		public RuleCall getChildrenTagParserRuleCall_6_0() { return cChildrenTagParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class Html_IdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Html_Id");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Html_Id:
		//	'id' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'id' name=ID
		public Group getGroup() { return cGroup; }
		
		//'id'
		public Keyword getIdKeyword_0() { return cIdKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class Html_ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Html_Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Html_Class:
		//	'class' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'class' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'class'
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Content:
		//	'content' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'content' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'content'
		public Keyword getContentKeyword_0() { return cContentKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final MensamodelElements pMensamodel;
	private final TagElements pTag;
	private final Html_IdElements pHtml_Id;
	private final Html_ClassElements pHtml_Class;
	private final ContentElements pContent;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMensamodel = new MensamodelElements();
		this.pTag = new TagElements();
		this.pHtml_Id = new Html_IdElements();
		this.pHtml_Class = new Html_ClassElements();
		this.pContent = new ContentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Mensamodel:
	//	elements+=Tag*;
	public MensamodelElements getMensamodelAccess() {
		return pMensamodel;
	}
	
	public ParserRule getMensamodelRule() {
		return getMensamodelAccess().getRule();
	}
	
	//Tag:
	//	'tag' name=STRING '{'
	//	id=Html_Id?
	//	class_h=Html_Class?
	//	content=Content?
	//	children+=Tag*
	//	'}';
	public TagElements getTagAccess() {
		return pTag;
	}
	
	public ParserRule getTagRule() {
		return getTagAccess().getRule();
	}
	
	//Html_Id:
	//	'id' name=ID;
	public Html_IdElements getHtml_IdAccess() {
		return pHtml_Id;
	}
	
	public ParserRule getHtml_IdRule() {
		return getHtml_IdAccess().getRule();
	}
	
	//Html_Class:
	//	'class' name=STRING;
	public Html_ClassElements getHtml_ClassAccess() {
		return pHtml_Class;
	}
	
	public ParserRule getHtml_ClassRule() {
		return getHtml_ClassAccess().getRule();
	}
	
	//Content:
	//	'content' name=STRING;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
