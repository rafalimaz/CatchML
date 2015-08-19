package br.ufc.great.catchml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import br.ufc.great.catchml.services.CatchMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCatchMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xor'", "'->'", "'<->'", "'nor'", "'nand'", "'EX'", "'EG'", "'EF'", "'AX'", "'AG'", "'AF'", "'E'", "'A'", "'system'", "'{'", "'}'", "'prop'", "';'", "','", "'situation'", "':='", "'sconstraint'", "'tconstraint'", "'pre'", "'post'", "'exception'", "'scope'", "'handle'", "'('", "')'", "'case'", "'do'", "'spec'", "'U'", "'||'", "'&&'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCatchMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCatchMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCatchMLParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g"; }


     
     	private CatchMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CatchMLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainmodel"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:61:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:62:1: ( ruleDomainmodel EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:63:1: ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel67);
            ruleDomainmodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:70:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:74:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:75:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:75:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:76:1: ( rule__Domainmodel__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:77:1: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:77:2: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel100);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:89:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:90:1: ( ruleAbstractElement EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:91:1: ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement128);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement135); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:98:1: ruleAbstractElement : ( ruleSystemDeclaration ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:102:2: ( ( ruleSystemDeclaration ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:103:1: ( ruleSystemDeclaration )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:103:1: ( ruleSystemDeclaration )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:104:1: ruleSystemDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementAccess().getSystemDeclarationParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleSystemDeclaration_in_ruleAbstractElement161);
            ruleSystemDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementAccess().getSystemDeclarationParserRuleCall()); 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleSystemDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:119:1: entryRuleSystemDeclaration : ruleSystemDeclaration EOF ;
    public final void entryRuleSystemDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:120:1: ( ruleSystemDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:121:1: ruleSystemDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration189);
            ruleSystemDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemDeclaration196); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSystemDeclaration"


    // $ANTLR start "ruleSystemDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:128:1: ruleSystemDeclaration : ( ( rule__SystemDeclaration__Group__0 ) ) ;
    public final void ruleSystemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:132:2: ( ( ( rule__SystemDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:133:1: ( ( rule__SystemDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:133:1: ( ( rule__SystemDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:134:1: ( rule__SystemDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:135:1: ( rule__SystemDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:135:2: rule__SystemDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__0_in_ruleSystemDeclaration222);
            rule__SystemDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:147:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:148:1: ( ruleDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:149:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration249);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration256); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:156:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:160:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:161:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:161:1: ( ( rule__Declaration__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:162:1: ( rule__Declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:163:1: ( rule__Declaration__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:163:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration282);
            rule__Declaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRulePropositionExpressionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:175:1: entryRulePropositionExpressionDeclaration : rulePropositionExpressionDeclaration EOF ;
    public final void entryRulePropositionExpressionDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:176:1: ( rulePropositionExpressionDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:177:1: rulePropositionExpressionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropositionExpressionDeclaration_in_entryRulePropositionExpressionDeclaration309);
            rulePropositionExpressionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionExpressionDeclaration316); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropositionExpressionDeclaration"


    // $ANTLR start "rulePropositionExpressionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:184:1: rulePropositionExpressionDeclaration : ( ( rule__PropositionExpressionDeclaration__Group__0 ) ) ;
    public final void rulePropositionExpressionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:188:2: ( ( ( rule__PropositionExpressionDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:189:1: ( ( rule__PropositionExpressionDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:189:1: ( ( rule__PropositionExpressionDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:190:1: ( rule__PropositionExpressionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:191:1: ( rule__PropositionExpressionDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:191:2: rule__PropositionExpressionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__0_in_rulePropositionExpressionDeclaration342);
            rule__PropositionExpressionDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getGroup()); 
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
    // $ANTLR end "rulePropositionExpressionDeclaration"


    // $ANTLR start "entryRulePropositionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:203:1: entryRulePropositionDeclaration : rulePropositionDeclaration EOF ;
    public final void entryRulePropositionDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:204:1: ( rulePropositionDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:205:1: rulePropositionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropositionDeclaration_in_entryRulePropositionDeclaration369);
            rulePropositionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionDeclaration376); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropositionDeclaration"


    // $ANTLR start "rulePropositionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:212:1: rulePropositionDeclaration : ( ( rule__PropositionDeclaration__NameAssignment ) ) ;
    public final void rulePropositionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:216:2: ( ( ( rule__PropositionDeclaration__NameAssignment ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:217:1: ( ( rule__PropositionDeclaration__NameAssignment ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:217:1: ( ( rule__PropositionDeclaration__NameAssignment ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:218:1: ( rule__PropositionDeclaration__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionDeclarationAccess().getNameAssignment()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:219:1: ( rule__PropositionDeclaration__NameAssignment )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:219:2: rule__PropositionDeclaration__NameAssignment
            {
            pushFollow(FOLLOW_rule__PropositionDeclaration__NameAssignment_in_rulePropositionDeclaration402);
            rule__PropositionDeclaration__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionDeclarationAccess().getNameAssignment()); 
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
    // $ANTLR end "rulePropositionDeclaration"


    // $ANTLR start "entryRuleSituationDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:231:1: entryRuleSituationDeclaration : ruleSituationDeclaration EOF ;
    public final void entryRuleSituationDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:232:1: ( ruleSituationDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:233:1: ruleSituationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSituationDeclaration_in_entryRuleSituationDeclaration429);
            ruleSituationDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSituationDeclaration436); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSituationDeclaration"


    // $ANTLR start "ruleSituationDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:240:1: ruleSituationDeclaration : ( ( rule__SituationDeclaration__Group__0 ) ) ;
    public final void ruleSituationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:244:2: ( ( ( rule__SituationDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:245:1: ( ( rule__SituationDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:245:1: ( ( rule__SituationDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:246:1: ( rule__SituationDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:247:1: ( rule__SituationDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:247:2: rule__SituationDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__0_in_ruleSituationDeclaration462);
            rule__SituationDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleSituationDeclaration"


    // $ANTLR start "entryRuleSemanticConstraintDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:259:1: entryRuleSemanticConstraintDeclaration : ruleSemanticConstraintDeclaration EOF ;
    public final void entryRuleSemanticConstraintDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:260:1: ( ruleSemanticConstraintDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:261:1: ruleSemanticConstraintDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSemanticConstraintDeclaration_in_entryRuleSemanticConstraintDeclaration489);
            ruleSemanticConstraintDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemanticConstraintDeclaration496); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSemanticConstraintDeclaration"


    // $ANTLR start "ruleSemanticConstraintDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:268:1: ruleSemanticConstraintDeclaration : ( ( rule__SemanticConstraintDeclaration__Group__0 ) ) ;
    public final void ruleSemanticConstraintDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:272:2: ( ( ( rule__SemanticConstraintDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:273:1: ( ( rule__SemanticConstraintDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:273:1: ( ( rule__SemanticConstraintDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:274:1: ( rule__SemanticConstraintDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:275:1: ( rule__SemanticConstraintDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:275:2: rule__SemanticConstraintDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__0_in_ruleSemanticConstraintDeclaration522);
            rule__SemanticConstraintDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleSemanticConstraintDeclaration"


    // $ANTLR start "entryRuleTransitionConstraintDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:287:1: entryRuleTransitionConstraintDeclaration : ruleTransitionConstraintDeclaration EOF ;
    public final void entryRuleTransitionConstraintDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:288:1: ( ruleTransitionConstraintDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:289:1: ruleTransitionConstraintDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionConstraintDeclaration_in_entryRuleTransitionConstraintDeclaration549);
            ruleTransitionConstraintDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionConstraintDeclaration556); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTransitionConstraintDeclaration"


    // $ANTLR start "ruleTransitionConstraintDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:296:1: ruleTransitionConstraintDeclaration : ( ( rule__TransitionConstraintDeclaration__Group__0 ) ) ;
    public final void ruleTransitionConstraintDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:300:2: ( ( ( rule__TransitionConstraintDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:301:1: ( ( rule__TransitionConstraintDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:301:1: ( ( rule__TransitionConstraintDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:302:1: ( rule__TransitionConstraintDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:303:1: ( rule__TransitionConstraintDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:303:2: rule__TransitionConstraintDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__0_in_ruleTransitionConstraintDeclaration582);
            rule__TransitionConstraintDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleTransitionConstraintDeclaration"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:315:1: entryRuleExceptionDeclaration : ruleExceptionDeclaration EOF ;
    public final void entryRuleExceptionDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:316:1: ( ruleExceptionDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:317:1: ruleExceptionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration609);
            ruleExceptionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration616); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExceptionDeclaration"


    // $ANTLR start "ruleExceptionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:324:1: ruleExceptionDeclaration : ( ( rule__ExceptionDeclaration__Group__0 ) ) ;
    public final void ruleExceptionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:328:2: ( ( ( rule__ExceptionDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:329:1: ( ( rule__ExceptionDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:329:1: ( ( rule__ExceptionDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:330:1: ( rule__ExceptionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:331:1: ( rule__ExceptionDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:331:2: rule__ExceptionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__0_in_ruleExceptionDeclaration642);
            rule__ExceptionDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleScopeDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:345:1: entryRuleScopeDeclaration : ruleScopeDeclaration EOF ;
    public final void entryRuleScopeDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:346:1: ( ruleScopeDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:347:1: ruleScopeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleScopeDeclaration_in_entryRuleScopeDeclaration671);
            ruleScopeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeDeclaration678); if (state.failed) return ;

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
    // $ANTLR end "entryRuleScopeDeclaration"


    // $ANTLR start "ruleScopeDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:354:1: ruleScopeDeclaration : ( ( rule__ScopeDeclaration__Group__0 ) ) ;
    public final void ruleScopeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:358:2: ( ( ( rule__ScopeDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:359:1: ( ( rule__ScopeDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:359:1: ( ( rule__ScopeDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:360:1: ( rule__ScopeDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:361:1: ( rule__ScopeDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:361:2: rule__ScopeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__0_in_ruleScopeDeclaration704);
            rule__ScopeDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleScopeDeclaration"


    // $ANTLR start "entryRuleHandlerDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:373:1: entryRuleHandlerDeclaration : ruleHandlerDeclaration EOF ;
    public final void entryRuleHandlerDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:374:1: ( ruleHandlerDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:375:1: ruleHandlerDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleHandlerDeclaration_in_entryRuleHandlerDeclaration731);
            ruleHandlerDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerDeclaration738); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHandlerDeclaration"


    // $ANTLR start "ruleHandlerDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:382:1: ruleHandlerDeclaration : ( ( rule__HandlerDeclaration__Group__0 ) ) ;
    public final void ruleHandlerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:386:2: ( ( ( rule__HandlerDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:387:1: ( ( rule__HandlerDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:387:1: ( ( rule__HandlerDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:388:1: ( rule__HandlerDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:389:1: ( rule__HandlerDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:389:2: rule__HandlerDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__0_in_ruleHandlerDeclaration764);
            rule__HandlerDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleHandlerDeclaration"


    // $ANTLR start "entryRuleActionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:401:1: entryRuleActionDeclaration : ruleActionDeclaration EOF ;
    public final void entryRuleActionDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:402:1: ( ruleActionDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:403:1: ruleActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration791);
            ruleActionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDeclaration798); if (state.failed) return ;

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
    // $ANTLR end "entryRuleActionDeclaration"


    // $ANTLR start "ruleActionDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:410:1: ruleActionDeclaration : ( ( rule__ActionDeclaration__Group__0 ) ) ;
    public final void ruleActionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:414:2: ( ( ( rule__ActionDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:415:1: ( ( rule__ActionDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:415:1: ( ( rule__ActionDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:416:1: ( rule__ActionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:417:1: ( rule__ActionDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:417:2: rule__ActionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ActionDeclaration__Group__0_in_ruleActionDeclaration824);
            rule__ActionDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleActionDeclaration"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:429:1: entryRulePropertyDeclaration : rulePropertyDeclaration EOF ;
    public final void entryRulePropertyDeclaration() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:430:1: ( rulePropertyDeclaration EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:431:1: rulePropertyDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration851);
            rulePropertyDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration858); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyDeclaration"


    // $ANTLR start "rulePropertyDeclaration"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:438:1: rulePropertyDeclaration : ( ( rule__PropertyDeclaration__Group__0 ) ) ;
    public final void rulePropertyDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:442:2: ( ( ( rule__PropertyDeclaration__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:443:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:443:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:444:1: ( rule__PropertyDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:445:1: ( rule__PropertyDeclaration__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:445:2: rule__PropertyDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration884);
            rule__PropertyDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyDeclaration"


    // $ANTLR start "entryRuleLogicExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:457:1: entryRuleLogicExpression : ruleLogicExpression EOF ;
    public final void entryRuleLogicExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:458:1: ( ruleLogicExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:459:1: ruleLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_entryRuleLogicExpression911);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExpression918); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicExpression"


    // $ANTLR start "ruleLogicExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:466:1: ruleLogicExpression : ( ruleOrExpression ) ;
    public final void ruleLogicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:470:2: ( ( ruleOrExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:471:1: ( ruleOrExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:471:1: ( ruleOrExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:472:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleLogicExpression944);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicExpressionAccess().getOrExpressionParserRuleCall()); 
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
    // $ANTLR end "ruleLogicExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:485:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:486:1: ( ruleOrExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:487:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression970);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression977); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:494:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:498:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:499:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:499:1: ( ( rule__OrExpression__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:500:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:501:1: ( rule__OrExpression__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:501:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression1003);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:513:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:514:1: ( ruleAndExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:515:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1030);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1037); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:522:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:526:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:527:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:527:1: ( ( rule__AndExpression__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:528:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:529:1: ( rule__AndExpression__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:529:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression1063);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:541:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:542:1: ( ruleRelationalExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:543:1: ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1090);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression1097); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:550:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:554:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:555:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:555:1: ( ( rule__RelationalExpression__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:556:1: ( rule__RelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:557:1: ( rule__RelationalExpression__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:557:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression1123);
            rule__RelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:569:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:570:1: ( ruleAdditiveExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:571:1: ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1150);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression1157); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:578:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Alternatives ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:582:2: ( ( ( rule__AdditiveExpression__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:583:1: ( ( rule__AdditiveExpression__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:583:1: ( ( rule__AdditiveExpression__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:584:1: ( rule__AdditiveExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:585:1: ( rule__AdditiveExpression__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:585:2: rule__AdditiveExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Alternatives_in_ruleAdditiveExpression1183);
            rule__AdditiveExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:597:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:598:1: ( rulePrimaryExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:599:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1210);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1217); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:606:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:610:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:611:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:611:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:612:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:613:1: ( rule__PrimaryExpression__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:613:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1243);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleTemporalLogicExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:625:1: entryRuleTemporalLogicExpression : ruleTemporalLogicExpression EOF ;
    public final void entryRuleTemporalLogicExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:626:1: ( ruleTemporalLogicExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:627:1: ruleTemporalLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLogicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_entryRuleTemporalLogicExpression1270);
            ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLogicExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalLogicExpression1277); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalLogicExpression"


    // $ANTLR start "ruleTemporalLogicExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:634:1: ruleTemporalLogicExpression : ( ruleTemporalOrExpression ) ;
    public final void ruleTemporalLogicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:638:2: ( ( ruleTemporalOrExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:639:1: ( ruleTemporalOrExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:639:1: ( ruleTemporalOrExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:640:1: ruleTemporalOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLogicExpressionAccess().getTemporalOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleTemporalOrExpression_in_ruleTemporalLogicExpression1303);
            ruleTemporalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLogicExpressionAccess().getTemporalOrExpressionParserRuleCall()); 
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
    // $ANTLR end "ruleTemporalLogicExpression"


    // $ANTLR start "entryRuleTemporalOrExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:653:1: entryRuleTemporalOrExpression : ruleTemporalOrExpression EOF ;
    public final void entryRuleTemporalOrExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:654:1: ( ruleTemporalOrExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:655:1: ruleTemporalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalOrExpression_in_entryRuleTemporalOrExpression1329);
            ruleTemporalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalOrExpression1336); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalOrExpression"


    // $ANTLR start "ruleTemporalOrExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:662:1: ruleTemporalOrExpression : ( ( rule__TemporalOrExpression__Group__0 ) ) ;
    public final void ruleTemporalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:666:2: ( ( ( rule__TemporalOrExpression__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:667:1: ( ( rule__TemporalOrExpression__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:667:1: ( ( rule__TemporalOrExpression__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:668:1: ( rule__TemporalOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:669:1: ( rule__TemporalOrExpression__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:669:2: rule__TemporalOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group__0_in_ruleTemporalOrExpression1362);
            rule__TemporalOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleTemporalOrExpression"


    // $ANTLR start "entryRuleTemporalAndExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:681:1: entryRuleTemporalAndExpression : ruleTemporalAndExpression EOF ;
    public final void entryRuleTemporalAndExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:682:1: ( ruleTemporalAndExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:683:1: ruleTemporalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_entryRuleTemporalAndExpression1389);
            ruleTemporalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalAndExpression1396); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalAndExpression"


    // $ANTLR start "ruleTemporalAndExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:690:1: ruleTemporalAndExpression : ( ( rule__TemporalAndExpression__Group__0 ) ) ;
    public final void ruleTemporalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:694:2: ( ( ( rule__TemporalAndExpression__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:695:1: ( ( rule__TemporalAndExpression__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:695:1: ( ( rule__TemporalAndExpression__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:696:1: ( rule__TemporalAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:697:1: ( rule__TemporalAndExpression__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:697:2: rule__TemporalAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group__0_in_ruleTemporalAndExpression1422);
            rule__TemporalAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleTemporalAndExpression"


    // $ANTLR start "entryRuleTemporalRelationalExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:709:1: entryRuleTemporalRelationalExpression : ruleTemporalRelationalExpression EOF ;
    public final void entryRuleTemporalRelationalExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:710:1: ( ruleTemporalRelationalExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:711:1: ruleTemporalRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_entryRuleTemporalRelationalExpression1449);
            ruleTemporalRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalRelationalExpression1456); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalRelationalExpression"


    // $ANTLR start "ruleTemporalRelationalExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:718:1: ruleTemporalRelationalExpression : ( ( rule__TemporalRelationalExpression__Group__0 ) ) ;
    public final void ruleTemporalRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:722:2: ( ( ( rule__TemporalRelationalExpression__Group__0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:723:1: ( ( rule__TemporalRelationalExpression__Group__0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:723:1: ( ( rule__TemporalRelationalExpression__Group__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:724:1: ( rule__TemporalRelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getGroup()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:725:1: ( rule__TemporalRelationalExpression__Group__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:725:2: rule__TemporalRelationalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group__0_in_ruleTemporalRelationalExpression1482);
            rule__TemporalRelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleTemporalRelationalExpression"


    // $ANTLR start "entryRuleTemporalAdditiveExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:737:1: entryRuleTemporalAdditiveExpression : ruleTemporalAdditiveExpression EOF ;
    public final void entryRuleTemporalAdditiveExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:738:1: ( ruleTemporalAdditiveExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:739:1: ruleTemporalAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_entryRuleTemporalAdditiveExpression1509);
            ruleTemporalAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalAdditiveExpression1516); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalAdditiveExpression"


    // $ANTLR start "ruleTemporalAdditiveExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:746:1: ruleTemporalAdditiveExpression : ( ( rule__TemporalAdditiveExpression__Alternatives ) ) ;
    public final void ruleTemporalAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:750:2: ( ( ( rule__TemporalAdditiveExpression__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:751:1: ( ( rule__TemporalAdditiveExpression__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:751:1: ( ( rule__TemporalAdditiveExpression__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:752:1: ( rule__TemporalAdditiveExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:753:1: ( rule__TemporalAdditiveExpression__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:753:2: rule__TemporalAdditiveExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Alternatives_in_ruleTemporalAdditiveExpression1542);
            rule__TemporalAdditiveExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTemporalAdditiveExpression"


    // $ANTLR start "entryRuleTemporalPrimaryExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:765:1: entryRuleTemporalPrimaryExpression : ruleTemporalPrimaryExpression EOF ;
    public final void entryRuleTemporalPrimaryExpression() throws RecognitionException {
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:766:1: ( ruleTemporalPrimaryExpression EOF )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:767:1: ruleTemporalPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_entryRuleTemporalPrimaryExpression1569);
            ruleTemporalPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPrimaryExpression1576); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalPrimaryExpression"


    // $ANTLR start "ruleTemporalPrimaryExpression"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:774:1: ruleTemporalPrimaryExpression : ( ( rule__TemporalPrimaryExpression__Alternatives ) ) ;
    public final void ruleTemporalPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:778:2: ( ( ( rule__TemporalPrimaryExpression__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:779:1: ( ( rule__TemporalPrimaryExpression__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:779:1: ( ( rule__TemporalPrimaryExpression__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:780:1: ( rule__TemporalPrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:781:1: ( rule__TemporalPrimaryExpression__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:781:2: rule__TemporalPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Alternatives_in_ruleTemporalPrimaryExpression1602);
            rule__TemporalPrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTemporalPrimaryExpression"


    // $ANTLR start "ruleMULTIPLEOPERATOR"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:794:1: ruleMULTIPLEOPERATOR : ( ( 'xor' ) ) ;
    public final void ruleMULTIPLEOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:798:1: ( ( ( 'xor' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:799:1: ( ( 'xor' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:799:1: ( ( 'xor' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:800:1: ( 'xor' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTIPLEOPERATORAccess().getXorEnumLiteralDeclaration()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:801:1: ( 'xor' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:801:3: 'xor'
            {
            match(input,11,FOLLOW_11_in_ruleMULTIPLEOPERATOR1640); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTIPLEOPERATORAccess().getXorEnumLiteralDeclaration()); 
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
    // $ANTLR end "ruleMULTIPLEOPERATOR"


    // $ANTLR start "ruleBINARYOPERATOR"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:814:1: ruleBINARYOPERATOR : ( ( rule__BINARYOPERATOR__Alternatives ) ) ;
    public final void ruleBINARYOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:818:1: ( ( ( rule__BINARYOPERATOR__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:819:1: ( ( rule__BINARYOPERATOR__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:819:1: ( ( rule__BINARYOPERATOR__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:820:1: ( rule__BINARYOPERATOR__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARYOPERATORAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:821:1: ( rule__BINARYOPERATOR__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:821:2: rule__BINARYOPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__BINARYOPERATOR__Alternatives_in_ruleBINARYOPERATOR1678);
            rule__BINARYOPERATOR__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARYOPERATORAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBINARYOPERATOR"


    // $ANTLR start "ruleTEMPORALOPERATOR"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:833:1: ruleTEMPORALOPERATOR : ( ( rule__TEMPORALOPERATOR__Alternatives ) ) ;
    public final void ruleTEMPORALOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:837:1: ( ( ( rule__TEMPORALOPERATOR__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:838:1: ( ( rule__TEMPORALOPERATOR__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:838:1: ( ( rule__TEMPORALOPERATOR__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:839:1: ( rule__TEMPORALOPERATOR__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEMPORALOPERATORAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:840:1: ( rule__TEMPORALOPERATOR__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:840:2: rule__TEMPORALOPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__TEMPORALOPERATOR__Alternatives_in_ruleTEMPORALOPERATOR1714);
            rule__TEMPORALOPERATOR__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEMPORALOPERATORAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTEMPORALOPERATOR"


    // $ANTLR start "ruleTEMPUNTILOPERATOR"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:852:1: ruleTEMPUNTILOPERATOR : ( ( rule__TEMPUNTILOPERATOR__Alternatives ) ) ;
    public final void ruleTEMPUNTILOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:856:1: ( ( ( rule__TEMPUNTILOPERATOR__Alternatives ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:857:1: ( ( rule__TEMPUNTILOPERATOR__Alternatives ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:857:1: ( ( rule__TEMPUNTILOPERATOR__Alternatives ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:858:1: ( rule__TEMPUNTILOPERATOR__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEMPUNTILOPERATORAccess().getAlternatives()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:859:1: ( rule__TEMPUNTILOPERATOR__Alternatives )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:859:2: rule__TEMPUNTILOPERATOR__Alternatives
            {
            pushFollow(FOLLOW_rule__TEMPUNTILOPERATOR__Alternatives_in_ruleTEMPUNTILOPERATOR1750);
            rule__TEMPUNTILOPERATOR__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEMPUNTILOPERATORAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTEMPUNTILOPERATOR"


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:870:1: rule__Declaration__Alternatives : ( ( rulePropositionExpressionDeclaration ) | ( ruleSituationDeclaration ) | ( ruleSemanticConstraintDeclaration ) | ( ruleTransitionConstraintDeclaration ) | ( ruleExceptionDeclaration ) | ( ruleScopeDeclaration ) | ( rulePropertyDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:874:1: ( ( rulePropositionExpressionDeclaration ) | ( ruleSituationDeclaration ) | ( ruleSemanticConstraintDeclaration ) | ( ruleTransitionConstraintDeclaration ) | ( ruleExceptionDeclaration ) | ( ruleScopeDeclaration ) | ( rulePropertyDeclaration ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 43:
                {
                alt2=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:875:1: ( rulePropositionExpressionDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:875:1: ( rulePropositionExpressionDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:876:1: rulePropositionExpressionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getPropositionExpressionDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropositionExpressionDeclaration_in_rule__Declaration__Alternatives1785);
                    rulePropositionExpressionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getPropositionExpressionDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:881:6: ( ruleSituationDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:881:6: ( ruleSituationDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:882:1: ruleSituationDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getSituationDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSituationDeclaration_in_rule__Declaration__Alternatives1802);
                    ruleSituationDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getSituationDeclarationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:887:6: ( ruleSemanticConstraintDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:887:6: ( ruleSemanticConstraintDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:888:1: ruleSemanticConstraintDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getSemanticConstraintDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSemanticConstraintDeclaration_in_rule__Declaration__Alternatives1819);
                    ruleSemanticConstraintDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getSemanticConstraintDeclarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:893:6: ( ruleTransitionConstraintDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:893:6: ( ruleTransitionConstraintDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:894:1: ruleTransitionConstraintDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getTransitionConstraintDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTransitionConstraintDeclaration_in_rule__Declaration__Alternatives1836);
                    ruleTransitionConstraintDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getTransitionConstraintDeclarationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:899:6: ( ruleExceptionDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:899:6: ( ruleExceptionDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:900:1: ruleExceptionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getExceptionDeclarationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleExceptionDeclaration_in_rule__Declaration__Alternatives1853);
                    ruleExceptionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getExceptionDeclarationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:905:6: ( ruleScopeDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:905:6: ( ruleScopeDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:906:1: ruleScopeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getScopeDeclarationParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleScopeDeclaration_in_rule__Declaration__Alternatives1870);
                    ruleScopeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getScopeDeclarationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:911:6: ( rulePropertyDeclaration )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:911:6: ( rulePropertyDeclaration )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:912:1: rulePropertyDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getPropertyDeclarationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__Declaration__Alternatives1887);
                    rulePropertyDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getPropertyDeclarationParserRuleCall_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__RelationalExpression__OpAlternatives_1_1_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:923:1: rule__RelationalExpression__OpAlternatives_1_1_0 : ( ( '->' ) | ( '<->' ) );
    public final void rule__RelationalExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:927:1: ( ( '->' ) | ( '<->' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:928:1: ( '->' )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:928:1: ( '->' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:929:1: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__RelationalExpression__OpAlternatives_1_1_01921); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:936:6: ( '<->' )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:936:6: ( '<->' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:937:1: '<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__RelationalExpression__OpAlternatives_1_1_01941); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__AdditiveExpression__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:949:1: rule__AdditiveExpression__Alternatives : ( ( ( rule__AdditiveExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__AdditiveExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:953:1: ( ( ( rule__AdditiveExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==11||(LA4_0>=14 && LA4_0<=15)||LA4_0==39) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:954:1: ( ( rule__AdditiveExpression__Group_0__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:954:1: ( ( rule__AdditiveExpression__Group_0__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:955:1: ( rule__AdditiveExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExpressionAccess().getGroup_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:956:1: ( rule__AdditiveExpression__Group_0__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:956:2: rule__AdditiveExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AdditiveExpression__Group_0__0_in_rule__AdditiveExpression__Alternatives1975);
                    rule__AdditiveExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:960:6: ( rulePrimaryExpression )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:960:6: ( rulePrimaryExpression )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:961:1: rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rule__AdditiveExpression__Alternatives1993);
                    rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:971:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__ValueAssignment_1 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:975:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__ValueAssignment_1 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 14:
            case 15:
                {
                alt5=3;
                }
                break;
            case 11:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:976:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:976:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:977:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:978:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:978:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2025);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:982:6: ( ( rule__PrimaryExpression__ValueAssignment_1 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:982:6: ( ( rule__PrimaryExpression__ValueAssignment_1 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:983:1: ( rule__PrimaryExpression__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:984:1: ( rule__PrimaryExpression__ValueAssignment_1 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:984:2: rule__PrimaryExpression__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_in_rule__PrimaryExpression__Alternatives2043);
                    rule__PrimaryExpression__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:988:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:988:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:989:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:990:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:990:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2061);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:994:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:994:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:995:1: ( rule__PrimaryExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:996:1: ( rule__PrimaryExpression__Group_3__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:996:2: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives2079);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__TemporalRelationalExpression__OpAlternatives_1_1_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1005:1: rule__TemporalRelationalExpression__OpAlternatives_1_1_0 : ( ( '->' ) | ( '<->' ) );
    public final void rule__TemporalRelationalExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1009:1: ( ( '->' ) | ( '<->' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1010:1: ( '->' )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1010:1: ( '->' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1011:1: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__TemporalRelationalExpression__OpAlternatives_1_1_02113); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1018:6: ( '<->' )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1018:6: ( '<->' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1019:1: '<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__TemporalRelationalExpression__OpAlternatives_1_1_02133); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__TemporalAdditiveExpression__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1031:1: rule__TemporalAdditiveExpression__Alternatives : ( ( ( rule__TemporalAdditiveExpression__Group_0__0 ) ) | ( ruleTemporalPrimaryExpression ) );
    public final void rule__TemporalAdditiveExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1035:1: ( ( ( rule__TemporalAdditiveExpression__Group_0__0 ) ) | ( ruleTemporalPrimaryExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||LA7_0==11||(LA7_0>=14 && LA7_0<=23)||LA7_0==39) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1036:1: ( ( rule__TemporalAdditiveExpression__Group_0__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1036:1: ( ( rule__TemporalAdditiveExpression__Group_0__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1037:1: ( rule__TemporalAdditiveExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalAdditiveExpressionAccess().getGroup_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1038:1: ( rule__TemporalAdditiveExpression__Group_0__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1038:2: rule__TemporalAdditiveExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Group_0__0_in_rule__TemporalAdditiveExpression__Alternatives2167);
                    rule__TemporalAdditiveExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalAdditiveExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1042:6: ( ruleTemporalPrimaryExpression )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1042:6: ( ruleTemporalPrimaryExpression )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1043:1: ruleTemporalPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalAdditiveExpressionAccess().getTemporalPrimaryExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_rule__TemporalAdditiveExpression__Alternatives2185);
                    ruleTemporalPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalAdditiveExpressionAccess().getTemporalPrimaryExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAdditiveExpression__Alternatives"


    // $ANTLR start "rule__TemporalPrimaryExpression__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1053:1: rule__TemporalPrimaryExpression__Alternatives : ( ( ( rule__TemporalPrimaryExpression__Group_0__0 ) ) | ( ( rule__TemporalPrimaryExpression__ValueAssignment_1 ) ) | ( ( rule__TemporalPrimaryExpression__Group_2__0 ) ) | ( ( rule__TemporalPrimaryExpression__Group_3__0 ) ) | ( ( rule__TemporalPrimaryExpression__Group_4__0 ) ) | ( ( rule__TemporalPrimaryExpression__Group_5__0 ) ) );
    public final void rule__TemporalPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1057:1: ( ( ( rule__TemporalPrimaryExpression__Group_0__0 ) ) | ( ( rule__TemporalPrimaryExpression__ValueAssignment_1 ) ) | ( ( rule__TemporalPrimaryExpression__Group_2__0 ) ) | ( ( rule__TemporalPrimaryExpression__Group_3__0 ) ) | ( ( rule__TemporalPrimaryExpression__Group_4__0 ) ) | ( ( rule__TemporalPrimaryExpression__Group_5__0 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
            case 23:
                {
                alt8=4;
                }
                break;
            case 14:
            case 15:
                {
                alt8=5;
                }
                break;
            case 11:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1058:1: ( ( rule__TemporalPrimaryExpression__Group_0__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1058:1: ( ( rule__TemporalPrimaryExpression__Group_0__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1059:1: ( rule__TemporalPrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1060:1: ( rule__TemporalPrimaryExpression__Group_0__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1060:2: rule__TemporalPrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_0__0_in_rule__TemporalPrimaryExpression__Alternatives2217);
                    rule__TemporalPrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1064:6: ( ( rule__TemporalPrimaryExpression__ValueAssignment_1 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1064:6: ( ( rule__TemporalPrimaryExpression__ValueAssignment_1 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1065:1: ( rule__TemporalPrimaryExpression__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAssignment_1()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1066:1: ( rule__TemporalPrimaryExpression__ValueAssignment_1 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1066:2: rule__TemporalPrimaryExpression__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__ValueAssignment_1_in_rule__TemporalPrimaryExpression__Alternatives2235);
                    rule__TemporalPrimaryExpression__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1070:6: ( ( rule__TemporalPrimaryExpression__Group_2__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1070:6: ( ( rule__TemporalPrimaryExpression__Group_2__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1071:1: ( rule__TemporalPrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1072:1: ( rule__TemporalPrimaryExpression__Group_2__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1072:2: rule__TemporalPrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__0_in_rule__TemporalPrimaryExpression__Alternatives2253);
                    rule__TemporalPrimaryExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1076:6: ( ( rule__TemporalPrimaryExpression__Group_3__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1076:6: ( ( rule__TemporalPrimaryExpression__Group_3__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1077:1: ( rule__TemporalPrimaryExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_3()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1078:1: ( rule__TemporalPrimaryExpression__Group_3__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1078:2: rule__TemporalPrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__0_in_rule__TemporalPrimaryExpression__Alternatives2271);
                    rule__TemporalPrimaryExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1082:6: ( ( rule__TemporalPrimaryExpression__Group_4__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1082:6: ( ( rule__TemporalPrimaryExpression__Group_4__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1083:1: ( rule__TemporalPrimaryExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_4()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1084:1: ( rule__TemporalPrimaryExpression__Group_4__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1084:2: rule__TemporalPrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__0_in_rule__TemporalPrimaryExpression__Alternatives2289);
                    rule__TemporalPrimaryExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1088:6: ( ( rule__TemporalPrimaryExpression__Group_5__0 ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1088:6: ( ( rule__TemporalPrimaryExpression__Group_5__0 ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1089:1: ( rule__TemporalPrimaryExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1090:1: ( rule__TemporalPrimaryExpression__Group_5__0 )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1090:2: rule__TemporalPrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__0_in_rule__TemporalPrimaryExpression__Alternatives2307);
                    rule__TemporalPrimaryExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Alternatives"


    // $ANTLR start "rule__BINARYOPERATOR__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1099:1: rule__BINARYOPERATOR__Alternatives : ( ( ( 'nor' ) ) | ( ( 'nand' ) ) );
    public final void rule__BINARYOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1103:1: ( ( ( 'nor' ) ) | ( ( 'nand' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1104:1: ( ( 'nor' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1104:1: ( ( 'nor' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1105:1: ( 'nor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBINARYOPERATORAccess().getNorEnumLiteralDeclaration_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1106:1: ( 'nor' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1106:3: 'nor'
                    {
                    match(input,14,FOLLOW_14_in_rule__BINARYOPERATOR__Alternatives2341); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBINARYOPERATORAccess().getNorEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1111:6: ( ( 'nand' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1111:6: ( ( 'nand' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1112:1: ( 'nand' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBINARYOPERATORAccess().getNandEnumLiteralDeclaration_1()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1113:1: ( 'nand' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1113:3: 'nand'
                    {
                    match(input,15,FOLLOW_15_in_rule__BINARYOPERATOR__Alternatives2362); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBINARYOPERATORAccess().getNandEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARYOPERATOR__Alternatives"


    // $ANTLR start "rule__TEMPORALOPERATOR__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1123:1: rule__TEMPORALOPERATOR__Alternatives : ( ( ( 'EX' ) ) | ( ( 'EG' ) ) | ( ( 'EF' ) ) | ( ( 'AX' ) ) | ( ( 'AG' ) ) | ( ( 'AF' ) ) );
    public final void rule__TEMPORALOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1127:1: ( ( ( 'EX' ) ) | ( ( 'EG' ) ) | ( ( 'EF' ) ) | ( ( 'AX' ) ) | ( ( 'AG' ) ) | ( ( 'AF' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            case 21:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1128:1: ( ( 'EX' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1128:1: ( ( 'EX' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1129:1: ( 'EX' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPORALOPERATORAccess().getEXEnumLiteralDeclaration_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1130:1: ( 'EX' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1130:3: 'EX'
                    {
                    match(input,16,FOLLOW_16_in_rule__TEMPORALOPERATOR__Alternatives2398); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPORALOPERATORAccess().getEXEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1135:6: ( ( 'EG' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1135:6: ( ( 'EG' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1136:1: ( 'EG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPORALOPERATORAccess().getEGEnumLiteralDeclaration_1()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1137:1: ( 'EG' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1137:3: 'EG'
                    {
                    match(input,17,FOLLOW_17_in_rule__TEMPORALOPERATOR__Alternatives2419); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPORALOPERATORAccess().getEGEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1142:6: ( ( 'EF' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1142:6: ( ( 'EF' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1143:1: ( 'EF' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPORALOPERATORAccess().getEFEnumLiteralDeclaration_2()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1144:1: ( 'EF' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1144:3: 'EF'
                    {
                    match(input,18,FOLLOW_18_in_rule__TEMPORALOPERATOR__Alternatives2440); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPORALOPERATORAccess().getEFEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1149:6: ( ( 'AX' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1149:6: ( ( 'AX' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1150:1: ( 'AX' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPORALOPERATORAccess().getAXEnumLiteralDeclaration_3()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1151:1: ( 'AX' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1151:3: 'AX'
                    {
                    match(input,19,FOLLOW_19_in_rule__TEMPORALOPERATOR__Alternatives2461); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPORALOPERATORAccess().getAXEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1156:6: ( ( 'AG' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1156:6: ( ( 'AG' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1157:1: ( 'AG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPORALOPERATORAccess().getAGEnumLiteralDeclaration_4()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1158:1: ( 'AG' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1158:3: 'AG'
                    {
                    match(input,20,FOLLOW_20_in_rule__TEMPORALOPERATOR__Alternatives2482); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPORALOPERATORAccess().getAGEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1163:6: ( ( 'AF' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1163:6: ( ( 'AF' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1164:1: ( 'AF' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPORALOPERATORAccess().getAFEnumLiteralDeclaration_5()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1165:1: ( 'AF' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1165:3: 'AF'
                    {
                    match(input,21,FOLLOW_21_in_rule__TEMPORALOPERATOR__Alternatives2503); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPORALOPERATORAccess().getAFEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEMPORALOPERATOR__Alternatives"


    // $ANTLR start "rule__TEMPUNTILOPERATOR__Alternatives"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1175:1: rule__TEMPUNTILOPERATOR__Alternatives : ( ( ( 'E' ) ) | ( ( 'A' ) ) );
    public final void rule__TEMPUNTILOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1179:1: ( ( ( 'E' ) ) | ( ( 'A' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1180:1: ( ( 'E' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1180:1: ( ( 'E' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1181:1: ( 'E' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPUNTILOPERATORAccess().getEEnumLiteralDeclaration_0()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1182:1: ( 'E' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1182:3: 'E'
                    {
                    match(input,22,FOLLOW_22_in_rule__TEMPUNTILOPERATOR__Alternatives2539); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPUNTILOPERATORAccess().getEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1187:6: ( ( 'A' ) )
                    {
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1187:6: ( ( 'A' ) )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1188:1: ( 'A' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEMPUNTILOPERATORAccess().getAEnumLiteralDeclaration_1()); 
                    }
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1189:1: ( 'A' )
                    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1189:3: 'A'
                    {
                    match(input,23,FOLLOW_23_in_rule__TEMPUNTILOPERATOR__Alternatives2560); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEMPUNTILOPERATORAccess().getAEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEMPUNTILOPERATOR__Alternatives"


    // $ANTLR start "rule__SystemDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1203:1: rule__SystemDeclaration__Group__0 : rule__SystemDeclaration__Group__0__Impl rule__SystemDeclaration__Group__1 ;
    public final void rule__SystemDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1207:1: ( rule__SystemDeclaration__Group__0__Impl rule__SystemDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1208:2: rule__SystemDeclaration__Group__0__Impl rule__SystemDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__0__Impl_in_rule__SystemDeclaration__Group__02595);
            rule__SystemDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__1_in_rule__SystemDeclaration__Group__02598);
            rule__SystemDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDeclaration__Group__0"


    // $ANTLR start "rule__SystemDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1215:1: rule__SystemDeclaration__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1219:1: ( ( 'system' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1220:1: ( 'system' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1220:1: ( 'system' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1221:1: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__SystemDeclaration__Group__0__Impl2626); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0()); 
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
    // $ANTLR end "rule__SystemDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1234:1: rule__SystemDeclaration__Group__1 : rule__SystemDeclaration__Group__1__Impl rule__SystemDeclaration__Group__2 ;
    public final void rule__SystemDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1238:1: ( rule__SystemDeclaration__Group__1__Impl rule__SystemDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1239:2: rule__SystemDeclaration__Group__1__Impl rule__SystemDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__1__Impl_in_rule__SystemDeclaration__Group__12657);
            rule__SystemDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__2_in_rule__SystemDeclaration__Group__12660);
            rule__SystemDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDeclaration__Group__1"


    // $ANTLR start "rule__SystemDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1246:1: rule__SystemDeclaration__Group__1__Impl : ( ( rule__SystemDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SystemDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1250:1: ( ( ( rule__SystemDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1251:1: ( ( rule__SystemDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1251:1: ( ( rule__SystemDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1252:1: ( rule__SystemDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1253:1: ( rule__SystemDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1253:2: rule__SystemDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__NameAssignment_1_in_rule__SystemDeclaration__Group__1__Impl2687);
            rule__SystemDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SystemDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1263:1: rule__SystemDeclaration__Group__2 : rule__SystemDeclaration__Group__2__Impl rule__SystemDeclaration__Group__3 ;
    public final void rule__SystemDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1267:1: ( rule__SystemDeclaration__Group__2__Impl rule__SystemDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1268:2: rule__SystemDeclaration__Group__2__Impl rule__SystemDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__2__Impl_in_rule__SystemDeclaration__Group__22717);
            rule__SystemDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__3_in_rule__SystemDeclaration__Group__22720);
            rule__SystemDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDeclaration__Group__2"


    // $ANTLR start "rule__SystemDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1275:1: rule__SystemDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__SystemDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1279:1: ( ( '{' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1280:1: ( '{' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1280:1: ( '{' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1281:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__SystemDeclaration__Group__2__Impl2748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__SystemDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1294:1: rule__SystemDeclaration__Group__3 : rule__SystemDeclaration__Group__3__Impl rule__SystemDeclaration__Group__4 ;
    public final void rule__SystemDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1298:1: ( rule__SystemDeclaration__Group__3__Impl rule__SystemDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1299:2: rule__SystemDeclaration__Group__3__Impl rule__SystemDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__3__Impl_in_rule__SystemDeclaration__Group__32779);
            rule__SystemDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__4_in_rule__SystemDeclaration__Group__32782);
            rule__SystemDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDeclaration__Group__3"


    // $ANTLR start "rule__SystemDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1306:1: rule__SystemDeclaration__Group__3__Impl : ( ( rule__SystemDeclaration__DeclarationsAssignment_3 )* ) ;
    public final void rule__SystemDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1310:1: ( ( ( rule__SystemDeclaration__DeclarationsAssignment_3 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1311:1: ( ( rule__SystemDeclaration__DeclarationsAssignment_3 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1311:1: ( ( rule__SystemDeclaration__DeclarationsAssignment_3 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1312:1: ( rule__SystemDeclaration__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getDeclarationsAssignment_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1313:1: ( rule__SystemDeclaration__DeclarationsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27||LA12_0==30||(LA12_0>=32 && LA12_0<=33)||(LA12_0>=36 && LA12_0<=37)||LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1313:2: rule__SystemDeclaration__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SystemDeclaration__DeclarationsAssignment_3_in_rule__SystemDeclaration__Group__3__Impl2809);
            	    rule__SystemDeclaration__DeclarationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getDeclarationsAssignment_3()); 
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
    // $ANTLR end "rule__SystemDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1323:1: rule__SystemDeclaration__Group__4 : rule__SystemDeclaration__Group__4__Impl ;
    public final void rule__SystemDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1327:1: ( rule__SystemDeclaration__Group__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1328:2: rule__SystemDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SystemDeclaration__Group__4__Impl_in_rule__SystemDeclaration__Group__42840);
            rule__SystemDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDeclaration__Group__4"


    // $ANTLR start "rule__SystemDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1334:1: rule__SystemDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__SystemDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1338:1: ( ( '}' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1339:1: ( '}' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1339:1: ( '}' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1340:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__SystemDeclaration__Group__4__Impl2868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__SystemDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1363:1: rule__PropositionExpressionDeclaration__Group__0 : rule__PropositionExpressionDeclaration__Group__0__Impl rule__PropositionExpressionDeclaration__Group__1 ;
    public final void rule__PropositionExpressionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1367:1: ( rule__PropositionExpressionDeclaration__Group__0__Impl rule__PropositionExpressionDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1368:2: rule__PropositionExpressionDeclaration__Group__0__Impl rule__PropositionExpressionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__0__Impl_in_rule__PropositionExpressionDeclaration__Group__02909);
            rule__PropositionExpressionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__1_in_rule__PropositionExpressionDeclaration__Group__02912);
            rule__PropositionExpressionDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__0"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1375:1: rule__PropositionExpressionDeclaration__Group__0__Impl : ( 'prop' ) ;
    public final void rule__PropositionExpressionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1379:1: ( ( 'prop' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1380:1: ( 'prop' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1380:1: ( 'prop' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1381:1: 'prop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getPropKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__PropositionExpressionDeclaration__Group__0__Impl2940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getPropKeyword_0()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1394:1: rule__PropositionExpressionDeclaration__Group__1 : rule__PropositionExpressionDeclaration__Group__1__Impl rule__PropositionExpressionDeclaration__Group__2 ;
    public final void rule__PropositionExpressionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1398:1: ( rule__PropositionExpressionDeclaration__Group__1__Impl rule__PropositionExpressionDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1399:2: rule__PropositionExpressionDeclaration__Group__1__Impl rule__PropositionExpressionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__1__Impl_in_rule__PropositionExpressionDeclaration__Group__12971);
            rule__PropositionExpressionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__2_in_rule__PropositionExpressionDeclaration__Group__12974);
            rule__PropositionExpressionDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__1"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1406:1: rule__PropositionExpressionDeclaration__Group__1__Impl : ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_1 ) ) ;
    public final void rule__PropositionExpressionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1410:1: ( ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1411:1: ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1411:1: ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1412:1: ( rule__PropositionExpressionDeclaration__ArgsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1413:1: ( rule__PropositionExpressionDeclaration__ArgsAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1413:2: rule__PropositionExpressionDeclaration__ArgsAssignment_1
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__ArgsAssignment_1_in_rule__PropositionExpressionDeclaration__Group__1__Impl3001);
            rule__PropositionExpressionDeclaration__ArgsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsAssignment_1()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1423:1: rule__PropositionExpressionDeclaration__Group__2 : rule__PropositionExpressionDeclaration__Group__2__Impl rule__PropositionExpressionDeclaration__Group__3 ;
    public final void rule__PropositionExpressionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1427:1: ( rule__PropositionExpressionDeclaration__Group__2__Impl rule__PropositionExpressionDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1428:2: rule__PropositionExpressionDeclaration__Group__2__Impl rule__PropositionExpressionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__2__Impl_in_rule__PropositionExpressionDeclaration__Group__23031);
            rule__PropositionExpressionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__3_in_rule__PropositionExpressionDeclaration__Group__23034);
            rule__PropositionExpressionDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__2"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1435:1: rule__PropositionExpressionDeclaration__Group__2__Impl : ( ( rule__PropositionExpressionDeclaration__Group_2__0 )* ) ;
    public final void rule__PropositionExpressionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1439:1: ( ( ( rule__PropositionExpressionDeclaration__Group_2__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1440:1: ( ( rule__PropositionExpressionDeclaration__Group_2__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1440:1: ( ( rule__PropositionExpressionDeclaration__Group_2__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1441:1: ( rule__PropositionExpressionDeclaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getGroup_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1442:1: ( rule__PropositionExpressionDeclaration__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1442:2: rule__PropositionExpressionDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group_2__0_in_rule__PropositionExpressionDeclaration__Group__2__Impl3061);
            	    rule__PropositionExpressionDeclaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1452:1: rule__PropositionExpressionDeclaration__Group__3 : rule__PropositionExpressionDeclaration__Group__3__Impl ;
    public final void rule__PropositionExpressionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1456:1: ( rule__PropositionExpressionDeclaration__Group__3__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1457:2: rule__PropositionExpressionDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group__3__Impl_in_rule__PropositionExpressionDeclaration__Group__33092);
            rule__PropositionExpressionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__3"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1463:1: rule__PropositionExpressionDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__PropositionExpressionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1467:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1468:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1468:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1469:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__PropositionExpressionDeclaration__Group__3__Impl3120); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group_2__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1490:1: rule__PropositionExpressionDeclaration__Group_2__0 : rule__PropositionExpressionDeclaration__Group_2__0__Impl rule__PropositionExpressionDeclaration__Group_2__1 ;
    public final void rule__PropositionExpressionDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1494:1: ( rule__PropositionExpressionDeclaration__Group_2__0__Impl rule__PropositionExpressionDeclaration__Group_2__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1495:2: rule__PropositionExpressionDeclaration__Group_2__0__Impl rule__PropositionExpressionDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group_2__0__Impl_in_rule__PropositionExpressionDeclaration__Group_2__03159);
            rule__PropositionExpressionDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group_2__1_in_rule__PropositionExpressionDeclaration__Group_2__03162);
            rule__PropositionExpressionDeclaration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group_2__0"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group_2__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1502:1: rule__PropositionExpressionDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PropositionExpressionDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1506:1: ( ( ',' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1507:1: ( ',' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1507:1: ( ',' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1508:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__PropositionExpressionDeclaration__Group_2__0__Impl3190); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group_2__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1521:1: rule__PropositionExpressionDeclaration__Group_2__1 : rule__PropositionExpressionDeclaration__Group_2__1__Impl ;
    public final void rule__PropositionExpressionDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1525:1: ( rule__PropositionExpressionDeclaration__Group_2__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1526:2: rule__PropositionExpressionDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__Group_2__1__Impl_in_rule__PropositionExpressionDeclaration__Group_2__13221);
            rule__PropositionExpressionDeclaration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group_2__1"


    // $ANTLR start "rule__PropositionExpressionDeclaration__Group_2__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1532:1: rule__PropositionExpressionDeclaration__Group_2__1__Impl : ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 ) ) ;
    public final void rule__PropositionExpressionDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1536:1: ( ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1537:1: ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1537:1: ( ( rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1538:1: ( rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsAssignment_2_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1539:1: ( rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1539:2: rule__PropositionExpressionDeclaration__ArgsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PropositionExpressionDeclaration__ArgsAssignment_2_1_in_rule__PropositionExpressionDeclaration__Group_2__1__Impl3248);
            rule__PropositionExpressionDeclaration__ArgsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsAssignment_2_1()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__SituationDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1553:1: rule__SituationDeclaration__Group__0 : rule__SituationDeclaration__Group__0__Impl rule__SituationDeclaration__Group__1 ;
    public final void rule__SituationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1557:1: ( rule__SituationDeclaration__Group__0__Impl rule__SituationDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1558:2: rule__SituationDeclaration__Group__0__Impl rule__SituationDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__0__Impl_in_rule__SituationDeclaration__Group__03282);
            rule__SituationDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__1_in_rule__SituationDeclaration__Group__03285);
            rule__SituationDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SituationDeclaration__Group__0"


    // $ANTLR start "rule__SituationDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1565:1: rule__SituationDeclaration__Group__0__Impl : ( 'situation' ) ;
    public final void rule__SituationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1569:1: ( ( 'situation' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1570:1: ( 'situation' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1570:1: ( 'situation' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1571:1: 'situation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getSituationKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__SituationDeclaration__Group__0__Impl3313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getSituationKeyword_0()); 
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
    // $ANTLR end "rule__SituationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SituationDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1584:1: rule__SituationDeclaration__Group__1 : rule__SituationDeclaration__Group__1__Impl rule__SituationDeclaration__Group__2 ;
    public final void rule__SituationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1588:1: ( rule__SituationDeclaration__Group__1__Impl rule__SituationDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1589:2: rule__SituationDeclaration__Group__1__Impl rule__SituationDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__1__Impl_in_rule__SituationDeclaration__Group__13344);
            rule__SituationDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__2_in_rule__SituationDeclaration__Group__13347);
            rule__SituationDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SituationDeclaration__Group__1"


    // $ANTLR start "rule__SituationDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1596:1: rule__SituationDeclaration__Group__1__Impl : ( ( rule__SituationDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SituationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1600:1: ( ( ( rule__SituationDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1601:1: ( ( rule__SituationDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1601:1: ( ( rule__SituationDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1602:1: ( rule__SituationDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1603:1: ( rule__SituationDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1603:2: rule__SituationDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__NameAssignment_1_in_rule__SituationDeclaration__Group__1__Impl3374);
            rule__SituationDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SituationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SituationDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1613:1: rule__SituationDeclaration__Group__2 : rule__SituationDeclaration__Group__2__Impl rule__SituationDeclaration__Group__3 ;
    public final void rule__SituationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1617:1: ( rule__SituationDeclaration__Group__2__Impl rule__SituationDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1618:2: rule__SituationDeclaration__Group__2__Impl rule__SituationDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__2__Impl_in_rule__SituationDeclaration__Group__23404);
            rule__SituationDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__3_in_rule__SituationDeclaration__Group__23407);
            rule__SituationDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SituationDeclaration__Group__2"


    // $ANTLR start "rule__SituationDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1625:1: rule__SituationDeclaration__Group__2__Impl : ( ':=' ) ;
    public final void rule__SituationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1629:1: ( ( ':=' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1630:1: ( ':=' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1630:1: ( ':=' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1631:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__SituationDeclaration__Group__2__Impl3435); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getColonEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__SituationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SituationDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1644:1: rule__SituationDeclaration__Group__3 : rule__SituationDeclaration__Group__3__Impl rule__SituationDeclaration__Group__4 ;
    public final void rule__SituationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1648:1: ( rule__SituationDeclaration__Group__3__Impl rule__SituationDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1649:2: rule__SituationDeclaration__Group__3__Impl rule__SituationDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__3__Impl_in_rule__SituationDeclaration__Group__33466);
            rule__SituationDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__4_in_rule__SituationDeclaration__Group__33469);
            rule__SituationDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SituationDeclaration__Group__3"


    // $ANTLR start "rule__SituationDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1656:1: rule__SituationDeclaration__Group__3__Impl : ( ( rule__SituationDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__SituationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1660:1: ( ( ( rule__SituationDeclaration__ExpressionAssignment_3 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1661:1: ( ( rule__SituationDeclaration__ExpressionAssignment_3 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1661:1: ( ( rule__SituationDeclaration__ExpressionAssignment_3 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1662:1: ( rule__SituationDeclaration__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getExpressionAssignment_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1663:1: ( rule__SituationDeclaration__ExpressionAssignment_3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1663:2: rule__SituationDeclaration__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__ExpressionAssignment_3_in_rule__SituationDeclaration__Group__3__Impl3496);
            rule__SituationDeclaration__ExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getExpressionAssignment_3()); 
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
    // $ANTLR end "rule__SituationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SituationDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1673:1: rule__SituationDeclaration__Group__4 : rule__SituationDeclaration__Group__4__Impl ;
    public final void rule__SituationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1677:1: ( rule__SituationDeclaration__Group__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1678:2: rule__SituationDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SituationDeclaration__Group__4__Impl_in_rule__SituationDeclaration__Group__43526);
            rule__SituationDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SituationDeclaration__Group__4"


    // $ANTLR start "rule__SituationDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1684:1: rule__SituationDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__SituationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1688:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1689:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1689:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1690:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__SituationDeclaration__Group__4__Impl3554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__SituationDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1713:1: rule__SemanticConstraintDeclaration__Group__0 : rule__SemanticConstraintDeclaration__Group__0__Impl rule__SemanticConstraintDeclaration__Group__1 ;
    public final void rule__SemanticConstraintDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1717:1: ( rule__SemanticConstraintDeclaration__Group__0__Impl rule__SemanticConstraintDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1718:2: rule__SemanticConstraintDeclaration__Group__0__Impl rule__SemanticConstraintDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__0__Impl_in_rule__SemanticConstraintDeclaration__Group__03595);
            rule__SemanticConstraintDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__1_in_rule__SemanticConstraintDeclaration__Group__03598);
            rule__SemanticConstraintDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__0"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1725:1: rule__SemanticConstraintDeclaration__Group__0__Impl : ( 'sconstraint' ) ;
    public final void rule__SemanticConstraintDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1729:1: ( ( 'sconstraint' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1730:1: ( 'sconstraint' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1730:1: ( 'sconstraint' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1731:1: 'sconstraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getSconstraintKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__SemanticConstraintDeclaration__Group__0__Impl3626); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getSconstraintKeyword_0()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1744:1: rule__SemanticConstraintDeclaration__Group__1 : rule__SemanticConstraintDeclaration__Group__1__Impl rule__SemanticConstraintDeclaration__Group__2 ;
    public final void rule__SemanticConstraintDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1748:1: ( rule__SemanticConstraintDeclaration__Group__1__Impl rule__SemanticConstraintDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1749:2: rule__SemanticConstraintDeclaration__Group__1__Impl rule__SemanticConstraintDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__1__Impl_in_rule__SemanticConstraintDeclaration__Group__13657);
            rule__SemanticConstraintDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__2_in_rule__SemanticConstraintDeclaration__Group__13660);
            rule__SemanticConstraintDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__1"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1756:1: rule__SemanticConstraintDeclaration__Group__1__Impl : ( ( rule__SemanticConstraintDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SemanticConstraintDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1760:1: ( ( ( rule__SemanticConstraintDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1761:1: ( ( rule__SemanticConstraintDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1761:1: ( ( rule__SemanticConstraintDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1762:1: ( rule__SemanticConstraintDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1763:1: ( rule__SemanticConstraintDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1763:2: rule__SemanticConstraintDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__NameAssignment_1_in_rule__SemanticConstraintDeclaration__Group__1__Impl3687);
            rule__SemanticConstraintDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1773:1: rule__SemanticConstraintDeclaration__Group__2 : rule__SemanticConstraintDeclaration__Group__2__Impl rule__SemanticConstraintDeclaration__Group__3 ;
    public final void rule__SemanticConstraintDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1777:1: ( rule__SemanticConstraintDeclaration__Group__2__Impl rule__SemanticConstraintDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1778:2: rule__SemanticConstraintDeclaration__Group__2__Impl rule__SemanticConstraintDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__2__Impl_in_rule__SemanticConstraintDeclaration__Group__23717);
            rule__SemanticConstraintDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__3_in_rule__SemanticConstraintDeclaration__Group__23720);
            rule__SemanticConstraintDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__2"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1785:1: rule__SemanticConstraintDeclaration__Group__2__Impl : ( ':=' ) ;
    public final void rule__SemanticConstraintDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1789:1: ( ( ':=' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1790:1: ( ':=' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1790:1: ( ':=' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1791:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__SemanticConstraintDeclaration__Group__2__Impl3748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getColonEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1804:1: rule__SemanticConstraintDeclaration__Group__3 : rule__SemanticConstraintDeclaration__Group__3__Impl rule__SemanticConstraintDeclaration__Group__4 ;
    public final void rule__SemanticConstraintDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1808:1: ( rule__SemanticConstraintDeclaration__Group__3__Impl rule__SemanticConstraintDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1809:2: rule__SemanticConstraintDeclaration__Group__3__Impl rule__SemanticConstraintDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__3__Impl_in_rule__SemanticConstraintDeclaration__Group__33779);
            rule__SemanticConstraintDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__4_in_rule__SemanticConstraintDeclaration__Group__33782);
            rule__SemanticConstraintDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__3"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1816:1: rule__SemanticConstraintDeclaration__Group__3__Impl : ( ( rule__SemanticConstraintDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__SemanticConstraintDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1820:1: ( ( ( rule__SemanticConstraintDeclaration__ExpressionAssignment_3 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1821:1: ( ( rule__SemanticConstraintDeclaration__ExpressionAssignment_3 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1821:1: ( ( rule__SemanticConstraintDeclaration__ExpressionAssignment_3 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1822:1: ( rule__SemanticConstraintDeclaration__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionAssignment_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1823:1: ( rule__SemanticConstraintDeclaration__ExpressionAssignment_3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1823:2: rule__SemanticConstraintDeclaration__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__ExpressionAssignment_3_in_rule__SemanticConstraintDeclaration__Group__3__Impl3809);
            rule__SemanticConstraintDeclaration__ExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionAssignment_3()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1833:1: rule__SemanticConstraintDeclaration__Group__4 : rule__SemanticConstraintDeclaration__Group__4__Impl ;
    public final void rule__SemanticConstraintDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1837:1: ( rule__SemanticConstraintDeclaration__Group__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1838:2: rule__SemanticConstraintDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SemanticConstraintDeclaration__Group__4__Impl_in_rule__SemanticConstraintDeclaration__Group__43839);
            rule__SemanticConstraintDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__4"


    // $ANTLR start "rule__SemanticConstraintDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1844:1: rule__SemanticConstraintDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__SemanticConstraintDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1848:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1849:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1849:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1850:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__SemanticConstraintDeclaration__Group__4__Impl3867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1873:1: rule__TransitionConstraintDeclaration__Group__0 : rule__TransitionConstraintDeclaration__Group__0__Impl rule__TransitionConstraintDeclaration__Group__1 ;
    public final void rule__TransitionConstraintDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1877:1: ( rule__TransitionConstraintDeclaration__Group__0__Impl rule__TransitionConstraintDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1878:2: rule__TransitionConstraintDeclaration__Group__0__Impl rule__TransitionConstraintDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__0__Impl_in_rule__TransitionConstraintDeclaration__Group__03908);
            rule__TransitionConstraintDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__1_in_rule__TransitionConstraintDeclaration__Group__03911);
            rule__TransitionConstraintDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__0"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1885:1: rule__TransitionConstraintDeclaration__Group__0__Impl : ( 'tconstraint' ) ;
    public final void rule__TransitionConstraintDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1889:1: ( ( 'tconstraint' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1890:1: ( 'tconstraint' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1890:1: ( 'tconstraint' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1891:1: 'tconstraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getTconstraintKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__TransitionConstraintDeclaration__Group__0__Impl3939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getTconstraintKeyword_0()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1904:1: rule__TransitionConstraintDeclaration__Group__1 : rule__TransitionConstraintDeclaration__Group__1__Impl rule__TransitionConstraintDeclaration__Group__2 ;
    public final void rule__TransitionConstraintDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1908:1: ( rule__TransitionConstraintDeclaration__Group__1__Impl rule__TransitionConstraintDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1909:2: rule__TransitionConstraintDeclaration__Group__1__Impl rule__TransitionConstraintDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__1__Impl_in_rule__TransitionConstraintDeclaration__Group__13970);
            rule__TransitionConstraintDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__2_in_rule__TransitionConstraintDeclaration__Group__13973);
            rule__TransitionConstraintDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__1"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1916:1: rule__TransitionConstraintDeclaration__Group__1__Impl : ( ( rule__TransitionConstraintDeclaration__NameAssignment_1 ) ) ;
    public final void rule__TransitionConstraintDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1920:1: ( ( ( rule__TransitionConstraintDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1921:1: ( ( rule__TransitionConstraintDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1921:1: ( ( rule__TransitionConstraintDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1922:1: ( rule__TransitionConstraintDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1923:1: ( rule__TransitionConstraintDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1923:2: rule__TransitionConstraintDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__NameAssignment_1_in_rule__TransitionConstraintDeclaration__Group__1__Impl4000);
            rule__TransitionConstraintDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1933:1: rule__TransitionConstraintDeclaration__Group__2 : rule__TransitionConstraintDeclaration__Group__2__Impl rule__TransitionConstraintDeclaration__Group__3 ;
    public final void rule__TransitionConstraintDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1937:1: ( rule__TransitionConstraintDeclaration__Group__2__Impl rule__TransitionConstraintDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1938:2: rule__TransitionConstraintDeclaration__Group__2__Impl rule__TransitionConstraintDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__2__Impl_in_rule__TransitionConstraintDeclaration__Group__24030);
            rule__TransitionConstraintDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__3_in_rule__TransitionConstraintDeclaration__Group__24033);
            rule__TransitionConstraintDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__2"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1945:1: rule__TransitionConstraintDeclaration__Group__2__Impl : ( ':=' ) ;
    public final void rule__TransitionConstraintDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1949:1: ( ( ':=' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1950:1: ( ':=' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1950:1: ( ':=' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1951:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__TransitionConstraintDeclaration__Group__2__Impl4061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getColonEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1964:1: rule__TransitionConstraintDeclaration__Group__3 : rule__TransitionConstraintDeclaration__Group__3__Impl rule__TransitionConstraintDeclaration__Group__4 ;
    public final void rule__TransitionConstraintDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1968:1: ( rule__TransitionConstraintDeclaration__Group__3__Impl rule__TransitionConstraintDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1969:2: rule__TransitionConstraintDeclaration__Group__3__Impl rule__TransitionConstraintDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__3__Impl_in_rule__TransitionConstraintDeclaration__Group__34092);
            rule__TransitionConstraintDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__4_in_rule__TransitionConstraintDeclaration__Group__34095);
            rule__TransitionConstraintDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__3"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1976:1: rule__TransitionConstraintDeclaration__Group__3__Impl : ( 'pre' ) ;
    public final void rule__TransitionConstraintDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1980:1: ( ( 'pre' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1981:1: ( 'pre' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1981:1: ( 'pre' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1982:1: 'pre'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getPreKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__TransitionConstraintDeclaration__Group__3__Impl4123); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getPreKeyword_3()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1995:1: rule__TransitionConstraintDeclaration__Group__4 : rule__TransitionConstraintDeclaration__Group__4__Impl rule__TransitionConstraintDeclaration__Group__5 ;
    public final void rule__TransitionConstraintDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:1999:1: ( rule__TransitionConstraintDeclaration__Group__4__Impl rule__TransitionConstraintDeclaration__Group__5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2000:2: rule__TransitionConstraintDeclaration__Group__4__Impl rule__TransitionConstraintDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__4__Impl_in_rule__TransitionConstraintDeclaration__Group__44154);
            rule__TransitionConstraintDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__5_in_rule__TransitionConstraintDeclaration__Group__44157);
            rule__TransitionConstraintDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__4"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2007:1: rule__TransitionConstraintDeclaration__Group__4__Impl : ( ( rule__TransitionConstraintDeclaration__LeftAssignment_4 ) ) ;
    public final void rule__TransitionConstraintDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2011:1: ( ( ( rule__TransitionConstraintDeclaration__LeftAssignment_4 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2012:1: ( ( rule__TransitionConstraintDeclaration__LeftAssignment_4 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2012:1: ( ( rule__TransitionConstraintDeclaration__LeftAssignment_4 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2013:1: ( rule__TransitionConstraintDeclaration__LeftAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftAssignment_4()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2014:1: ( rule__TransitionConstraintDeclaration__LeftAssignment_4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2014:2: rule__TransitionConstraintDeclaration__LeftAssignment_4
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__LeftAssignment_4_in_rule__TransitionConstraintDeclaration__Group__4__Impl4184);
            rule__TransitionConstraintDeclaration__LeftAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftAssignment_4()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2024:1: rule__TransitionConstraintDeclaration__Group__5 : rule__TransitionConstraintDeclaration__Group__5__Impl rule__TransitionConstraintDeclaration__Group__6 ;
    public final void rule__TransitionConstraintDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2028:1: ( rule__TransitionConstraintDeclaration__Group__5__Impl rule__TransitionConstraintDeclaration__Group__6 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2029:2: rule__TransitionConstraintDeclaration__Group__5__Impl rule__TransitionConstraintDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__5__Impl_in_rule__TransitionConstraintDeclaration__Group__54214);
            rule__TransitionConstraintDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__6_in_rule__TransitionConstraintDeclaration__Group__54217);
            rule__TransitionConstraintDeclaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__5"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__5__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2036:1: rule__TransitionConstraintDeclaration__Group__5__Impl : ( 'post' ) ;
    public final void rule__TransitionConstraintDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2040:1: ( ( 'post' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2041:1: ( 'post' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2041:1: ( 'post' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2042:1: 'post'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getPostKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__TransitionConstraintDeclaration__Group__5__Impl4245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getPostKeyword_5()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__5__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__6"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2055:1: rule__TransitionConstraintDeclaration__Group__6 : rule__TransitionConstraintDeclaration__Group__6__Impl rule__TransitionConstraintDeclaration__Group__7 ;
    public final void rule__TransitionConstraintDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2059:1: ( rule__TransitionConstraintDeclaration__Group__6__Impl rule__TransitionConstraintDeclaration__Group__7 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2060:2: rule__TransitionConstraintDeclaration__Group__6__Impl rule__TransitionConstraintDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__6__Impl_in_rule__TransitionConstraintDeclaration__Group__64276);
            rule__TransitionConstraintDeclaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__7_in_rule__TransitionConstraintDeclaration__Group__64279);
            rule__TransitionConstraintDeclaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__6"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__6__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2067:1: rule__TransitionConstraintDeclaration__Group__6__Impl : ( ( rule__TransitionConstraintDeclaration__RightAssignment_6 ) ) ;
    public final void rule__TransitionConstraintDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2071:1: ( ( ( rule__TransitionConstraintDeclaration__RightAssignment_6 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2072:1: ( ( rule__TransitionConstraintDeclaration__RightAssignment_6 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2072:1: ( ( rule__TransitionConstraintDeclaration__RightAssignment_6 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2073:1: ( rule__TransitionConstraintDeclaration__RightAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getRightAssignment_6()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2074:1: ( rule__TransitionConstraintDeclaration__RightAssignment_6 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2074:2: rule__TransitionConstraintDeclaration__RightAssignment_6
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__RightAssignment_6_in_rule__TransitionConstraintDeclaration__Group__6__Impl4306);
            rule__TransitionConstraintDeclaration__RightAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getRightAssignment_6()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__6__Impl"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__7"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2084:1: rule__TransitionConstraintDeclaration__Group__7 : rule__TransitionConstraintDeclaration__Group__7__Impl ;
    public final void rule__TransitionConstraintDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2088:1: ( rule__TransitionConstraintDeclaration__Group__7__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2089:2: rule__TransitionConstraintDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TransitionConstraintDeclaration__Group__7__Impl_in_rule__TransitionConstraintDeclaration__Group__74336);
            rule__TransitionConstraintDeclaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__7"


    // $ANTLR start "rule__TransitionConstraintDeclaration__Group__7__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2095:1: rule__TransitionConstraintDeclaration__Group__7__Impl : ( ';' ) ;
    public final void rule__TransitionConstraintDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2099:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2100:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2100:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2101:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getSemicolonKeyword_7()); 
            }
            match(input,28,FOLLOW_28_in_rule__TransitionConstraintDeclaration__Group__7__Impl4364); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getSemicolonKeyword_7()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__Group__7__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2130:1: rule__ExceptionDeclaration__Group__0 : rule__ExceptionDeclaration__Group__0__Impl rule__ExceptionDeclaration__Group__1 ;
    public final void rule__ExceptionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2134:1: ( rule__ExceptionDeclaration__Group__0__Impl rule__ExceptionDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2135:2: rule__ExceptionDeclaration__Group__0__Impl rule__ExceptionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__0__Impl_in_rule__ExceptionDeclaration__Group__04411);
            rule__ExceptionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__1_in_rule__ExceptionDeclaration__Group__04414);
            rule__ExceptionDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__0"


    // $ANTLR start "rule__ExceptionDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2142:1: rule__ExceptionDeclaration__Group__0__Impl : ( 'exception' ) ;
    public final void rule__ExceptionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2146:1: ( ( 'exception' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2147:1: ( 'exception' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2147:1: ( 'exception' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2148:1: 'exception'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getExceptionKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ExceptionDeclaration__Group__0__Impl4442); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getExceptionKeyword_0()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2161:1: rule__ExceptionDeclaration__Group__1 : rule__ExceptionDeclaration__Group__1__Impl rule__ExceptionDeclaration__Group__2 ;
    public final void rule__ExceptionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2165:1: ( rule__ExceptionDeclaration__Group__1__Impl rule__ExceptionDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2166:2: rule__ExceptionDeclaration__Group__1__Impl rule__ExceptionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__1__Impl_in_rule__ExceptionDeclaration__Group__14473);
            rule__ExceptionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__2_in_rule__ExceptionDeclaration__Group__14476);
            rule__ExceptionDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__1"


    // $ANTLR start "rule__ExceptionDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2173:1: rule__ExceptionDeclaration__Group__1__Impl : ( ( rule__ExceptionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2177:1: ( ( ( rule__ExceptionDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2178:1: ( ( rule__ExceptionDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2178:1: ( ( rule__ExceptionDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2179:1: ( rule__ExceptionDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2180:1: ( rule__ExceptionDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2180:2: rule__ExceptionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__NameAssignment_1_in_rule__ExceptionDeclaration__Group__1__Impl4503);
            rule__ExceptionDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2190:1: rule__ExceptionDeclaration__Group__2 : rule__ExceptionDeclaration__Group__2__Impl rule__ExceptionDeclaration__Group__3 ;
    public final void rule__ExceptionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2194:1: ( rule__ExceptionDeclaration__Group__2__Impl rule__ExceptionDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2195:2: rule__ExceptionDeclaration__Group__2__Impl rule__ExceptionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__2__Impl_in_rule__ExceptionDeclaration__Group__24533);
            rule__ExceptionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__3_in_rule__ExceptionDeclaration__Group__24536);
            rule__ExceptionDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__2"


    // $ANTLR start "rule__ExceptionDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2202:1: rule__ExceptionDeclaration__Group__2__Impl : ( ':=' ) ;
    public final void rule__ExceptionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2206:1: ( ( ':=' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2207:1: ( ':=' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2207:1: ( ':=' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2208:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExceptionDeclaration__Group__2__Impl4564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getColonEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2221:1: rule__ExceptionDeclaration__Group__3 : rule__ExceptionDeclaration__Group__3__Impl rule__ExceptionDeclaration__Group__4 ;
    public final void rule__ExceptionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2225:1: ( rule__ExceptionDeclaration__Group__3__Impl rule__ExceptionDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2226:2: rule__ExceptionDeclaration__Group__3__Impl rule__ExceptionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__3__Impl_in_rule__ExceptionDeclaration__Group__34595);
            rule__ExceptionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__4_in_rule__ExceptionDeclaration__Group__34598);
            rule__ExceptionDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__3"


    // $ANTLR start "rule__ExceptionDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2233:1: rule__ExceptionDeclaration__Group__3__Impl : ( ( rule__ExceptionDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__ExceptionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2237:1: ( ( ( rule__ExceptionDeclaration__ExpressionAssignment_3 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2238:1: ( ( rule__ExceptionDeclaration__ExpressionAssignment_3 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2238:1: ( ( rule__ExceptionDeclaration__ExpressionAssignment_3 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2239:1: ( rule__ExceptionDeclaration__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getExpressionAssignment_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2240:1: ( rule__ExceptionDeclaration__ExpressionAssignment_3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2240:2: rule__ExceptionDeclaration__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__ExpressionAssignment_3_in_rule__ExceptionDeclaration__Group__3__Impl4625);
            rule__ExceptionDeclaration__ExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getExpressionAssignment_3()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2250:1: rule__ExceptionDeclaration__Group__4 : rule__ExceptionDeclaration__Group__4__Impl ;
    public final void rule__ExceptionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2254:1: ( rule__ExceptionDeclaration__Group__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2255:2: rule__ExceptionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group__4__Impl_in_rule__ExceptionDeclaration__Group__44655);
            rule__ExceptionDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__4"


    // $ANTLR start "rule__ExceptionDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2261:1: rule__ExceptionDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__ExceptionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2265:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2266:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2266:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2267:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__ExceptionDeclaration__Group__4__Impl4683); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2290:1: rule__ScopeDeclaration__Group__0 : rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 ;
    public final void rule__ScopeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2294:1: ( rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2295:2: rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__0__Impl_in_rule__ScopeDeclaration__Group__04724);
            rule__ScopeDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__1_in_rule__ScopeDeclaration__Group__04727);
            rule__ScopeDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__0"


    // $ANTLR start "rule__ScopeDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2302:1: rule__ScopeDeclaration__Group__0__Impl : ( 'scope' ) ;
    public final void rule__ScopeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2306:1: ( ( 'scope' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2307:1: ( 'scope' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2307:1: ( 'scope' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2308:1: 'scope'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ScopeDeclaration__Group__0__Impl4755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2321:1: rule__ScopeDeclaration__Group__1 : rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 ;
    public final void rule__ScopeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2325:1: ( rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2326:2: rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__1__Impl_in_rule__ScopeDeclaration__Group__14786);
            rule__ScopeDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__2_in_rule__ScopeDeclaration__Group__14789);
            rule__ScopeDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__1"


    // $ANTLR start "rule__ScopeDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2333:1: rule__ScopeDeclaration__Group__1__Impl : ( ( rule__ScopeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ScopeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2337:1: ( ( ( rule__ScopeDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2338:1: ( ( rule__ScopeDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2338:1: ( ( rule__ScopeDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2339:1: ( rule__ScopeDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2340:1: ( rule__ScopeDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2340:2: rule__ScopeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__NameAssignment_1_in_rule__ScopeDeclaration__Group__1__Impl4816);
            rule__ScopeDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2350:1: rule__ScopeDeclaration__Group__2 : rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 ;
    public final void rule__ScopeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2354:1: ( rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2355:2: rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__2__Impl_in_rule__ScopeDeclaration__Group__24846);
            rule__ScopeDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__3_in_rule__ScopeDeclaration__Group__24849);
            rule__ScopeDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__2"


    // $ANTLR start "rule__ScopeDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2362:1: rule__ScopeDeclaration__Group__2__Impl : ( 'handle' ) ;
    public final void rule__ScopeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2366:1: ( ( 'handle' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2367:1: ( 'handle' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2367:1: ( 'handle' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2368:1: 'handle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getHandleKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__ScopeDeclaration__Group__2__Impl4877); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getHandleKeyword_2()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2381:1: rule__ScopeDeclaration__Group__3 : rule__ScopeDeclaration__Group__3__Impl rule__ScopeDeclaration__Group__4 ;
    public final void rule__ScopeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2385:1: ( rule__ScopeDeclaration__Group__3__Impl rule__ScopeDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2386:2: rule__ScopeDeclaration__Group__3__Impl rule__ScopeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__3__Impl_in_rule__ScopeDeclaration__Group__34908);
            rule__ScopeDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__4_in_rule__ScopeDeclaration__Group__34911);
            rule__ScopeDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__3"


    // $ANTLR start "rule__ScopeDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2393:1: rule__ScopeDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__ScopeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2397:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2398:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2398:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2399:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__ScopeDeclaration__Group__3__Impl4939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2412:1: rule__ScopeDeclaration__Group__4 : rule__ScopeDeclaration__Group__4__Impl rule__ScopeDeclaration__Group__5 ;
    public final void rule__ScopeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2416:1: ( rule__ScopeDeclaration__Group__4__Impl rule__ScopeDeclaration__Group__5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2417:2: rule__ScopeDeclaration__Group__4__Impl rule__ScopeDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__4__Impl_in_rule__ScopeDeclaration__Group__44970);
            rule__ScopeDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__5_in_rule__ScopeDeclaration__Group__44973);
            rule__ScopeDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__4"


    // $ANTLR start "rule__ScopeDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2424:1: rule__ScopeDeclaration__Group__4__Impl : ( ( rule__ScopeDeclaration__ExceptionAssignment_4 ) ) ;
    public final void rule__ScopeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2428:1: ( ( ( rule__ScopeDeclaration__ExceptionAssignment_4 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2429:1: ( ( rule__ScopeDeclaration__ExceptionAssignment_4 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2429:1: ( ( rule__ScopeDeclaration__ExceptionAssignment_4 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2430:1: ( rule__ScopeDeclaration__ExceptionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getExceptionAssignment_4()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2431:1: ( rule__ScopeDeclaration__ExceptionAssignment_4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2431:2: rule__ScopeDeclaration__ExceptionAssignment_4
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__ExceptionAssignment_4_in_rule__ScopeDeclaration__Group__4__Impl5000);
            rule__ScopeDeclaration__ExceptionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getExceptionAssignment_4()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2441:1: rule__ScopeDeclaration__Group__5 : rule__ScopeDeclaration__Group__5__Impl rule__ScopeDeclaration__Group__6 ;
    public final void rule__ScopeDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2445:1: ( rule__ScopeDeclaration__Group__5__Impl rule__ScopeDeclaration__Group__6 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2446:2: rule__ScopeDeclaration__Group__5__Impl rule__ScopeDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__5__Impl_in_rule__ScopeDeclaration__Group__55030);
            rule__ScopeDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__6_in_rule__ScopeDeclaration__Group__55033);
            rule__ScopeDeclaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__5"


    // $ANTLR start "rule__ScopeDeclaration__Group__5__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2453:1: rule__ScopeDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__ScopeDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2457:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2458:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2458:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2459:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,40,FOLLOW_40_in_rule__ScopeDeclaration__Group__5__Impl5061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__6"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2472:1: rule__ScopeDeclaration__Group__6 : rule__ScopeDeclaration__Group__6__Impl rule__ScopeDeclaration__Group__7 ;
    public final void rule__ScopeDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2476:1: ( rule__ScopeDeclaration__Group__6__Impl rule__ScopeDeclaration__Group__7 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2477:2: rule__ScopeDeclaration__Group__6__Impl rule__ScopeDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__6__Impl_in_rule__ScopeDeclaration__Group__65092);
            rule__ScopeDeclaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__7_in_rule__ScopeDeclaration__Group__65095);
            rule__ScopeDeclaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__6"


    // $ANTLR start "rule__ScopeDeclaration__Group__6__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2484:1: rule__ScopeDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__ScopeDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2488:1: ( ( '{' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2489:1: ( '{' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2489:1: ( '{' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2490:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,25,FOLLOW_25_in_rule__ScopeDeclaration__Group__6__Impl5123); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__7"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2503:1: rule__ScopeDeclaration__Group__7 : rule__ScopeDeclaration__Group__7__Impl rule__ScopeDeclaration__Group__8 ;
    public final void rule__ScopeDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2507:1: ( rule__ScopeDeclaration__Group__7__Impl rule__ScopeDeclaration__Group__8 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2508:2: rule__ScopeDeclaration__Group__7__Impl rule__ScopeDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__7__Impl_in_rule__ScopeDeclaration__Group__75154);
            rule__ScopeDeclaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__8_in_rule__ScopeDeclaration__Group__75157);
            rule__ScopeDeclaration__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__7"


    // $ANTLR start "rule__ScopeDeclaration__Group__7__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2515:1: rule__ScopeDeclaration__Group__7__Impl : ( ( ( rule__ScopeDeclaration__HandlersAssignment_7 ) ) ( ( rule__ScopeDeclaration__HandlersAssignment_7 )* ) ) ;
    public final void rule__ScopeDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2519:1: ( ( ( ( rule__ScopeDeclaration__HandlersAssignment_7 ) ) ( ( rule__ScopeDeclaration__HandlersAssignment_7 )* ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2520:1: ( ( ( rule__ScopeDeclaration__HandlersAssignment_7 ) ) ( ( rule__ScopeDeclaration__HandlersAssignment_7 )* ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2520:1: ( ( ( rule__ScopeDeclaration__HandlersAssignment_7 ) ) ( ( rule__ScopeDeclaration__HandlersAssignment_7 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2521:1: ( ( rule__ScopeDeclaration__HandlersAssignment_7 ) ) ( ( rule__ScopeDeclaration__HandlersAssignment_7 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2521:1: ( ( rule__ScopeDeclaration__HandlersAssignment_7 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2522:1: ( rule__ScopeDeclaration__HandlersAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getHandlersAssignment_7()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2523:1: ( rule__ScopeDeclaration__HandlersAssignment_7 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2523:2: rule__ScopeDeclaration__HandlersAssignment_7
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__HandlersAssignment_7_in_rule__ScopeDeclaration__Group__7__Impl5186);
            rule__ScopeDeclaration__HandlersAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getHandlersAssignment_7()); 
            }

            }

            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2526:1: ( ( rule__ScopeDeclaration__HandlersAssignment_7 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2527:1: ( rule__ScopeDeclaration__HandlersAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getHandlersAssignment_7()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2528:1: ( rule__ScopeDeclaration__HandlersAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2528:2: rule__ScopeDeclaration__HandlersAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__ScopeDeclaration__HandlersAssignment_7_in_rule__ScopeDeclaration__Group__7__Impl5198);
            	    rule__ScopeDeclaration__HandlersAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getHandlersAssignment_7()); 
            }

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
    // $ANTLR end "rule__ScopeDeclaration__Group__7__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__8"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2539:1: rule__ScopeDeclaration__Group__8 : rule__ScopeDeclaration__Group__8__Impl ;
    public final void rule__ScopeDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2543:1: ( rule__ScopeDeclaration__Group__8__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2544:2: rule__ScopeDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ScopeDeclaration__Group__8__Impl_in_rule__ScopeDeclaration__Group__85231);
            rule__ScopeDeclaration__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__8"


    // $ANTLR start "rule__ScopeDeclaration__Group__8__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2550:1: rule__ScopeDeclaration__Group__8__Impl : ( '}' ) ;
    public final void rule__ScopeDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2554:1: ( ( '}' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2555:1: ( '}' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2555:1: ( '}' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2556:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,26,FOLLOW_26_in_rule__ScopeDeclaration__Group__8__Impl5259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__ScopeDeclaration__Group__8__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2587:1: rule__HandlerDeclaration__Group__0 : rule__HandlerDeclaration__Group__0__Impl rule__HandlerDeclaration__Group__1 ;
    public final void rule__HandlerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2591:1: ( rule__HandlerDeclaration__Group__0__Impl rule__HandlerDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2592:2: rule__HandlerDeclaration__Group__0__Impl rule__HandlerDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__0__Impl_in_rule__HandlerDeclaration__Group__05308);
            rule__HandlerDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__1_in_rule__HandlerDeclaration__Group__05311);
            rule__HandlerDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__0"


    // $ANTLR start "rule__HandlerDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2599:1: rule__HandlerDeclaration__Group__0__Impl : ( 'case' ) ;
    public final void rule__HandlerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2603:1: ( ( 'case' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2604:1: ( 'case' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2604:1: ( 'case' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2605:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getCaseKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__HandlerDeclaration__Group__0__Impl5339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getCaseKeyword_0()); 
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
    // $ANTLR end "rule__HandlerDeclaration__Group__0__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2618:1: rule__HandlerDeclaration__Group__1 : rule__HandlerDeclaration__Group__1__Impl rule__HandlerDeclaration__Group__2 ;
    public final void rule__HandlerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2622:1: ( rule__HandlerDeclaration__Group__1__Impl rule__HandlerDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2623:2: rule__HandlerDeclaration__Group__1__Impl rule__HandlerDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__1__Impl_in_rule__HandlerDeclaration__Group__15370);
            rule__HandlerDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__2_in_rule__HandlerDeclaration__Group__15373);
            rule__HandlerDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__1"


    // $ANTLR start "rule__HandlerDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2630:1: rule__HandlerDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__HandlerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2634:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2635:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2635:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2636:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__HandlerDeclaration__Group__1__Impl5401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__HandlerDeclaration__Group__1__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2649:1: rule__HandlerDeclaration__Group__2 : rule__HandlerDeclaration__Group__2__Impl rule__HandlerDeclaration__Group__3 ;
    public final void rule__HandlerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2653:1: ( rule__HandlerDeclaration__Group__2__Impl rule__HandlerDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2654:2: rule__HandlerDeclaration__Group__2__Impl rule__HandlerDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__2__Impl_in_rule__HandlerDeclaration__Group__25432);
            rule__HandlerDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__3_in_rule__HandlerDeclaration__Group__25435);
            rule__HandlerDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__2"


    // $ANTLR start "rule__HandlerDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2661:1: rule__HandlerDeclaration__Group__2__Impl : ( ( rule__HandlerDeclaration__ExpressionAssignment_2 ) ) ;
    public final void rule__HandlerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2665:1: ( ( ( rule__HandlerDeclaration__ExpressionAssignment_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2666:1: ( ( rule__HandlerDeclaration__ExpressionAssignment_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2666:1: ( ( rule__HandlerDeclaration__ExpressionAssignment_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2667:1: ( rule__HandlerDeclaration__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getExpressionAssignment_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2668:1: ( rule__HandlerDeclaration__ExpressionAssignment_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2668:2: rule__HandlerDeclaration__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__ExpressionAssignment_2_in_rule__HandlerDeclaration__Group__2__Impl5462);
            rule__HandlerDeclaration__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__HandlerDeclaration__Group__2__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2678:1: rule__HandlerDeclaration__Group__3 : rule__HandlerDeclaration__Group__3__Impl rule__HandlerDeclaration__Group__4 ;
    public final void rule__HandlerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2682:1: ( rule__HandlerDeclaration__Group__3__Impl rule__HandlerDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2683:2: rule__HandlerDeclaration__Group__3__Impl rule__HandlerDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__3__Impl_in_rule__HandlerDeclaration__Group__35492);
            rule__HandlerDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__4_in_rule__HandlerDeclaration__Group__35495);
            rule__HandlerDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__3"


    // $ANTLR start "rule__HandlerDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2690:1: rule__HandlerDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__HandlerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2694:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2695:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2695:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2696:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__HandlerDeclaration__Group__3__Impl5523); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__HandlerDeclaration__Group__3__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2709:1: rule__HandlerDeclaration__Group__4 : rule__HandlerDeclaration__Group__4__Impl rule__HandlerDeclaration__Group__5 ;
    public final void rule__HandlerDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2713:1: ( rule__HandlerDeclaration__Group__4__Impl rule__HandlerDeclaration__Group__5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2714:2: rule__HandlerDeclaration__Group__4__Impl rule__HandlerDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__4__Impl_in_rule__HandlerDeclaration__Group__45554);
            rule__HandlerDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__5_in_rule__HandlerDeclaration__Group__45557);
            rule__HandlerDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__4"


    // $ANTLR start "rule__HandlerDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2721:1: rule__HandlerDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__HandlerDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2725:1: ( ( '{' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2726:1: ( '{' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2726:1: ( '{' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2727:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_25_in_rule__HandlerDeclaration__Group__4__Impl5585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__HandlerDeclaration__Group__4__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2740:1: rule__HandlerDeclaration__Group__5 : rule__HandlerDeclaration__Group__5__Impl rule__HandlerDeclaration__Group__6 ;
    public final void rule__HandlerDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2744:1: ( rule__HandlerDeclaration__Group__5__Impl rule__HandlerDeclaration__Group__6 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2745:2: rule__HandlerDeclaration__Group__5__Impl rule__HandlerDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__5__Impl_in_rule__HandlerDeclaration__Group__55616);
            rule__HandlerDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__6_in_rule__HandlerDeclaration__Group__55619);
            rule__HandlerDeclaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__5"


    // $ANTLR start "rule__HandlerDeclaration__Group__5__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2752:1: rule__HandlerDeclaration__Group__5__Impl : ( ( ( rule__HandlerDeclaration__ActionsAssignment_5 ) ) ( ( rule__HandlerDeclaration__ActionsAssignment_5 )* ) ) ;
    public final void rule__HandlerDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2756:1: ( ( ( ( rule__HandlerDeclaration__ActionsAssignment_5 ) ) ( ( rule__HandlerDeclaration__ActionsAssignment_5 )* ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2757:1: ( ( ( rule__HandlerDeclaration__ActionsAssignment_5 ) ) ( ( rule__HandlerDeclaration__ActionsAssignment_5 )* ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2757:1: ( ( ( rule__HandlerDeclaration__ActionsAssignment_5 ) ) ( ( rule__HandlerDeclaration__ActionsAssignment_5 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2758:1: ( ( rule__HandlerDeclaration__ActionsAssignment_5 ) ) ( ( rule__HandlerDeclaration__ActionsAssignment_5 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2758:1: ( ( rule__HandlerDeclaration__ActionsAssignment_5 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2759:1: ( rule__HandlerDeclaration__ActionsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getActionsAssignment_5()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2760:1: ( rule__HandlerDeclaration__ActionsAssignment_5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2760:2: rule__HandlerDeclaration__ActionsAssignment_5
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__ActionsAssignment_5_in_rule__HandlerDeclaration__Group__5__Impl5648);
            rule__HandlerDeclaration__ActionsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getActionsAssignment_5()); 
            }

            }

            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2763:1: ( ( rule__HandlerDeclaration__ActionsAssignment_5 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2764:1: ( rule__HandlerDeclaration__ActionsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getActionsAssignment_5()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2765:1: ( rule__HandlerDeclaration__ActionsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2765:2: rule__HandlerDeclaration__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__HandlerDeclaration__ActionsAssignment_5_in_rule__HandlerDeclaration__Group__5__Impl5660);
            	    rule__HandlerDeclaration__ActionsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getActionsAssignment_5()); 
            }

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
    // $ANTLR end "rule__HandlerDeclaration__Group__5__Impl"


    // $ANTLR start "rule__HandlerDeclaration__Group__6"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2776:1: rule__HandlerDeclaration__Group__6 : rule__HandlerDeclaration__Group__6__Impl ;
    public final void rule__HandlerDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2780:1: ( rule__HandlerDeclaration__Group__6__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2781:2: rule__HandlerDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HandlerDeclaration__Group__6__Impl_in_rule__HandlerDeclaration__Group__65693);
            rule__HandlerDeclaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerDeclaration__Group__6"


    // $ANTLR start "rule__HandlerDeclaration__Group__6__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2787:1: rule__HandlerDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__HandlerDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2791:1: ( ( '}' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2792:1: ( '}' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2792:1: ( '}' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2793:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,26,FOLLOW_26_in_rule__HandlerDeclaration__Group__6__Impl5721); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__HandlerDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ActionDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2820:1: rule__ActionDeclaration__Group__0 : rule__ActionDeclaration__Group__0__Impl rule__ActionDeclaration__Group__1 ;
    public final void rule__ActionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2824:1: ( rule__ActionDeclaration__Group__0__Impl rule__ActionDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2825:2: rule__ActionDeclaration__Group__0__Impl rule__ActionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ActionDeclaration__Group__0__Impl_in_rule__ActionDeclaration__Group__05766);
            rule__ActionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActionDeclaration__Group__1_in_rule__ActionDeclaration__Group__05769);
            rule__ActionDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDeclaration__Group__0"


    // $ANTLR start "rule__ActionDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2832:1: rule__ActionDeclaration__Group__0__Impl : ( 'do' ) ;
    public final void rule__ActionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2836:1: ( ( 'do' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2837:1: ( 'do' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2837:1: ( 'do' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2838:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionDeclarationAccess().getDoKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ActionDeclaration__Group__0__Impl5797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionDeclarationAccess().getDoKeyword_0()); 
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
    // $ANTLR end "rule__ActionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ActionDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2851:1: rule__ActionDeclaration__Group__1 : rule__ActionDeclaration__Group__1__Impl rule__ActionDeclaration__Group__2 ;
    public final void rule__ActionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2855:1: ( rule__ActionDeclaration__Group__1__Impl rule__ActionDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2856:2: rule__ActionDeclaration__Group__1__Impl rule__ActionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ActionDeclaration__Group__1__Impl_in_rule__ActionDeclaration__Group__15828);
            rule__ActionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ActionDeclaration__Group__2_in_rule__ActionDeclaration__Group__15831);
            rule__ActionDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDeclaration__Group__1"


    // $ANTLR start "rule__ActionDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2863:1: rule__ActionDeclaration__Group__1__Impl : ( ( rule__ActionDeclaration__ExpressionAssignment_1 ) ) ;
    public final void rule__ActionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2867:1: ( ( ( rule__ActionDeclaration__ExpressionAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2868:1: ( ( rule__ActionDeclaration__ExpressionAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2868:1: ( ( rule__ActionDeclaration__ExpressionAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2869:1: ( rule__ActionDeclaration__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionDeclarationAccess().getExpressionAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2870:1: ( rule__ActionDeclaration__ExpressionAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2870:2: rule__ActionDeclaration__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionDeclaration__ExpressionAssignment_1_in_rule__ActionDeclaration__Group__1__Impl5858);
            rule__ActionDeclaration__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionDeclarationAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__ActionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ActionDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2880:1: rule__ActionDeclaration__Group__2 : rule__ActionDeclaration__Group__2__Impl ;
    public final void rule__ActionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2884:1: ( rule__ActionDeclaration__Group__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2885:2: rule__ActionDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ActionDeclaration__Group__2__Impl_in_rule__ActionDeclaration__Group__25888);
            rule__ActionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDeclaration__Group__2"


    // $ANTLR start "rule__ActionDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2891:1: rule__ActionDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__ActionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2895:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2896:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2896:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2897:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__ActionDeclaration__Group__2__Impl5916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionDeclarationAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__ActionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2916:1: rule__PropertyDeclaration__Group__0 : rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 ;
    public final void rule__PropertyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2920:1: ( rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2921:2: rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__05953);
            rule__PropertyDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__05956);
            rule__PropertyDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__0"


    // $ANTLR start "rule__PropertyDeclaration__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2928:1: rule__PropertyDeclaration__Group__0__Impl : ( 'spec' ) ;
    public final void rule__PropertyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2932:1: ( ( 'spec' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2933:1: ( 'spec' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2933:1: ( 'spec' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2934:1: 'spec'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getSpecKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__PropertyDeclaration__Group__0__Impl5984); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getSpecKeyword_0()); 
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
    // $ANTLR end "rule__PropertyDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2947:1: rule__PropertyDeclaration__Group__1 : rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 ;
    public final void rule__PropertyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2951:1: ( rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2952:2: rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__16015);
            rule__PropertyDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__16018);
            rule__PropertyDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__1"


    // $ANTLR start "rule__PropertyDeclaration__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2959:1: rule__PropertyDeclaration__Group__1__Impl : ( ( rule__PropertyDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PropertyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2963:1: ( ( ( rule__PropertyDeclaration__NameAssignment_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2964:1: ( ( rule__PropertyDeclaration__NameAssignment_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2964:1: ( ( rule__PropertyDeclaration__NameAssignment_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2965:1: ( rule__PropertyDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getNameAssignment_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2966:1: ( rule__PropertyDeclaration__NameAssignment_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2966:2: rule__PropertyDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__NameAssignment_1_in_rule__PropertyDeclaration__Group__1__Impl6045);
            rule__PropertyDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PropertyDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2976:1: rule__PropertyDeclaration__Group__2 : rule__PropertyDeclaration__Group__2__Impl rule__PropertyDeclaration__Group__3 ;
    public final void rule__PropertyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2980:1: ( rule__PropertyDeclaration__Group__2__Impl rule__PropertyDeclaration__Group__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2981:2: rule__PropertyDeclaration__Group__2__Impl rule__PropertyDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__26075);
            rule__PropertyDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__3_in_rule__PropertyDeclaration__Group__26078);
            rule__PropertyDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__2"


    // $ANTLR start "rule__PropertyDeclaration__Group__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2988:1: rule__PropertyDeclaration__Group__2__Impl : ( ':=' ) ;
    public final void rule__PropertyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2992:1: ( ( ':=' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2993:1: ( ':=' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2993:1: ( ':=' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:2994:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__PropertyDeclaration__Group__2__Impl6106); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getColonEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__PropertyDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3007:1: rule__PropertyDeclaration__Group__3 : rule__PropertyDeclaration__Group__3__Impl rule__PropertyDeclaration__Group__4 ;
    public final void rule__PropertyDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3011:1: ( rule__PropertyDeclaration__Group__3__Impl rule__PropertyDeclaration__Group__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3012:2: rule__PropertyDeclaration__Group__3__Impl rule__PropertyDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__3__Impl_in_rule__PropertyDeclaration__Group__36137);
            rule__PropertyDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__4_in_rule__PropertyDeclaration__Group__36140);
            rule__PropertyDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__3"


    // $ANTLR start "rule__PropertyDeclaration__Group__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3019:1: rule__PropertyDeclaration__Group__3__Impl : ( ( rule__PropertyDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__PropertyDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3023:1: ( ( ( rule__PropertyDeclaration__ExpressionAssignment_3 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3024:1: ( ( rule__PropertyDeclaration__ExpressionAssignment_3 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3024:1: ( ( rule__PropertyDeclaration__ExpressionAssignment_3 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3025:1: ( rule__PropertyDeclaration__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getExpressionAssignment_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3026:1: ( rule__PropertyDeclaration__ExpressionAssignment_3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3026:2: rule__PropertyDeclaration__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__ExpressionAssignment_3_in_rule__PropertyDeclaration__Group__3__Impl6167);
            rule__PropertyDeclaration__ExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getExpressionAssignment_3()); 
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
    // $ANTLR end "rule__PropertyDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3036:1: rule__PropertyDeclaration__Group__4 : rule__PropertyDeclaration__Group__4__Impl ;
    public final void rule__PropertyDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3040:1: ( rule__PropertyDeclaration__Group__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3041:2: rule__PropertyDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__4__Impl_in_rule__PropertyDeclaration__Group__46197);
            rule__PropertyDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__4"


    // $ANTLR start "rule__PropertyDeclaration__Group__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3047:1: rule__PropertyDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__PropertyDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3051:1: ( ( ';' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3052:1: ( ';' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3052:1: ( ';' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3053:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__PropertyDeclaration__Group__4__Impl6225); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__PropertyDeclaration__Group__4__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3076:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3080:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3081:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__06266);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__06269);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3088:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3092:1: ( ( ruleAndExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3093:1: ( ruleAndExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3093:1: ( ruleAndExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3094:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl6296);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3105:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3109:1: ( rule__OrExpression__Group__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3110:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__16325);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3116:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3120:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3121:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3121:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3122:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3123:1: ( rule__OrExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3123:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl6352);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3137:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3141:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3142:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__06387);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__06390);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3149:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3153:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3154:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3154:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3155:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3156:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3158:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3168:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3172:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3173:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__16448);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__16451);
            rule__OrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3180:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OpAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3184:1: ( ( ( rule__OrExpression__OpAssignment_1_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3185:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3185:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3186:1: ( rule__OrExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3187:1: ( rule__OrExpression__OpAssignment_1_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3187:2: rule__OrExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl6478);
            rule__OrExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3197:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3201:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3202:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__26508);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3208:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3212:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3213:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3213:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3214:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3215:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3215:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl6535);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3231:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3235:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3236:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__06571);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__06574);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3243:1: rule__AndExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3247:1: ( ( ruleRelationalExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3248:1: ( ruleRelationalExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3248:1: ( ruleRelationalExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3249:1: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__AndExpression__Group__0__Impl6601);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3260:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3264:1: ( rule__AndExpression__Group__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3265:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__16630);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3271:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3275:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3276:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3276:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3277:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3278:1: ( rule__AndExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3278:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl6657);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3292:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3296:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3297:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__06692);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__06695);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3304:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3308:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3309:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3309:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3310:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3311:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3313:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3323:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3327:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3328:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__16753);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__16756);
            rule__AndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3335:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3339:1: ( ( ( rule__AndExpression__OpAssignment_1_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3340:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3340:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3341:1: ( rule__AndExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3342:1: ( rule__AndExpression__OpAssignment_1_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3342:2: rule__AndExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OpAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl6783);
            rule__AndExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3352:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3356:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3357:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__26813);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3363:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3367:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3368:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3368:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3369:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3370:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3370:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl6840);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3386:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3390:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3391:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__06876);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__06879);
            rule__RelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3398:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3402:1: ( ( ruleAdditiveExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3403:1: ( ruleAdditiveExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3403:1: ( ruleAdditiveExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3404:1: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__Group__0__Impl6906);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3415:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3419:1: ( rule__RelationalExpression__Group__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3420:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__16935);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3426:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3430:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3431:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3431:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3432:1: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3433:1: ( rule__RelationalExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3433:2: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RelationalExpression__Group_1__0_in_rule__RelationalExpression__Group__1__Impl6962);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3447:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3451:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3452:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__0__Impl_in_rule__RelationalExpression__Group_1__06997);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__1_in_rule__RelationalExpression__Group_1__07000);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3459:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3463:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3464:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3464:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3465:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3466:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3468:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3478:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3482:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3483:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__1__Impl_in_rule__RelationalExpression__Group_1__17058);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__2_in_rule__RelationalExpression__Group_1__17061);
            rule__RelationalExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3490:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OpAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3494:1: ( ( ( rule__RelationalExpression__OpAssignment_1_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3495:1: ( ( rule__RelationalExpression__OpAssignment_1_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3495:1: ( ( rule__RelationalExpression__OpAssignment_1_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3496:1: ( rule__RelationalExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3497:1: ( rule__RelationalExpression__OpAssignment_1_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3497:2: rule__RelationalExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__OpAssignment_1_1_in_rule__RelationalExpression__Group_1__1__Impl7088);
            rule__RelationalExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3507:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3511:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3512:2: rule__RelationalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__2__Impl_in_rule__RelationalExpression__Group_1__27118);
            rule__RelationalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__2"


    // $ANTLR start "rule__RelationalExpression__Group_1__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3518:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__RightAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3522:1: ( ( ( rule__RelationalExpression__RightAssignment_1_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3523:1: ( ( rule__RelationalExpression__RightAssignment_1_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3523:1: ( ( rule__RelationalExpression__RightAssignment_1_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3524:1: ( rule__RelationalExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3525:1: ( rule__RelationalExpression__RightAssignment_1_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3525:2: rule__RelationalExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__RelationalExpression__RightAssignment_1_2_in_rule__RelationalExpression__Group_1__2__Impl7145);
            rule__RelationalExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__RelationalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_0__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3541:1: rule__AdditiveExpression__Group_0__0 : rule__AdditiveExpression__Group_0__0__Impl rule__AdditiveExpression__Group_0__1 ;
    public final void rule__AdditiveExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3545:1: ( rule__AdditiveExpression__Group_0__0__Impl rule__AdditiveExpression__Group_0__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3546:2: rule__AdditiveExpression__Group_0__0__Impl rule__AdditiveExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_0__0__Impl_in_rule__AdditiveExpression__Group_0__07181);
            rule__AdditiveExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_0__1_in_rule__AdditiveExpression__Group_0__07184);
            rule__AdditiveExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_0__0"


    // $ANTLR start "rule__AdditiveExpression__Group_0__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3553:1: rule__AdditiveExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3557:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3558:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3558:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3559:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3560:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3562:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_0__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3572:1: rule__AdditiveExpression__Group_0__1 : rule__AdditiveExpression__Group_0__1__Impl rule__AdditiveExpression__Group_0__2 ;
    public final void rule__AdditiveExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3576:1: ( rule__AdditiveExpression__Group_0__1__Impl rule__AdditiveExpression__Group_0__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3577:2: rule__AdditiveExpression__Group_0__1__Impl rule__AdditiveExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_0__1__Impl_in_rule__AdditiveExpression__Group_0__17242);
            rule__AdditiveExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_0__2_in_rule__AdditiveExpression__Group_0__17245);
            rule__AdditiveExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_0__1"


    // $ANTLR start "rule__AdditiveExpression__Group_0__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3584:1: rule__AdditiveExpression__Group_0__1__Impl : ( ( rule__AdditiveExpression__OpAssignment_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3588:1: ( ( ( rule__AdditiveExpression__OpAssignment_0_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3589:1: ( ( rule__AdditiveExpression__OpAssignment_0_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3589:1: ( ( rule__AdditiveExpression__OpAssignment_0_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3590:1: ( rule__AdditiveExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_0_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3591:1: ( rule__AdditiveExpression__OpAssignment_0_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3591:2: rule__AdditiveExpression__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__OpAssignment_0_1_in_rule__AdditiveExpression__Group_0__1__Impl7272);
            rule__AdditiveExpression__OpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_0_1()); 
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
    // $ANTLR end "rule__AdditiveExpression__Group_0__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_0__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3601:1: rule__AdditiveExpression__Group_0__2 : rule__AdditiveExpression__Group_0__2__Impl ;
    public final void rule__AdditiveExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3605:1: ( rule__AdditiveExpression__Group_0__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3606:2: rule__AdditiveExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_0__2__Impl_in_rule__AdditiveExpression__Group_0__27302);
            rule__AdditiveExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_0__2"


    // $ANTLR start "rule__AdditiveExpression__Group_0__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3612:1: rule__AdditiveExpression__Group_0__2__Impl : ( ( rule__AdditiveExpression__ExprAssignment_0_2 ) ) ;
    public final void rule__AdditiveExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3616:1: ( ( ( rule__AdditiveExpression__ExprAssignment_0_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3617:1: ( ( rule__AdditiveExpression__ExprAssignment_0_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3617:1: ( ( rule__AdditiveExpression__ExprAssignment_0_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3618:1: ( rule__AdditiveExpression__ExprAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getExprAssignment_0_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3619:1: ( rule__AdditiveExpression__ExprAssignment_0_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3619:2: rule__AdditiveExpression__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__ExprAssignment_0_2_in_rule__AdditiveExpression__Group_0__2__Impl7329);
            rule__AdditiveExpression__ExprAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getExprAssignment_0_2()); 
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
    // $ANTLR end "rule__AdditiveExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3635:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3639:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3640:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__07365);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__07368);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3647:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3651:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3652:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3652:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3653:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__PrimaryExpression__Group_0__0__Impl7396); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3666:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3670:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3671:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__17427);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__17430);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3678:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ExprAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3682:1: ( ( ( rule__PrimaryExpression__ExprAssignment_0_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3683:1: ( ( rule__PrimaryExpression__ExprAssignment_0_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3683:1: ( ( rule__PrimaryExpression__ExprAssignment_0_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3684:1: ( rule__PrimaryExpression__ExprAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExprAssignment_0_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3685:1: ( rule__PrimaryExpression__ExprAssignment_0_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3685:2: rule__PrimaryExpression__ExprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ExprAssignment_0_1_in_rule__PrimaryExpression__Group_0__1__Impl7457);
            rule__PrimaryExpression__ExprAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExprAssignment_0_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3695:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3699:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3700:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__27487);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3706:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3710:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3711:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3711:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3712:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__PrimaryExpression__Group_0__2__Impl7515); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3731:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3735:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3736:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__07552);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__07555);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3743:1: rule__PrimaryExpression__Group_2__0__Impl : ( ( rule__PrimaryExpression__OpBinAssignment_2_0 ) ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3747:1: ( ( ( rule__PrimaryExpression__OpBinAssignment_2_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3748:1: ( ( rule__PrimaryExpression__OpBinAssignment_2_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3748:1: ( ( rule__PrimaryExpression__OpBinAssignment_2_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3749:1: ( rule__PrimaryExpression__OpBinAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getOpBinAssignment_2_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3750:1: ( rule__PrimaryExpression__OpBinAssignment_2_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3750:2: rule__PrimaryExpression__OpBinAssignment_2_0
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__OpBinAssignment_2_0_in_rule__PrimaryExpression__Group_2__0__Impl7582);
            rule__PrimaryExpression__OpBinAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getOpBinAssignment_2_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3760:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3764:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3765:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__17612);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__17615);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3772:1: rule__PrimaryExpression__Group_2__1__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3776:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3777:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3777:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3778:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__PrimaryExpression__Group_2__1__Impl7643); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3791:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl rule__PrimaryExpression__Group_2__3 ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3795:1: ( rule__PrimaryExpression__Group_2__2__Impl rule__PrimaryExpression__Group_2__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3796:2: rule__PrimaryExpression__Group_2__2__Impl rule__PrimaryExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__27674);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__3_in_rule__PrimaryExpression__Group_2__27677);
            rule__PrimaryExpression__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3803:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__LeftAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3807:1: ( ( ( rule__PrimaryExpression__LeftAssignment_2_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3808:1: ( ( rule__PrimaryExpression__LeftAssignment_2_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3808:1: ( ( rule__PrimaryExpression__LeftAssignment_2_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3809:1: ( rule__PrimaryExpression__LeftAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftAssignment_2_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3810:1: ( rule__PrimaryExpression__LeftAssignment_2_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3810:2: rule__PrimaryExpression__LeftAssignment_2_2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__LeftAssignment_2_2_in_rule__PrimaryExpression__Group_2__2__Impl7704);
            rule__PrimaryExpression__LeftAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftAssignment_2_2()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3820:1: rule__PrimaryExpression__Group_2__3 : rule__PrimaryExpression__Group_2__3__Impl rule__PrimaryExpression__Group_2__4 ;
    public final void rule__PrimaryExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3824:1: ( rule__PrimaryExpression__Group_2__3__Impl rule__PrimaryExpression__Group_2__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3825:2: rule__PrimaryExpression__Group_2__3__Impl rule__PrimaryExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__3__Impl_in_rule__PrimaryExpression__Group_2__37734);
            rule__PrimaryExpression__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__4_in_rule__PrimaryExpression__Group_2__37737);
            rule__PrimaryExpression__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__3"


    // $ANTLR start "rule__PrimaryExpression__Group_2__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3832:1: rule__PrimaryExpression__Group_2__3__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3836:1: ( ( ',' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3837:1: ( ',' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3837:1: ( ',' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3838:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__PrimaryExpression__Group_2__3__Impl7765); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_3()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3851:1: rule__PrimaryExpression__Group_2__4 : rule__PrimaryExpression__Group_2__4__Impl rule__PrimaryExpression__Group_2__5 ;
    public final void rule__PrimaryExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3855:1: ( rule__PrimaryExpression__Group_2__4__Impl rule__PrimaryExpression__Group_2__5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3856:2: rule__PrimaryExpression__Group_2__4__Impl rule__PrimaryExpression__Group_2__5
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__4__Impl_in_rule__PrimaryExpression__Group_2__47796);
            rule__PrimaryExpression__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__5_in_rule__PrimaryExpression__Group_2__47799);
            rule__PrimaryExpression__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__4"


    // $ANTLR start "rule__PrimaryExpression__Group_2__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3863:1: rule__PrimaryExpression__Group_2__4__Impl : ( ( rule__PrimaryExpression__RightAssignment_2_4 ) ) ;
    public final void rule__PrimaryExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3867:1: ( ( ( rule__PrimaryExpression__RightAssignment_2_4 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3868:1: ( ( rule__PrimaryExpression__RightAssignment_2_4 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3868:1: ( ( rule__PrimaryExpression__RightAssignment_2_4 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3869:1: ( rule__PrimaryExpression__RightAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightAssignment_2_4()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3870:1: ( rule__PrimaryExpression__RightAssignment_2_4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3870:2: rule__PrimaryExpression__RightAssignment_2_4
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__RightAssignment_2_4_in_rule__PrimaryExpression__Group_2__4__Impl7826);
            rule__PrimaryExpression__RightAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightAssignment_2_4()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3880:1: rule__PrimaryExpression__Group_2__5 : rule__PrimaryExpression__Group_2__5__Impl ;
    public final void rule__PrimaryExpression__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3884:1: ( rule__PrimaryExpression__Group_2__5__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3885:2: rule__PrimaryExpression__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__5__Impl_in_rule__PrimaryExpression__Group_2__57856);
            rule__PrimaryExpression__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__5"


    // $ANTLR start "rule__PrimaryExpression__Group_2__5__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3891:1: rule__PrimaryExpression__Group_2__5__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3895:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3896:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3896:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3897:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_5()); 
            }
            match(input,40,FOLLOW_40_in_rule__PrimaryExpression__Group_2__5__Impl7884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_5()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__5__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3922:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3926:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3927:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__07927);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__07930);
            rule__PrimaryExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3934:1: rule__PrimaryExpression__Group_3__0__Impl : ( ( rule__PrimaryExpression__OpMulAssignment_3_0 ) ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3938:1: ( ( ( rule__PrimaryExpression__OpMulAssignment_3_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3939:1: ( ( rule__PrimaryExpression__OpMulAssignment_3_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3939:1: ( ( rule__PrimaryExpression__OpMulAssignment_3_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3940:1: ( rule__PrimaryExpression__OpMulAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getOpMulAssignment_3_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3941:1: ( rule__PrimaryExpression__OpMulAssignment_3_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3941:2: rule__PrimaryExpression__OpMulAssignment_3_0
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__OpMulAssignment_3_0_in_rule__PrimaryExpression__Group_3__0__Impl7957);
            rule__PrimaryExpression__OpMulAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getOpMulAssignment_3_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3951:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3955:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3956:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__17987);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__2_in_rule__PrimaryExpression__Group_3__17990);
            rule__PrimaryExpression__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3963:1: rule__PrimaryExpression__Group_3__1__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3967:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3968:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3968:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3969:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__PrimaryExpression__Group_3__1__Impl8018); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3982:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3986:1: ( rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3987:2: rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__2__Impl_in_rule__PrimaryExpression__Group_3__28049);
            rule__PrimaryExpression__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__3_in_rule__PrimaryExpression__Group_3__28052);
            rule__PrimaryExpression__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3994:1: rule__PrimaryExpression__Group_3__2__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_3_2 ) ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3998:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_3_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3999:1: ( ( rule__PrimaryExpression__ArgsAssignment_3_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:3999:1: ( ( rule__PrimaryExpression__ArgsAssignment_3_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4000:1: ( rule__PrimaryExpression__ArgsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4001:1: ( rule__PrimaryExpression__ArgsAssignment_3_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4001:2: rule__PrimaryExpression__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ArgsAssignment_3_2_in_rule__PrimaryExpression__Group_3__2__Impl8079);
            rule__PrimaryExpression__ArgsAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_2()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4011:1: rule__PrimaryExpression__Group_3__3 : rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 ;
    public final void rule__PrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4015:1: ( rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4016:2: rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__3__Impl_in_rule__PrimaryExpression__Group_3__38109);
            rule__PrimaryExpression__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__4_in_rule__PrimaryExpression__Group_3__38112);
            rule__PrimaryExpression__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__3"


    // $ANTLR start "rule__PrimaryExpression__Group_3__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4023:1: rule__PrimaryExpression__Group_3__3__Impl : ( ( ( rule__PrimaryExpression__Group_3_3__0 ) ) ( ( rule__PrimaryExpression__Group_3_3__0 )* ) ) ;
    public final void rule__PrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4027:1: ( ( ( ( rule__PrimaryExpression__Group_3_3__0 ) ) ( ( rule__PrimaryExpression__Group_3_3__0 )* ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4028:1: ( ( ( rule__PrimaryExpression__Group_3_3__0 ) ) ( ( rule__PrimaryExpression__Group_3_3__0 )* ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4028:1: ( ( ( rule__PrimaryExpression__Group_3_3__0 ) ) ( ( rule__PrimaryExpression__Group_3_3__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4029:1: ( ( rule__PrimaryExpression__Group_3_3__0 ) ) ( ( rule__PrimaryExpression__Group_3_3__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4029:1: ( ( rule__PrimaryExpression__Group_3_3__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4030:1: ( rule__PrimaryExpression__Group_3_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getGroup_3_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4031:1: ( rule__PrimaryExpression__Group_3_3__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4031:2: rule__PrimaryExpression__Group_3_3__0
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3_3__0_in_rule__PrimaryExpression__Group_3__3__Impl8141);
            rule__PrimaryExpression__Group_3_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getGroup_3_3()); 
            }

            }

            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4034:1: ( ( rule__PrimaryExpression__Group_3_3__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4035:1: ( rule__PrimaryExpression__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getGroup_3_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4036:1: ( rule__PrimaryExpression__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4036:2: rule__PrimaryExpression__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3_3__0_in_rule__PrimaryExpression__Group_3__3__Impl8153);
            	    rule__PrimaryExpression__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getGroup_3_3()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4047:1: rule__PrimaryExpression__Group_3__4 : rule__PrimaryExpression__Group_3__4__Impl ;
    public final void rule__PrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4051:1: ( rule__PrimaryExpression__Group_3__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4052:2: rule__PrimaryExpression__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__4__Impl_in_rule__PrimaryExpression__Group_3__48186);
            rule__PrimaryExpression__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__4"


    // $ANTLR start "rule__PrimaryExpression__Group_3__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4058:1: rule__PrimaryExpression__Group_3__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4062:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4063:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4063:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4064:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__PrimaryExpression__Group_3__4__Impl8214); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_3__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3_3__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4087:1: rule__PrimaryExpression__Group_3_3__0 : rule__PrimaryExpression__Group_3_3__0__Impl rule__PrimaryExpression__Group_3_3__1 ;
    public final void rule__PrimaryExpression__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4091:1: ( rule__PrimaryExpression__Group_3_3__0__Impl rule__PrimaryExpression__Group_3_3__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4092:2: rule__PrimaryExpression__Group_3_3__0__Impl rule__PrimaryExpression__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3_3__0__Impl_in_rule__PrimaryExpression__Group_3_3__08255);
            rule__PrimaryExpression__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3_3__1_in_rule__PrimaryExpression__Group_3_3__08258);
            rule__PrimaryExpression__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3_3__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4099:1: rule__PrimaryExpression__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4103:1: ( ( ',' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4104:1: ( ',' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4104:1: ( ',' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4105:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_3_3_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__PrimaryExpression__Group_3_3__0__Impl8286); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_3_3_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_3_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3_3__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4118:1: rule__PrimaryExpression__Group_3_3__1 : rule__PrimaryExpression__Group_3_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4122:1: ( rule__PrimaryExpression__Group_3_3__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4123:2: rule__PrimaryExpression__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3_3__1__Impl_in_rule__PrimaryExpression__Group_3_3__18317);
            rule__PrimaryExpression__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3_3__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4129:1: rule__PrimaryExpression__Group_3_3__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4133:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_3_3_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4134:1: ( ( rule__PrimaryExpression__ArgsAssignment_3_3_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4134:1: ( ( rule__PrimaryExpression__ArgsAssignment_3_3_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4135:1: ( rule__PrimaryExpression__ArgsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_3_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4136:1: ( rule__PrimaryExpression__ArgsAssignment_3_3_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4136:2: rule__PrimaryExpression__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ArgsAssignment_3_3_1_in_rule__PrimaryExpression__Group_3_3__1__Impl8344);
            rule__PrimaryExpression__ArgsAssignment_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_3_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_3_3__1__Impl"


    // $ANTLR start "rule__TemporalOrExpression__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4150:1: rule__TemporalOrExpression__Group__0 : rule__TemporalOrExpression__Group__0__Impl rule__TemporalOrExpression__Group__1 ;
    public final void rule__TemporalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4154:1: ( rule__TemporalOrExpression__Group__0__Impl rule__TemporalOrExpression__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4155:2: rule__TemporalOrExpression__Group__0__Impl rule__TemporalOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group__0__Impl_in_rule__TemporalOrExpression__Group__08378);
            rule__TemporalOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group__1_in_rule__TemporalOrExpression__Group__08381);
            rule__TemporalOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalOrExpression__Group__0"


    // $ANTLR start "rule__TemporalOrExpression__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4162:1: rule__TemporalOrExpression__Group__0__Impl : ( ruleTemporalAndExpression ) ;
    public final void rule__TemporalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4166:1: ( ( ruleTemporalAndExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4167:1: ( ruleTemporalAndExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4167:1: ( ruleTemporalAndExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4168:1: ruleTemporalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getTemporalAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_rule__TemporalOrExpression__Group__0__Impl8408);
            ruleTemporalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getTemporalAndExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__TemporalOrExpression__Group__0__Impl"


    // $ANTLR start "rule__TemporalOrExpression__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4179:1: rule__TemporalOrExpression__Group__1 : rule__TemporalOrExpression__Group__1__Impl ;
    public final void rule__TemporalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4183:1: ( rule__TemporalOrExpression__Group__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4184:2: rule__TemporalOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group__1__Impl_in_rule__TemporalOrExpression__Group__18437);
            rule__TemporalOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalOrExpression__Group__1"


    // $ANTLR start "rule__TemporalOrExpression__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4190:1: rule__TemporalOrExpression__Group__1__Impl : ( ( rule__TemporalOrExpression__Group_1__0 )* ) ;
    public final void rule__TemporalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4194:1: ( ( ( rule__TemporalOrExpression__Group_1__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4195:1: ( ( rule__TemporalOrExpression__Group_1__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4195:1: ( ( rule__TemporalOrExpression__Group_1__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4196:1: ( rule__TemporalOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getGroup_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4197:1: ( rule__TemporalOrExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4197:2: rule__TemporalOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemporalOrExpression__Group_1__0_in_rule__TemporalOrExpression__Group__1__Impl8464);
            	    rule__TemporalOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TemporalOrExpression__Group__1__Impl"


    // $ANTLR start "rule__TemporalOrExpression__Group_1__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4211:1: rule__TemporalOrExpression__Group_1__0 : rule__TemporalOrExpression__Group_1__0__Impl rule__TemporalOrExpression__Group_1__1 ;
    public final void rule__TemporalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4215:1: ( rule__TemporalOrExpression__Group_1__0__Impl rule__TemporalOrExpression__Group_1__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4216:2: rule__TemporalOrExpression__Group_1__0__Impl rule__TemporalOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group_1__0__Impl_in_rule__TemporalOrExpression__Group_1__08499);
            rule__TemporalOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group_1__1_in_rule__TemporalOrExpression__Group_1__08502);
            rule__TemporalOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalOrExpression__Group_1__0"


    // $ANTLR start "rule__TemporalOrExpression__Group_1__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4223:1: rule__TemporalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4227:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4228:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4228:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4229:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4230:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4232:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TemporalOrExpression__Group_1__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4242:1: rule__TemporalOrExpression__Group_1__1 : rule__TemporalOrExpression__Group_1__1__Impl rule__TemporalOrExpression__Group_1__2 ;
    public final void rule__TemporalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4246:1: ( rule__TemporalOrExpression__Group_1__1__Impl rule__TemporalOrExpression__Group_1__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4247:2: rule__TemporalOrExpression__Group_1__1__Impl rule__TemporalOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group_1__1__Impl_in_rule__TemporalOrExpression__Group_1__18560);
            rule__TemporalOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group_1__2_in_rule__TemporalOrExpression__Group_1__18563);
            rule__TemporalOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalOrExpression__Group_1__1"


    // $ANTLR start "rule__TemporalOrExpression__Group_1__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4254:1: rule__TemporalOrExpression__Group_1__1__Impl : ( ( rule__TemporalOrExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TemporalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4258:1: ( ( ( rule__TemporalOrExpression__OpAssignment_1_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4259:1: ( ( rule__TemporalOrExpression__OpAssignment_1_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4259:1: ( ( rule__TemporalOrExpression__OpAssignment_1_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4260:1: ( rule__TemporalOrExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getOpAssignment_1_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4261:1: ( rule__TemporalOrExpression__OpAssignment_1_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4261:2: rule__TemporalOrExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__OpAssignment_1_1_in_rule__TemporalOrExpression__Group_1__1__Impl8590);
            rule__TemporalOrExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__TemporalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TemporalOrExpression__Group_1__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4271:1: rule__TemporalOrExpression__Group_1__2 : rule__TemporalOrExpression__Group_1__2__Impl ;
    public final void rule__TemporalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4275:1: ( rule__TemporalOrExpression__Group_1__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4276:2: rule__TemporalOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__Group_1__2__Impl_in_rule__TemporalOrExpression__Group_1__28620);
            rule__TemporalOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalOrExpression__Group_1__2"


    // $ANTLR start "rule__TemporalOrExpression__Group_1__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4282:1: rule__TemporalOrExpression__Group_1__2__Impl : ( ( rule__TemporalOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TemporalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4286:1: ( ( ( rule__TemporalOrExpression__RightAssignment_1_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4287:1: ( ( rule__TemporalOrExpression__RightAssignment_1_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4287:1: ( ( rule__TemporalOrExpression__RightAssignment_1_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4288:1: ( rule__TemporalOrExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4289:1: ( rule__TemporalOrExpression__RightAssignment_1_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4289:2: rule__TemporalOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TemporalOrExpression__RightAssignment_1_2_in_rule__TemporalOrExpression__Group_1__2__Impl8647);
            rule__TemporalOrExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__TemporalOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TemporalAndExpression__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4305:1: rule__TemporalAndExpression__Group__0 : rule__TemporalAndExpression__Group__0__Impl rule__TemporalAndExpression__Group__1 ;
    public final void rule__TemporalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4309:1: ( rule__TemporalAndExpression__Group__0__Impl rule__TemporalAndExpression__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4310:2: rule__TemporalAndExpression__Group__0__Impl rule__TemporalAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group__0__Impl_in_rule__TemporalAndExpression__Group__08683);
            rule__TemporalAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group__1_in_rule__TemporalAndExpression__Group__08686);
            rule__TemporalAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAndExpression__Group__0"


    // $ANTLR start "rule__TemporalAndExpression__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4317:1: rule__TemporalAndExpression__Group__0__Impl : ( ruleTemporalRelationalExpression ) ;
    public final void rule__TemporalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4321:1: ( ( ruleTemporalRelationalExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4322:1: ( ruleTemporalRelationalExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4322:1: ( ruleTemporalRelationalExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4323:1: ruleTemporalRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getTemporalRelationalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_rule__TemporalAndExpression__Group__0__Impl8713);
            ruleTemporalRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getTemporalRelationalExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__TemporalAndExpression__Group__0__Impl"


    // $ANTLR start "rule__TemporalAndExpression__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4334:1: rule__TemporalAndExpression__Group__1 : rule__TemporalAndExpression__Group__1__Impl ;
    public final void rule__TemporalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4338:1: ( rule__TemporalAndExpression__Group__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4339:2: rule__TemporalAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group__1__Impl_in_rule__TemporalAndExpression__Group__18742);
            rule__TemporalAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAndExpression__Group__1"


    // $ANTLR start "rule__TemporalAndExpression__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4345:1: rule__TemporalAndExpression__Group__1__Impl : ( ( rule__TemporalAndExpression__Group_1__0 )* ) ;
    public final void rule__TemporalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4349:1: ( ( ( rule__TemporalAndExpression__Group_1__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4350:1: ( ( rule__TemporalAndExpression__Group_1__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4350:1: ( ( rule__TemporalAndExpression__Group_1__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4351:1: ( rule__TemporalAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getGroup_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4352:1: ( rule__TemporalAndExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4352:2: rule__TemporalAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemporalAndExpression__Group_1__0_in_rule__TemporalAndExpression__Group__1__Impl8769);
            	    rule__TemporalAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TemporalAndExpression__Group__1__Impl"


    // $ANTLR start "rule__TemporalAndExpression__Group_1__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4366:1: rule__TemporalAndExpression__Group_1__0 : rule__TemporalAndExpression__Group_1__0__Impl rule__TemporalAndExpression__Group_1__1 ;
    public final void rule__TemporalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4370:1: ( rule__TemporalAndExpression__Group_1__0__Impl rule__TemporalAndExpression__Group_1__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4371:2: rule__TemporalAndExpression__Group_1__0__Impl rule__TemporalAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group_1__0__Impl_in_rule__TemporalAndExpression__Group_1__08804);
            rule__TemporalAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group_1__1_in_rule__TemporalAndExpression__Group_1__08807);
            rule__TemporalAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAndExpression__Group_1__0"


    // $ANTLR start "rule__TemporalAndExpression__Group_1__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4378:1: rule__TemporalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4382:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4383:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4383:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4384:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4385:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4387:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TemporalAndExpression__Group_1__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4397:1: rule__TemporalAndExpression__Group_1__1 : rule__TemporalAndExpression__Group_1__1__Impl rule__TemporalAndExpression__Group_1__2 ;
    public final void rule__TemporalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4401:1: ( rule__TemporalAndExpression__Group_1__1__Impl rule__TemporalAndExpression__Group_1__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4402:2: rule__TemporalAndExpression__Group_1__1__Impl rule__TemporalAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group_1__1__Impl_in_rule__TemporalAndExpression__Group_1__18865);
            rule__TemporalAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group_1__2_in_rule__TemporalAndExpression__Group_1__18868);
            rule__TemporalAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAndExpression__Group_1__1"


    // $ANTLR start "rule__TemporalAndExpression__Group_1__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4409:1: rule__TemporalAndExpression__Group_1__1__Impl : ( ( rule__TemporalAndExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TemporalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4413:1: ( ( ( rule__TemporalAndExpression__OpAssignment_1_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4414:1: ( ( rule__TemporalAndExpression__OpAssignment_1_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4414:1: ( ( rule__TemporalAndExpression__OpAssignment_1_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4415:1: ( rule__TemporalAndExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getOpAssignment_1_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4416:1: ( rule__TemporalAndExpression__OpAssignment_1_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4416:2: rule__TemporalAndExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__OpAssignment_1_1_in_rule__TemporalAndExpression__Group_1__1__Impl8895);
            rule__TemporalAndExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__TemporalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TemporalAndExpression__Group_1__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4426:1: rule__TemporalAndExpression__Group_1__2 : rule__TemporalAndExpression__Group_1__2__Impl ;
    public final void rule__TemporalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4430:1: ( rule__TemporalAndExpression__Group_1__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4431:2: rule__TemporalAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__Group_1__2__Impl_in_rule__TemporalAndExpression__Group_1__28925);
            rule__TemporalAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAndExpression__Group_1__2"


    // $ANTLR start "rule__TemporalAndExpression__Group_1__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4437:1: rule__TemporalAndExpression__Group_1__2__Impl : ( ( rule__TemporalAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TemporalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4441:1: ( ( ( rule__TemporalAndExpression__RightAssignment_1_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4442:1: ( ( rule__TemporalAndExpression__RightAssignment_1_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4442:1: ( ( rule__TemporalAndExpression__RightAssignment_1_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4443:1: ( rule__TemporalAndExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4444:1: ( rule__TemporalAndExpression__RightAssignment_1_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4444:2: rule__TemporalAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TemporalAndExpression__RightAssignment_1_2_in_rule__TemporalAndExpression__Group_1__2__Impl8952);
            rule__TemporalAndExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__TemporalAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TemporalRelationalExpression__Group__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4460:1: rule__TemporalRelationalExpression__Group__0 : rule__TemporalRelationalExpression__Group__0__Impl rule__TemporalRelationalExpression__Group__1 ;
    public final void rule__TemporalRelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4464:1: ( rule__TemporalRelationalExpression__Group__0__Impl rule__TemporalRelationalExpression__Group__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4465:2: rule__TemporalRelationalExpression__Group__0__Impl rule__TemporalRelationalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group__0__Impl_in_rule__TemporalRelationalExpression__Group__08988);
            rule__TemporalRelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group__1_in_rule__TemporalRelationalExpression__Group__08991);
            rule__TemporalRelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__Group__0"


    // $ANTLR start "rule__TemporalRelationalExpression__Group__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4472:1: rule__TemporalRelationalExpression__Group__0__Impl : ( ruleTemporalAdditiveExpression ) ;
    public final void rule__TemporalRelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4476:1: ( ( ruleTemporalAdditiveExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4477:1: ( ruleTemporalAdditiveExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4477:1: ( ruleTemporalAdditiveExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4478:1: ruleTemporalAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getTemporalAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_rule__TemporalRelationalExpression__Group__0__Impl9018);
            ruleTemporalAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getTemporalAdditiveExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__TemporalRelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__TemporalRelationalExpression__Group__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4489:1: rule__TemporalRelationalExpression__Group__1 : rule__TemporalRelationalExpression__Group__1__Impl ;
    public final void rule__TemporalRelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4493:1: ( rule__TemporalRelationalExpression__Group__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4494:2: rule__TemporalRelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group__1__Impl_in_rule__TemporalRelationalExpression__Group__19047);
            rule__TemporalRelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__Group__1"


    // $ANTLR start "rule__TemporalRelationalExpression__Group__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4500:1: rule__TemporalRelationalExpression__Group__1__Impl : ( ( rule__TemporalRelationalExpression__Group_1__0 )* ) ;
    public final void rule__TemporalRelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4504:1: ( ( ( rule__TemporalRelationalExpression__Group_1__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4505:1: ( ( rule__TemporalRelationalExpression__Group_1__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4505:1: ( ( rule__TemporalRelationalExpression__Group_1__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4506:1: ( rule__TemporalRelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getGroup_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4507:1: ( rule__TemporalRelationalExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=12 && LA22_0<=13)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4507:2: rule__TemporalRelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group_1__0_in_rule__TemporalRelationalExpression__Group__1__Impl9074);
            	    rule__TemporalRelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TemporalRelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__TemporalRelationalExpression__Group_1__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4521:1: rule__TemporalRelationalExpression__Group_1__0 : rule__TemporalRelationalExpression__Group_1__0__Impl rule__TemporalRelationalExpression__Group_1__1 ;
    public final void rule__TemporalRelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4525:1: ( rule__TemporalRelationalExpression__Group_1__0__Impl rule__TemporalRelationalExpression__Group_1__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4526:2: rule__TemporalRelationalExpression__Group_1__0__Impl rule__TemporalRelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group_1__0__Impl_in_rule__TemporalRelationalExpression__Group_1__09109);
            rule__TemporalRelationalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group_1__1_in_rule__TemporalRelationalExpression__Group_1__09112);
            rule__TemporalRelationalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__Group_1__0"


    // $ANTLR start "rule__TemporalRelationalExpression__Group_1__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4533:1: rule__TemporalRelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalRelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4537:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4538:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4538:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4539:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4540:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4542:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TemporalRelationalExpression__Group_1__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4552:1: rule__TemporalRelationalExpression__Group_1__1 : rule__TemporalRelationalExpression__Group_1__1__Impl rule__TemporalRelationalExpression__Group_1__2 ;
    public final void rule__TemporalRelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4556:1: ( rule__TemporalRelationalExpression__Group_1__1__Impl rule__TemporalRelationalExpression__Group_1__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4557:2: rule__TemporalRelationalExpression__Group_1__1__Impl rule__TemporalRelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group_1__1__Impl_in_rule__TemporalRelationalExpression__Group_1__19170);
            rule__TemporalRelationalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group_1__2_in_rule__TemporalRelationalExpression__Group_1__19173);
            rule__TemporalRelationalExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__Group_1__1"


    // $ANTLR start "rule__TemporalRelationalExpression__Group_1__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4564:1: rule__TemporalRelationalExpression__Group_1__1__Impl : ( ( rule__TemporalRelationalExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TemporalRelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4568:1: ( ( ( rule__TemporalRelationalExpression__OpAssignment_1_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4569:1: ( ( rule__TemporalRelationalExpression__OpAssignment_1_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4569:1: ( ( rule__TemporalRelationalExpression__OpAssignment_1_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4570:1: ( rule__TemporalRelationalExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getOpAssignment_1_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4571:1: ( rule__TemporalRelationalExpression__OpAssignment_1_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4571:2: rule__TemporalRelationalExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__OpAssignment_1_1_in_rule__TemporalRelationalExpression__Group_1__1__Impl9200);
            rule__TemporalRelationalExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__TemporalRelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TemporalRelationalExpression__Group_1__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4581:1: rule__TemporalRelationalExpression__Group_1__2 : rule__TemporalRelationalExpression__Group_1__2__Impl ;
    public final void rule__TemporalRelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4585:1: ( rule__TemporalRelationalExpression__Group_1__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4586:2: rule__TemporalRelationalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__Group_1__2__Impl_in_rule__TemporalRelationalExpression__Group_1__29230);
            rule__TemporalRelationalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalRelationalExpression__Group_1__2"


    // $ANTLR start "rule__TemporalRelationalExpression__Group_1__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4592:1: rule__TemporalRelationalExpression__Group_1__2__Impl : ( ( rule__TemporalRelationalExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TemporalRelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4596:1: ( ( ( rule__TemporalRelationalExpression__RightAssignment_1_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4597:1: ( ( rule__TemporalRelationalExpression__RightAssignment_1_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4597:1: ( ( rule__TemporalRelationalExpression__RightAssignment_1_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4598:1: ( rule__TemporalRelationalExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4599:1: ( rule__TemporalRelationalExpression__RightAssignment_1_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4599:2: rule__TemporalRelationalExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__RightAssignment_1_2_in_rule__TemporalRelationalExpression__Group_1__2__Impl9257);
            rule__TemporalRelationalExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__TemporalRelationalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TemporalAdditiveExpression__Group_0__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4615:1: rule__TemporalAdditiveExpression__Group_0__0 : rule__TemporalAdditiveExpression__Group_0__0__Impl rule__TemporalAdditiveExpression__Group_0__1 ;
    public final void rule__TemporalAdditiveExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4619:1: ( rule__TemporalAdditiveExpression__Group_0__0__Impl rule__TemporalAdditiveExpression__Group_0__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4620:2: rule__TemporalAdditiveExpression__Group_0__0__Impl rule__TemporalAdditiveExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Group_0__0__Impl_in_rule__TemporalAdditiveExpression__Group_0__09293);
            rule__TemporalAdditiveExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Group_0__1_in_rule__TemporalAdditiveExpression__Group_0__09296);
            rule__TemporalAdditiveExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAdditiveExpression__Group_0__0"


    // $ANTLR start "rule__TemporalAdditiveExpression__Group_0__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4627:1: rule__TemporalAdditiveExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TemporalAdditiveExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4631:1: ( ( () ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4632:1: ( () )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4632:1: ( () )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4633:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4634:1: ()
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4636:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAdditiveExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TemporalAdditiveExpression__Group_0__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4646:1: rule__TemporalAdditiveExpression__Group_0__1 : rule__TemporalAdditiveExpression__Group_0__1__Impl rule__TemporalAdditiveExpression__Group_0__2 ;
    public final void rule__TemporalAdditiveExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4650:1: ( rule__TemporalAdditiveExpression__Group_0__1__Impl rule__TemporalAdditiveExpression__Group_0__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4651:2: rule__TemporalAdditiveExpression__Group_0__1__Impl rule__TemporalAdditiveExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Group_0__1__Impl_in_rule__TemporalAdditiveExpression__Group_0__19354);
            rule__TemporalAdditiveExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Group_0__2_in_rule__TemporalAdditiveExpression__Group_0__19357);
            rule__TemporalAdditiveExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAdditiveExpression__Group_0__1"


    // $ANTLR start "rule__TemporalAdditiveExpression__Group_0__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4658:1: rule__TemporalAdditiveExpression__Group_0__1__Impl : ( ( rule__TemporalAdditiveExpression__OpAssignment_0_1 ) ) ;
    public final void rule__TemporalAdditiveExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4662:1: ( ( ( rule__TemporalAdditiveExpression__OpAssignment_0_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4663:1: ( ( rule__TemporalAdditiveExpression__OpAssignment_0_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4663:1: ( ( rule__TemporalAdditiveExpression__OpAssignment_0_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4664:1: ( rule__TemporalAdditiveExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getOpAssignment_0_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4665:1: ( rule__TemporalAdditiveExpression__OpAssignment_0_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4665:2: rule__TemporalAdditiveExpression__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__OpAssignment_0_1_in_rule__TemporalAdditiveExpression__Group_0__1__Impl9384);
            rule__TemporalAdditiveExpression__OpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getOpAssignment_0_1()); 
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
    // $ANTLR end "rule__TemporalAdditiveExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TemporalAdditiveExpression__Group_0__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4675:1: rule__TemporalAdditiveExpression__Group_0__2 : rule__TemporalAdditiveExpression__Group_0__2__Impl ;
    public final void rule__TemporalAdditiveExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4679:1: ( rule__TemporalAdditiveExpression__Group_0__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4680:2: rule__TemporalAdditiveExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__Group_0__2__Impl_in_rule__TemporalAdditiveExpression__Group_0__29414);
            rule__TemporalAdditiveExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalAdditiveExpression__Group_0__2"


    // $ANTLR start "rule__TemporalAdditiveExpression__Group_0__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4686:1: rule__TemporalAdditiveExpression__Group_0__2__Impl : ( ( rule__TemporalAdditiveExpression__ExprAssignment_0_2 ) ) ;
    public final void rule__TemporalAdditiveExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4690:1: ( ( ( rule__TemporalAdditiveExpression__ExprAssignment_0_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4691:1: ( ( rule__TemporalAdditiveExpression__ExprAssignment_0_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4691:1: ( ( rule__TemporalAdditiveExpression__ExprAssignment_0_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4692:1: ( rule__TemporalAdditiveExpression__ExprAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getExprAssignment_0_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4693:1: ( rule__TemporalAdditiveExpression__ExprAssignment_0_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4693:2: rule__TemporalAdditiveExpression__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_rule__TemporalAdditiveExpression__ExprAssignment_0_2_in_rule__TemporalAdditiveExpression__Group_0__2__Impl9441);
            rule__TemporalAdditiveExpression__ExprAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getExprAssignment_0_2()); 
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
    // $ANTLR end "rule__TemporalAdditiveExpression__Group_0__2__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_0__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4709:1: rule__TemporalPrimaryExpression__Group_0__0 : rule__TemporalPrimaryExpression__Group_0__0__Impl rule__TemporalPrimaryExpression__Group_0__1 ;
    public final void rule__TemporalPrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4713:1: ( rule__TemporalPrimaryExpression__Group_0__0__Impl rule__TemporalPrimaryExpression__Group_0__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4714:2: rule__TemporalPrimaryExpression__Group_0__0__Impl rule__TemporalPrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_0__0__Impl_in_rule__TemporalPrimaryExpression__Group_0__09477);
            rule__TemporalPrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_0__1_in_rule__TemporalPrimaryExpression__Group_0__09480);
            rule__TemporalPrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_0__0"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_0__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4721:1: rule__TemporalPrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TemporalPrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4725:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4726:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4726:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4727:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_0__0__Impl9508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_0__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4740:1: rule__TemporalPrimaryExpression__Group_0__1 : rule__TemporalPrimaryExpression__Group_0__1__Impl rule__TemporalPrimaryExpression__Group_0__2 ;
    public final void rule__TemporalPrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4744:1: ( rule__TemporalPrimaryExpression__Group_0__1__Impl rule__TemporalPrimaryExpression__Group_0__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4745:2: rule__TemporalPrimaryExpression__Group_0__1__Impl rule__TemporalPrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_0__1__Impl_in_rule__TemporalPrimaryExpression__Group_0__19539);
            rule__TemporalPrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_0__2_in_rule__TemporalPrimaryExpression__Group_0__19542);
            rule__TemporalPrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_0__1"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_0__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4752:1: rule__TemporalPrimaryExpression__Group_0__1__Impl : ( ( rule__TemporalPrimaryExpression__ExprAssignment_0_1 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4756:1: ( ( ( rule__TemporalPrimaryExpression__ExprAssignment_0_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4757:1: ( ( rule__TemporalPrimaryExpression__ExprAssignment_0_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4757:1: ( ( rule__TemporalPrimaryExpression__ExprAssignment_0_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4758:1: ( rule__TemporalPrimaryExpression__ExprAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getExprAssignment_0_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4759:1: ( rule__TemporalPrimaryExpression__ExprAssignment_0_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4759:2: rule__TemporalPrimaryExpression__ExprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__ExprAssignment_0_1_in_rule__TemporalPrimaryExpression__Group_0__1__Impl9569);
            rule__TemporalPrimaryExpression__ExprAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getExprAssignment_0_1()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_0__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4769:1: rule__TemporalPrimaryExpression__Group_0__2 : rule__TemporalPrimaryExpression__Group_0__2__Impl ;
    public final void rule__TemporalPrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4773:1: ( rule__TemporalPrimaryExpression__Group_0__2__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4774:2: rule__TemporalPrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_0__2__Impl_in_rule__TemporalPrimaryExpression__Group_0__29599);
            rule__TemporalPrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_0__2"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_0__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4780:1: rule__TemporalPrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TemporalPrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4784:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4785:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4785:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4786:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_0__2__Impl9627); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4805:1: rule__TemporalPrimaryExpression__Group_2__0 : rule__TemporalPrimaryExpression__Group_2__0__Impl rule__TemporalPrimaryExpression__Group_2__1 ;
    public final void rule__TemporalPrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4809:1: ( rule__TemporalPrimaryExpression__Group_2__0__Impl rule__TemporalPrimaryExpression__Group_2__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4810:2: rule__TemporalPrimaryExpression__Group_2__0__Impl rule__TemporalPrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__0__Impl_in_rule__TemporalPrimaryExpression__Group_2__09664);
            rule__TemporalPrimaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__1_in_rule__TemporalPrimaryExpression__Group_2__09667);
            rule__TemporalPrimaryExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__0"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4817:1: rule__TemporalPrimaryExpression__Group_2__0__Impl : ( ( rule__TemporalPrimaryExpression__OpTempAssignment_2_0 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4821:1: ( ( ( rule__TemporalPrimaryExpression__OpTempAssignment_2_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4822:1: ( ( rule__TemporalPrimaryExpression__OpTempAssignment_2_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4822:1: ( ( rule__TemporalPrimaryExpression__OpTempAssignment_2_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4823:1: ( rule__TemporalPrimaryExpression__OpTempAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempAssignment_2_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4824:1: ( rule__TemporalPrimaryExpression__OpTempAssignment_2_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4824:2: rule__TemporalPrimaryExpression__OpTempAssignment_2_0
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__OpTempAssignment_2_0_in_rule__TemporalPrimaryExpression__Group_2__0__Impl9694);
            rule__TemporalPrimaryExpression__OpTempAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempAssignment_2_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4834:1: rule__TemporalPrimaryExpression__Group_2__1 : rule__TemporalPrimaryExpression__Group_2__1__Impl rule__TemporalPrimaryExpression__Group_2__2 ;
    public final void rule__TemporalPrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4838:1: ( rule__TemporalPrimaryExpression__Group_2__1__Impl rule__TemporalPrimaryExpression__Group_2__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4839:2: rule__TemporalPrimaryExpression__Group_2__1__Impl rule__TemporalPrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__1__Impl_in_rule__TemporalPrimaryExpression__Group_2__19724);
            rule__TemporalPrimaryExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__2_in_rule__TemporalPrimaryExpression__Group_2__19727);
            rule__TemporalPrimaryExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__1"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4846:1: rule__TemporalPrimaryExpression__Group_2__1__Impl : ( '(' ) ;
    public final void rule__TemporalPrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4850:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4851:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4851:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4852:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_2__1__Impl9755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4865:1: rule__TemporalPrimaryExpression__Group_2__2 : rule__TemporalPrimaryExpression__Group_2__2__Impl rule__TemporalPrimaryExpression__Group_2__3 ;
    public final void rule__TemporalPrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4869:1: ( rule__TemporalPrimaryExpression__Group_2__2__Impl rule__TemporalPrimaryExpression__Group_2__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4870:2: rule__TemporalPrimaryExpression__Group_2__2__Impl rule__TemporalPrimaryExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__2__Impl_in_rule__TemporalPrimaryExpression__Group_2__29786);
            rule__TemporalPrimaryExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__3_in_rule__TemporalPrimaryExpression__Group_2__29789);
            rule__TemporalPrimaryExpression__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__2"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4877:1: rule__TemporalPrimaryExpression__Group_2__2__Impl : ( ( rule__TemporalPrimaryExpression__TemporalAssignment_2_2 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4881:1: ( ( ( rule__TemporalPrimaryExpression__TemporalAssignment_2_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4882:1: ( ( rule__TemporalPrimaryExpression__TemporalAssignment_2_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4882:1: ( ( rule__TemporalPrimaryExpression__TemporalAssignment_2_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4883:1: ( rule__TemporalPrimaryExpression__TemporalAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalAssignment_2_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4884:1: ( rule__TemporalPrimaryExpression__TemporalAssignment_2_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4884:2: rule__TemporalPrimaryExpression__TemporalAssignment_2_2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__TemporalAssignment_2_2_in_rule__TemporalPrimaryExpression__Group_2__2__Impl9816);
            rule__TemporalPrimaryExpression__TemporalAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalAssignment_2_2()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4894:1: rule__TemporalPrimaryExpression__Group_2__3 : rule__TemporalPrimaryExpression__Group_2__3__Impl ;
    public final void rule__TemporalPrimaryExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4898:1: ( rule__TemporalPrimaryExpression__Group_2__3__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4899:2: rule__TemporalPrimaryExpression__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_2__3__Impl_in_rule__TemporalPrimaryExpression__Group_2__39846);
            rule__TemporalPrimaryExpression__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__3"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_2__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4905:1: rule__TemporalPrimaryExpression__Group_2__3__Impl : ( ')' ) ;
    public final void rule__TemporalPrimaryExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4909:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4910:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4910:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4911:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_2__3__Impl9874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_2__3__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4932:1: rule__TemporalPrimaryExpression__Group_3__0 : rule__TemporalPrimaryExpression__Group_3__0__Impl rule__TemporalPrimaryExpression__Group_3__1 ;
    public final void rule__TemporalPrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4936:1: ( rule__TemporalPrimaryExpression__Group_3__0__Impl rule__TemporalPrimaryExpression__Group_3__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4937:2: rule__TemporalPrimaryExpression__Group_3__0__Impl rule__TemporalPrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__0__Impl_in_rule__TemporalPrimaryExpression__Group_3__09913);
            rule__TemporalPrimaryExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__1_in_rule__TemporalPrimaryExpression__Group_3__09916);
            rule__TemporalPrimaryExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__0"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4944:1: rule__TemporalPrimaryExpression__Group_3__0__Impl : ( ( rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4948:1: ( ( ( rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4949:1: ( ( rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4949:1: ( ( rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4950:1: ( rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilAssignment_3_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4951:1: ( rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4951:2: rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0_in_rule__TemporalPrimaryExpression__Group_3__0__Impl9943);
            rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilAssignment_3_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4961:1: rule__TemporalPrimaryExpression__Group_3__1 : rule__TemporalPrimaryExpression__Group_3__1__Impl rule__TemporalPrimaryExpression__Group_3__2 ;
    public final void rule__TemporalPrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4965:1: ( rule__TemporalPrimaryExpression__Group_3__1__Impl rule__TemporalPrimaryExpression__Group_3__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4966:2: rule__TemporalPrimaryExpression__Group_3__1__Impl rule__TemporalPrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__1__Impl_in_rule__TemporalPrimaryExpression__Group_3__19973);
            rule__TemporalPrimaryExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__2_in_rule__TemporalPrimaryExpression__Group_3__19976);
            rule__TemporalPrimaryExpression__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__1"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4973:1: rule__TemporalPrimaryExpression__Group_3__1__Impl : ( '(' ) ;
    public final void rule__TemporalPrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4977:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4978:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4978:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4979:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_3__1__Impl10004); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4992:1: rule__TemporalPrimaryExpression__Group_3__2 : rule__TemporalPrimaryExpression__Group_3__2__Impl rule__TemporalPrimaryExpression__Group_3__3 ;
    public final void rule__TemporalPrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4996:1: ( rule__TemporalPrimaryExpression__Group_3__2__Impl rule__TemporalPrimaryExpression__Group_3__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:4997:2: rule__TemporalPrimaryExpression__Group_3__2__Impl rule__TemporalPrimaryExpression__Group_3__3
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__2__Impl_in_rule__TemporalPrimaryExpression__Group_3__210035);
            rule__TemporalPrimaryExpression__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__3_in_rule__TemporalPrimaryExpression__Group_3__210038);
            rule__TemporalPrimaryExpression__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__2"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5004:1: rule__TemporalPrimaryExpression__Group_3__2__Impl : ( ( rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5008:1: ( ( ( rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5009:1: ( ( rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5009:1: ( ( rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5010:1: ( rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpAssignment_3_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5011:1: ( rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5011:2: rule__TemporalPrimaryExpression__LeftExpAssignment_3_2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__LeftExpAssignment_3_2_in_rule__TemporalPrimaryExpression__Group_3__2__Impl10065);
            rule__TemporalPrimaryExpression__LeftExpAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpAssignment_3_2()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5021:1: rule__TemporalPrimaryExpression__Group_3__3 : rule__TemporalPrimaryExpression__Group_3__3__Impl rule__TemporalPrimaryExpression__Group_3__4 ;
    public final void rule__TemporalPrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5025:1: ( rule__TemporalPrimaryExpression__Group_3__3__Impl rule__TemporalPrimaryExpression__Group_3__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5026:2: rule__TemporalPrimaryExpression__Group_3__3__Impl rule__TemporalPrimaryExpression__Group_3__4
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__3__Impl_in_rule__TemporalPrimaryExpression__Group_3__310095);
            rule__TemporalPrimaryExpression__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__4_in_rule__TemporalPrimaryExpression__Group_3__310098);
            rule__TemporalPrimaryExpression__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__3"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5033:1: rule__TemporalPrimaryExpression__Group_3__3__Impl : ( 'U' ) ;
    public final void rule__TemporalPrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5037:1: ( ( 'U' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5038:1: ( 'U' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5038:1: ( 'U' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5039:1: 'U'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getUKeyword_3_3()); 
            }
            match(input,44,FOLLOW_44_in_rule__TemporalPrimaryExpression__Group_3__3__Impl10126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getUKeyword_3_3()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__3__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5052:1: rule__TemporalPrimaryExpression__Group_3__4 : rule__TemporalPrimaryExpression__Group_3__4__Impl rule__TemporalPrimaryExpression__Group_3__5 ;
    public final void rule__TemporalPrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5056:1: ( rule__TemporalPrimaryExpression__Group_3__4__Impl rule__TemporalPrimaryExpression__Group_3__5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5057:2: rule__TemporalPrimaryExpression__Group_3__4__Impl rule__TemporalPrimaryExpression__Group_3__5
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__4__Impl_in_rule__TemporalPrimaryExpression__Group_3__410157);
            rule__TemporalPrimaryExpression__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__5_in_rule__TemporalPrimaryExpression__Group_3__410160);
            rule__TemporalPrimaryExpression__Group_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__4"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5064:1: rule__TemporalPrimaryExpression__Group_3__4__Impl : ( ( rule__TemporalPrimaryExpression__RightExpAssignment_3_4 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5068:1: ( ( ( rule__TemporalPrimaryExpression__RightExpAssignment_3_4 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5069:1: ( ( rule__TemporalPrimaryExpression__RightExpAssignment_3_4 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5069:1: ( ( rule__TemporalPrimaryExpression__RightExpAssignment_3_4 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5070:1: ( rule__TemporalPrimaryExpression__RightExpAssignment_3_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpAssignment_3_4()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5071:1: ( rule__TemporalPrimaryExpression__RightExpAssignment_3_4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5071:2: rule__TemporalPrimaryExpression__RightExpAssignment_3_4
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__RightExpAssignment_3_4_in_rule__TemporalPrimaryExpression__Group_3__4__Impl10187);
            rule__TemporalPrimaryExpression__RightExpAssignment_3_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpAssignment_3_4()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__4__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5081:1: rule__TemporalPrimaryExpression__Group_3__5 : rule__TemporalPrimaryExpression__Group_3__5__Impl ;
    public final void rule__TemporalPrimaryExpression__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5085:1: ( rule__TemporalPrimaryExpression__Group_3__5__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5086:2: rule__TemporalPrimaryExpression__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_3__5__Impl_in_rule__TemporalPrimaryExpression__Group_3__510217);
            rule__TemporalPrimaryExpression__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__5"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_3__5__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5092:1: rule__TemporalPrimaryExpression__Group_3__5__Impl : ( ')' ) ;
    public final void rule__TemporalPrimaryExpression__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5096:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5097:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5097:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5098:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_3_5()); 
            }
            match(input,40,FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_3__5__Impl10245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_3_5()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_3__5__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5123:1: rule__TemporalPrimaryExpression__Group_4__0 : rule__TemporalPrimaryExpression__Group_4__0__Impl rule__TemporalPrimaryExpression__Group_4__1 ;
    public final void rule__TemporalPrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5127:1: ( rule__TemporalPrimaryExpression__Group_4__0__Impl rule__TemporalPrimaryExpression__Group_4__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5128:2: rule__TemporalPrimaryExpression__Group_4__0__Impl rule__TemporalPrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__0__Impl_in_rule__TemporalPrimaryExpression__Group_4__010288);
            rule__TemporalPrimaryExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__1_in_rule__TemporalPrimaryExpression__Group_4__010291);
            rule__TemporalPrimaryExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__0"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5135:1: rule__TemporalPrimaryExpression__Group_4__0__Impl : ( ( rule__TemporalPrimaryExpression__OpBinAssignment_4_0 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5139:1: ( ( ( rule__TemporalPrimaryExpression__OpBinAssignment_4_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5140:1: ( ( rule__TemporalPrimaryExpression__OpBinAssignment_4_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5140:1: ( ( rule__TemporalPrimaryExpression__OpBinAssignment_4_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5141:1: ( rule__TemporalPrimaryExpression__OpBinAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinAssignment_4_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5142:1: ( rule__TemporalPrimaryExpression__OpBinAssignment_4_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5142:2: rule__TemporalPrimaryExpression__OpBinAssignment_4_0
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__OpBinAssignment_4_0_in_rule__TemporalPrimaryExpression__Group_4__0__Impl10318);
            rule__TemporalPrimaryExpression__OpBinAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinAssignment_4_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5152:1: rule__TemporalPrimaryExpression__Group_4__1 : rule__TemporalPrimaryExpression__Group_4__1__Impl rule__TemporalPrimaryExpression__Group_4__2 ;
    public final void rule__TemporalPrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5156:1: ( rule__TemporalPrimaryExpression__Group_4__1__Impl rule__TemporalPrimaryExpression__Group_4__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5157:2: rule__TemporalPrimaryExpression__Group_4__1__Impl rule__TemporalPrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__1__Impl_in_rule__TemporalPrimaryExpression__Group_4__110348);
            rule__TemporalPrimaryExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__2_in_rule__TemporalPrimaryExpression__Group_4__110351);
            rule__TemporalPrimaryExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__1"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5164:1: rule__TemporalPrimaryExpression__Group_4__1__Impl : ( '(' ) ;
    public final void rule__TemporalPrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5168:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5169:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5169:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5170:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_4__1__Impl10379); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5183:1: rule__TemporalPrimaryExpression__Group_4__2 : rule__TemporalPrimaryExpression__Group_4__2__Impl rule__TemporalPrimaryExpression__Group_4__3 ;
    public final void rule__TemporalPrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5187:1: ( rule__TemporalPrimaryExpression__Group_4__2__Impl rule__TemporalPrimaryExpression__Group_4__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5188:2: rule__TemporalPrimaryExpression__Group_4__2__Impl rule__TemporalPrimaryExpression__Group_4__3
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__2__Impl_in_rule__TemporalPrimaryExpression__Group_4__210410);
            rule__TemporalPrimaryExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__3_in_rule__TemporalPrimaryExpression__Group_4__210413);
            rule__TemporalPrimaryExpression__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__2"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5195:1: rule__TemporalPrimaryExpression__Group_4__2__Impl : ( ( rule__TemporalPrimaryExpression__LeftAssignment_4_2 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5199:1: ( ( ( rule__TemporalPrimaryExpression__LeftAssignment_4_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5200:1: ( ( rule__TemporalPrimaryExpression__LeftAssignment_4_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5200:1: ( ( rule__TemporalPrimaryExpression__LeftAssignment_4_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5201:1: ( rule__TemporalPrimaryExpression__LeftAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftAssignment_4_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5202:1: ( rule__TemporalPrimaryExpression__LeftAssignment_4_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5202:2: rule__TemporalPrimaryExpression__LeftAssignment_4_2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__LeftAssignment_4_2_in_rule__TemporalPrimaryExpression__Group_4__2__Impl10440);
            rule__TemporalPrimaryExpression__LeftAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftAssignment_4_2()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__2__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5212:1: rule__TemporalPrimaryExpression__Group_4__3 : rule__TemporalPrimaryExpression__Group_4__3__Impl rule__TemporalPrimaryExpression__Group_4__4 ;
    public final void rule__TemporalPrimaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5216:1: ( rule__TemporalPrimaryExpression__Group_4__3__Impl rule__TemporalPrimaryExpression__Group_4__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5217:2: rule__TemporalPrimaryExpression__Group_4__3__Impl rule__TemporalPrimaryExpression__Group_4__4
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__3__Impl_in_rule__TemporalPrimaryExpression__Group_4__310470);
            rule__TemporalPrimaryExpression__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__4_in_rule__TemporalPrimaryExpression__Group_4__310473);
            rule__TemporalPrimaryExpression__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__3"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5224:1: rule__TemporalPrimaryExpression__Group_4__3__Impl : ( ',' ) ;
    public final void rule__TemporalPrimaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5228:1: ( ( ',' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5229:1: ( ',' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5229:1: ( ',' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5230:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_4_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__TemporalPrimaryExpression__Group_4__3__Impl10501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_4_3()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__3__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5243:1: rule__TemporalPrimaryExpression__Group_4__4 : rule__TemporalPrimaryExpression__Group_4__4__Impl rule__TemporalPrimaryExpression__Group_4__5 ;
    public final void rule__TemporalPrimaryExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5247:1: ( rule__TemporalPrimaryExpression__Group_4__4__Impl rule__TemporalPrimaryExpression__Group_4__5 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5248:2: rule__TemporalPrimaryExpression__Group_4__4__Impl rule__TemporalPrimaryExpression__Group_4__5
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__4__Impl_in_rule__TemporalPrimaryExpression__Group_4__410532);
            rule__TemporalPrimaryExpression__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__5_in_rule__TemporalPrimaryExpression__Group_4__410535);
            rule__TemporalPrimaryExpression__Group_4__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__4"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5255:1: rule__TemporalPrimaryExpression__Group_4__4__Impl : ( ( rule__TemporalPrimaryExpression__RightAssignment_4_4 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5259:1: ( ( ( rule__TemporalPrimaryExpression__RightAssignment_4_4 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5260:1: ( ( rule__TemporalPrimaryExpression__RightAssignment_4_4 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5260:1: ( ( rule__TemporalPrimaryExpression__RightAssignment_4_4 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5261:1: ( rule__TemporalPrimaryExpression__RightAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightAssignment_4_4()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5262:1: ( rule__TemporalPrimaryExpression__RightAssignment_4_4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5262:2: rule__TemporalPrimaryExpression__RightAssignment_4_4
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__RightAssignment_4_4_in_rule__TemporalPrimaryExpression__Group_4__4__Impl10562);
            rule__TemporalPrimaryExpression__RightAssignment_4_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightAssignment_4_4()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__4__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5272:1: rule__TemporalPrimaryExpression__Group_4__5 : rule__TemporalPrimaryExpression__Group_4__5__Impl ;
    public final void rule__TemporalPrimaryExpression__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5276:1: ( rule__TemporalPrimaryExpression__Group_4__5__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5277:2: rule__TemporalPrimaryExpression__Group_4__5__Impl
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_4__5__Impl_in_rule__TemporalPrimaryExpression__Group_4__510592);
            rule__TemporalPrimaryExpression__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__5"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_4__5__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5283:1: rule__TemporalPrimaryExpression__Group_4__5__Impl : ( ')' ) ;
    public final void rule__TemporalPrimaryExpression__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5287:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5288:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5288:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5289:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_4_5()); 
            }
            match(input,40,FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_4__5__Impl10620); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_4_5()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_4__5__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5314:1: rule__TemporalPrimaryExpression__Group_5__0 : rule__TemporalPrimaryExpression__Group_5__0__Impl rule__TemporalPrimaryExpression__Group_5__1 ;
    public final void rule__TemporalPrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5318:1: ( rule__TemporalPrimaryExpression__Group_5__0__Impl rule__TemporalPrimaryExpression__Group_5__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5319:2: rule__TemporalPrimaryExpression__Group_5__0__Impl rule__TemporalPrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__0__Impl_in_rule__TemporalPrimaryExpression__Group_5__010663);
            rule__TemporalPrimaryExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__1_in_rule__TemporalPrimaryExpression__Group_5__010666);
            rule__TemporalPrimaryExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__0"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5326:1: rule__TemporalPrimaryExpression__Group_5__0__Impl : ( ( rule__TemporalPrimaryExpression__OpMulAssignment_5_0 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5330:1: ( ( ( rule__TemporalPrimaryExpression__OpMulAssignment_5_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5331:1: ( ( rule__TemporalPrimaryExpression__OpMulAssignment_5_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5331:1: ( ( rule__TemporalPrimaryExpression__OpMulAssignment_5_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5332:1: ( rule__TemporalPrimaryExpression__OpMulAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulAssignment_5_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5333:1: ( rule__TemporalPrimaryExpression__OpMulAssignment_5_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5333:2: rule__TemporalPrimaryExpression__OpMulAssignment_5_0
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__OpMulAssignment_5_0_in_rule__TemporalPrimaryExpression__Group_5__0__Impl10693);
            rule__TemporalPrimaryExpression__OpMulAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulAssignment_5_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5343:1: rule__TemporalPrimaryExpression__Group_5__1 : rule__TemporalPrimaryExpression__Group_5__1__Impl rule__TemporalPrimaryExpression__Group_5__2 ;
    public final void rule__TemporalPrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5347:1: ( rule__TemporalPrimaryExpression__Group_5__1__Impl rule__TemporalPrimaryExpression__Group_5__2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5348:2: rule__TemporalPrimaryExpression__Group_5__1__Impl rule__TemporalPrimaryExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__1__Impl_in_rule__TemporalPrimaryExpression__Group_5__110723);
            rule__TemporalPrimaryExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__2_in_rule__TemporalPrimaryExpression__Group_5__110726);
            rule__TemporalPrimaryExpression__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__1"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5355:1: rule__TemporalPrimaryExpression__Group_5__1__Impl : ( '(' ) ;
    public final void rule__TemporalPrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5359:1: ( ( '(' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5360:1: ( '(' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5360:1: ( '(' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5361:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_5_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_5__1__Impl10754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_5_1()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__1__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5374:1: rule__TemporalPrimaryExpression__Group_5__2 : rule__TemporalPrimaryExpression__Group_5__2__Impl rule__TemporalPrimaryExpression__Group_5__3 ;
    public final void rule__TemporalPrimaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5378:1: ( rule__TemporalPrimaryExpression__Group_5__2__Impl rule__TemporalPrimaryExpression__Group_5__3 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5379:2: rule__TemporalPrimaryExpression__Group_5__2__Impl rule__TemporalPrimaryExpression__Group_5__3
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__2__Impl_in_rule__TemporalPrimaryExpression__Group_5__210785);
            rule__TemporalPrimaryExpression__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__3_in_rule__TemporalPrimaryExpression__Group_5__210788);
            rule__TemporalPrimaryExpression__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__2"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__2__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5386:1: rule__TemporalPrimaryExpression__Group_5__2__Impl : ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_2 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5390:1: ( ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_2 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5391:1: ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_2 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5391:1: ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_2 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5392:1: ( rule__TemporalPrimaryExpression__ArgsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsAssignment_5_2()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5393:1: ( rule__TemporalPrimaryExpression__ArgsAssignment_5_2 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5393:2: rule__TemporalPrimaryExpression__ArgsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__ArgsAssignment_5_2_in_rule__TemporalPrimaryExpression__Group_5__2__Impl10815);
            rule__TemporalPrimaryExpression__ArgsAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsAssignment_5_2()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__2__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5403:1: rule__TemporalPrimaryExpression__Group_5__3 : rule__TemporalPrimaryExpression__Group_5__3__Impl rule__TemporalPrimaryExpression__Group_5__4 ;
    public final void rule__TemporalPrimaryExpression__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5407:1: ( rule__TemporalPrimaryExpression__Group_5__3__Impl rule__TemporalPrimaryExpression__Group_5__4 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5408:2: rule__TemporalPrimaryExpression__Group_5__3__Impl rule__TemporalPrimaryExpression__Group_5__4
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__3__Impl_in_rule__TemporalPrimaryExpression__Group_5__310845);
            rule__TemporalPrimaryExpression__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__4_in_rule__TemporalPrimaryExpression__Group_5__310848);
            rule__TemporalPrimaryExpression__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__3"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__3__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5415:1: rule__TemporalPrimaryExpression__Group_5__3__Impl : ( ( ( rule__TemporalPrimaryExpression__Group_5_3__0 ) ) ( ( rule__TemporalPrimaryExpression__Group_5_3__0 )* ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5419:1: ( ( ( ( rule__TemporalPrimaryExpression__Group_5_3__0 ) ) ( ( rule__TemporalPrimaryExpression__Group_5_3__0 )* ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5420:1: ( ( ( rule__TemporalPrimaryExpression__Group_5_3__0 ) ) ( ( rule__TemporalPrimaryExpression__Group_5_3__0 )* ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5420:1: ( ( ( rule__TemporalPrimaryExpression__Group_5_3__0 ) ) ( ( rule__TemporalPrimaryExpression__Group_5_3__0 )* ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5421:1: ( ( rule__TemporalPrimaryExpression__Group_5_3__0 ) ) ( ( rule__TemporalPrimaryExpression__Group_5_3__0 )* )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5421:1: ( ( rule__TemporalPrimaryExpression__Group_5_3__0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5422:1: ( rule__TemporalPrimaryExpression__Group_5_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5423:1: ( rule__TemporalPrimaryExpression__Group_5_3__0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5423:2: rule__TemporalPrimaryExpression__Group_5_3__0
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__0_in_rule__TemporalPrimaryExpression__Group_5__3__Impl10877);
            rule__TemporalPrimaryExpression__Group_5_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5_3()); 
            }

            }

            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5426:1: ( ( rule__TemporalPrimaryExpression__Group_5_3__0 )* )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5427:1: ( rule__TemporalPrimaryExpression__Group_5_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5_3()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5428:1: ( rule__TemporalPrimaryExpression__Group_5_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5428:2: rule__TemporalPrimaryExpression__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__0_in_rule__TemporalPrimaryExpression__Group_5__3__Impl10889);
            	    rule__TemporalPrimaryExpression__Group_5_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5_3()); 
            }

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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__3__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5439:1: rule__TemporalPrimaryExpression__Group_5__4 : rule__TemporalPrimaryExpression__Group_5__4__Impl ;
    public final void rule__TemporalPrimaryExpression__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5443:1: ( rule__TemporalPrimaryExpression__Group_5__4__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5444:2: rule__TemporalPrimaryExpression__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5__4__Impl_in_rule__TemporalPrimaryExpression__Group_5__410922);
            rule__TemporalPrimaryExpression__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__4"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5__4__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5450:1: rule__TemporalPrimaryExpression__Group_5__4__Impl : ( ')' ) ;
    public final void rule__TemporalPrimaryExpression__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5454:1: ( ( ')' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5455:1: ( ')' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5455:1: ( ')' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5456:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_5_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_5__4__Impl10950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_5_4()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5__4__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5_3__0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5479:1: rule__TemporalPrimaryExpression__Group_5_3__0 : rule__TemporalPrimaryExpression__Group_5_3__0__Impl rule__TemporalPrimaryExpression__Group_5_3__1 ;
    public final void rule__TemporalPrimaryExpression__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5483:1: ( rule__TemporalPrimaryExpression__Group_5_3__0__Impl rule__TemporalPrimaryExpression__Group_5_3__1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5484:2: rule__TemporalPrimaryExpression__Group_5_3__0__Impl rule__TemporalPrimaryExpression__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__0__Impl_in_rule__TemporalPrimaryExpression__Group_5_3__010991);
            rule__TemporalPrimaryExpression__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__1_in_rule__TemporalPrimaryExpression__Group_5_3__010994);
            rule__TemporalPrimaryExpression__Group_5_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5_3__0"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5_3__0__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5491:1: rule__TemporalPrimaryExpression__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TemporalPrimaryExpression__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5495:1: ( ( ',' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5496:1: ( ',' )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5496:1: ( ',' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5497:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_5_3_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__TemporalPrimaryExpression__Group_5_3__0__Impl11022); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_5_3_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5_3__0__Impl"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5_3__1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5510:1: rule__TemporalPrimaryExpression__Group_5_3__1 : rule__TemporalPrimaryExpression__Group_5_3__1__Impl ;
    public final void rule__TemporalPrimaryExpression__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5514:1: ( rule__TemporalPrimaryExpression__Group_5_3__1__Impl )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5515:2: rule__TemporalPrimaryExpression__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__1__Impl_in_rule__TemporalPrimaryExpression__Group_5_3__111053);
            rule__TemporalPrimaryExpression__Group_5_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5_3__1"


    // $ANTLR start "rule__TemporalPrimaryExpression__Group_5_3__1__Impl"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5521:1: rule__TemporalPrimaryExpression__Group_5_3__1__Impl : ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 ) ) ;
    public final void rule__TemporalPrimaryExpression__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5525:1: ( ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5526:1: ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5526:1: ( ( rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5527:1: ( rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsAssignment_5_3_1()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5528:1: ( rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5528:2: rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1_in_rule__TemporalPrimaryExpression__Group_5_3__1__Impl11080);
            rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsAssignment_5_3_1()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__Group_5_3__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5543:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5547:1: ( ( ruleAbstractElement ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5548:1: ( ruleAbstractElement )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5548:1: ( ruleAbstractElement )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5549:1: ruleAbstractElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Domainmodel__ElementsAssignment11119);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__SystemDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5558:1: rule__SystemDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5562:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5563:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5563:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5564:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SystemDeclaration__NameAssignment_111150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SystemDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SystemDeclaration__DeclarationsAssignment_3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5573:1: rule__SystemDeclaration__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__SystemDeclaration__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5577:1: ( ( ruleDeclaration ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5578:1: ( ruleDeclaration )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5578:1: ( ruleDeclaration )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5579:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemDeclarationAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__SystemDeclaration__DeclarationsAssignment_311181);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemDeclarationAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__SystemDeclaration__DeclarationsAssignment_3"


    // $ANTLR start "rule__PropositionExpressionDeclaration__ArgsAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5588:1: rule__PropositionExpressionDeclaration__ArgsAssignment_1 : ( rulePropositionDeclaration ) ;
    public final void rule__PropositionExpressionDeclaration__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5592:1: ( ( rulePropositionDeclaration ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5593:1: ( rulePropositionDeclaration )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5593:1: ( rulePropositionDeclaration )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5594:1: rulePropositionDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsPropositionDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePropositionDeclaration_in_rule__PropositionExpressionDeclaration__ArgsAssignment_111212);
            rulePropositionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsPropositionDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__ArgsAssignment_1"


    // $ANTLR start "rule__PropositionExpressionDeclaration__ArgsAssignment_2_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5603:1: rule__PropositionExpressionDeclaration__ArgsAssignment_2_1 : ( rulePropositionDeclaration ) ;
    public final void rule__PropositionExpressionDeclaration__ArgsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5607:1: ( ( rulePropositionDeclaration ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5608:1: ( rulePropositionDeclaration )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5608:1: ( rulePropositionDeclaration )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5609:1: rulePropositionDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsPropositionDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePropositionDeclaration_in_rule__PropositionExpressionDeclaration__ArgsAssignment_2_111243);
            rulePropositionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsPropositionDeclarationParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__PropositionExpressionDeclaration__ArgsAssignment_2_1"


    // $ANTLR start "rule__PropositionDeclaration__NameAssignment"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5618:1: rule__PropositionDeclaration__NameAssignment : ( RULE_ID ) ;
    public final void rule__PropositionDeclaration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5622:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5623:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5623:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5624:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropositionDeclarationAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropositionDeclaration__NameAssignment11274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropositionDeclarationAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__PropositionDeclaration__NameAssignment"


    // $ANTLR start "rule__SituationDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5633:1: rule__SituationDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SituationDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5637:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5638:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5638:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5639:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SituationDeclaration__NameAssignment_111305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SituationDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SituationDeclaration__ExpressionAssignment_3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5648:1: rule__SituationDeclaration__ExpressionAssignment_3 : ( ruleLogicExpression ) ;
    public final void rule__SituationDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5652:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5653:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5653:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5654:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSituationDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__SituationDeclaration__ExpressionAssignment_311336);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSituationDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__SituationDeclaration__ExpressionAssignment_3"


    // $ANTLR start "rule__SemanticConstraintDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5663:1: rule__SemanticConstraintDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SemanticConstraintDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5667:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5668:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5668:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5669:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SemanticConstraintDeclaration__NameAssignment_111367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SemanticConstraintDeclaration__ExpressionAssignment_3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5678:1: rule__SemanticConstraintDeclaration__ExpressionAssignment_3 : ( ruleLogicExpression ) ;
    public final void rule__SemanticConstraintDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5682:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5683:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5683:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5684:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__SemanticConstraintDeclaration__ExpressionAssignment_311398);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__SemanticConstraintDeclaration__ExpressionAssignment_3"


    // $ANTLR start "rule__TransitionConstraintDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5693:1: rule__TransitionConstraintDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TransitionConstraintDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5697:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5698:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5698:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5699:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransitionConstraintDeclaration__NameAssignment_111429); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__NameAssignment_1"


    // $ANTLR start "rule__TransitionConstraintDeclaration__LeftAssignment_4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5708:1: rule__TransitionConstraintDeclaration__LeftAssignment_4 : ( ruleLogicExpression ) ;
    public final void rule__TransitionConstraintDeclaration__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5712:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5713:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5713:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5714:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftLogicExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__TransitionConstraintDeclaration__LeftAssignment_411460);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftLogicExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__LeftAssignment_4"


    // $ANTLR start "rule__TransitionConstraintDeclaration__RightAssignment_6"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5723:1: rule__TransitionConstraintDeclaration__RightAssignment_6 : ( ruleLogicExpression ) ;
    public final void rule__TransitionConstraintDeclaration__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5727:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5728:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5728:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5729:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionConstraintDeclarationAccess().getRightLogicExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__TransitionConstraintDeclaration__RightAssignment_611491);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionConstraintDeclarationAccess().getRightLogicExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__TransitionConstraintDeclaration__RightAssignment_6"


    // $ANTLR start "rule__ExceptionDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5738:1: rule__ExceptionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5742:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5743:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5743:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5744:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptionDeclaration__NameAssignment_111522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ExceptionDeclaration__ExpressionAssignment_3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5753:1: rule__ExceptionDeclaration__ExpressionAssignment_3 : ( ruleLogicExpression ) ;
    public final void rule__ExceptionDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5757:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5758:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5758:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5759:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExceptionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__ExceptionDeclaration__ExpressionAssignment_311553);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExceptionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ExceptionDeclaration__ExpressionAssignment_3"


    // $ANTLR start "rule__ScopeDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5768:1: rule__ScopeDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScopeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5772:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5773:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5773:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5774:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ScopeDeclaration__NameAssignment_111584); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ScopeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ScopeDeclaration__ExceptionAssignment_4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5783:1: rule__ScopeDeclaration__ExceptionAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ScopeDeclaration__ExceptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5787:1: ( ( ( RULE_ID ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5788:1: ( ( RULE_ID ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5788:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5789:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getExceptionExceptionDeclarationCrossReference_4_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5790:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5791:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getExceptionExceptionDeclarationIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ScopeDeclaration__ExceptionAssignment_411619); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getExceptionExceptionDeclarationIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getExceptionExceptionDeclarationCrossReference_4_0()); 
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
    // $ANTLR end "rule__ScopeDeclaration__ExceptionAssignment_4"


    // $ANTLR start "rule__ScopeDeclaration__HandlersAssignment_7"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5802:1: rule__ScopeDeclaration__HandlersAssignment_7 : ( ruleHandlerDeclaration ) ;
    public final void rule__ScopeDeclaration__HandlersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5806:1: ( ( ruleHandlerDeclaration ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5807:1: ( ruleHandlerDeclaration )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5807:1: ( ruleHandlerDeclaration )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5808:1: ruleHandlerDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeDeclarationAccess().getHandlersHandlerDeclarationParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleHandlerDeclaration_in_rule__ScopeDeclaration__HandlersAssignment_711654);
            ruleHandlerDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeDeclarationAccess().getHandlersHandlerDeclarationParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__ScopeDeclaration__HandlersAssignment_7"


    // $ANTLR start "rule__HandlerDeclaration__ExpressionAssignment_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5817:1: rule__HandlerDeclaration__ExpressionAssignment_2 : ( ruleLogicExpression ) ;
    public final void rule__HandlerDeclaration__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5821:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5822:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5822:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5823:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__HandlerDeclaration__ExpressionAssignment_211685);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__HandlerDeclaration__ExpressionAssignment_2"


    // $ANTLR start "rule__HandlerDeclaration__ActionsAssignment_5"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5832:1: rule__HandlerDeclaration__ActionsAssignment_5 : ( ruleActionDeclaration ) ;
    public final void rule__HandlerDeclaration__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5836:1: ( ( ruleActionDeclaration ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5837:1: ( ruleActionDeclaration )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5837:1: ( ruleActionDeclaration )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5838:1: ruleActionDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHandlerDeclarationAccess().getActionsActionDeclarationParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleActionDeclaration_in_rule__HandlerDeclaration__ActionsAssignment_511716);
            ruleActionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHandlerDeclarationAccess().getActionsActionDeclarationParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__HandlerDeclaration__ActionsAssignment_5"


    // $ANTLR start "rule__ActionDeclaration__ExpressionAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5847:1: rule__ActionDeclaration__ExpressionAssignment_1 : ( ruleLogicExpression ) ;
    public final void rule__ActionDeclaration__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5851:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5852:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5852:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5853:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__ActionDeclaration__ExpressionAssignment_111747);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ActionDeclaration__ExpressionAssignment_1"


    // $ANTLR start "rule__PropertyDeclaration__NameAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5862:1: rule__PropertyDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5866:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5867:1: ( RULE_ID )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5867:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5868:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyDeclaration__NameAssignment_111778); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PropertyDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PropertyDeclaration__ExpressionAssignment_3"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5877:1: rule__PropertyDeclaration__ExpressionAssignment_3 : ( ruleTemporalLogicExpression ) ;
    public final void rule__PropertyDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5881:1: ( ( ruleTemporalLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5882:1: ( ruleTemporalLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5882:1: ( ruleTemporalLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5883:1: ruleTemporalLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDeclarationAccess().getExpressionTemporalLogicExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rule__PropertyDeclaration__ExpressionAssignment_311809);
            ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDeclarationAccess().getExpressionTemporalLogicExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__PropertyDeclaration__ExpressionAssignment_3"


    // $ANTLR start "rule__OrExpression__OpAssignment_1_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5892:1: rule__OrExpression__OpAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5896:1: ( ( ( '||' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5897:1: ( ( '||' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5897:1: ( ( '||' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5898:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5899:1: ( '||' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5900:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__OrExpression__OpAssignment_1_111845); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__OrExpression__OpAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5915:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5919:1: ( ( ruleAndExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5920:1: ( ruleAndExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5920:1: ( ruleAndExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5921:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_211884);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OpAssignment_1_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5930:1: rule__AndExpression__OpAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__AndExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5934:1: ( ( ( '&&' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5935:1: ( ( '&&' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5935:1: ( ( '&&' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5936:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5937:1: ( '&&' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5938:1: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__AndExpression__OpAssignment_1_111920); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
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
    // $ANTLR end "rule__AndExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5953:1: rule__AndExpression__RightAssignment_1_2 : ( ruleRelationalExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5957:1: ( ( ruleRelationalExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5958:1: ( ruleRelationalExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5958:1: ( ruleRelationalExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5959:1: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__AndExpression__RightAssignment_1_211959);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__RelationalExpression__OpAssignment_1_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5968:1: rule__RelationalExpression__OpAssignment_1_1 : ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__RelationalExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5972:1: ( ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5973:1: ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5973:1: ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5974:1: ( rule__RelationalExpression__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5975:1: ( rule__RelationalExpression__OpAlternatives_1_1_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5975:2: rule__RelationalExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__OpAlternatives_1_1_0_in_rule__RelationalExpression__OpAssignment_1_111990);
            rule__RelationalExpression__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__RelationalExpression__OpAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__RightAssignment_1_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5984:1: rule__RelationalExpression__RightAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5988:1: ( ( ruleAdditiveExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5989:1: ( ruleAdditiveExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5989:1: ( ruleAdditiveExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5990:1: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RightAssignment_1_212023);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__RelationalExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OpAssignment_0_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:5999:1: rule__AdditiveExpression__OpAssignment_0_1 : ( ( '!' ) ) ;
    public final void rule__AdditiveExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6003:1: ( ( ( '!' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6004:1: ( ( '!' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6004:1: ( ( '!' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6005:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6006:1: ( '!' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6007:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__AdditiveExpression__OpAssignment_0_112059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
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
    // $ANTLR end "rule__AdditiveExpression__OpAssignment_0_1"


    // $ANTLR start "rule__AdditiveExpression__ExprAssignment_0_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6022:1: rule__AdditiveExpression__ExprAssignment_0_2 : ( rulePrimaryExpression ) ;
    public final void rule__AdditiveExpression__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6026:1: ( ( rulePrimaryExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6027:1: ( rulePrimaryExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6027:1: ( rulePrimaryExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6028:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__AdditiveExpression__ExprAssignment_0_212098);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__AdditiveExpression__ExprAssignment_0_2"


    // $ANTLR start "rule__PrimaryExpression__ExprAssignment_0_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6037:1: rule__PrimaryExpression__ExprAssignment_0_1 : ( ruleLogicExpression ) ;
    public final void rule__PrimaryExpression__ExprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6041:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6042:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6042:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6043:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExprLogicExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__ExprAssignment_0_112129);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExprLogicExpressionParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ExprAssignment_0_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6052:1: rule__PrimaryExpression__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6056:1: ( ( ( RULE_ID ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6057:1: ( ( RULE_ID ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6057:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6058:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6059:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6060:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAbstractDeclarationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__ValueAssignment_112164); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAbstractDeclarationIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1"


    // $ANTLR start "rule__PrimaryExpression__OpBinAssignment_2_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6071:1: rule__PrimaryExpression__OpBinAssignment_2_0 : ( ruleBINARYOPERATOR ) ;
    public final void rule__PrimaryExpression__OpBinAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6075:1: ( ( ruleBINARYOPERATOR ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6076:1: ( ruleBINARYOPERATOR )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6076:1: ( ruleBINARYOPERATOR )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6077:1: ruleBINARYOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleBINARYOPERATOR_in_rule__PrimaryExpression__OpBinAssignment_2_012199);
            ruleBINARYOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__OpBinAssignment_2_0"


    // $ANTLR start "rule__PrimaryExpression__LeftAssignment_2_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6086:1: rule__PrimaryExpression__LeftAssignment_2_2 : ( ruleLogicExpression ) ;
    public final void rule__PrimaryExpression__LeftAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6090:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6091:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6091:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6092:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__LeftAssignment_2_212230);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__LeftAssignment_2_2"


    // $ANTLR start "rule__PrimaryExpression__RightAssignment_2_4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6101:1: rule__PrimaryExpression__RightAssignment_2_4 : ( ruleLogicExpression ) ;
    public final void rule__PrimaryExpression__RightAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6105:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6106:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6106:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6107:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__RightAssignment_2_412261);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_2_4_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__RightAssignment_2_4"


    // $ANTLR start "rule__PrimaryExpression__OpMulAssignment_3_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6116:1: rule__PrimaryExpression__OpMulAssignment_3_0 : ( ruleMULTIPLEOPERATOR ) ;
    public final void rule__PrimaryExpression__OpMulAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6120:1: ( ( ruleMULTIPLEOPERATOR ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6121:1: ( ruleMULTIPLEOPERATOR )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6121:1: ( ruleMULTIPLEOPERATOR )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6122:1: ruleMULTIPLEOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleMULTIPLEOPERATOR_in_rule__PrimaryExpression__OpMulAssignment_3_012292);
            ruleMULTIPLEOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__OpMulAssignment_3_0"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_3_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6131:1: rule__PrimaryExpression__ArgsAssignment_3_2 : ( ruleLogicExpression ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6135:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6136:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6136:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6137:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__ArgsAssignment_3_212323);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_3_2"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_3_3_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6146:1: rule__PrimaryExpression__ArgsAssignment_3_3_1 : ( ruleLogicExpression ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6150:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6151:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6151:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6152:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__ArgsAssignment_3_3_112354);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_3_1_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__TemporalOrExpression__OpAssignment_1_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6161:1: rule__TemporalOrExpression__OpAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__TemporalOrExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6165:1: ( ( ( '||' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6166:1: ( ( '||' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6166:1: ( ( '||' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6167:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6168:1: ( '||' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6169:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__TemporalOrExpression__OpAssignment_1_112390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__TemporalOrExpression__OpAssignment_1_1"


    // $ANTLR start "rule__TemporalOrExpression__RightAssignment_1_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6184:1: rule__TemporalOrExpression__RightAssignment_1_2 : ( ruleTemporalAndExpression ) ;
    public final void rule__TemporalOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6188:1: ( ( ruleTemporalAndExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6189:1: ( ruleTemporalAndExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6189:1: ( ruleTemporalAndExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6190:1: ruleTemporalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOrExpressionAccess().getRightTemporalAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_rule__TemporalOrExpression__RightAssignment_1_212429);
            ruleTemporalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOrExpressionAccess().getRightTemporalAndExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__TemporalOrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__TemporalAndExpression__OpAssignment_1_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6199:1: rule__TemporalAndExpression__OpAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__TemporalAndExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6203:1: ( ( ( '&&' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6204:1: ( ( '&&' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6204:1: ( ( '&&' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6205:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6206:1: ( '&&' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6207:1: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__TemporalAndExpression__OpAssignment_1_112465); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
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
    // $ANTLR end "rule__TemporalAndExpression__OpAssignment_1_1"


    // $ANTLR start "rule__TemporalAndExpression__RightAssignment_1_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6222:1: rule__TemporalAndExpression__RightAssignment_1_2 : ( ruleTemporalRelationalExpression ) ;
    public final void rule__TemporalAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6226:1: ( ( ruleTemporalRelationalExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6227:1: ( ruleTemporalRelationalExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6227:1: ( ruleTemporalRelationalExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6228:1: ruleTemporalRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAndExpressionAccess().getRightTemporalRelationalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_rule__TemporalAndExpression__RightAssignment_1_212504);
            ruleTemporalRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAndExpressionAccess().getRightTemporalRelationalExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__TemporalAndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__TemporalRelationalExpression__OpAssignment_1_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6237:1: rule__TemporalRelationalExpression__OpAssignment_1_1 : ( ( rule__TemporalRelationalExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__TemporalRelationalExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6241:1: ( ( ( rule__TemporalRelationalExpression__OpAlternatives_1_1_0 ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6242:1: ( ( rule__TemporalRelationalExpression__OpAlternatives_1_1_0 ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6242:1: ( ( rule__TemporalRelationalExpression__OpAlternatives_1_1_0 ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6243:1: ( rule__TemporalRelationalExpression__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getOpAlternatives_1_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6244:1: ( rule__TemporalRelationalExpression__OpAlternatives_1_1_0 )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6244:2: rule__TemporalRelationalExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__TemporalRelationalExpression__OpAlternatives_1_1_0_in_rule__TemporalRelationalExpression__OpAssignment_1_112535);
            rule__TemporalRelationalExpression__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getOpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__TemporalRelationalExpression__OpAssignment_1_1"


    // $ANTLR start "rule__TemporalRelationalExpression__RightAssignment_1_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6253:1: rule__TemporalRelationalExpression__RightAssignment_1_2 : ( ruleTemporalAdditiveExpression ) ;
    public final void rule__TemporalRelationalExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6257:1: ( ( ruleTemporalAdditiveExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6258:1: ( ruleTemporalAdditiveExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6258:1: ( ruleTemporalAdditiveExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6259:1: ruleTemporalAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalRelationalExpressionAccess().getRightTemporalAdditiveExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_rule__TemporalRelationalExpression__RightAssignment_1_212568);
            ruleTemporalAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalRelationalExpressionAccess().getRightTemporalAdditiveExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__TemporalRelationalExpression__RightAssignment_1_2"


    // $ANTLR start "rule__TemporalAdditiveExpression__OpAssignment_0_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6268:1: rule__TemporalAdditiveExpression__OpAssignment_0_1 : ( ( '!' ) ) ;
    public final void rule__TemporalAdditiveExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6272:1: ( ( ( '!' ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6273:1: ( ( '!' ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6273:1: ( ( '!' ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6274:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6275:1: ( '!' )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6276:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__TemporalAdditiveExpression__OpAssignment_0_112604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0()); 
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
    // $ANTLR end "rule__TemporalAdditiveExpression__OpAssignment_0_1"


    // $ANTLR start "rule__TemporalAdditiveExpression__ExprAssignment_0_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6291:1: rule__TemporalAdditiveExpression__ExprAssignment_0_2 : ( ruleTemporalPrimaryExpression ) ;
    public final void rule__TemporalAdditiveExpression__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6295:1: ( ( ruleTemporalPrimaryExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6296:1: ( ruleTemporalPrimaryExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6296:1: ( ruleTemporalPrimaryExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6297:1: ruleTemporalPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalAdditiveExpressionAccess().getExprTemporalPrimaryExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_rule__TemporalAdditiveExpression__ExprAssignment_0_212643);
            ruleTemporalPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalAdditiveExpressionAccess().getExprTemporalPrimaryExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__TemporalAdditiveExpression__ExprAssignment_0_2"


    // $ANTLR start "rule__TemporalPrimaryExpression__ExprAssignment_0_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6306:1: rule__TemporalPrimaryExpression__ExprAssignment_0_1 : ( ruleTemporalLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__ExprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6310:1: ( ( ruleTemporalLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6311:1: ( ruleTemporalLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6311:1: ( ruleTemporalLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6312:1: ruleTemporalLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getExprTemporalLogicExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__ExprAssignment_0_112674);
            ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getExprTemporalLogicExpressionParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__ExprAssignment_0_1"


    // $ANTLR start "rule__TemporalPrimaryExpression__ValueAssignment_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6321:1: rule__TemporalPrimaryExpression__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TemporalPrimaryExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6325:1: ( ( ( RULE_ID ) ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6326:1: ( ( RULE_ID ) )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6326:1: ( ( RULE_ID ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6327:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
            }
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6328:1: ( RULE_ID )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6329:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAbstractDeclarationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TemporalPrimaryExpression__ValueAssignment_112709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAbstractDeclarationIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__ValueAssignment_1"


    // $ANTLR start "rule__TemporalPrimaryExpression__OpTempAssignment_2_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6340:1: rule__TemporalPrimaryExpression__OpTempAssignment_2_0 : ( ruleTEMPORALOPERATOR ) ;
    public final void rule__TemporalPrimaryExpression__OpTempAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6344:1: ( ( ruleTEMPORALOPERATOR ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6345:1: ( ruleTEMPORALOPERATOR )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6345:1: ( ruleTEMPORALOPERATOR )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6346:1: ruleTEMPORALOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempTEMPORALOPERATOREnumRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleTEMPORALOPERATOR_in_rule__TemporalPrimaryExpression__OpTempAssignment_2_012744);
            ruleTEMPORALOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempTEMPORALOPERATOREnumRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__OpTempAssignment_2_0"


    // $ANTLR start "rule__TemporalPrimaryExpression__TemporalAssignment_2_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6355:1: rule__TemporalPrimaryExpression__TemporalAssignment_2_2 : ( ruleTemporalLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__TemporalAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6359:1: ( ( ruleTemporalLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6360:1: ( ruleTemporalLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6360:1: ( ruleTemporalLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6361:1: ruleTemporalLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalTemporalLogicExpressionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__TemporalAssignment_2_212775);
            ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalTemporalLogicExpressionParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__TemporalAssignment_2_2"


    // $ANTLR start "rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6370:1: rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0 : ( ruleTEMPUNTILOPERATOR ) ;
    public final void rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6374:1: ( ( ruleTEMPUNTILOPERATOR ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6375:1: ( ruleTEMPUNTILOPERATOR )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6375:1: ( ruleTEMPUNTILOPERATOR )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6376:1: ruleTEMPUNTILOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilTEMPUNTILOPERATOREnumRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleTEMPUNTILOPERATOR_in_rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_012806);
            ruleTEMPUNTILOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilTEMPUNTILOPERATOREnumRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0"


    // $ANTLR start "rule__TemporalPrimaryExpression__LeftExpAssignment_3_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6385:1: rule__TemporalPrimaryExpression__LeftExpAssignment_3_2 : ( ruleTemporalLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__LeftExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6389:1: ( ( ruleTemporalLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6390:1: ( ruleTemporalLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6390:1: ( ruleTemporalLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6391:1: ruleTemporalLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpTemporalLogicExpressionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__LeftExpAssignment_3_212837);
            ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpTemporalLogicExpressionParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__LeftExpAssignment_3_2"


    // $ANTLR start "rule__TemporalPrimaryExpression__RightExpAssignment_3_4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6400:1: rule__TemporalPrimaryExpression__RightExpAssignment_3_4 : ( ruleTemporalLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__RightExpAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6404:1: ( ( ruleTemporalLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6405:1: ( ruleTemporalLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6405:1: ( ruleTemporalLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6406:1: ruleTemporalLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpTemporalLogicExpressionParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__RightExpAssignment_3_412868);
            ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpTemporalLogicExpressionParserRuleCall_3_4_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__RightExpAssignment_3_4"


    // $ANTLR start "rule__TemporalPrimaryExpression__OpBinAssignment_4_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6415:1: rule__TemporalPrimaryExpression__OpBinAssignment_4_0 : ( ruleBINARYOPERATOR ) ;
    public final void rule__TemporalPrimaryExpression__OpBinAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6419:1: ( ( ruleBINARYOPERATOR ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6420:1: ( ruleBINARYOPERATOR )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6420:1: ( ruleBINARYOPERATOR )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6421:1: ruleBINARYOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleBINARYOPERATOR_in_rule__TemporalPrimaryExpression__OpBinAssignment_4_012899);
            ruleBINARYOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__OpBinAssignment_4_0"


    // $ANTLR start "rule__TemporalPrimaryExpression__LeftAssignment_4_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6430:1: rule__TemporalPrimaryExpression__LeftAssignment_4_2 : ( ruleLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__LeftAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6434:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6435:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6435:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6436:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__LeftAssignment_4_212930);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__LeftAssignment_4_2"


    // $ANTLR start "rule__TemporalPrimaryExpression__RightAssignment_4_4"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6445:1: rule__TemporalPrimaryExpression__RightAssignment_4_4 : ( ruleLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__RightAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6449:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6450:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6450:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6451:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_4_4_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__RightAssignment_4_412961);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_4_4_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__RightAssignment_4_4"


    // $ANTLR start "rule__TemporalPrimaryExpression__OpMulAssignment_5_0"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6460:1: rule__TemporalPrimaryExpression__OpMulAssignment_5_0 : ( ruleMULTIPLEOPERATOR ) ;
    public final void rule__TemporalPrimaryExpression__OpMulAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6464:1: ( ( ruleMULTIPLEOPERATOR ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6465:1: ( ruleMULTIPLEOPERATOR )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6465:1: ( ruleMULTIPLEOPERATOR )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6466:1: ruleMULTIPLEOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleMULTIPLEOPERATOR_in_rule__TemporalPrimaryExpression__OpMulAssignment_5_012992);
            ruleMULTIPLEOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_5_0_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__OpMulAssignment_5_0"


    // $ANTLR start "rule__TemporalPrimaryExpression__ArgsAssignment_5_2"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6475:1: rule__TemporalPrimaryExpression__ArgsAssignment_5_2 : ( ruleLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__ArgsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6479:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6480:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6480:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6481:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__ArgsAssignment_5_213023);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__ArgsAssignment_5_2"


    // $ANTLR start "rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1"
    // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6490:1: rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1 : ( ruleLogicExpression ) ;
    public final void rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6494:1: ( ( ruleLogicExpression ) )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6495:1: ( ruleLogicExpression )
            {
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6495:1: ( ruleLogicExpression )
            // ../br.ufc.great.catchml.ui/src-gen/br/ufc/great/catchml/ui/contentassist/antlr/internal/InternalCatchML.g:6496:1: ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__ArgsAssignment_5_3_113054);
            ruleLogicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_3_1_0()); 
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
    // $ANTLR end "rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel100 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_ruleAbstractElement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemDeclaration196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__0_in_ruleSystemDeclaration222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionExpressionDeclaration_in_entryRulePropositionExpressionDeclaration309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionExpressionDeclaration316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__0_in_rulePropositionExpressionDeclaration342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_entryRulePropositionDeclaration369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionDeclaration376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionDeclaration__NameAssignment_in_rulePropositionDeclaration402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationDeclaration_in_entryRuleSituationDeclaration429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituationDeclaration436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__0_in_ruleSituationDeclaration462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintDeclaration_in_entryRuleSemanticConstraintDeclaration489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemanticConstraintDeclaration496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__0_in_ruleSemanticConstraintDeclaration522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintDeclaration_in_entryRuleTransitionConstraintDeclaration549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionConstraintDeclaration556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__0_in_ruleTransitionConstraintDeclaration582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__0_in_ruleExceptionDeclaration642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDeclaration_in_entryRuleScopeDeclaration671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeDeclaration678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__0_in_ruleScopeDeclaration704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDeclaration_in_entryRuleHandlerDeclaration731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDeclaration738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__0_in_ruleHandlerDeclaration764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDeclaration798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__Group__0_in_ruleActionDeclaration824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_entryRuleLogicExpression911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExpression918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicExpression944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Alternatives_in_ruleAdditiveExpression1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_entryRuleTemporalLogicExpression1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalLogicExpression1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalOrExpression_in_ruleTemporalLogicExpression1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalOrExpression_in_entryRuleTemporalOrExpression1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalOrExpression1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group__0_in_ruleTemporalOrExpression1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_entryRuleTemporalAndExpression1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalAndExpression1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group__0_in_ruleTemporalAndExpression1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_entryRuleTemporalRelationalExpression1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalRelationalExpression1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group__0_in_ruleTemporalRelationalExpression1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_entryRuleTemporalAdditiveExpression1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalAdditiveExpression1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Alternatives_in_ruleTemporalAdditiveExpression1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_entryRuleTemporalPrimaryExpression1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPrimaryExpression1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Alternatives_in_ruleTemporalPrimaryExpression1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMULTIPLEOPERATOR1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BINARYOPERATOR__Alternatives_in_ruleBINARYOPERATOR1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TEMPORALOPERATOR__Alternatives_in_ruleTEMPORALOPERATOR1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TEMPUNTILOPERATOR__Alternatives_in_ruleTEMPUNTILOPERATOR1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionExpressionDeclaration_in_rule__Declaration__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationDeclaration_in_rule__Declaration__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintDeclaration_in_rule__Declaration__Alternatives1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintDeclaration_in_rule__Declaration__Alternatives1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_rule__Declaration__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDeclaration_in_rule__Declaration__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__Declaration__Alternatives1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationalExpression__OpAlternatives_1_1_01921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationalExpression__OpAlternatives_1_1_01941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_0__0_in_rule__AdditiveExpression__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__AdditiveExpression__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_in_rule__PrimaryExpression__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TemporalRelationalExpression__OpAlternatives_1_1_02113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TemporalRelationalExpression__OpAlternatives_1_1_02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Group_0__0_in_rule__TemporalAdditiveExpression__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_rule__TemporalAdditiveExpression__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_0__0_in_rule__TemporalPrimaryExpression__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__ValueAssignment_1_in_rule__TemporalPrimaryExpression__Alternatives2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__0_in_rule__TemporalPrimaryExpression__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__0_in_rule__TemporalPrimaryExpression__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__0_in_rule__TemporalPrimaryExpression__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__0_in_rule__TemporalPrimaryExpression__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BINARYOPERATOR__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BINARYOPERATOR__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TEMPORALOPERATOR__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TEMPORALOPERATOR__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TEMPORALOPERATOR__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TEMPORALOPERATOR__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TEMPORALOPERATOR__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TEMPORALOPERATOR__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TEMPUNTILOPERATOR__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TEMPUNTILOPERATOR__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__0__Impl_in_rule__SystemDeclaration__Group__02595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__1_in_rule__SystemDeclaration__Group__02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SystemDeclaration__Group__0__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__1__Impl_in_rule__SystemDeclaration__Group__12657 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__2_in_rule__SystemDeclaration__Group__12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__NameAssignment_1_in_rule__SystemDeclaration__Group__1__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__2__Impl_in_rule__SystemDeclaration__Group__22717 = new BitSet(new long[]{0x000008334C000000L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__3_in_rule__SystemDeclaration__Group__22720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SystemDeclaration__Group__2__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__3__Impl_in_rule__SystemDeclaration__Group__32779 = new BitSet(new long[]{0x000008334C000000L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__4_in_rule__SystemDeclaration__Group__32782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__DeclarationsAssignment_3_in_rule__SystemDeclaration__Group__3__Impl2809 = new BitSet(new long[]{0x0000083348000002L});
    public static final BitSet FOLLOW_rule__SystemDeclaration__Group__4__Impl_in_rule__SystemDeclaration__Group__42840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SystemDeclaration__Group__4__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__0__Impl_in_rule__PropositionExpressionDeclaration__Group__02909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__1_in_rule__PropositionExpressionDeclaration__Group__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PropositionExpressionDeclaration__Group__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__1__Impl_in_rule__PropositionExpressionDeclaration__Group__12971 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__2_in_rule__PropositionExpressionDeclaration__Group__12974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__ArgsAssignment_1_in_rule__PropositionExpressionDeclaration__Group__1__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__2__Impl_in_rule__PropositionExpressionDeclaration__Group__23031 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__3_in_rule__PropositionExpressionDeclaration__Group__23034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group_2__0_in_rule__PropositionExpressionDeclaration__Group__2__Impl3061 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group__3__Impl_in_rule__PropositionExpressionDeclaration__Group__33092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PropositionExpressionDeclaration__Group__3__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group_2__0__Impl_in_rule__PropositionExpressionDeclaration__Group_2__03159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group_2__1_in_rule__PropositionExpressionDeclaration__Group_2__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PropositionExpressionDeclaration__Group_2__0__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__Group_2__1__Impl_in_rule__PropositionExpressionDeclaration__Group_2__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionExpressionDeclaration__ArgsAssignment_2_1_in_rule__PropositionExpressionDeclaration__Group_2__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__0__Impl_in_rule__SituationDeclaration__Group__03282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__1_in_rule__SituationDeclaration__Group__03285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SituationDeclaration__Group__0__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__1__Impl_in_rule__SituationDeclaration__Group__13344 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__2_in_rule__SituationDeclaration__Group__13347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__NameAssignment_1_in_rule__SituationDeclaration__Group__1__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__2__Impl_in_rule__SituationDeclaration__Group__23404 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__3_in_rule__SituationDeclaration__Group__23407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SituationDeclaration__Group__2__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__3__Impl_in_rule__SituationDeclaration__Group__33466 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__4_in_rule__SituationDeclaration__Group__33469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__ExpressionAssignment_3_in_rule__SituationDeclaration__Group__3__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SituationDeclaration__Group__4__Impl_in_rule__SituationDeclaration__Group__43526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SituationDeclaration__Group__4__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__0__Impl_in_rule__SemanticConstraintDeclaration__Group__03595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__1_in_rule__SemanticConstraintDeclaration__Group__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SemanticConstraintDeclaration__Group__0__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__1__Impl_in_rule__SemanticConstraintDeclaration__Group__13657 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__2_in_rule__SemanticConstraintDeclaration__Group__13660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__NameAssignment_1_in_rule__SemanticConstraintDeclaration__Group__1__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__2__Impl_in_rule__SemanticConstraintDeclaration__Group__23717 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__3_in_rule__SemanticConstraintDeclaration__Group__23720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SemanticConstraintDeclaration__Group__2__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__3__Impl_in_rule__SemanticConstraintDeclaration__Group__33779 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__4_in_rule__SemanticConstraintDeclaration__Group__33782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__ExpressionAssignment_3_in_rule__SemanticConstraintDeclaration__Group__3__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SemanticConstraintDeclaration__Group__4__Impl_in_rule__SemanticConstraintDeclaration__Group__43839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SemanticConstraintDeclaration__Group__4__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__0__Impl_in_rule__TransitionConstraintDeclaration__Group__03908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__1_in_rule__TransitionConstraintDeclaration__Group__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TransitionConstraintDeclaration__Group__0__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__1__Impl_in_rule__TransitionConstraintDeclaration__Group__13970 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__2_in_rule__TransitionConstraintDeclaration__Group__13973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__NameAssignment_1_in_rule__TransitionConstraintDeclaration__Group__1__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__2__Impl_in_rule__TransitionConstraintDeclaration__Group__24030 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__3_in_rule__TransitionConstraintDeclaration__Group__24033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TransitionConstraintDeclaration__Group__2__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__3__Impl_in_rule__TransitionConstraintDeclaration__Group__34092 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__4_in_rule__TransitionConstraintDeclaration__Group__34095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TransitionConstraintDeclaration__Group__3__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__4__Impl_in_rule__TransitionConstraintDeclaration__Group__44154 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__5_in_rule__TransitionConstraintDeclaration__Group__44157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__LeftAssignment_4_in_rule__TransitionConstraintDeclaration__Group__4__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__5__Impl_in_rule__TransitionConstraintDeclaration__Group__54214 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__6_in_rule__TransitionConstraintDeclaration__Group__54217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TransitionConstraintDeclaration__Group__5__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__6__Impl_in_rule__TransitionConstraintDeclaration__Group__64276 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__7_in_rule__TransitionConstraintDeclaration__Group__64279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__RightAssignment_6_in_rule__TransitionConstraintDeclaration__Group__6__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionConstraintDeclaration__Group__7__Impl_in_rule__TransitionConstraintDeclaration__Group__74336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TransitionConstraintDeclaration__Group__7__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__0__Impl_in_rule__ExceptionDeclaration__Group__04411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__1_in_rule__ExceptionDeclaration__Group__04414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExceptionDeclaration__Group__0__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__1__Impl_in_rule__ExceptionDeclaration__Group__14473 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__2_in_rule__ExceptionDeclaration__Group__14476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__NameAssignment_1_in_rule__ExceptionDeclaration__Group__1__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__2__Impl_in_rule__ExceptionDeclaration__Group__24533 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__3_in_rule__ExceptionDeclaration__Group__24536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExceptionDeclaration__Group__2__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__3__Impl_in_rule__ExceptionDeclaration__Group__34595 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__4_in_rule__ExceptionDeclaration__Group__34598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__ExpressionAssignment_3_in_rule__ExceptionDeclaration__Group__3__Impl4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group__4__Impl_in_rule__ExceptionDeclaration__Group__44655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExceptionDeclaration__Group__4__Impl4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__0__Impl_in_rule__ScopeDeclaration__Group__04724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__1_in_rule__ScopeDeclaration__Group__04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ScopeDeclaration__Group__0__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__1__Impl_in_rule__ScopeDeclaration__Group__14786 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__2_in_rule__ScopeDeclaration__Group__14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__NameAssignment_1_in_rule__ScopeDeclaration__Group__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__2__Impl_in_rule__ScopeDeclaration__Group__24846 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__3_in_rule__ScopeDeclaration__Group__24849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ScopeDeclaration__Group__2__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__3__Impl_in_rule__ScopeDeclaration__Group__34908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__4_in_rule__ScopeDeclaration__Group__34911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ScopeDeclaration__Group__3__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__4__Impl_in_rule__ScopeDeclaration__Group__44970 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__5_in_rule__ScopeDeclaration__Group__44973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__ExceptionAssignment_4_in_rule__ScopeDeclaration__Group__4__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__5__Impl_in_rule__ScopeDeclaration__Group__55030 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__6_in_rule__ScopeDeclaration__Group__55033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScopeDeclaration__Group__5__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__6__Impl_in_rule__ScopeDeclaration__Group__65092 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__7_in_rule__ScopeDeclaration__Group__65095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ScopeDeclaration__Group__6__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__7__Impl_in_rule__ScopeDeclaration__Group__75154 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__8_in_rule__ScopeDeclaration__Group__75157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__HandlersAssignment_7_in_rule__ScopeDeclaration__Group__7__Impl5186 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__HandlersAssignment_7_in_rule__ScopeDeclaration__Group__7__Impl5198 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__ScopeDeclaration__Group__8__Impl_in_rule__ScopeDeclaration__Group__85231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ScopeDeclaration__Group__8__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__0__Impl_in_rule__HandlerDeclaration__Group__05308 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__1_in_rule__HandlerDeclaration__Group__05311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__HandlerDeclaration__Group__0__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__1__Impl_in_rule__HandlerDeclaration__Group__15370 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__2_in_rule__HandlerDeclaration__Group__15373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__HandlerDeclaration__Group__1__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__2__Impl_in_rule__HandlerDeclaration__Group__25432 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__3_in_rule__HandlerDeclaration__Group__25435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__ExpressionAssignment_2_in_rule__HandlerDeclaration__Group__2__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__3__Impl_in_rule__HandlerDeclaration__Group__35492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__4_in_rule__HandlerDeclaration__Group__35495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__HandlerDeclaration__Group__3__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__4__Impl_in_rule__HandlerDeclaration__Group__45554 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__5_in_rule__HandlerDeclaration__Group__45557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HandlerDeclaration__Group__4__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__5__Impl_in_rule__HandlerDeclaration__Group__55616 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__6_in_rule__HandlerDeclaration__Group__55619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__ActionsAssignment_5_in_rule__HandlerDeclaration__Group__5__Impl5648 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__ActionsAssignment_5_in_rule__HandlerDeclaration__Group__5__Impl5660 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__HandlerDeclaration__Group__6__Impl_in_rule__HandlerDeclaration__Group__65693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__HandlerDeclaration__Group__6__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__Group__0__Impl_in_rule__ActionDeclaration__Group__05766 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__Group__1_in_rule__ActionDeclaration__Group__05769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ActionDeclaration__Group__0__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__Group__1__Impl_in_rule__ActionDeclaration__Group__15828 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__Group__2_in_rule__ActionDeclaration__Group__15831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__ExpressionAssignment_1_in_rule__ActionDeclaration__Group__1__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDeclaration__Group__2__Impl_in_rule__ActionDeclaration__Group__25888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ActionDeclaration__Group__2__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__05953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__05956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PropertyDeclaration__Group__0__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__16015 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__16018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__NameAssignment_1_in_rule__PropertyDeclaration__Group__1__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__26075 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__3_in_rule__PropertyDeclaration__Group__26078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyDeclaration__Group__2__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__3__Impl_in_rule__PropertyDeclaration__Group__36137 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__4_in_rule__PropertyDeclaration__Group__36140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__ExpressionAssignment_3_in_rule__PropertyDeclaration__Group__3__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__4__Impl_in_rule__PropertyDeclaration__Group__46197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PropertyDeclaration__Group__4__Impl6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__06266 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__06269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__16325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl6352 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__06387 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__06390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__16448 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__16451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__26508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__06571 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__06574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__AndExpression__Group__0__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__16630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl6657 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__06692 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__06695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__16753 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__16756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OpAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__26813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__06876 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__06879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__Group__0__Impl6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__16935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__0_in_rule__RelationalExpression__Group__1__Impl6962 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__0__Impl_in_rule__RelationalExpression__Group_1__06997 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__1_in_rule__RelationalExpression__Group_1__07000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__1__Impl_in_rule__RelationalExpression__Group_1__17058 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__2_in_rule__RelationalExpression__Group_1__17061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__OpAssignment_1_1_in_rule__RelationalExpression__Group_1__1__Impl7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__2__Impl_in_rule__RelationalExpression__Group_1__27118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__RightAssignment_1_2_in_rule__RelationalExpression__Group_1__2__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_0__0__Impl_in_rule__AdditiveExpression__Group_0__07181 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_0__1_in_rule__AdditiveExpression__Group_0__07184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_0__1__Impl_in_rule__AdditiveExpression__Group_0__17242 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_0__2_in_rule__AdditiveExpression__Group_0__17245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__OpAssignment_0_1_in_rule__AdditiveExpression__Group_0__1__Impl7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_0__2__Impl_in_rule__AdditiveExpression__Group_0__27302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__ExprAssignment_0_2_in_rule__AdditiveExpression__Group_0__2__Impl7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__07365 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__07368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PrimaryExpression__Group_0__0__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__17427 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__17430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ExprAssignment_0_1_in_rule__PrimaryExpression__Group_0__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__27487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PrimaryExpression__Group_0__2__Impl7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__07552 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__07555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__OpBinAssignment_2_0_in_rule__PrimaryExpression__Group_2__0__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__17612 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__17615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PrimaryExpression__Group_2__1__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__27674 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__3_in_rule__PrimaryExpression__Group_2__27677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__LeftAssignment_2_2_in_rule__PrimaryExpression__Group_2__2__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__3__Impl_in_rule__PrimaryExpression__Group_2__37734 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__4_in_rule__PrimaryExpression__Group_2__37737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrimaryExpression__Group_2__3__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__4__Impl_in_rule__PrimaryExpression__Group_2__47796 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__5_in_rule__PrimaryExpression__Group_2__47799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__RightAssignment_2_4_in_rule__PrimaryExpression__Group_2__4__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__5__Impl_in_rule__PrimaryExpression__Group_2__57856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PrimaryExpression__Group_2__5__Impl7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__07927 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__07930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__OpMulAssignment_3_0_in_rule__PrimaryExpression__Group_3__0__Impl7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__17987 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__2_in_rule__PrimaryExpression__Group_3__17990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PrimaryExpression__Group_3__1__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__2__Impl_in_rule__PrimaryExpression__Group_3__28049 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__3_in_rule__PrimaryExpression__Group_3__28052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ArgsAssignment_3_2_in_rule__PrimaryExpression__Group_3__2__Impl8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__3__Impl_in_rule__PrimaryExpression__Group_3__38109 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__4_in_rule__PrimaryExpression__Group_3__38112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3_3__0_in_rule__PrimaryExpression__Group_3__3__Impl8141 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3_3__0_in_rule__PrimaryExpression__Group_3__3__Impl8153 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__4__Impl_in_rule__PrimaryExpression__Group_3__48186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PrimaryExpression__Group_3__4__Impl8214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3_3__0__Impl_in_rule__PrimaryExpression__Group_3_3__08255 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3_3__1_in_rule__PrimaryExpression__Group_3_3__08258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrimaryExpression__Group_3_3__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3_3__1__Impl_in_rule__PrimaryExpression__Group_3_3__18317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ArgsAssignment_3_3_1_in_rule__PrimaryExpression__Group_3_3__1__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group__0__Impl_in_rule__TemporalOrExpression__Group__08378 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group__1_in_rule__TemporalOrExpression__Group__08381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_rule__TemporalOrExpression__Group__0__Impl8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group__1__Impl_in_rule__TemporalOrExpression__Group__18437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group_1__0_in_rule__TemporalOrExpression__Group__1__Impl8464 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group_1__0__Impl_in_rule__TemporalOrExpression__Group_1__08499 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group_1__1_in_rule__TemporalOrExpression__Group_1__08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group_1__1__Impl_in_rule__TemporalOrExpression__Group_1__18560 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group_1__2_in_rule__TemporalOrExpression__Group_1__18563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__OpAssignment_1_1_in_rule__TemporalOrExpression__Group_1__1__Impl8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__Group_1__2__Impl_in_rule__TemporalOrExpression__Group_1__28620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalOrExpression__RightAssignment_1_2_in_rule__TemporalOrExpression__Group_1__2__Impl8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group__0__Impl_in_rule__TemporalAndExpression__Group__08683 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group__1_in_rule__TemporalAndExpression__Group__08686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_rule__TemporalAndExpression__Group__0__Impl8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group__1__Impl_in_rule__TemporalAndExpression__Group__18742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group_1__0_in_rule__TemporalAndExpression__Group__1__Impl8769 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group_1__0__Impl_in_rule__TemporalAndExpression__Group_1__08804 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group_1__1_in_rule__TemporalAndExpression__Group_1__08807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group_1__1__Impl_in_rule__TemporalAndExpression__Group_1__18865 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group_1__2_in_rule__TemporalAndExpression__Group_1__18868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__OpAssignment_1_1_in_rule__TemporalAndExpression__Group_1__1__Impl8895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__Group_1__2__Impl_in_rule__TemporalAndExpression__Group_1__28925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAndExpression__RightAssignment_1_2_in_rule__TemporalAndExpression__Group_1__2__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group__0__Impl_in_rule__TemporalRelationalExpression__Group__08988 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group__1_in_rule__TemporalRelationalExpression__Group__08991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_rule__TemporalRelationalExpression__Group__0__Impl9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group__1__Impl_in_rule__TemporalRelationalExpression__Group__19047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group_1__0_in_rule__TemporalRelationalExpression__Group__1__Impl9074 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group_1__0__Impl_in_rule__TemporalRelationalExpression__Group_1__09109 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group_1__1_in_rule__TemporalRelationalExpression__Group_1__09112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group_1__1__Impl_in_rule__TemporalRelationalExpression__Group_1__19170 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group_1__2_in_rule__TemporalRelationalExpression__Group_1__19173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__OpAssignment_1_1_in_rule__TemporalRelationalExpression__Group_1__1__Impl9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__Group_1__2__Impl_in_rule__TemporalRelationalExpression__Group_1__29230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__RightAssignment_1_2_in_rule__TemporalRelationalExpression__Group_1__2__Impl9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Group_0__0__Impl_in_rule__TemporalAdditiveExpression__Group_0__09293 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Group_0__1_in_rule__TemporalAdditiveExpression__Group_0__09296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Group_0__1__Impl_in_rule__TemporalAdditiveExpression__Group_0__19354 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Group_0__2_in_rule__TemporalAdditiveExpression__Group_0__19357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__OpAssignment_0_1_in_rule__TemporalAdditiveExpression__Group_0__1__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__Group_0__2__Impl_in_rule__TemporalAdditiveExpression__Group_0__29414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalAdditiveExpression__ExprAssignment_0_2_in_rule__TemporalAdditiveExpression__Group_0__2__Impl9441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_0__0__Impl_in_rule__TemporalPrimaryExpression__Group_0__09477 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_0__1_in_rule__TemporalPrimaryExpression__Group_0__09480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_0__0__Impl9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_0__1__Impl_in_rule__TemporalPrimaryExpression__Group_0__19539 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_0__2_in_rule__TemporalPrimaryExpression__Group_0__19542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__ExprAssignment_0_1_in_rule__TemporalPrimaryExpression__Group_0__1__Impl9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_0__2__Impl_in_rule__TemporalPrimaryExpression__Group_0__29599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_0__2__Impl9627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__0__Impl_in_rule__TemporalPrimaryExpression__Group_2__09664 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__1_in_rule__TemporalPrimaryExpression__Group_2__09667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__OpTempAssignment_2_0_in_rule__TemporalPrimaryExpression__Group_2__0__Impl9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__1__Impl_in_rule__TemporalPrimaryExpression__Group_2__19724 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__2_in_rule__TemporalPrimaryExpression__Group_2__19727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_2__1__Impl9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__2__Impl_in_rule__TemporalPrimaryExpression__Group_2__29786 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__3_in_rule__TemporalPrimaryExpression__Group_2__29789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__TemporalAssignment_2_2_in_rule__TemporalPrimaryExpression__Group_2__2__Impl9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_2__3__Impl_in_rule__TemporalPrimaryExpression__Group_2__39846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_2__3__Impl9874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__0__Impl_in_rule__TemporalPrimaryExpression__Group_3__09913 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__1_in_rule__TemporalPrimaryExpression__Group_3__09916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0_in_rule__TemporalPrimaryExpression__Group_3__0__Impl9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__1__Impl_in_rule__TemporalPrimaryExpression__Group_3__19973 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__2_in_rule__TemporalPrimaryExpression__Group_3__19976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_3__1__Impl10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__2__Impl_in_rule__TemporalPrimaryExpression__Group_3__210035 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__3_in_rule__TemporalPrimaryExpression__Group_3__210038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__LeftExpAssignment_3_2_in_rule__TemporalPrimaryExpression__Group_3__2__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__3__Impl_in_rule__TemporalPrimaryExpression__Group_3__310095 = new BitSet(new long[]{0x0000808000FFC810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__4_in_rule__TemporalPrimaryExpression__Group_3__310098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TemporalPrimaryExpression__Group_3__3__Impl10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__4__Impl_in_rule__TemporalPrimaryExpression__Group_3__410157 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__5_in_rule__TemporalPrimaryExpression__Group_3__410160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__RightExpAssignment_3_4_in_rule__TemporalPrimaryExpression__Group_3__4__Impl10187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_3__5__Impl_in_rule__TemporalPrimaryExpression__Group_3__510217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_3__5__Impl10245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__0__Impl_in_rule__TemporalPrimaryExpression__Group_4__010288 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__1_in_rule__TemporalPrimaryExpression__Group_4__010291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__OpBinAssignment_4_0_in_rule__TemporalPrimaryExpression__Group_4__0__Impl10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__1__Impl_in_rule__TemporalPrimaryExpression__Group_4__110348 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__2_in_rule__TemporalPrimaryExpression__Group_4__110351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_4__1__Impl10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__2__Impl_in_rule__TemporalPrimaryExpression__Group_4__210410 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__3_in_rule__TemporalPrimaryExpression__Group_4__210413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__LeftAssignment_4_2_in_rule__TemporalPrimaryExpression__Group_4__2__Impl10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__3__Impl_in_rule__TemporalPrimaryExpression__Group_4__310470 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__4_in_rule__TemporalPrimaryExpression__Group_4__310473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TemporalPrimaryExpression__Group_4__3__Impl10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__4__Impl_in_rule__TemporalPrimaryExpression__Group_4__410532 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__5_in_rule__TemporalPrimaryExpression__Group_4__410535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__RightAssignment_4_4_in_rule__TemporalPrimaryExpression__Group_4__4__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_4__5__Impl_in_rule__TemporalPrimaryExpression__Group_4__510592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_4__5__Impl10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__0__Impl_in_rule__TemporalPrimaryExpression__Group_5__010663 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__1_in_rule__TemporalPrimaryExpression__Group_5__010666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__OpMulAssignment_5_0_in_rule__TemporalPrimaryExpression__Group_5__0__Impl10693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__1__Impl_in_rule__TemporalPrimaryExpression__Group_5__110723 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__2_in_rule__TemporalPrimaryExpression__Group_5__110726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TemporalPrimaryExpression__Group_5__1__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__2__Impl_in_rule__TemporalPrimaryExpression__Group_5__210785 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__3_in_rule__TemporalPrimaryExpression__Group_5__210788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__ArgsAssignment_5_2_in_rule__TemporalPrimaryExpression__Group_5__2__Impl10815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__3__Impl_in_rule__TemporalPrimaryExpression__Group_5__310845 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__4_in_rule__TemporalPrimaryExpression__Group_5__310848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__0_in_rule__TemporalPrimaryExpression__Group_5__3__Impl10877 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__0_in_rule__TemporalPrimaryExpression__Group_5__3__Impl10889 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5__4__Impl_in_rule__TemporalPrimaryExpression__Group_5__410922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TemporalPrimaryExpression__Group_5__4__Impl10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__0__Impl_in_rule__TemporalPrimaryExpression__Group_5_3__010991 = new BitSet(new long[]{0x000080800000C810L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__1_in_rule__TemporalPrimaryExpression__Group_5_3__010994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TemporalPrimaryExpression__Group_5_3__0__Impl11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__Group_5_3__1__Impl_in_rule__TemporalPrimaryExpression__Group_5_3__111053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1_in_rule__TemporalPrimaryExpression__Group_5_3__1__Impl11080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Domainmodel__ElementsAssignment11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SystemDeclaration__NameAssignment_111150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__SystemDeclaration__DeclarationsAssignment_311181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rule__PropositionExpressionDeclaration__ArgsAssignment_111212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rule__PropositionExpressionDeclaration__ArgsAssignment_2_111243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropositionDeclaration__NameAssignment11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SituationDeclaration__NameAssignment_111305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__SituationDeclaration__ExpressionAssignment_311336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SemanticConstraintDeclaration__NameAssignment_111367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__SemanticConstraintDeclaration__ExpressionAssignment_311398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransitionConstraintDeclaration__NameAssignment_111429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__TransitionConstraintDeclaration__LeftAssignment_411460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__TransitionConstraintDeclaration__RightAssignment_611491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptionDeclaration__NameAssignment_111522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__ExceptionDeclaration__ExpressionAssignment_311553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ScopeDeclaration__NameAssignment_111584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ScopeDeclaration__ExceptionAssignment_411619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDeclaration_in_rule__ScopeDeclaration__HandlersAssignment_711654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__HandlerDeclaration__ExpressionAssignment_211685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_rule__HandlerDeclaration__ActionsAssignment_511716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__ActionDeclaration__ExpressionAssignment_111747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyDeclaration__NameAssignment_111778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rule__PropertyDeclaration__ExpressionAssignment_311809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__OrExpression__OpAssignment_1_111845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_211884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AndExpression__OpAssignment_1_111920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__AndExpression__RightAssignment_1_211959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__OpAlternatives_1_1_0_in_rule__RelationalExpression__OpAssignment_1_111990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RightAssignment_1_212023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AdditiveExpression__OpAssignment_0_112059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__AdditiveExpression__ExprAssignment_0_212098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__ExprAssignment_0_112129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__ValueAssignment_112164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARYOPERATOR_in_rule__PrimaryExpression__OpBinAssignment_2_012199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__LeftAssignment_2_212230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__RightAssignment_2_412261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLEOPERATOR_in_rule__PrimaryExpression__OpMulAssignment_3_012292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__ArgsAssignment_3_212323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__PrimaryExpression__ArgsAssignment_3_3_112354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TemporalOrExpression__OpAssignment_1_112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_rule__TemporalOrExpression__RightAssignment_1_212429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TemporalAndExpression__OpAssignment_1_112465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_rule__TemporalAndExpression__RightAssignment_1_212504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalRelationalExpression__OpAlternatives_1_1_0_in_rule__TemporalRelationalExpression__OpAssignment_1_112535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_rule__TemporalRelationalExpression__RightAssignment_1_212568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TemporalAdditiveExpression__OpAssignment_0_112604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_rule__TemporalAdditiveExpression__ExprAssignment_0_212643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__ExprAssignment_0_112674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TemporalPrimaryExpression__ValueAssignment_112709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEMPORALOPERATOR_in_rule__TemporalPrimaryExpression__OpTempAssignment_2_012744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__TemporalAssignment_2_212775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEMPUNTILOPERATOR_in_rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_012806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__LeftExpAssignment_3_212837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rule__TemporalPrimaryExpression__RightExpAssignment_3_412868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARYOPERATOR_in_rule__TemporalPrimaryExpression__OpBinAssignment_4_012899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__LeftAssignment_4_212930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__RightAssignment_4_412961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLEOPERATOR_in_rule__TemporalPrimaryExpression__OpMulAssignment_5_012992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__ArgsAssignment_5_213023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rule__TemporalPrimaryExpression__ArgsAssignment_5_3_113054 = new BitSet(new long[]{0x0000000000000002L});

}