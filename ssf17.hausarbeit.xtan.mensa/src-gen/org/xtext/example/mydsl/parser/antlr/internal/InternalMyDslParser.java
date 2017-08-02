package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'header'", "'{'", "'}'", "'sidebar'", "'footer'", "'description'", "'nav'", "'href'", "'radio'", "'option'", "'checkbox'", "'button'", "'selector'", "'link'", "'url'", "'menu'", "'name'", "'price'", "'image'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mensamodel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMensamodel"
    // InternalMyDsl.g:64:1: entryRuleMensamodel returns [EObject current=null] : iv_ruleMensamodel= ruleMensamodel EOF ;
    public final EObject entryRuleMensamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMensamodel = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleMensamodel= ruleMensamodel EOF )
            // InternalMyDsl.g:65:2: iv_ruleMensamodel= ruleMensamodel EOF
            {
             newCompositeNode(grammarAccess.getMensamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMensamodel=ruleMensamodel();

            state._fsp--;

             current =iv_ruleMensamodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMensamodel"


    // $ANTLR start "ruleMensamodel"
    // InternalMyDsl.g:71:1: ruleMensamodel returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_sidebar_1_0= ruleSidebar ) )* ( (lv_footer_2_0= ruleFooter ) )+ ( (lv_menus_3_0= ruleMenu ) )+ ) ;
    public final EObject ruleMensamodel() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_sidebar_1_0 = null;

        EObject lv_footer_2_0 = null;

        EObject lv_menus_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_sidebar_1_0= ruleSidebar ) )* ( (lv_footer_2_0= ruleFooter ) )+ ( (lv_menus_3_0= ruleMenu ) )+ ) )
            // InternalMyDsl.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_sidebar_1_0= ruleSidebar ) )* ( (lv_footer_2_0= ruleFooter ) )+ ( (lv_menus_3_0= ruleMenu ) )+ )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_sidebar_1_0= ruleSidebar ) )* ( (lv_footer_2_0= ruleFooter ) )+ ( (lv_menus_3_0= ruleMenu ) )+ )
            // InternalMyDsl.g:79:3: ( (lv_header_0_0= ruleHeader ) ) ( (lv_sidebar_1_0= ruleSidebar ) )* ( (lv_footer_2_0= ruleFooter ) )+ ( (lv_menus_3_0= ruleMenu ) )+
            {
            // InternalMyDsl.g:79:3: ( (lv_header_0_0= ruleHeader ) )
            // InternalMyDsl.g:80:4: (lv_header_0_0= ruleHeader )
            {
            // InternalMyDsl.g:80:4: (lv_header_0_0= ruleHeader )
            // InternalMyDsl.g:81:5: lv_header_0_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getMensamodelAccess().getHeaderHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_header_0_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMensamodelRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.xtext.example.mydsl.MyDsl.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_sidebar_1_0= ruleSidebar ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_sidebar_1_0= ruleSidebar )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_sidebar_1_0= ruleSidebar )
            	    // InternalMyDsl.g:100:5: lv_sidebar_1_0= ruleSidebar
            	    {

            	    					newCompositeNode(grammarAccess.getMensamodelAccess().getSidebarSidebarParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_sidebar_1_0=ruleSidebar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMensamodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sidebar",
            	    						lv_sidebar_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Sidebar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:117:3: ( (lv_footer_2_0= ruleFooter ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:118:4: (lv_footer_2_0= ruleFooter )
            	    {
            	    // InternalMyDsl.g:118:4: (lv_footer_2_0= ruleFooter )
            	    // InternalMyDsl.g:119:5: lv_footer_2_0= ruleFooter
            	    {

            	    					newCompositeNode(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_footer_2_0=ruleFooter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMensamodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"footer",
            	    						lv_footer_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Footer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalMyDsl.g:136:3: ( (lv_menus_3_0= ruleMenu ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:137:4: (lv_menus_3_0= ruleMenu )
            	    {
            	    // InternalMyDsl.g:137:4: (lv_menus_3_0= ruleMenu )
            	    // InternalMyDsl.g:138:5: lv_menus_3_0= ruleMenu
            	    {

            	    					newCompositeNode(grammarAccess.getMensamodelAccess().getMenusMenuParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_menus_3_0=ruleMenu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMensamodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"menus",
            	    						lv_menus_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Menu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMensamodel"


    // $ANTLR start "entryRuleHeader"
    // InternalMyDsl.g:159:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalMyDsl.g:159:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalMyDsl.g:160:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMyDsl.g:166:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_nav_4_0= ruleNAV ) )* otherlv_5= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_description_3_0 = null;

        EObject lv_nav_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:172:2: ( (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_nav_4_0= ruleNAV ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:173:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_nav_4_0= ruleNAV ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:173:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_nav_4_0= ruleNAV ) )* otherlv_5= '}' )
            // InternalMyDsl.g:174:3: otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_nav_4_0= ruleNAV ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHeaderKeyword_0());
            		
            // InternalMyDsl.g:178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:179:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:180:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:200:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:201:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:201:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:202:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:219:3: ( (lv_nav_4_0= ruleNAV ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:220:4: (lv_nav_4_0= ruleNAV )
            	    {
            	    // InternalMyDsl.g:220:4: (lv_nav_4_0= ruleNAV )
            	    // InternalMyDsl.g:221:5: lv_nav_4_0= ruleNAV
            	    {

            	    					newCompositeNode(grammarAccess.getHeaderAccess().getNavNAVParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_nav_4_0=ruleNAV();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nav",
            	    						lv_nav_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.NAV");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSidebar"
    // InternalMyDsl.g:246:1: entryRuleSidebar returns [EObject current=null] : iv_ruleSidebar= ruleSidebar EOF ;
    public final EObject entryRuleSidebar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSidebar = null;


        try {
            // InternalMyDsl.g:246:48: (iv_ruleSidebar= ruleSidebar EOF )
            // InternalMyDsl.g:247:2: iv_ruleSidebar= ruleSidebar EOF
            {
             newCompositeNode(grammarAccess.getSidebarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSidebar=ruleSidebar();

            state._fsp--;

             current =iv_ruleSidebar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSidebar"


    // $ANTLR start "ruleSidebar"
    // InternalMyDsl.g:253:1: ruleSidebar returns [EObject current=null] : (otherlv_0= 'sidebar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_checkbox_5_0= ruleCheckbox ) )* ( (lv_selector_6_0= ruleSelector ) )* ( (lv_button_7_0= ruleButton ) )* otherlv_8= '}' ) ;
    public final EObject ruleSidebar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_description_3_0 = null;

        EObject lv_radio_4_0 = null;

        EObject lv_checkbox_5_0 = null;

        EObject lv_selector_6_0 = null;

        EObject lv_button_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:259:2: ( (otherlv_0= 'sidebar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_checkbox_5_0= ruleCheckbox ) )* ( (lv_selector_6_0= ruleSelector ) )* ( (lv_button_7_0= ruleButton ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:260:2: (otherlv_0= 'sidebar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_checkbox_5_0= ruleCheckbox ) )* ( (lv_selector_6_0= ruleSelector ) )* ( (lv_button_7_0= ruleButton ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:260:2: (otherlv_0= 'sidebar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_checkbox_5_0= ruleCheckbox ) )* ( (lv_selector_6_0= ruleSelector ) )* ( (lv_button_7_0= ruleButton ) )* otherlv_8= '}' )
            // InternalMyDsl.g:261:3: otherlv_0= 'sidebar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_checkbox_5_0= ruleCheckbox ) )* ( (lv_selector_6_0= ruleSelector ) )* ( (lv_button_7_0= ruleButton ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSidebarAccess().getSidebarKeyword_0());
            		
            // InternalMyDsl.g:265:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:266:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:266:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:267:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSidebarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSidebarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSidebarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:287:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:288:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:288:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:289:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getSidebarAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSidebarRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:306:3: ( (lv_radio_4_0= ruleRadio ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:307:4: (lv_radio_4_0= ruleRadio )
            	    {
            	    // InternalMyDsl.g:307:4: (lv_radio_4_0= ruleRadio )
            	    // InternalMyDsl.g:308:5: lv_radio_4_0= ruleRadio
            	    {

            	    					newCompositeNode(grammarAccess.getSidebarAccess().getRadioRadioParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_radio_4_0=ruleRadio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSidebarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"radio",
            	    						lv_radio_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Radio");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:325:3: ( (lv_checkbox_5_0= ruleCheckbox ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:326:4: (lv_checkbox_5_0= ruleCheckbox )
            	    {
            	    // InternalMyDsl.g:326:4: (lv_checkbox_5_0= ruleCheckbox )
            	    // InternalMyDsl.g:327:5: lv_checkbox_5_0= ruleCheckbox
            	    {

            	    					newCompositeNode(grammarAccess.getSidebarAccess().getCheckboxCheckboxParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_checkbox_5_0=ruleCheckbox();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSidebarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"checkbox",
            	    						lv_checkbox_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Checkbox");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDsl.g:344:3: ( (lv_selector_6_0= ruleSelector ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:345:4: (lv_selector_6_0= ruleSelector )
            	    {
            	    // InternalMyDsl.g:345:4: (lv_selector_6_0= ruleSelector )
            	    // InternalMyDsl.g:346:5: lv_selector_6_0= ruleSelector
            	    {

            	    					newCompositeNode(grammarAccess.getSidebarAccess().getSelectorSelectorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_selector_6_0=ruleSelector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSidebarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selector",
            	    						lv_selector_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Selector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:363:3: ( (lv_button_7_0= ruleButton ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:364:4: (lv_button_7_0= ruleButton )
            	    {
            	    // InternalMyDsl.g:364:4: (lv_button_7_0= ruleButton )
            	    // InternalMyDsl.g:365:5: lv_button_7_0= ruleButton
            	    {

            	    					newCompositeNode(grammarAccess.getSidebarAccess().getButtonButtonParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_button_7_0=ruleButton();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSidebarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"button",
            	    						lv_button_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Button");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSidebarAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSidebar"


    // $ANTLR start "entryRuleFooter"
    // InternalMyDsl.g:390:1: entryRuleFooter returns [EObject current=null] : iv_ruleFooter= ruleFooter EOF ;
    public final EObject entryRuleFooter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFooter = null;


        try {
            // InternalMyDsl.g:390:47: (iv_ruleFooter= ruleFooter EOF )
            // InternalMyDsl.g:391:2: iv_ruleFooter= ruleFooter EOF
            {
             newCompositeNode(grammarAccess.getFooterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFooter=ruleFooter();

            state._fsp--;

             current =iv_ruleFooter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFooter"


    // $ANTLR start "ruleFooter"
    // InternalMyDsl.g:397:1: ruleFooter returns [EObject current=null] : (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' ) ;
    public final EObject ruleFooter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_description_3_0 = null;

        EObject lv_links_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:404:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:404:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' )
            // InternalMyDsl.g:405:3: otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFooterAccess().getFooterKeyword_0());
            		
            // InternalMyDsl.g:409:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:410:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:410:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:411:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFooterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFooterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFooterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:431:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:432:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:432:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:433:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFooterAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFooterRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:450:3: ( (lv_links_4_0= ruleLink ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:451:4: (lv_links_4_0= ruleLink )
            	    {
            	    // InternalMyDsl.g:451:4: (lv_links_4_0= ruleLink )
            	    // InternalMyDsl.g:452:5: lv_links_4_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getFooterAccess().getLinksLinkParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_links_4_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFooterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFooterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFooter"


    // $ANTLR start "entryRuleDescription"
    // InternalMyDsl.g:477:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalMyDsl.g:477:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalMyDsl.g:478:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalMyDsl.g:484:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:490:2: ( (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:491:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:491:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:492:3: otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalMyDsl.g:496:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:497:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:497:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:498:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleNAV"
    // InternalMyDsl.g:518:1: entryRuleNAV returns [EObject current=null] : iv_ruleNAV= ruleNAV EOF ;
    public final EObject entryRuleNAV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNAV = null;


        try {
            // InternalMyDsl.g:518:44: (iv_ruleNAV= ruleNAV EOF )
            // InternalMyDsl.g:519:2: iv_ruleNAV= ruleNAV EOF
            {
             newCompositeNode(grammarAccess.getNAVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNAV=ruleNAV();

            state._fsp--;

             current =iv_ruleNAV; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNAV"


    // $ANTLR start "ruleNAV"
    // InternalMyDsl.g:525:1: ruleNAV returns [EObject current=null] : (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleNAV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_href_5_0=null;
        Token otherlv_6=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:531:2: ( (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:532:2: (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:532:2: (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMyDsl.g:533:3: otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNAVAccess().getNavKeyword_0());
            		
            // InternalMyDsl.g:537:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:538:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:538:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:539:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNAVAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNAVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNAVAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:559:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:560:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:560:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:561:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getNAVAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNAVRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getNAVAccess().getHrefKeyword_4());
            		
            // InternalMyDsl.g:582:3: ( (lv_href_5_0= RULE_STRING ) )
            // InternalMyDsl.g:583:4: (lv_href_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:583:4: (lv_href_5_0= RULE_STRING )
            // InternalMyDsl.g:584:5: lv_href_5_0= RULE_STRING
            {
            lv_href_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_href_5_0, grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNAVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"href",
            						lv_href_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNAV"


    // $ANTLR start "entryRuleRadio"
    // InternalMyDsl.g:608:1: entryRuleRadio returns [EObject current=null] : iv_ruleRadio= ruleRadio EOF ;
    public final EObject entryRuleRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadio = null;


        try {
            // InternalMyDsl.g:608:46: (iv_ruleRadio= ruleRadio EOF )
            // InternalMyDsl.g:609:2: iv_ruleRadio= ruleRadio EOF
            {
             newCompositeNode(grammarAccess.getRadioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadio=ruleRadio();

            state._fsp--;

             current =iv_ruleRadio; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadio"


    // $ANTLR start "ruleRadio"
    // InternalMyDsl.g:615:1: ruleRadio returns [EObject current=null] : (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleRadio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_options_5_0=null;
        Token otherlv_6=null;
        EObject lv_title_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:621:2: ( (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:622:2: (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:622:2: (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:623:3: otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRadioAccess().getRadioKeyword_0());
            		
            // InternalMyDsl.g:627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:628:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:629:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRadioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:649:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:650:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:650:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:651:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getRadioAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_title_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadioRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:668:3: (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:669:4: otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRadioAccess().getOptionKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:673:4: ( (lv_options_5_0= RULE_STRING ) )
            	    // InternalMyDsl.g:674:5: (lv_options_5_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:674:5: (lv_options_5_0= RULE_STRING )
            	    // InternalMyDsl.g:675:6: lv_options_5_0= RULE_STRING
            	    {
            	    lv_options_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    						newLeafNode(lv_options_5_0, grammarAccess.getRadioAccess().getOptionsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRadioRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"options",
            	    							lv_options_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRadioAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadio"


    // $ANTLR start "entryRuleCheckbox"
    // InternalMyDsl.g:700:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalMyDsl.g:700:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalMyDsl.g:701:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalMyDsl.g:707:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_options_5_0=null;
        Token otherlv_6=null;
        EObject lv_title_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:714:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:714:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:715:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
            		
            // InternalMyDsl.g:719:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:720:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:720:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:721:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:741:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:742:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:742:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:743:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_title_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:760:3: (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:761:4: otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCheckboxAccess().getOptionKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:765:4: ( (lv_options_5_0= RULE_STRING ) )
            	    // InternalMyDsl.g:766:5: (lv_options_5_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:766:5: (lv_options_5_0= RULE_STRING )
            	    // InternalMyDsl.g:767:6: lv_options_5_0= RULE_STRING
            	    {
            	    lv_options_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    						newLeafNode(lv_options_5_0, grammarAccess.getCheckboxAccess().getOptionsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCheckboxRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"options",
            	    							lv_options_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:792:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:792:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:793:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:799:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_href_5_0=null;
        Token otherlv_6=null;
        EObject lv_title_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:805:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:806:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:806:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMyDsl.g:807:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalMyDsl.g:811:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:812:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:812:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:813:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:833:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:834:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:834:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:835:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_title_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getHrefKeyword_4());
            		
            // InternalMyDsl.g:856:3: ( (lv_href_5_0= RULE_STRING ) )
            // InternalMyDsl.g:857:4: (lv_href_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:857:4: (lv_href_5_0= RULE_STRING )
            // InternalMyDsl.g:858:5: lv_href_5_0= RULE_STRING
            {
            lv_href_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_href_5_0, grammarAccess.getButtonAccess().getHrefSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"href",
            						lv_href_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSelector"
    // InternalMyDsl.g:882:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalMyDsl.g:882:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalMyDsl.g:883:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalMyDsl.g:889:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_options_5_0=null;
        Token otherlv_6=null;
        EObject lv_title_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:895:2: ( (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:896:2: (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:896:2: (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:897:3: otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorKeyword_0());
            		
            // InternalMyDsl.g:901:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:902:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:902:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:903:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:923:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:924:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:924:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:925:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_title_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:942:3: (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:943:4: otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getOptionKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:947:4: ( (lv_options_5_0= RULE_STRING ) )
            	    // InternalMyDsl.g:948:5: (lv_options_5_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:948:5: (lv_options_5_0= RULE_STRING )
            	    // InternalMyDsl.g:949:6: lv_options_5_0= RULE_STRING
            	    {
            	    lv_options_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    						newLeafNode(lv_options_5_0, grammarAccess.getSelectorAccess().getOptionsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"options",
            	    							lv_options_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:974:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:974:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:975:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:981:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:987:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:988:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:988:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMyDsl.g:989:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:993:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:994:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:994:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:995:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1015:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:1016:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:1016:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:1017:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getUrlKeyword_4());
            		
            // InternalMyDsl.g:1038:3: ( (lv_url_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1039:4: (lv_url_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1039:4: (lv_url_5_0= RULE_STRING )
            // InternalMyDsl.g:1040:5: lv_url_5_0= RULE_STRING
            {
            lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_url_5_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleMenu"
    // InternalMyDsl.g:1064:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalMyDsl.g:1064:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalMyDsl.g:1065:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalMyDsl.g:1071:1: ruleMenu returns [EObject current=null] : (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_meal_4_0= RULE_STRING ) ) ( (lv_description_5_0= ruleDescription ) ) otherlv_6= 'price' ( (lv_price_7_0= RULE_STRING ) ) otherlv_8= 'image' ( (lv_image_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_meal_4_0=null;
        Token otherlv_6=null;
        Token lv_price_7_0=null;
        Token otherlv_8=null;
        Token lv_image_9_0=null;
        Token otherlv_10=null;
        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1077:2: ( (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_meal_4_0= RULE_STRING ) ) ( (lv_description_5_0= ruleDescription ) ) otherlv_6= 'price' ( (lv_price_7_0= RULE_STRING ) ) otherlv_8= 'image' ( (lv_image_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1078:2: (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_meal_4_0= RULE_STRING ) ) ( (lv_description_5_0= ruleDescription ) ) otherlv_6= 'price' ( (lv_price_7_0= RULE_STRING ) ) otherlv_8= 'image' ( (lv_image_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1078:2: (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_meal_4_0= RULE_STRING ) ) ( (lv_description_5_0= ruleDescription ) ) otherlv_6= 'price' ( (lv_price_7_0= RULE_STRING ) ) otherlv_8= 'image' ( (lv_image_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1079:3: otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_meal_4_0= RULE_STRING ) ) ( (lv_description_5_0= ruleDescription ) ) otherlv_6= 'price' ( (lv_price_7_0= RULE_STRING ) ) otherlv_8= 'image' ( (lv_image_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
            		
            // InternalMyDsl.g:1083:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1084:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1084:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1085:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getNameKeyword_3());
            		
            // InternalMyDsl.g:1109:3: ( (lv_meal_4_0= RULE_STRING ) )
            // InternalMyDsl.g:1110:4: (lv_meal_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:1110:4: (lv_meal_4_0= RULE_STRING )
            // InternalMyDsl.g:1111:5: lv_meal_4_0= RULE_STRING
            {
            lv_meal_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_meal_4_0, grammarAccess.getMenuAccess().getMealSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"meal",
            						lv_meal_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1127:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalMyDsl.g:1128:4: (lv_description_5_0= ruleDescription )
            {
            // InternalMyDsl.g:1128:4: (lv_description_5_0= ruleDescription )
            // InternalMyDsl.g:1129:5: lv_description_5_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_description_5_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getPriceKeyword_6());
            		
            // InternalMyDsl.g:1150:3: ( (lv_price_7_0= RULE_STRING ) )
            // InternalMyDsl.g:1151:4: (lv_price_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:1151:4: (lv_price_7_0= RULE_STRING )
            // InternalMyDsl.g:1152:5: lv_price_7_0= RULE_STRING
            {
            lv_price_7_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_price_7_0, grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getImageKeyword_8());
            		
            // InternalMyDsl.g:1172:3: ( (lv_image_9_0= RULE_STRING ) )
            // InternalMyDsl.g:1173:4: (lv_image_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:1173:4: (lv_image_9_0= RULE_STRING )
            // InternalMyDsl.g:1174:5: lv_image_9_0= RULE_STRING
            {
            lv_image_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_image_9_0, grammarAccess.getMenuAccess().getImageSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"image",
            						lv_image_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenu"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000400C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000E82000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E02000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}