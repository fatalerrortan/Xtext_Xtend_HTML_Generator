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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'header'", "'{'", "'}'", "'description'", "'nav'", "'href'", "'siderbar'", "'radio'", "'option'", "'button'", "'selector'", "'footer'", "'link'", "'url'", "'menu'", "'price'"
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
    public static final int RULE_INT=6;
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
    // InternalMyDsl.g:71:1: ruleMensamodel returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_footer_1_0= ruleFooter ) ) ( (lv_siderbar_2_0= ruleSiderbar ) ) ( (lv_menus_3_0= ruleMenu ) )* ) ;
    public final EObject ruleMensamodel() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_footer_1_0 = null;

        EObject lv_siderbar_2_0 = null;

        EObject lv_menus_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_footer_1_0= ruleFooter ) ) ( (lv_siderbar_2_0= ruleSiderbar ) ) ( (lv_menus_3_0= ruleMenu ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_footer_1_0= ruleFooter ) ) ( (lv_siderbar_2_0= ruleSiderbar ) ) ( (lv_menus_3_0= ruleMenu ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_footer_1_0= ruleFooter ) ) ( (lv_siderbar_2_0= ruleSiderbar ) ) ( (lv_menus_3_0= ruleMenu ) )* )
            // InternalMyDsl.g:79:3: ( (lv_header_0_0= ruleHeader ) ) ( (lv_footer_1_0= ruleFooter ) ) ( (lv_siderbar_2_0= ruleSiderbar ) ) ( (lv_menus_3_0= ruleMenu ) )*
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

            // InternalMyDsl.g:98:3: ( (lv_footer_1_0= ruleFooter ) )
            // InternalMyDsl.g:99:4: (lv_footer_1_0= ruleFooter )
            {
            // InternalMyDsl.g:99:4: (lv_footer_1_0= ruleFooter )
            // InternalMyDsl.g:100:5: lv_footer_1_0= ruleFooter
            {

            					newCompositeNode(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_footer_1_0=ruleFooter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMensamodelRule());
            					}
            					set(
            						current,
            						"footer",
            						lv_footer_1_0,
            						"org.xtext.example.mydsl.MyDsl.Footer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:117:3: ( (lv_siderbar_2_0= ruleSiderbar ) )
            // InternalMyDsl.g:118:4: (lv_siderbar_2_0= ruleSiderbar )
            {
            // InternalMyDsl.g:118:4: (lv_siderbar_2_0= ruleSiderbar )
            // InternalMyDsl.g:119:5: lv_siderbar_2_0= ruleSiderbar
            {

            					newCompositeNode(grammarAccess.getMensamodelAccess().getSiderbarSiderbarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_siderbar_2_0=ruleSiderbar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMensamodelRule());
            					}
            					set(
            						current,
            						"siderbar",
            						lv_siderbar_2_0,
            						"org.xtext.example.mydsl.MyDsl.Siderbar");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:136:3: ( (lv_menus_3_0= ruleMenu ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
                }
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
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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


    // $ANTLR start "entryRuleDescription"
    // InternalMyDsl.g:246:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalMyDsl.g:246:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalMyDsl.g:247:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalMyDsl.g:253:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:259:2: ( (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:260:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:260:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:261:3: otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalMyDsl.g:265:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:266:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:266:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:267:5: lv_name_1_0= RULE_STRING
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
    // InternalMyDsl.g:287:1: entryRuleNAV returns [EObject current=null] : iv_ruleNAV= ruleNAV EOF ;
    public final EObject entryRuleNAV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNAV = null;


        try {
            // InternalMyDsl.g:287:44: (iv_ruleNAV= ruleNAV EOF )
            // InternalMyDsl.g:288:2: iv_ruleNAV= ruleNAV EOF
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
    // InternalMyDsl.g:294:1: ruleNAV returns [EObject current=null] : (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'href' ( (lv_href_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleNAV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_href_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:300:2: ( (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'href' ( (lv_href_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:301:2: (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'href' ( (lv_href_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:301:2: (otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'href' ( (lv_href_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalMyDsl.g:302:3: otherlv_0= 'nav' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'href' ( (lv_href_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNAVAccess().getNavKeyword_0());
            		
            // InternalMyDsl.g:306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:307:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:308:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNAVAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getNAVAccess().getHrefKeyword_3());
            		
            // InternalMyDsl.g:332:3: ( (lv_href_4_0= RULE_STRING ) )
            // InternalMyDsl.g:333:4: (lv_href_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:333:4: (lv_href_4_0= RULE_STRING )
            // InternalMyDsl.g:334:5: lv_href_4_0= RULE_STRING
            {
            lv_href_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_href_4_0, grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNAVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"href",
            						lv_href_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleSiderbar"
    // InternalMyDsl.g:358:1: entryRuleSiderbar returns [EObject current=null] : iv_ruleSiderbar= ruleSiderbar EOF ;
    public final EObject entryRuleSiderbar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiderbar = null;


        try {
            // InternalMyDsl.g:358:49: (iv_ruleSiderbar= ruleSiderbar EOF )
            // InternalMyDsl.g:359:2: iv_ruleSiderbar= ruleSiderbar EOF
            {
             newCompositeNode(grammarAccess.getSiderbarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiderbar=ruleSiderbar();

            state._fsp--;

             current =iv_ruleSiderbar; 
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
    // $ANTLR end "entryRuleSiderbar"


    // $ANTLR start "ruleSiderbar"
    // InternalMyDsl.g:365:1: ruleSiderbar returns [EObject current=null] : (otherlv_0= 'siderbar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_button_5_0= ruleButton ) )* ( (lv_selector_6_0= ruleSelector ) )* otherlv_7= '}' ) ;
    public final EObject ruleSiderbar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_description_3_0 = null;

        EObject lv_radio_4_0 = null;

        EObject lv_button_5_0 = null;

        EObject lv_selector_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:371:2: ( (otherlv_0= 'siderbar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_button_5_0= ruleButton ) )* ( (lv_selector_6_0= ruleSelector ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:372:2: (otherlv_0= 'siderbar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_button_5_0= ruleButton ) )* ( (lv_selector_6_0= ruleSelector ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:372:2: (otherlv_0= 'siderbar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_button_5_0= ruleButton ) )* ( (lv_selector_6_0= ruleSelector ) )* otherlv_7= '}' )
            // InternalMyDsl.g:373:3: otherlv_0= 'siderbar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_radio_4_0= ruleRadio ) )* ( (lv_button_5_0= ruleButton ) )* ( (lv_selector_6_0= ruleSelector ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSiderbarAccess().getSiderbarKeyword_0());
            		
            // InternalMyDsl.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSiderbarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiderbarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSiderbarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:399:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:400:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:400:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:401:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getSiderbarAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSiderbarRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:418:3: ( (lv_radio_4_0= ruleRadio ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:419:4: (lv_radio_4_0= ruleRadio )
            	    {
            	    // InternalMyDsl.g:419:4: (lv_radio_4_0= ruleRadio )
            	    // InternalMyDsl.g:420:5: lv_radio_4_0= ruleRadio
            	    {

            	    					newCompositeNode(grammarAccess.getSiderbarAccess().getRadioRadioParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_radio_4_0=ruleRadio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSiderbarRule());
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
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:437:3: ( (lv_button_5_0= ruleButton ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:438:4: (lv_button_5_0= ruleButton )
            	    {
            	    // InternalMyDsl.g:438:4: (lv_button_5_0= ruleButton )
            	    // InternalMyDsl.g:439:5: lv_button_5_0= ruleButton
            	    {

            	    					newCompositeNode(grammarAccess.getSiderbarAccess().getButtonButtonParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_button_5_0=ruleButton();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSiderbarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"button",
            	    						lv_button_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Button");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:456:3: ( (lv_selector_6_0= ruleSelector ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:457:4: (lv_selector_6_0= ruleSelector )
            	    {
            	    // InternalMyDsl.g:457:4: (lv_selector_6_0= ruleSelector )
            	    // InternalMyDsl.g:458:5: lv_selector_6_0= ruleSelector
            	    {

            	    					newCompositeNode(grammarAccess.getSiderbarAccess().getSelectorSelectorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_selector_6_0=ruleSelector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSiderbarRule());
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
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSiderbarAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSiderbar"


    // $ANTLR start "entryRuleRadio"
    // InternalMyDsl.g:483:1: entryRuleRadio returns [EObject current=null] : iv_ruleRadio= ruleRadio EOF ;
    public final EObject entryRuleRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadio = null;


        try {
            // InternalMyDsl.g:483:46: (iv_ruleRadio= ruleRadio EOF )
            // InternalMyDsl.g:484:2: iv_ruleRadio= ruleRadio EOF
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
    // InternalMyDsl.g:490:1: ruleRadio returns [EObject current=null] : (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:496:2: ( (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:497:2: (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:497:2: (otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:498:3: otherlv_0= 'radio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRadioAccess().getRadioKeyword_0());
            		
            // InternalMyDsl.g:502:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:503:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:503:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:504:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:524:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:525:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:525:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:526:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getRadioAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:543:3: (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:544:4: otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRadioAccess().getOptionKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:548:4: ( (lv_options_5_0= RULE_STRING ) )
            	    // InternalMyDsl.g:549:5: (lv_options_5_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:549:5: (lv_options_5_0= RULE_STRING )
            	    // InternalMyDsl.g:550:6: lv_options_5_0= RULE_STRING
            	    {
            	    lv_options_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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
            	    break loop6;
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


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:575:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:575:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:576:2: iv_ruleButton= ruleButton EOF
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
    // InternalMyDsl.g:582:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:588:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:589:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:589:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMyDsl.g:590:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) otherlv_4= 'href' ( (lv_href_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalMyDsl.g:594:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:595:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:595:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:596:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:616:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:617:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:617:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:618:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getHrefKeyword_4());
            		
            // InternalMyDsl.g:639:3: ( (lv_href_5_0= RULE_STRING ) )
            // InternalMyDsl.g:640:4: (lv_href_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:640:4: (lv_href_5_0= RULE_STRING )
            // InternalMyDsl.g:641:5: lv_href_5_0= RULE_STRING
            {
            lv_href_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
    // InternalMyDsl.g:665:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalMyDsl.g:665:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalMyDsl.g:666:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalMyDsl.g:672:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:678:2: ( (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:679:2: (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:679:2: (otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:680:3: otherlv_0= 'selector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleDescription ) ) (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorKeyword_0());
            		
            // InternalMyDsl.g:684:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:685:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:685:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:686:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:706:3: ( (lv_title_3_0= ruleDescription ) )
            // InternalMyDsl.g:707:4: (lv_title_3_0= ruleDescription )
            {
            // InternalMyDsl.g:707:4: (lv_title_3_0= ruleDescription )
            // InternalMyDsl.g:708:5: lv_title_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getTitleDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:725:3: (otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:726:4: otherlv_4= 'option' ( (lv_options_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getOptionKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:730:4: ( (lv_options_5_0= RULE_STRING ) )
            	    // InternalMyDsl.g:731:5: (lv_options_5_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:731:5: (lv_options_5_0= RULE_STRING )
            	    // InternalMyDsl.g:732:6: lv_options_5_0= RULE_STRING
            	    {
            	    lv_options_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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
            	    break loop7;
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


    // $ANTLR start "entryRuleFooter"
    // InternalMyDsl.g:757:1: entryRuleFooter returns [EObject current=null] : iv_ruleFooter= ruleFooter EOF ;
    public final EObject entryRuleFooter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFooter = null;


        try {
            // InternalMyDsl.g:757:47: (iv_ruleFooter= ruleFooter EOF )
            // InternalMyDsl.g:758:2: iv_ruleFooter= ruleFooter EOF
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
    // InternalMyDsl.g:764:1: ruleFooter returns [EObject current=null] : (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:770:2: ( (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:771:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:771:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}' )
            // InternalMyDsl.g:772:3: otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_links_4_0= ruleLink ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFooterAccess().getFooterKeyword_0());
            		
            // InternalMyDsl.g:776:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:777:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:777:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:778:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:798:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:799:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:799:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:800:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFooterAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:817:3: ( (lv_links_4_0= ruleLink ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:818:4: (lv_links_4_0= ruleLink )
            	    {
            	    // InternalMyDsl.g:818:4: (lv_links_4_0= ruleLink )
            	    // InternalMyDsl.g:819:5: lv_links_4_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getFooterAccess().getLinksLinkParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop8;
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


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:844:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:844:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:845:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:851:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:857:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:858:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:858:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalMyDsl.g:859:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:863:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:864:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:864:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:865:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getUrlKeyword_3());
            		
            // InternalMyDsl.g:889:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalMyDsl.g:890:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:890:4: (lv_url_4_0= RULE_STRING )
            // InternalMyDsl.g:891:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_url_4_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:915:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalMyDsl.g:915:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalMyDsl.g:916:2: iv_ruleMenu= ruleMenu EOF
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
    // InternalMyDsl.g:922:1: ruleMenu returns [EObject current=null] : (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'price' ( (lv_price_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_price_5_0=null;
        Token otherlv_6=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:928:2: ( (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'price' ( (lv_price_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:929:2: (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'price' ( (lv_price_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:929:2: (otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'price' ( (lv_price_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMyDsl.g:930:3: otherlv_0= 'menu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) otherlv_4= 'price' ( (lv_price_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
            		
            // InternalMyDsl.g:934:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:935:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:935:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:936:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:956:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalMyDsl.g:957:4: (lv_description_3_0= ruleDescription )
            {
            // InternalMyDsl.g:957:4: (lv_description_3_0= ruleDescription )
            // InternalMyDsl.g:958:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.mydsl.MyDsl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getPriceKeyword_4());
            		
            // InternalMyDsl.g:979:3: ( (lv_price_5_0= RULE_STRING ) )
            // InternalMyDsl.g:980:4: (lv_price_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:980:4: (lv_price_5_0= RULE_STRING )
            // InternalMyDsl.g:981:5: lv_price_5_0= RULE_STRING
            {
            lv_price_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_price_5_0, grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_6());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000342000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}