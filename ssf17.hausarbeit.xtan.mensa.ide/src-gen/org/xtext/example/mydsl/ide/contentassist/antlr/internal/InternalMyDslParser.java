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
    // InternalMyDsl.g:62:1: ruleMensamodel : ( ( rule__Mensamodel__Group__0 ) ) ;
    public final void ruleMensamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Mensamodel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Mensamodel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Mensamodel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Mensamodel__Group__0 )
            {
             before(grammarAccess.getMensamodelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Mensamodel__Group__0 )
            // InternalMyDsl.g:69:4: rule__Mensamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mensamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleHeader"
    // InternalMyDsl.g:78:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleHeader EOF )
            // InternalMyDsl.g:80:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMyDsl.g:87:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Header__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Header__Group__0 )
            // InternalMyDsl.g:94:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleDescription"
    // InternalMyDsl.g:103:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDescription EOF )
            // InternalMyDsl.g:105:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalMyDsl.g:112:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Description__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Description__Group__0 )
            // InternalMyDsl.g:119:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleNAV"
    // InternalMyDsl.g:128:1: entryRuleNAV : ruleNAV EOF ;
    public final void entryRuleNAV() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleNAV EOF )
            // InternalMyDsl.g:130:1: ruleNAV EOF
            {
             before(grammarAccess.getNAVRule()); 
            pushFollow(FOLLOW_1);
            ruleNAV();

            state._fsp--;

             after(grammarAccess.getNAVRule()); 
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
    // $ANTLR end "entryRuleNAV"


    // $ANTLR start "ruleNAV"
    // InternalMyDsl.g:137:1: ruleNAV : ( ( rule__NAV__Group__0 ) ) ;
    public final void ruleNAV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__NAV__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__NAV__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__NAV__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__NAV__Group__0 )
            {
             before(grammarAccess.getNAVAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__NAV__Group__0 )
            // InternalMyDsl.g:144:4: rule__NAV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NAV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNAVAccess().getGroup()); 

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
    // $ANTLR end "ruleNAV"


    // $ANTLR start "entryRuleSiderbar"
    // InternalMyDsl.g:153:1: entryRuleSiderbar : ruleSiderbar EOF ;
    public final void entryRuleSiderbar() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSiderbar EOF )
            // InternalMyDsl.g:155:1: ruleSiderbar EOF
            {
             before(grammarAccess.getSiderbarRule()); 
            pushFollow(FOLLOW_1);
            ruleSiderbar();

            state._fsp--;

             after(grammarAccess.getSiderbarRule()); 
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
    // $ANTLR end "entryRuleSiderbar"


    // $ANTLR start "ruleSiderbar"
    // InternalMyDsl.g:162:1: ruleSiderbar : ( ( rule__Siderbar__Group__0 ) ) ;
    public final void ruleSiderbar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Siderbar__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Siderbar__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Siderbar__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Siderbar__Group__0 )
            {
             before(grammarAccess.getSiderbarAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Siderbar__Group__0 )
            // InternalMyDsl.g:169:4: rule__Siderbar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiderbarAccess().getGroup()); 

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
    // $ANTLR end "ruleSiderbar"


    // $ANTLR start "entryRuleRadio"
    // InternalMyDsl.g:178:1: entryRuleRadio : ruleRadio EOF ;
    public final void entryRuleRadio() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRadio EOF )
            // InternalMyDsl.g:180:1: ruleRadio EOF
            {
             before(grammarAccess.getRadioRule()); 
            pushFollow(FOLLOW_1);
            ruleRadio();

            state._fsp--;

             after(grammarAccess.getRadioRule()); 
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
    // $ANTLR end "entryRuleRadio"


    // $ANTLR start "ruleRadio"
    // InternalMyDsl.g:187:1: ruleRadio : ( ( rule__Radio__Group__0 ) ) ;
    public final void ruleRadio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Radio__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Radio__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Radio__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Radio__Group__0 )
            {
             before(grammarAccess.getRadioAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Radio__Group__0 )
            // InternalMyDsl.g:194:4: rule__Radio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Radio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getGroup()); 

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
    // $ANTLR end "ruleRadio"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:203:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleButton EOF )
            // InternalMyDsl.g:205:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:212:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:219:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSelector"
    // InternalMyDsl.g:228:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleSelector EOF )
            // InternalMyDsl.g:230:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalMyDsl.g:237:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Selector__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Selector__Group__0 )
            // InternalMyDsl.g:244:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleFooter"
    // InternalMyDsl.g:253:1: entryRuleFooter : ruleFooter EOF ;
    public final void entryRuleFooter() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleFooter EOF )
            // InternalMyDsl.g:255:1: ruleFooter EOF
            {
             before(grammarAccess.getFooterRule()); 
            pushFollow(FOLLOW_1);
            ruleFooter();

            state._fsp--;

             after(grammarAccess.getFooterRule()); 
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
    // $ANTLR end "entryRuleFooter"


    // $ANTLR start "ruleFooter"
    // InternalMyDsl.g:262:1: ruleFooter : ( ( rule__Footer__Group__0 ) ) ;
    public final void ruleFooter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Footer__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Footer__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Footer__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Footer__Group__0 )
            {
             before(grammarAccess.getFooterAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Footer__Group__0 )
            // InternalMyDsl.g:269:4: rule__Footer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Footer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFooterAccess().getGroup()); 

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
    // $ANTLR end "ruleFooter"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:278:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleLink EOF )
            // InternalMyDsl.g:280:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:287:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:294:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleMenu"
    // InternalMyDsl.g:303:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMenu EOF )
            // InternalMyDsl.g:305:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalMyDsl.g:312:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Menu__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Menu__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Menu__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Menu__Group__0 )
            // InternalMyDsl.g:319:4: rule__Menu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "rule__Mensamodel__Group__0"
    // InternalMyDsl.g:327:1: rule__Mensamodel__Group__0 : rule__Mensamodel__Group__0__Impl rule__Mensamodel__Group__1 ;
    public final void rule__Mensamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( rule__Mensamodel__Group__0__Impl rule__Mensamodel__Group__1 )
            // InternalMyDsl.g:332:2: rule__Mensamodel__Group__0__Impl rule__Mensamodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mensamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mensamodel__Group__1();

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
    // $ANTLR end "rule__Mensamodel__Group__0"


    // $ANTLR start "rule__Mensamodel__Group__0__Impl"
    // InternalMyDsl.g:339:1: rule__Mensamodel__Group__0__Impl : ( ( rule__Mensamodel__HeaderAssignment_0 ) ) ;
    public final void rule__Mensamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( ( ( rule__Mensamodel__HeaderAssignment_0 ) ) )
            // InternalMyDsl.g:344:1: ( ( rule__Mensamodel__HeaderAssignment_0 ) )
            {
            // InternalMyDsl.g:344:1: ( ( rule__Mensamodel__HeaderAssignment_0 ) )
            // InternalMyDsl.g:345:2: ( rule__Mensamodel__HeaderAssignment_0 )
            {
             before(grammarAccess.getMensamodelAccess().getHeaderAssignment_0()); 
            // InternalMyDsl.g:346:2: ( rule__Mensamodel__HeaderAssignment_0 )
            // InternalMyDsl.g:346:3: rule__Mensamodel__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mensamodel__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getHeaderAssignment_0()); 

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
    // $ANTLR end "rule__Mensamodel__Group__0__Impl"


    // $ANTLR start "rule__Mensamodel__Group__1"
    // InternalMyDsl.g:354:1: rule__Mensamodel__Group__1 : rule__Mensamodel__Group__1__Impl rule__Mensamodel__Group__2 ;
    public final void rule__Mensamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( rule__Mensamodel__Group__1__Impl rule__Mensamodel__Group__2 )
            // InternalMyDsl.g:359:2: rule__Mensamodel__Group__1__Impl rule__Mensamodel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mensamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mensamodel__Group__2();

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
    // $ANTLR end "rule__Mensamodel__Group__1"


    // $ANTLR start "rule__Mensamodel__Group__1__Impl"
    // InternalMyDsl.g:366:1: rule__Mensamodel__Group__1__Impl : ( ( rule__Mensamodel__FooterAssignment_1 ) ) ;
    public final void rule__Mensamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( ( ( rule__Mensamodel__FooterAssignment_1 ) ) )
            // InternalMyDsl.g:371:1: ( ( rule__Mensamodel__FooterAssignment_1 ) )
            {
            // InternalMyDsl.g:371:1: ( ( rule__Mensamodel__FooterAssignment_1 ) )
            // InternalMyDsl.g:372:2: ( rule__Mensamodel__FooterAssignment_1 )
            {
             before(grammarAccess.getMensamodelAccess().getFooterAssignment_1()); 
            // InternalMyDsl.g:373:2: ( rule__Mensamodel__FooterAssignment_1 )
            // InternalMyDsl.g:373:3: rule__Mensamodel__FooterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mensamodel__FooterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getFooterAssignment_1()); 

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
    // $ANTLR end "rule__Mensamodel__Group__1__Impl"


    // $ANTLR start "rule__Mensamodel__Group__2"
    // InternalMyDsl.g:381:1: rule__Mensamodel__Group__2 : rule__Mensamodel__Group__2__Impl rule__Mensamodel__Group__3 ;
    public final void rule__Mensamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( rule__Mensamodel__Group__2__Impl rule__Mensamodel__Group__3 )
            // InternalMyDsl.g:386:2: rule__Mensamodel__Group__2__Impl rule__Mensamodel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Mensamodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mensamodel__Group__3();

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
    // $ANTLR end "rule__Mensamodel__Group__2"


    // $ANTLR start "rule__Mensamodel__Group__2__Impl"
    // InternalMyDsl.g:393:1: rule__Mensamodel__Group__2__Impl : ( ( rule__Mensamodel__SiderbarAssignment_2 ) ) ;
    public final void rule__Mensamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( ( ( rule__Mensamodel__SiderbarAssignment_2 ) ) )
            // InternalMyDsl.g:398:1: ( ( rule__Mensamodel__SiderbarAssignment_2 ) )
            {
            // InternalMyDsl.g:398:1: ( ( rule__Mensamodel__SiderbarAssignment_2 ) )
            // InternalMyDsl.g:399:2: ( rule__Mensamodel__SiderbarAssignment_2 )
            {
             before(grammarAccess.getMensamodelAccess().getSiderbarAssignment_2()); 
            // InternalMyDsl.g:400:2: ( rule__Mensamodel__SiderbarAssignment_2 )
            // InternalMyDsl.g:400:3: rule__Mensamodel__SiderbarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mensamodel__SiderbarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getSiderbarAssignment_2()); 

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
    // $ANTLR end "rule__Mensamodel__Group__2__Impl"


    // $ANTLR start "rule__Mensamodel__Group__3"
    // InternalMyDsl.g:408:1: rule__Mensamodel__Group__3 : rule__Mensamodel__Group__3__Impl ;
    public final void rule__Mensamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( rule__Mensamodel__Group__3__Impl )
            // InternalMyDsl.g:413:2: rule__Mensamodel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mensamodel__Group__3__Impl();

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
    // $ANTLR end "rule__Mensamodel__Group__3"


    // $ANTLR start "rule__Mensamodel__Group__3__Impl"
    // InternalMyDsl.g:419:1: rule__Mensamodel__Group__3__Impl : ( ( rule__Mensamodel__MenusAssignment_3 )* ) ;
    public final void rule__Mensamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__Mensamodel__MenusAssignment_3 )* ) )
            // InternalMyDsl.g:424:1: ( ( rule__Mensamodel__MenusAssignment_3 )* )
            {
            // InternalMyDsl.g:424:1: ( ( rule__Mensamodel__MenusAssignment_3 )* )
            // InternalMyDsl.g:425:2: ( rule__Mensamodel__MenusAssignment_3 )*
            {
             before(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 
            // InternalMyDsl.g:426:2: ( rule__Mensamodel__MenusAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:426:3: rule__Mensamodel__MenusAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Mensamodel__MenusAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 

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
    // $ANTLR end "rule__Mensamodel__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalMyDsl.g:435:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMyDsl.g:440:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalMyDsl.g:447:1: rule__Header__Group__0__Impl : ( 'header' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:451:1: ( ( 'header' ) )
            // InternalMyDsl.g:452:1: ( 'header' )
            {
            // InternalMyDsl.g:452:1: ( 'header' )
            // InternalMyDsl.g:453:2: 'header'
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_0()); 

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
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalMyDsl.g:462:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMyDsl.g:467:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalMyDsl.g:474:1: rule__Header__Group__1__Impl : ( ( rule__Header__NameAssignment_1 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( ( rule__Header__NameAssignment_1 ) ) )
            // InternalMyDsl.g:479:1: ( ( rule__Header__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:479:1: ( ( rule__Header__NameAssignment_1 ) )
            // InternalMyDsl.g:480:2: ( rule__Header__NameAssignment_1 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:481:2: ( rule__Header__NameAssignment_1 )
            // InternalMyDsl.g:481:3: rule__Header__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Header__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalMyDsl.g:489:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalMyDsl.g:494:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalMyDsl.g:501:1: rule__Header__Group__2__Impl : ( '{' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( ( '{' ) )
            // InternalMyDsl.g:506:1: ( '{' )
            {
            // InternalMyDsl.g:506:1: ( '{' )
            // InternalMyDsl.g:507:2: '{'
            {
             before(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalMyDsl.g:516:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalMyDsl.g:521:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

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
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalMyDsl.g:528:1: rule__Header__Group__3__Impl : ( ( rule__Header__DescriptionAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( ( rule__Header__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:533:1: ( ( rule__Header__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:533:1: ( ( rule__Header__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:534:2: ( rule__Header__DescriptionAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:535:2: ( rule__Header__DescriptionAssignment_3 )
            // InternalMyDsl.g:535:3: rule__Header__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Header__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalMyDsl.g:543:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // InternalMyDsl.g:548:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Header__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__5();

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
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalMyDsl.g:555:1: rule__Header__Group__4__Impl : ( ( rule__Header__NavAssignment_4 )* ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( ( ( rule__Header__NavAssignment_4 )* ) )
            // InternalMyDsl.g:560:1: ( ( rule__Header__NavAssignment_4 )* )
            {
            // InternalMyDsl.g:560:1: ( ( rule__Header__NavAssignment_4 )* )
            // InternalMyDsl.g:561:2: ( rule__Header__NavAssignment_4 )*
            {
             before(grammarAccess.getHeaderAccess().getNavAssignment_4()); 
            // InternalMyDsl.g:562:2: ( rule__Header__NavAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:562:3: rule__Header__NavAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Header__NavAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getHeaderAccess().getNavAssignment_4()); 

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
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Header__Group__5"
    // InternalMyDsl.g:570:1: rule__Header__Group__5 : rule__Header__Group__5__Impl ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( rule__Header__Group__5__Impl )
            // InternalMyDsl.g:575:2: rule__Header__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__5__Impl();

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
    // $ANTLR end "rule__Header__Group__5"


    // $ANTLR start "rule__Header__Group__5__Impl"
    // InternalMyDsl.g:581:1: rule__Header__Group__5__Impl : ( '}' ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( ( '}' ) )
            // InternalMyDsl.g:586:1: ( '}' )
            {
            // InternalMyDsl.g:586:1: ( '}' )
            // InternalMyDsl.g:587:2: '}'
            {
             before(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Header__Group__5__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalMyDsl.g:597:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalMyDsl.g:602:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalMyDsl.g:609:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( ( 'description' ) )
            // InternalMyDsl.g:614:1: ( 'description' )
            {
            // InternalMyDsl.g:614:1: ( 'description' )
            // InternalMyDsl.g:615:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalMyDsl.g:624:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( rule__Description__Group__1__Impl )
            // InternalMyDsl.g:629:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalMyDsl.g:635:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalMyDsl.g:640:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:640:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalMyDsl.g:641:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:642:2: ( rule__Description__NameAssignment_1 )
            // InternalMyDsl.g:642:3: rule__Description__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__NAV__Group__0"
    // InternalMyDsl.g:651:1: rule__NAV__Group__0 : rule__NAV__Group__0__Impl rule__NAV__Group__1 ;
    public final void rule__NAV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( rule__NAV__Group__0__Impl rule__NAV__Group__1 )
            // InternalMyDsl.g:656:2: rule__NAV__Group__0__Impl rule__NAV__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NAV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAV__Group__1();

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
    // $ANTLR end "rule__NAV__Group__0"


    // $ANTLR start "rule__NAV__Group__0__Impl"
    // InternalMyDsl.g:663:1: rule__NAV__Group__0__Impl : ( 'nav' ) ;
    public final void rule__NAV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( 'nav' ) )
            // InternalMyDsl.g:668:1: ( 'nav' )
            {
            // InternalMyDsl.g:668:1: ( 'nav' )
            // InternalMyDsl.g:669:2: 'nav'
            {
             before(grammarAccess.getNAVAccess().getNavKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getNavKeyword_0()); 

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
    // $ANTLR end "rule__NAV__Group__0__Impl"


    // $ANTLR start "rule__NAV__Group__1"
    // InternalMyDsl.g:678:1: rule__NAV__Group__1 : rule__NAV__Group__1__Impl rule__NAV__Group__2 ;
    public final void rule__NAV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( rule__NAV__Group__1__Impl rule__NAV__Group__2 )
            // InternalMyDsl.g:683:2: rule__NAV__Group__1__Impl rule__NAV__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NAV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAV__Group__2();

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
    // $ANTLR end "rule__NAV__Group__1"


    // $ANTLR start "rule__NAV__Group__1__Impl"
    // InternalMyDsl.g:690:1: rule__NAV__Group__1__Impl : ( ( rule__NAV__NameAssignment_1 ) ) ;
    public final void rule__NAV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( ( ( rule__NAV__NameAssignment_1 ) ) )
            // InternalMyDsl.g:695:1: ( ( rule__NAV__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:695:1: ( ( rule__NAV__NameAssignment_1 ) )
            // InternalMyDsl.g:696:2: ( rule__NAV__NameAssignment_1 )
            {
             before(grammarAccess.getNAVAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:697:2: ( rule__NAV__NameAssignment_1 )
            // InternalMyDsl.g:697:3: rule__NAV__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NAV__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNAVAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NAV__Group__1__Impl"


    // $ANTLR start "rule__NAV__Group__2"
    // InternalMyDsl.g:705:1: rule__NAV__Group__2 : rule__NAV__Group__2__Impl rule__NAV__Group__3 ;
    public final void rule__NAV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:709:1: ( rule__NAV__Group__2__Impl rule__NAV__Group__3 )
            // InternalMyDsl.g:710:2: rule__NAV__Group__2__Impl rule__NAV__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NAV__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAV__Group__3();

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
    // $ANTLR end "rule__NAV__Group__2"


    // $ANTLR start "rule__NAV__Group__2__Impl"
    // InternalMyDsl.g:717:1: rule__NAV__Group__2__Impl : ( '{' ) ;
    public final void rule__NAV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( ( '{' ) )
            // InternalMyDsl.g:722:1: ( '{' )
            {
            // InternalMyDsl.g:722:1: ( '{' )
            // InternalMyDsl.g:723:2: '{'
            {
             before(grammarAccess.getNAVAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NAV__Group__2__Impl"


    // $ANTLR start "rule__NAV__Group__3"
    // InternalMyDsl.g:732:1: rule__NAV__Group__3 : rule__NAV__Group__3__Impl rule__NAV__Group__4 ;
    public final void rule__NAV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( rule__NAV__Group__3__Impl rule__NAV__Group__4 )
            // InternalMyDsl.g:737:2: rule__NAV__Group__3__Impl rule__NAV__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__NAV__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAV__Group__4();

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
    // $ANTLR end "rule__NAV__Group__3"


    // $ANTLR start "rule__NAV__Group__3__Impl"
    // InternalMyDsl.g:744:1: rule__NAV__Group__3__Impl : ( 'href' ) ;
    public final void rule__NAV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( 'href' ) )
            // InternalMyDsl.g:749:1: ( 'href' )
            {
            // InternalMyDsl.g:749:1: ( 'href' )
            // InternalMyDsl.g:750:2: 'href'
            {
             before(grammarAccess.getNAVAccess().getHrefKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getHrefKeyword_3()); 

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
    // $ANTLR end "rule__NAV__Group__3__Impl"


    // $ANTLR start "rule__NAV__Group__4"
    // InternalMyDsl.g:759:1: rule__NAV__Group__4 : rule__NAV__Group__4__Impl rule__NAV__Group__5 ;
    public final void rule__NAV__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( rule__NAV__Group__4__Impl rule__NAV__Group__5 )
            // InternalMyDsl.g:764:2: rule__NAV__Group__4__Impl rule__NAV__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__NAV__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAV__Group__5();

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
    // $ANTLR end "rule__NAV__Group__4"


    // $ANTLR start "rule__NAV__Group__4__Impl"
    // InternalMyDsl.g:771:1: rule__NAV__Group__4__Impl : ( ( rule__NAV__HrefAssignment_4 ) ) ;
    public final void rule__NAV__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( ( ( rule__NAV__HrefAssignment_4 ) ) )
            // InternalMyDsl.g:776:1: ( ( rule__NAV__HrefAssignment_4 ) )
            {
            // InternalMyDsl.g:776:1: ( ( rule__NAV__HrefAssignment_4 ) )
            // InternalMyDsl.g:777:2: ( rule__NAV__HrefAssignment_4 )
            {
             before(grammarAccess.getNAVAccess().getHrefAssignment_4()); 
            // InternalMyDsl.g:778:2: ( rule__NAV__HrefAssignment_4 )
            // InternalMyDsl.g:778:3: rule__NAV__HrefAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__NAV__HrefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNAVAccess().getHrefAssignment_4()); 

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
    // $ANTLR end "rule__NAV__Group__4__Impl"


    // $ANTLR start "rule__NAV__Group__5"
    // InternalMyDsl.g:786:1: rule__NAV__Group__5 : rule__NAV__Group__5__Impl ;
    public final void rule__NAV__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( rule__NAV__Group__5__Impl )
            // InternalMyDsl.g:791:2: rule__NAV__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NAV__Group__5__Impl();

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
    // $ANTLR end "rule__NAV__Group__5"


    // $ANTLR start "rule__NAV__Group__5__Impl"
    // InternalMyDsl.g:797:1: rule__NAV__Group__5__Impl : ( '}' ) ;
    public final void rule__NAV__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( ( '}' ) )
            // InternalMyDsl.g:802:1: ( '}' )
            {
            // InternalMyDsl.g:802:1: ( '}' )
            // InternalMyDsl.g:803:2: '}'
            {
             before(grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__NAV__Group__5__Impl"


    // $ANTLR start "rule__Siderbar__Group__0"
    // InternalMyDsl.g:813:1: rule__Siderbar__Group__0 : rule__Siderbar__Group__0__Impl rule__Siderbar__Group__1 ;
    public final void rule__Siderbar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( rule__Siderbar__Group__0__Impl rule__Siderbar__Group__1 )
            // InternalMyDsl.g:818:2: rule__Siderbar__Group__0__Impl rule__Siderbar__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Siderbar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__1();

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
    // $ANTLR end "rule__Siderbar__Group__0"


    // $ANTLR start "rule__Siderbar__Group__0__Impl"
    // InternalMyDsl.g:825:1: rule__Siderbar__Group__0__Impl : ( 'siderbar' ) ;
    public final void rule__Siderbar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( ( 'siderbar' ) )
            // InternalMyDsl.g:830:1: ( 'siderbar' )
            {
            // InternalMyDsl.g:830:1: ( 'siderbar' )
            // InternalMyDsl.g:831:2: 'siderbar'
            {
             before(grammarAccess.getSiderbarAccess().getSiderbarKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSiderbarAccess().getSiderbarKeyword_0()); 

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
    // $ANTLR end "rule__Siderbar__Group__0__Impl"


    // $ANTLR start "rule__Siderbar__Group__1"
    // InternalMyDsl.g:840:1: rule__Siderbar__Group__1 : rule__Siderbar__Group__1__Impl rule__Siderbar__Group__2 ;
    public final void rule__Siderbar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:844:1: ( rule__Siderbar__Group__1__Impl rule__Siderbar__Group__2 )
            // InternalMyDsl.g:845:2: rule__Siderbar__Group__1__Impl rule__Siderbar__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Siderbar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__2();

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
    // $ANTLR end "rule__Siderbar__Group__1"


    // $ANTLR start "rule__Siderbar__Group__1__Impl"
    // InternalMyDsl.g:852:1: rule__Siderbar__Group__1__Impl : ( ( rule__Siderbar__NameAssignment_1 ) ) ;
    public final void rule__Siderbar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( ( rule__Siderbar__NameAssignment_1 ) ) )
            // InternalMyDsl.g:857:1: ( ( rule__Siderbar__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:857:1: ( ( rule__Siderbar__NameAssignment_1 ) )
            // InternalMyDsl.g:858:2: ( rule__Siderbar__NameAssignment_1 )
            {
             before(grammarAccess.getSiderbarAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:859:2: ( rule__Siderbar__NameAssignment_1 )
            // InternalMyDsl.g:859:3: rule__Siderbar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Siderbar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiderbarAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Siderbar__Group__1__Impl"


    // $ANTLR start "rule__Siderbar__Group__2"
    // InternalMyDsl.g:867:1: rule__Siderbar__Group__2 : rule__Siderbar__Group__2__Impl rule__Siderbar__Group__3 ;
    public final void rule__Siderbar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( rule__Siderbar__Group__2__Impl rule__Siderbar__Group__3 )
            // InternalMyDsl.g:872:2: rule__Siderbar__Group__2__Impl rule__Siderbar__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Siderbar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__3();

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
    // $ANTLR end "rule__Siderbar__Group__2"


    // $ANTLR start "rule__Siderbar__Group__2__Impl"
    // InternalMyDsl.g:879:1: rule__Siderbar__Group__2__Impl : ( '{' ) ;
    public final void rule__Siderbar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( '{' ) )
            // InternalMyDsl.g:884:1: ( '{' )
            {
            // InternalMyDsl.g:884:1: ( '{' )
            // InternalMyDsl.g:885:2: '{'
            {
             before(grammarAccess.getSiderbarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSiderbarAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Siderbar__Group__2__Impl"


    // $ANTLR start "rule__Siderbar__Group__3"
    // InternalMyDsl.g:894:1: rule__Siderbar__Group__3 : rule__Siderbar__Group__3__Impl rule__Siderbar__Group__4 ;
    public final void rule__Siderbar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( rule__Siderbar__Group__3__Impl rule__Siderbar__Group__4 )
            // InternalMyDsl.g:899:2: rule__Siderbar__Group__3__Impl rule__Siderbar__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Siderbar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__4();

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
    // $ANTLR end "rule__Siderbar__Group__3"


    // $ANTLR start "rule__Siderbar__Group__3__Impl"
    // InternalMyDsl.g:906:1: rule__Siderbar__Group__3__Impl : ( ( rule__Siderbar__DescriptionAssignment_3 ) ) ;
    public final void rule__Siderbar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( ( ( rule__Siderbar__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:911:1: ( ( rule__Siderbar__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:911:1: ( ( rule__Siderbar__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:912:2: ( rule__Siderbar__DescriptionAssignment_3 )
            {
             before(grammarAccess.getSiderbarAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:913:2: ( rule__Siderbar__DescriptionAssignment_3 )
            // InternalMyDsl.g:913:3: rule__Siderbar__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Siderbar__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSiderbarAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Siderbar__Group__3__Impl"


    // $ANTLR start "rule__Siderbar__Group__4"
    // InternalMyDsl.g:921:1: rule__Siderbar__Group__4 : rule__Siderbar__Group__4__Impl rule__Siderbar__Group__5 ;
    public final void rule__Siderbar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( rule__Siderbar__Group__4__Impl rule__Siderbar__Group__5 )
            // InternalMyDsl.g:926:2: rule__Siderbar__Group__4__Impl rule__Siderbar__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Siderbar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__5();

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
    // $ANTLR end "rule__Siderbar__Group__4"


    // $ANTLR start "rule__Siderbar__Group__4__Impl"
    // InternalMyDsl.g:933:1: rule__Siderbar__Group__4__Impl : ( ( rule__Siderbar__RadioAssignment_4 )* ) ;
    public final void rule__Siderbar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( ( ( rule__Siderbar__RadioAssignment_4 )* ) )
            // InternalMyDsl.g:938:1: ( ( rule__Siderbar__RadioAssignment_4 )* )
            {
            // InternalMyDsl.g:938:1: ( ( rule__Siderbar__RadioAssignment_4 )* )
            // InternalMyDsl.g:939:2: ( rule__Siderbar__RadioAssignment_4 )*
            {
             before(grammarAccess.getSiderbarAccess().getRadioAssignment_4()); 
            // InternalMyDsl.g:940:2: ( rule__Siderbar__RadioAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:940:3: rule__Siderbar__RadioAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Siderbar__RadioAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSiderbarAccess().getRadioAssignment_4()); 

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
    // $ANTLR end "rule__Siderbar__Group__4__Impl"


    // $ANTLR start "rule__Siderbar__Group__5"
    // InternalMyDsl.g:948:1: rule__Siderbar__Group__5 : rule__Siderbar__Group__5__Impl rule__Siderbar__Group__6 ;
    public final void rule__Siderbar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( rule__Siderbar__Group__5__Impl rule__Siderbar__Group__6 )
            // InternalMyDsl.g:953:2: rule__Siderbar__Group__5__Impl rule__Siderbar__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Siderbar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__6();

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
    // $ANTLR end "rule__Siderbar__Group__5"


    // $ANTLR start "rule__Siderbar__Group__5__Impl"
    // InternalMyDsl.g:960:1: rule__Siderbar__Group__5__Impl : ( ( rule__Siderbar__ButtonAssignment_5 )* ) ;
    public final void rule__Siderbar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( ( ( rule__Siderbar__ButtonAssignment_5 )* ) )
            // InternalMyDsl.g:965:1: ( ( rule__Siderbar__ButtonAssignment_5 )* )
            {
            // InternalMyDsl.g:965:1: ( ( rule__Siderbar__ButtonAssignment_5 )* )
            // InternalMyDsl.g:966:2: ( rule__Siderbar__ButtonAssignment_5 )*
            {
             before(grammarAccess.getSiderbarAccess().getButtonAssignment_5()); 
            // InternalMyDsl.g:967:2: ( rule__Siderbar__ButtonAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:967:3: rule__Siderbar__ButtonAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Siderbar__ButtonAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSiderbarAccess().getButtonAssignment_5()); 

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
    // $ANTLR end "rule__Siderbar__Group__5__Impl"


    // $ANTLR start "rule__Siderbar__Group__6"
    // InternalMyDsl.g:975:1: rule__Siderbar__Group__6 : rule__Siderbar__Group__6__Impl rule__Siderbar__Group__7 ;
    public final void rule__Siderbar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( rule__Siderbar__Group__6__Impl rule__Siderbar__Group__7 )
            // InternalMyDsl.g:980:2: rule__Siderbar__Group__6__Impl rule__Siderbar__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Siderbar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__7();

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
    // $ANTLR end "rule__Siderbar__Group__6"


    // $ANTLR start "rule__Siderbar__Group__6__Impl"
    // InternalMyDsl.g:987:1: rule__Siderbar__Group__6__Impl : ( ( rule__Siderbar__SelectorAssignment_6 )* ) ;
    public final void rule__Siderbar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( ( ( rule__Siderbar__SelectorAssignment_6 )* ) )
            // InternalMyDsl.g:992:1: ( ( rule__Siderbar__SelectorAssignment_6 )* )
            {
            // InternalMyDsl.g:992:1: ( ( rule__Siderbar__SelectorAssignment_6 )* )
            // InternalMyDsl.g:993:2: ( rule__Siderbar__SelectorAssignment_6 )*
            {
             before(grammarAccess.getSiderbarAccess().getSelectorAssignment_6()); 
            // InternalMyDsl.g:994:2: ( rule__Siderbar__SelectorAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:994:3: rule__Siderbar__SelectorAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Siderbar__SelectorAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSiderbarAccess().getSelectorAssignment_6()); 

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
    // $ANTLR end "rule__Siderbar__Group__6__Impl"


    // $ANTLR start "rule__Siderbar__Group__7"
    // InternalMyDsl.g:1002:1: rule__Siderbar__Group__7 : rule__Siderbar__Group__7__Impl ;
    public final void rule__Siderbar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( rule__Siderbar__Group__7__Impl )
            // InternalMyDsl.g:1007:2: rule__Siderbar__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__7__Impl();

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
    // $ANTLR end "rule__Siderbar__Group__7"


    // $ANTLR start "rule__Siderbar__Group__7__Impl"
    // InternalMyDsl.g:1013:1: rule__Siderbar__Group__7__Impl : ( '}' ) ;
    public final void rule__Siderbar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( '}' ) )
            // InternalMyDsl.g:1018:1: ( '}' )
            {
            // InternalMyDsl.g:1018:1: ( '}' )
            // InternalMyDsl.g:1019:2: '}'
            {
             before(grammarAccess.getSiderbarAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSiderbarAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Siderbar__Group__7__Impl"


    // $ANTLR start "rule__Radio__Group__0"
    // InternalMyDsl.g:1029:1: rule__Radio__Group__0 : rule__Radio__Group__0__Impl rule__Radio__Group__1 ;
    public final void rule__Radio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( rule__Radio__Group__0__Impl rule__Radio__Group__1 )
            // InternalMyDsl.g:1034:2: rule__Radio__Group__0__Impl rule__Radio__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Radio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__1();

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
    // $ANTLR end "rule__Radio__Group__0"


    // $ANTLR start "rule__Radio__Group__0__Impl"
    // InternalMyDsl.g:1041:1: rule__Radio__Group__0__Impl : ( 'radio' ) ;
    public final void rule__Radio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( ( 'radio' ) )
            // InternalMyDsl.g:1046:1: ( 'radio' )
            {
            // InternalMyDsl.g:1046:1: ( 'radio' )
            // InternalMyDsl.g:1047:2: 'radio'
            {
             before(grammarAccess.getRadioAccess().getRadioKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getRadioKeyword_0()); 

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
    // $ANTLR end "rule__Radio__Group__0__Impl"


    // $ANTLR start "rule__Radio__Group__1"
    // InternalMyDsl.g:1056:1: rule__Radio__Group__1 : rule__Radio__Group__1__Impl rule__Radio__Group__2 ;
    public final void rule__Radio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( rule__Radio__Group__1__Impl rule__Radio__Group__2 )
            // InternalMyDsl.g:1061:2: rule__Radio__Group__1__Impl rule__Radio__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Radio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__2();

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
    // $ANTLR end "rule__Radio__Group__1"


    // $ANTLR start "rule__Radio__Group__1__Impl"
    // InternalMyDsl.g:1068:1: rule__Radio__Group__1__Impl : ( ( rule__Radio__NameAssignment_1 ) ) ;
    public final void rule__Radio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( ( rule__Radio__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1073:1: ( ( rule__Radio__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1073:1: ( ( rule__Radio__NameAssignment_1 ) )
            // InternalMyDsl.g:1074:2: ( rule__Radio__NameAssignment_1 )
            {
             before(grammarAccess.getRadioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1075:2: ( rule__Radio__NameAssignment_1 )
            // InternalMyDsl.g:1075:3: rule__Radio__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Radio__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Radio__Group__1__Impl"


    // $ANTLR start "rule__Radio__Group__2"
    // InternalMyDsl.g:1083:1: rule__Radio__Group__2 : rule__Radio__Group__2__Impl rule__Radio__Group__3 ;
    public final void rule__Radio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( rule__Radio__Group__2__Impl rule__Radio__Group__3 )
            // InternalMyDsl.g:1088:2: rule__Radio__Group__2__Impl rule__Radio__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Radio__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__3();

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
    // $ANTLR end "rule__Radio__Group__2"


    // $ANTLR start "rule__Radio__Group__2__Impl"
    // InternalMyDsl.g:1095:1: rule__Radio__Group__2__Impl : ( '{' ) ;
    public final void rule__Radio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( ( '{' ) )
            // InternalMyDsl.g:1100:1: ( '{' )
            {
            // InternalMyDsl.g:1100:1: ( '{' )
            // InternalMyDsl.g:1101:2: '{'
            {
             before(grammarAccess.getRadioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Radio__Group__2__Impl"


    // $ANTLR start "rule__Radio__Group__3"
    // InternalMyDsl.g:1110:1: rule__Radio__Group__3 : rule__Radio__Group__3__Impl rule__Radio__Group__4 ;
    public final void rule__Radio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( rule__Radio__Group__3__Impl rule__Radio__Group__4 )
            // InternalMyDsl.g:1115:2: rule__Radio__Group__3__Impl rule__Radio__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Radio__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__4();

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
    // $ANTLR end "rule__Radio__Group__3"


    // $ANTLR start "rule__Radio__Group__3__Impl"
    // InternalMyDsl.g:1122:1: rule__Radio__Group__3__Impl : ( ( rule__Radio__TitleAssignment_3 ) ) ;
    public final void rule__Radio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( ( ( rule__Radio__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1127:1: ( ( rule__Radio__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1127:1: ( ( rule__Radio__TitleAssignment_3 ) )
            // InternalMyDsl.g:1128:2: ( rule__Radio__TitleAssignment_3 )
            {
             before(grammarAccess.getRadioAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1129:2: ( rule__Radio__TitleAssignment_3 )
            // InternalMyDsl.g:1129:3: rule__Radio__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Radio__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Radio__Group__3__Impl"


    // $ANTLR start "rule__Radio__Group__4"
    // InternalMyDsl.g:1137:1: rule__Radio__Group__4 : rule__Radio__Group__4__Impl rule__Radio__Group__5 ;
    public final void rule__Radio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( rule__Radio__Group__4__Impl rule__Radio__Group__5 )
            // InternalMyDsl.g:1142:2: rule__Radio__Group__4__Impl rule__Radio__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Radio__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__5();

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
    // $ANTLR end "rule__Radio__Group__4"


    // $ANTLR start "rule__Radio__Group__4__Impl"
    // InternalMyDsl.g:1149:1: rule__Radio__Group__4__Impl : ( ( rule__Radio__Group_4__0 )* ) ;
    public final void rule__Radio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( ( ( rule__Radio__Group_4__0 )* ) )
            // InternalMyDsl.g:1154:1: ( ( rule__Radio__Group_4__0 )* )
            {
            // InternalMyDsl.g:1154:1: ( ( rule__Radio__Group_4__0 )* )
            // InternalMyDsl.g:1155:2: ( rule__Radio__Group_4__0 )*
            {
             before(grammarAccess.getRadioAccess().getGroup_4()); 
            // InternalMyDsl.g:1156:2: ( rule__Radio__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1156:3: rule__Radio__Group_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Radio__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRadioAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Radio__Group__4__Impl"


    // $ANTLR start "rule__Radio__Group__5"
    // InternalMyDsl.g:1164:1: rule__Radio__Group__5 : rule__Radio__Group__5__Impl ;
    public final void rule__Radio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( rule__Radio__Group__5__Impl )
            // InternalMyDsl.g:1169:2: rule__Radio__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Radio__Group__5__Impl();

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
    // $ANTLR end "rule__Radio__Group__5"


    // $ANTLR start "rule__Radio__Group__5__Impl"
    // InternalMyDsl.g:1175:1: rule__Radio__Group__5__Impl : ( '}' ) ;
    public final void rule__Radio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( '}' ) )
            // InternalMyDsl.g:1180:1: ( '}' )
            {
            // InternalMyDsl.g:1180:1: ( '}' )
            // InternalMyDsl.g:1181:2: '}'
            {
             before(grammarAccess.getRadioAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Radio__Group__5__Impl"


    // $ANTLR start "rule__Radio__Group_4__0"
    // InternalMyDsl.g:1191:1: rule__Radio__Group_4__0 : rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1 ;
    public final void rule__Radio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1 )
            // InternalMyDsl.g:1196:2: rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Radio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group_4__1();

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
    // $ANTLR end "rule__Radio__Group_4__0"


    // $ANTLR start "rule__Radio__Group_4__0__Impl"
    // InternalMyDsl.g:1203:1: rule__Radio__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Radio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( ( 'option' ) )
            // InternalMyDsl.g:1208:1: ( 'option' )
            {
            // InternalMyDsl.g:1208:1: ( 'option' )
            // InternalMyDsl.g:1209:2: 'option'
            {
             before(grammarAccess.getRadioAccess().getOptionKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getOptionKeyword_4_0()); 

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
    // $ANTLR end "rule__Radio__Group_4__0__Impl"


    // $ANTLR start "rule__Radio__Group_4__1"
    // InternalMyDsl.g:1218:1: rule__Radio__Group_4__1 : rule__Radio__Group_4__1__Impl ;
    public final void rule__Radio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( rule__Radio__Group_4__1__Impl )
            // InternalMyDsl.g:1223:2: rule__Radio__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Radio__Group_4__1__Impl();

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
    // $ANTLR end "rule__Radio__Group_4__1"


    // $ANTLR start "rule__Radio__Group_4__1__Impl"
    // InternalMyDsl.g:1229:1: rule__Radio__Group_4__1__Impl : ( ( rule__Radio__OptionsAssignment_4_1 ) ) ;
    public final void rule__Radio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( ( ( rule__Radio__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1234:1: ( ( rule__Radio__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1234:1: ( ( rule__Radio__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:1235:2: ( rule__Radio__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getRadioAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:1236:2: ( rule__Radio__OptionsAssignment_4_1 )
            // InternalMyDsl.g:1236:3: rule__Radio__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Radio__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Radio__Group_4__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalMyDsl.g:1245:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:1250:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalMyDsl.g:1257:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( ( 'button' ) )
            // InternalMyDsl.g:1262:1: ( 'button' )
            {
            // InternalMyDsl.g:1262:1: ( 'button' )
            // InternalMyDsl.g:1263:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalMyDsl.g:1272:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:1277:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalMyDsl.g:1284:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1289:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1289:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalMyDsl.g:1290:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1291:2: ( rule__Button__NameAssignment_1 )
            // InternalMyDsl.g:1291:3: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalMyDsl.g:1299:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:1304:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalMyDsl.g:1311:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( '{' ) )
            // InternalMyDsl.g:1316:1: ( '{' )
            {
            // InternalMyDsl.g:1316:1: ( '{' )
            // InternalMyDsl.g:1317:2: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalMyDsl.g:1326:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:1331:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalMyDsl.g:1338:1: rule__Button__Group__3__Impl : ( ( rule__Button__TitleAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( ( rule__Button__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1343:1: ( ( rule__Button__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1343:1: ( ( rule__Button__TitleAssignment_3 ) )
            // InternalMyDsl.g:1344:2: ( rule__Button__TitleAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1345:2: ( rule__Button__TitleAssignment_3 )
            // InternalMyDsl.g:1345:3: rule__Button__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Button__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalMyDsl.g:1353:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalMyDsl.g:1358:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__5();

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
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalMyDsl.g:1365:1: rule__Button__Group__4__Impl : ( 'href' ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( ( 'href' ) )
            // InternalMyDsl.g:1370:1: ( 'href' )
            {
            // InternalMyDsl.g:1370:1: ( 'href' )
            // InternalMyDsl.g:1371:2: 'href'
            {
             before(grammarAccess.getButtonAccess().getHrefKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getHrefKeyword_4()); 

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
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__5"
    // InternalMyDsl.g:1380:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalMyDsl.g:1385:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Button__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__6();

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
    // $ANTLR end "rule__Button__Group__5"


    // $ANTLR start "rule__Button__Group__5__Impl"
    // InternalMyDsl.g:1392:1: rule__Button__Group__5__Impl : ( ( rule__Button__HrefAssignment_5 ) ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( ( ( rule__Button__HrefAssignment_5 ) ) )
            // InternalMyDsl.g:1397:1: ( ( rule__Button__HrefAssignment_5 ) )
            {
            // InternalMyDsl.g:1397:1: ( ( rule__Button__HrefAssignment_5 ) )
            // InternalMyDsl.g:1398:2: ( rule__Button__HrefAssignment_5 )
            {
             before(grammarAccess.getButtonAccess().getHrefAssignment_5()); 
            // InternalMyDsl.g:1399:2: ( rule__Button__HrefAssignment_5 )
            // InternalMyDsl.g:1399:3: rule__Button__HrefAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Button__HrefAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getHrefAssignment_5()); 

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
    // $ANTLR end "rule__Button__Group__5__Impl"


    // $ANTLR start "rule__Button__Group__6"
    // InternalMyDsl.g:1407:1: rule__Button__Group__6 : rule__Button__Group__6__Impl ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( rule__Button__Group__6__Impl )
            // InternalMyDsl.g:1412:2: rule__Button__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__6__Impl();

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
    // $ANTLR end "rule__Button__Group__6"


    // $ANTLR start "rule__Button__Group__6__Impl"
    // InternalMyDsl.g:1418:1: rule__Button__Group__6__Impl : ( '}' ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( ( '}' ) )
            // InternalMyDsl.g:1423:1: ( '}' )
            {
            // InternalMyDsl.g:1423:1: ( '}' )
            // InternalMyDsl.g:1424:2: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Button__Group__6__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalMyDsl.g:1434:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMyDsl.g:1439:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

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
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalMyDsl.g:1446:1: rule__Selector__Group__0__Impl : ( 'selector' ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( ( 'selector' ) )
            // InternalMyDsl.g:1451:1: ( 'selector' )
            {
            // InternalMyDsl.g:1451:1: ( 'selector' )
            // InternalMyDsl.g:1452:2: 'selector'
            {
             before(grammarAccess.getSelectorAccess().getSelectorKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getSelectorKeyword_0()); 

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
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalMyDsl.g:1461:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMyDsl.g:1466:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Selector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__2();

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
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalMyDsl.g:1473:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__NameAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( ( rule__Selector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1478:1: ( ( rule__Selector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1478:1: ( ( rule__Selector__NameAssignment_1 ) )
            // InternalMyDsl.g:1479:2: ( rule__Selector__NameAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1480:2: ( rule__Selector__NameAssignment_1 )
            // InternalMyDsl.g:1480:3: rule__Selector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group__2"
    // InternalMyDsl.g:1488:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMyDsl.g:1493:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Selector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__3();

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
    // $ANTLR end "rule__Selector__Group__2"


    // $ANTLR start "rule__Selector__Group__2__Impl"
    // InternalMyDsl.g:1500:1: rule__Selector__Group__2__Impl : ( '{' ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( ( '{' ) )
            // InternalMyDsl.g:1505:1: ( '{' )
            {
            // InternalMyDsl.g:1505:1: ( '{' )
            // InternalMyDsl.g:1506:2: '{'
            {
             before(grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Selector__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__3"
    // InternalMyDsl.g:1515:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMyDsl.g:1520:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Selector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__4();

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
    // $ANTLR end "rule__Selector__Group__3"


    // $ANTLR start "rule__Selector__Group__3__Impl"
    // InternalMyDsl.g:1527:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__TitleAssignment_3 ) ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ( rule__Selector__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1532:1: ( ( rule__Selector__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1532:1: ( ( rule__Selector__TitleAssignment_3 ) )
            // InternalMyDsl.g:1533:2: ( rule__Selector__TitleAssignment_3 )
            {
             before(grammarAccess.getSelectorAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1534:2: ( rule__Selector__TitleAssignment_3 )
            // InternalMyDsl.g:1534:3: rule__Selector__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Selector__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Selector__Group__3__Impl"


    // $ANTLR start "rule__Selector__Group__4"
    // InternalMyDsl.g:1542:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalMyDsl.g:1547:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Selector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__5();

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
    // $ANTLR end "rule__Selector__Group__4"


    // $ANTLR start "rule__Selector__Group__4__Impl"
    // InternalMyDsl.g:1554:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )* ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( ( ( rule__Selector__Group_4__0 )* ) )
            // InternalMyDsl.g:1559:1: ( ( rule__Selector__Group_4__0 )* )
            {
            // InternalMyDsl.g:1559:1: ( ( rule__Selector__Group_4__0 )* )
            // InternalMyDsl.g:1560:2: ( rule__Selector__Group_4__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalMyDsl.g:1561:2: ( rule__Selector__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1561:3: rule__Selector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Selector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Selector__Group__4__Impl"


    // $ANTLR start "rule__Selector__Group__5"
    // InternalMyDsl.g:1569:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( rule__Selector__Group__5__Impl )
            // InternalMyDsl.g:1574:2: rule__Selector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__5__Impl();

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
    // $ANTLR end "rule__Selector__Group__5"


    // $ANTLR start "rule__Selector__Group__5__Impl"
    // InternalMyDsl.g:1580:1: rule__Selector__Group__5__Impl : ( '}' ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( ( '}' ) )
            // InternalMyDsl.g:1585:1: ( '}' )
            {
            // InternalMyDsl.g:1585:1: ( '}' )
            // InternalMyDsl.g:1586:2: '}'
            {
             before(grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Selector__Group__5__Impl"


    // $ANTLR start "rule__Selector__Group_4__0"
    // InternalMyDsl.g:1596:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalMyDsl.g:1601:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Selector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__1();

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
    // $ANTLR end "rule__Selector__Group_4__0"


    // $ANTLR start "rule__Selector__Group_4__0__Impl"
    // InternalMyDsl.g:1608:1: rule__Selector__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( ( 'option' ) )
            // InternalMyDsl.g:1613:1: ( 'option' )
            {
            // InternalMyDsl.g:1613:1: ( 'option' )
            // InternalMyDsl.g:1614:2: 'option'
            {
             before(grammarAccess.getSelectorAccess().getOptionKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getOptionKeyword_4_0()); 

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
    // $ANTLR end "rule__Selector__Group_4__0__Impl"


    // $ANTLR start "rule__Selector__Group_4__1"
    // InternalMyDsl.g:1623:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( rule__Selector__Group_4__1__Impl )
            // InternalMyDsl.g:1628:2: rule__Selector__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__1__Impl();

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
    // $ANTLR end "rule__Selector__Group_4__1"


    // $ANTLR start "rule__Selector__Group_4__1__Impl"
    // InternalMyDsl.g:1634:1: rule__Selector__Group_4__1__Impl : ( ( rule__Selector__OptionsAssignment_4_1 ) ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ( rule__Selector__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1639:1: ( ( rule__Selector__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1639:1: ( ( rule__Selector__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:1640:2: ( rule__Selector__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getSelectorAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:1641:2: ( rule__Selector__OptionsAssignment_4_1 )
            // InternalMyDsl.g:1641:3: rule__Selector__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Selector__Group_4__1__Impl"


    // $ANTLR start "rule__Footer__Group__0"
    // InternalMyDsl.g:1650:1: rule__Footer__Group__0 : rule__Footer__Group__0__Impl rule__Footer__Group__1 ;
    public final void rule__Footer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( rule__Footer__Group__0__Impl rule__Footer__Group__1 )
            // InternalMyDsl.g:1655:2: rule__Footer__Group__0__Impl rule__Footer__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Footer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Footer__Group__1();

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
    // $ANTLR end "rule__Footer__Group__0"


    // $ANTLR start "rule__Footer__Group__0__Impl"
    // InternalMyDsl.g:1662:1: rule__Footer__Group__0__Impl : ( 'footer' ) ;
    public final void rule__Footer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( ( 'footer' ) )
            // InternalMyDsl.g:1667:1: ( 'footer' )
            {
            // InternalMyDsl.g:1667:1: ( 'footer' )
            // InternalMyDsl.g:1668:2: 'footer'
            {
             before(grammarAccess.getFooterAccess().getFooterKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFooterAccess().getFooterKeyword_0()); 

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
    // $ANTLR end "rule__Footer__Group__0__Impl"


    // $ANTLR start "rule__Footer__Group__1"
    // InternalMyDsl.g:1677:1: rule__Footer__Group__1 : rule__Footer__Group__1__Impl rule__Footer__Group__2 ;
    public final void rule__Footer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( rule__Footer__Group__1__Impl rule__Footer__Group__2 )
            // InternalMyDsl.g:1682:2: rule__Footer__Group__1__Impl rule__Footer__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Footer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Footer__Group__2();

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
    // $ANTLR end "rule__Footer__Group__1"


    // $ANTLR start "rule__Footer__Group__1__Impl"
    // InternalMyDsl.g:1689:1: rule__Footer__Group__1__Impl : ( ( rule__Footer__NameAssignment_1 ) ) ;
    public final void rule__Footer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( ( ( rule__Footer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1694:1: ( ( rule__Footer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1694:1: ( ( rule__Footer__NameAssignment_1 ) )
            // InternalMyDsl.g:1695:2: ( rule__Footer__NameAssignment_1 )
            {
             before(grammarAccess.getFooterAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1696:2: ( rule__Footer__NameAssignment_1 )
            // InternalMyDsl.g:1696:3: rule__Footer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Footer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFooterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Footer__Group__1__Impl"


    // $ANTLR start "rule__Footer__Group__2"
    // InternalMyDsl.g:1704:1: rule__Footer__Group__2 : rule__Footer__Group__2__Impl rule__Footer__Group__3 ;
    public final void rule__Footer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( rule__Footer__Group__2__Impl rule__Footer__Group__3 )
            // InternalMyDsl.g:1709:2: rule__Footer__Group__2__Impl rule__Footer__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Footer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Footer__Group__3();

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
    // $ANTLR end "rule__Footer__Group__2"


    // $ANTLR start "rule__Footer__Group__2__Impl"
    // InternalMyDsl.g:1716:1: rule__Footer__Group__2__Impl : ( '{' ) ;
    public final void rule__Footer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( ( '{' ) )
            // InternalMyDsl.g:1721:1: ( '{' )
            {
            // InternalMyDsl.g:1721:1: ( '{' )
            // InternalMyDsl.g:1722:2: '{'
            {
             before(grammarAccess.getFooterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFooterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Footer__Group__2__Impl"


    // $ANTLR start "rule__Footer__Group__3"
    // InternalMyDsl.g:1731:1: rule__Footer__Group__3 : rule__Footer__Group__3__Impl rule__Footer__Group__4 ;
    public final void rule__Footer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( rule__Footer__Group__3__Impl rule__Footer__Group__4 )
            // InternalMyDsl.g:1736:2: rule__Footer__Group__3__Impl rule__Footer__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Footer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Footer__Group__4();

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
    // $ANTLR end "rule__Footer__Group__3"


    // $ANTLR start "rule__Footer__Group__3__Impl"
    // InternalMyDsl.g:1743:1: rule__Footer__Group__3__Impl : ( ( rule__Footer__DescriptionAssignment_3 ) ) ;
    public final void rule__Footer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( ( rule__Footer__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:1748:1: ( ( rule__Footer__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:1748:1: ( ( rule__Footer__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:1749:2: ( rule__Footer__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFooterAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:1750:2: ( rule__Footer__DescriptionAssignment_3 )
            // InternalMyDsl.g:1750:3: rule__Footer__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Footer__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFooterAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Footer__Group__3__Impl"


    // $ANTLR start "rule__Footer__Group__4"
    // InternalMyDsl.g:1758:1: rule__Footer__Group__4 : rule__Footer__Group__4__Impl rule__Footer__Group__5 ;
    public final void rule__Footer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( rule__Footer__Group__4__Impl rule__Footer__Group__5 )
            // InternalMyDsl.g:1763:2: rule__Footer__Group__4__Impl rule__Footer__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Footer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Footer__Group__5();

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
    // $ANTLR end "rule__Footer__Group__4"


    // $ANTLR start "rule__Footer__Group__4__Impl"
    // InternalMyDsl.g:1770:1: rule__Footer__Group__4__Impl : ( ( rule__Footer__LinksAssignment_4 )* ) ;
    public final void rule__Footer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( ( ( rule__Footer__LinksAssignment_4 )* ) )
            // InternalMyDsl.g:1775:1: ( ( rule__Footer__LinksAssignment_4 )* )
            {
            // InternalMyDsl.g:1775:1: ( ( rule__Footer__LinksAssignment_4 )* )
            // InternalMyDsl.g:1776:2: ( rule__Footer__LinksAssignment_4 )*
            {
             before(grammarAccess.getFooterAccess().getLinksAssignment_4()); 
            // InternalMyDsl.g:1777:2: ( rule__Footer__LinksAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1777:3: rule__Footer__LinksAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Footer__LinksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFooterAccess().getLinksAssignment_4()); 

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
    // $ANTLR end "rule__Footer__Group__4__Impl"


    // $ANTLR start "rule__Footer__Group__5"
    // InternalMyDsl.g:1785:1: rule__Footer__Group__5 : rule__Footer__Group__5__Impl ;
    public final void rule__Footer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( rule__Footer__Group__5__Impl )
            // InternalMyDsl.g:1790:2: rule__Footer__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Footer__Group__5__Impl();

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
    // $ANTLR end "rule__Footer__Group__5"


    // $ANTLR start "rule__Footer__Group__5__Impl"
    // InternalMyDsl.g:1796:1: rule__Footer__Group__5__Impl : ( '}' ) ;
    public final void rule__Footer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( ( '}' ) )
            // InternalMyDsl.g:1801:1: ( '}' )
            {
            // InternalMyDsl.g:1801:1: ( '}' )
            // InternalMyDsl.g:1802:2: '}'
            {
             before(grammarAccess.getFooterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFooterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Footer__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:1812:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:1817:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

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
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalMyDsl.g:1824:1: rule__Link__Group__0__Impl : ( 'link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( ( 'link' ) )
            // InternalMyDsl.g:1829:1: ( 'link' )
            {
            // InternalMyDsl.g:1829:1: ( 'link' )
            // InternalMyDsl.g:1830:2: 'link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

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
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalMyDsl.g:1839:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:1844:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

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
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalMyDsl.g:1851:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1856:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1856:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:1857:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1858:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:1858:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalMyDsl.g:1866:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:1871:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalMyDsl.g:1878:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( ( '{' ) )
            // InternalMyDsl.g:1883:1: ( '{' )
            {
            // InternalMyDsl.g:1883:1: ( '{' )
            // InternalMyDsl.g:1884:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalMyDsl.g:1893:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:1898:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

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
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalMyDsl.g:1905:1: rule__Link__Group__3__Impl : ( 'url' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( ( 'url' ) )
            // InternalMyDsl.g:1910:1: ( 'url' )
            {
            // InternalMyDsl.g:1910:1: ( 'url' )
            // InternalMyDsl.g:1911:2: 'url'
            {
             before(grammarAccess.getLinkAccess().getUrlKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlKeyword_3()); 

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
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalMyDsl.g:1920:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:1925:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

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
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalMyDsl.g:1932:1: rule__Link__Group__4__Impl : ( ( rule__Link__UrlAssignment_4 ) ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( ( ( rule__Link__UrlAssignment_4 ) ) )
            // InternalMyDsl.g:1937:1: ( ( rule__Link__UrlAssignment_4 ) )
            {
            // InternalMyDsl.g:1937:1: ( ( rule__Link__UrlAssignment_4 ) )
            // InternalMyDsl.g:1938:2: ( rule__Link__UrlAssignment_4 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_4()); 
            // InternalMyDsl.g:1939:2: ( rule__Link__UrlAssignment_4 )
            // InternalMyDsl.g:1939:3: rule__Link__UrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Link__UrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_4()); 

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
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalMyDsl.g:1947:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( rule__Link__Group__5__Impl )
            // InternalMyDsl.g:1952:2: rule__Link__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__5__Impl();

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
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalMyDsl.g:1958:1: rule__Link__Group__5__Impl : ( '}' ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( ( '}' ) )
            // InternalMyDsl.g:1963:1: ( '}' )
            {
            // InternalMyDsl.g:1963:1: ( '}' )
            // InternalMyDsl.g:1964:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group__0"
    // InternalMyDsl.g:1974:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1978:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalMyDsl.g:1979:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Menu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__1();

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
    // $ANTLR end "rule__Menu__Group__0"


    // $ANTLR start "rule__Menu__Group__0__Impl"
    // InternalMyDsl.g:1986:1: rule__Menu__Group__0__Impl : ( 'menu' ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( ( 'menu' ) )
            // InternalMyDsl.g:1991:1: ( 'menu' )
            {
            // InternalMyDsl.g:1991:1: ( 'menu' )
            // InternalMyDsl.g:1992:2: 'menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_0()); 

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
    // $ANTLR end "rule__Menu__Group__0__Impl"


    // $ANTLR start "rule__Menu__Group__1"
    // InternalMyDsl.g:2001:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalMyDsl.g:2006:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Menu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__2();

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
    // $ANTLR end "rule__Menu__Group__1"


    // $ANTLR start "rule__Menu__Group__1__Impl"
    // InternalMyDsl.g:2013:1: rule__Menu__Group__1__Impl : ( ( rule__Menu__NameAssignment_1 ) ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( ( ( rule__Menu__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2018:1: ( ( rule__Menu__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2018:1: ( ( rule__Menu__NameAssignment_1 ) )
            // InternalMyDsl.g:2019:2: ( rule__Menu__NameAssignment_1 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2020:2: ( rule__Menu__NameAssignment_1 )
            // InternalMyDsl.g:2020:3: rule__Menu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Menu__Group__1__Impl"


    // $ANTLR start "rule__Menu__Group__2"
    // InternalMyDsl.g:2028:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalMyDsl.g:2033:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Menu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__3();

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
    // $ANTLR end "rule__Menu__Group__2"


    // $ANTLR start "rule__Menu__Group__2__Impl"
    // InternalMyDsl.g:2040:1: rule__Menu__Group__2__Impl : ( '{' ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( ( '{' ) )
            // InternalMyDsl.g:2045:1: ( '{' )
            {
            // InternalMyDsl.g:2045:1: ( '{' )
            // InternalMyDsl.g:2046:2: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Menu__Group__2__Impl"


    // $ANTLR start "rule__Menu__Group__3"
    // InternalMyDsl.g:2055:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalMyDsl.g:2060:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Menu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__4();

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
    // $ANTLR end "rule__Menu__Group__3"


    // $ANTLR start "rule__Menu__Group__3__Impl"
    // InternalMyDsl.g:2067:1: rule__Menu__Group__3__Impl : ( ( rule__Menu__DescriptionAssignment_3 ) ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( ( ( rule__Menu__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:2072:1: ( ( rule__Menu__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:2072:1: ( ( rule__Menu__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:2073:2: ( rule__Menu__DescriptionAssignment_3 )
            {
             before(grammarAccess.getMenuAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:2074:2: ( rule__Menu__DescriptionAssignment_3 )
            // InternalMyDsl.g:2074:3: rule__Menu__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Menu__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Menu__Group__3__Impl"


    // $ANTLR start "rule__Menu__Group__4"
    // InternalMyDsl.g:2082:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalMyDsl.g:2087:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Menu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__5();

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
    // $ANTLR end "rule__Menu__Group__4"


    // $ANTLR start "rule__Menu__Group__4__Impl"
    // InternalMyDsl.g:2094:1: rule__Menu__Group__4__Impl : ( 'price' ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( ( 'price' ) )
            // InternalMyDsl.g:2099:1: ( 'price' )
            {
            // InternalMyDsl.g:2099:1: ( 'price' )
            // InternalMyDsl.g:2100:2: 'price'
            {
             before(grammarAccess.getMenuAccess().getPriceKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getPriceKeyword_4()); 

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
    // $ANTLR end "rule__Menu__Group__4__Impl"


    // $ANTLR start "rule__Menu__Group__5"
    // InternalMyDsl.g:2109:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl rule__Menu__Group__6 ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( rule__Menu__Group__5__Impl rule__Menu__Group__6 )
            // InternalMyDsl.g:2114:2: rule__Menu__Group__5__Impl rule__Menu__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Menu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__6();

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
    // $ANTLR end "rule__Menu__Group__5"


    // $ANTLR start "rule__Menu__Group__5__Impl"
    // InternalMyDsl.g:2121:1: rule__Menu__Group__5__Impl : ( ( rule__Menu__PriceAssignment_5 ) ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( ( ( rule__Menu__PriceAssignment_5 ) ) )
            // InternalMyDsl.g:2126:1: ( ( rule__Menu__PriceAssignment_5 ) )
            {
            // InternalMyDsl.g:2126:1: ( ( rule__Menu__PriceAssignment_5 ) )
            // InternalMyDsl.g:2127:2: ( rule__Menu__PriceAssignment_5 )
            {
             before(grammarAccess.getMenuAccess().getPriceAssignment_5()); 
            // InternalMyDsl.g:2128:2: ( rule__Menu__PriceAssignment_5 )
            // InternalMyDsl.g:2128:3: rule__Menu__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Menu__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getPriceAssignment_5()); 

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
    // $ANTLR end "rule__Menu__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group__6"
    // InternalMyDsl.g:2136:1: rule__Menu__Group__6 : rule__Menu__Group__6__Impl ;
    public final void rule__Menu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( rule__Menu__Group__6__Impl )
            // InternalMyDsl.g:2141:2: rule__Menu__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__6__Impl();

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
    // $ANTLR end "rule__Menu__Group__6"


    // $ANTLR start "rule__Menu__Group__6__Impl"
    // InternalMyDsl.g:2147:1: rule__Menu__Group__6__Impl : ( '}' ) ;
    public final void rule__Menu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( '}' ) )
            // InternalMyDsl.g:2152:1: ( '}' )
            {
            // InternalMyDsl.g:2152:1: ( '}' )
            // InternalMyDsl.g:2153:2: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Menu__Group__6__Impl"


    // $ANTLR start "rule__Mensamodel__HeaderAssignment_0"
    // InternalMyDsl.g:2163:1: rule__Mensamodel__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Mensamodel__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2167:1: ( ( ruleHeader ) )
            // InternalMyDsl.g:2168:2: ( ruleHeader )
            {
            // InternalMyDsl.g:2168:2: ( ruleHeader )
            // InternalMyDsl.g:2169:3: ruleHeader
            {
             before(grammarAccess.getMensamodelAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getHeaderHeaderParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Mensamodel__HeaderAssignment_0"


    // $ANTLR start "rule__Mensamodel__FooterAssignment_1"
    // InternalMyDsl.g:2178:1: rule__Mensamodel__FooterAssignment_1 : ( ruleFooter ) ;
    public final void rule__Mensamodel__FooterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( ruleFooter ) )
            // InternalMyDsl.g:2183:2: ( ruleFooter )
            {
            // InternalMyDsl.g:2183:2: ( ruleFooter )
            // InternalMyDsl.g:2184:3: ruleFooter
            {
             before(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFooter();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mensamodel__FooterAssignment_1"


    // $ANTLR start "rule__Mensamodel__SiderbarAssignment_2"
    // InternalMyDsl.g:2193:1: rule__Mensamodel__SiderbarAssignment_2 : ( ruleSiderbar ) ;
    public final void rule__Mensamodel__SiderbarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ruleSiderbar ) )
            // InternalMyDsl.g:2198:2: ( ruleSiderbar )
            {
            // InternalMyDsl.g:2198:2: ( ruleSiderbar )
            // InternalMyDsl.g:2199:3: ruleSiderbar
            {
             before(grammarAccess.getMensamodelAccess().getSiderbarSiderbarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSiderbar();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getSiderbarSiderbarParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Mensamodel__SiderbarAssignment_2"


    // $ANTLR start "rule__Mensamodel__MenusAssignment_3"
    // InternalMyDsl.g:2208:1: rule__Mensamodel__MenusAssignment_3 : ( ruleMenu ) ;
    public final void rule__Mensamodel__MenusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( ruleMenu ) )
            // InternalMyDsl.g:2213:2: ( ruleMenu )
            {
            // InternalMyDsl.g:2213:2: ( ruleMenu )
            // InternalMyDsl.g:2214:3: ruleMenu
            {
             before(grammarAccess.getMensamodelAccess().getMenusMenuParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getMenusMenuParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Mensamodel__MenusAssignment_3"


    // $ANTLR start "rule__Header__NameAssignment_1"
    // InternalMyDsl.g:2223:1: rule__Header__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Header__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2228:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2228:2: ( RULE_ID )
            // InternalMyDsl.g:2229:3: RULE_ID
            {
             before(grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Header__NameAssignment_1"


    // $ANTLR start "rule__Header__DescriptionAssignment_3"
    // InternalMyDsl.g:2238:1: rule__Header__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Header__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2243:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2243:2: ( ruleDescription )
            // InternalMyDsl.g:2244:3: ruleDescription
            {
             before(grammarAccess.getHeaderAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Header__DescriptionAssignment_3"


    // $ANTLR start "rule__Header__NavAssignment_4"
    // InternalMyDsl.g:2253:1: rule__Header__NavAssignment_4 : ( ruleNAV ) ;
    public final void rule__Header__NavAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ruleNAV ) )
            // InternalMyDsl.g:2258:2: ( ruleNAV )
            {
            // InternalMyDsl.g:2258:2: ( ruleNAV )
            // InternalMyDsl.g:2259:3: ruleNAV
            {
             before(grammarAccess.getHeaderAccess().getNavNAVParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNAV();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getNavNAVParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Header__NavAssignment_4"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalMyDsl.g:2268:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2273:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2273:2: ( RULE_STRING )
            // InternalMyDsl.g:2274:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Description__NameAssignment_1"


    // $ANTLR start "rule__NAV__NameAssignment_1"
    // InternalMyDsl.g:2283:1: rule__NAV__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NAV__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2288:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2288:2: ( RULE_ID )
            // InternalMyDsl.g:2289:3: RULE_ID
            {
             before(grammarAccess.getNAVAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NAV__NameAssignment_1"


    // $ANTLR start "rule__NAV__HrefAssignment_4"
    // InternalMyDsl.g:2298:1: rule__NAV__HrefAssignment_4 : ( RULE_STRING ) ;
    public final void rule__NAV__HrefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2303:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2303:2: ( RULE_STRING )
            // InternalMyDsl.g:2304:3: RULE_STRING
            {
             before(grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__NAV__HrefAssignment_4"


    // $ANTLR start "rule__Siderbar__NameAssignment_1"
    // InternalMyDsl.g:2313:1: rule__Siderbar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Siderbar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2318:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2318:2: ( RULE_ID )
            // InternalMyDsl.g:2319:3: RULE_ID
            {
             before(grammarAccess.getSiderbarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiderbarAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Siderbar__NameAssignment_1"


    // $ANTLR start "rule__Siderbar__DescriptionAssignment_3"
    // InternalMyDsl.g:2328:1: rule__Siderbar__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Siderbar__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2333:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2333:2: ( ruleDescription )
            // InternalMyDsl.g:2334:3: ruleDescription
            {
             before(grammarAccess.getSiderbarAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Siderbar__DescriptionAssignment_3"


    // $ANTLR start "rule__Siderbar__RadioAssignment_4"
    // InternalMyDsl.g:2343:1: rule__Siderbar__RadioAssignment_4 : ( ruleRadio ) ;
    public final void rule__Siderbar__RadioAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( ruleRadio ) )
            // InternalMyDsl.g:2348:2: ( ruleRadio )
            {
            // InternalMyDsl.g:2348:2: ( ruleRadio )
            // InternalMyDsl.g:2349:3: ruleRadio
            {
             before(grammarAccess.getSiderbarAccess().getRadioRadioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRadio();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getRadioRadioParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Siderbar__RadioAssignment_4"


    // $ANTLR start "rule__Siderbar__ButtonAssignment_5"
    // InternalMyDsl.g:2358:1: rule__Siderbar__ButtonAssignment_5 : ( ruleButton ) ;
    public final void rule__Siderbar__ButtonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( ( ruleButton ) )
            // InternalMyDsl.g:2363:2: ( ruleButton )
            {
            // InternalMyDsl.g:2363:2: ( ruleButton )
            // InternalMyDsl.g:2364:3: ruleButton
            {
             before(grammarAccess.getSiderbarAccess().getButtonButtonParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getButtonButtonParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Siderbar__ButtonAssignment_5"


    // $ANTLR start "rule__Siderbar__SelectorAssignment_6"
    // InternalMyDsl.g:2373:1: rule__Siderbar__SelectorAssignment_6 : ( ruleSelector ) ;
    public final void rule__Siderbar__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( ( ruleSelector ) )
            // InternalMyDsl.g:2378:2: ( ruleSelector )
            {
            // InternalMyDsl.g:2378:2: ( ruleSelector )
            // InternalMyDsl.g:2379:3: ruleSelector
            {
             before(grammarAccess.getSiderbarAccess().getSelectorSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getSelectorSelectorParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Siderbar__SelectorAssignment_6"


    // $ANTLR start "rule__Radio__NameAssignment_1"
    // InternalMyDsl.g:2388:1: rule__Radio__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Radio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2393:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2393:2: ( RULE_ID )
            // InternalMyDsl.g:2394:3: RULE_ID
            {
             before(grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Radio__NameAssignment_1"


    // $ANTLR start "rule__Radio__TitleAssignment_3"
    // InternalMyDsl.g:2403:1: rule__Radio__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Radio__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2408:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2408:2: ( ruleDescription )
            // InternalMyDsl.g:2409:3: ruleDescription
            {
             before(grammarAccess.getRadioAccess().getTitleDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getRadioAccess().getTitleDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Radio__TitleAssignment_3"


    // $ANTLR start "rule__Radio__OptionsAssignment_4_1"
    // InternalMyDsl.g:2418:1: rule__Radio__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Radio__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2422:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2423:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2423:2: ( RULE_STRING )
            // InternalMyDsl.g:2424:3: RULE_STRING
            {
             before(grammarAccess.getRadioAccess().getOptionsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getOptionsSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Radio__OptionsAssignment_4_1"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalMyDsl.g:2433:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2438:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2438:2: ( RULE_ID )
            // InternalMyDsl.g:2439:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__TitleAssignment_3"
    // InternalMyDsl.g:2448:1: rule__Button__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Button__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2453:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2453:2: ( ruleDescription )
            // InternalMyDsl.g:2454:3: ruleDescription
            {
             before(grammarAccess.getButtonAccess().getTitleDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getTitleDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Button__TitleAssignment_3"


    // $ANTLR start "rule__Button__HrefAssignment_5"
    // InternalMyDsl.g:2463:1: rule__Button__HrefAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Button__HrefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2468:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2468:2: ( RULE_STRING )
            // InternalMyDsl.g:2469:3: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getHrefSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getHrefSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Button__HrefAssignment_5"


    // $ANTLR start "rule__Selector__NameAssignment_1"
    // InternalMyDsl.g:2478:1: rule__Selector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2483:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2483:2: ( RULE_ID )
            // InternalMyDsl.g:2484:3: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Selector__NameAssignment_1"


    // $ANTLR start "rule__Selector__TitleAssignment_3"
    // InternalMyDsl.g:2493:1: rule__Selector__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Selector__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2498:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2498:2: ( ruleDescription )
            // InternalMyDsl.g:2499:3: ruleDescription
            {
             before(grammarAccess.getSelectorAccess().getTitleDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getTitleDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Selector__TitleAssignment_3"


    // $ANTLR start "rule__Selector__OptionsAssignment_4_1"
    // InternalMyDsl.g:2508:1: rule__Selector__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Selector__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2513:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2513:2: ( RULE_STRING )
            // InternalMyDsl.g:2514:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getOptionsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getOptionsSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Selector__OptionsAssignment_4_1"


    // $ANTLR start "rule__Footer__NameAssignment_1"
    // InternalMyDsl.g:2523:1: rule__Footer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Footer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2528:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2528:2: ( RULE_ID )
            // InternalMyDsl.g:2529:3: RULE_ID
            {
             before(grammarAccess.getFooterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFooterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Footer__NameAssignment_1"


    // $ANTLR start "rule__Footer__DescriptionAssignment_3"
    // InternalMyDsl.g:2538:1: rule__Footer__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Footer__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2543:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2543:2: ( ruleDescription )
            // InternalMyDsl.g:2544:3: ruleDescription
            {
             before(grammarAccess.getFooterAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFooterAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Footer__DescriptionAssignment_3"


    // $ANTLR start "rule__Footer__LinksAssignment_4"
    // InternalMyDsl.g:2553:1: rule__Footer__LinksAssignment_4 : ( ruleLink ) ;
    public final void rule__Footer__LinksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2557:1: ( ( ruleLink ) )
            // InternalMyDsl.g:2558:2: ( ruleLink )
            {
            // InternalMyDsl.g:2558:2: ( ruleLink )
            // InternalMyDsl.g:2559:3: ruleLink
            {
             before(grammarAccess.getFooterAccess().getLinksLinkParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getFooterAccess().getLinksLinkParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Footer__LinksAssignment_4"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalMyDsl.g:2568:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2573:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2573:2: ( RULE_ID )
            // InternalMyDsl.g:2574:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__UrlAssignment_4"
    // InternalMyDsl.g:2583:1: rule__Link__UrlAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Link__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2588:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2588:2: ( RULE_STRING )
            // InternalMyDsl.g:2589:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Link__UrlAssignment_4"


    // $ANTLR start "rule__Menu__NameAssignment_1"
    // InternalMyDsl.g:2598:1: rule__Menu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Menu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2603:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2603:2: ( RULE_ID )
            // InternalMyDsl.g:2604:3: RULE_ID
            {
             before(grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Menu__NameAssignment_1"


    // $ANTLR start "rule__Menu__DescriptionAssignment_3"
    // InternalMyDsl.g:2613:1: rule__Menu__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Menu__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2618:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2618:2: ( ruleDescription )
            // InternalMyDsl.g:2619:3: ruleDescription
            {
             before(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Menu__DescriptionAssignment_3"


    // $ANTLR start "rule__Menu__PriceAssignment_5"
    // InternalMyDsl.g:2628:1: rule__Menu__PriceAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Menu__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2633:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2633:2: ( RULE_STRING )
            // InternalMyDsl.g:2634:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Menu__PriceAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000342000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});

}