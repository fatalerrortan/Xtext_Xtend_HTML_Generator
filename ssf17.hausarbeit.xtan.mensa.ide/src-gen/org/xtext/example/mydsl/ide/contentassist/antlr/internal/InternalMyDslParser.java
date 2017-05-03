package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMensamodel"
    // InternalMyDsl.g:53:1: entryRuleMensamodel : ruleMensamodel EOF ;
    public final void entryRuleMensamodel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMensamodel EOF )
            // InternalMyDsl.g:55:1: ruleMensamodel EOF
            {
             before(grammarAccess.getMensamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleMensamodel();

            state._fsp--;

             after(grammarAccess.getMensamodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMensamodel"


    // $ANTLR start "ruleMensamodel"
    // InternalMyDsl.g:62:1: ruleMensamodel : ( ( rule__Mensamodel__ElementsAssignment )* ) ;
    public final void ruleMensamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Mensamodel__ElementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Mensamodel__ElementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Mensamodel__ElementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Mensamodel__ElementsAssignment )*
            {
             before(grammarAccess.getMensamodelAccess().getElementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Mensamodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Mensamodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Mensamodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMensamodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMensamodel"


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:78:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTag EOF )
            // InternalMyDsl.g:80:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalMyDsl.g:87:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Tag__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Tag__Group__0 )
            // InternalMyDsl.g:94:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleHtml_Id"
    // InternalMyDsl.g:103:1: entryRuleHtml_Id : ruleHtml_Id EOF ;
    public final void entryRuleHtml_Id() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleHtml_Id EOF )
            // InternalMyDsl.g:105:1: ruleHtml_Id EOF
            {
             before(grammarAccess.getHtml_IdRule()); 
            pushFollow(FOLLOW_1);
            ruleHtml_Id();

            state._fsp--;

             after(grammarAccess.getHtml_IdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHtml_Id"


    // $ANTLR start "ruleHtml_Id"
    // InternalMyDsl.g:112:1: ruleHtml_Id : ( ( rule__Html_Id__Group__0 ) ) ;
    public final void ruleHtml_Id() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Html_Id__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Html_Id__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Html_Id__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Html_Id__Group__0 )
            {
             before(grammarAccess.getHtml_IdAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Html_Id__Group__0 )
            // InternalMyDsl.g:119:4: rule__Html_Id__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Html_Id__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtml_IdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHtml_Id"


    // $ANTLR start "entryRuleHtml_Class"
    // InternalMyDsl.g:128:1: entryRuleHtml_Class : ruleHtml_Class EOF ;
    public final void entryRuleHtml_Class() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleHtml_Class EOF )
            // InternalMyDsl.g:130:1: ruleHtml_Class EOF
            {
             before(grammarAccess.getHtml_ClassRule()); 
            pushFollow(FOLLOW_1);
            ruleHtml_Class();

            state._fsp--;

             after(grammarAccess.getHtml_ClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHtml_Class"


    // $ANTLR start "ruleHtml_Class"
    // InternalMyDsl.g:137:1: ruleHtml_Class : ( ( rule__Html_Class__Group__0 ) ) ;
    public final void ruleHtml_Class() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Html_Class__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Html_Class__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Html_Class__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Html_Class__Group__0 )
            {
             before(grammarAccess.getHtml_ClassAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Html_Class__Group__0 )
            // InternalMyDsl.g:144:4: rule__Html_Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Html_Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtml_ClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHtml_Class"


    // $ANTLR start "entryRuleContent"
    // InternalMyDsl.g:153:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleContent EOF )
            // InternalMyDsl.g:155:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalMyDsl.g:162:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Content__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Content__Group__0 )
            // InternalMyDsl.g:169:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalMyDsl.g:177:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalMyDsl.g:182:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalMyDsl.g:189:1: rule__Tag__Group__0__Impl : ( 'tag' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:193:1: ( ( 'tag' ) )
            // InternalMyDsl.g:194:1: ( 'tag' )
            {
            // InternalMyDsl.g:194:1: ( 'tag' )
            // InternalMyDsl.g:195:2: 'tag'
            {
             before(grammarAccess.getTagAccess().getTagKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getTagKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalMyDsl.g:204:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalMyDsl.g:209:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Tag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalMyDsl.g:216:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:220:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalMyDsl.g:221:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:221:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalMyDsl.g:222:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:223:2: ( rule__Tag__NameAssignment_1 )
            // InternalMyDsl.g:223:3: rule__Tag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__2"
    // InternalMyDsl.g:231:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl rule__Tag__Group__3 ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( rule__Tag__Group__2__Impl rule__Tag__Group__3 )
            // InternalMyDsl.g:236:2: rule__Tag__Group__2__Impl rule__Tag__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Tag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // InternalMyDsl.g:243:1: rule__Tag__Group__2__Impl : ( '{' ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:247:1: ( ( '{' ) )
            // InternalMyDsl.g:248:1: ( '{' )
            {
            // InternalMyDsl.g:248:1: ( '{' )
            // InternalMyDsl.g:249:2: '{'
            {
             before(grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__3"
    // InternalMyDsl.g:258:1: rule__Tag__Group__3 : rule__Tag__Group__3__Impl rule__Tag__Group__4 ;
    public final void rule__Tag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:262:1: ( rule__Tag__Group__3__Impl rule__Tag__Group__4 )
            // InternalMyDsl.g:263:2: rule__Tag__Group__3__Impl rule__Tag__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Tag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__3"


    // $ANTLR start "rule__Tag__Group__3__Impl"
    // InternalMyDsl.g:270:1: rule__Tag__Group__3__Impl : ( ( rule__Tag__IdAssignment_3 )? ) ;
    public final void rule__Tag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:274:1: ( ( ( rule__Tag__IdAssignment_3 )? ) )
            // InternalMyDsl.g:275:1: ( ( rule__Tag__IdAssignment_3 )? )
            {
            // InternalMyDsl.g:275:1: ( ( rule__Tag__IdAssignment_3 )? )
            // InternalMyDsl.g:276:2: ( rule__Tag__IdAssignment_3 )?
            {
             before(grammarAccess.getTagAccess().getIdAssignment_3()); 
            // InternalMyDsl.g:277:2: ( rule__Tag__IdAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:277:3: rule__Tag__IdAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__IdAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTagAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__3__Impl"


    // $ANTLR start "rule__Tag__Group__4"
    // InternalMyDsl.g:285:1: rule__Tag__Group__4 : rule__Tag__Group__4__Impl rule__Tag__Group__5 ;
    public final void rule__Tag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( rule__Tag__Group__4__Impl rule__Tag__Group__5 )
            // InternalMyDsl.g:290:2: rule__Tag__Group__4__Impl rule__Tag__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Tag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__4"


    // $ANTLR start "rule__Tag__Group__4__Impl"
    // InternalMyDsl.g:297:1: rule__Tag__Group__4__Impl : ( ( rule__Tag__Class_hAssignment_4 )? ) ;
    public final void rule__Tag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:301:1: ( ( ( rule__Tag__Class_hAssignment_4 )? ) )
            // InternalMyDsl.g:302:1: ( ( rule__Tag__Class_hAssignment_4 )? )
            {
            // InternalMyDsl.g:302:1: ( ( rule__Tag__Class_hAssignment_4 )? )
            // InternalMyDsl.g:303:2: ( rule__Tag__Class_hAssignment_4 )?
            {
             before(grammarAccess.getTagAccess().getClass_hAssignment_4()); 
            // InternalMyDsl.g:304:2: ( rule__Tag__Class_hAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:304:3: rule__Tag__Class_hAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__Class_hAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTagAccess().getClass_hAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__4__Impl"


    // $ANTLR start "rule__Tag__Group__5"
    // InternalMyDsl.g:312:1: rule__Tag__Group__5 : rule__Tag__Group__5__Impl rule__Tag__Group__6 ;
    public final void rule__Tag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( rule__Tag__Group__5__Impl rule__Tag__Group__6 )
            // InternalMyDsl.g:317:2: rule__Tag__Group__5__Impl rule__Tag__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Tag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__5"


    // $ANTLR start "rule__Tag__Group__5__Impl"
    // InternalMyDsl.g:324:1: rule__Tag__Group__5__Impl : ( ( rule__Tag__ContentAssignment_5 )? ) ;
    public final void rule__Tag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:328:1: ( ( ( rule__Tag__ContentAssignment_5 )? ) )
            // InternalMyDsl.g:329:1: ( ( rule__Tag__ContentAssignment_5 )? )
            {
            // InternalMyDsl.g:329:1: ( ( rule__Tag__ContentAssignment_5 )? )
            // InternalMyDsl.g:330:2: ( rule__Tag__ContentAssignment_5 )?
            {
             before(grammarAccess.getTagAccess().getContentAssignment_5()); 
            // InternalMyDsl.g:331:2: ( rule__Tag__ContentAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:331:3: rule__Tag__ContentAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__ContentAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTagAccess().getContentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__5__Impl"


    // $ANTLR start "rule__Tag__Group__6"
    // InternalMyDsl.g:339:1: rule__Tag__Group__6 : rule__Tag__Group__6__Impl rule__Tag__Group__7 ;
    public final void rule__Tag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( rule__Tag__Group__6__Impl rule__Tag__Group__7 )
            // InternalMyDsl.g:344:2: rule__Tag__Group__6__Impl rule__Tag__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Tag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__6"


    // $ANTLR start "rule__Tag__Group__6__Impl"
    // InternalMyDsl.g:351:1: rule__Tag__Group__6__Impl : ( ( rule__Tag__ChildrenAssignment_6 )* ) ;
    public final void rule__Tag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:355:1: ( ( ( rule__Tag__ChildrenAssignment_6 )* ) )
            // InternalMyDsl.g:356:1: ( ( rule__Tag__ChildrenAssignment_6 )* )
            {
            // InternalMyDsl.g:356:1: ( ( rule__Tag__ChildrenAssignment_6 )* )
            // InternalMyDsl.g:357:2: ( rule__Tag__ChildrenAssignment_6 )*
            {
             before(grammarAccess.getTagAccess().getChildrenAssignment_6()); 
            // InternalMyDsl.g:358:2: ( rule__Tag__ChildrenAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:358:3: rule__Tag__ChildrenAssignment_6
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Tag__ChildrenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTagAccess().getChildrenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__6__Impl"


    // $ANTLR start "rule__Tag__Group__7"
    // InternalMyDsl.g:366:1: rule__Tag__Group__7 : rule__Tag__Group__7__Impl ;
    public final void rule__Tag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( rule__Tag__Group__7__Impl )
            // InternalMyDsl.g:371:2: rule__Tag__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__7"


    // $ANTLR start "rule__Tag__Group__7__Impl"
    // InternalMyDsl.g:377:1: rule__Tag__Group__7__Impl : ( '}' ) ;
    public final void rule__Tag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( '}' ) )
            // InternalMyDsl.g:382:1: ( '}' )
            {
            // InternalMyDsl.g:382:1: ( '}' )
            // InternalMyDsl.g:383:2: '}'
            {
             before(grammarAccess.getTagAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__7__Impl"


    // $ANTLR start "rule__Html_Id__Group__0"
    // InternalMyDsl.g:393:1: rule__Html_Id__Group__0 : rule__Html_Id__Group__0__Impl rule__Html_Id__Group__1 ;
    public final void rule__Html_Id__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( rule__Html_Id__Group__0__Impl rule__Html_Id__Group__1 )
            // InternalMyDsl.g:398:2: rule__Html_Id__Group__0__Impl rule__Html_Id__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Html_Id__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_Id__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Id__Group__0"


    // $ANTLR start "rule__Html_Id__Group__0__Impl"
    // InternalMyDsl.g:405:1: rule__Html_Id__Group__0__Impl : ( 'id' ) ;
    public final void rule__Html_Id__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( ( 'id' ) )
            // InternalMyDsl.g:410:1: ( 'id' )
            {
            // InternalMyDsl.g:410:1: ( 'id' )
            // InternalMyDsl.g:411:2: 'id'
            {
             before(grammarAccess.getHtml_IdAccess().getIdKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHtml_IdAccess().getIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Id__Group__0__Impl"


    // $ANTLR start "rule__Html_Id__Group__1"
    // InternalMyDsl.g:420:1: rule__Html_Id__Group__1 : rule__Html_Id__Group__1__Impl ;
    public final void rule__Html_Id__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:424:1: ( rule__Html_Id__Group__1__Impl )
            // InternalMyDsl.g:425:2: rule__Html_Id__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Html_Id__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Id__Group__1"


    // $ANTLR start "rule__Html_Id__Group__1__Impl"
    // InternalMyDsl.g:431:1: rule__Html_Id__Group__1__Impl : ( ( rule__Html_Id__NameAssignment_1 ) ) ;
    public final void rule__Html_Id__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( ( ( rule__Html_Id__NameAssignment_1 ) ) )
            // InternalMyDsl.g:436:1: ( ( rule__Html_Id__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:436:1: ( ( rule__Html_Id__NameAssignment_1 ) )
            // InternalMyDsl.g:437:2: ( rule__Html_Id__NameAssignment_1 )
            {
             before(grammarAccess.getHtml_IdAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:438:2: ( rule__Html_Id__NameAssignment_1 )
            // InternalMyDsl.g:438:3: rule__Html_Id__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Html_Id__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHtml_IdAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Id__Group__1__Impl"


    // $ANTLR start "rule__Html_Class__Group__0"
    // InternalMyDsl.g:447:1: rule__Html_Class__Group__0 : rule__Html_Class__Group__0__Impl rule__Html_Class__Group__1 ;
    public final void rule__Html_Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:451:1: ( rule__Html_Class__Group__0__Impl rule__Html_Class__Group__1 )
            // InternalMyDsl.g:452:2: rule__Html_Class__Group__0__Impl rule__Html_Class__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Html_Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Html_Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Class__Group__0"


    // $ANTLR start "rule__Html_Class__Group__0__Impl"
    // InternalMyDsl.g:459:1: rule__Html_Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Html_Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( ( 'class' ) )
            // InternalMyDsl.g:464:1: ( 'class' )
            {
            // InternalMyDsl.g:464:1: ( 'class' )
            // InternalMyDsl.g:465:2: 'class'
            {
             before(grammarAccess.getHtml_ClassAccess().getClassKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHtml_ClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Class__Group__0__Impl"


    // $ANTLR start "rule__Html_Class__Group__1"
    // InternalMyDsl.g:474:1: rule__Html_Class__Group__1 : rule__Html_Class__Group__1__Impl ;
    public final void rule__Html_Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( rule__Html_Class__Group__1__Impl )
            // InternalMyDsl.g:479:2: rule__Html_Class__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Html_Class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Class__Group__1"


    // $ANTLR start "rule__Html_Class__Group__1__Impl"
    // InternalMyDsl.g:485:1: rule__Html_Class__Group__1__Impl : ( ( rule__Html_Class__NameAssignment_1 ) ) ;
    public final void rule__Html_Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( ( ( rule__Html_Class__NameAssignment_1 ) ) )
            // InternalMyDsl.g:490:1: ( ( rule__Html_Class__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:490:1: ( ( rule__Html_Class__NameAssignment_1 ) )
            // InternalMyDsl.g:491:2: ( rule__Html_Class__NameAssignment_1 )
            {
             before(grammarAccess.getHtml_ClassAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:492:2: ( rule__Html_Class__NameAssignment_1 )
            // InternalMyDsl.g:492:3: rule__Html_Class__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Html_Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHtml_ClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Class__Group__1__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // InternalMyDsl.g:501:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalMyDsl.g:506:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalMyDsl.g:513:1: rule__Content__Group__0__Impl : ( 'content' ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( ( 'content' ) )
            // InternalMyDsl.g:518:1: ( 'content' )
            {
            // InternalMyDsl.g:518:1: ( 'content' )
            // InternalMyDsl.g:519:2: 'content'
            {
             before(grammarAccess.getContentAccess().getContentKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getContentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalMyDsl.g:528:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( rule__Content__Group__1__Impl )
            // InternalMyDsl.g:533:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalMyDsl.g:539:1: rule__Content__Group__1__Impl : ( ( rule__Content__NameAssignment_1 ) ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( ( rule__Content__NameAssignment_1 ) ) )
            // InternalMyDsl.g:544:1: ( ( rule__Content__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:544:1: ( ( rule__Content__NameAssignment_1 ) )
            // InternalMyDsl.g:545:2: ( rule__Content__NameAssignment_1 )
            {
             before(grammarAccess.getContentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:546:2: ( rule__Content__NameAssignment_1 )
            // InternalMyDsl.g:546:3: rule__Content__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Content__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Mensamodel__ElementsAssignment"
    // InternalMyDsl.g:555:1: rule__Mensamodel__ElementsAssignment : ( ruleTag ) ;
    public final void rule__Mensamodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( ( ruleTag ) )
            // InternalMyDsl.g:560:2: ( ruleTag )
            {
            // InternalMyDsl.g:560:2: ( ruleTag )
            // InternalMyDsl.g:561:3: ruleTag
            {
             before(grammarAccess.getMensamodelAccess().getElementsTagParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getElementsTagParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mensamodel__ElementsAssignment"


    // $ANTLR start "rule__Tag__NameAssignment_1"
    // InternalMyDsl.g:570:1: rule__Tag__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:575:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:575:2: ( RULE_STRING )
            // InternalMyDsl.g:576:3: RULE_STRING
            {
             before(grammarAccess.getTagAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment_1"


    // $ANTLR start "rule__Tag__IdAssignment_3"
    // InternalMyDsl.g:585:1: rule__Tag__IdAssignment_3 : ( ruleHtml_Id ) ;
    public final void rule__Tag__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ruleHtml_Id ) )
            // InternalMyDsl.g:590:2: ( ruleHtml_Id )
            {
            // InternalMyDsl.g:590:2: ( ruleHtml_Id )
            // InternalMyDsl.g:591:3: ruleHtml_Id
            {
             before(grammarAccess.getTagAccess().getIdHtml_IdParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHtml_Id();

            state._fsp--;

             after(grammarAccess.getTagAccess().getIdHtml_IdParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__IdAssignment_3"


    // $ANTLR start "rule__Tag__Class_hAssignment_4"
    // InternalMyDsl.g:600:1: rule__Tag__Class_hAssignment_4 : ( ruleHtml_Class ) ;
    public final void rule__Tag__Class_hAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( ( ruleHtml_Class ) )
            // InternalMyDsl.g:605:2: ( ruleHtml_Class )
            {
            // InternalMyDsl.g:605:2: ( ruleHtml_Class )
            // InternalMyDsl.g:606:3: ruleHtml_Class
            {
             before(grammarAccess.getTagAccess().getClass_hHtml_ClassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHtml_Class();

            state._fsp--;

             after(grammarAccess.getTagAccess().getClass_hHtml_ClassParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Class_hAssignment_4"


    // $ANTLR start "rule__Tag__ContentAssignment_5"
    // InternalMyDsl.g:615:1: rule__Tag__ContentAssignment_5 : ( ruleContent ) ;
    public final void rule__Tag__ContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( ruleContent ) )
            // InternalMyDsl.g:620:2: ( ruleContent )
            {
            // InternalMyDsl.g:620:2: ( ruleContent )
            // InternalMyDsl.g:621:3: ruleContent
            {
             before(grammarAccess.getTagAccess().getContentContentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTagAccess().getContentContentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ContentAssignment_5"


    // $ANTLR start "rule__Tag__ChildrenAssignment_6"
    // InternalMyDsl.g:630:1: rule__Tag__ChildrenAssignment_6 : ( ruleTag ) ;
    public final void rule__Tag__ChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( ruleTag ) )
            // InternalMyDsl.g:635:2: ( ruleTag )
            {
            // InternalMyDsl.g:635:2: ( ruleTag )
            // InternalMyDsl.g:636:3: ruleTag
            {
             before(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagAccess().getChildrenTagParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ChildrenAssignment_6"


    // $ANTLR start "rule__Html_Id__NameAssignment_1"
    // InternalMyDsl.g:645:1: rule__Html_Id__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Html_Id__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:650:2: ( RULE_ID )
            {
            // InternalMyDsl.g:650:2: ( RULE_ID )
            // InternalMyDsl.g:651:3: RULE_ID
            {
             before(grammarAccess.getHtml_IdAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHtml_IdAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Id__NameAssignment_1"


    // $ANTLR start "rule__Html_Class__NameAssignment_1"
    // InternalMyDsl.g:660:1: rule__Html_Class__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Html_Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:665:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:665:2: ( RULE_STRING )
            // InternalMyDsl.g:666:3: RULE_STRING
            {
             before(grammarAccess.getHtml_ClassAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHtml_ClassAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Html_Class__NameAssignment_1"


    // $ANTLR start "rule__Content__NameAssignment_1"
    // InternalMyDsl.g:675:1: rule__Content__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Content__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:680:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:680:2: ( RULE_STRING )
            // InternalMyDsl.g:681:3: RULE_STRING
            {
             before(grammarAccess.getContentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}