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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tag'", "'{'", "'}'", "'id'", "'class'", "'content'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalMyDsl.g:71:1: ruleMensamodel returns [EObject current=null] : ( (lv_elements_0_0= ruleTag ) )* ;
    public final EObject ruleMensamodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_elements_0_0= ruleTag ) )* )
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleTag ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleTag )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleTag )
            	    // InternalMyDsl.g:80:4: lv_elements_0_0= ruleTag
            	    {

            	    				newCompositeNode(grammarAccess.getMensamodelAccess().getElementsTagParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleTag();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMensamodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Tag");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:100:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalMyDsl.g:100:44: (iv_ruleTag= ruleTag EOF )
            // InternalMyDsl.g:101:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalMyDsl.g:107:1: ruleTag returns [EObject current=null] : (otherlv_0= 'tag' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_id_3_0= ruleHtml_Id ) )? ( (lv_class_h_4_0= ruleHtml_Class ) )? ( (lv_content_5_0= ruleContent ) )? ( (lv_children_6_0= ruleTag ) )* otherlv_7= '}' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_id_3_0 = null;

        EObject lv_class_h_4_0 = null;

        EObject lv_content_5_0 = null;

        EObject lv_children_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'tag' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_id_3_0= ruleHtml_Id ) )? ( (lv_class_h_4_0= ruleHtml_Class ) )? ( (lv_content_5_0= ruleContent ) )? ( (lv_children_6_0= ruleTag ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'tag' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_id_3_0= ruleHtml_Id ) )? ( (lv_class_h_4_0= ruleHtml_Class ) )? ( (lv_content_5_0= ruleContent ) )? ( (lv_children_6_0= ruleTag ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'tag' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_id_3_0= ruleHtml_Id ) )? ( (lv_class_h_4_0= ruleHtml_Class ) )? ( (lv_content_5_0= ruleContent ) )? ( (lv_children_6_0= ruleTag ) )* otherlv_7= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'tag' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_id_3_0= ruleHtml_Id ) )? ( (lv_class_h_4_0= ruleHtml_Class ) )? ( (lv_content_5_0= ruleContent ) )? ( (lv_children_6_0= ruleTag ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getTagKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTagAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_id_3_0= ruleHtml_Id ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:142:4: (lv_id_3_0= ruleHtml_Id )
                    {
                    // InternalMyDsl.g:142:4: (lv_id_3_0= ruleHtml_Id )
                    // InternalMyDsl.g:143:5: lv_id_3_0= ruleHtml_Id
                    {

                    					newCompositeNode(grammarAccess.getTagAccess().getIdHtml_IdParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_id_3_0=ruleHtml_Id();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTagRule());
                    					}
                    					set(
                    						current,
                    						"id",
                    						lv_id_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Html_Id");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:160:3: ( (lv_class_h_4_0= ruleHtml_Class ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:161:4: (lv_class_h_4_0= ruleHtml_Class )
                    {
                    // InternalMyDsl.g:161:4: (lv_class_h_4_0= ruleHtml_Class )
                    // InternalMyDsl.g:162:5: lv_class_h_4_0= ruleHtml_Class
                    {

                    					newCompositeNode(grammarAccess.getTagAccess().getClass_hHtml_ClassParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_class_h_4_0=ruleHtml_Class();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTagRule());
                    					}
                    					set(
                    						current,
                    						"class_h",
                    						lv_class_h_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Html_Class");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:179:3: ( (lv_content_5_0= ruleContent ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:180:4: (lv_content_5_0= ruleContent )
                    {
                    // InternalMyDsl.g:180:4: (lv_content_5_0= ruleContent )
                    // InternalMyDsl.g:181:5: lv_content_5_0= ruleContent
                    {

                    					newCompositeNode(grammarAccess.getTagAccess().getContentContentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_content_5_0=ruleContent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTagRule());
                    					}
                    					set(
                    						current,
                    						"content",
                    						lv_content_5_0,
                    						"org.xtext.example.mydsl.MyDsl.Content");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:198:3: ( (lv_children_6_0= ruleTag ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:199:4: (lv_children_6_0= ruleTag )
            	    {
            	    // InternalMyDsl.g:199:4: (lv_children_6_0= ruleTag )
            	    // InternalMyDsl.g:200:5: lv_children_6_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_children_6_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTagAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleHtml_Id"
    // InternalMyDsl.g:225:1: entryRuleHtml_Id returns [EObject current=null] : iv_ruleHtml_Id= ruleHtml_Id EOF ;
    public final EObject entryRuleHtml_Id() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtml_Id = null;


        try {
            // InternalMyDsl.g:225:48: (iv_ruleHtml_Id= ruleHtml_Id EOF )
            // InternalMyDsl.g:226:2: iv_ruleHtml_Id= ruleHtml_Id EOF
            {
             newCompositeNode(grammarAccess.getHtml_IdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHtml_Id=ruleHtml_Id();

            state._fsp--;

             current =iv_ruleHtml_Id; 
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
    // $ANTLR end "entryRuleHtml_Id"


    // $ANTLR start "ruleHtml_Id"
    // InternalMyDsl.g:232:1: ruleHtml_Id returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleHtml_Id() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:238:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:239:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:239:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:240:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHtml_IdAccess().getIdKeyword_0());
            		
            // InternalMyDsl.g:244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:245:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHtml_IdAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHtml_IdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleHtml_Id"


    // $ANTLR start "entryRuleHtml_Class"
    // InternalMyDsl.g:266:1: entryRuleHtml_Class returns [EObject current=null] : iv_ruleHtml_Class= ruleHtml_Class EOF ;
    public final EObject entryRuleHtml_Class() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtml_Class = null;


        try {
            // InternalMyDsl.g:266:51: (iv_ruleHtml_Class= ruleHtml_Class EOF )
            // InternalMyDsl.g:267:2: iv_ruleHtml_Class= ruleHtml_Class EOF
            {
             newCompositeNode(grammarAccess.getHtml_ClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHtml_Class=ruleHtml_Class();

            state._fsp--;

             current =iv_ruleHtml_Class; 
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
    // $ANTLR end "entryRuleHtml_Class"


    // $ANTLR start "ruleHtml_Class"
    // InternalMyDsl.g:273:1: ruleHtml_Class returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHtml_Class() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:280:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:280:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:281:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHtml_ClassAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:285:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:286:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:286:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:287:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHtml_ClassAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHtml_ClassRule());
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
    // $ANTLR end "ruleHtml_Class"


    // $ANTLR start "entryRuleContent"
    // InternalMyDsl.g:307:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalMyDsl.g:307:48: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:308:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalMyDsl.g:314:1: ruleContent returns [EObject current=null] : (otherlv_0= 'content' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:320:2: ( (otherlv_0= 'content' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:321:2: (otherlv_0= 'content' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:321:2: (otherlv_0= 'content' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:322:3: otherlv_0= 'content' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContentAccess().getContentKeyword_0());
            		
            // InternalMyDsl.g:326:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:327:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:327:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:328:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
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
    // $ANTLR end "ruleContent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001A800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}