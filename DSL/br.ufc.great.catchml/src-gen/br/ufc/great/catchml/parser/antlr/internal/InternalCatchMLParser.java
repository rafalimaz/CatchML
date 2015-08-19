package br.ufc.great.catchml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufc.great.catchml.services.CatchMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCatchMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'prop'", "','", "';'", "'situation'", "':='", "'sconstraint'", "'tconstraint'", "'pre'", "'post'", "'exception'", "'scope'", "'handle'", "'('", "')'", "'case'", "'do'", "'spec'", "'||'", "'&&'", "'->'", "'<->'", "'!'", "'U'", "'xor'", "'nor'", "'nand'", "'EX'", "'EG'", "'EF'", "'AX'", "'AG'", "'AF'", "'E'", "'A'"
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
    public String getGrammarFileName() { return "../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g"; }



     	private CatchMLGrammarAccess grammarAccess;
     	
        public InternalCatchMLParser(TokenStream input, CatchMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected CatchMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:68:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:69:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:70:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:77:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:80:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:83:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:107:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:108:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:109:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:116:1: ruleAbstractElement returns [EObject current=null] : this_SystemDeclaration_0= ruleSystemDeclaration ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_SystemDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:119:28: (this_SystemDeclaration_0= ruleSystemDeclaration )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:121:5: this_SystemDeclaration_0= ruleSystemDeclaration
            {
             
                    newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemDeclarationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSystemDeclaration_in_ruleAbstractElement222);
            this_SystemDeclaration_0=ruleSystemDeclaration();

            state._fsp--;

             
                    current = this_SystemDeclaration_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleSystemDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:139:1: entryRuleSystemDeclaration returns [EObject current=null] : iv_ruleSystemDeclaration= ruleSystemDeclaration EOF ;
    public final EObject entryRuleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:140:2: (iv_ruleSystemDeclaration= ruleSystemDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:141:2: iv_ruleSystemDeclaration= ruleSystemDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSystemDeclarationRule()); 
            pushFollow(FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration258);
            iv_ruleSystemDeclaration=ruleSystemDeclaration();

            state._fsp--;

             current =iv_ruleSystemDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemDeclaration268); 

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
    // $ANTLR end "entryRuleSystemDeclaration"


    // $ANTLR start "ruleSystemDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:148:1: ruleSystemDeclaration returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:151:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:152:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:152:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:152:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystemDeclaration305); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:156:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:157:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:157:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:158:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemDeclaration322); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystemDeclaration339); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:178:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==17||(LA2_0>=19 && LA2_0<=20)||(LA2_0>=23 && LA2_0<=24)||LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:179:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:179:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:180:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleSystemDeclaration360);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_3_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSystemDeclaration373); 

                	newLeafNode(otherlv_4, grammarAccess.getSystemDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:208:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:209:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:210:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration409);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration419); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:217:1: ruleDeclaration returns [EObject current=null] : (this_PropositionExpressionDeclaration_0= rulePropositionExpressionDeclaration | this_SituationDeclaration_1= ruleSituationDeclaration | this_SemanticConstraintDeclaration_2= ruleSemanticConstraintDeclaration | this_TransitionConstraintDeclaration_3= ruleTransitionConstraintDeclaration | this_ExceptionDeclaration_4= ruleExceptionDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_PropertyDeclaration_6= rulePropertyDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_PropositionExpressionDeclaration_0 = null;

        EObject this_SituationDeclaration_1 = null;

        EObject this_SemanticConstraintDeclaration_2 = null;

        EObject this_TransitionConstraintDeclaration_3 = null;

        EObject this_ExceptionDeclaration_4 = null;

        EObject this_ScopeDeclaration_5 = null;

        EObject this_PropertyDeclaration_6 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:220:28: ( (this_PropositionExpressionDeclaration_0= rulePropositionExpressionDeclaration | this_SituationDeclaration_1= ruleSituationDeclaration | this_SemanticConstraintDeclaration_2= ruleSemanticConstraintDeclaration | this_TransitionConstraintDeclaration_3= ruleTransitionConstraintDeclaration | this_ExceptionDeclaration_4= ruleExceptionDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_PropertyDeclaration_6= rulePropertyDeclaration ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:221:1: (this_PropositionExpressionDeclaration_0= rulePropositionExpressionDeclaration | this_SituationDeclaration_1= ruleSituationDeclaration | this_SemanticConstraintDeclaration_2= ruleSemanticConstraintDeclaration | this_TransitionConstraintDeclaration_3= ruleTransitionConstraintDeclaration | this_ExceptionDeclaration_4= ruleExceptionDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_PropertyDeclaration_6= rulePropertyDeclaration )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:221:1: (this_PropositionExpressionDeclaration_0= rulePropositionExpressionDeclaration | this_SituationDeclaration_1= ruleSituationDeclaration | this_SemanticConstraintDeclaration_2= ruleSemanticConstraintDeclaration | this_TransitionConstraintDeclaration_3= ruleTransitionConstraintDeclaration | this_ExceptionDeclaration_4= ruleExceptionDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_PropertyDeclaration_6= rulePropertyDeclaration )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:222:5: this_PropositionExpressionDeclaration_0= rulePropositionExpressionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getPropositionExpressionDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePropositionExpressionDeclaration_in_ruleDeclaration466);
                    this_PropositionExpressionDeclaration_0=rulePropositionExpressionDeclaration();

                    state._fsp--;

                     
                            current = this_PropositionExpressionDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:232:5: this_SituationDeclaration_1= ruleSituationDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getSituationDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSituationDeclaration_in_ruleDeclaration493);
                    this_SituationDeclaration_1=ruleSituationDeclaration();

                    state._fsp--;

                     
                            current = this_SituationDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:242:5: this_SemanticConstraintDeclaration_2= ruleSemanticConstraintDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getSemanticConstraintDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSemanticConstraintDeclaration_in_ruleDeclaration520);
                    this_SemanticConstraintDeclaration_2=ruleSemanticConstraintDeclaration();

                    state._fsp--;

                     
                            current = this_SemanticConstraintDeclaration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:252:5: this_TransitionConstraintDeclaration_3= ruleTransitionConstraintDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getTransitionConstraintDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTransitionConstraintDeclaration_in_ruleDeclaration547);
                    this_TransitionConstraintDeclaration_3=ruleTransitionConstraintDeclaration();

                    state._fsp--;

                     
                            current = this_TransitionConstraintDeclaration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:262:5: this_ExceptionDeclaration_4= ruleExceptionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getExceptionDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleDeclaration574);
                    this_ExceptionDeclaration_4=ruleExceptionDeclaration();

                    state._fsp--;

                     
                            current = this_ExceptionDeclaration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:272:5: this_ScopeDeclaration_5= ruleScopeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getScopeDeclarationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleScopeDeclaration_in_ruleDeclaration601);
                    this_ScopeDeclaration_5=ruleScopeDeclaration();

                    state._fsp--;

                     
                            current = this_ScopeDeclaration_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:282:5: this_PropertyDeclaration_6= rulePropertyDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getPropertyDeclarationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleDeclaration628);
                    this_PropertyDeclaration_6=rulePropertyDeclaration();

                    state._fsp--;

                     
                            current = this_PropertyDeclaration_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRulePropositionExpressionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:298:1: entryRulePropositionExpressionDeclaration returns [EObject current=null] : iv_rulePropositionExpressionDeclaration= rulePropositionExpressionDeclaration EOF ;
    public final EObject entryRulePropositionExpressionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropositionExpressionDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:299:2: (iv_rulePropositionExpressionDeclaration= rulePropositionExpressionDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:300:2: iv_rulePropositionExpressionDeclaration= rulePropositionExpressionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropositionExpressionDeclarationRule()); 
            pushFollow(FOLLOW_rulePropositionExpressionDeclaration_in_entryRulePropositionExpressionDeclaration663);
            iv_rulePropositionExpressionDeclaration=rulePropositionExpressionDeclaration();

            state._fsp--;

             current =iv_rulePropositionExpressionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionExpressionDeclaration673); 

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
    // $ANTLR end "entryRulePropositionExpressionDeclaration"


    // $ANTLR start "rulePropositionExpressionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:307:1: rulePropositionExpressionDeclaration returns [EObject current=null] : (otherlv_0= 'prop' ( (lv_args_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) ) )* otherlv_4= ';' ) ;
    public final EObject rulePropositionExpressionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_1_0 = null;

        EObject lv_args_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:310:28: ( (otherlv_0= 'prop' ( (lv_args_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) ) )* otherlv_4= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:311:1: (otherlv_0= 'prop' ( (lv_args_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) ) )* otherlv_4= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:311:1: (otherlv_0= 'prop' ( (lv_args_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) ) )* otherlv_4= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:311:3: otherlv_0= 'prop' ( (lv_args_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePropositionExpressionDeclaration710); 

                	newLeafNode(otherlv_0, grammarAccess.getPropositionExpressionDeclarationAccess().getPropKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:315:1: ( (lv_args_1_0= rulePropositionDeclaration ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:316:1: (lv_args_1_0= rulePropositionDeclaration )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:316:1: (lv_args_1_0= rulePropositionDeclaration )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:317:3: lv_args_1_0= rulePropositionDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsPropositionDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropositionDeclaration_in_rulePropositionExpressionDeclaration731);
            lv_args_1_0=rulePropositionDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropositionExpressionDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"args",
                    		lv_args_1_0, 
                    		"PropositionDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:333:2: (otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:333:4: otherlv_2= ',' ( (lv_args_3_0= rulePropositionDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePropositionExpressionDeclaration744); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPropositionExpressionDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:337:1: ( (lv_args_3_0= rulePropositionDeclaration ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:338:1: (lv_args_3_0= rulePropositionDeclaration )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:338:1: (lv_args_3_0= rulePropositionDeclaration )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:339:3: lv_args_3_0= rulePropositionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsPropositionDeclarationParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropositionDeclaration_in_rulePropositionExpressionDeclaration765);
            	    lv_args_3_0=rulePropositionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropositionExpressionDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"args",
            	            		lv_args_3_0, 
            	            		"PropositionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePropositionExpressionDeclaration779); 

                	newLeafNode(otherlv_4, grammarAccess.getPropositionExpressionDeclarationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "rulePropositionExpressionDeclaration"


    // $ANTLR start "entryRulePropositionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:367:1: entryRulePropositionDeclaration returns [EObject current=null] : iv_rulePropositionDeclaration= rulePropositionDeclaration EOF ;
    public final EObject entryRulePropositionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropositionDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:368:2: (iv_rulePropositionDeclaration= rulePropositionDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:369:2: iv_rulePropositionDeclaration= rulePropositionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropositionDeclarationRule()); 
            pushFollow(FOLLOW_rulePropositionDeclaration_in_entryRulePropositionDeclaration815);
            iv_rulePropositionDeclaration=rulePropositionDeclaration();

            state._fsp--;

             current =iv_rulePropositionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionDeclaration825); 

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
    // $ANTLR end "entryRulePropositionDeclaration"


    // $ANTLR start "rulePropositionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:376:1: rulePropositionDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePropositionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:379:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:380:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:380:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:381:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:381:1: (lv_name_0_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:382:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropositionDeclaration866); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropositionDeclarationAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropositionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "rulePropositionDeclaration"


    // $ANTLR start "entryRuleSituationDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:406:1: entryRuleSituationDeclaration returns [EObject current=null] : iv_ruleSituationDeclaration= ruleSituationDeclaration EOF ;
    public final EObject entryRuleSituationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituationDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:407:2: (iv_ruleSituationDeclaration= ruleSituationDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:408:2: iv_ruleSituationDeclaration= ruleSituationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSituationDeclarationRule()); 
            pushFollow(FOLLOW_ruleSituationDeclaration_in_entryRuleSituationDeclaration906);
            iv_ruleSituationDeclaration=ruleSituationDeclaration();

            state._fsp--;

             current =iv_ruleSituationDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSituationDeclaration916); 

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
    // $ANTLR end "entryRuleSituationDeclaration"


    // $ANTLR start "ruleSituationDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:415:1: ruleSituationDeclaration returns [EObject current=null] : (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSituationDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:418:28: ( (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:419:1: (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:419:1: (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:419:3: otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSituationDeclaration953); 

                	newLeafNode(otherlv_0, grammarAccess.getSituationDeclarationAccess().getSituationKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:424:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:424:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSituationDeclaration970); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSituationDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSituationDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSituationDeclaration987); 

                	newLeafNode(otherlv_2, grammarAccess.getSituationDeclarationAccess().getColonEqualsSignKeyword_2());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:445:1: ( (lv_expression_3_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:446:1: (lv_expression_3_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:446:1: (lv_expression_3_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:447:3: lv_expression_3_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getSituationDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleSituationDeclaration1008);
            lv_expression_3_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSituationDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSituationDeclaration1020); 

                	newLeafNode(otherlv_4, grammarAccess.getSituationDeclarationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSituationDeclaration"


    // $ANTLR start "entryRuleSemanticConstraintDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:475:1: entryRuleSemanticConstraintDeclaration returns [EObject current=null] : iv_ruleSemanticConstraintDeclaration= ruleSemanticConstraintDeclaration EOF ;
    public final EObject entryRuleSemanticConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticConstraintDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:476:2: (iv_ruleSemanticConstraintDeclaration= ruleSemanticConstraintDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:477:2: iv_ruleSemanticConstraintDeclaration= ruleSemanticConstraintDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSemanticConstraintDeclarationRule()); 
            pushFollow(FOLLOW_ruleSemanticConstraintDeclaration_in_entryRuleSemanticConstraintDeclaration1056);
            iv_ruleSemanticConstraintDeclaration=ruleSemanticConstraintDeclaration();

            state._fsp--;

             current =iv_ruleSemanticConstraintDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemanticConstraintDeclaration1066); 

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
    // $ANTLR end "entryRuleSemanticConstraintDeclaration"


    // $ANTLR start "ruleSemanticConstraintDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:484:1: ruleSemanticConstraintDeclaration returns [EObject current=null] : (otherlv_0= 'sconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSemanticConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:487:28: ( (otherlv_0= 'sconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:488:1: (otherlv_0= 'sconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:488:1: (otherlv_0= 'sconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:488:3: otherlv_0= 'sconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSemanticConstraintDeclaration1103); 

                	newLeafNode(otherlv_0, grammarAccess.getSemanticConstraintDeclarationAccess().getSconstraintKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:492:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:493:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:493:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSemanticConstraintDeclaration1120); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSemanticConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSemanticConstraintDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSemanticConstraintDeclaration1137); 

                	newLeafNode(otherlv_2, grammarAccess.getSemanticConstraintDeclarationAccess().getColonEqualsSignKeyword_2());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:514:1: ( (lv_expression_3_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:515:1: (lv_expression_3_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:515:1: (lv_expression_3_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:516:3: lv_expression_3_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleSemanticConstraintDeclaration1158);
            lv_expression_3_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSemanticConstraintDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSemanticConstraintDeclaration1170); 

                	newLeafNode(otherlv_4, grammarAccess.getSemanticConstraintDeclarationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSemanticConstraintDeclaration"


    // $ANTLR start "entryRuleTransitionConstraintDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:544:1: entryRuleTransitionConstraintDeclaration returns [EObject current=null] : iv_ruleTransitionConstraintDeclaration= ruleTransitionConstraintDeclaration EOF ;
    public final EObject entryRuleTransitionConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionConstraintDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:545:2: (iv_ruleTransitionConstraintDeclaration= ruleTransitionConstraintDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:546:2: iv_ruleTransitionConstraintDeclaration= ruleTransitionConstraintDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTransitionConstraintDeclarationRule()); 
            pushFollow(FOLLOW_ruleTransitionConstraintDeclaration_in_entryRuleTransitionConstraintDeclaration1206);
            iv_ruleTransitionConstraintDeclaration=ruleTransitionConstraintDeclaration();

            state._fsp--;

             current =iv_ruleTransitionConstraintDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionConstraintDeclaration1216); 

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
    // $ANTLR end "entryRuleTransitionConstraintDeclaration"


    // $ANTLR start "ruleTransitionConstraintDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:553:1: ruleTransitionConstraintDeclaration returns [EObject current=null] : (otherlv_0= 'tconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'pre' ( (lv_left_4_0= ruleLogicExpression ) ) otherlv_5= 'post' ( (lv_right_6_0= ruleLogicExpression ) ) otherlv_7= ';' ) ;
    public final EObject ruleTransitionConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:556:28: ( (otherlv_0= 'tconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'pre' ( (lv_left_4_0= ruleLogicExpression ) ) otherlv_5= 'post' ( (lv_right_6_0= ruleLogicExpression ) ) otherlv_7= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:557:1: (otherlv_0= 'tconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'pre' ( (lv_left_4_0= ruleLogicExpression ) ) otherlv_5= 'post' ( (lv_right_6_0= ruleLogicExpression ) ) otherlv_7= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:557:1: (otherlv_0= 'tconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'pre' ( (lv_left_4_0= ruleLogicExpression ) ) otherlv_5= 'post' ( (lv_right_6_0= ruleLogicExpression ) ) otherlv_7= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:557:3: otherlv_0= 'tconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'pre' ( (lv_left_4_0= ruleLogicExpression ) ) otherlv_5= 'post' ( (lv_right_6_0= ruleLogicExpression ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleTransitionConstraintDeclaration1253); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionConstraintDeclarationAccess().getTconstraintKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:561:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:562:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:562:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:563:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionConstraintDeclaration1270); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransitionConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionConstraintDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTransitionConstraintDeclaration1287); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionConstraintDeclarationAccess().getColonEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleTransitionConstraintDeclaration1299); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionConstraintDeclarationAccess().getPreKeyword_3());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:587:1: ( (lv_left_4_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:588:1: (lv_left_4_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:588:1: (lv_left_4_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:589:3: lv_left_4_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftLogicExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration1320);
            lv_left_4_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionConstraintDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_4_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleTransitionConstraintDeclaration1332); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionConstraintDeclarationAccess().getPostKeyword_5());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:609:1: ( (lv_right_6_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:610:1: (lv_right_6_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:610:1: (lv_right_6_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:611:3: lv_right_6_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getTransitionConstraintDeclarationAccess().getRightLogicExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration1353);
            lv_right_6_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionConstraintDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_6_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleTransitionConstraintDeclaration1365); 

                	newLeafNode(otherlv_7, grammarAccess.getTransitionConstraintDeclarationAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleTransitionConstraintDeclaration"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:639:1: entryRuleExceptionDeclaration returns [EObject current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final EObject entryRuleExceptionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:640:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:641:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration1401);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration1411); 

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
    // $ANTLR end "entryRuleExceptionDeclaration"


    // $ANTLR start "ruleExceptionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:648:1: ruleExceptionDeclaration returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleExceptionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:651:28: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:652:1: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:652:1: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:652:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleLogicExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleExceptionDeclaration1448); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptionDeclarationAccess().getExceptionKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:656:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:657:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:657:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:658:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionDeclaration1465); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExceptionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleExceptionDeclaration1482); 

                	newLeafNode(otherlv_2, grammarAccess.getExceptionDeclarationAccess().getColonEqualsSignKeyword_2());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:678:1: ( (lv_expression_3_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:679:1: (lv_expression_3_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:679:1: (lv_expression_3_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:680:3: lv_expression_3_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleExceptionDeclaration1503);
            lv_expression_3_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExceptionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleExceptionDeclaration1515); 

                	newLeafNode(otherlv_4, grammarAccess.getExceptionDeclarationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleScopeDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:710:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:711:2: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:712:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getScopeDeclarationRule()); 
            pushFollow(FOLLOW_ruleScopeDeclaration_in_entryRuleScopeDeclaration1553);
            iv_ruleScopeDeclaration=ruleScopeDeclaration();

            state._fsp--;

             current =iv_ruleScopeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeDeclaration1563); 

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
    // $ANTLR end "entryRuleScopeDeclaration"


    // $ANTLR start "ruleScopeDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:719:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'handle' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_handlers_7_0= ruleHandlerDeclaration ) )+ otherlv_8= '}' ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_handlers_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:722:28: ( (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'handle' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_handlers_7_0= ruleHandlerDeclaration ) )+ otherlv_8= '}' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:723:1: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'handle' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_handlers_7_0= ruleHandlerDeclaration ) )+ otherlv_8= '}' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:723:1: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'handle' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_handlers_7_0= ruleHandlerDeclaration ) )+ otherlv_8= '}' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:723:3: otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'handle' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_handlers_7_0= ruleHandlerDeclaration ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleScopeDeclaration1600); 

                	newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:727:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:728:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:728:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:729:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopeDeclaration1617); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScopeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScopeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleScopeDeclaration1634); 

                	newLeafNode(otherlv_2, grammarAccess.getScopeDeclarationAccess().getHandleKeyword_2());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleScopeDeclaration1646); 

                	newLeafNode(otherlv_3, grammarAccess.getScopeDeclarationAccess().getLeftParenthesisKeyword_3());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:753:1: ( (otherlv_4= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:754:1: (otherlv_4= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:754:1: (otherlv_4= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:755:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getScopeDeclarationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopeDeclaration1666); 

            		newLeafNode(otherlv_4, grammarAccess.getScopeDeclarationAccess().getExceptionExceptionDeclarationCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleScopeDeclaration1678); 

                	newLeafNode(otherlv_5, grammarAccess.getScopeDeclarationAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleScopeDeclaration1690); 

                	newLeafNode(otherlv_6, grammarAccess.getScopeDeclarationAccess().getLeftCurlyBracketKeyword_6());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:774:1: ( (lv_handlers_7_0= ruleHandlerDeclaration ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:775:1: (lv_handlers_7_0= ruleHandlerDeclaration )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:775:1: (lv_handlers_7_0= ruleHandlerDeclaration )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:776:3: lv_handlers_7_0= ruleHandlerDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScopeDeclarationAccess().getHandlersHandlerDeclarationParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHandlerDeclaration_in_ruleScopeDeclaration1711);
            	    lv_handlers_7_0=ruleHandlerDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScopeDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"handlers",
            	            		lv_handlers_7_0, 
            	            		"HandlerDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleScopeDeclaration1724); 

                	newLeafNode(otherlv_8, grammarAccess.getScopeDeclarationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleScopeDeclaration"


    // $ANTLR start "entryRuleHandlerDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:804:1: entryRuleHandlerDeclaration returns [EObject current=null] : iv_ruleHandlerDeclaration= ruleHandlerDeclaration EOF ;
    public final EObject entryRuleHandlerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:805:2: (iv_ruleHandlerDeclaration= ruleHandlerDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:806:2: iv_ruleHandlerDeclaration= ruleHandlerDeclaration EOF
            {
             newCompositeNode(grammarAccess.getHandlerDeclarationRule()); 
            pushFollow(FOLLOW_ruleHandlerDeclaration_in_entryRuleHandlerDeclaration1760);
            iv_ruleHandlerDeclaration=ruleHandlerDeclaration();

            state._fsp--;

             current =iv_ruleHandlerDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerDeclaration1770); 

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
    // $ANTLR end "entryRuleHandlerDeclaration"


    // $ANTLR start "ruleHandlerDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:813:1: ruleHandlerDeclaration returns [EObject current=null] : (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_actions_5_0= ruleActionDeclaration ) )+ otherlv_6= '}' ) ;
    public final EObject ruleHandlerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_actions_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:816:28: ( (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_actions_5_0= ruleActionDeclaration ) )+ otherlv_6= '}' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:817:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_actions_5_0= ruleActionDeclaration ) )+ otherlv_6= '}' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:817:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_actions_5_0= ruleActionDeclaration ) )+ otherlv_6= '}' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:817:3: otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_actions_5_0= ruleActionDeclaration ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleHandlerDeclaration1807); 

                	newLeafNode(otherlv_0, grammarAccess.getHandlerDeclarationAccess().getCaseKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleHandlerDeclaration1819); 

                	newLeafNode(otherlv_1, grammarAccess.getHandlerDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:825:1: ( (lv_expression_2_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:826:1: (lv_expression_2_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:826:1: (lv_expression_2_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:827:3: lv_expression_2_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getHandlerDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleHandlerDeclaration1840);
            lv_expression_2_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHandlerDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleHandlerDeclaration1852); 

                	newLeafNode(otherlv_3, grammarAccess.getHandlerDeclarationAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleHandlerDeclaration1864); 

                	newLeafNode(otherlv_4, grammarAccess.getHandlerDeclarationAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:851:1: ( (lv_actions_5_0= ruleActionDeclaration ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:852:1: (lv_actions_5_0= ruleActionDeclaration )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:852:1: (lv_actions_5_0= ruleActionDeclaration )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:853:3: lv_actions_5_0= ruleActionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHandlerDeclarationAccess().getActionsActionDeclarationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionDeclaration_in_ruleHandlerDeclaration1885);
            	    lv_actions_5_0=ruleActionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHandlerDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_5_0, 
            	            		"ActionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleHandlerDeclaration1898); 

                	newLeafNode(otherlv_6, grammarAccess.getHandlerDeclarationAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleHandlerDeclaration"


    // $ANTLR start "entryRuleActionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:881:1: entryRuleActionDeclaration returns [EObject current=null] : iv_ruleActionDeclaration= ruleActionDeclaration EOF ;
    public final EObject entryRuleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:882:2: (iv_ruleActionDeclaration= ruleActionDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:883:2: iv_ruleActionDeclaration= ruleActionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getActionDeclarationRule()); 
            pushFollow(FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration1934);
            iv_ruleActionDeclaration=ruleActionDeclaration();

            state._fsp--;

             current =iv_ruleActionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDeclaration1944); 

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
    // $ANTLR end "entryRuleActionDeclaration"


    // $ANTLR start "ruleActionDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:890:1: ruleActionDeclaration returns [EObject current=null] : (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:893:28: ( (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:894:1: (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:894:1: (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:894:3: otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleActionDeclaration1981); 

                	newLeafNode(otherlv_0, grammarAccess.getActionDeclarationAccess().getDoKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:898:1: ( (lv_expression_1_0= ruleLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:899:1: (lv_expression_1_0= ruleLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:899:1: (lv_expression_1_0= ruleLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:900:3: lv_expression_1_0= ruleLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getActionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleActionDeclaration2002);
            lv_expression_1_0=ruleLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"LogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleActionDeclaration2014); 

                	newLeafNode(otherlv_2, grammarAccess.getActionDeclarationAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleActionDeclaration"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:928:1: entryRulePropertyDeclaration returns [EObject current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final EObject entryRulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDeclaration = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:929:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:930:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration2050);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration2060); 

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
    // $ANTLR end "entryRulePropertyDeclaration"


    // $ANTLR start "rulePropertyDeclaration"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:937:1: rulePropertyDeclaration returns [EObject current=null] : (otherlv_0= 'spec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleTemporalLogicExpression ) ) otherlv_4= ';' ) ;
    public final EObject rulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:940:28: ( (otherlv_0= 'spec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleTemporalLogicExpression ) ) otherlv_4= ';' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:941:1: (otherlv_0= 'spec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleTemporalLogicExpression ) ) otherlv_4= ';' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:941:1: (otherlv_0= 'spec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleTemporalLogicExpression ) ) otherlv_4= ';' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:941:3: otherlv_0= 'spec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleTemporalLogicExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePropertyDeclaration2097); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyDeclarationAccess().getSpecKeyword_0());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:945:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:946:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:946:1: (lv_name_1_0= RULE_ID )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:947:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyDeclaration2114); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePropertyDeclaration2131); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyDeclarationAccess().getColonEqualsSignKeyword_2());
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:967:1: ( (lv_expression_3_0= ruleTemporalLogicExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:968:1: (lv_expression_3_0= ruleTemporalLogicExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:968:1: (lv_expression_3_0= ruleTemporalLogicExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:969:3: lv_expression_3_0= ruleTemporalLogicExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getExpressionTemporalLogicExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rulePropertyDeclaration2152);
            lv_expression_3_0=ruleTemporalLogicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"TemporalLogicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePropertyDeclaration2164); 

                	newLeafNode(otherlv_4, grammarAccess.getPropertyDeclarationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "rulePropertyDeclaration"


    // $ANTLR start "entryRuleLogicExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:997:1: entryRuleLogicExpression returns [EObject current=null] : iv_ruleLogicExpression= ruleLogicExpression EOF ;
    public final EObject entryRuleLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:998:2: (iv_ruleLogicExpression= ruleLogicExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:999:2: iv_ruleLogicExpression= ruleLogicExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicExpression_in_entryRuleLogicExpression2200);
            iv_ruleLogicExpression=ruleLogicExpression();

            state._fsp--;

             current =iv_ruleLogicExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExpression2210); 

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
    // $ANTLR end "entryRuleLogicExpression"


    // $ANTLR start "ruleLogicExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1006:1: ruleLogicExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1009:28: (this_OrExpression_0= ruleOrExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1011:5: this_OrExpression_0= ruleOrExpression
            {
             
                    newCompositeNode(grammarAccess.getLogicExpressionAccess().getOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleLogicExpression2256);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;

             
                    current = this_OrExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleLogicExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1027:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1028:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1029:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression2290);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression2300); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1036:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1039:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1040:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1040:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1041:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2347);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1049:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1049:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1049:2: ()
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1050:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1055:2: ( (lv_op_2_0= '||' ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1056:1: (lv_op_2_0= '||' )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1056:1: (lv_op_2_0= '||' )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1057:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,31,FOLLOW_31_in_ruleOrExpression2374); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1070:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1071:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1071:1: (lv_right_3_0= ruleAndExpression )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1072:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2408);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1096:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1097:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1098:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2446);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2456); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1105:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1108:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1109:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1109:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1110:5: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2503);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;

             
                    current = this_RelationalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1118:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1118:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1118:2: ()
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1119:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1124:2: ( (lv_op_2_0= '&&' ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1125:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1125:1: (lv_op_2_0= '&&' )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1126:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,32,FOLLOW_32_in_ruleAndExpression2530); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	    	    

            	    }


            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1139:2: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1140:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1140:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1141:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2564);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"RelationalExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1165:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1166:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1167:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2602);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2612); 

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1174:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1177:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1178:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1178:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1179:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2659);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;

             
                    current = this_AdditiveExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1187:1: ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=33 && LA10_0<=34)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1187:2: () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1187:2: ()
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1188:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1193:2: ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1194:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1194:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1195:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1195:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==33) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==34) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1196:3: lv_op_2_1= '->'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleRelationalExpression2688); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1208:8: lv_op_2_2= '<->'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_34_in_ruleRelationalExpression2717); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1223:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1224:1: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1224:1: (lv_right_3_0= ruleAdditiveExpression )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1225:3: lv_right_3_0= ruleAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2754);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AdditiveExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1249:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1250:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1251:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2792);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2802); 

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1258:1: ruleAdditiveExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_expr_2_0 = null;

        EObject this_PrimaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1261:28: ( ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1262:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1262:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||LA11_0==26||(LA11_0>=37 && LA11_0<=39)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1262:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1262:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1262:3: () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1262:3: ()
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1263:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0(),
                                current);
                        

                    }

                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1268:2: ( (lv_op_1_0= '!' ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1269:1: (lv_op_1_0= '!' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1269:1: (lv_op_1_0= '!' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1270:3: lv_op_1_0= '!'
                    {
                    lv_op_1_0=(Token)match(input,35,FOLLOW_35_in_ruleAdditiveExpression2855); 

                            newLeafNode(lv_op_1_0, grammarAccess.getAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_0, "!");
                    	    

                    }


                    }

                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1283:2: ( (lv_expr_2_0= rulePrimaryExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1284:1: (lv_expr_2_0= rulePrimaryExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1284:1: (lv_expr_2_0= rulePrimaryExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1285:3: lv_expr_2_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression2889);
                    lv_expr_2_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1303:5: this_PrimaryExpression_3= rulePrimaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression2918);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;

                     
                            current = this_PrimaryExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1319:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1320:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1321:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2953);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2963); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1328:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_expr_1_0 = null;

        Enumerator lv_opBin_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_right_8_0 = null;

        Enumerator lv_opMul_10_0 = null;

        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1331:28: ( ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1332:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1332:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 38:
            case 39:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1332:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1332:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1332:4: otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePrimaryExpression3001); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1336:1: ( (lv_expr_1_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1337:1: (lv_expr_1_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1337:1: (lv_expr_1_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1338:3: lv_expr_1_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExprLogicExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3022);
                    lv_expr_1_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_1_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression3034); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1359:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1359:6: ( (otherlv_3= RULE_ID ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1360:1: (otherlv_3= RULE_ID )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1360:1: (otherlv_3= RULE_ID )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1361:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3061); 

                    		newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1373:6: ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1373:6: ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1373:7: ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')'
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1373:7: ( (lv_opBin_4_0= ruleBINARYOPERATOR ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1374:1: (lv_opBin_4_0= ruleBINARYOPERATOR )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1374:1: (lv_opBin_4_0= ruleBINARYOPERATOR )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1375:3: lv_opBin_4_0= ruleBINARYOPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBINARYOPERATOR_in_rulePrimaryExpression3089);
                    lv_opBin_4_0=ruleBINARYOPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"opBin",
                            		lv_opBin_4_0, 
                            		"BINARYOPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulePrimaryExpression3101); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1395:1: ( (lv_left_6_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1396:1: (lv_left_6_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1396:1: (lv_left_6_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1397:3: lv_left_6_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3122);
                    lv_left_6_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_6_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression3134); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_3());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1417:1: ( (lv_right_8_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1418:1: (lv_right_8_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1418:1: (lv_right_8_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1419:3: lv_right_8_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3155);
                    lv_right_8_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_8_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression3167); 

                        	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1440:6: ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1440:6: ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1440:7: ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')'
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1440:7: ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1441:1: (lv_opMul_10_0= ruleMULTIPLEOPERATOR )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1441:1: (lv_opMul_10_0= ruleMULTIPLEOPERATOR )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1442:3: lv_opMul_10_0= ruleMULTIPLEOPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMULTIPLEOPERATOR_in_rulePrimaryExpression3196);
                    lv_opMul_10_0=ruleMULTIPLEOPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"opMul",
                            		lv_opMul_10_0, 
                            		"MULTIPLEOPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_rulePrimaryExpression3208); 

                        	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1462:1: ( (lv_args_12_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1463:1: (lv_args_12_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1463:1: (lv_args_12_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1464:3: lv_args_12_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3229);
                    lv_args_12_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_12_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1480:2: (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1480:4: otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression3242); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1484:1: ( (lv_args_14_0= ruleLogicExpression ) )
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1485:1: (lv_args_14_0= ruleLogicExpression )
                    	    {
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1485:1: (lv_args_14_0= ruleLogicExpression )
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1486:3: lv_args_14_0= ruleLogicExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3263);
                    	    lv_args_14_0=ruleLogicExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_14_0, 
                    	            		"LogicExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression3277); 

                        	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4());
                        

                    }


                    }
                    break;

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleTemporalLogicExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1514:1: entryRuleTemporalLogicExpression returns [EObject current=null] : iv_ruleTemporalLogicExpression= ruleTemporalLogicExpression EOF ;
    public final EObject entryRuleTemporalLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalLogicExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1515:2: (iv_ruleTemporalLogicExpression= ruleTemporalLogicExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1516:2: iv_ruleTemporalLogicExpression= ruleTemporalLogicExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalLogicExpressionRule()); 
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_entryRuleTemporalLogicExpression3314);
            iv_ruleTemporalLogicExpression=ruleTemporalLogicExpression();

            state._fsp--;

             current =iv_ruleTemporalLogicExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalLogicExpression3324); 

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
    // $ANTLR end "entryRuleTemporalLogicExpression"


    // $ANTLR start "ruleTemporalLogicExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1523:1: ruleTemporalLogicExpression returns [EObject current=null] : this_TemporalOrExpression_0= ruleTemporalOrExpression ;
    public final EObject ruleTemporalLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TemporalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1526:28: (this_TemporalOrExpression_0= ruleTemporalOrExpression )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1528:5: this_TemporalOrExpression_0= ruleTemporalOrExpression
            {
             
                    newCompositeNode(grammarAccess.getTemporalLogicExpressionAccess().getTemporalOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTemporalOrExpression_in_ruleTemporalLogicExpression3370);
            this_TemporalOrExpression_0=ruleTemporalOrExpression();

            state._fsp--;

             
                    current = this_TemporalOrExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleTemporalLogicExpression"


    // $ANTLR start "entryRuleTemporalOrExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1544:1: entryRuleTemporalOrExpression returns [EObject current=null] : iv_ruleTemporalOrExpression= ruleTemporalOrExpression EOF ;
    public final EObject entryRuleTemporalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalOrExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1545:2: (iv_ruleTemporalOrExpression= ruleTemporalOrExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1546:2: iv_ruleTemporalOrExpression= ruleTemporalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalOrExpressionRule()); 
            pushFollow(FOLLOW_ruleTemporalOrExpression_in_entryRuleTemporalOrExpression3404);
            iv_ruleTemporalOrExpression=ruleTemporalOrExpression();

            state._fsp--;

             current =iv_ruleTemporalOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalOrExpression3414); 

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
    // $ANTLR end "entryRuleTemporalOrExpression"


    // $ANTLR start "ruleTemporalOrExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1553:1: ruleTemporalOrExpression returns [EObject current=null] : (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* ) ;
    public final EObject ruleTemporalOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TemporalAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1556:28: ( (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1557:1: (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1557:1: (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1558:5: this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTemporalOrExpressionAccess().getTemporalAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression3461);
            this_TemporalAndExpression_0=ruleTemporalAndExpression();

            state._fsp--;

             
                    current = this_TemporalAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1566:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1566:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1566:2: ()
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1567:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1572:2: ( (lv_op_2_0= '||' ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1573:1: (lv_op_2_0= '||' )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1573:1: (lv_op_2_0= '||' )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1574:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,31,FOLLOW_31_in_ruleTemporalOrExpression3488); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getTemporalOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTemporalOrExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1587:2: ( (lv_right_3_0= ruleTemporalAndExpression ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1588:1: (lv_right_3_0= ruleTemporalAndExpression )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1588:1: (lv_right_3_0= ruleTemporalAndExpression )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1589:3: lv_right_3_0= ruleTemporalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalOrExpressionAccess().getRightTemporalAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression3522);
            	    lv_right_3_0=ruleTemporalAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"TemporalAndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleTemporalOrExpression"


    // $ANTLR start "entryRuleTemporalAndExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1613:1: entryRuleTemporalAndExpression returns [EObject current=null] : iv_ruleTemporalAndExpression= ruleTemporalAndExpression EOF ;
    public final EObject entryRuleTemporalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalAndExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1614:2: (iv_ruleTemporalAndExpression= ruleTemporalAndExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1615:2: iv_ruleTemporalAndExpression= ruleTemporalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalAndExpressionRule()); 
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_entryRuleTemporalAndExpression3560);
            iv_ruleTemporalAndExpression=ruleTemporalAndExpression();

            state._fsp--;

             current =iv_ruleTemporalAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalAndExpression3570); 

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
    // $ANTLR end "entryRuleTemporalAndExpression"


    // $ANTLR start "ruleTemporalAndExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1622:1: ruleTemporalAndExpression returns [EObject current=null] : (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* ) ;
    public final EObject ruleTemporalAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TemporalRelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1625:28: ( (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1626:1: (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1626:1: (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1627:5: this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTemporalAndExpressionAccess().getTemporalRelationalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression3617);
            this_TemporalRelationalExpression_0=ruleTemporalRelationalExpression();

            state._fsp--;

             
                    current = this_TemporalRelationalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1635:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1635:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1635:2: ()
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1636:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1641:2: ( (lv_op_2_0= '&&' ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1642:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1642:1: (lv_op_2_0= '&&' )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1643:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,32,FOLLOW_32_in_ruleTemporalAndExpression3644); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getTemporalAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTemporalAndExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	    	    

            	    }


            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1656:2: ( (lv_right_3_0= ruleTemporalRelationalExpression ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1657:1: (lv_right_3_0= ruleTemporalRelationalExpression )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1657:1: (lv_right_3_0= ruleTemporalRelationalExpression )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1658:3: lv_right_3_0= ruleTemporalRelationalExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalAndExpressionAccess().getRightTemporalRelationalExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression3678);
            	    lv_right_3_0=ruleTemporalRelationalExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"TemporalRelationalExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleTemporalAndExpression"


    // $ANTLR start "entryRuleTemporalRelationalExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1682:1: entryRuleTemporalRelationalExpression returns [EObject current=null] : iv_ruleTemporalRelationalExpression= ruleTemporalRelationalExpression EOF ;
    public final EObject entryRuleTemporalRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalRelationalExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1683:2: (iv_ruleTemporalRelationalExpression= ruleTemporalRelationalExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1684:2: iv_ruleTemporalRelationalExpression= ruleTemporalRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_entryRuleTemporalRelationalExpression3716);
            iv_ruleTemporalRelationalExpression=ruleTemporalRelationalExpression();

            state._fsp--;

             current =iv_ruleTemporalRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalRelationalExpression3726); 

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
    // $ANTLR end "entryRuleTemporalRelationalExpression"


    // $ANTLR start "ruleTemporalRelationalExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1691:1: ruleTemporalRelationalExpression returns [EObject current=null] : (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* ) ;
    public final EObject ruleTemporalRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TemporalAdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1694:28: ( (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1695:1: (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1695:1: (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1696:5: this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTemporalRelationalExpressionAccess().getTemporalAdditiveExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression3773);
            this_TemporalAdditiveExpression_0=ruleTemporalAdditiveExpression();

            state._fsp--;

             
                    current = this_TemporalAdditiveExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1704:1: ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1704:2: () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1704:2: ()
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1705:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1710:2: ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1711:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1711:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1712:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1712:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==33) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==34) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1713:3: lv_op_2_1= '->'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleTemporalRelationalExpression3802); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getTemporalRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTemporalRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1725:8: lv_op_2_2= '<->'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_34_in_ruleTemporalRelationalExpression3831); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getTemporalRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTemporalRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1740:2: ( (lv_right_3_0= ruleTemporalAdditiveExpression ) )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1741:1: (lv_right_3_0= ruleTemporalAdditiveExpression )
            	    {
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1741:1: (lv_right_3_0= ruleTemporalAdditiveExpression )
            	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1742:3: lv_right_3_0= ruleTemporalAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalRelationalExpressionAccess().getRightTemporalAdditiveExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression3868);
            	    lv_right_3_0=ruleTemporalAdditiveExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalRelationalExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"TemporalAdditiveExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleTemporalRelationalExpression"


    // $ANTLR start "entryRuleTemporalAdditiveExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1766:1: entryRuleTemporalAdditiveExpression returns [EObject current=null] : iv_ruleTemporalAdditiveExpression= ruleTemporalAdditiveExpression EOF ;
    public final EObject entryRuleTemporalAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalAdditiveExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1767:2: (iv_ruleTemporalAdditiveExpression= ruleTemporalAdditiveExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1768:2: iv_ruleTemporalAdditiveExpression= ruleTemporalAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_entryRuleTemporalAdditiveExpression3906);
            iv_ruleTemporalAdditiveExpression=ruleTemporalAdditiveExpression();

            state._fsp--;

             current =iv_ruleTemporalAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalAdditiveExpression3916); 

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
    // $ANTLR end "entryRuleTemporalAdditiveExpression"


    // $ANTLR start "ruleTemporalAdditiveExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1775:1: ruleTemporalAdditiveExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression ) ;
    public final EObject ruleTemporalAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_expr_2_0 = null;

        EObject this_TemporalPrimaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1778:28: ( ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1779:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1779:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID||LA18_0==26||(LA18_0>=37 && LA18_0<=47)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1779:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1779:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1779:3: () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1779:3: ()
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1780:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTemporalAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0(),
                                current);
                        

                    }

                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1785:2: ( (lv_op_1_0= '!' ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1786:1: (lv_op_1_0= '!' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1786:1: (lv_op_1_0= '!' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1787:3: lv_op_1_0= '!'
                    {
                    lv_op_1_0=(Token)match(input,35,FOLLOW_35_in_ruleTemporalAdditiveExpression3969); 

                            newLeafNode(lv_op_1_0, grammarAccess.getTemporalAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTemporalAdditiveExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_0, "!");
                    	    

                    }


                    }

                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1800:2: ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1801:1: (lv_expr_2_0= ruleTemporalPrimaryExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1801:1: (lv_expr_2_0= ruleTemporalPrimaryExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1802:3: lv_expr_2_0= ruleTemporalPrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalAdditiveExpressionAccess().getExprTemporalPrimaryExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression4003);
                    lv_expr_2_0=ruleTemporalPrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalAdditiveExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"TemporalPrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1820:5: this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalAdditiveExpressionAccess().getTemporalPrimaryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression4032);
                    this_TemporalPrimaryExpression_3=ruleTemporalPrimaryExpression();

                    state._fsp--;

                     
                            current = this_TemporalPrimaryExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleTemporalAdditiveExpression"


    // $ANTLR start "entryRuleTemporalPrimaryExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1836:1: entryRuleTemporalPrimaryExpression returns [EObject current=null] : iv_ruleTemporalPrimaryExpression= ruleTemporalPrimaryExpression EOF ;
    public final EObject entryRuleTemporalPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPrimaryExpression = null;


        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1837:2: (iv_ruleTemporalPrimaryExpression= ruleTemporalPrimaryExpression EOF )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1838:2: iv_ruleTemporalPrimaryExpression= ruleTemporalPrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalPrimaryExpressionRule()); 
            pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_entryRuleTemporalPrimaryExpression4067);
            iv_ruleTemporalPrimaryExpression=ruleTemporalPrimaryExpression();

            state._fsp--;

             current =iv_ruleTemporalPrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPrimaryExpression4077); 

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
    // $ANTLR end "entryRuleTemporalPrimaryExpression"


    // $ANTLR start "ruleTemporalPrimaryExpression"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1845:1: ruleTemporalPrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) ) ;
    public final EObject ruleTemporalPrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_expr_1_0 = null;

        Enumerator lv_opTemp_4_0 = null;

        EObject lv_temporal_6_0 = null;

        Enumerator lv_opTempUntil_8_0 = null;

        EObject lv_leftExp_10_0 = null;

        EObject lv_rightExp_12_0 = null;

        Enumerator lv_opBin_14_0 = null;

        EObject lv_left_16_0 = null;

        EObject lv_right_18_0 = null;

        Enumerator lv_opMul_20_0 = null;

        EObject lv_args_22_0 = null;

        EObject lv_args_24_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1848:28: ( ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1849:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1849:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=2;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt20=3;
                }
                break;
            case 46:
            case 47:
                {
                alt20=4;
                }
                break;
            case 38:
            case 39:
                {
                alt20=5;
                }
                break;
            case 37:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1849:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1849:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1849:4: otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTemporalPrimaryExpression4115); 

                        	newLeafNode(otherlv_0, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1853:1: ( (lv_expr_1_0= ruleTemporalLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1854:1: (lv_expr_1_0= ruleTemporalLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1854:1: (lv_expr_1_0= ruleTemporalLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1855:3: lv_expr_1_0= ruleTemporalLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getExprTemporalLogicExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4136);
                    lv_expr_1_0=ruleTemporalLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_1_0, 
                            		"TemporalLogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTemporalPrimaryExpression4148); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1876:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1876:6: ( (otherlv_3= RULE_ID ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1877:1: (otherlv_3= RULE_ID )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1877:1: (otherlv_3= RULE_ID )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1878:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemporalPrimaryExpression4175); 

                    		newLeafNode(otherlv_3, grammarAccess.getTemporalPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1890:6: ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1890:6: ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1890:7: ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')'
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1890:7: ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1891:1: (lv_opTemp_4_0= ruleTEMPORALOPERATOR )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1891:1: (lv_opTemp_4_0= ruleTEMPORALOPERATOR )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1892:3: lv_opTemp_4_0= ruleTEMPORALOPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempTEMPORALOPERATOREnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTEMPORALOPERATOR_in_ruleTemporalPrimaryExpression4203);
                    lv_opTemp_4_0=ruleTEMPORALOPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"opTemp",
                            		lv_opTemp_4_0, 
                            		"TEMPORALOPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleTemporalPrimaryExpression4215); 

                        	newLeafNode(otherlv_5, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1912:1: ( (lv_temporal_6_0= ruleTemporalLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1913:1: (lv_temporal_6_0= ruleTemporalLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1913:1: (lv_temporal_6_0= ruleTemporalLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1914:3: lv_temporal_6_0= ruleTemporalLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalTemporalLogicExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4236);
                    lv_temporal_6_0=ruleTemporalLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"temporal",
                            		lv_temporal_6_0, 
                            		"TemporalLogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleTemporalPrimaryExpression4248); 

                        	newLeafNode(otherlv_7, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1935:6: ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1935:6: ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1935:7: ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')'
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1935:7: ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1936:1: (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1936:1: (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1937:3: lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilTEMPUNTILOPERATOREnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTEMPUNTILOPERATOR_in_ruleTemporalPrimaryExpression4277);
                    lv_opTempUntil_8_0=ruleTEMPUNTILOPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"opTempUntil",
                            		lv_opTempUntil_8_0, 
                            		"TEMPUNTILOPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleTemporalPrimaryExpression4289); 

                        	newLeafNode(otherlv_9, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1957:1: ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1958:1: (lv_leftExp_10_0= ruleTemporalLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1958:1: (lv_leftExp_10_0= ruleTemporalLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1959:3: lv_leftExp_10_0= ruleTemporalLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpTemporalLogicExpressionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4310);
                    lv_leftExp_10_0=ruleTemporalLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"leftExp",
                            		lv_leftExp_10_0, 
                            		"TemporalLogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleTemporalPrimaryExpression4322); 

                        	newLeafNode(otherlv_11, grammarAccess.getTemporalPrimaryExpressionAccess().getUKeyword_3_3());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1979:1: ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1980:1: (lv_rightExp_12_0= ruleTemporalLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1980:1: (lv_rightExp_12_0= ruleTemporalLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:1981:3: lv_rightExp_12_0= ruleTemporalLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpTemporalLogicExpressionParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4343);
                    lv_rightExp_12_0=ruleTemporalLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExp",
                            		lv_rightExp_12_0, 
                            		"TemporalLogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleTemporalPrimaryExpression4355); 

                        	newLeafNode(otherlv_13, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_3_5());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2002:6: ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2002:6: ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2002:7: ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')'
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2002:7: ( (lv_opBin_14_0= ruleBINARYOPERATOR ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2003:1: (lv_opBin_14_0= ruleBINARYOPERATOR )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2003:1: (lv_opBin_14_0= ruleBINARYOPERATOR )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2004:3: lv_opBin_14_0= ruleBINARYOPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBINARYOPERATOR_in_ruleTemporalPrimaryExpression4384);
                    lv_opBin_14_0=ruleBINARYOPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"opBin",
                            		lv_opBin_14_0, 
                            		"BINARYOPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleTemporalPrimaryExpression4396); 

                        	newLeafNode(otherlv_15, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2024:1: ( (lv_left_16_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2025:1: (lv_left_16_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2025:1: (lv_left_16_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2026:3: lv_left_16_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4417);
                    lv_left_16_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_16_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleTemporalPrimaryExpression4429); 

                        	newLeafNode(otherlv_17, grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_4_3());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2046:1: ( (lv_right_18_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2047:1: (lv_right_18_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2047:1: (lv_right_18_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2048:3: lv_right_18_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4450);
                    lv_right_18_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_18_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,27,FOLLOW_27_in_ruleTemporalPrimaryExpression4462); 

                        	newLeafNode(otherlv_19, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_4_5());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2069:6: ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2069:6: ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2069:7: ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')'
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2069:7: ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2070:1: (lv_opMul_20_0= ruleMULTIPLEOPERATOR )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2070:1: (lv_opMul_20_0= ruleMULTIPLEOPERATOR )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2071:3: lv_opMul_20_0= ruleMULTIPLEOPERATOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMULTIPLEOPERATOR_in_ruleTemporalPrimaryExpression4491);
                    lv_opMul_20_0=ruleMULTIPLEOPERATOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"opMul",
                            		lv_opMul_20_0, 
                            		"MULTIPLEOPERATOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_21=(Token)match(input,26,FOLLOW_26_in_ruleTemporalPrimaryExpression4503); 

                        	newLeafNode(otherlv_21, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2091:1: ( (lv_args_22_0= ruleLogicExpression ) )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2092:1: (lv_args_22_0= ruleLogicExpression )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2092:1: (lv_args_22_0= ruleLogicExpression )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2093:3: lv_args_22_0= ruleLogicExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4524);
                    lv_args_22_0=ruleLogicExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_22_0, 
                            		"LogicExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2109:2: (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2109:4: otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleTemporalPrimaryExpression4537); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2113:1: ( (lv_args_24_0= ruleLogicExpression ) )
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2114:1: (lv_args_24_0= ruleLogicExpression )
                    	    {
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2114:1: (lv_args_24_0= ruleLogicExpression )
                    	    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2115:3: lv_args_24_0= ruleLogicExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4558);
                    	    lv_args_24_0=ruleLogicExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTemporalPrimaryExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_24_0, 
                    	            		"LogicExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    otherlv_25=(Token)match(input,27,FOLLOW_27_in_ruleTemporalPrimaryExpression4572); 

                        	newLeafNode(otherlv_25, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_5_4());
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTemporalPrimaryExpression"


    // $ANTLR start "ruleMULTIPLEOPERATOR"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2143:1: ruleMULTIPLEOPERATOR returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleMULTIPLEOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2145:28: ( (enumLiteral_0= 'xor' ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2146:1: (enumLiteral_0= 'xor' )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2146:1: (enumLiteral_0= 'xor' )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2146:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleMULTIPLEOPERATOR4622); 

                    current = grammarAccess.getMULTIPLEOPERATORAccess().getXorEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLEOPERATORAccess().getXorEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleMULTIPLEOPERATOR"


    // $ANTLR start "ruleBINARYOPERATOR"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2156:1: ruleBINARYOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) ) ;
    public final Enumerator ruleBINARYOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2158:28: ( ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2159:1: ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2159:1: ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2159:2: (enumLiteral_0= 'nor' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2159:2: (enumLiteral_0= 'nor' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2159:4: enumLiteral_0= 'nor'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleBINARYOPERATOR4666); 

                            current = grammarAccess.getBINARYOPERATORAccess().getNorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBINARYOPERATORAccess().getNorEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2165:6: (enumLiteral_1= 'nand' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2165:6: (enumLiteral_1= 'nand' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2165:8: enumLiteral_1= 'nand'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleBINARYOPERATOR4683); 

                            current = grammarAccess.getBINARYOPERATORAccess().getNandEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBINARYOPERATORAccess().getNandEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleBINARYOPERATOR"


    // $ANTLR start "ruleTEMPORALOPERATOR"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2175:1: ruleTEMPORALOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) ) ;
    public final Enumerator ruleTEMPORALOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2177:28: ( ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2178:1: ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2178:1: ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                alt22=3;
                }
                break;
            case 43:
                {
                alt22=4;
                }
                break;
            case 44:
                {
                alt22=5;
                }
                break;
            case 45:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2178:2: (enumLiteral_0= 'EX' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2178:2: (enumLiteral_0= 'EX' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2178:4: enumLiteral_0= 'EX'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleTEMPORALOPERATOR4728); 

                            current = grammarAccess.getTEMPORALOPERATORAccess().getEXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTEMPORALOPERATORAccess().getEXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2184:6: (enumLiteral_1= 'EG' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2184:6: (enumLiteral_1= 'EG' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2184:8: enumLiteral_1= 'EG'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleTEMPORALOPERATOR4745); 

                            current = grammarAccess.getTEMPORALOPERATORAccess().getEGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTEMPORALOPERATORAccess().getEGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2190:6: (enumLiteral_2= 'EF' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2190:6: (enumLiteral_2= 'EF' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2190:8: enumLiteral_2= 'EF'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleTEMPORALOPERATOR4762); 

                            current = grammarAccess.getTEMPORALOPERATORAccess().getEFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTEMPORALOPERATORAccess().getEFEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2196:6: (enumLiteral_3= 'AX' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2196:6: (enumLiteral_3= 'AX' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2196:8: enumLiteral_3= 'AX'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleTEMPORALOPERATOR4779); 

                            current = grammarAccess.getTEMPORALOPERATORAccess().getAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTEMPORALOPERATORAccess().getAXEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2202:6: (enumLiteral_4= 'AG' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2202:6: (enumLiteral_4= 'AG' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2202:8: enumLiteral_4= 'AG'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleTEMPORALOPERATOR4796); 

                            current = grammarAccess.getTEMPORALOPERATORAccess().getAGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTEMPORALOPERATORAccess().getAGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2208:6: (enumLiteral_5= 'AF' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2208:6: (enumLiteral_5= 'AF' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2208:8: enumLiteral_5= 'AF'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleTEMPORALOPERATOR4813); 

                            current = grammarAccess.getTEMPORALOPERATORAccess().getAFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTEMPORALOPERATORAccess().getAFEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTEMPORALOPERATOR"


    // $ANTLR start "ruleTEMPUNTILOPERATOR"
    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2218:1: ruleTEMPUNTILOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) ) ;
    public final Enumerator ruleTEMPUNTILOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2220:28: ( ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) ) )
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2221:1: ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) )
            {
            // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2221:1: ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            else if ( (LA23_0==47) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2221:2: (enumLiteral_0= 'E' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2221:2: (enumLiteral_0= 'E' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2221:4: enumLiteral_0= 'E'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleTEMPUNTILOPERATOR4858); 

                            current = grammarAccess.getTEMPUNTILOPERATORAccess().getEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTEMPUNTILOPERATORAccess().getEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2227:6: (enumLiteral_1= 'A' )
                    {
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2227:6: (enumLiteral_1= 'A' )
                    // ../br.ufc.great.catchml/src-gen/br/ufc/great/catchml/parser/antlr/internal/InternalCatchML.g:2227:8: enumLiteral_1= 'A'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleTEMPUNTILOPERATOR4875); 

                            current = grammarAccess.getTEMPUNTILOPERATORAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTEMPUNTILOPERATORAccess().getAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTEMPUNTILOPERATOR"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_ruleAbstractElement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemDeclaration268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystemDeclaration305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemDeclaration322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystemDeclaration339 = new BitSet(new long[]{0x00000000419A6000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleSystemDeclaration360 = new BitSet(new long[]{0x00000000419A6000L});
    public static final BitSet FOLLOW_13_in_ruleSystemDeclaration373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionExpressionDeclaration_in_ruleDeclaration466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationDeclaration_in_ruleDeclaration493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintDeclaration_in_ruleDeclaration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintDeclaration_in_ruleDeclaration547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleDeclaration574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDeclaration_in_ruleDeclaration601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleDeclaration628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionExpressionDeclaration_in_entryRulePropositionExpressionDeclaration663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionExpressionDeclaration673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePropositionExpressionDeclaration710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rulePropositionExpressionDeclaration731 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePropositionExpressionDeclaration744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rulePropositionExpressionDeclaration765 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePropositionExpressionDeclaration779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_entryRulePropositionDeclaration815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionDeclaration825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropositionDeclaration866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationDeclaration_in_entryRuleSituationDeclaration906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituationDeclaration916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSituationDeclaration953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSituationDeclaration970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSituationDeclaration987 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleSituationDeclaration1008 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSituationDeclaration1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintDeclaration_in_entryRuleSemanticConstraintDeclaration1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemanticConstraintDeclaration1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSemanticConstraintDeclaration1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSemanticConstraintDeclaration1120 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSemanticConstraintDeclaration1137 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleSemanticConstraintDeclaration1158 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSemanticConstraintDeclaration1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintDeclaration_in_entryRuleTransitionConstraintDeclaration1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionConstraintDeclaration1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTransitionConstraintDeclaration1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionConstraintDeclaration1270 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransitionConstraintDeclaration1287 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransitionConstraintDeclaration1299 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration1320 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransitionConstraintDeclaration1332 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration1353 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTransitionConstraintDeclaration1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExceptionDeclaration1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionDeclaration1465 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExceptionDeclaration1482 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleExceptionDeclaration1503 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExceptionDeclaration1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDeclaration_in_entryRuleScopeDeclaration1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeDeclaration1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleScopeDeclaration1600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopeDeclaration1617 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleScopeDeclaration1634 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleScopeDeclaration1646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopeDeclaration1666 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleScopeDeclaration1678 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScopeDeclaration1690 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleHandlerDeclaration_in_ruleScopeDeclaration1711 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleScopeDeclaration1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDeclaration_in_entryRuleHandlerDeclaration1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDeclaration1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleHandlerDeclaration1807 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleHandlerDeclaration1819 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleHandlerDeclaration1840 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHandlerDeclaration1852 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHandlerDeclaration1864 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_ruleHandlerDeclaration1885 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleHandlerDeclaration1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDeclaration1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleActionDeclaration1981 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleActionDeclaration2002 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActionDeclaration2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePropertyDeclaration2097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDeclaration2114 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyDeclaration2131 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rulePropertyDeclaration2152 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertyDeclaration2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_entryRuleLogicExpression2200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExpression2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicExpression2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2347 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleOrExpression2374 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2408 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2503 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleAndExpression2530 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2564 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2659 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleRelationalExpression2688 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_34_in_ruleRelationalExpression2717 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2754 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAdditiveExpression2855 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimaryExpression3001 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3022 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARYOPERATOR_in_rulePrimaryExpression3089 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePrimaryExpression3101 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression3134 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3155 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLEOPERATOR_in_rulePrimaryExpression3196 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePrimaryExpression3208 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression3242 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression3263 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_entryRuleTemporalLogicExpression3314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalLogicExpression3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalOrExpression_in_ruleTemporalLogicExpression3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalOrExpression_in_entryRuleTemporalOrExpression3404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalOrExpression3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression3461 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleTemporalOrExpression3488 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression3522 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_entryRuleTemporalAndExpression3560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalAndExpression3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression3617 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTemporalAndExpression3644 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression3678 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_entryRuleTemporalRelationalExpression3716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalRelationalExpression3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression3773 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleTemporalRelationalExpression3802 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_34_in_ruleTemporalRelationalExpression3831 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression3868 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_entryRuleTemporalAdditiveExpression3906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalAdditiveExpression3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTemporalAdditiveExpression3969 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_entryRuleTemporalPrimaryExpression4067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPrimaryExpression4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTemporalPrimaryExpression4115 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4136 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemporalPrimaryExpression4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemporalPrimaryExpression4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEMPORALOPERATOR_in_ruleTemporalPrimaryExpression4203 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemporalPrimaryExpression4215 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4236 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemporalPrimaryExpression4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEMPUNTILOPERATOR_in_ruleTemporalPrimaryExpression4277 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemporalPrimaryExpression4289 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4310 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTemporalPrimaryExpression4322 = new BitSet(new long[]{0x0000FFE804000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression4343 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemporalPrimaryExpression4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARYOPERATOR_in_ruleTemporalPrimaryExpression4384 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemporalPrimaryExpression4396 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4417 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTemporalPrimaryExpression4429 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4450 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemporalPrimaryExpression4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLEOPERATOR_in_ruleTemporalPrimaryExpression4491 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemporalPrimaryExpression4503 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4524 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTemporalPrimaryExpression4537 = new BitSet(new long[]{0x000000E804000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression4558 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_ruleTemporalPrimaryExpression4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMULTIPLEOPERATOR4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBINARYOPERATOR4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBINARYOPERATOR4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTEMPORALOPERATOR4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTEMPORALOPERATOR4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTEMPORALOPERATOR4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTEMPORALOPERATOR4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTEMPORALOPERATOR4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTEMPORALOPERATOR4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTEMPUNTILOPERATOR4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTEMPUNTILOPERATOR4875 = new BitSet(new long[]{0x0000000000000002L});

}