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


    // $ANTLR start "entryRuleSidebar"
    // InternalMyDsl.g:103:1: entryRuleSidebar : ruleSidebar EOF ;
    public final void entryRuleSidebar() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSidebar EOF )
            // InternalMyDsl.g:105:1: ruleSidebar EOF
            {
             before(grammarAccess.getSidebarRule()); 
            pushFollow(FOLLOW_1);
            ruleSidebar();

            state._fsp--;

             after(grammarAccess.getSidebarRule()); 
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
    // $ANTLR end "entryRuleSidebar"


    // $ANTLR start "ruleSidebar"
    // InternalMyDsl.g:112:1: ruleSidebar : ( ( rule__Sidebar__Group__0 ) ) ;
    public final void ruleSidebar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Sidebar__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Sidebar__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Sidebar__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Sidebar__Group__0 )
            {
             before(grammarAccess.getSidebarAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Sidebar__Group__0 )
            // InternalMyDsl.g:119:4: rule__Sidebar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSidebarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSidebar"


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
    // InternalMyDsl.g:391:1: rule__Mensamodel__Group__1__Impl : ( ( rule__Mensamodel__SidebarAssignment_1 )* ) ;
    public final void rule__Mensamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ( rule__Mensamodel__SidebarAssignment_1 )* ) )
            // InternalMyDsl.g:396:1: ( ( rule__Mensamodel__SidebarAssignment_1 )* )
            {
            // InternalMyDsl.g:396:1: ( ( rule__Mensamodel__SidebarAssignment_1 )* )
            // InternalMyDsl.g:397:2: ( rule__Mensamodel__SidebarAssignment_1 )*
            {
             before(grammarAccess.getMensamodelAccess().getSidebarAssignment_1()); 
            // InternalMyDsl.g:398:2: ( rule__Mensamodel__SidebarAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:398:3: rule__Mensamodel__SidebarAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Mensamodel__SidebarAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMensamodelAccess().getSidebarAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:418:1: rule__Mensamodel__Group__2__Impl : ( ( ( rule__Mensamodel__FooterAssignment_2 ) ) ( ( rule__Mensamodel__FooterAssignment_2 )* ) ) ;
    public final void rule__Mensamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( ( ( rule__Mensamodel__FooterAssignment_2 ) ) ( ( rule__Mensamodel__FooterAssignment_2 )* ) ) )
            // InternalMyDsl.g:423:1: ( ( ( rule__Mensamodel__FooterAssignment_2 ) ) ( ( rule__Mensamodel__FooterAssignment_2 )* ) )
            {
            // InternalMyDsl.g:423:1: ( ( ( rule__Mensamodel__FooterAssignment_2 ) ) ( ( rule__Mensamodel__FooterAssignment_2 )* ) )
            // InternalMyDsl.g:424:2: ( ( rule__Mensamodel__FooterAssignment_2 ) ) ( ( rule__Mensamodel__FooterAssignment_2 )* )
            {
            // InternalMyDsl.g:424:2: ( ( rule__Mensamodel__FooterAssignment_2 ) )
            // InternalMyDsl.g:425:3: ( rule__Mensamodel__FooterAssignment_2 )
            {
             before(grammarAccess.getMensamodelAccess().getFooterAssignment_2()); 
            // InternalMyDsl.g:426:3: ( rule__Mensamodel__FooterAssignment_2 )
            // InternalMyDsl.g:426:4: rule__Mensamodel__FooterAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Mensamodel__FooterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getFooterAssignment_2()); 

            }

            // InternalMyDsl.g:429:2: ( ( rule__Mensamodel__FooterAssignment_2 )* )
            // InternalMyDsl.g:430:3: ( rule__Mensamodel__FooterAssignment_2 )*
            {
             before(grammarAccess.getMensamodelAccess().getFooterAssignment_2()); 
            // InternalMyDsl.g:431:3: ( rule__Mensamodel__FooterAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:431:4: rule__Mensamodel__FooterAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Mensamodel__FooterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMensamodelAccess().getFooterAssignment_2()); 

            }


            }


            }

        }
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
    // InternalMyDsl.g:440:1: rule__Mensamodel__Group__3 : rule__Mensamodel__Group__3__Impl ;
    public final void rule__Mensamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:444:1: ( rule__Mensamodel__Group__3__Impl )
            // InternalMyDsl.g:445:2: rule__Mensamodel__Group__3__Impl
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
    // InternalMyDsl.g:451:1: rule__Mensamodel__Group__3__Impl : ( ( ( rule__Mensamodel__MenusAssignment_3 ) ) ( ( rule__Mensamodel__MenusAssignment_3 )* ) ) ;
    public final void rule__Mensamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( ( ( ( rule__Mensamodel__MenusAssignment_3 ) ) ( ( rule__Mensamodel__MenusAssignment_3 )* ) ) )
            // InternalMyDsl.g:456:1: ( ( ( rule__Mensamodel__MenusAssignment_3 ) ) ( ( rule__Mensamodel__MenusAssignment_3 )* ) )
            {
            // InternalMyDsl.g:456:1: ( ( ( rule__Mensamodel__MenusAssignment_3 ) ) ( ( rule__Mensamodel__MenusAssignment_3 )* ) )
            // InternalMyDsl.g:457:2: ( ( rule__Mensamodel__MenusAssignment_3 ) ) ( ( rule__Mensamodel__MenusAssignment_3 )* )
            {
            // InternalMyDsl.g:457:2: ( ( rule__Mensamodel__MenusAssignment_3 ) )
            // InternalMyDsl.g:458:3: ( rule__Mensamodel__MenusAssignment_3 )
            {
             before(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 
            // InternalMyDsl.g:459:3: ( rule__Mensamodel__MenusAssignment_3 )
            // InternalMyDsl.g:459:4: rule__Mensamodel__MenusAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Mensamodel__MenusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 

            }

            // InternalMyDsl.g:462:2: ( ( rule__Mensamodel__MenusAssignment_3 )* )
            // InternalMyDsl.g:463:3: ( rule__Mensamodel__MenusAssignment_3 )*
            {
             before(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 
            // InternalMyDsl.g:464:3: ( rule__Mensamodel__MenusAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:464:4: rule__Mensamodel__MenusAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mensamodel__MenusAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMensamodelAccess().getMenusAssignment_3()); 

            }


            }


            }

        }
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
    // InternalMyDsl.g:474:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMyDsl.g:479:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:486:1: rule__Header__Group__0__Impl : ( 'header' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( ( 'header' ) )
            // InternalMyDsl.g:491:1: ( 'header' )
            {
            // InternalMyDsl.g:491:1: ( 'header' )
            // InternalMyDsl.g:492:2: 'header'
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
    // InternalMyDsl.g:501:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMyDsl.g:506:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:513:1: rule__Header__Group__1__Impl : ( ( rule__Header__NameAssignment_1 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( ( ( rule__Header__NameAssignment_1 ) ) )
            // InternalMyDsl.g:518:1: ( ( rule__Header__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:518:1: ( ( rule__Header__NameAssignment_1 ) )
            // InternalMyDsl.g:519:2: ( rule__Header__NameAssignment_1 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:520:2: ( rule__Header__NameAssignment_1 )
            // InternalMyDsl.g:520:3: rule__Header__NameAssignment_1
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
    // InternalMyDsl.g:528:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalMyDsl.g:533:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:540:1: rule__Header__Group__2__Impl : ( '{' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( ( '{' ) )
            // InternalMyDsl.g:545:1: ( '{' )
            {
            // InternalMyDsl.g:545:1: ( '{' )
            // InternalMyDsl.g:546:2: '{'
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
    // InternalMyDsl.g:555:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalMyDsl.g:560:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:567:1: rule__Header__Group__3__Impl : ( ( rule__Header__DescriptionAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( rule__Header__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:572:1: ( ( rule__Header__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:572:1: ( ( rule__Header__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:573:2: ( rule__Header__DescriptionAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:574:2: ( rule__Header__DescriptionAssignment_3 )
            // InternalMyDsl.g:574:3: rule__Header__DescriptionAssignment_3
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
    // InternalMyDsl.g:582:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // InternalMyDsl.g:587:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:594:1: rule__Header__Group__4__Impl : ( ( rule__Header__NavAssignment_4 )* ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__Header__NavAssignment_4 )* ) )
            // InternalMyDsl.g:599:1: ( ( rule__Header__NavAssignment_4 )* )
            {
            // InternalMyDsl.g:599:1: ( ( rule__Header__NavAssignment_4 )* )
            // InternalMyDsl.g:600:2: ( rule__Header__NavAssignment_4 )*
            {
             before(grammarAccess.getHeaderAccess().getNavAssignment_4()); 
            // InternalMyDsl.g:601:2: ( rule__Header__NavAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:601:3: rule__Header__NavAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Header__NavAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyDsl.g:609:1: rule__Header__Group__5 : rule__Header__Group__5__Impl ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( rule__Header__Group__5__Impl )
            // InternalMyDsl.g:614:2: rule__Header__Group__5__Impl
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
    // InternalMyDsl.g:620:1: rule__Header__Group__5__Impl : ( '}' ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( ( '}' ) )
            // InternalMyDsl.g:625:1: ( '}' )
            {
            // InternalMyDsl.g:625:1: ( '}' )
            // InternalMyDsl.g:626:2: '}'
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


    // $ANTLR start "rule__Sidebar__Group__0"
    // InternalMyDsl.g:636:1: rule__Sidebar__Group__0 : rule__Sidebar__Group__0__Impl rule__Sidebar__Group__1 ;
    public final void rule__Sidebar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( rule__Sidebar__Group__0__Impl rule__Sidebar__Group__1 )
            // InternalMyDsl.g:641:2: rule__Sidebar__Group__0__Impl rule__Sidebar__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Sidebar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__1();

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
    // $ANTLR end "rule__Sidebar__Group__0"


    // $ANTLR start "rule__Sidebar__Group__0__Impl"
    // InternalMyDsl.g:648:1: rule__Sidebar__Group__0__Impl : ( 'sidebar' ) ;
    public final void rule__Sidebar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( 'sidebar' ) )
            // InternalMyDsl.g:653:1: ( 'sidebar' )
            {
            // InternalMyDsl.g:653:1: ( 'sidebar' )
            // InternalMyDsl.g:654:2: 'sidebar'
            {
             before(grammarAccess.getSidebarAccess().getSidebarKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSidebarAccess().getSidebarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__0__Impl"


    // $ANTLR start "rule__Sidebar__Group__1"
    // InternalMyDsl.g:663:1: rule__Sidebar__Group__1 : rule__Sidebar__Group__1__Impl rule__Sidebar__Group__2 ;
    public final void rule__Sidebar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( rule__Sidebar__Group__1__Impl rule__Sidebar__Group__2 )
            // InternalMyDsl.g:668:2: rule__Sidebar__Group__1__Impl rule__Sidebar__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Sidebar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__2();

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
    // $ANTLR end "rule__Sidebar__Group__1"


    // $ANTLR start "rule__Sidebar__Group__1__Impl"
    // InternalMyDsl.g:675:1: rule__Sidebar__Group__1__Impl : ( ( rule__Sidebar__NameAssignment_1 ) ) ;
    public final void rule__Sidebar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( ( ( rule__Sidebar__NameAssignment_1 ) ) )
            // InternalMyDsl.g:680:1: ( ( rule__Sidebar__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:680:1: ( ( rule__Sidebar__NameAssignment_1 ) )
            // InternalMyDsl.g:681:2: ( rule__Sidebar__NameAssignment_1 )
            {
             before(grammarAccess.getSidebarAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:682:2: ( rule__Sidebar__NameAssignment_1 )
            // InternalMyDsl.g:682:3: rule__Sidebar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sidebar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSidebarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__1__Impl"


    // $ANTLR start "rule__Sidebar__Group__2"
    // InternalMyDsl.g:690:1: rule__Sidebar__Group__2 : rule__Sidebar__Group__2__Impl rule__Sidebar__Group__3 ;
    public final void rule__Sidebar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( rule__Sidebar__Group__2__Impl rule__Sidebar__Group__3 )
            // InternalMyDsl.g:695:2: rule__Sidebar__Group__2__Impl rule__Sidebar__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Sidebar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__3();

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
    // $ANTLR end "rule__Sidebar__Group__2"


    // $ANTLR start "rule__Sidebar__Group__2__Impl"
    // InternalMyDsl.g:702:1: rule__Sidebar__Group__2__Impl : ( '{' ) ;
    public final void rule__Sidebar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( '{' ) )
            // InternalMyDsl.g:707:1: ( '{' )
            {
            // InternalMyDsl.g:707:1: ( '{' )
            // InternalMyDsl.g:708:2: '{'
            {
             before(grammarAccess.getSidebarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSidebarAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__2__Impl"


    // $ANTLR start "rule__Sidebar__Group__3"
    // InternalMyDsl.g:717:1: rule__Sidebar__Group__3 : rule__Sidebar__Group__3__Impl rule__Sidebar__Group__4 ;
    public final void rule__Sidebar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( rule__Sidebar__Group__3__Impl rule__Sidebar__Group__4 )
            // InternalMyDsl.g:722:2: rule__Sidebar__Group__3__Impl rule__Sidebar__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Sidebar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__4();

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
    // $ANTLR end "rule__Sidebar__Group__3"


    // $ANTLR start "rule__Sidebar__Group__3__Impl"
    // InternalMyDsl.g:729:1: rule__Sidebar__Group__3__Impl : ( ( rule__Sidebar__DescriptionAssignment_3 ) ) ;
    public final void rule__Sidebar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( ( ( rule__Sidebar__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:734:1: ( ( rule__Sidebar__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:734:1: ( ( rule__Sidebar__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:735:2: ( rule__Sidebar__DescriptionAssignment_3 )
            {
             before(grammarAccess.getSidebarAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:736:2: ( rule__Sidebar__DescriptionAssignment_3 )
            // InternalMyDsl.g:736:3: rule__Sidebar__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sidebar__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSidebarAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__3__Impl"


    // $ANTLR start "rule__Sidebar__Group__4"
    // InternalMyDsl.g:744:1: rule__Sidebar__Group__4 : rule__Sidebar__Group__4__Impl rule__Sidebar__Group__5 ;
    public final void rule__Sidebar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( rule__Sidebar__Group__4__Impl rule__Sidebar__Group__5 )
            // InternalMyDsl.g:749:2: rule__Sidebar__Group__4__Impl rule__Sidebar__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Sidebar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__5();

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
    // $ANTLR end "rule__Sidebar__Group__4"


    // $ANTLR start "rule__Sidebar__Group__4__Impl"
    // InternalMyDsl.g:756:1: rule__Sidebar__Group__4__Impl : ( ( rule__Sidebar__RadioAssignment_4 )* ) ;
    public final void rule__Sidebar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( ( ( rule__Sidebar__RadioAssignment_4 )* ) )
            // InternalMyDsl.g:761:1: ( ( rule__Sidebar__RadioAssignment_4 )* )
            {
            // InternalMyDsl.g:761:1: ( ( rule__Sidebar__RadioAssignment_4 )* )
            // InternalMyDsl.g:762:2: ( rule__Sidebar__RadioAssignment_4 )*
            {
             before(grammarAccess.getSidebarAccess().getRadioAssignment_4()); 
            // InternalMyDsl.g:763:2: ( rule__Sidebar__RadioAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:763:3: rule__Sidebar__RadioAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Sidebar__RadioAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSidebarAccess().getRadioAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__4__Impl"


    // $ANTLR start "rule__Sidebar__Group__5"
    // InternalMyDsl.g:771:1: rule__Sidebar__Group__5 : rule__Sidebar__Group__5__Impl rule__Sidebar__Group__6 ;
    public final void rule__Sidebar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( rule__Sidebar__Group__5__Impl rule__Sidebar__Group__6 )
            // InternalMyDsl.g:776:2: rule__Sidebar__Group__5__Impl rule__Sidebar__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Sidebar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__6();

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
    // $ANTLR end "rule__Sidebar__Group__5"


    // $ANTLR start "rule__Sidebar__Group__5__Impl"
    // InternalMyDsl.g:783:1: rule__Sidebar__Group__5__Impl : ( ( rule__Sidebar__CheckboxAssignment_5 )* ) ;
    public final void rule__Sidebar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( ( rule__Sidebar__CheckboxAssignment_5 )* ) )
            // InternalMyDsl.g:788:1: ( ( rule__Sidebar__CheckboxAssignment_5 )* )
            {
            // InternalMyDsl.g:788:1: ( ( rule__Sidebar__CheckboxAssignment_5 )* )
            // InternalMyDsl.g:789:2: ( rule__Sidebar__CheckboxAssignment_5 )*
            {
             before(grammarAccess.getSidebarAccess().getCheckboxAssignment_5()); 
            // InternalMyDsl.g:790:2: ( rule__Sidebar__CheckboxAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:790:3: rule__Sidebar__CheckboxAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Sidebar__CheckboxAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSidebarAccess().getCheckboxAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__5__Impl"


    // $ANTLR start "rule__Sidebar__Group__6"
    // InternalMyDsl.g:798:1: rule__Sidebar__Group__6 : rule__Sidebar__Group__6__Impl rule__Sidebar__Group__7 ;
    public final void rule__Sidebar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( rule__Sidebar__Group__6__Impl rule__Sidebar__Group__7 )
            // InternalMyDsl.g:803:2: rule__Sidebar__Group__6__Impl rule__Sidebar__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Sidebar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__7();

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
    // $ANTLR end "rule__Sidebar__Group__6"


    // $ANTLR start "rule__Sidebar__Group__6__Impl"
    // InternalMyDsl.g:810:1: rule__Sidebar__Group__6__Impl : ( ( rule__Sidebar__SelectorAssignment_6 )* ) ;
    public final void rule__Sidebar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( ( ( rule__Sidebar__SelectorAssignment_6 )* ) )
            // InternalMyDsl.g:815:1: ( ( rule__Sidebar__SelectorAssignment_6 )* )
            {
            // InternalMyDsl.g:815:1: ( ( rule__Sidebar__SelectorAssignment_6 )* )
            // InternalMyDsl.g:816:2: ( rule__Sidebar__SelectorAssignment_6 )*
            {
             before(grammarAccess.getSidebarAccess().getSelectorAssignment_6()); 
            // InternalMyDsl.g:817:2: ( rule__Sidebar__SelectorAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:817:3: rule__Sidebar__SelectorAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Sidebar__SelectorAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSidebarAccess().getSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__6__Impl"


    // $ANTLR start "rule__Sidebar__Group__7"
    // InternalMyDsl.g:825:1: rule__Sidebar__Group__7 : rule__Sidebar__Group__7__Impl rule__Sidebar__Group__8 ;
    public final void rule__Sidebar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( rule__Sidebar__Group__7__Impl rule__Sidebar__Group__8 )
            // InternalMyDsl.g:830:2: rule__Sidebar__Group__7__Impl rule__Sidebar__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Sidebar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__8();

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
    // $ANTLR end "rule__Sidebar__Group__7"


    // $ANTLR start "rule__Sidebar__Group__7__Impl"
    // InternalMyDsl.g:837:1: rule__Sidebar__Group__7__Impl : ( ( rule__Sidebar__ButtonAssignment_7 )* ) ;
    public final void rule__Sidebar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ( rule__Sidebar__ButtonAssignment_7 )* ) )
            // InternalMyDsl.g:842:1: ( ( rule__Sidebar__ButtonAssignment_7 )* )
            {
            // InternalMyDsl.g:842:1: ( ( rule__Sidebar__ButtonAssignment_7 )* )
            // InternalMyDsl.g:843:2: ( rule__Sidebar__ButtonAssignment_7 )*
            {
             before(grammarAccess.getSidebarAccess().getButtonAssignment_7()); 
            // InternalMyDsl.g:844:2: ( rule__Sidebar__ButtonAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:844:3: rule__Sidebar__ButtonAssignment_7
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Sidebar__ButtonAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSidebarAccess().getButtonAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__7__Impl"


    // $ANTLR start "rule__Sidebar__Group__8"
    // InternalMyDsl.g:852:1: rule__Sidebar__Group__8 : rule__Sidebar__Group__8__Impl ;
    public final void rule__Sidebar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( rule__Sidebar__Group__8__Impl )
            // InternalMyDsl.g:857:2: rule__Sidebar__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sidebar__Group__8__Impl();

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
    // $ANTLR end "rule__Sidebar__Group__8"


    // $ANTLR start "rule__Sidebar__Group__8__Impl"
    // InternalMyDsl.g:863:1: rule__Sidebar__Group__8__Impl : ( '}' ) ;
    public final void rule__Sidebar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( '}' ) )
            // InternalMyDsl.g:868:1: ( '}' )
            {
            // InternalMyDsl.g:868:1: ( '}' )
            // InternalMyDsl.g:869:2: '}'
            {
             before(grammarAccess.getSidebarAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSidebarAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__Group__8__Impl"


    // $ANTLR start "rule__Footer__Group__0"
    // InternalMyDsl.g:879:1: rule__Footer__Group__0 : rule__Footer__Group__0__Impl rule__Footer__Group__1 ;
    public final void rule__Footer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( rule__Footer__Group__0__Impl rule__Footer__Group__1 )
            // InternalMyDsl.g:884:2: rule__Footer__Group__0__Impl rule__Footer__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:891:1: rule__Footer__Group__0__Impl : ( 'footer' ) ;
    public final void rule__Footer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( 'footer' ) )
            // InternalMyDsl.g:896:1: ( 'footer' )
            {
            // InternalMyDsl.g:896:1: ( 'footer' )
            // InternalMyDsl.g:897:2: 'footer'
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
    // InternalMyDsl.g:906:1: rule__Footer__Group__1 : rule__Footer__Group__1__Impl rule__Footer__Group__2 ;
    public final void rule__Footer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( rule__Footer__Group__1__Impl rule__Footer__Group__2 )
            // InternalMyDsl.g:911:2: rule__Footer__Group__1__Impl rule__Footer__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:918:1: rule__Footer__Group__1__Impl : ( ( rule__Footer__NameAssignment_1 ) ) ;
    public final void rule__Footer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ( rule__Footer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:923:1: ( ( rule__Footer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:923:1: ( ( rule__Footer__NameAssignment_1 ) )
            // InternalMyDsl.g:924:2: ( rule__Footer__NameAssignment_1 )
            {
             before(grammarAccess.getFooterAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:925:2: ( rule__Footer__NameAssignment_1 )
            // InternalMyDsl.g:925:3: rule__Footer__NameAssignment_1
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
    // InternalMyDsl.g:933:1: rule__Footer__Group__2 : rule__Footer__Group__2__Impl rule__Footer__Group__3 ;
    public final void rule__Footer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( rule__Footer__Group__2__Impl rule__Footer__Group__3 )
            // InternalMyDsl.g:938:2: rule__Footer__Group__2__Impl rule__Footer__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:945:1: rule__Footer__Group__2__Impl : ( '{' ) ;
    public final void rule__Footer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( ( '{' ) )
            // InternalMyDsl.g:950:1: ( '{' )
            {
            // InternalMyDsl.g:950:1: ( '{' )
            // InternalMyDsl.g:951:2: '{'
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
    // InternalMyDsl.g:960:1: rule__Footer__Group__3 : rule__Footer__Group__3__Impl rule__Footer__Group__4 ;
    public final void rule__Footer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( rule__Footer__Group__3__Impl rule__Footer__Group__4 )
            // InternalMyDsl.g:965:2: rule__Footer__Group__3__Impl rule__Footer__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:972:1: rule__Footer__Group__3__Impl : ( ( rule__Footer__DescriptionAssignment_3 ) ) ;
    public final void rule__Footer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( ( rule__Footer__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:977:1: ( ( rule__Footer__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:977:1: ( ( rule__Footer__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:978:2: ( rule__Footer__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFooterAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:979:2: ( rule__Footer__DescriptionAssignment_3 )
            // InternalMyDsl.g:979:3: rule__Footer__DescriptionAssignment_3
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
    // InternalMyDsl.g:987:1: rule__Footer__Group__4 : rule__Footer__Group__4__Impl rule__Footer__Group__5 ;
    public final void rule__Footer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( rule__Footer__Group__4__Impl rule__Footer__Group__5 )
            // InternalMyDsl.g:992:2: rule__Footer__Group__4__Impl rule__Footer__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:999:1: rule__Footer__Group__4__Impl : ( ( rule__Footer__LinksAssignment_4 )* ) ;
    public final void rule__Footer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( ( ( rule__Footer__LinksAssignment_4 )* ) )
            // InternalMyDsl.g:1004:1: ( ( rule__Footer__LinksAssignment_4 )* )
            {
            // InternalMyDsl.g:1004:1: ( ( rule__Footer__LinksAssignment_4 )* )
            // InternalMyDsl.g:1005:2: ( rule__Footer__LinksAssignment_4 )*
            {
             before(grammarAccess.getFooterAccess().getLinksAssignment_4()); 
            // InternalMyDsl.g:1006:2: ( rule__Footer__LinksAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1006:3: rule__Footer__LinksAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Footer__LinksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:1014:1: rule__Footer__Group__5 : rule__Footer__Group__5__Impl ;
    public final void rule__Footer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( rule__Footer__Group__5__Impl )
            // InternalMyDsl.g:1019:2: rule__Footer__Group__5__Impl
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
    // InternalMyDsl.g:1025:1: rule__Footer__Group__5__Impl : ( '}' ) ;
    public final void rule__Footer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1029:1: ( ( '}' ) )
            // InternalMyDsl.g:1030:1: ( '}' )
            {
            // InternalMyDsl.g:1030:1: ( '}' )
            // InternalMyDsl.g:1031:2: '}'
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
    // InternalMyDsl.g:1041:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalMyDsl.g:1046:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1053:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( 'description' ) )
            // InternalMyDsl.g:1058:1: ( 'description' )
            {
            // InternalMyDsl.g:1058:1: ( 'description' )
            // InternalMyDsl.g:1059:2: 'description'
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
    // InternalMyDsl.g:1068:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( rule__Description__Group__1__Impl )
            // InternalMyDsl.g:1073:2: rule__Description__Group__1__Impl
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
    // InternalMyDsl.g:1079:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1084:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1084:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalMyDsl.g:1085:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1086:2: ( rule__Description__NameAssignment_1 )
            // InternalMyDsl.g:1086:3: rule__Description__NameAssignment_1
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
    // InternalMyDsl.g:1095:1: rule__NAV__Group__0 : rule__NAV__Group__0__Impl rule__NAV__Group__1 ;
    public final void rule__NAV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( rule__NAV__Group__0__Impl rule__NAV__Group__1 )
            // InternalMyDsl.g:1100:2: rule__NAV__Group__0__Impl rule__NAV__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1107:1: rule__NAV__Group__0__Impl : ( 'nav' ) ;
    public final void rule__NAV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( 'nav' ) )
            // InternalMyDsl.g:1112:1: ( 'nav' )
            {
            // InternalMyDsl.g:1112:1: ( 'nav' )
            // InternalMyDsl.g:1113:2: 'nav'
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
    // InternalMyDsl.g:1122:1: rule__NAV__Group__1 : rule__NAV__Group__1__Impl rule__NAV__Group__2 ;
    public final void rule__NAV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( rule__NAV__Group__1__Impl rule__NAV__Group__2 )
            // InternalMyDsl.g:1127:2: rule__NAV__Group__1__Impl rule__NAV__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1134:1: rule__NAV__Group__1__Impl : ( ( rule__NAV__NameAssignment_1 ) ) ;
    public final void rule__NAV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( ( rule__NAV__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1139:1: ( ( rule__NAV__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1139:1: ( ( rule__NAV__NameAssignment_1 ) )
            // InternalMyDsl.g:1140:2: ( rule__NAV__NameAssignment_1 )
            {
             before(grammarAccess.getNAVAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1141:2: ( rule__NAV__NameAssignment_1 )
            // InternalMyDsl.g:1141:3: rule__NAV__NameAssignment_1
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
    // InternalMyDsl.g:1149:1: rule__NAV__Group__2 : rule__NAV__Group__2__Impl rule__NAV__Group__3 ;
    public final void rule__NAV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( rule__NAV__Group__2__Impl rule__NAV__Group__3 )
            // InternalMyDsl.g:1154:2: rule__NAV__Group__2__Impl rule__NAV__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1161:1: rule__NAV__Group__2__Impl : ( '{' ) ;
    public final void rule__NAV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( ( '{' ) )
            // InternalMyDsl.g:1166:1: ( '{' )
            {
            // InternalMyDsl.g:1166:1: ( '{' )
            // InternalMyDsl.g:1167:2: '{'
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
    // InternalMyDsl.g:1176:1: rule__NAV__Group__3 : rule__NAV__Group__3__Impl rule__NAV__Group__4 ;
    public final void rule__NAV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( rule__NAV__Group__3__Impl rule__NAV__Group__4 )
            // InternalMyDsl.g:1181:2: rule__NAV__Group__3__Impl rule__NAV__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1188:1: rule__NAV__Group__3__Impl : ( ( rule__NAV__DescriptionAssignment_3 ) ) ;
    public final void rule__NAV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ( rule__NAV__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:1193:1: ( ( rule__NAV__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:1193:1: ( ( rule__NAV__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:1194:2: ( rule__NAV__DescriptionAssignment_3 )
            {
             before(grammarAccess.getNAVAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:1195:2: ( rule__NAV__DescriptionAssignment_3 )
            // InternalMyDsl.g:1195:3: rule__NAV__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NAV__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNAVAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1203:1: rule__NAV__Group__4 : rule__NAV__Group__4__Impl rule__NAV__Group__5 ;
    public final void rule__NAV__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( rule__NAV__Group__4__Impl rule__NAV__Group__5 )
            // InternalMyDsl.g:1208:2: rule__NAV__Group__4__Impl rule__NAV__Group__5
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
    // InternalMyDsl.g:1215:1: rule__NAV__Group__4__Impl : ( 'href' ) ;
    public final void rule__NAV__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( 'href' ) )
            // InternalMyDsl.g:1220:1: ( 'href' )
            {
            // InternalMyDsl.g:1220:1: ( 'href' )
            // InternalMyDsl.g:1221:2: 'href'
            {
             before(grammarAccess.getNAVAccess().getHrefKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getHrefKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1230:1: rule__NAV__Group__5 : rule__NAV__Group__5__Impl rule__NAV__Group__6 ;
    public final void rule__NAV__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( rule__NAV__Group__5__Impl rule__NAV__Group__6 )
            // InternalMyDsl.g:1235:2: rule__NAV__Group__5__Impl rule__NAV__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__NAV__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAV__Group__6();

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
    // InternalMyDsl.g:1242:1: rule__NAV__Group__5__Impl : ( ( rule__NAV__HrefAssignment_5 ) ) ;
    public final void rule__NAV__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( ( ( rule__NAV__HrefAssignment_5 ) ) )
            // InternalMyDsl.g:1247:1: ( ( rule__NAV__HrefAssignment_5 ) )
            {
            // InternalMyDsl.g:1247:1: ( ( rule__NAV__HrefAssignment_5 ) )
            // InternalMyDsl.g:1248:2: ( rule__NAV__HrefAssignment_5 )
            {
             before(grammarAccess.getNAVAccess().getHrefAssignment_5()); 
            // InternalMyDsl.g:1249:2: ( rule__NAV__HrefAssignment_5 )
            // InternalMyDsl.g:1249:3: rule__NAV__HrefAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NAV__HrefAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNAVAccess().getHrefAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__NAV__Group__6"
    // InternalMyDsl.g:1257:1: rule__NAV__Group__6 : rule__NAV__Group__6__Impl ;
    public final void rule__NAV__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( rule__NAV__Group__6__Impl )
            // InternalMyDsl.g:1262:2: rule__NAV__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NAV__Group__6__Impl();

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
    // $ANTLR end "rule__NAV__Group__6"


    // $ANTLR start "rule__NAV__Group__6__Impl"
    // InternalMyDsl.g:1268:1: rule__NAV__Group__6__Impl : ( '}' ) ;
    public final void rule__NAV__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( '}' ) )
            // InternalMyDsl.g:1273:1: ( '}' )
            {
            // InternalMyDsl.g:1273:1: ( '}' )
            // InternalMyDsl.g:1274:2: '}'
            {
             before(grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAV__Group__6__Impl"


    // $ANTLR start "rule__Radio__Group__0"
    // InternalMyDsl.g:1284:1: rule__Radio__Group__0 : rule__Radio__Group__0__Impl rule__Radio__Group__1 ;
    public final void rule__Radio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( rule__Radio__Group__0__Impl rule__Radio__Group__1 )
            // InternalMyDsl.g:1289:2: rule__Radio__Group__0__Impl rule__Radio__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1296:1: rule__Radio__Group__0__Impl : ( 'radio' ) ;
    public final void rule__Radio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( 'radio' ) )
            // InternalMyDsl.g:1301:1: ( 'radio' )
            {
            // InternalMyDsl.g:1301:1: ( 'radio' )
            // InternalMyDsl.g:1302:2: 'radio'
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
    // InternalMyDsl.g:1311:1: rule__Radio__Group__1 : rule__Radio__Group__1__Impl rule__Radio__Group__2 ;
    public final void rule__Radio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( rule__Radio__Group__1__Impl rule__Radio__Group__2 )
            // InternalMyDsl.g:1316:2: rule__Radio__Group__1__Impl rule__Radio__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1323:1: rule__Radio__Group__1__Impl : ( ( rule__Radio__NameAssignment_1 ) ) ;
    public final void rule__Radio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( ( rule__Radio__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1328:1: ( ( rule__Radio__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1328:1: ( ( rule__Radio__NameAssignment_1 ) )
            // InternalMyDsl.g:1329:2: ( rule__Radio__NameAssignment_1 )
            {
             before(grammarAccess.getRadioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1330:2: ( rule__Radio__NameAssignment_1 )
            // InternalMyDsl.g:1330:3: rule__Radio__NameAssignment_1
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
    // InternalMyDsl.g:1338:1: rule__Radio__Group__2 : rule__Radio__Group__2__Impl rule__Radio__Group__3 ;
    public final void rule__Radio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( rule__Radio__Group__2__Impl rule__Radio__Group__3 )
            // InternalMyDsl.g:1343:2: rule__Radio__Group__2__Impl rule__Radio__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1350:1: rule__Radio__Group__2__Impl : ( '{' ) ;
    public final void rule__Radio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( ( '{' ) )
            // InternalMyDsl.g:1355:1: ( '{' )
            {
            // InternalMyDsl.g:1355:1: ( '{' )
            // InternalMyDsl.g:1356:2: '{'
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
    // InternalMyDsl.g:1365:1: rule__Radio__Group__3 : rule__Radio__Group__3__Impl rule__Radio__Group__4 ;
    public final void rule__Radio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( rule__Radio__Group__3__Impl rule__Radio__Group__4 )
            // InternalMyDsl.g:1370:2: rule__Radio__Group__3__Impl rule__Radio__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1377:1: rule__Radio__Group__3__Impl : ( ( rule__Radio__TitleAssignment_3 ) ) ;
    public final void rule__Radio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( ( ( rule__Radio__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1382:1: ( ( rule__Radio__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1382:1: ( ( rule__Radio__TitleAssignment_3 ) )
            // InternalMyDsl.g:1383:2: ( rule__Radio__TitleAssignment_3 )
            {
             before(grammarAccess.getRadioAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1384:2: ( rule__Radio__TitleAssignment_3 )
            // InternalMyDsl.g:1384:3: rule__Radio__TitleAssignment_3
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
    // InternalMyDsl.g:1392:1: rule__Radio__Group__4 : rule__Radio__Group__4__Impl rule__Radio__Group__5 ;
    public final void rule__Radio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( rule__Radio__Group__4__Impl rule__Radio__Group__5 )
            // InternalMyDsl.g:1397:2: rule__Radio__Group__4__Impl rule__Radio__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1404:1: rule__Radio__Group__4__Impl : ( ( rule__Radio__Group_4__0 )* ) ;
    public final void rule__Radio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ( rule__Radio__Group_4__0 )* ) )
            // InternalMyDsl.g:1409:1: ( ( rule__Radio__Group_4__0 )* )
            {
            // InternalMyDsl.g:1409:1: ( ( rule__Radio__Group_4__0 )* )
            // InternalMyDsl.g:1410:2: ( rule__Radio__Group_4__0 )*
            {
             before(grammarAccess.getRadioAccess().getGroup_4()); 
            // InternalMyDsl.g:1411:2: ( rule__Radio__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1411:3: rule__Radio__Group_4__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Radio__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1419:1: rule__Radio__Group__5 : rule__Radio__Group__5__Impl ;
    public final void rule__Radio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( rule__Radio__Group__5__Impl )
            // InternalMyDsl.g:1424:2: rule__Radio__Group__5__Impl
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
    // InternalMyDsl.g:1430:1: rule__Radio__Group__5__Impl : ( '}' ) ;
    public final void rule__Radio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( ( '}' ) )
            // InternalMyDsl.g:1435:1: ( '}' )
            {
            // InternalMyDsl.g:1435:1: ( '}' )
            // InternalMyDsl.g:1436:2: '}'
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
    // InternalMyDsl.g:1446:1: rule__Radio__Group_4__0 : rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1 ;
    public final void rule__Radio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1 )
            // InternalMyDsl.g:1451:2: rule__Radio__Group_4__0__Impl rule__Radio__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1458:1: rule__Radio__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Radio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( ( 'option' ) )
            // InternalMyDsl.g:1463:1: ( 'option' )
            {
            // InternalMyDsl.g:1463:1: ( 'option' )
            // InternalMyDsl.g:1464:2: 'option'
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
    // InternalMyDsl.g:1473:1: rule__Radio__Group_4__1 : rule__Radio__Group_4__1__Impl ;
    public final void rule__Radio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( rule__Radio__Group_4__1__Impl )
            // InternalMyDsl.g:1478:2: rule__Radio__Group_4__1__Impl
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
    // InternalMyDsl.g:1484:1: rule__Radio__Group_4__1__Impl : ( ( rule__Radio__OptionsAssignment_4_1 ) ) ;
    public final void rule__Radio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( ( rule__Radio__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1489:1: ( ( rule__Radio__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1489:1: ( ( rule__Radio__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:1490:2: ( rule__Radio__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getRadioAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:1491:2: ( rule__Radio__OptionsAssignment_4_1 )
            // InternalMyDsl.g:1491:3: rule__Radio__OptionsAssignment_4_1
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
    // InternalMyDsl.g:1500:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalMyDsl.g:1505:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1512:1: rule__Checkbox__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( ( 'checkbox' ) )
            // InternalMyDsl.g:1517:1: ( 'checkbox' )
            {
            // InternalMyDsl.g:1517:1: ( 'checkbox' )
            // InternalMyDsl.g:1518:2: 'checkbox'
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
    // InternalMyDsl.g:1527:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalMyDsl.g:1532:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1539:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__NameAssignment_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( ( ( rule__Checkbox__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1544:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1544:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            // InternalMyDsl.g:1545:2: ( rule__Checkbox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1546:2: ( rule__Checkbox__NameAssignment_1 )
            // InternalMyDsl.g:1546:3: rule__Checkbox__NameAssignment_1
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
    // InternalMyDsl.g:1554:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalMyDsl.g:1559:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1566:1: rule__Checkbox__Group__2__Impl : ( '{' ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( ( '{' ) )
            // InternalMyDsl.g:1571:1: ( '{' )
            {
            // InternalMyDsl.g:1571:1: ( '{' )
            // InternalMyDsl.g:1572:2: '{'
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
    // InternalMyDsl.g:1581:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 )
            // InternalMyDsl.g:1586:2: rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1593:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__TitleAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( ( ( rule__Checkbox__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1598:1: ( ( rule__Checkbox__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1598:1: ( ( rule__Checkbox__TitleAssignment_3 ) )
            // InternalMyDsl.g:1599:2: ( rule__Checkbox__TitleAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1600:2: ( rule__Checkbox__TitleAssignment_3 )
            // InternalMyDsl.g:1600:3: rule__Checkbox__TitleAssignment_3
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
    // InternalMyDsl.g:1608:1: rule__Checkbox__Group__4 : rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5 ;
    public final void rule__Checkbox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5 )
            // InternalMyDsl.g:1613:2: rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1620:1: rule__Checkbox__Group__4__Impl : ( ( rule__Checkbox__Group_4__0 )* ) ;
    public final void rule__Checkbox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( ( ( rule__Checkbox__Group_4__0 )* ) )
            // InternalMyDsl.g:1625:1: ( ( rule__Checkbox__Group_4__0 )* )
            {
            // InternalMyDsl.g:1625:1: ( ( rule__Checkbox__Group_4__0 )* )
            // InternalMyDsl.g:1626:2: ( rule__Checkbox__Group_4__0 )*
            {
             before(grammarAccess.getCheckboxAccess().getGroup_4()); 
            // InternalMyDsl.g:1627:2: ( rule__Checkbox__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1627:3: rule__Checkbox__Group_4__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Checkbox__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1635:1: rule__Checkbox__Group__5 : rule__Checkbox__Group__5__Impl ;
    public final void rule__Checkbox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( rule__Checkbox__Group__5__Impl )
            // InternalMyDsl.g:1640:2: rule__Checkbox__Group__5__Impl
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
    // InternalMyDsl.g:1646:1: rule__Checkbox__Group__5__Impl : ( '}' ) ;
    public final void rule__Checkbox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( '}' ) )
            // InternalMyDsl.g:1651:1: ( '}' )
            {
            // InternalMyDsl.g:1651:1: ( '}' )
            // InternalMyDsl.g:1652:2: '}'
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
    // InternalMyDsl.g:1662:1: rule__Checkbox__Group_4__0 : rule__Checkbox__Group_4__0__Impl rule__Checkbox__Group_4__1 ;
    public final void rule__Checkbox__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( rule__Checkbox__Group_4__0__Impl rule__Checkbox__Group_4__1 )
            // InternalMyDsl.g:1667:2: rule__Checkbox__Group_4__0__Impl rule__Checkbox__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1674:1: rule__Checkbox__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Checkbox__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( ( 'option' ) )
            // InternalMyDsl.g:1679:1: ( 'option' )
            {
            // InternalMyDsl.g:1679:1: ( 'option' )
            // InternalMyDsl.g:1680:2: 'option'
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
    // InternalMyDsl.g:1689:1: rule__Checkbox__Group_4__1 : rule__Checkbox__Group_4__1__Impl ;
    public final void rule__Checkbox__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( rule__Checkbox__Group_4__1__Impl )
            // InternalMyDsl.g:1694:2: rule__Checkbox__Group_4__1__Impl
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
    // InternalMyDsl.g:1700:1: rule__Checkbox__Group_4__1__Impl : ( ( rule__Checkbox__OptionsAssignment_4_1 ) ) ;
    public final void rule__Checkbox__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( ( rule__Checkbox__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1705:1: ( ( rule__Checkbox__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1705:1: ( ( rule__Checkbox__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:1706:2: ( rule__Checkbox__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getCheckboxAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:1707:2: ( rule__Checkbox__OptionsAssignment_4_1 )
            // InternalMyDsl.g:1707:3: rule__Checkbox__OptionsAssignment_4_1
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
    // InternalMyDsl.g:1716:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:1721:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1728:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( ( 'button' ) )
            // InternalMyDsl.g:1733:1: ( 'button' )
            {
            // InternalMyDsl.g:1733:1: ( 'button' )
            // InternalMyDsl.g:1734:2: 'button'
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
    // InternalMyDsl.g:1743:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:1748:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1755:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1760:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1760:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalMyDsl.g:1761:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1762:2: ( rule__Button__NameAssignment_1 )
            // InternalMyDsl.g:1762:3: rule__Button__NameAssignment_1
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
    // InternalMyDsl.g:1770:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:1775:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1782:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( ( '{' ) )
            // InternalMyDsl.g:1787:1: ( '{' )
            {
            // InternalMyDsl.g:1787:1: ( '{' )
            // InternalMyDsl.g:1788:2: '{'
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
    // InternalMyDsl.g:1797:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:1802:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1809:1: rule__Button__Group__3__Impl : ( ( rule__Button__TitleAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( ( ( rule__Button__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:1814:1: ( ( rule__Button__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:1814:1: ( ( rule__Button__TitleAssignment_3 ) )
            // InternalMyDsl.g:1815:2: ( rule__Button__TitleAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:1816:2: ( rule__Button__TitleAssignment_3 )
            // InternalMyDsl.g:1816:3: rule__Button__TitleAssignment_3
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
    // InternalMyDsl.g:1824:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalMyDsl.g:1829:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1836:1: rule__Button__Group__4__Impl : ( 'href' ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( ( 'href' ) )
            // InternalMyDsl.g:1841:1: ( 'href' )
            {
            // InternalMyDsl.g:1841:1: ( 'href' )
            // InternalMyDsl.g:1842:2: 'href'
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
    // InternalMyDsl.g:1851:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalMyDsl.g:1856:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1863:1: rule__Button__Group__5__Impl : ( ( rule__Button__HrefAssignment_5 ) ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( ( ( rule__Button__HrefAssignment_5 ) ) )
            // InternalMyDsl.g:1868:1: ( ( rule__Button__HrefAssignment_5 ) )
            {
            // InternalMyDsl.g:1868:1: ( ( rule__Button__HrefAssignment_5 ) )
            // InternalMyDsl.g:1869:2: ( rule__Button__HrefAssignment_5 )
            {
             before(grammarAccess.getButtonAccess().getHrefAssignment_5()); 
            // InternalMyDsl.g:1870:2: ( rule__Button__HrefAssignment_5 )
            // InternalMyDsl.g:1870:3: rule__Button__HrefAssignment_5
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
    // InternalMyDsl.g:1878:1: rule__Button__Group__6 : rule__Button__Group__6__Impl ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( rule__Button__Group__6__Impl )
            // InternalMyDsl.g:1883:2: rule__Button__Group__6__Impl
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
    // InternalMyDsl.g:1889:1: rule__Button__Group__6__Impl : ( '}' ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( ( '}' ) )
            // InternalMyDsl.g:1894:1: ( '}' )
            {
            // InternalMyDsl.g:1894:1: ( '}' )
            // InternalMyDsl.g:1895:2: '}'
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
    // InternalMyDsl.g:1905:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMyDsl.g:1910:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1917:1: rule__Selector__Group__0__Impl : ( 'selector' ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( ( 'selector' ) )
            // InternalMyDsl.g:1922:1: ( 'selector' )
            {
            // InternalMyDsl.g:1922:1: ( 'selector' )
            // InternalMyDsl.g:1923:2: 'selector'
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
    // InternalMyDsl.g:1932:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMyDsl.g:1937:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1944:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__NameAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( ( rule__Selector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1949:1: ( ( rule__Selector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1949:1: ( ( rule__Selector__NameAssignment_1 ) )
            // InternalMyDsl.g:1950:2: ( rule__Selector__NameAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1951:2: ( rule__Selector__NameAssignment_1 )
            // InternalMyDsl.g:1951:3: rule__Selector__NameAssignment_1
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
    // InternalMyDsl.g:1959:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMyDsl.g:1964:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1971:1: rule__Selector__Group__2__Impl : ( '{' ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( '{' ) )
            // InternalMyDsl.g:1976:1: ( '{' )
            {
            // InternalMyDsl.g:1976:1: ( '{' )
            // InternalMyDsl.g:1977:2: '{'
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
    // InternalMyDsl.g:1986:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMyDsl.g:1991:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1998:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__TitleAssignment_3 ) ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( ( rule__Selector__TitleAssignment_3 ) ) )
            // InternalMyDsl.g:2003:1: ( ( rule__Selector__TitleAssignment_3 ) )
            {
            // InternalMyDsl.g:2003:1: ( ( rule__Selector__TitleAssignment_3 ) )
            // InternalMyDsl.g:2004:2: ( rule__Selector__TitleAssignment_3 )
            {
             before(grammarAccess.getSelectorAccess().getTitleAssignment_3()); 
            // InternalMyDsl.g:2005:2: ( rule__Selector__TitleAssignment_3 )
            // InternalMyDsl.g:2005:3: rule__Selector__TitleAssignment_3
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
    // InternalMyDsl.g:2013:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalMyDsl.g:2018:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2025:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )* ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( ( ( rule__Selector__Group_4__0 )* ) )
            // InternalMyDsl.g:2030:1: ( ( rule__Selector__Group_4__0 )* )
            {
            // InternalMyDsl.g:2030:1: ( ( rule__Selector__Group_4__0 )* )
            // InternalMyDsl.g:2031:2: ( rule__Selector__Group_4__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalMyDsl.g:2032:2: ( rule__Selector__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2032:3: rule__Selector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Selector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2040:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( rule__Selector__Group__5__Impl )
            // InternalMyDsl.g:2045:2: rule__Selector__Group__5__Impl
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
    // InternalMyDsl.g:2051:1: rule__Selector__Group__5__Impl : ( '}' ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2055:1: ( ( '}' ) )
            // InternalMyDsl.g:2056:1: ( '}' )
            {
            // InternalMyDsl.g:2056:1: ( '}' )
            // InternalMyDsl.g:2057:2: '}'
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
    // InternalMyDsl.g:2067:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalMyDsl.g:2072:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2079:1: rule__Selector__Group_4__0__Impl : ( 'option' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( ( 'option' ) )
            // InternalMyDsl.g:2084:1: ( 'option' )
            {
            // InternalMyDsl.g:2084:1: ( 'option' )
            // InternalMyDsl.g:2085:2: 'option'
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
    // InternalMyDsl.g:2094:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( rule__Selector__Group_4__1__Impl )
            // InternalMyDsl.g:2099:2: rule__Selector__Group_4__1__Impl
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
    // InternalMyDsl.g:2105:1: rule__Selector__Group_4__1__Impl : ( ( rule__Selector__OptionsAssignment_4_1 ) ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ( rule__Selector__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2110:1: ( ( rule__Selector__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2110:1: ( ( rule__Selector__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:2111:2: ( rule__Selector__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getSelectorAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:2112:2: ( rule__Selector__OptionsAssignment_4_1 )
            // InternalMyDsl.g:2112:3: rule__Selector__OptionsAssignment_4_1
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
    // InternalMyDsl.g:2121:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:2126:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2133:1: rule__Link__Group__0__Impl : ( 'link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( ( 'link' ) )
            // InternalMyDsl.g:2138:1: ( 'link' )
            {
            // InternalMyDsl.g:2138:1: ( 'link' )
            // InternalMyDsl.g:2139:2: 'link'
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
    // InternalMyDsl.g:2148:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:2153:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2160:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2165:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2165:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:2166:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2167:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:2167:3: rule__Link__NameAssignment_1
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
    // InternalMyDsl.g:2175:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2179:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:2180:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2187:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( ( '{' ) )
            // InternalMyDsl.g:2192:1: ( '{' )
            {
            // InternalMyDsl.g:2192:1: ( '{' )
            // InternalMyDsl.g:2193:2: '{'
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
    // InternalMyDsl.g:2202:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:2207:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2214:1: rule__Link__Group__3__Impl : ( ( rule__Link__DescriptionAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( ( rule__Link__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:2219:1: ( ( rule__Link__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:2219:1: ( ( rule__Link__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:2220:2: ( rule__Link__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:2221:2: ( rule__Link__DescriptionAssignment_3 )
            // InternalMyDsl.g:2221:3: rule__Link__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2229:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:2234:2: rule__Link__Group__4__Impl rule__Link__Group__5
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
    // InternalMyDsl.g:2241:1: rule__Link__Group__4__Impl : ( 'url' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( ( 'url' ) )
            // InternalMyDsl.g:2246:1: ( 'url' )
            {
            // InternalMyDsl.g:2246:1: ( 'url' )
            // InternalMyDsl.g:2247:2: 'url'
            {
             before(grammarAccess.getLinkAccess().getUrlKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:2256:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2260:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalMyDsl.g:2261:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

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
    // InternalMyDsl.g:2268:1: rule__Link__Group__5__Impl : ( ( rule__Link__UrlAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( ( ( rule__Link__UrlAssignment_5 ) ) )
            // InternalMyDsl.g:2273:1: ( ( rule__Link__UrlAssignment_5 ) )
            {
            // InternalMyDsl.g:2273:1: ( ( rule__Link__UrlAssignment_5 ) )
            // InternalMyDsl.g:2274:2: ( rule__Link__UrlAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_5()); 
            // InternalMyDsl.g:2275:2: ( rule__Link__UrlAssignment_5 )
            // InternalMyDsl.g:2275:3: rule__Link__UrlAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__UrlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group__6"
    // InternalMyDsl.g:2283:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( rule__Link__Group__6__Impl )
            // InternalMyDsl.g:2288:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__6__Impl();

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
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalMyDsl.g:2294:1: rule__Link__Group__6__Impl : ( '}' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( '}' ) )
            // InternalMyDsl.g:2299:1: ( '}' )
            {
            // InternalMyDsl.g:2299:1: ( '}' )
            // InternalMyDsl.g:2300:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Menu__Group__0"
    // InternalMyDsl.g:2310:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2314:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalMyDsl.g:2315:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2322:1: rule__Menu__Group__0__Impl : ( 'menu' ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( ( 'menu' ) )
            // InternalMyDsl.g:2327:1: ( 'menu' )
            {
            // InternalMyDsl.g:2327:1: ( 'menu' )
            // InternalMyDsl.g:2328:2: 'menu'
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
    // InternalMyDsl.g:2337:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2341:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalMyDsl.g:2342:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2349:1: rule__Menu__Group__1__Impl : ( ( rule__Menu__NameAssignment_1 ) ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( ( ( rule__Menu__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2354:1: ( ( rule__Menu__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2354:1: ( ( rule__Menu__NameAssignment_1 ) )
            // InternalMyDsl.g:2355:2: ( rule__Menu__NameAssignment_1 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2356:2: ( rule__Menu__NameAssignment_1 )
            // InternalMyDsl.g:2356:3: rule__Menu__NameAssignment_1
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
    // InternalMyDsl.g:2364:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2368:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalMyDsl.g:2369:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2376:1: rule__Menu__Group__2__Impl : ( '{' ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( ( '{' ) )
            // InternalMyDsl.g:2381:1: ( '{' )
            {
            // InternalMyDsl.g:2381:1: ( '{' )
            // InternalMyDsl.g:2382:2: '{'
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
    // InternalMyDsl.g:2391:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2395:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalMyDsl.g:2396:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2403:1: rule__Menu__Group__3__Impl : ( 'name' ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( ( 'name' ) )
            // InternalMyDsl.g:2408:1: ( 'name' )
            {
            // InternalMyDsl.g:2408:1: ( 'name' )
            // InternalMyDsl.g:2409:2: 'name'
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
    // InternalMyDsl.g:2418:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2422:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalMyDsl.g:2423:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2430:1: rule__Menu__Group__4__Impl : ( ( rule__Menu__MealAssignment_4 ) ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( ( ( rule__Menu__MealAssignment_4 ) ) )
            // InternalMyDsl.g:2435:1: ( ( rule__Menu__MealAssignment_4 ) )
            {
            // InternalMyDsl.g:2435:1: ( ( rule__Menu__MealAssignment_4 ) )
            // InternalMyDsl.g:2436:2: ( rule__Menu__MealAssignment_4 )
            {
             before(grammarAccess.getMenuAccess().getMealAssignment_4()); 
            // InternalMyDsl.g:2437:2: ( rule__Menu__MealAssignment_4 )
            // InternalMyDsl.g:2437:3: rule__Menu__MealAssignment_4
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
    // InternalMyDsl.g:2445:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl rule__Menu__Group__6 ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2449:1: ( rule__Menu__Group__5__Impl rule__Menu__Group__6 )
            // InternalMyDsl.g:2450:2: rule__Menu__Group__5__Impl rule__Menu__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2457:1: rule__Menu__Group__5__Impl : ( ( rule__Menu__DescriptionAssignment_5 ) ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( ( ( rule__Menu__DescriptionAssignment_5 ) ) )
            // InternalMyDsl.g:2462:1: ( ( rule__Menu__DescriptionAssignment_5 ) )
            {
            // InternalMyDsl.g:2462:1: ( ( rule__Menu__DescriptionAssignment_5 ) )
            // InternalMyDsl.g:2463:2: ( rule__Menu__DescriptionAssignment_5 )
            {
             before(grammarAccess.getMenuAccess().getDescriptionAssignment_5()); 
            // InternalMyDsl.g:2464:2: ( rule__Menu__DescriptionAssignment_5 )
            // InternalMyDsl.g:2464:3: rule__Menu__DescriptionAssignment_5
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
    // InternalMyDsl.g:2472:1: rule__Menu__Group__6 : rule__Menu__Group__6__Impl rule__Menu__Group__7 ;
    public final void rule__Menu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( rule__Menu__Group__6__Impl rule__Menu__Group__7 )
            // InternalMyDsl.g:2477:2: rule__Menu__Group__6__Impl rule__Menu__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2484:1: rule__Menu__Group__6__Impl : ( 'price' ) ;
    public final void rule__Menu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( ( 'price' ) )
            // InternalMyDsl.g:2489:1: ( 'price' )
            {
            // InternalMyDsl.g:2489:1: ( 'price' )
            // InternalMyDsl.g:2490:2: 'price'
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
    // InternalMyDsl.g:2499:1: rule__Menu__Group__7 : rule__Menu__Group__7__Impl rule__Menu__Group__8 ;
    public final void rule__Menu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2503:1: ( rule__Menu__Group__7__Impl rule__Menu__Group__8 )
            // InternalMyDsl.g:2504:2: rule__Menu__Group__7__Impl rule__Menu__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2511:1: rule__Menu__Group__7__Impl : ( ( rule__Menu__PriceAssignment_7 ) ) ;
    public final void rule__Menu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( ( ( rule__Menu__PriceAssignment_7 ) ) )
            // InternalMyDsl.g:2516:1: ( ( rule__Menu__PriceAssignment_7 ) )
            {
            // InternalMyDsl.g:2516:1: ( ( rule__Menu__PriceAssignment_7 ) )
            // InternalMyDsl.g:2517:2: ( rule__Menu__PriceAssignment_7 )
            {
             before(grammarAccess.getMenuAccess().getPriceAssignment_7()); 
            // InternalMyDsl.g:2518:2: ( rule__Menu__PriceAssignment_7 )
            // InternalMyDsl.g:2518:3: rule__Menu__PriceAssignment_7
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
    // InternalMyDsl.g:2526:1: rule__Menu__Group__8 : rule__Menu__Group__8__Impl rule__Menu__Group__9 ;
    public final void rule__Menu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2530:1: ( rule__Menu__Group__8__Impl rule__Menu__Group__9 )
            // InternalMyDsl.g:2531:2: rule__Menu__Group__8__Impl rule__Menu__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2538:1: rule__Menu__Group__8__Impl : ( 'image' ) ;
    public final void rule__Menu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( ( 'image' ) )
            // InternalMyDsl.g:2543:1: ( 'image' )
            {
            // InternalMyDsl.g:2543:1: ( 'image' )
            // InternalMyDsl.g:2544:2: 'image'
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
    // InternalMyDsl.g:2553:1: rule__Menu__Group__9 : rule__Menu__Group__9__Impl rule__Menu__Group__10 ;
    public final void rule__Menu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2557:1: ( rule__Menu__Group__9__Impl rule__Menu__Group__10 )
            // InternalMyDsl.g:2558:2: rule__Menu__Group__9__Impl rule__Menu__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2565:1: rule__Menu__Group__9__Impl : ( ( rule__Menu__ImageAssignment_9 ) ) ;
    public final void rule__Menu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( ( ( rule__Menu__ImageAssignment_9 ) ) )
            // InternalMyDsl.g:2570:1: ( ( rule__Menu__ImageAssignment_9 ) )
            {
            // InternalMyDsl.g:2570:1: ( ( rule__Menu__ImageAssignment_9 ) )
            // InternalMyDsl.g:2571:2: ( rule__Menu__ImageAssignment_9 )
            {
             before(grammarAccess.getMenuAccess().getImageAssignment_9()); 
            // InternalMyDsl.g:2572:2: ( rule__Menu__ImageAssignment_9 )
            // InternalMyDsl.g:2572:3: rule__Menu__ImageAssignment_9
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
    // InternalMyDsl.g:2580:1: rule__Menu__Group__10 : rule__Menu__Group__10__Impl ;
    public final void rule__Menu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2584:1: ( rule__Menu__Group__10__Impl )
            // InternalMyDsl.g:2585:2: rule__Menu__Group__10__Impl
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
    // InternalMyDsl.g:2591:1: rule__Menu__Group__10__Impl : ( '}' ) ;
    public final void rule__Menu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( ( '}' ) )
            // InternalMyDsl.g:2596:1: ( '}' )
            {
            // InternalMyDsl.g:2596:1: ( '}' )
            // InternalMyDsl.g:2597:2: '}'
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
    // InternalMyDsl.g:2607:1: rule__Mensamodel__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Mensamodel__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( ( ruleHeader ) )
            // InternalMyDsl.g:2612:2: ( ruleHeader )
            {
            // InternalMyDsl.g:2612:2: ( ruleHeader )
            // InternalMyDsl.g:2613:3: ruleHeader
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


    // $ANTLR start "rule__Mensamodel__SidebarAssignment_1"
    // InternalMyDsl.g:2622:1: rule__Mensamodel__SidebarAssignment_1 : ( ruleSidebar ) ;
    public final void rule__Mensamodel__SidebarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( ruleSidebar ) )
            // InternalMyDsl.g:2627:2: ( ruleSidebar )
            {
            // InternalMyDsl.g:2627:2: ( ruleSidebar )
            // InternalMyDsl.g:2628:3: ruleSidebar
            {
             before(grammarAccess.getMensamodelAccess().getSidebarSidebarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSidebar();

            state._fsp--;

             after(grammarAccess.getMensamodelAccess().getSidebarSidebarParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mensamodel__SidebarAssignment_1"


    // $ANTLR start "rule__Mensamodel__FooterAssignment_2"
    // InternalMyDsl.g:2637:1: rule__Mensamodel__FooterAssignment_2 : ( ruleFooter ) ;
    public final void rule__Mensamodel__FooterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( ruleFooter ) )
            // InternalMyDsl.g:2642:2: ( ruleFooter )
            {
            // InternalMyDsl.g:2642:2: ( ruleFooter )
            // InternalMyDsl.g:2643:3: ruleFooter
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
    // InternalMyDsl.g:2652:1: rule__Mensamodel__MenusAssignment_3 : ( ruleMenu ) ;
    public final void rule__Mensamodel__MenusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( ruleMenu ) )
            // InternalMyDsl.g:2657:2: ( ruleMenu )
            {
            // InternalMyDsl.g:2657:2: ( ruleMenu )
            // InternalMyDsl.g:2658:3: ruleMenu
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
    // InternalMyDsl.g:2667:1: rule__Header__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Header__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2672:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2672:2: ( RULE_ID )
            // InternalMyDsl.g:2673:3: RULE_ID
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
    // InternalMyDsl.g:2682:1: rule__Header__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Header__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2687:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2687:2: ( ruleDescription )
            // InternalMyDsl.g:2688:3: ruleDescription
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
    // InternalMyDsl.g:2697:1: rule__Header__NavAssignment_4 : ( ruleNAV ) ;
    public final void rule__Header__NavAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( ( ruleNAV ) )
            // InternalMyDsl.g:2702:2: ( ruleNAV )
            {
            // InternalMyDsl.g:2702:2: ( ruleNAV )
            // InternalMyDsl.g:2703:3: ruleNAV
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


    // $ANTLR start "rule__Sidebar__NameAssignment_1"
    // InternalMyDsl.g:2712:1: rule__Sidebar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sidebar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2717:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2717:2: ( RULE_ID )
            // InternalMyDsl.g:2718:3: RULE_ID
            {
             before(grammarAccess.getSidebarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSidebarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__NameAssignment_1"


    // $ANTLR start "rule__Sidebar__DescriptionAssignment_3"
    // InternalMyDsl.g:2727:1: rule__Sidebar__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Sidebar__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2732:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2732:2: ( ruleDescription )
            // InternalMyDsl.g:2733:3: ruleDescription
            {
             before(grammarAccess.getSidebarAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getSidebarAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__DescriptionAssignment_3"


    // $ANTLR start "rule__Sidebar__RadioAssignment_4"
    // InternalMyDsl.g:2742:1: rule__Sidebar__RadioAssignment_4 : ( ruleRadio ) ;
    public final void rule__Sidebar__RadioAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2746:1: ( ( ruleRadio ) )
            // InternalMyDsl.g:2747:2: ( ruleRadio )
            {
            // InternalMyDsl.g:2747:2: ( ruleRadio )
            // InternalMyDsl.g:2748:3: ruleRadio
            {
             before(grammarAccess.getSidebarAccess().getRadioRadioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRadio();

            state._fsp--;

             after(grammarAccess.getSidebarAccess().getRadioRadioParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__RadioAssignment_4"


    // $ANTLR start "rule__Sidebar__CheckboxAssignment_5"
    // InternalMyDsl.g:2757:1: rule__Sidebar__CheckboxAssignment_5 : ( ruleCheckbox ) ;
    public final void rule__Sidebar__CheckboxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2761:1: ( ( ruleCheckbox ) )
            // InternalMyDsl.g:2762:2: ( ruleCheckbox )
            {
            // InternalMyDsl.g:2762:2: ( ruleCheckbox )
            // InternalMyDsl.g:2763:3: ruleCheckbox
            {
             before(grammarAccess.getSidebarAccess().getCheckboxCheckboxParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getSidebarAccess().getCheckboxCheckboxParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__CheckboxAssignment_5"


    // $ANTLR start "rule__Sidebar__SelectorAssignment_6"
    // InternalMyDsl.g:2772:1: rule__Sidebar__SelectorAssignment_6 : ( ruleSelector ) ;
    public final void rule__Sidebar__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( ( ruleSelector ) )
            // InternalMyDsl.g:2777:2: ( ruleSelector )
            {
            // InternalMyDsl.g:2777:2: ( ruleSelector )
            // InternalMyDsl.g:2778:3: ruleSelector
            {
             before(grammarAccess.getSidebarAccess().getSelectorSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSidebarAccess().getSelectorSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__SelectorAssignment_6"


    // $ANTLR start "rule__Sidebar__ButtonAssignment_7"
    // InternalMyDsl.g:2787:1: rule__Sidebar__ButtonAssignment_7 : ( ruleButton ) ;
    public final void rule__Sidebar__ButtonAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( ruleButton ) )
            // InternalMyDsl.g:2792:2: ( ruleButton )
            {
            // InternalMyDsl.g:2792:2: ( ruleButton )
            // InternalMyDsl.g:2793:3: ruleButton
            {
             before(grammarAccess.getSidebarAccess().getButtonButtonParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getSidebarAccess().getButtonButtonParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sidebar__ButtonAssignment_7"


    // $ANTLR start "rule__Footer__NameAssignment_1"
    // InternalMyDsl.g:2802:1: rule__Footer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Footer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2807:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2807:2: ( RULE_ID )
            // InternalMyDsl.g:2808:3: RULE_ID
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
    // InternalMyDsl.g:2817:1: rule__Footer__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Footer__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2822:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2822:2: ( ruleDescription )
            // InternalMyDsl.g:2823:3: ruleDescription
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
    // InternalMyDsl.g:2832:1: rule__Footer__LinksAssignment_4 : ( ruleLink ) ;
    public final void rule__Footer__LinksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( ( ruleLink ) )
            // InternalMyDsl.g:2837:2: ( ruleLink )
            {
            // InternalMyDsl.g:2837:2: ( ruleLink )
            // InternalMyDsl.g:2838:3: ruleLink
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
    // InternalMyDsl.g:2847:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2852:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2852:2: ( RULE_STRING )
            // InternalMyDsl.g:2853:3: RULE_STRING
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
    // InternalMyDsl.g:2862:1: rule__NAV__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NAV__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2867:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2867:2: ( RULE_ID )
            // InternalMyDsl.g:2868:3: RULE_ID
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


    // $ANTLR start "rule__NAV__DescriptionAssignment_3"
    // InternalMyDsl.g:2877:1: rule__NAV__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__NAV__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2881:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2882:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2882:2: ( ruleDescription )
            // InternalMyDsl.g:2883:3: ruleDescription
            {
             before(grammarAccess.getNAVAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getNAVAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAV__DescriptionAssignment_3"


    // $ANTLR start "rule__NAV__HrefAssignment_5"
    // InternalMyDsl.g:2892:1: rule__NAV__HrefAssignment_5 : ( RULE_STRING ) ;
    public final void rule__NAV__HrefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2896:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2897:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2897:2: ( RULE_STRING )
            // InternalMyDsl.g:2898:3: RULE_STRING
            {
             before(grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAV__HrefAssignment_5"


    // $ANTLR start "rule__Radio__NameAssignment_1"
    // InternalMyDsl.g:2907:1: rule__Radio__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Radio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2912:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2912:2: ( RULE_ID )
            // InternalMyDsl.g:2913:3: RULE_ID
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
    // InternalMyDsl.g:2922:1: rule__Radio__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Radio__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2927:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2927:2: ( ruleDescription )
            // InternalMyDsl.g:2928:3: ruleDescription
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
    // InternalMyDsl.g:2937:1: rule__Radio__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Radio__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2942:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2942:2: ( RULE_STRING )
            // InternalMyDsl.g:2943:3: RULE_STRING
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
    // InternalMyDsl.g:2952:1: rule__Checkbox__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Checkbox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2957:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2957:2: ( RULE_ID )
            // InternalMyDsl.g:2958:3: RULE_ID
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
    // InternalMyDsl.g:2967:1: rule__Checkbox__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Checkbox__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2971:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:2972:2: ( ruleDescription )
            {
            // InternalMyDsl.g:2972:2: ( ruleDescription )
            // InternalMyDsl.g:2973:3: ruleDescription
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
    // InternalMyDsl.g:2982:1: rule__Checkbox__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Checkbox__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2987:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2987:2: ( RULE_STRING )
            // InternalMyDsl.g:2988:3: RULE_STRING
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
    // InternalMyDsl.g:2997:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3002:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3002:2: ( RULE_ID )
            // InternalMyDsl.g:3003:3: RULE_ID
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
    // InternalMyDsl.g:3012:1: rule__Button__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Button__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:3017:2: ( ruleDescription )
            {
            // InternalMyDsl.g:3017:2: ( ruleDescription )
            // InternalMyDsl.g:3018:3: ruleDescription
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
    // InternalMyDsl.g:3027:1: rule__Button__HrefAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Button__HrefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3032:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3032:2: ( RULE_STRING )
            // InternalMyDsl.g:3033:3: RULE_STRING
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
    // InternalMyDsl.g:3042:1: rule__Selector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3047:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3047:2: ( RULE_ID )
            // InternalMyDsl.g:3048:3: RULE_ID
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
    // InternalMyDsl.g:3057:1: rule__Selector__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Selector__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:3062:2: ( ruleDescription )
            {
            // InternalMyDsl.g:3062:2: ( ruleDescription )
            // InternalMyDsl.g:3063:3: ruleDescription
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
    // InternalMyDsl.g:3072:1: rule__Selector__OptionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Selector__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3077:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3077:2: ( RULE_STRING )
            // InternalMyDsl.g:3078:3: RULE_STRING
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
    // InternalMyDsl.g:3087:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3092:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3092:2: ( RULE_ID )
            // InternalMyDsl.g:3093:3: RULE_ID
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


    // $ANTLR start "rule__Link__DescriptionAssignment_3"
    // InternalMyDsl.g:3102:1: rule__Link__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Link__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:3107:2: ( ruleDescription )
            {
            // InternalMyDsl.g:3107:2: ( ruleDescription )
            // InternalMyDsl.g:3108:3: ruleDescription
            {
             before(grammarAccess.getLinkAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__DescriptionAssignment_3"


    // $ANTLR start "rule__Link__UrlAssignment_5"
    // InternalMyDsl.g:3117:1: rule__Link__UrlAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Link__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3122:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3122:2: ( RULE_STRING )
            // InternalMyDsl.g:3123:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__UrlAssignment_5"


    // $ANTLR start "rule__Menu__NameAssignment_1"
    // InternalMyDsl.g:3132:1: rule__Menu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Menu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3136:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3137:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3137:2: ( RULE_ID )
            // InternalMyDsl.g:3138:3: RULE_ID
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
    // InternalMyDsl.g:3147:1: rule__Menu__MealAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Menu__MealAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3151:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3152:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3152:2: ( RULE_STRING )
            // InternalMyDsl.g:3153:3: RULE_STRING
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
    // InternalMyDsl.g:3162:1: rule__Menu__DescriptionAssignment_5 : ( ruleDescription ) ;
    public final void rule__Menu__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3166:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:3167:2: ( ruleDescription )
            {
            // InternalMyDsl.g:3167:2: ( ruleDescription )
            // InternalMyDsl.g:3168:3: ruleDescription
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
    // InternalMyDsl.g:3177:1: rule__Menu__PriceAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Menu__PriceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3182:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3182:2: ( RULE_STRING )
            // InternalMyDsl.g:3183:3: RULE_STRING
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
    // InternalMyDsl.g:3192:1: rule__Menu__ImageAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Menu__ImageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3197:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3197:2: ( RULE_STRING )
            // InternalMyDsl.g:3198:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E82000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});

}