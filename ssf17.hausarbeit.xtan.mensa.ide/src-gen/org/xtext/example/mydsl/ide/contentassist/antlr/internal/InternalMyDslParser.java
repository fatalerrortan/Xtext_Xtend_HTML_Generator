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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'header'", "'{'", "'}'", "'siderbar'", "'footer'", "'description'", "'nav'", "'href'", "'radio'", "'option'", "'checkbox'", "'button'", "'selector'", "'link'", "'url'", "'menu'", "'name'", "'price'", "'image'"
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


    // $ANTLR start "entryRuleSiderbar"
    // InternalMyDsl.g:103:1: entryRuleSiderbar : ruleSiderbar EOF ;
    public final void entryRuleSiderbar() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSiderbar EOF )
            // InternalMyDsl.g:105:1: ruleSiderbar EOF
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
    // InternalMyDsl.g:112:1: ruleSiderbar : ( ( rule__Siderbar__Group__0 ) ) ;
    public final void ruleSiderbar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Siderbar__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Siderbar__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Siderbar__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Siderbar__Group__0 )
            {
             before(grammarAccess.getSiderbarAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Siderbar__Group__0 )
            // InternalMyDsl.g:119:4: rule__Siderbar__Group__0
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


    // $ANTLR start "entryRuleFooter"
    // InternalMyDsl.g:128:1: entryRuleFooter : ruleFooter EOF ;
    public final void entryRuleFooter() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleFooter EOF )
            // InternalMyDsl.g:130:1: ruleFooter EOF
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
    // InternalMyDsl.g:137:1: ruleFooter : ( ( rule__Footer__Group__0 ) ) ;
    public final void ruleFooter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Footer__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Footer__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Footer__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Footer__Group__0 )
            {
             before(grammarAccess.getFooterAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Footer__Group__0 )
            // InternalMyDsl.g:144:4: rule__Footer__Group__0
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


    // $ANTLR start "entryRuleDescription"
    // InternalMyDsl.g:153:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleDescription EOF )
            // InternalMyDsl.g:155:1: ruleDescription EOF
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
    // InternalMyDsl.g:162:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Description__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Description__Group__0 )
            // InternalMyDsl.g:169:4: rule__Description__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleNAV : ruleNAV EOF ;
    public final void entryRuleNAV() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleNAV EOF )
            // InternalMyDsl.g:180:1: ruleNAV EOF
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
    // InternalMyDsl.g:187:1: ruleNAV : ( ( rule__NAV__Group__0 ) ) ;
    public final void ruleNAV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__NAV__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__NAV__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__NAV__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__NAV__Group__0 )
            {
             before(grammarAccess.getNAVAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__NAV__Group__0 )
            // InternalMyDsl.g:194:4: rule__NAV__Group__0
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


    // $ANTLR start "entryRuleRadio"
    // InternalMyDsl.g:203:1: entryRuleRadio : ruleRadio EOF ;
    public final void entryRuleRadio() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRadio EOF )
            // InternalMyDsl.g:205:1: ruleRadio EOF
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
    // InternalMyDsl.g:212:1: ruleRadio : ( ( rule__Radio__Group__0 ) ) ;
    public final void ruleRadio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Radio__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Radio__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Radio__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Radio__Group__0 )
            {
             before(grammarAccess.getRadioAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Radio__Group__0 )
            // InternalMyDsl.g:219:4: rule__Radio__Group__0
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


    // $ANTLR start "entryRuleCheckbox"
    // InternalMyDsl.g:228:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCheckbox EOF )
            // InternalMyDsl.g:230:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
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
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalMyDsl.g:237:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Checkbox__Group__0 )
            // InternalMyDsl.g:244:4: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

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
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:253:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleButton EOF )
            // InternalMyDsl.g:255:1: ruleButton EOF
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
    // InternalMyDsl.g:262:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:269:4: rule__Button__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleSelector EOF )
            // InternalMyDsl.g:280:1: ruleSelector EOF
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
    // InternalMyDsl.g:287:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Selector__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Selector__Group__0 )
            // InternalMyDsl.g:294:4: rule__Selector__Group__0
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


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:303:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleLink EOF )
            // InternalMyDsl.g:305:1: ruleLink EOF
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
    // InternalMyDsl.g:312:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:319:4: rule__Link__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleMenu EOF )
            // InternalMyDsl.g:330:1: ruleMenu EOF
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
    // InternalMyDsl.g:337:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Menu__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Menu__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Menu__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Menu__Group__0 )
            // InternalMyDsl.g:344:4: rule__Menu__Group__0
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
    // InternalMyDsl.g:352:1: rule__Mensamodel__Group__0 : rule__Mensamodel__Group__0__Impl rule__Mensamodel__Group__1 ;
    public final void rule__Mensamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( rule__Mensamodel__Group__0__Impl rule__Mensamodel__Group__1 )
            // InternalMyDsl.g:357:2: rule__Mensamodel__Group__0__Impl rule__Mensamodel__Group__1
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
    // InternalMyDsl.g:364:1: rule__Mensamodel__Group__0__Impl : ( ( rule__Mensamodel__HeaderAssignment_0 ) ) ;
    public final void rule__Mensamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( ( ( rule__Mensamodel__HeaderAssignment_0 ) ) )
            // InternalMyDsl.g:369:1: ( ( rule__Mensamodel__HeaderAssignment_0 ) )
            {
            // InternalMyDsl.g:369:1: ( ( rule__Mensamodel__HeaderAssignment_0 ) )
            // InternalMyDsl.g:370:2: ( rule__Mensamodel__HeaderAssignment_0 )
            {
             before(grammarAccess.getMensamodelAccess().getHeaderAssignment_0()); 
            // InternalMyDsl.g:371:2: ( rule__Mensamodel__HeaderAssignment_0 )
            // InternalMyDsl.g:371:3: rule__Mensamodel__HeaderAssignment_0
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
    // InternalMyDsl.g:379:1: rule__Mensamodel__Group__1 : rule__Mensamodel__Group__1__Impl rule__Mensamodel__Group__2 ;
    public final void rule__Mensamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( rule__Mensamodel__Group__1__Impl rule__Mensamodel__Group__2 )
            // InternalMyDsl.g:384:2: rule__Mensamodel__Group__1__Impl rule__Mensamodel__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:391:1: rule__Mensamodel__Group__1__Impl : ( ( rule__Mensamodel__SiderbarAssignment_1 )? ) ;
    public final void rule__Mensamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ( rule__Mensamodel__SiderbarAssignment_1 )? ) )
            // InternalMyDsl.g:396:1: ( ( rule__Mensamodel__SiderbarAssignment_1 )? )
            {
            // InternalMyDsl.g:396:1: ( ( rule__Mensamodel__SiderbarAssignment_1 )? )
            // InternalMyDsl.g:397:2: ( rule__Mensamodel__SiderbarAssignment_1 )?
            {
             before(grammarAccess.getMensamodelAccess().getSiderbarAssignment_1()); 
            // InternalMyDsl.g:398:2: ( rule__Mensamodel__SiderbarAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:398:3: rule__Mensamodel__SiderbarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mensamodel__SiderbarAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMensamodelAccess().getSiderbarAssignment_1()); 

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
    // InternalMyDsl.g:406:1: rule__Mensamodel__Group__2 : rule__Mensamodel__Group__2__Impl rule__Mensamodel__Group__3 ;
    public final void rule__Mensamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( rule__Mensamodel__Group__2__Impl rule__Mensamodel__Group__3 )
            // InternalMyDsl.g:411:2: rule__Mensamodel__Group__2__Impl rule__Mensamodel__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:418:1: rule__Mensamodel__Group__2__Impl : ( ( rule__Mensamodel__FooterAssignment_2 ) ) ;
    public final void rule__Mensamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( ( rule__Mensamodel__FooterAssignment_2 ) ) )
            // InternalMyDsl.g:423:1: ( ( rule__Mensamodel__FooterAssignment_2 ) )
            {
            // InternalMyDsl.g:423:1: ( ( rule__Mensamodel__FooterAssignment_2 ) )
            // InternalMyDsl.g:424:2: ( rule__Mensamodel__FooterAssignment_2 )
            {
             before(grammarAccess.getMensamodelAccess().getFooterAssignment_2()); 
            // InternalMyDsl.g:425:2: ( rule__Mensamodel__FooterAssignment_2 )
            // InternalMyDsl.g:425:3: rule__Mensamodel__FooterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mensamodel__FooterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getFooterAssignment_2()); 

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
    // InternalMyDsl.g:433:1: rule__Mensamodel__Group__3 : rule__Mensamodel__Group__3__Impl ;
    public final void rule__Mensamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( rule__Mensamodel__Group__3__Impl )
            // InternalMyDsl.g:438:2: rule__Mensamodel__Group__3__Impl
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
    // InternalMyDsl.g:444:1: rule__Mensamodel__Group__3__Impl : ( ( rule__Mensamodel__MenusAssignment_3 )* ) ;
    public final void rule__Mensamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( ( rule__Mensamodel__MenusAssignment_3 )* ) )
            // InternalMyDsl.g:449:1: ( ( rule__Mensamodel__MenusAssignment_3 )* )
            {
            // InternalMyDsl.g:449:1: ( ( rule__Mensamodel__MenusAssignment_3 )* )
            // InternalMyDsl.g:450:2: ( rule__Mensamodel__MenusAssignment_3 )*
            {
             before(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 
            // InternalMyDsl.g:451:2: ( rule__Mensamodel__MenusAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:451:3: rule__Mensamodel__MenusAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Mensamodel__MenusAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalMyDsl.g:460:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMyDsl.g:465:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:472:1: rule__Header__Group__0__Impl : ( 'header' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( 'header' ) )
            // InternalMyDsl.g:477:1: ( 'header' )
            {
            // InternalMyDsl.g:477:1: ( 'header' )
            // InternalMyDsl.g:478:2: 'header'
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
    // InternalMyDsl.g:487:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMyDsl.g:492:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:499:1: rule__Header__Group__1__Impl : ( ( rule__Header__NameAssignment_1 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( ( ( rule__Header__NameAssignment_1 ) ) )
            // InternalMyDsl.g:504:1: ( ( rule__Header__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:504:1: ( ( rule__Header__NameAssignment_1 ) )
            // InternalMyDsl.g:505:2: ( rule__Header__NameAssignment_1 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:506:2: ( rule__Header__NameAssignment_1 )
            // InternalMyDsl.g:506:3: rule__Header__NameAssignment_1
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
    // InternalMyDsl.g:514:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalMyDsl.g:519:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:526:1: rule__Header__Group__2__Impl : ( '{' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( '{' ) )
            // InternalMyDsl.g:531:1: ( '{' )
            {
            // InternalMyDsl.g:531:1: ( '{' )
            // InternalMyDsl.g:532:2: '{'
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
    // InternalMyDsl.g:541:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalMyDsl.g:546:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:553:1: rule__Header__Group__3__Impl : ( ( rule__Header__DescriptionAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( ( rule__Header__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:558:1: ( ( rule__Header__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:558:1: ( ( rule__Header__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:559:2: ( rule__Header__DescriptionAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:560:2: ( rule__Header__DescriptionAssignment_3 )
            // InternalMyDsl.g:560:3: rule__Header__DescriptionAssignment_3
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
    // InternalMyDsl.g:568:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // InternalMyDsl.g:573:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:580:1: rule__Header__Group__4__Impl : ( ( rule__Header__NavAssignment_4 )* ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( ( rule__Header__NavAssignment_4 )* ) )
            // InternalMyDsl.g:585:1: ( ( rule__Header__NavAssignment_4 )* )
            {
            // InternalMyDsl.g:585:1: ( ( rule__Header__NavAssignment_4 )* )
            // InternalMyDsl.g:586:2: ( rule__Header__NavAssignment_4 )*
            {
             before(grammarAccess.getHeaderAccess().getNavAssignment_4()); 
            // InternalMyDsl.g:587:2: ( rule__Header__NavAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:587:3: rule__Header__NavAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Header__NavAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalMyDsl.g:595:1: rule__Header__Group__5 : rule__Header__Group__5__Impl ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__Header__Group__5__Impl )
            // InternalMyDsl.g:600:2: rule__Header__Group__5__Impl
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
    // InternalMyDsl.g:606:1: rule__Header__Group__5__Impl : ( '}' ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( '}' ) )
            // InternalMyDsl.g:611:1: ( '}' )
            {
            // InternalMyDsl.g:611:1: ( '}' )
            // InternalMyDsl.g:612:2: '}'
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


    // $ANTLR start "rule__Siderbar__Group__0"
    // InternalMyDsl.g:622:1: rule__Siderbar__Group__0 : rule__Siderbar__Group__0__Impl rule__Siderbar__Group__1 ;
    public final void rule__Siderbar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__Siderbar__Group__0__Impl rule__Siderbar__Group__1 )
            // InternalMyDsl.g:627:2: rule__Siderbar__Group__0__Impl rule__Siderbar__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:634:1: rule__Siderbar__Group__0__Impl : ( 'siderbar' ) ;
    public final void rule__Siderbar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( ( 'siderbar' ) )
            // InternalMyDsl.g:639:1: ( 'siderbar' )
            {
            // InternalMyDsl.g:639:1: ( 'siderbar' )
            // InternalMyDsl.g:640:2: 'siderbar'
            {
             before(grammarAccess.getSiderbarAccess().getSiderbarKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:649:1: rule__Siderbar__Group__1 : rule__Siderbar__Group__1__Impl rule__Siderbar__Group__2 ;
    public final void rule__Siderbar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__Siderbar__Group__1__Impl rule__Siderbar__Group__2 )
            // InternalMyDsl.g:654:2: rule__Siderbar__Group__1__Impl rule__Siderbar__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:661:1: rule__Siderbar__Group__1__Impl : ( ( rule__Siderbar__NameAssignment_1 ) ) ;
    public final void rule__Siderbar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( ( rule__Siderbar__NameAssignment_1 ) ) )
            // InternalMyDsl.g:666:1: ( ( rule__Siderbar__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:666:1: ( ( rule__Siderbar__NameAssignment_1 ) )
            // InternalMyDsl.g:667:2: ( rule__Siderbar__NameAssignment_1 )
            {
             before(grammarAccess.getSiderbarAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:668:2: ( rule__Siderbar__NameAssignment_1 )
            // InternalMyDsl.g:668:3: rule__Siderbar__NameAssignment_1
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
    // InternalMyDsl.g:676:1: rule__Siderbar__Group__2 : rule__Siderbar__Group__2__Impl rule__Siderbar__Group__3 ;
    public final void rule__Siderbar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__Siderbar__Group__2__Impl rule__Siderbar__Group__3 )
            // InternalMyDsl.g:681:2: rule__Siderbar__Group__2__Impl rule__Siderbar__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:688:1: rule__Siderbar__Group__2__Impl : ( '{' ) ;
    public final void rule__Siderbar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( '{' ) )
            // InternalMyDsl.g:693:1: ( '{' )
            {
            // InternalMyDsl.g:693:1: ( '{' )
            // InternalMyDsl.g:694:2: '{'
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
    // InternalMyDsl.g:703:1: rule__Siderbar__Group__3 : rule__Siderbar__Group__3__Impl rule__Siderbar__Group__4 ;
    public final void rule__Siderbar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Siderbar__Group__3__Impl rule__Siderbar__Group__4 )
            // InternalMyDsl.g:708:2: rule__Siderbar__Group__3__Impl rule__Siderbar__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:715:1: rule__Siderbar__Group__3__Impl : ( ( rule__Siderbar__DescriptionAssignment_3 ) ) ;
    public final void rule__Siderbar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ( rule__Siderbar__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:720:1: ( ( rule__Siderbar__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:720:1: ( ( rule__Siderbar__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:721:2: ( rule__Siderbar__DescriptionAssignment_3 )
            {
             before(grammarAccess.getSiderbarAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:722:2: ( rule__Siderbar__DescriptionAssignment_3 )
            // InternalMyDsl.g:722:3: rule__Siderbar__DescriptionAssignment_3
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
    // InternalMyDsl.g:730:1: rule__Siderbar__Group__4 : rule__Siderbar__Group__4__Impl rule__Siderbar__Group__5 ;
    public final void rule__Siderbar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Siderbar__Group__4__Impl rule__Siderbar__Group__5 )
            // InternalMyDsl.g:735:2: rule__Siderbar__Group__4__Impl rule__Siderbar__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:742:1: rule__Siderbar__Group__4__Impl : ( ( rule__Siderbar__RadioAssignment_4 )* ) ;
    public final void rule__Siderbar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( ( ( rule__Siderbar__RadioAssignment_4 )* ) )
            // InternalMyDsl.g:747:1: ( ( rule__Siderbar__RadioAssignment_4 )* )
            {
            // InternalMyDsl.g:747:1: ( ( rule__Siderbar__RadioAssignment_4 )* )
            // InternalMyDsl.g:748:2: ( rule__Siderbar__RadioAssignment_4 )*
            {
             before(grammarAccess.getSiderbarAccess().getRadioAssignment_4()); 
            // InternalMyDsl.g:749:2: ( rule__Siderbar__RadioAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:749:3: rule__Siderbar__RadioAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Siderbar__RadioAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyDsl.g:757:1: rule__Siderbar__Group__5 : rule__Siderbar__Group__5__Impl rule__Siderbar__Group__6 ;
    public final void rule__Siderbar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__Siderbar__Group__5__Impl rule__Siderbar__Group__6 )
            // InternalMyDsl.g:762:2: rule__Siderbar__Group__5__Impl rule__Siderbar__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:769:1: rule__Siderbar__Group__5__Impl : ( ( rule__Siderbar__CheckboxAssignment_5 )* ) ;
    public final void rule__Siderbar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( ( rule__Siderbar__CheckboxAssignment_5 )* ) )
            // InternalMyDsl.g:774:1: ( ( rule__Siderbar__CheckboxAssignment_5 )* )
            {
            // InternalMyDsl.g:774:1: ( ( rule__Siderbar__CheckboxAssignment_5 )* )
            // InternalMyDsl.g:775:2: ( rule__Siderbar__CheckboxAssignment_5 )*
            {
             before(grammarAccess.getSiderbarAccess().getCheckboxAssignment_5()); 
            // InternalMyDsl.g:776:2: ( rule__Siderbar__CheckboxAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:776:3: rule__Siderbar__CheckboxAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Siderbar__CheckboxAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSiderbarAccess().getCheckboxAssignment_5()); 

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
    // InternalMyDsl.g:784:1: rule__Siderbar__Group__6 : rule__Siderbar__Group__6__Impl rule__Siderbar__Group__7 ;
    public final void rule__Siderbar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__Siderbar__Group__6__Impl rule__Siderbar__Group__7 )
            // InternalMyDsl.g:789:2: rule__Siderbar__Group__6__Impl rule__Siderbar__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:796:1: rule__Siderbar__Group__6__Impl : ( ( rule__Siderbar__ButtonAssignment_6 )* ) ;
    public final void rule__Siderbar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ( rule__Siderbar__ButtonAssignment_6 )* ) )
            // InternalMyDsl.g:801:1: ( ( rule__Siderbar__ButtonAssignment_6 )* )
            {
            // InternalMyDsl.g:801:1: ( ( rule__Siderbar__ButtonAssignment_6 )* )
            // InternalMyDsl.g:802:2: ( rule__Siderbar__ButtonAssignment_6 )*
            {
             before(grammarAccess.getSiderbarAccess().getButtonAssignment_6()); 
            // InternalMyDsl.g:803:2: ( rule__Siderbar__ButtonAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:803:3: rule__Siderbar__ButtonAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Siderbar__ButtonAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSiderbarAccess().getButtonAssignment_6()); 

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
    // InternalMyDsl.g:811:1: rule__Siderbar__Group__7 : rule__Siderbar__Group__7__Impl rule__Siderbar__Group__8 ;
    public final void rule__Siderbar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__Siderbar__Group__7__Impl rule__Siderbar__Group__8 )
            // InternalMyDsl.g:816:2: rule__Siderbar__Group__7__Impl rule__Siderbar__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Siderbar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__8();

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
    // InternalMyDsl.g:823:1: rule__Siderbar__Group__7__Impl : ( ( rule__Siderbar__SelectorAssignment_7 )* ) ;
    public final void rule__Siderbar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( ( rule__Siderbar__SelectorAssignment_7 )* ) )
            // InternalMyDsl.g:828:1: ( ( rule__Siderbar__SelectorAssignment_7 )* )
            {
            // InternalMyDsl.g:828:1: ( ( rule__Siderbar__SelectorAssignment_7 )* )
            // InternalMyDsl.g:829:2: ( rule__Siderbar__SelectorAssignment_7 )*
            {
             before(grammarAccess.getSiderbarAccess().getSelectorAssignment_7()); 
            // InternalMyDsl.g:830:2: ( rule__Siderbar__SelectorAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:830:3: rule__Siderbar__SelectorAssignment_7
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Siderbar__SelectorAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSiderbarAccess().getSelectorAssignment_7()); 

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


    // $ANTLR start "rule__Siderbar__Group__8"
    // InternalMyDsl.g:838:1: rule__Siderbar__Group__8 : rule__Siderbar__Group__8__Impl ;
    public final void rule__Siderbar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__Siderbar__Group__8__Impl )
            // InternalMyDsl.g:843:2: rule__Siderbar__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Siderbar__Group__8__Impl();

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
    // $ANTLR end "rule__Siderbar__Group__8"


    // $ANTLR start "rule__Siderbar__Group__8__Impl"
    // InternalMyDsl.g:849:1: rule__Siderbar__Group__8__Impl : ( '}' ) ;
    public final void rule__Siderbar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( '}' ) )
            // InternalMyDsl.g:854:1: ( '}' )
            {
            // InternalMyDsl.g:854:1: ( '}' )
            // InternalMyDsl.g:855:2: '}'
            {
             before(grammarAccess.getSiderbarAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSiderbarAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Siderbar__Group__8__Impl"


    // $ANTLR start "rule__Footer__Group__0"
    // InternalMyDsl.g:865:1: rule__Footer__Group__0 : rule__Footer__Group__0__Impl rule__Footer__Group__1 ;
    public final void rule__Footer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__Footer__Group__0__Impl rule__Footer__Group__1 )
            // InternalMyDsl.g:870:2: rule__Footer__Group__0__Impl rule__Footer__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:877:1: rule__Footer__Group__0__Impl : ( 'footer' ) ;
    public final void rule__Footer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( 'footer' ) )
            // InternalMyDsl.g:882:1: ( 'footer' )
            {
            // InternalMyDsl.g:882:1: ( 'footer' )
            // InternalMyDsl.g:883:2: 'footer'
            {
             before(grammarAccess.getFooterAccess().getFooterKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:892:1: rule__Footer__Group__1 : rule__Footer__Group__1__Impl rule__Footer__Group__2 ;
    public final void rule__Footer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__Footer__Group__1__Impl rule__Footer__Group__2 )
            // InternalMyDsl.g:897:2: rule__Footer__Group__1__Impl rule__Footer__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:904:1: rule__Footer__Group__1__Impl : ( ( rule__Footer__NameAssignment_1 ) ) ;
    public final void rule__Footer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( ( rule__Footer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:909:1: ( ( rule__Footer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:909:1: ( ( rule__Footer__NameAssignment_1 ) )
            // InternalMyDsl.g:910:2: ( rule__Footer__NameAssignment_1 )
            {
             before(grammarAccess.getFooterAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:911:2: ( rule__Footer__NameAssignment_1 )
            // InternalMyDsl.g:911:3: rule__Footer__NameAssignment_1
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
    // InternalMyDsl.g:919:1: rule__Footer__Group__2 : rule__Footer__Group__2__Impl rule__Footer__Group__3 ;
    public final void rule__Footer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__Footer__Group__2__Impl rule__Footer__Group__3 )
            // InternalMyDsl.g:924:2: rule__Footer__Group__2__Impl rule__Footer__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:931:1: rule__Footer__Group__2__Impl : ( '{' ) ;
    public final void rule__Footer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( '{' ) )
            // InternalMyDsl.g:936:1: ( '{' )
            {
            // InternalMyDsl.g:936:1: ( '{' )
            // InternalMyDsl.g:937:2: '{'
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
    // InternalMyDsl.g:946:1: rule__Footer__Group__3 : rule__Footer__Group__3__Impl rule__Footer__Group__4 ;
    public final void rule__Footer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__Footer__Group__3__Impl rule__Footer__Group__4 )
            // InternalMyDsl.g:951:2: rule__Footer__Group__3__Impl rule__Footer__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:958:1: rule__Footer__Group__3__Impl : ( ( rule__Footer__DescriptionAssignment_3 ) ) ;
    public final void rule__Footer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( ( rule__Footer__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:963:1: ( ( rule__Footer__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:963:1: ( ( rule__Footer__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:964:2: ( rule__Footer__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFooterAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:965:2: ( rule__Footer__DescriptionAssignment_3 )
            // InternalMyDsl.g:965:3: rule__Footer__DescriptionAssignment_3
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
    // InternalMyDsl.g:973:1: rule__Footer__Group__4 : rule__Footer__Group__4__Impl rule__Footer__Group__5 ;
    public final void rule__Footer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__Footer__Group__4__Impl rule__Footer__Group__5 )
            // InternalMyDsl.g:978:2: rule__Footer__Group__4__Impl rule__Footer__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:985:1: rule__Footer__Group__4__Impl : ( ( rule__Footer__LinksAssignment_4 )* ) ;
    public final void rule__Footer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ( rule__Footer__LinksAssignment_4 )* ) )
            // InternalMyDsl.g:990:1: ( ( rule__Footer__LinksAssignment_4 )* )
            {
            // InternalMyDsl.g:990:1: ( ( rule__Footer__LinksAssignment_4 )* )
            // InternalMyDsl.g:991:2: ( rule__Footer__LinksAssignment_4 )*
            {
             before(grammarAccess.getFooterAccess().getLinksAssignment_4()); 
            // InternalMyDsl.g:992:2: ( rule__Footer__LinksAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:992:3: rule__Footer__LinksAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1000:1: rule__Footer__Group__5 : rule__Footer__Group__5__Impl ;
    public final void rule__Footer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__Footer__Group__5__Impl )
            // InternalMyDsl.g:1005:2: rule__Footer__Group__5__Impl
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
    // InternalMyDsl.g:1011:1: rule__Footer__Group__5__Impl : ( '}' ) ;
    public final void rule__Footer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( '}' ) )
            // InternalMyDsl.g:1016:1: ( '}' )
            {
            // InternalMyDsl.g:1016:1: ( '}' )
            // InternalMyDsl.g:1017:2: '}'
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalMyDsl.g:1027:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalMyDsl.g:1032:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1039:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( ( 'description' ) )
            // InternalMyDsl.g:1044:1: ( 'description' )
            {
            // InternalMyDsl.g:1044:1: ( 'description' )
            // InternalMyDsl.g:1045:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1054:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Description__Group__1__Impl )
            // InternalMyDsl.g:1059:2: rule__Description__Group__1__Impl
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
    // InternalMyDsl.g:1065:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1070:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1070:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalMyDsl.g:1071:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1072:2: ( rule__Description__NameAssignment_1 )
            // InternalMyDsl.g:1072:3: rule__Description__NameAssignment_1
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
    // InternalMyDsl.g:1081:1: rule__NAV__Group__0 : rule__NAV__Group__0__Impl rule__NAV__Group__1 ;
    public final void rule__NAV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__NAV__Group__0__Impl rule__NAV__Group__1 )
            // InternalMyDsl.g:1086:2: rule__NAV__Group__0__Impl rule__NAV__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1093:1: rule__NAV__Group__0__Impl : ( 'nav' ) ;
    public final void rule__NAV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( 'nav' ) )
            // InternalMyDsl.g:1098:1: ( 'nav' )
            {
            // InternalMyDsl.g:1098:1: ( 'nav' )
            // InternalMyDsl.g:1099:2: 'nav'
            {
             before(grammarAccess.getNAVAccess().getNavKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1108:1: rule__NAV__Group__1 : rule__NAV__Group__1__Impl rule__NAV__Group__2 ;
    public final void rule__NAV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__NAV__Group__1__Impl rule__NAV__Group__2 )
            // InternalMyDsl.g:1113:2: rule__NAV__Group__1__Impl rule__NAV__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1120:1: rule__NAV__Group__1__Impl : ( ( rule__NAV__NameAssignment_1 ) ) ;
    public final void rule__NAV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( ( rule__NAV__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1125:1: ( ( rule__NAV__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1125:1: ( ( rule__NAV__NameAssignment_1 ) )
            // InternalMyDsl.g:1126:2: ( rule__NAV__NameAssignment_1 )
            {
             before(grammarAccess.getNAVAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1127:2: ( rule__NAV__NameAssignment_1 )
            // InternalMyDsl.g:1127:3: rule__NAV__NameAssignment_1
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
    // InternalMyDsl.g:1135:1: rule__NAV__Group__2 : rule__NAV__Group__2__Impl rule__NAV__Group__3 ;
    public final void rule__NAV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__NAV__Group__2__Impl rule__NAV__Group__3 )
            // InternalMyDsl.g:1140:2: rule__NAV__Group__2__Impl rule__NAV__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1147:1: rule__NAV__Group__2__Impl : ( '{' ) ;
    public final void rule__NAV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( '{' ) )
            // InternalMyDsl.g:1152:1: ( '{' )
            {
            // InternalMyDsl.g:1152:1: ( '{' )
            // InternalMyDsl.g:1153:2: '{'
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
    // InternalMyDsl.g:1162:1: rule__NAV__Group__3 : rule__NAV__Group__3__Impl rule__NAV__Group__4 ;
    public final void rule__NAV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__NAV__Group__3__Impl rule__NAV__Group__4 )
            // InternalMyDsl.g:1167:2: rule__NAV__Group__3__Impl rule__NAV__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1174:1: rule__NAV__Group__3__Impl : ( 'href' ) ;
    public final void rule__NAV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( 'href' ) )
            // InternalMyDsl.g:1179:1: ( 'href' )
            {
            // InternalMyDsl.g:1179:1: ( 'href' )
            // InternalMyDsl.g:1180:2: 'href'
            {
             before(grammarAccess.getNAVAccess().getHrefKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1189:1: rule__NAV__Group__4 : rule__NAV__Group__4__Impl rule__NAV__Group__5 ;
    public final void rule__NAV__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__NAV__Group__4__Impl rule__NAV__Group__5 )
            // InternalMyDsl.g:1194:2: rule__NAV__Group__4__Impl rule__NAV__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1201:1: rule__NAV__Group__4__Impl : ( ( rule__NAV__HrefAssignment_4 ) ) ;
    public final void rule__NAV__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( ( rule__NAV__HrefAssignment_4 ) ) )
            // InternalMyDsl.g:1206:1: ( ( rule__NAV__HrefAssignment_4 ) )
            {
            // InternalMyDsl.g:1206:1: ( ( rule__NAV__HrefAssignment_4 ) )
            // InternalMyDsl.g:1207:2: ( rule__NAV__HrefAssignment_4 )
            {
             before(grammarAccess.getNAVAccess().getHrefAssignment_4()); 
            // InternalMyDsl.g:1208:2: ( rule__NAV__HrefAssignment_4 )
            // InternalMyDsl.g:1208:3: rule__NAV__HrefAssignment_4
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
    // InternalMyDsl.g:1216:1: rule__NAV__Group__5 : rule__NAV__Group__5__Impl ;
    public final void rule__NAV__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__NAV__Group__5__Impl )
            // InternalMyDsl.g:1221:2: rule__NAV__Group__5__Impl
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
    // InternalMyDsl.g:1227:1: rule__NAV__Group__5__Impl : ( '}' ) ;
    public final void rule__NAV__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( '}' ) )
            // InternalMyDsl.g:1232:1: ( '}' )
            {
            // InternalMyDsl.g:1232:1: ( '}' )
            // InternalMyDsl.g:1233:2: '}'
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


    // $ANTLR start "rule__Radio__Group__0"
    // InternalMyDsl.g:1243:1: rule__Radio__Group__0 : rule__Radio__Group__0__Impl rule__Radio__Group__1 ;
    public final void rule__Radio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__Radio__Group__0__Impl rule__Radio__Group__1 )
            // InternalMyDsl.g:1248:2: rule__Radio__Group__0__Impl rule__Radio__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1255:1: rule__Radio__Group__0__Impl : ( 'radio' ) ;
    public final void rule__Radio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( 'radio' ) )
            // InternalMyDsl.g:1260:1: ( 'radio' )
            {
            // InternalMyDsl.g:1260:1: ( 'radio' )
            // InternalMyDsl.g:1261:2: 'radio'
            {
             before(grammarAccess.getRadioAccess().getRadioKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1270:1: rule__Radio__Group__1 : rule__Radio__Group__1__Impl rule__Radio__Group__2 ;
    public final void rule__Radio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__Radio__Group__1__Impl rule__Radio__Group__2 )
            // InternalMyDsl.g:1275:2: rule__Radio__Group__1__Impl rule__Radio__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1282:1: rule__Radio__Group__1__Impl : ( ( rule__Radio__NameAssignment_1 ) ) ;
    public final void rule__Radio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( ( rule__Radio__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1287:1: ( ( rule__Radio__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1287:1: ( ( rule__Radio__NameAssignment_1 ) )
            // InternalMyDsl.g:1288:2: ( rule__Radio__NameAssignment_1 )
            {
             before(grammarAccess.getRadioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1289:2: ( rule__Radio__NameAssignment_1 )
            // InternalMyDsl.g:1289:3: rule__Radio__NameAssignment_1
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
    // InternalMyDsl.g:1297:1: rule__Radio__Group__2 : rule__Radio__Group__2__Impl rule__Radio__Group__3 ;
    public final void rule__Radio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__Radio__Group__2__Impl rule__Radio__Group__3 )
            // InternalMyDsl.g:1302:2: rule__Radio__Group__2__Impl rule__Radio__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1309:1: rule__Radio__Group__2__Impl : ( '{' ) ;
    public final void rule__Radio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( '{' ) )
            // InternalMyDsl.g:1314:1: ( '{' )
            {
            // InternalMyDsl.g:1314:1: ( '{' )
            // InternalMyDsl.g:1315:2: '{'
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
    // InternalMyDsl.g:1324:1: rule__Radio__Group__3 : rule__Radio__Group__3__Impl rule__Radio__Group__4 ;
    public final void rule__Radio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Radio__Group__3__Impl rule__Radio__Group__4 )
            // InternalMyDsl.g:1329:2: rule__Radio__Group__3__Impl rule__Radio__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1336:1: rule__Radio__Group__3__Impl : ( ( rule__Radio__TitleAssignment_3 ) ) ;
    public final void rule__Radio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ( rule__Radio__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1341:1: ( ( rule__Radio__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1341:1: ( ( rule__Radio__TitleAssignment_3 ) )
            // InternalMyDsl.g:1342:2: ( rule__Radio__TitleAssignment_3 )
            {
             before(grammarAccess.getRadioAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1343:2: ( rule__Radio__TitleAssignment_3 )
            // InternalMyDsl.g:1343:3: rule__Radio__TitleAssignment_3
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
    // InternalMyDsl.g:1351:1: rule__Radio__Group__4 : rule__Radio__Group__4__Impl rule__Radio__Group__5 ;
    public final void rule__Radio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__Radio__Group__4__Impl rule__Radio__Group__5 )
            // InternalMyDsl.g:1356:2: rule__Radio__Group__4__Impl rule__Radio__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1363:1: rule__Radio__Group__4__Impl : ( ( rule__Radio__Group_4__0 )* ) ;
    public final void rule__Radio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ( rule__Radio__Group_4__0 )* ) )
            // InternalMyDsl.g:1368:1: ( ( rule__Radio__Group_4__0 )* )
            {
            // InternalMyDsl.g:1368:1: ( ( rule__Radio__Group_4__0 )* )
            // InternalMyDsl.g:1369:2: ( rule__Radio__Group_4__0 )*
            {
             before(grammarAccess.getRadioAccess().getGroup_4()); 
            // InternalMyDsl.g:1370:2: ( rule__Radio__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1370:3: rule__Radio__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Radio__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:1378:1: rule__Radio__Group__5 : rule__Radio__Group__5__Impl ;
    public final void rule__Radio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__Radio__Group__5__Impl )
            // InternalMyDsl.g:1383:2: rule__Radio__Group__5__Impl
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
    // InternalMyDsl.g:1389:1: rule__Radio__Group__5__Impl : ( '}' ) ;
    public final void rule__Radio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( '}' ) )
            // InternalMyDsl.g:1394:1: ( '}' )
            {
            // InternalMyDsl.g:1394:1: ( '}' )
            // InternalMyDsl.g:1395:2: '}'
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
    // InternalMyDsl.g:1405:1: rule__Radio__Group_4__0 : rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1 ;
    public final void rule__Radio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1 )
            // InternalMyDsl.g:1410:2: rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1417:1: rule__Radio__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Radio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( 'option' ) )
            // InternalMyDsl.g:1422:1: ( 'option' )
            {
            // InternalMyDsl.g:1422:1: ( 'option' )
            // InternalMyDsl.g:1423:2: 'option'
            {
             before(grammarAccess.getRadioAccess().getOptionKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1432:1: rule__Radio__Group_4__1 : rule__Radio__Group_4__1__Impl ;
    public final void rule__Radio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__Radio__Group_4__1__Impl )
            // InternalMyDsl.g:1437:2: rule__Radio__Group_4__1__Impl
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
    // InternalMyDsl.g:1443:1: rule__Radio__Group_4__1__Impl : ( ( rule__Radio__OptionsAssignment_4_1 ) ) ;
    public final void rule__Radio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ( rule__Radio__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1448:1: ( ( rule__Radio__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1448:1: ( ( rule__Radio__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:1449:2: ( rule__Radio__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getRadioAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:1450:2: ( rule__Radio__OptionsAssignment_4_1 )
            // InternalMyDsl.g:1450:3: rule__Radio__OptionsAssignment_4_1
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


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalMyDsl.g:1459:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalMyDsl.g:1464:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__1();

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
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // InternalMyDsl.g:1471:1: rule__Checkbox__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( 'checkbox' ) )
            // InternalMyDsl.g:1476:1: ( 'checkbox' )
            {
            // InternalMyDsl.g:1476:1: ( 'checkbox' )
            // InternalMyDsl.g:1477:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 

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
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // InternalMyDsl.g:1486:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalMyDsl.g:1491:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2();

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
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // InternalMyDsl.g:1498:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__NameAssignment_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( ( rule__Checkbox__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1503:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1503:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            // InternalMyDsl.g:1504:2: ( rule__Checkbox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1505:2: ( rule__Checkbox__NameAssignment_1 )
            // InternalMyDsl.g:1505:3: rule__Checkbox__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__2"
    // InternalMyDsl.g:1513:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalMyDsl.g:1518:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Checkbox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3();

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
    // $ANTLR end "rule__Checkbox__Group__2"


    // $ANTLR start "rule__Checkbox__Group__2__Impl"
    // InternalMyDsl.g:1525:1: rule__Checkbox__Group__2__Impl : ( '{' ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( '{' ) )
            // InternalMyDsl.g:1530:1: ( '{' )
            {
            // InternalMyDsl.g:1530:1: ( '{' )
            // InternalMyDsl.g:1531:2: '{'
            {
             before(grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Checkbox__Group__2__Impl"


    // $ANTLR start "rule__Checkbox__Group__3"
    // InternalMyDsl.g:1540:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 )
            // InternalMyDsl.g:1545:2: rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Checkbox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__4();

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
    // $ANTLR end "rule__Checkbox__Group__3"


    // $ANTLR start "rule__Checkbox__Group__3__Impl"
    // InternalMyDsl.g:1552:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__TitleAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( ( rule__Checkbox__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1557:1: ( ( rule__Checkbox__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1557:1: ( ( rule__Checkbox__TitleAssignment_3 ) )
            // InternalMyDsl.g:1558:2: ( rule__Checkbox__TitleAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1559:2: ( rule__Checkbox__TitleAssignment_3 )
            // InternalMyDsl.g:1559:3: rule__Checkbox__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Checkbox__Group__3__Impl"


    // $ANTLR start "rule__Checkbox__Group__4"
    // InternalMyDsl.g:1567:1: rule__Checkbox__Group__4 : rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5 ;
    public final void rule__Checkbox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5 )
            // InternalMyDsl.g:1572:2: rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Checkbox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__5();

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
    // $ANTLR end "rule__Checkbox__Group__4"


    // $ANTLR start "rule__Checkbox__Group__4__Impl"
    // InternalMyDsl.g:1579:1: rule__Checkbox__Group__4__Impl : ( ( rule__Checkbox__Group_4__0 )* ) ;
    public final void rule__Checkbox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( ( rule__Checkbox__Group_4__0 )* ) )
            // InternalMyDsl.g:1584:1: ( ( rule__Checkbox__Group_4__0 )* )
            {
            // InternalMyDsl.g:1584:1: ( ( rule__Checkbox__Group_4__0 )* )
            // InternalMyDsl.g:1585:2: ( rule__Checkbox__Group_4__0 )*
            {
             before(grammarAccess.getCheckboxAccess().getGroup_4()); 
            // InternalMyDsl.g:1586:2: ( rule__Checkbox__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1586:3: rule__Checkbox__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Checkbox__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCheckboxAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Checkbox__Group__4__Impl"


    // $ANTLR start "rule__Checkbox__Group__5"
    // InternalMyDsl.g:1594:1: rule__Checkbox__Group__5 : rule__Checkbox__Group__5__Impl ;
    public final void rule__Checkbox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__Checkbox__Group__5__Impl )
            // InternalMyDsl.g:1599:2: rule__Checkbox__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__5__Impl();

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
    // $ANTLR end "rule__Checkbox__Group__5"


    // $ANTLR start "rule__Checkbox__Group__5__Impl"
    // InternalMyDsl.g:1605:1: rule__Checkbox__Group__5__Impl : ( '}' ) ;
    public final void rule__Checkbox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( '}' ) )
            // InternalMyDsl.g:1610:1: ( '}' )
            {
            // InternalMyDsl.g:1610:1: ( '}' )
            // InternalMyDsl.g:1611:2: '}'
            {
             before(grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Checkbox__Group__5__Impl"


    // $ANTLR start "rule__Checkbox__Group_4__0"
    // InternalMyDsl.g:1621:1: rule__Checkbox__Group_4__0 : rule__Checkbox__Group_4__0__Impl rule__Checkbox__Group_4__1 ;
    public final void rule__Checkbox__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__Checkbox__Group_4__0__Impl rule__Checkbox__Group_4__1 )
            // InternalMyDsl.g:1626:2: rule__Checkbox__Group_4__0__Impl rule__Checkbox__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Checkbox__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group_4__1();

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
    // $ANTLR end "rule__Checkbox__Group_4__0"


    // $ANTLR start "rule__Checkbox__Group_4__0__Impl"
    // InternalMyDsl.g:1633:1: rule__Checkbox__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Checkbox__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( ( 'option' ) )
            // InternalMyDsl.g:1638:1: ( 'option' )
            {
            // InternalMyDsl.g:1638:1: ( 'option' )
            // InternalMyDsl.g:1639:2: 'option'
            {
             before(grammarAccess.getCheckboxAccess().getOptionKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getOptionKeyword_4_0()); 

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
    // $ANTLR end "rule__Checkbox__Group_4__0__Impl"


    // $ANTLR start "rule__Checkbox__Group_4__1"
    // InternalMyDsl.g:1648:1: rule__Checkbox__Group_4__1 : rule__Checkbox__Group_4__1__Impl ;
    public final void rule__Checkbox__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Checkbox__Group_4__1__Impl )
            // InternalMyDsl.g:1653:2: rule__Checkbox__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group_4__1__Impl();

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
    // $ANTLR end "rule__Checkbox__Group_4__1"


    // $ANTLR start "rule__Checkbox__Group_4__1__Impl"
    // InternalMyDsl.g:1659:1: rule__Checkbox__Group_4__1__Impl : ( ( rule__Checkbox__OptionsAssignment_4_1 ) ) ;
    public final void rule__Checkbox__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ( rule__Checkbox__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1664:1: ( ( rule__Checkbox__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1664:1: ( ( rule__Checkbox__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:1665:2: ( rule__Checkbox__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getCheckboxAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:1666:2: ( rule__Checkbox__OptionsAssignment_4_1 )
            // InternalMyDsl.g:1666:3: rule__Checkbox__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Checkbox__Group_4__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalMyDsl.g:1675:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:1680:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1687:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( 'button' ) )
            // InternalMyDsl.g:1692:1: ( 'button' )
            {
            // InternalMyDsl.g:1692:1: ( 'button' )
            // InternalMyDsl.g:1693:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1702:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:1707:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1714:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1719:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1719:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalMyDsl.g:1720:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1721:2: ( rule__Button__NameAssignment_1 )
            // InternalMyDsl.g:1721:3: rule__Button__NameAssignment_1
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
    // InternalMyDsl.g:1729:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:1734:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1741:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( '{' ) )
            // InternalMyDsl.g:1746:1: ( '{' )
            {
            // InternalMyDsl.g:1746:1: ( '{' )
            // InternalMyDsl.g:1747:2: '{'
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
    // InternalMyDsl.g:1756:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:1761:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1768:1: rule__Button__Group__3__Impl : ( ( rule__Button__TitleAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( ( rule__Button__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1773:1: ( ( rule__Button__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1773:1: ( ( rule__Button__TitleAssignment_3 ) )
            // InternalMyDsl.g:1774:2: ( rule__Button__TitleAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1775:2: ( rule__Button__TitleAssignment_3 )
            // InternalMyDsl.g:1775:3: rule__Button__TitleAssignment_3
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
    // InternalMyDsl.g:1783:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalMyDsl.g:1788:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1795:1: rule__Button__Group__4__Impl : ( 'href' ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( 'href' ) )
            // InternalMyDsl.g:1800:1: ( 'href' )
            {
            // InternalMyDsl.g:1800:1: ( 'href' )
            // InternalMyDsl.g:1801:2: 'href'
            {
             before(grammarAccess.getButtonAccess().getHrefKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1810:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalMyDsl.g:1815:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1822:1: rule__Button__Group__5__Impl : ( ( rule__Button__HrefAssignment_5 ) ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ( rule__Button__HrefAssignment_5 ) ) )
            // InternalMyDsl.g:1827:1: ( ( rule__Button__HrefAssignment_5 ) )
            {
            // InternalMyDsl.g:1827:1: ( ( rule__Button__HrefAssignment_5 ) )
            // InternalMyDsl.g:1828:2: ( rule__Button__HrefAssignment_5 )
            {
             before(grammarAccess.getButtonAccess().getHrefAssignment_5()); 
            // InternalMyDsl.g:1829:2: ( rule__Button__HrefAssignment_5 )
            // InternalMyDsl.g:1829:3: rule__Button__HrefAssignment_5
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
    // InternalMyDsl.g:1837:1: rule__Button__Group__6 : rule__Button__Group__6__Impl ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__Button__Group__6__Impl )
            // InternalMyDsl.g:1842:2: rule__Button__Group__6__Impl
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
    // InternalMyDsl.g:1848:1: rule__Button__Group__6__Impl : ( '}' ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( '}' ) )
            // InternalMyDsl.g:1853:1: ( '}' )
            {
            // InternalMyDsl.g:1853:1: ( '}' )
            // InternalMyDsl.g:1854:2: '}'
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
    // InternalMyDsl.g:1864:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMyDsl.g:1869:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1876:1: rule__Selector__Group__0__Impl : ( 'selector' ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( 'selector' ) )
            // InternalMyDsl.g:1881:1: ( 'selector' )
            {
            // InternalMyDsl.g:1881:1: ( 'selector' )
            // InternalMyDsl.g:1882:2: 'selector'
            {
             before(grammarAccess.getSelectorAccess().getSelectorKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1891:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMyDsl.g:1896:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1903:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__NameAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( rule__Selector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1908:1: ( ( rule__Selector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1908:1: ( ( rule__Selector__NameAssignment_1 ) )
            // InternalMyDsl.g:1909:2: ( rule__Selector__NameAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1910:2: ( rule__Selector__NameAssignment_1 )
            // InternalMyDsl.g:1910:3: rule__Selector__NameAssignment_1
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
    // InternalMyDsl.g:1918:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMyDsl.g:1923:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1930:1: rule__Selector__Group__2__Impl : ( '{' ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( ( '{' ) )
            // InternalMyDsl.g:1935:1: ( '{' )
            {
            // InternalMyDsl.g:1935:1: ( '{' )
            // InternalMyDsl.g:1936:2: '{'
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
    // InternalMyDsl.g:1945:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMyDsl.g:1950:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1957:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__TitleAssignment_3 ) ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ( rule__Selector__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1962:1: ( ( rule__Selector__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1962:1: ( ( rule__Selector__TitleAssignment_3 ) )
            // InternalMyDsl.g:1963:2: ( rule__Selector__TitleAssignment_3 )
            {
             before(grammarAccess.getSelectorAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1964:2: ( rule__Selector__TitleAssignment_3 )
            // InternalMyDsl.g:1964:3: rule__Selector__TitleAssignment_3
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
    // InternalMyDsl.g:1972:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalMyDsl.g:1977:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1984:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )* ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( ( rule__Selector__Group_4__0 )* ) )
            // InternalMyDsl.g:1989:1: ( ( rule__Selector__Group_4__0 )* )
            {
            // InternalMyDsl.g:1989:1: ( ( rule__Selector__Group_4__0 )* )
            // InternalMyDsl.g:1990:2: ( rule__Selector__Group_4__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalMyDsl.g:1991:2: ( rule__Selector__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1991:3: rule__Selector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Selector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1999:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__Selector__Group__5__Impl )
            // InternalMyDsl.g:2004:2: rule__Selector__Group__5__Impl
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
    // InternalMyDsl.g:2010:1: rule__Selector__Group__5__Impl : ( '}' ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( '}' ) )
            // InternalMyDsl.g:2015:1: ( '}' )
            {
            // InternalMyDsl.g:2015:1: ( '}' )
            // InternalMyDsl.g:2016:2: '}'
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
    // InternalMyDsl.g:2026:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalMyDsl.g:2031:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2038:1: rule__Selector__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( 'option' ) )
            // InternalMyDsl.g:2043:1: ( 'option' )
            {
            // InternalMyDsl.g:2043:1: ( 'option' )
            // InternalMyDsl.g:2044:2: 'option'
            {
             before(grammarAccess.getSelectorAccess().getOptionKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:2053:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__Selector__Group_4__1__Impl )
            // InternalMyDsl.g:2058:2: rule__Selector__Group_4__1__Impl
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
    // InternalMyDsl.g:2064:1: rule__Selector__Group_4__1__Impl : ( ( rule__Selector__OptionsAssignment_4_1 ) ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ( rule__Selector__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2069:1: ( ( rule__Selector__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2069:1: ( ( rule__Selector__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:2070:2: ( rule__Selector__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getSelectorAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:2071:2: ( rule__Selector__OptionsAssignment_4_1 )
            // InternalMyDsl.g:2071:3: rule__Selector__OptionsAssignment_4_1
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


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:2080:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:2085:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2092:1: rule__Link__Group__0__Impl : ( 'link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( 'link' ) )
            // InternalMyDsl.g:2097:1: ( 'link' )
            {
            // InternalMyDsl.g:2097:1: ( 'link' )
            // InternalMyDsl.g:2098:2: 'link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2107:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:2112:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2119:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2124:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2124:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:2125:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2126:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:2126:3: rule__Link__NameAssignment_1
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
    // InternalMyDsl.g:2134:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:2139:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalMyDsl.g:2146:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( '{' ) )
            // InternalMyDsl.g:2151:1: ( '{' )
            {
            // InternalMyDsl.g:2151:1: ( '{' )
            // InternalMyDsl.g:2152:2: '{'
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
    // InternalMyDsl.g:2161:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:2166:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2173:1: rule__Link__Group__3__Impl : ( 'url' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( ( 'url' ) )
            // InternalMyDsl.g:2178:1: ( 'url' )
            {
            // InternalMyDsl.g:2178:1: ( 'url' )
            // InternalMyDsl.g:2179:2: 'url'
            {
             before(grammarAccess.getLinkAccess().getUrlKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2188:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:2193:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2200:1: rule__Link__Group__4__Impl : ( ( rule__Link__UrlAssignment_4 ) ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ( rule__Link__UrlAssignment_4 ) ) )
            // InternalMyDsl.g:2205:1: ( ( rule__Link__UrlAssignment_4 ) )
            {
            // InternalMyDsl.g:2205:1: ( ( rule__Link__UrlAssignment_4 ) )
            // InternalMyDsl.g:2206:2: ( rule__Link__UrlAssignment_4 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_4()); 
            // InternalMyDsl.g:2207:2: ( rule__Link__UrlAssignment_4 )
            // InternalMyDsl.g:2207:3: rule__Link__UrlAssignment_4
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
    // InternalMyDsl.g:2215:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__Link__Group__5__Impl )
            // InternalMyDsl.g:2220:2: rule__Link__Group__5__Impl
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
    // InternalMyDsl.g:2226:1: rule__Link__Group__5__Impl : ( '}' ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( '}' ) )
            // InternalMyDsl.g:2231:1: ( '}' )
            {
            // InternalMyDsl.g:2231:1: ( '}' )
            // InternalMyDsl.g:2232:2: '}'
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
    // InternalMyDsl.g:2242:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalMyDsl.g:2247:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2254:1: rule__Menu__Group__0__Impl : ( 'menu' ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( 'menu' ) )
            // InternalMyDsl.g:2259:1: ( 'menu' )
            {
            // InternalMyDsl.g:2259:1: ( 'menu' )
            // InternalMyDsl.g:2260:2: 'menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2269:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalMyDsl.g:2274:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2281:1: rule__Menu__Group__1__Impl : ( ( rule__Menu__NameAssignment_1 ) ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( ( rule__Menu__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2286:1: ( ( rule__Menu__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2286:1: ( ( rule__Menu__NameAssignment_1 ) )
            // InternalMyDsl.g:2287:2: ( rule__Menu__NameAssignment_1 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2288:2: ( rule__Menu__NameAssignment_1 )
            // InternalMyDsl.g:2288:3: rule__Menu__NameAssignment_1
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
    // InternalMyDsl.g:2296:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalMyDsl.g:2301:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2308:1: rule__Menu__Group__2__Impl : ( '{' ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( '{' ) )
            // InternalMyDsl.g:2313:1: ( '{' )
            {
            // InternalMyDsl.g:2313:1: ( '{' )
            // InternalMyDsl.g:2314:2: '{'
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
    // InternalMyDsl.g:2323:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalMyDsl.g:2328:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2335:1: rule__Menu__Group__3__Impl : ( 'name' ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( 'name' ) )
            // InternalMyDsl.g:2340:1: ( 'name' )
            {
            // InternalMyDsl.g:2340:1: ( 'name' )
            // InternalMyDsl.g:2341:2: 'name'
            {
             before(grammarAccess.getMenuAccess().getNameKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getNameKeyword_3()); 

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
    // InternalMyDsl.g:2350:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalMyDsl.g:2355:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2362:1: rule__Menu__Group__4__Impl : ( ( rule__Menu__MealAssignment_4 ) ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ( rule__Menu__MealAssignment_4 ) ) )
            // InternalMyDsl.g:2367:1: ( ( rule__Menu__MealAssignment_4 ) )
            {
            // InternalMyDsl.g:2367:1: ( ( rule__Menu__MealAssignment_4 ) )
            // InternalMyDsl.g:2368:2: ( rule__Menu__MealAssignment_4 )
            {
             before(grammarAccess.getMenuAccess().getMealAssignment_4()); 
            // InternalMyDsl.g:2369:2: ( rule__Menu__MealAssignment_4 )
            // InternalMyDsl.g:2369:3: rule__Menu__MealAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Menu__MealAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getMealAssignment_4()); 

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
    // InternalMyDsl.g:2377:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl rule__Menu__Group__6 ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__Menu__Group__5__Impl rule__Menu__Group__6 )
            // InternalMyDsl.g:2382:2: rule__Menu__Group__5__Impl rule__Menu__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2389:1: rule__Menu__Group__5__Impl : ( ( rule__Menu__DescriptionAssignment_5 ) ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ( rule__Menu__DescriptionAssignment_5 ) ) )
            // InternalMyDsl.g:2394:1: ( ( rule__Menu__DescriptionAssignment_5 ) )
            {
            // InternalMyDsl.g:2394:1: ( ( rule__Menu__DescriptionAssignment_5 ) )
            // InternalMyDsl.g:2395:2: ( rule__Menu__DescriptionAssignment_5 )
            {
             before(grammarAccess.getMenuAccess().getDescriptionAssignment_5()); 
            // InternalMyDsl.g:2396:2: ( rule__Menu__DescriptionAssignment_5 )
            // InternalMyDsl.g:2396:3: rule__Menu__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Menu__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getDescriptionAssignment_5()); 

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
    // InternalMyDsl.g:2404:1: rule__Menu__Group__6 : rule__Menu__Group__6__Impl rule__Menu__Group__7 ;
    public final void rule__Menu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__Menu__Group__6__Impl rule__Menu__Group__7 )
            // InternalMyDsl.g:2409:2: rule__Menu__Group__6__Impl rule__Menu__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Menu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__7();

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
    // InternalMyDsl.g:2416:1: rule__Menu__Group__6__Impl : ( 'price' ) ;
    public final void rule__Menu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( 'price' ) )
            // InternalMyDsl.g:2421:1: ( 'price' )
            {
            // InternalMyDsl.g:2421:1: ( 'price' )
            // InternalMyDsl.g:2422:2: 'price'
            {
             before(grammarAccess.getMenuAccess().getPriceKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getPriceKeyword_6()); 

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


    // $ANTLR start "rule__Menu__Group__7"
    // InternalMyDsl.g:2431:1: rule__Menu__Group__7 : rule__Menu__Group__7__Impl rule__Menu__Group__8 ;
    public final void rule__Menu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__Menu__Group__7__Impl rule__Menu__Group__8 )
            // InternalMyDsl.g:2436:2: rule__Menu__Group__7__Impl rule__Menu__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Menu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__8();

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
    // $ANTLR end "rule__Menu__Group__7"


    // $ANTLR start "rule__Menu__Group__7__Impl"
    // InternalMyDsl.g:2443:1: rule__Menu__Group__7__Impl : ( ( rule__Menu__PriceAssignment_7 ) ) ;
    public final void rule__Menu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( ( rule__Menu__PriceAssignment_7 ) ) )
            // InternalMyDsl.g:2448:1: ( ( rule__Menu__PriceAssignment_7 ) )
            {
            // InternalMyDsl.g:2448:1: ( ( rule__Menu__PriceAssignment_7 ) )
            // InternalMyDsl.g:2449:2: ( rule__Menu__PriceAssignment_7 )
            {
             before(grammarAccess.getMenuAccess().getPriceAssignment_7()); 
            // InternalMyDsl.g:2450:2: ( rule__Menu__PriceAssignment_7 )
            // InternalMyDsl.g:2450:3: rule__Menu__PriceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Menu__PriceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getPriceAssignment_7()); 

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
    // $ANTLR end "rule__Menu__Group__7__Impl"


    // $ANTLR start "rule__Menu__Group__8"
    // InternalMyDsl.g:2458:1: rule__Menu__Group__8 : rule__Menu__Group__8__Impl rule__Menu__Group__9 ;
    public final void rule__Menu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__Menu__Group__8__Impl rule__Menu__Group__9 )
            // InternalMyDsl.g:2463:2: rule__Menu__Group__8__Impl rule__Menu__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Menu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__9();

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
    // $ANTLR end "rule__Menu__Group__8"


    // $ANTLR start "rule__Menu__Group__8__Impl"
    // InternalMyDsl.g:2470:1: rule__Menu__Group__8__Impl : ( 'image' ) ;
    public final void rule__Menu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( ( 'image' ) )
            // InternalMyDsl.g:2475:1: ( 'image' )
            {
            // InternalMyDsl.g:2475:1: ( 'image' )
            // InternalMyDsl.g:2476:2: 'image'
            {
             before(grammarAccess.getMenuAccess().getImageKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getImageKeyword_8()); 

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
    // $ANTLR end "rule__Menu__Group__8__Impl"


    // $ANTLR start "rule__Menu__Group__9"
    // InternalMyDsl.g:2485:1: rule__Menu__Group__9 : rule__Menu__Group__9__Impl rule__Menu__Group__10 ;
    public final void rule__Menu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__Menu__Group__9__Impl rule__Menu__Group__10 )
            // InternalMyDsl.g:2490:2: rule__Menu__Group__9__Impl rule__Menu__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Menu__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__10();

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
    // $ANTLR end "rule__Menu__Group__9"


    // $ANTLR start "rule__Menu__Group__9__Impl"
    // InternalMyDsl.g:2497:1: rule__Menu__Group__9__Impl : ( ( rule__Menu__ImageAssignment_9 ) ) ;
    public final void rule__Menu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( ( rule__Menu__ImageAssignment_9 ) ) )
            // InternalMyDsl.g:2502:1: ( ( rule__Menu__ImageAssignment_9 ) )
            {
            // InternalMyDsl.g:2502:1: ( ( rule__Menu__ImageAssignment_9 ) )
            // InternalMyDsl.g:2503:2: ( rule__Menu__ImageAssignment_9 )
            {
             before(grammarAccess.getMenuAccess().getImageAssignment_9()); 
            // InternalMyDsl.g:2504:2: ( rule__Menu__ImageAssignment_9 )
            // InternalMyDsl.g:2504:3: rule__Menu__ImageAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Menu__ImageAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getImageAssignment_9()); 

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
    // $ANTLR end "rule__Menu__Group__9__Impl"


    // $ANTLR start "rule__Menu__Group__10"
    // InternalMyDsl.g:2512:1: rule__Menu__Group__10 : rule__Menu__Group__10__Impl ;
    public final void rule__Menu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__Menu__Group__10__Impl )
            // InternalMyDsl.g:2517:2: rule__Menu__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__10__Impl();

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
    // $ANTLR end "rule__Menu__Group__10"


    // $ANTLR start "rule__Menu__Group__10__Impl"
    // InternalMyDsl.g:2523:1: rule__Menu__Group__10__Impl : ( '}' ) ;
    public final void rule__Menu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( '}' ) )
            // InternalMyDsl.g:2528:1: ( '}' )
            {
            // InternalMyDsl.g:2528:1: ( '}' )
            // InternalMyDsl.g:2529:2: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Menu__Group__10__Impl"


    // $ANTLR start "rule__Mensamodel__HeaderAssignment_0"
    // InternalMyDsl.g:2539:1: rule__Mensamodel__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Mensamodel__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( ( ruleHeader ) )
            // InternalMyDsl.g:2544:2: ( ruleHeader )
            {
            // InternalMyDsl.g:2544:2: ( ruleHeader )
            // InternalMyDsl.g:2545:3: ruleHeader
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


    // $ANTLR start "rule__Mensamodel__SiderbarAssignment_1"
    // InternalMyDsl.g:2554:1: rule__Mensamodel__SiderbarAssignment_1 : ( ruleSiderbar ) ;
    public final void rule__Mensamodel__SiderbarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( ( ruleSiderbar ) )
            // InternalMyDsl.g:2559:2: ( ruleSiderbar )
            {
            // InternalMyDsl.g:2559:2: ( ruleSiderbar )
            // InternalMyDsl.g:2560:3: ruleSiderbar
            {
             before(grammarAccess.getMensamodelAccess().getSiderbarSiderbarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiderbar();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getSiderbarSiderbarParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mensamodel__SiderbarAssignment_1"


    // $ANTLR start "rule__Mensamodel__FooterAssignment_2"
    // InternalMyDsl.g:2569:1: rule__Mensamodel__FooterAssignment_2 : ( ruleFooter ) ;
    public final void rule__Mensamodel__FooterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ruleFooter ) )
            // InternalMyDsl.g:2574:2: ( ruleFooter )
            {
            // InternalMyDsl.g:2574:2: ( ruleFooter )
            // InternalMyDsl.g:2575:3: ruleFooter
            {
             before(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFooter();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Mensamodel__FooterAssignment_2"


    // $ANTLR start "rule__Mensamodel__MenusAssignment_3"
    // InternalMyDsl.g:2584:1: rule__Mensamodel__MenusAssignment_3 : ( ruleMenu ) ;
    public final void rule__Mensamodel__MenusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( ( ruleMenu ) )
            // InternalMyDsl.g:2589:2: ( ruleMenu )
            {
            // InternalMyDsl.g:2589:2: ( ruleMenu )
            // InternalMyDsl.g:2590:3: ruleMenu
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
    // InternalMyDsl.g:2599:1: rule__Header__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Header__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2604:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2604:2: ( RULE_ID )
            // InternalMyDsl.g:2605:3: RULE_ID
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
    // InternalMyDsl.g:2614:1: rule__Header__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Header__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2618:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2619:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2619:2: ( ruleDescription )
            // InternalMyDsl.g:2620:3: ruleDescription
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
    // InternalMyDsl.g:2629:1: rule__Header__NavAssignment_4 : ( ruleNAV ) ;
    public final void rule__Header__NavAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2633:1: ( ( ruleNAV ) )
            // InternalMyDsl.g:2634:2: ( ruleNAV )
            {
            // InternalMyDsl.g:2634:2: ( ruleNAV )
            // InternalMyDsl.g:2635:3: ruleNAV
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


    // $ANTLR start "rule__Siderbar__NameAssignment_1"
    // InternalMyDsl.g:2644:1: rule__Siderbar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Siderbar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2649:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2649:2: ( RULE_ID )
            // InternalMyDsl.g:2650:3: RULE_ID
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
    // InternalMyDsl.g:2659:1: rule__Siderbar__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Siderbar__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2664:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2664:2: ( ruleDescription )
            // InternalMyDsl.g:2665:3: ruleDescription
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
    // InternalMyDsl.g:2674:1: rule__Siderbar__RadioAssignment_4 : ( ruleRadio ) ;
    public final void rule__Siderbar__RadioAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( ( ruleRadio ) )
            // InternalMyDsl.g:2679:2: ( ruleRadio )
            {
            // InternalMyDsl.g:2679:2: ( ruleRadio )
            // InternalMyDsl.g:2680:3: ruleRadio
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


    // $ANTLR start "rule__Siderbar__CheckboxAssignment_5"
    // InternalMyDsl.g:2689:1: rule__Siderbar__CheckboxAssignment_5 : ( ruleCheckbox ) ;
    public final void rule__Siderbar__CheckboxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2693:1: ( ( ruleCheckbox ) )
            // InternalMyDsl.g:2694:2: ( ruleCheckbox )
            {
            // InternalMyDsl.g:2694:2: ( ruleCheckbox )
            // InternalMyDsl.g:2695:3: ruleCheckbox
            {
             before(grammarAccess.getSiderbarAccess().getCheckboxCheckboxParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getCheckboxCheckboxParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Siderbar__CheckboxAssignment_5"


    // $ANTLR start "rule__Siderbar__ButtonAssignment_6"
    // InternalMyDsl.g:2704:1: rule__Siderbar__ButtonAssignment_6 : ( ruleButton ) ;
    public final void rule__Siderbar__ButtonAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( ruleButton ) )
            // InternalMyDsl.g:2709:2: ( ruleButton )
            {
            // InternalMyDsl.g:2709:2: ( ruleButton )
            // InternalMyDsl.g:2710:3: ruleButton
            {
             before(grammarAccess.getSiderbarAccess().getButtonButtonParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getButtonButtonParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Siderbar__ButtonAssignment_6"


    // $ANTLR start "rule__Siderbar__SelectorAssignment_7"
    // InternalMyDsl.g:2719:1: rule__Siderbar__SelectorAssignment_7 : ( ruleSelector ) ;
    public final void rule__Siderbar__SelectorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( ( ruleSelector ) )
            // InternalMyDsl.g:2724:2: ( ruleSelector )
            {
            // InternalMyDsl.g:2724:2: ( ruleSelector )
            // InternalMyDsl.g:2725:3: ruleSelector
            {
             before(grammarAccess.getSiderbarAccess().getSelectorSelectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSiderbarAccess().getSelectorSelectorParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Siderbar__SelectorAssignment_7"


    // $ANTLR start "rule__Footer__NameAssignment_1"
    // InternalMyDsl.g:2734:1: rule__Footer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Footer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2739:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2739:2: ( RULE_ID )
            // InternalMyDsl.g:2740:3: RULE_ID
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
    // InternalMyDsl.g:2749:1: rule__Footer__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Footer__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2754:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2754:2: ( ruleDescription )
            // InternalMyDsl.g:2755:3: ruleDescription
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
    // InternalMyDsl.g:2764:1: rule__Footer__LinksAssignment_4 : ( ruleLink ) ;
    public final void rule__Footer__LinksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( ( ruleLink ) )
            // InternalMyDsl.g:2769:2: ( ruleLink )
            {
            // InternalMyDsl.g:2769:2: ( ruleLink )
            // InternalMyDsl.g:2770:3: ruleLink
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


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalMyDsl.g:2779:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2784:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2784:2: ( RULE_STRING )
            // InternalMyDsl.g:2785:3: RULE_STRING
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
    // InternalMyDsl.g:2794:1: rule__NAV__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NAV__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2799:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2799:2: ( RULE_ID )
            // InternalMyDsl.g:2800:3: RULE_ID
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
    // InternalMyDsl.g:2809:1: rule__NAV__HrefAssignment_4 : ( RULE_STRING ) ;
    public final void rule__NAV__HrefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2814:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2814:2: ( RULE_STRING )
            // InternalMyDsl.g:2815:3: RULE_STRING
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


    // $ANTLR start "rule__Radio__NameAssignment_1"
    // InternalMyDsl.g:2824:1: rule__Radio__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Radio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2828:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2829:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2829:2: ( RULE_ID )
            // InternalMyDsl.g:2830:3: RULE_ID
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
    // InternalMyDsl.g:2839:1: rule__Radio__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Radio__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2843:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2844:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2844:2: ( ruleDescription )
            // InternalMyDsl.g:2845:3: ruleDescription
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
    // InternalMyDsl.g:2854:1: rule__Radio__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Radio__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2859:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2859:2: ( RULE_STRING )
            // InternalMyDsl.g:2860:3: RULE_STRING
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


    // $ANTLR start "rule__Checkbox__NameAssignment_1"
    // InternalMyDsl.g:2869:1: rule__Checkbox__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Checkbox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2874:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2874:2: ( RULE_ID )
            // InternalMyDsl.g:2875:3: RULE_ID
            {
             before(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Checkbox__NameAssignment_1"


    // $ANTLR start "rule__Checkbox__TitleAssignment_3"
    // InternalMyDsl.g:2884:1: rule__Checkbox__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Checkbox__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2888:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2889:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2889:2: ( ruleDescription )
            // InternalMyDsl.g:2890:3: ruleDescription
            {
             before(grammarAccess.getCheckboxAccess().getTitleDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getTitleDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Checkbox__TitleAssignment_3"


    // $ANTLR start "rule__Checkbox__OptionsAssignment_4_1"
    // InternalMyDsl.g:2899:1: rule__Checkbox__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Checkbox__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2903:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2904:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2904:2: ( RULE_STRING )
            // InternalMyDsl.g:2905:3: RULE_STRING
            {
             before(grammarAccess.getCheckboxAccess().getOptionsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getOptionsSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Checkbox__OptionsAssignment_4_1"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalMyDsl.g:2914:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2919:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2919:2: ( RULE_ID )
            // InternalMyDsl.g:2920:3: RULE_ID
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
    // InternalMyDsl.g:2929:1: rule__Button__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Button__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2934:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2934:2: ( ruleDescription )
            // InternalMyDsl.g:2935:3: ruleDescription
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
    // InternalMyDsl.g:2944:1: rule__Button__HrefAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Button__HrefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2949:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2949:2: ( RULE_STRING )
            // InternalMyDsl.g:2950:3: RULE_STRING
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
    // InternalMyDsl.g:2959:1: rule__Selector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2963:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2964:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2964:2: ( RULE_ID )
            // InternalMyDsl.g:2965:3: RULE_ID
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
    // InternalMyDsl.g:2974:1: rule__Selector__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Selector__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2979:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2979:2: ( ruleDescription )
            // InternalMyDsl.g:2980:3: ruleDescription
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
    // InternalMyDsl.g:2989:1: rule__Selector__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Selector__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2994:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2994:2: ( RULE_STRING )
            // InternalMyDsl.g:2995:3: RULE_STRING
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


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalMyDsl.g:3004:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3009:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3009:2: ( RULE_ID )
            // InternalMyDsl.g:3010:3: RULE_ID
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
    // InternalMyDsl.g:3019:1: rule__Link__UrlAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Link__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3023:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3024:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3024:2: ( RULE_STRING )
            // InternalMyDsl.g:3025:3: RULE_STRING
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
    // InternalMyDsl.g:3034:1: rule__Menu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Menu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3038:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3039:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3039:2: ( RULE_ID )
            // InternalMyDsl.g:3040:3: RULE_ID
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


    // $ANTLR start "rule__Menu__MealAssignment_4"
    // InternalMyDsl.g:3049:1: rule__Menu__MealAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Menu__MealAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3053:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3054:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3054:2: ( RULE_STRING )
            // InternalMyDsl.g:3055:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getMealSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMealSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Menu__MealAssignment_4"


    // $ANTLR start "rule__Menu__DescriptionAssignment_5"
    // InternalMyDsl.g:3064:1: rule__Menu__DescriptionAssignment_5 : ( ruleDescription ) ;
    public final void rule__Menu__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:3069:2: ( ruleDescription )
            {
            // InternalMyDsl.g:3069:2: ( ruleDescription )
            // InternalMyDsl.g:3070:3: ruleDescription
            {
             before(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Menu__DescriptionAssignment_5"


    // $ANTLR start "rule__Menu__PriceAssignment_7"
    // InternalMyDsl.g:3079:1: rule__Menu__PriceAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Menu__PriceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3084:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3084:2: ( RULE_STRING )
            // InternalMyDsl.g:3085:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Menu__PriceAssignment_7"


    // $ANTLR start "rule__Menu__ImageAssignment_9"
    // InternalMyDsl.g:3094:1: rule__Menu__ImageAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Menu__ImageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3098:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3099:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3099:2: ( RULE_STRING )
            // InternalMyDsl.g:3100:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getImageSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getImageSTRINGTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Menu__ImageAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E82000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});

}