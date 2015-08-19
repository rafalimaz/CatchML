package org.xtext.example.mydsl.parser.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'use'", "';'", "'.*'", "'system'", "'{'", "'}'", "'prop'", "','", "'situation'", "':='", "'sconstraint'", "'tconstraint'", "'pre'", "'post'", "'exception'", "'scope'", "'handle'", "'('", "')'", "'case'", "'catch'", "'do'", "'signal'", "'to'", "'raise'", "'spec'", "'||'", "'&&'", "'->'", "'<->'", "'!'", "'U'", "'xor'", "'nor'", "'nand'", "'EX'", "'EG'", "'EF'", "'AX'", "'AG'", "'AF'", "'E'", "'A'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainmodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:83:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: ruleAbstractElement returns [EObject current=null] : (this_Import_0= ruleImport | this_SystemDeclaration_1= ruleSystemDeclaration ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_SystemDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:28: ( (this_Import_0= ruleImport | this_SystemDeclaration_1= ruleSystemDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: (this_Import_0= ruleImport | this_SystemDeclaration_1= ruleSystemDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: (this_Import_0= ruleImport | this_SystemDeclaration_1= ruleSystemDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:5: this_Import_0= ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement223);
                    this_Import_0=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Import_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:131:5: this_SystemDeclaration_1= ruleSystemDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSystemDeclaration_in_ruleAbstractElement250);
                    this_SystemDeclaration_1=ruleSystemDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SystemDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName286);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName297); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:159:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) && (synpred1_InternalMyDsl())) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName381); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:191:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport428);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport438); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: ruleImport returns [EObject current=null] : (otherlv_0= 'use' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:28: ( (otherlv_0= 'use' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:1: (otherlv_0= 'use' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:1: (otherlv_0= 'use' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:3: otherlv_0= 'use' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getUseKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport496);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImport508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard545);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:249:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard603);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleSystemDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: entryRuleSystemDeclaration returns [EObject current=null] : iv_ruleSystemDeclaration= ruleSystemDeclaration EOF ;
    public final EObject entryRuleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:2: (iv_ruleSystemDeclaration= ruleSystemDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:2: iv_ruleSystemDeclaration= ruleSystemDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration664);
            iv_ruleSystemDeclaration=ruleSystemDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemDeclaration674); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: ruleSystemDeclaration returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSystemDeclaration711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:293:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:293:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:294:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemDeclaration728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSystemDeclaration745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSystemDeclarationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==20||(LA5_0>=22 && LA5_0<=23)||(LA5_0>=26 && LA5_0<=27)||LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleSystemDeclaration766);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSystemDeclaration779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSystemDeclarationAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration815);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration825); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:1: ruleDeclaration returns [EObject current=null] : (this_PropositionType_0= rulePropositionType | this_SituationType_1= ruleSituationType | this_SemanticConstraintType_2= ruleSemanticConstraintType | this_TransitionConstraintType_3= ruleTransitionConstraintType | this_ExceptionType_4= ruleExceptionType | this_ScopeType_5= ruleScopeType | this_PropertyType_6= rulePropertyType ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_PropositionType_0 = null;

        EObject this_SituationType_1 = null;

        EObject this_SemanticConstraintType_2 = null;

        EObject this_TransitionConstraintType_3 = null;

        EObject this_ExceptionType_4 = null;

        EObject this_ScopeType_5 = null;

        EObject this_PropertyType_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:28: ( (this_PropositionType_0= rulePropositionType | this_SituationType_1= ruleSituationType | this_SemanticConstraintType_2= ruleSemanticConstraintType | this_TransitionConstraintType_3= ruleTransitionConstraintType | this_ExceptionType_4= ruleExceptionType | this_ScopeType_5= ruleScopeType | this_PropertyType_6= rulePropertyType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: (this_PropositionType_0= rulePropositionType | this_SituationType_1= ruleSituationType | this_SemanticConstraintType_2= ruleSemanticConstraintType | this_TransitionConstraintType_3= ruleTransitionConstraintType | this_ExceptionType_4= ruleExceptionType | this_ScopeType_5= ruleScopeType | this_PropertyType_6= rulePropertyType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: (this_PropositionType_0= rulePropositionType | this_SituationType_1= ruleSituationType | this_SemanticConstraintType_2= ruleSemanticConstraintType | this_TransitionConstraintType_3= ruleTransitionConstraintType | this_ExceptionType_4= ruleExceptionType | this_ScopeType_5= ruleScopeType | this_PropertyType_6= rulePropertyType )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            case 37:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:358:5: this_PropositionType_0= rulePropositionType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getPropositionTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropositionType_in_ruleDeclaration872);
                    this_PropositionType_0=rulePropositionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropositionType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:5: this_SituationType_1= ruleSituationType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSituationTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSituationType_in_ruleDeclaration899);
                    this_SituationType_1=ruleSituationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SituationType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:5: this_SemanticConstraintType_2= ruleSemanticConstraintType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSemanticConstraintTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSemanticConstraintType_in_ruleDeclaration926);
                    this_SemanticConstraintType_2=ruleSemanticConstraintType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SemanticConstraintType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:5: this_TransitionConstraintType_3= ruleTransitionConstraintType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getTransitionConstraintTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionConstraintType_in_ruleDeclaration953);
                    this_TransitionConstraintType_3=ruleTransitionConstraintType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionConstraintType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:5: this_ExceptionType_4= ruleExceptionType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getExceptionTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExceptionType_in_ruleDeclaration980);
                    this_ExceptionType_4=ruleExceptionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExceptionType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:5: this_ScopeType_5= ruleScopeType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getScopeTypeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScopeType_in_ruleDeclaration1007);
                    this_ScopeType_5=ruleScopeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScopeType_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:5: this_PropertyType_6= rulePropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getPropertyTypeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyType_in_ruleDeclaration1034);
                    this_PropertyType_6=rulePropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyType_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRulePropositionType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: entryRulePropositionType returns [EObject current=null] : iv_rulePropositionType= rulePropositionType EOF ;
    public final EObject entryRulePropositionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropositionType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:2: (iv_rulePropositionType= rulePropositionType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:2: iv_rulePropositionType= rulePropositionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropositionTypeRule()); 
            }
            pushFollow(FOLLOW_rulePropositionType_in_entryRulePropositionType1069);
            iv_rulePropositionType=rulePropositionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropositionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionType1079); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropositionType"


    // $ANTLR start "rulePropositionType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:1: rulePropositionType returns [EObject current=null] : (this_PropositionList_0= rulePropositionList | this_PropositionSingle_1= rulePropositionSingle ) ;
    public final EObject rulePropositionType() throws RecognitionException {
        EObject current = null;

        EObject this_PropositionList_0 = null;

        EObject this_PropositionSingle_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:446:28: ( (this_PropositionList_0= rulePropositionList | this_PropositionSingle_1= rulePropositionSingle ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:1: (this_PropositionList_0= rulePropositionList | this_PropositionSingle_1= rulePropositionSingle )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:1: (this_PropositionList_0= rulePropositionList | this_PropositionSingle_1= rulePropositionSingle )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==13) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==19) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:448:5: this_PropositionList_0= rulePropositionList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropositionTypeAccess().getPropositionListParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropositionList_in_rulePropositionType1126);
                    this_PropositionList_0=rulePropositionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropositionList_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:5: this_PropositionSingle_1= rulePropositionSingle
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropositionTypeAccess().getPropositionSingleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropositionSingle_in_rulePropositionType1153);
                    this_PropositionSingle_1=rulePropositionSingle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropositionSingle_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropositionType"


    // $ANTLR start "entryRulePropositionList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:1: entryRulePropositionList returns [EObject current=null] : iv_rulePropositionList= rulePropositionList EOF ;
    public final EObject entryRulePropositionList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropositionList = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:2: (iv_rulePropositionList= rulePropositionList EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:2: iv_rulePropositionList= rulePropositionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropositionListRule()); 
            }
            pushFollow(FOLLOW_rulePropositionList_in_entryRulePropositionList1188);
            iv_rulePropositionList=rulePropositionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropositionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionList1198); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropositionList"


    // $ANTLR start "rulePropositionList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: rulePropositionList returns [EObject current=null] : (otherlv_0= 'prop' ( (lv_head_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) ) )+ otherlv_4= ';' ) ;
    public final EObject rulePropositionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:486:28: ( (otherlv_0= 'prop' ( (lv_head_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) ) )+ otherlv_4= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (otherlv_0= 'prop' ( (lv_head_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) ) )+ otherlv_4= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (otherlv_0= 'prop' ( (lv_head_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) ) )+ otherlv_4= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:3: otherlv_0= 'prop' ( (lv_head_1_0= rulePropositionDeclaration ) ) (otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) ) )+ otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePropositionList1235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropositionListAccess().getPropKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:491:1: ( (lv_head_1_0= rulePropositionDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:492:1: (lv_head_1_0= rulePropositionDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:492:1: (lv_head_1_0= rulePropositionDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:493:3: lv_head_1_0= rulePropositionDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropositionListAccess().getHeadPropositionDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropositionDeclaration_in_rulePropositionList1256);
            lv_head_1_0=rulePropositionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropositionListRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_1_0, 
                      		"PropositionDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:2: (otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:4: otherlv_2= ',' ( (lv_tail_3_0= rulePropositionDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePropositionList1269); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPropositionListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:1: ( (lv_tail_3_0= rulePropositionDeclaration ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_tail_3_0= rulePropositionDeclaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_tail_3_0= rulePropositionDeclaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:3: lv_tail_3_0= rulePropositionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropositionListAccess().getTailPropositionDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropositionDeclaration_in_rulePropositionList1290);
            	    lv_tail_3_0=rulePropositionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropositionListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tail",
            	              		lv_tail_3_0, 
            	              		"PropositionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePropositionList1304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPropositionListAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropositionList"


    // $ANTLR start "entryRulePropositionSingle"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:1: entryRulePropositionSingle returns [EObject current=null] : iv_rulePropositionSingle= rulePropositionSingle EOF ;
    public final EObject entryRulePropositionSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropositionSingle = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:2: (iv_rulePropositionSingle= rulePropositionSingle EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:2: iv_rulePropositionSingle= rulePropositionSingle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropositionSingleRule()); 
            }
            pushFollow(FOLLOW_rulePropositionSingle_in_entryRulePropositionSingle1340);
            iv_rulePropositionSingle=rulePropositionSingle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropositionSingle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionSingle1350); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropositionSingle"


    // $ANTLR start "rulePropositionSingle"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:1: rulePropositionSingle returns [EObject current=null] : (otherlv_0= 'prop' ( (lv_value_1_0= rulePropositionDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject rulePropositionSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:28: ( (otherlv_0= 'prop' ( (lv_value_1_0= rulePropositionDeclaration ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:1: (otherlv_0= 'prop' ( (lv_value_1_0= rulePropositionDeclaration ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:1: (otherlv_0= 'prop' ( (lv_value_1_0= rulePropositionDeclaration ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:3: otherlv_0= 'prop' ( (lv_value_1_0= rulePropositionDeclaration ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePropositionSingle1387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropositionSingleAccess().getPropKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:560:1: ( (lv_value_1_0= rulePropositionDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: (lv_value_1_0= rulePropositionDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: (lv_value_1_0= rulePropositionDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:3: lv_value_1_0= rulePropositionDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropositionSingleAccess().getValuePropositionDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropositionDeclaration_in_rulePropositionSingle1408);
            lv_value_1_0=rulePropositionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropositionSingleRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"PropositionDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePropositionSingle1420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropositionSingleAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropositionSingle"


    // $ANTLR start "entryRulePropositionDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:1: entryRulePropositionDeclaration returns [EObject current=null] : iv_rulePropositionDeclaration= rulePropositionDeclaration EOF ;
    public final EObject entryRulePropositionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropositionDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:2: (iv_rulePropositionDeclaration= rulePropositionDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:2: iv_rulePropositionDeclaration= rulePropositionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropositionDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropositionDeclaration_in_entryRulePropositionDeclaration1456);
            iv_rulePropositionDeclaration=rulePropositionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropositionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropositionDeclaration1466); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: rulePropositionDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePropositionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropositionDeclaration1507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropositionDeclarationAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropositionDeclaration"


    // $ANTLR start "entryRuleSituationType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:1: entryRuleSituationType returns [EObject current=null] : iv_ruleSituationType= ruleSituationType EOF ;
    public final EObject entryRuleSituationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituationType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:2: (iv_ruleSituationType= ruleSituationType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:2: iv_ruleSituationType= ruleSituationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSituationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSituationType_in_entryRuleSituationType1547);
            iv_ruleSituationType=ruleSituationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSituationType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSituationType1557); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSituationType"


    // $ANTLR start "ruleSituationType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:1: ruleSituationType returns [EObject current=null] : (otherlv_0= 'situation' ( (lv_value_1_0= ruleSituationDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleSituationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:28: ( (otherlv_0= 'situation' ( (lv_value_1_0= ruleSituationDeclaration ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:1: (otherlv_0= 'situation' ( (lv_value_1_0= ruleSituationDeclaration ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:1: (otherlv_0= 'situation' ( (lv_value_1_0= ruleSituationDeclaration ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:3: otherlv_0= 'situation' ( (lv_value_1_0= ruleSituationDeclaration ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSituationType1594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSituationTypeAccess().getSituationKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: ( (lv_value_1_0= ruleSituationDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: (lv_value_1_0= ruleSituationDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: (lv_value_1_0= ruleSituationDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:3: lv_value_1_0= ruleSituationDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSituationTypeAccess().getValueSituationDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSituationDeclaration_in_ruleSituationType1615);
            lv_value_1_0=ruleSituationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSituationTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SituationDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSituationType1627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSituationTypeAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSituationType"


    // $ANTLR start "entryRuleSituationDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:1: entryRuleSituationDeclaration returns [EObject current=null] : iv_ruleSituationDeclaration= ruleSituationDeclaration EOF ;
    public final EObject entryRuleSituationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituationDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:2: (iv_ruleSituationDeclaration= ruleSituationDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:678:2: iv_ruleSituationDeclaration= ruleSituationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSituationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSituationDeclaration_in_entryRuleSituationDeclaration1663);
            iv_ruleSituationDeclaration=ruleSituationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSituationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSituationDeclaration1673); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:1: ruleSituationDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) ) ;
    public final EObject ruleSituationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSituationDeclaration1715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSituationDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSituationDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSituationDeclaration1732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSituationDeclarationAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:711:1: ( (lv_expression_2_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: (lv_expression_2_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: (lv_expression_2_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:3: lv_expression_2_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSituationDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleSituationDeclaration1753);
            lv_expression_2_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSituationDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"LogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSituationDeclaration"


    // $ANTLR start "entryRuleSemanticConstraintType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: entryRuleSemanticConstraintType returns [EObject current=null] : iv_ruleSemanticConstraintType= ruleSemanticConstraintType EOF ;
    public final EObject entryRuleSemanticConstraintType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticConstraintType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:2: (iv_ruleSemanticConstraintType= ruleSemanticConstraintType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:2: iv_ruleSemanticConstraintType= ruleSemanticConstraintType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticConstraintTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSemanticConstraintType_in_entryRuleSemanticConstraintType1789);
            iv_ruleSemanticConstraintType=ruleSemanticConstraintType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemanticConstraintType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemanticConstraintType1799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSemanticConstraintType"


    // $ANTLR start "ruleSemanticConstraintType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:1: ruleSemanticConstraintType returns [EObject current=null] : (otherlv_0= 'sconstraint' ( (lv_value_1_0= ruleSemanticConstraintDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleSemanticConstraintType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:749:28: ( (otherlv_0= 'sconstraint' ( (lv_value_1_0= ruleSemanticConstraintDeclaration ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:1: (otherlv_0= 'sconstraint' ( (lv_value_1_0= ruleSemanticConstraintDeclaration ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:1: (otherlv_0= 'sconstraint' ( (lv_value_1_0= ruleSemanticConstraintDeclaration ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:750:3: otherlv_0= 'sconstraint' ( (lv_value_1_0= ruleSemanticConstraintDeclaration ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSemanticConstraintType1836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSemanticConstraintTypeAccess().getSconstraintKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: ( (lv_value_1_0= ruleSemanticConstraintDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: (lv_value_1_0= ruleSemanticConstraintDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: (lv_value_1_0= ruleSemanticConstraintDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:3: lv_value_1_0= ruleSemanticConstraintDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSemanticConstraintTypeAccess().getValueSemanticConstraintDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSemanticConstraintDeclaration_in_ruleSemanticConstraintType1857);
            lv_value_1_0=ruleSemanticConstraintDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSemanticConstraintTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SemanticConstraintDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSemanticConstraintType1869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSemanticConstraintTypeAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSemanticConstraintType"


    // $ANTLR start "entryRuleSemanticConstraintDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:1: entryRuleSemanticConstraintDeclaration returns [EObject current=null] : iv_ruleSemanticConstraintDeclaration= ruleSemanticConstraintDeclaration EOF ;
    public final EObject entryRuleSemanticConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticConstraintDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:2: (iv_ruleSemanticConstraintDeclaration= ruleSemanticConstraintDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:2: iv_ruleSemanticConstraintDeclaration= ruleSemanticConstraintDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticConstraintDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSemanticConstraintDeclaration_in_entryRuleSemanticConstraintDeclaration1905);
            iv_ruleSemanticConstraintDeclaration=ruleSemanticConstraintDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemanticConstraintDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemanticConstraintDeclaration1915); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:1: ruleSemanticConstraintDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) ) ;
    public final EObject ruleSemanticConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:798:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:798:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSemanticConstraintDeclaration1957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSemanticConstraintDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSemanticConstraintDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSemanticConstraintDeclaration1974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSemanticConstraintDeclarationAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:1: ( (lv_expression_2_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:1: (lv_expression_2_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:1: (lv_expression_2_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:3: lv_expression_2_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleSemanticConstraintDeclaration1995);
            lv_expression_2_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSemanticConstraintDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"LogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSemanticConstraintDeclaration"


    // $ANTLR start "entryRuleTransitionConstraintType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:845:1: entryRuleTransitionConstraintType returns [EObject current=null] : iv_ruleTransitionConstraintType= ruleTransitionConstraintType EOF ;
    public final EObject entryRuleTransitionConstraintType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionConstraintType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:846:2: (iv_ruleTransitionConstraintType= ruleTransitionConstraintType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:847:2: iv_ruleTransitionConstraintType= ruleTransitionConstraintType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionConstraintTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionConstraintType_in_entryRuleTransitionConstraintType2031);
            iv_ruleTransitionConstraintType=ruleTransitionConstraintType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionConstraintType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionConstraintType2041); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionConstraintType"


    // $ANTLR start "ruleTransitionConstraintType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: ruleTransitionConstraintType returns [EObject current=null] : ( ( (lv_label_0_0= 'tconstraint' ) ) ( (lv_value_1_0= ruleTransitionConstraintDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleTransitionConstraintType() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:857:28: ( ( ( (lv_label_0_0= 'tconstraint' ) ) ( (lv_value_1_0= ruleTransitionConstraintDeclaration ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:1: ( ( (lv_label_0_0= 'tconstraint' ) ) ( (lv_value_1_0= ruleTransitionConstraintDeclaration ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:1: ( ( (lv_label_0_0= 'tconstraint' ) ) ( (lv_value_1_0= ruleTransitionConstraintDeclaration ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:2: ( (lv_label_0_0= 'tconstraint' ) ) ( (lv_value_1_0= ruleTransitionConstraintDeclaration ) ) otherlv_2= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:2: ( (lv_label_0_0= 'tconstraint' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:1: (lv_label_0_0= 'tconstraint' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:1: (lv_label_0_0= 'tconstraint' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:3: lv_label_0_0= 'tconstraint'
            {
            lv_label_0_0=(Token)match(input,23,FOLLOW_23_in_ruleTransitionConstraintType2084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_label_0_0, grammarAccess.getTransitionConstraintTypeAccess().getLabelTconstraintKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionConstraintTypeRule());
              	        }
                     		setWithLastConsumed(current, "label", lv_label_0_0, "tconstraint");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:2: ( (lv_value_1_0= ruleTransitionConstraintDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:1: (lv_value_1_0= ruleTransitionConstraintDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:1: (lv_value_1_0= ruleTransitionConstraintDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:3: lv_value_1_0= ruleTransitionConstraintDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionConstraintTypeAccess().getValueTransitionConstraintDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionConstraintDeclaration_in_ruleTransitionConstraintType2118);
            lv_value_1_0=ruleTransitionConstraintDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionConstraintTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"TransitionConstraintDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTransitionConstraintType2130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionConstraintTypeAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTransitionConstraintType"


    // $ANTLR start "entryRuleTransitionConstraintDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:903:1: entryRuleTransitionConstraintDeclaration returns [EObject current=null] : iv_ruleTransitionConstraintDeclaration= ruleTransitionConstraintDeclaration EOF ;
    public final EObject entryRuleTransitionConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionConstraintDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:904:2: (iv_ruleTransitionConstraintDeclaration= ruleTransitionConstraintDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:2: iv_ruleTransitionConstraintDeclaration= ruleTransitionConstraintDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionConstraintDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionConstraintDeclaration_in_entryRuleTransitionConstraintDeclaration2166);
            iv_ruleTransitionConstraintDeclaration=ruleTransitionConstraintDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionConstraintDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionConstraintDeclaration2176); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: ruleTransitionConstraintDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'pre' ( (lv_left_3_0= ruleLogicExpression ) ) otherlv_4= 'post' ( (lv_right_5_0= ruleLogicExpression ) ) ) ;
    public final EObject ruleTransitionConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_3_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'pre' ( (lv_left_3_0= ruleLogicExpression ) ) otherlv_4= 'post' ( (lv_right_5_0= ruleLogicExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'pre' ( (lv_left_3_0= ruleLogicExpression ) ) otherlv_4= 'post' ( (lv_right_5_0= ruleLogicExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'pre' ( (lv_left_3_0= ruleLogicExpression ) ) otherlv_4= 'post' ( (lv_right_5_0= ruleLogicExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'pre' ( (lv_left_3_0= ruleLogicExpression ) ) otherlv_4= 'post' ( (lv_right_5_0= ruleLogicExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionConstraintDeclaration2218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTransitionConstraintDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionConstraintDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTransitionConstraintDeclaration2235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransitionConstraintDeclarationAccess().getColonEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTransitionConstraintDeclaration2247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionConstraintDeclarationAccess().getPreKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:1: ( (lv_left_3_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:1: (lv_left_3_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:1: (lv_left_3_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:3: lv_left_3_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftLogicExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration2268);
            lv_left_3_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionConstraintDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_3_0, 
                      		"LogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTransitionConstraintDeclaration2280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTransitionConstraintDeclarationAccess().getPostKeyword_4());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: ( (lv_right_5_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_right_5_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_right_5_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:3: lv_right_5_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionConstraintDeclarationAccess().getRightLogicExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration2301);
            lv_right_5_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionConstraintDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_5_0, 
                      		"LogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTransitionConstraintDeclaration"


    // $ANTLR start "entryRuleExceptionType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:1: entryRuleExceptionType returns [EObject current=null] : iv_ruleExceptionType= ruleExceptionType EOF ;
    public final EObject entryRuleExceptionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:2: (iv_ruleExceptionType= ruleExceptionType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:2: iv_ruleExceptionType= ruleExceptionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionType_in_entryRuleExceptionType2337);
            iv_ruleExceptionType=ruleExceptionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionType2347); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExceptionType"


    // $ANTLR start "ruleExceptionType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:999:1: ruleExceptionType returns [EObject current=null] : ( ( (lv_label_0_0= 'exception' ) ) ( (lv_value_1_0= ruleExceptionDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleExceptionType() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:28: ( ( ( (lv_label_0_0= 'exception' ) ) ( (lv_value_1_0= ruleExceptionDeclaration ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: ( ( (lv_label_0_0= 'exception' ) ) ( (lv_value_1_0= ruleExceptionDeclaration ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: ( ( (lv_label_0_0= 'exception' ) ) ( (lv_value_1_0= ruleExceptionDeclaration ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:2: ( (lv_label_0_0= 'exception' ) ) ( (lv_value_1_0= ruleExceptionDeclaration ) ) otherlv_2= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:2: ( (lv_label_0_0= 'exception' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:1: (lv_label_0_0= 'exception' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:1: (lv_label_0_0= 'exception' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1005:3: lv_label_0_0= 'exception'
            {
            lv_label_0_0=(Token)match(input,26,FOLLOW_26_in_ruleExceptionType2390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_label_0_0, grammarAccess.getExceptionTypeAccess().getLabelExceptionKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExceptionTypeRule());
              	        }
                     		setWithLastConsumed(current, "label", lv_label_0_0, "exception");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:2: ( (lv_value_1_0= ruleExceptionDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: (lv_value_1_0= ruleExceptionDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: (lv_value_1_0= ruleExceptionDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:3: lv_value_1_0= ruleExceptionDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExceptionTypeAccess().getValueExceptionDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleExceptionType2424);
            lv_value_1_0=ruleExceptionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExceptionTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ExceptionDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExceptionType2436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExceptionTypeAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionType"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1048:1: entryRuleExceptionDeclaration returns [EObject current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final EObject entryRuleExceptionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration2472);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration2482); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1057:1: ruleExceptionDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) ) ;
    public final EObject ruleExceptionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleLogicExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionDeclaration2524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExceptionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExceptionDeclaration2541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExceptionDeclarationAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:1: ( (lv_expression_2_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (lv_expression_2_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (lv_expression_2_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:3: lv_expression_2_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleExceptionDeclaration2562);
            lv_expression_2_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExceptionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"LogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleScopeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1111:1: entryRuleScopeType returns [EObject current=null] : iv_ruleScopeType= ruleScopeType EOF ;
    public final EObject entryRuleScopeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:2: (iv_ruleScopeType= ruleScopeType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:2: iv_ruleScopeType= ruleScopeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleScopeType_in_entryRuleScopeType2600);
            iv_ruleScopeType=ruleScopeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeType2610); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScopeType"


    // $ANTLR start "ruleScopeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: ruleScopeType returns [EObject current=null] : ( ( (lv_label_0_0= 'scope' ) ) ( (lv_value_1_0= ruleScopeDeclaration ) ) ) ;
    public final EObject ruleScopeType() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:28: ( ( ( (lv_label_0_0= 'scope' ) ) ( (lv_value_1_0= ruleScopeDeclaration ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:1: ( ( (lv_label_0_0= 'scope' ) ) ( (lv_value_1_0= ruleScopeDeclaration ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:1: ( ( (lv_label_0_0= 'scope' ) ) ( (lv_value_1_0= ruleScopeDeclaration ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:2: ( (lv_label_0_0= 'scope' ) ) ( (lv_value_1_0= ruleScopeDeclaration ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:2: ( (lv_label_0_0= 'scope' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: (lv_label_0_0= 'scope' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: (lv_label_0_0= 'scope' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:3: lv_label_0_0= 'scope'
            {
            lv_label_0_0=(Token)match(input,27,FOLLOW_27_in_ruleScopeType2653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_label_0_0, grammarAccess.getScopeTypeAccess().getLabelScopeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScopeTypeRule());
              	        }
                     		setWithLastConsumed(current, "label", lv_label_0_0, "scope");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:2: ( (lv_value_1_0= ruleScopeDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1140:1: (lv_value_1_0= ruleScopeDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1140:1: (lv_value_1_0= ruleScopeDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1141:3: lv_value_1_0= ruleScopeDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScopeTypeAccess().getValueScopeDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopeDeclaration_in_ruleScopeType2687);
            lv_value_1_0=ruleScopeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScopeTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ScopeDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScopeType"


    // $ANTLR start "entryRuleScopeDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1166:2: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1167:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleScopeDeclaration_in_entryRuleScopeDeclaration2723);
            iv_ruleScopeDeclaration=ruleScopeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeDeclaration2733); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:1: ruleScopeDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'handle' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_handlers_6_0= ruleHandlerDeclaration ) )+ otherlv_7= '}' ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_handlers_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1177:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'handle' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_handlers_6_0= ruleHandlerDeclaration ) )+ otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'handle' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_handlers_6_0= ruleHandlerDeclaration ) )+ otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'handle' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_handlers_6_0= ruleHandlerDeclaration ) )+ otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'handle' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_handlers_6_0= ruleHandlerDeclaration ) )+ otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopeDeclaration2775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getScopeDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScopeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleScopeDeclaration2792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScopeDeclarationAccess().getHandleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleScopeDeclaration2804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getScopeDeclarationRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopeDeclaration2824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getScopeDeclarationAccess().getExceptionExceptionDeclarationCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleScopeDeclaration2836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getScopeDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleScopeDeclaration2848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getScopeDeclarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:1: ( (lv_handlers_6_0= ruleHandlerDeclaration ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: (lv_handlers_6_0= ruleHandlerDeclaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: (lv_handlers_6_0= ruleHandlerDeclaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:3: lv_handlers_6_0= ruleHandlerDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeDeclarationAccess().getHandlersHandlerDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHandlerDeclaration_in_ruleScopeDeclaration2869);
            	    lv_handlers_6_0=ruleHandlerDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"handlers",
            	              		lv_handlers_6_0, 
            	              		"HandlerDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleScopeDeclaration2882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getScopeDeclarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScopeDeclaration"


    // $ANTLR start "entryRuleHandlerDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1255:1: entryRuleHandlerDeclaration returns [EObject current=null] : iv_ruleHandlerDeclaration= ruleHandlerDeclaration EOF ;
    public final EObject entryRuleHandlerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1256:2: (iv_ruleHandlerDeclaration= ruleHandlerDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:2: iv_ruleHandlerDeclaration= ruleHandlerDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHandlerDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleHandlerDeclaration_in_entryRuleHandlerDeclaration2918);
            iv_ruleHandlerDeclaration=ruleHandlerDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHandlerDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerDeclaration2928); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: ruleHandlerDeclaration returns [EObject current=null] : (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= 'catch' otherlv_5= '{' ( (lv_actions_6_0= ruleActionDeclaration ) )+ otherlv_7= '}' ( (lv_propagation_8_0= rulePropagationDeclaration ) )? ) ;
    public final EObject ruleHandlerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_propagation_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:28: ( (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= 'catch' otherlv_5= '{' ( (lv_actions_6_0= ruleActionDeclaration ) )+ otherlv_7= '}' ( (lv_propagation_8_0= rulePropagationDeclaration ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= 'catch' otherlv_5= '{' ( (lv_actions_6_0= ruleActionDeclaration ) )+ otherlv_7= '}' ( (lv_propagation_8_0= rulePropagationDeclaration ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= 'catch' otherlv_5= '{' ( (lv_actions_6_0= ruleActionDeclaration ) )+ otherlv_7= '}' ( (lv_propagation_8_0= rulePropagationDeclaration ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:3: otherlv_0= 'case' otherlv_1= '(' ( (lv_expression_2_0= ruleLogicExpression ) ) otherlv_3= ')' otherlv_4= 'catch' otherlv_5= '{' ( (lv_actions_6_0= ruleActionDeclaration ) )+ otherlv_7= '}' ( (lv_propagation_8_0= rulePropagationDeclaration ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleHandlerDeclaration2965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHandlerDeclarationAccess().getCaseKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleHandlerDeclaration2977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHandlerDeclarationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1276:1: ( (lv_expression_2_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1277:1: (lv_expression_2_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1277:1: (lv_expression_2_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1278:3: lv_expression_2_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHandlerDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleHandlerDeclaration2998);
            lv_expression_2_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHandlerDeclaration3010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHandlerDeclarationAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleHandlerDeclaration3022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getHandlerDeclarationAccess().getCatchKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleHandlerDeclaration3034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHandlerDeclarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:1: ( (lv_actions_6_0= ruleActionDeclaration ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: (lv_actions_6_0= ruleActionDeclaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: (lv_actions_6_0= ruleActionDeclaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:3: lv_actions_6_0= ruleActionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHandlerDeclarationAccess().getActionsActionDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActionDeclaration_in_ruleHandlerDeclaration3055);
            	    lv_actions_6_0=ruleActionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHandlerDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_6_0, 
            	              		"ActionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleHandlerDeclaration3068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getHandlerDeclarationAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:1: ( (lv_propagation_8_0= rulePropagationDeclaration ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34||LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1329:1: (lv_propagation_8_0= rulePropagationDeclaration )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1329:1: (lv_propagation_8_0= rulePropagationDeclaration )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1330:3: lv_propagation_8_0= rulePropagationDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHandlerDeclarationAccess().getPropagationPropagationDeclarationParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropagationDeclaration_in_ruleHandlerDeclaration3089);
                    lv_propagation_8_0=rulePropagationDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHandlerDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"propagation",
                              		lv_propagation_8_0, 
                              		"PropagationDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHandlerDeclaration"


    // $ANTLR start "entryRuleActionDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:1: entryRuleActionDeclaration returns [EObject current=null] : iv_ruleActionDeclaration= ruleActionDeclaration EOF ;
    public final EObject entryRuleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1355:2: (iv_ruleActionDeclaration= ruleActionDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:2: iv_ruleActionDeclaration= ruleActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration3126);
            iv_ruleActionDeclaration=ruleActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDeclaration3136); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:1: ruleActionDeclaration returns [EObject current=null] : (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:28: ( (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:1: (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:1: (otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:3: otherlv_0= 'do' ( (lv_expression_1_0= ruleLogicExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleActionDeclaration3173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getActionDeclarationAccess().getDoKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:1: ( (lv_expression_1_0= ruleLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:1: (lv_expression_1_0= ruleLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:1: (lv_expression_1_0= ruleLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:3: lv_expression_1_0= ruleLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_ruleActionDeclaration3194);
            lv_expression_1_0=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleActionDeclaration3206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActionDeclarationAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleActionDeclaration"


    // $ANTLR start "entryRulePropagationDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1401:1: entryRulePropagationDeclaration returns [EObject current=null] : iv_rulePropagationDeclaration= rulePropagationDeclaration EOF ;
    public final EObject entryRulePropagationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropagationDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1402:2: (iv_rulePropagationDeclaration= rulePropagationDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1403:2: iv_rulePropagationDeclaration= rulePropagationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropagationDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropagationDeclaration_in_entryRulePropagationDeclaration3242);
            iv_rulePropagationDeclaration=rulePropagationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropagationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropagationDeclaration3252); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropagationDeclaration"


    // $ANTLR start "rulePropagationDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1410:1: rulePropagationDeclaration returns [EObject current=null] : (this_SignalDeclaration_0= ruleSignalDeclaration | this_RaiseDeclaration_1= ruleRaiseDeclaration ) ;
    public final EObject rulePropagationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDeclaration_0 = null;

        EObject this_RaiseDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1413:28: ( (this_SignalDeclaration_0= ruleSignalDeclaration | this_RaiseDeclaration_1= ruleRaiseDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1414:1: (this_SignalDeclaration_0= ruleSignalDeclaration | this_RaiseDeclaration_1= ruleRaiseDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1414:1: (this_SignalDeclaration_0= ruleSignalDeclaration | this_RaiseDeclaration_1= ruleRaiseDeclaration )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==36) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1415:5: this_SignalDeclaration_0= ruleSignalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropagationDeclarationAccess().getSignalDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalDeclaration_in_rulePropagationDeclaration3299);
                    this_SignalDeclaration_0=ruleSignalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SignalDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1425:5: this_RaiseDeclaration_1= ruleRaiseDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropagationDeclarationAccess().getRaiseDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRaiseDeclaration_in_rulePropagationDeclaration3326);
                    this_RaiseDeclaration_1=ruleRaiseDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RaiseDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropagationDeclaration"


    // $ANTLR start "entryRuleSignalDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration3361);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration3371); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignalDeclaration"


    // $ANTLR start "ruleSignalDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1450:1: ruleSignalDeclaration returns [EObject current=null] : (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1453:28: ( (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:1: (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:1: (otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:3: otherlv_0= 'signal' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSignalDeclaration3408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSignalDeclarationAccess().getSignalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSignalDeclaration3420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSignalDeclarationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1462:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1464:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalDeclarationRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDeclaration3440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSignalDeclarationAccess().getExceptionExceptionDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleSignalDeclaration3452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDeclarationAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleSignalDeclaration3464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSignalDeclarationAccess().getToKeyword_4());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1483:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1484:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1484:1: (otherlv_5= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1485:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalDeclarationRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDeclaration3484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getSignalDeclarationAccess().getScopeScopeDeclarationCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleSignalDeclaration3496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSignalDeclarationAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSignalDeclaration"


    // $ANTLR start "entryRuleRaiseDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1508:1: entryRuleRaiseDeclaration returns [EObject current=null] : iv_ruleRaiseDeclaration= ruleRaiseDeclaration EOF ;
    public final EObject entryRuleRaiseDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:2: (iv_ruleRaiseDeclaration= ruleRaiseDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:2: iv_ruleRaiseDeclaration= ruleRaiseDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRaiseDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRaiseDeclaration_in_entryRuleRaiseDeclaration3532);
            iv_ruleRaiseDeclaration=ruleRaiseDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRaiseDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRaiseDeclaration3542); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRaiseDeclaration"


    // $ANTLR start "ruleRaiseDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:1: ruleRaiseDeclaration returns [EObject current=null] : (otherlv_0= 'raise' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleRaiseDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:28: ( (otherlv_0= 'raise' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:1: (otherlv_0= 'raise' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:1: (otherlv_0= 'raise' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:3: otherlv_0= 'raise' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRaiseDeclaration3579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRaiseDeclarationAccess().getRaiseKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleRaiseDeclaration3591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRaiseDeclarationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1529:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRaiseDeclarationRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRaiseDeclaration3611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getRaiseDeclarationAccess().getExceptionExceptionDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleRaiseDeclaration3623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRaiseDeclarationAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRaiseDeclaration3635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRaiseDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRaiseDeclaration"


    // $ANTLR start "entryRulePropertyType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:2: (iv_rulePropertyType= rulePropertyType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:2: iv_rulePropertyType= rulePropertyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_rulePropertyType_in_entryRulePropertyType3671);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyType3681); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1567:1: rulePropertyType returns [EObject current=null] : ( ( (lv_label_0_0= 'spec' ) ) ( (lv_value_1_0= rulePropertyDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:28: ( ( ( (lv_label_0_0= 'spec' ) ) ( (lv_value_1_0= rulePropertyDeclaration ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:1: ( ( (lv_label_0_0= 'spec' ) ) ( (lv_value_1_0= rulePropertyDeclaration ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:1: ( ( (lv_label_0_0= 'spec' ) ) ( (lv_value_1_0= rulePropertyDeclaration ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:2: ( (lv_label_0_0= 'spec' ) ) ( (lv_value_1_0= rulePropertyDeclaration ) ) otherlv_2= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:2: ( (lv_label_0_0= 'spec' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1572:1: (lv_label_0_0= 'spec' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1572:1: (lv_label_0_0= 'spec' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1573:3: lv_label_0_0= 'spec'
            {
            lv_label_0_0=(Token)match(input,37,FOLLOW_37_in_rulePropertyType3724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_label_0_0, grammarAccess.getPropertyTypeAccess().getLabelSpecKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyTypeRule());
              	        }
                     		setWithLastConsumed(current, "label", lv_label_0_0, "spec");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1586:2: ( (lv_value_1_0= rulePropertyDeclaration ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1587:1: (lv_value_1_0= rulePropertyDeclaration )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1587:1: (lv_value_1_0= rulePropertyDeclaration )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1588:3: lv_value_1_0= rulePropertyDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyTypeAccess().getValuePropertyDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyDeclaration_in_rulePropertyType3758);
            lv_value_1_0=rulePropertyDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"PropertyDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePropertyType3770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyTypeAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:1: entryRulePropertyDeclaration returns [EObject current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final EObject entryRulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDeclaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1617:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1618:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration3806);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration3816); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1625:1: rulePropertyDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleTemporalLogicExpression ) ) ) ;
    public final EObject rulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1628:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleTemporalLogicExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleTemporalLogicExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleTemporalLogicExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleTemporalLogicExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1630:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1630:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyDeclaration3858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulePropertyDeclaration3875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyDeclarationAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: ( (lv_expression_2_0= ruleTemporalLogicExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:1: (lv_expression_2_0= ruleTemporalLogicExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:1: (lv_expression_2_0= ruleTemporalLogicExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1653:3: lv_expression_2_0= ruleTemporalLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getExpressionTemporalLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_rulePropertyDeclaration3896);
            lv_expression_2_0=ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"TemporalLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyDeclaration"


    // $ANTLR start "entryRuleLogicExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1677:1: entryRuleLogicExpression returns [EObject current=null] : iv_ruleLogicExpression= ruleLogicExpression EOF ;
    public final EObject entryRuleLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:2: (iv_ruleLogicExpression= ruleLogicExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:2: iv_ruleLogicExpression= ruleLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicExpression_in_entryRuleLogicExpression3932);
            iv_ruleLogicExpression=ruleLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExpression3942); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1686:1: ruleLogicExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:28: (this_OrExpression_0= ruleOrExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:5: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicExpressionAccess().getOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleLogicExpression3988);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogicExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression4022);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression4032); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1716:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression4079);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:2: ()
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1730:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:2: ( (lv_op_2_0= '||' ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:1: (lv_op_2_0= '||' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:1: (lv_op_2_0= '||' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,38,FOLLOW_38_in_ruleOrExpression4106); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1750:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1752:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression4140);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1776:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1777:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1778:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression4178);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression4188); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:5: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression4235);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:2: ()
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1804:2: ( (lv_op_2_0= '&&' ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:1: (lv_op_2_0= '&&' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,39,FOLLOW_39_in_ruleAndExpression4262); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:2: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1820:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1820:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1821:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression4296);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1845:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1846:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression4334);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression4344); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1857:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1859:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression4391);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:1: ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=40 && LA16_0<=41)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:2: () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:2: ()
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1868:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1873:2: ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1875:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1875:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==40) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==41) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1876:3: lv_op_2_1= '->'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_40_in_ruleRelationalExpression4420); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:8: lv_op_2_2= '<->'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_41_in_ruleRelationalExpression4449); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: (lv_right_3_0= ruleAdditiveExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1905:3: lv_right_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression4486);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1929:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1930:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1931:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression4524);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression4534); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1938:1: ruleAdditiveExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_expr_2_0 = null;

        EObject this_PrimaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:28: ( ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||LA17_0==29||(LA17_0>=44 && LA17_0<=46)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:3: () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= rulePrimaryExpression ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:2: ( (lv_op_1_0= '!' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:1: (lv_op_1_0= '!' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:1: (lv_op_1_0= '!' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1950:3: lv_op_1_0= '!'
                    {
                    lv_op_1_0=(Token)match(input,42,FOLLOW_42_in_ruleAdditiveExpression4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_1_0, grammarAccess.getAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_1_0, "!");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:2: ( (lv_expr_2_0= rulePrimaryExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: (lv_expr_2_0= rulePrimaryExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: (lv_expr_2_0= rulePrimaryExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1965:3: lv_expr_2_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExprPrimaryExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression4621);
                    lv_expr_2_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1983:5: this_PrimaryExpression_3= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression4650);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1999:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2000:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2001:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4685);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4695); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2008:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2011:28: ( ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2012:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2012:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' ) | ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case 45:
            case 46:
                {
                alt19=3;
                }
                break;
            case 44:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2012:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2012:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2012:4: otherlv_0= '(' ( (lv_expr_1_0= ruleLogicExpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression4733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:1: ( (lv_expr_1_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:1: (lv_expr_1_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:1: (lv_expr_1_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:3: lv_expr_1_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExprLogicExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4754);
                    lv_expr_1_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression4766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2039:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2039:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2040:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:6: ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:6: ( ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:7: ( (lv_opBin_4_0= ruleBINARYOPERATOR ) ) otherlv_5= '(' ( (lv_left_6_0= ruleLogicExpression ) ) otherlv_7= ',' ( (lv_right_8_0= ruleLogicExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:7: ( (lv_opBin_4_0= ruleBINARYOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:1: (lv_opBin_4_0= ruleBINARYOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:1: (lv_opBin_4_0= ruleBINARYOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2055:3: lv_opBin_4_0= ruleBINARYOPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBINARYOPERATOR_in_rulePrimaryExpression4821);
                    lv_opBin_4_0=ruleBINARYOPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression4833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:1: ( (lv_left_6_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:1: (lv_left_6_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:1: (lv_left_6_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:3: lv_left_6_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4854);
                    lv_left_6_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_rulePrimaryExpression4866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_3());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2097:1: ( (lv_right_8_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2098:1: (lv_right_8_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2098:1: (lv_right_8_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2099:3: lv_right_8_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4887);
                    lv_right_8_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression4899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_5());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:6: ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:6: ( ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:7: ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) ) otherlv_11= '(' ( (lv_args_12_0= ruleLogicExpression ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+ otherlv_15= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:7: ( (lv_opMul_10_0= ruleMULTIPLEOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2121:1: (lv_opMul_10_0= ruleMULTIPLEOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2121:1: (lv_opMul_10_0= ruleMULTIPLEOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2122:3: lv_opMul_10_0= ruleMULTIPLEOPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMULTIPLEOPERATOR_in_rulePrimaryExpression4928);
                    lv_opMul_10_0=ruleMULTIPLEOPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression4940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2142:1: ( (lv_args_12_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2143:1: (lv_args_12_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2143:1: (lv_args_12_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2144:3: lv_args_12_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4961);
                    lv_args_12_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:2: (otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:4: otherlv_13= ',' ( (lv_args_14_0= ruleLogicExpression ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_19_in_rulePrimaryExpression4974); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_3_3_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2164:1: ( (lv_args_14_0= ruleLogicExpression ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2165:1: (lv_args_14_0= ruleLogicExpression )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2165:1: (lv_args_14_0= ruleLogicExpression )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2166:3: lv_args_14_0= ruleLogicExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_3_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4995);
                    	    lv_args_14_0=ruleLogicExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression5009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleTemporalLogicExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2194:1: entryRuleTemporalLogicExpression returns [EObject current=null] : iv_ruleTemporalLogicExpression= ruleTemporalLogicExpression EOF ;
    public final EObject entryRuleTemporalLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalLogicExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:2: (iv_ruleTemporalLogicExpression= ruleTemporalLogicExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:2: iv_ruleTemporalLogicExpression= ruleTemporalLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalLogicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalLogicExpression_in_entryRuleTemporalLogicExpression5046);
            iv_ruleTemporalLogicExpression=ruleTemporalLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalLogicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalLogicExpression5056); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2203:1: ruleTemporalLogicExpression returns [EObject current=null] : this_TemporalOrExpression_0= ruleTemporalOrExpression ;
    public final EObject ruleTemporalLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TemporalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:28: (this_TemporalOrExpression_0= ruleTemporalOrExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2208:5: this_TemporalOrExpression_0= ruleTemporalOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemporalLogicExpressionAccess().getTemporalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleTemporalOrExpression_in_ruleTemporalLogicExpression5102);
            this_TemporalOrExpression_0=ruleTemporalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TemporalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalLogicExpression"


    // $ANTLR start "entryRuleTemporalOrExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2224:1: entryRuleTemporalOrExpression returns [EObject current=null] : iv_ruleTemporalOrExpression= ruleTemporalOrExpression EOF ;
    public final EObject entryRuleTemporalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalOrExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2225:2: (iv_ruleTemporalOrExpression= ruleTemporalOrExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2226:2: iv_ruleTemporalOrExpression= ruleTemporalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalOrExpression_in_entryRuleTemporalOrExpression5136);
            iv_ruleTemporalOrExpression=ruleTemporalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalOrExpression5146); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:1: ruleTemporalOrExpression returns [EObject current=null] : (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* ) ;
    public final EObject ruleTemporalOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TemporalAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2236:28: ( (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2237:1: (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2237:1: (this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2238:5: this_TemporalAndExpression_0= ruleTemporalAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemporalOrExpressionAccess().getTemporalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression5193);
            this_TemporalAndExpression_0=ruleTemporalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TemporalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2246:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2246:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleTemporalAndExpression ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2246:2: ()
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2247:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2252:2: ( (lv_op_2_0= '||' ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:1: (lv_op_2_0= '||' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:1: (lv_op_2_0= '||' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,38,FOLLOW_38_in_ruleTemporalOrExpression5220); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getTemporalOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTemporalOrExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:2: ( (lv_right_3_0= ruleTemporalAndExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:1: (lv_right_3_0= ruleTemporalAndExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:1: (lv_right_3_0= ruleTemporalAndExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:3: lv_right_3_0= ruleTemporalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemporalOrExpressionAccess().getRightTemporalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression5254);
            	    lv_right_3_0=ruleTemporalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalOrExpression"


    // $ANTLR start "entryRuleTemporalAndExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2293:1: entryRuleTemporalAndExpression returns [EObject current=null] : iv_ruleTemporalAndExpression= ruleTemporalAndExpression EOF ;
    public final EObject entryRuleTemporalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalAndExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: (iv_ruleTemporalAndExpression= ruleTemporalAndExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:2: iv_ruleTemporalAndExpression= ruleTemporalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalAndExpression_in_entryRuleTemporalAndExpression5292);
            iv_ruleTemporalAndExpression=ruleTemporalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalAndExpression5302); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2302:1: ruleTemporalAndExpression returns [EObject current=null] : (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* ) ;
    public final EObject ruleTemporalAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TemporalRelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2305:28: ( (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2306:1: (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2306:1: (this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2307:5: this_TemporalRelationalExpression_0= ruleTemporalRelationalExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemporalAndExpressionAccess().getTemporalRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression5349);
            this_TemporalRelationalExpression_0=ruleTemporalRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TemporalRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2315:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2315:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleTemporalRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2315:2: ()
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2316:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2321:2: ( (lv_op_2_0= '&&' ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2322:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2322:1: (lv_op_2_0= '&&' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2323:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,39,FOLLOW_39_in_ruleTemporalAndExpression5376); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getTemporalAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTemporalAndExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: ( (lv_right_3_0= ruleTemporalRelationalExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: (lv_right_3_0= ruleTemporalRelationalExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: (lv_right_3_0= ruleTemporalRelationalExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2338:3: lv_right_3_0= ruleTemporalRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemporalAndExpressionAccess().getRightTemporalRelationalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression5410);
            	    lv_right_3_0=ruleTemporalRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalAndExpression"


    // $ANTLR start "entryRuleTemporalRelationalExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2362:1: entryRuleTemporalRelationalExpression returns [EObject current=null] : iv_ruleTemporalRelationalExpression= ruleTemporalRelationalExpression EOF ;
    public final EObject entryRuleTemporalRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalRelationalExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:2: (iv_ruleTemporalRelationalExpression= ruleTemporalRelationalExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2364:2: iv_ruleTemporalRelationalExpression= ruleTemporalRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalRelationalExpression_in_entryRuleTemporalRelationalExpression5448);
            iv_ruleTemporalRelationalExpression=ruleTemporalRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalRelationalExpression5458); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2371:1: ruleTemporalRelationalExpression returns [EObject current=null] : (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* ) ;
    public final EObject ruleTemporalRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TemporalAdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:28: ( (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: (this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2376:5: this_TemporalAdditiveExpression_0= ruleTemporalAdditiveExpression ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemporalRelationalExpressionAccess().getTemporalAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression5505);
            this_TemporalAdditiveExpression_0=ruleTemporalAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TemporalAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:1: ( () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=40 && LA23_0<=41)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:2: () ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) ) ( (lv_right_3_0= ruleTemporalAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:2: ()
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2385:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2390:2: ( ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2391:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2391:1: ( (lv_op_2_1= '->' | lv_op_2_2= '<->' ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:1: (lv_op_2_1= '->' | lv_op_2_2= '<->' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==40) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==41) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:3: lv_op_2_1= '->'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_40_in_ruleTemporalRelationalExpression5534); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getTemporalRelationalExpressionAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTemporalRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:8: lv_op_2_2= '<->'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_41_in_ruleTemporalRelationalExpression5563); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getTemporalRelationalExpressionAccess().getOpLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTemporalRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2420:2: ( (lv_right_3_0= ruleTemporalAdditiveExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2421:1: (lv_right_3_0= ruleTemporalAdditiveExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2421:1: (lv_right_3_0= ruleTemporalAdditiveExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2422:3: lv_right_3_0= ruleTemporalAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemporalRelationalExpressionAccess().getRightTemporalAdditiveExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression5600);
            	    lv_right_3_0=ruleTemporalAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalRelationalExpression"


    // $ANTLR start "entryRuleTemporalAdditiveExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:1: entryRuleTemporalAdditiveExpression returns [EObject current=null] : iv_ruleTemporalAdditiveExpression= ruleTemporalAdditiveExpression EOF ;
    public final EObject entryRuleTemporalAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalAdditiveExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2447:2: (iv_ruleTemporalAdditiveExpression= ruleTemporalAdditiveExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:2: iv_ruleTemporalAdditiveExpression= ruleTemporalAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalAdditiveExpression_in_entryRuleTemporalAdditiveExpression5638);
            iv_ruleTemporalAdditiveExpression=ruleTemporalAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalAdditiveExpression5648); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:1: ruleTemporalAdditiveExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression ) ;
    public final EObject ruleTemporalAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_expr_2_0 = null;

        EObject this_TemporalPrimaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2458:28: ( ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:1: ( ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) ) | this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==29||(LA24_0>=44 && LA24_0<=54)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:2: ( () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:3: () ( (lv_op_1_0= '!' ) ) ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2460:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTemporalAdditiveExpressionAccess().getUnaryOpExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2465:2: ( (lv_op_1_0= '!' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2466:1: (lv_op_1_0= '!' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2466:1: (lv_op_1_0= '!' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2467:3: lv_op_1_0= '!'
                    {
                    lv_op_1_0=(Token)match(input,42,FOLLOW_42_in_ruleTemporalAdditiveExpression5701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_1_0, grammarAccess.getTemporalAdditiveExpressionAccess().getOpExclamationMarkKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalAdditiveExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_1_0, "!");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2480:2: ( (lv_expr_2_0= ruleTemporalPrimaryExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2481:1: (lv_expr_2_0= ruleTemporalPrimaryExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2481:1: (lv_expr_2_0= ruleTemporalPrimaryExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2482:3: lv_expr_2_0= ruleTemporalPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalAdditiveExpressionAccess().getExprTemporalPrimaryExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression5735);
                    lv_expr_2_0=ruleTemporalPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2500:5: this_TemporalPrimaryExpression_3= ruleTemporalPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemporalAdditiveExpressionAccess().getTemporalPrimaryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression5764);
                    this_TemporalPrimaryExpression_3=ruleTemporalPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TemporalPrimaryExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalAdditiveExpression"


    // $ANTLR start "entryRuleTemporalPrimaryExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2516:1: entryRuleTemporalPrimaryExpression returns [EObject current=null] : iv_ruleTemporalPrimaryExpression= ruleTemporalPrimaryExpression EOF ;
    public final EObject entryRuleTemporalPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPrimaryExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2517:2: (iv_ruleTemporalPrimaryExpression= ruleTemporalPrimaryExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2518:2: iv_ruleTemporalPrimaryExpression= ruleTemporalPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalPrimaryExpression_in_entryRuleTemporalPrimaryExpression5799);
            iv_ruleTemporalPrimaryExpression=ruleTemporalPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPrimaryExpression5809); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2525:1: ruleTemporalPrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:28: ( ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) | ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' ) | ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' ) | ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' ) | ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt26=3;
                }
                break;
            case 53:
            case 54:
                {
                alt26=4;
                }
                break;
            case 45:
            case 46:
                {
                alt26=5;
                }
                break;
            case 44:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:4: otherlv_0= '(' ( (lv_expr_1_0= ruleTemporalLogicExpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleTemporalPrimaryExpression5847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2533:1: ( (lv_expr_1_0= ruleTemporalLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2534:1: (lv_expr_1_0= ruleTemporalLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2534:1: (lv_expr_1_0= ruleTemporalLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2535:3: lv_expr_1_0= ruleTemporalLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getExprTemporalLogicExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression5868);
                    lv_expr_1_0=ruleTemporalLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleTemporalPrimaryExpression5880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemporalPrimaryExpression5907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getTemporalPrimaryExpressionAccess().getValueAbstractDeclarationCrossReference_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2570:6: ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2570:6: ( ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2570:7: ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) ) otherlv_5= '(' ( (lv_temporal_6_0= ruleTemporalLogicExpression ) ) otherlv_7= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2570:7: ( (lv_opTemp_4_0= ruleTEMPORALOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2571:1: (lv_opTemp_4_0= ruleTEMPORALOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2571:1: (lv_opTemp_4_0= ruleTEMPORALOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2572:3: lv_opTemp_4_0= ruleTEMPORALOPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempTEMPORALOPERATOREnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTEMPORALOPERATOR_in_ruleTemporalPrimaryExpression5935);
                    lv_opTemp_4_0=ruleTEMPORALOPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleTemporalPrimaryExpression5947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2592:1: ( (lv_temporal_6_0= ruleTemporalLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2593:1: (lv_temporal_6_0= ruleTemporalLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2593:1: (lv_temporal_6_0= ruleTemporalLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2594:3: lv_temporal_6_0= ruleTemporalLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalTemporalLogicExpressionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression5968);
                    lv_temporal_6_0=ruleTemporalLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleTemporalPrimaryExpression5980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2615:6: ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2615:6: ( ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2615:7: ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) ) otherlv_9= '(' ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) ) otherlv_11= 'U' ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) ) otherlv_13= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2615:7: ( (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2616:1: (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2616:1: (lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2617:3: lv_opTempUntil_8_0= ruleTEMPUNTILOPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilTEMPUNTILOPERATOREnumRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTEMPUNTILOPERATOR_in_ruleTemporalPrimaryExpression6009);
                    lv_opTempUntil_8_0=ruleTEMPUNTILOPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleTemporalPrimaryExpression6021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2637:1: ( (lv_leftExp_10_0= ruleTemporalLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2638:1: (lv_leftExp_10_0= ruleTemporalLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2638:1: (lv_leftExp_10_0= ruleTemporalLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:3: lv_leftExp_10_0= ruleTemporalLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpTemporalLogicExpressionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression6042);
                    lv_leftExp_10_0=ruleTemporalLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleTemporalPrimaryExpression6054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTemporalPrimaryExpressionAccess().getUKeyword_3_3());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2659:1: ( (lv_rightExp_12_0= ruleTemporalLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2660:1: (lv_rightExp_12_0= ruleTemporalLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2660:1: (lv_rightExp_12_0= ruleTemporalLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2661:3: lv_rightExp_12_0= ruleTemporalLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpTemporalLogicExpressionParserRuleCall_3_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression6075);
                    lv_rightExp_12_0=ruleTemporalLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleTemporalPrimaryExpression6087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_3_5());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:6: ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:6: ( ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:7: ( (lv_opBin_14_0= ruleBINARYOPERATOR ) ) otherlv_15= '(' ( (lv_left_16_0= ruleLogicExpression ) ) otherlv_17= ',' ( (lv_right_18_0= ruleLogicExpression ) ) otherlv_19= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:7: ( (lv_opBin_14_0= ruleBINARYOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2683:1: (lv_opBin_14_0= ruleBINARYOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2683:1: (lv_opBin_14_0= ruleBINARYOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2684:3: lv_opBin_14_0= ruleBINARYOPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinBINARYOPERATOREnumRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBINARYOPERATOR_in_ruleTemporalPrimaryExpression6116);
                    lv_opBin_14_0=ruleBINARYOPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleTemporalPrimaryExpression6128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:1: ( (lv_left_16_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:1: (lv_left_16_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:1: (lv_left_16_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2706:3: lv_left_16_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftLogicExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6149);
                    lv_left_16_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleTemporalPrimaryExpression6161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_4_3());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2726:1: ( (lv_right_18_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2727:1: (lv_right_18_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2727:1: (lv_right_18_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2728:3: lv_right_18_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getRightLogicExpressionParserRuleCall_4_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6182);
                    lv_right_18_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_19=(Token)match(input,30,FOLLOW_30_in_ruleTemporalPrimaryExpression6194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_4_5());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:6: ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:6: ( ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:7: ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) ) otherlv_21= '(' ( (lv_args_22_0= ruleLogicExpression ) ) (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+ otherlv_25= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2749:7: ( (lv_opMul_20_0= ruleMULTIPLEOPERATOR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2750:1: (lv_opMul_20_0= ruleMULTIPLEOPERATOR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2750:1: (lv_opMul_20_0= ruleMULTIPLEOPERATOR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2751:3: lv_opMul_20_0= ruleMULTIPLEOPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulMULTIPLEOPERATOREnumRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMULTIPLEOPERATOR_in_ruleTemporalPrimaryExpression6223);
                    lv_opMul_20_0=ruleMULTIPLEOPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_29_in_ruleTemporalPrimaryExpression6235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getTemporalPrimaryExpressionAccess().getLeftParenthesisKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2771:1: ( (lv_args_22_0= ruleLogicExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:1: (lv_args_22_0= ruleLogicExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:1: (lv_args_22_0= ruleLogicExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2773:3: lv_args_22_0= ruleLogicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6256);
                    lv_args_22_0=ruleLogicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:2: (otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:4: otherlv_23= ',' ( (lv_args_24_0= ruleLogicExpression ) )
                    	    {
                    	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleTemporalPrimaryExpression6269); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_23, grammarAccess.getTemporalPrimaryExpressionAccess().getCommaKeyword_5_3_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:1: ( (lv_args_24_0= ruleLogicExpression ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:1: (lv_args_24_0= ruleLogicExpression )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:1: (lv_args_24_0= ruleLogicExpression )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:3: lv_args_24_0= ruleLogicExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsLogicExpressionParserRuleCall_5_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6290);
                    	    lv_args_24_0=ruleLogicExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    otherlv_25=(Token)match(input,30,FOLLOW_30_in_ruleTemporalPrimaryExpression6304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getTemporalPrimaryExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalPrimaryExpression"


    // $ANTLR start "ruleMULTIPLEOPERATOR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2823:1: ruleMULTIPLEOPERATOR returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleMULTIPLEOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2825:28: ( (enumLiteral_0= 'xor' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2826:1: (enumLiteral_0= 'xor' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2826:1: (enumLiteral_0= 'xor' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2826:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleMULTIPLEOPERATOR6354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getMULTIPLEOPERATORAccess().getXorEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLEOPERATORAccess().getXorEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMULTIPLEOPERATOR"


    // $ANTLR start "ruleBINARYOPERATOR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2836:1: ruleBINARYOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) ) ;
    public final Enumerator ruleBINARYOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2838:28: ( ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:1: ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:1: ( (enumLiteral_0= 'nor' ) | (enumLiteral_1= 'nand' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:2: (enumLiteral_0= 'nor' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:2: (enumLiteral_0= 'nor' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:4: enumLiteral_0= 'nor'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleBINARYOPERATOR6398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBINARYOPERATORAccess().getNorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBINARYOPERATORAccess().getNorEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:6: (enumLiteral_1= 'nand' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:6: (enumLiteral_1= 'nand' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:8: enumLiteral_1= 'nand'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleBINARYOPERATOR6415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBINARYOPERATORAccess().getNandEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBINARYOPERATORAccess().getNandEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBINARYOPERATOR"


    // $ANTLR start "ruleTEMPORALOPERATOR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2855:1: ruleTEMPORALOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2857:28: ( ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2858:1: ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2858:1: ( (enumLiteral_0= 'EX' ) | (enumLiteral_1= 'EG' ) | (enumLiteral_2= 'EF' ) | (enumLiteral_3= 'AX' ) | (enumLiteral_4= 'AG' ) | (enumLiteral_5= 'AF' ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt28=1;
                }
                break;
            case 48:
                {
                alt28=2;
                }
                break;
            case 49:
                {
                alt28=3;
                }
                break;
            case 50:
                {
                alt28=4;
                }
                break;
            case 51:
                {
                alt28=5;
                }
                break;
            case 52:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2858:2: (enumLiteral_0= 'EX' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2858:2: (enumLiteral_0= 'EX' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2858:4: enumLiteral_0= 'EX'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleTEMPORALOPERATOR6460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPORALOPERATORAccess().getEXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTEMPORALOPERATORAccess().getEXEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2864:6: (enumLiteral_1= 'EG' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2864:6: (enumLiteral_1= 'EG' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2864:8: enumLiteral_1= 'EG'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleTEMPORALOPERATOR6477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPORALOPERATORAccess().getEGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTEMPORALOPERATORAccess().getEGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:6: (enumLiteral_2= 'EF' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:6: (enumLiteral_2= 'EF' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:8: enumLiteral_2= 'EF'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleTEMPORALOPERATOR6494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPORALOPERATORAccess().getEFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTEMPORALOPERATORAccess().getEFEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2876:6: (enumLiteral_3= 'AX' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2876:6: (enumLiteral_3= 'AX' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2876:8: enumLiteral_3= 'AX'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleTEMPORALOPERATOR6511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPORALOPERATORAccess().getAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTEMPORALOPERATORAccess().getAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:6: (enumLiteral_4= 'AG' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:6: (enumLiteral_4= 'AG' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:8: enumLiteral_4= 'AG'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_51_in_ruleTEMPORALOPERATOR6528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPORALOPERATORAccess().getAGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getTEMPORALOPERATORAccess().getAGEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2888:6: (enumLiteral_5= 'AF' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2888:6: (enumLiteral_5= 'AF' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2888:8: enumLiteral_5= 'AF'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_52_in_ruleTEMPORALOPERATOR6545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPORALOPERATORAccess().getAFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getTEMPORALOPERATORAccess().getAFEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTEMPORALOPERATOR"


    // $ANTLR start "ruleTEMPUNTILOPERATOR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2898:1: ruleTEMPUNTILOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) ) ;
    public final Enumerator ruleTEMPUNTILOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:28: ( ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:1: ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:1: ( (enumLiteral_0= 'E' ) | (enumLiteral_1= 'A' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            else if ( (LA29_0==54) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:2: (enumLiteral_0= 'E' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:2: (enumLiteral_0= 'E' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:4: enumLiteral_0= 'E'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleTEMPUNTILOPERATOR6590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPUNTILOPERATORAccess().getEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTEMPUNTILOPERATORAccess().getEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2907:6: (enumLiteral_1= 'A' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2907:6: (enumLiteral_1= 'A' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2907:8: enumLiteral_1= 'A'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleTEMPUNTILOPERATOR6607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTEMPUNTILOPERATORAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTEMPUNTILOPERATORAccess().getAEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTEMPUNTILOPERATOR"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:3: ( '.' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:2: '.'
        {
        match(input,11,FOLLOW_11_in_synpred1_InternalMyDsl356); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // Delegated rules

    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName337 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName381 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport496 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImport508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard603 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemDeclaration674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSystemDeclaration711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemDeclaration728 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSystemDeclaration745 = new BitSet(new long[]{0x000000200CD60000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleSystemDeclaration766 = new BitSet(new long[]{0x000000200CD60000L});
    public static final BitSet FOLLOW_17_in_ruleSystemDeclaration779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionType_in_ruleDeclaration872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationType_in_ruleDeclaration899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintType_in_ruleDeclaration926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintType_in_ruleDeclaration953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionType_in_ruleDeclaration980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeType_in_ruleDeclaration1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_ruleDeclaration1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionType_in_entryRulePropositionType1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionType1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionList_in_rulePropositionType1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionSingle_in_rulePropositionType1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionList_in_entryRulePropositionList1188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionList1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePropositionList1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rulePropositionList1256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePropositionList1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rulePropositionList1290 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_rulePropositionList1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionSingle_in_entryRulePropositionSingle1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionSingle1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePropositionSingle1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_rulePropositionSingle1408 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePropositionSingle1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionDeclaration_in_entryRulePropositionDeclaration1456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropositionDeclaration1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropositionDeclaration1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationType_in_entryRuleSituationType1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituationType1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSituationType1594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSituationDeclaration_in_ruleSituationType1615 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSituationType1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSituationDeclaration_in_entryRuleSituationDeclaration1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituationDeclaration1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSituationDeclaration1715 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSituationDeclaration1732 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleSituationDeclaration1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintType_in_entryRuleSemanticConstraintType1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemanticConstraintType1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSemanticConstraintType1836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSemanticConstraintDeclaration_in_ruleSemanticConstraintType1857 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSemanticConstraintType1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemanticConstraintDeclaration_in_entryRuleSemanticConstraintDeclaration1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemanticConstraintDeclaration1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSemanticConstraintDeclaration1957 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSemanticConstraintDeclaration1974 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleSemanticConstraintDeclaration1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintType_in_entryRuleTransitionConstraintType2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionConstraintType2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTransitionConstraintType2084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransitionConstraintDeclaration_in_ruleTransitionConstraintType2118 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransitionConstraintType2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionConstraintDeclaration_in_entryRuleTransitionConstraintDeclaration2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionConstraintDeclaration2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionConstraintDeclaration2218 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransitionConstraintDeclaration2235 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTransitionConstraintDeclaration2247 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration2268 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransitionConstraintDeclaration2280 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTransitionConstraintDeclaration2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionType_in_entryRuleExceptionType2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionType2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleExceptionType2390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleExceptionType2424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExceptionType2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration2472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionDeclaration2524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExceptionDeclaration2541 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleExceptionDeclaration2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeType_in_entryRuleScopeType2600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeType2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleScopeType2653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleScopeDeclaration_in_ruleScopeType2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDeclaration_in_entryRuleScopeDeclaration2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeDeclaration2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopeDeclaration2775 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleScopeDeclaration2792 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScopeDeclaration2804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopeDeclaration2824 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleScopeDeclaration2836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScopeDeclaration2848 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleHandlerDeclaration_in_ruleScopeDeclaration2869 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleScopeDeclaration2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDeclaration_in_entryRuleHandlerDeclaration2918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDeclaration2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleHandlerDeclaration2965 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleHandlerDeclaration2977 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleHandlerDeclaration2998 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHandlerDeclaration3010 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleHandlerDeclaration3022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHandlerDeclaration3034 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_ruleHandlerDeclaration3055 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_17_in_ruleHandlerDeclaration3068 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_rulePropagationDeclaration_in_ruleHandlerDeclaration3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDeclaration3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleActionDeclaration3173 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleActionDeclaration3194 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActionDeclaration3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropagationDeclaration_in_entryRulePropagationDeclaration3242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropagationDeclaration3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_rulePropagationDeclaration3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRaiseDeclaration_in_rulePropagationDeclaration3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSignalDeclaration3408 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSignalDeclaration3420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDeclaration3440 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSignalDeclaration3452 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSignalDeclaration3464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDeclaration3484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSignalDeclaration3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRaiseDeclaration_in_entryRuleRaiseDeclaration3532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRaiseDeclaration3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRaiseDeclaration3579 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRaiseDeclaration3591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRaiseDeclaration3611 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRaiseDeclaration3623 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRaiseDeclaration3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_entryRulePropertyType3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyType3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePropertyType3724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rulePropertyType3758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePropertyType3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDeclaration3858 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePropertyDeclaration3875 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_rulePropertyDeclaration3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_entryRuleLogicExpression3932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExpression3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicExpression3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4079 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleOrExpression4106 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4140 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression4235 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleAndExpression4262 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression4296 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression4334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression4391 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleRelationalExpression4420 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_41_in_ruleRelationalExpression4449 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression4486 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression4524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAdditiveExpression4587 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAdditiveExpression4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression4733 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4754 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARYOPERATOR_in_rulePrimaryExpression4821 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression4833 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4854 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression4866 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4887 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLEOPERATOR_in_rulePrimaryExpression4928 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression4940 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4961 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression4974 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_rulePrimaryExpression4995 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_entryRuleTemporalLogicExpression5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalLogicExpression5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalOrExpression_in_ruleTemporalLogicExpression5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalOrExpression_in_entryRuleTemporalOrExpression5136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalOrExpression5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression5193 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleTemporalOrExpression5220 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_ruleTemporalOrExpression5254 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleTemporalAndExpression_in_entryRuleTemporalAndExpression5292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalAndExpression5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression5349 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleTemporalAndExpression5376 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_ruleTemporalAndExpression5410 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleTemporalRelationalExpression_in_entryRuleTemporalRelationalExpression5448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalRelationalExpression5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression5505 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleTemporalRelationalExpression5534 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_41_in_ruleTemporalRelationalExpression5563 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_ruleTemporalRelationalExpression5600 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleTemporalAdditiveExpression_in_entryRuleTemporalAdditiveExpression5638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalAdditiveExpression5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTemporalAdditiveExpression5701 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_ruleTemporalAdditiveExpression5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPrimaryExpression_in_entryRuleTemporalPrimaryExpression5799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPrimaryExpression5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTemporalPrimaryExpression5847 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression5868 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTemporalPrimaryExpression5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemporalPrimaryExpression5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEMPORALOPERATOR_in_ruleTemporalPrimaryExpression5935 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemporalPrimaryExpression5947 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression5968 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTemporalPrimaryExpression5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEMPUNTILOPERATOR_in_ruleTemporalPrimaryExpression6009 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemporalPrimaryExpression6021 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression6042 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTemporalPrimaryExpression6054 = new BitSet(new long[]{0x007FF40020000010L});
    public static final BitSet FOLLOW_ruleTemporalLogicExpression_in_ruleTemporalPrimaryExpression6075 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTemporalPrimaryExpression6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARYOPERATOR_in_ruleTemporalPrimaryExpression6116 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemporalPrimaryExpression6128 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTemporalPrimaryExpression6161 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6182 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTemporalPrimaryExpression6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLEOPERATOR_in_ruleTemporalPrimaryExpression6223 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemporalPrimaryExpression6235 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTemporalPrimaryExpression6269 = new BitSet(new long[]{0x0000740020000010L});
    public static final BitSet FOLLOW_ruleLogicExpression_in_ruleTemporalPrimaryExpression6290 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleTemporalPrimaryExpression6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMULTIPLEOPERATOR6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBINARYOPERATOR6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBINARYOPERATOR6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTEMPORALOPERATOR6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTEMPORALOPERATOR6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTEMPORALOPERATOR6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTEMPORALOPERATOR6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTEMPORALOPERATOR6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTEMPORALOPERATOR6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTEMPUNTILOPERATOR6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTEMPUNTILOPERATOR6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred1_InternalMyDsl356 = new BitSet(new long[]{0x0000000000000002L});

}