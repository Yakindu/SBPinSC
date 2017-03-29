package com.yakindu.sct.domain.scenario.parser.antlr.internal; 

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
import com.yakindu.sct.domain.scenario.services.ScenarioTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScenarioTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL", "RULE_INT", "RULE_DOUBLE", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'blocks'", "'{'", "'}'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "':'", "'internal'", "'import'", "'.'", "'event'", "'const'", "'var'", "'readonly'", "'external'", "'='", "'alias'", "'operation'", "'('", "','", "')'", "'<'", "'>'", "'...'", "'/'", "'#'", "'['", "']'", "'default'", "'else'", "';'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'local'", "'in'", "'out'", "'?'", "'as'", "'null'", "'&&'", "'||'", "'!'", "'^'", "'|'", "'&'", "'after'", "'every'", "'s'", "'ms'", "'us'", "'ns'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<='", "'>='", "'=='", "'!='"
    };
    public static final int RULE_HEX=9;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BOOL=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalScenarioTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScenarioTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScenarioTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScenarioText.g"; }



     	private ScenarioTextGrammarAccess grammarAccess;
     	
        public InternalScenarioTextParser(TokenStream input, ScenarioTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateScope";	
       	}
       	
       	@Override
       	protected ScenarioTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateScope"
    // InternalScenarioText.g:68:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // InternalScenarioText.g:69:2: (iv_ruleStateScope= ruleStateScope EOF )
            // InternalScenarioText.g:70:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateScope"


    // $ANTLR start "ruleStateScope"
    // InternalScenarioText.g:77:1: ruleStateScope returns [EObject current=null] : ( () ( (lv_scenarios_1_0= ruleBlockScenario ) )* ( (lv_reactions_2_0= ruleLocalReaction ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_scenarios_1_0 = null;

        EObject lv_reactions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:80:28: ( ( () ( (lv_scenarios_1_0= ruleBlockScenario ) )* ( (lv_reactions_2_0= ruleLocalReaction ) )* ) )
            // InternalScenarioText.g:81:1: ( () ( (lv_scenarios_1_0= ruleBlockScenario ) )* ( (lv_reactions_2_0= ruleLocalReaction ) )* )
            {
            // InternalScenarioText.g:81:1: ( () ( (lv_scenarios_1_0= ruleBlockScenario ) )* ( (lv_reactions_2_0= ruleLocalReaction ) )* )
            // InternalScenarioText.g:81:2: () ( (lv_scenarios_1_0= ruleBlockScenario ) )* ( (lv_reactions_2_0= ruleLocalReaction ) )*
            {
            // InternalScenarioText.g:81:2: ()
            // InternalScenarioText.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getStatScopeAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:87:2: ( (lv_scenarios_1_0= ruleBlockScenario ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScenarioText.g:88:1: (lv_scenarios_1_0= ruleBlockScenario )
            	    {
            	    // InternalScenarioText.g:88:1: (lv_scenarios_1_0= ruleBlockScenario )
            	    // InternalScenarioText.g:89:3: lv_scenarios_1_0= ruleBlockScenario
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateScopeAccess().getScenariosBlockScenarioParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_scenarios_1_0=ruleBlockScenario();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scenarios",
            	              		lv_scenarios_1_0, 
            	              		"com.yakindu.sct.domain.scenario.ScenarioText.BlockScenario");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalScenarioText.g:105:3: ( (lv_reactions_2_0= ruleLocalReaction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==43||(LA2_0>=48 && LA2_0<=51)||(LA2_0>=67 && LA2_0<=68)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScenarioText.g:106:1: (lv_reactions_2_0= ruleLocalReaction )
            	    {
            	    // InternalScenarioText.g:106:1: (lv_reactions_2_0= ruleLocalReaction )
            	    // InternalScenarioText.g:107:3: lv_reactions_2_0= ruleLocalReaction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateScopeAccess().getReactionsLocalReactionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_reactions_2_0=ruleLocalReaction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"reactions",
            	              		lv_reactions_2_0, 
            	              		"org.yakindu.sct.model.stext.SText.LocalReaction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleBlockScenario"
    // InternalScenarioText.g:131:1: entryRuleBlockScenario returns [EObject current=null] : iv_ruleBlockScenario= ruleBlockScenario EOF ;
    public final EObject entryRuleBlockScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockScenario = null;


        try {
            // InternalScenarioText.g:132:2: (iv_ruleBlockScenario= ruleBlockScenario EOF )
            // InternalScenarioText.g:133:2: iv_ruleBlockScenario= ruleBlockScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockScenarioRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockScenario=ruleBlockScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockScenario; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockScenario"


    // $ANTLR start "ruleBlockScenario"
    // InternalScenarioText.g:140:1: ruleBlockScenario returns [EObject current=null] : (otherlv_0= 'blocks' otherlv_1= '{' ( ( ruleQID ) )+ otherlv_3= '}' ) ;
    public final EObject ruleBlockScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:143:28: ( (otherlv_0= 'blocks' otherlv_1= '{' ( ( ruleQID ) )+ otherlv_3= '}' ) )
            // InternalScenarioText.g:144:1: (otherlv_0= 'blocks' otherlv_1= '{' ( ( ruleQID ) )+ otherlv_3= '}' )
            {
            // InternalScenarioText.g:144:1: (otherlv_0= 'blocks' otherlv_1= '{' ( ( ruleQID ) )+ otherlv_3= '}' )
            // InternalScenarioText.g:144:3: otherlv_0= 'blocks' otherlv_1= '{' ( ( ruleQID ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBlockScenarioAccess().getBlocksKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockScenarioAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalScenarioText.g:152:1: ( ( ruleQID ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalScenarioText.g:153:1: ( ruleQID )
            	    {
            	    // InternalScenarioText.g:153:1: ( ruleQID )
            	    // InternalScenarioText.g:154:3: ruleQID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getBlockScenarioRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockScenarioAccess().getEventsEventCrossReference_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleQID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBlockScenarioAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleBlockScenario"


    // $ANTLR start "entryRuleDefRoot"
    // InternalScenarioText.g:181:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // InternalScenarioText.g:182:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // InternalScenarioText.g:183:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefRoot"


    // $ANTLR start "ruleDefRoot"
    // InternalScenarioText.g:190:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:193:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // InternalScenarioText.g:194:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // InternalScenarioText.g:194:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalScenarioText.g:195:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StatechartRoot_0=ruleStatechartRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatechartRoot_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:205:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StateRoot_1=ruleStateRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateRoot_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:215:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TransitionRoot_2=ruleTransitionRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionRoot_2; 
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
    // $ANTLR end "ruleDefRoot"


    // $ANTLR start "entryRuleStatechartRoot"
    // InternalScenarioText.g:231:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // InternalScenarioText.g:232:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // InternalScenarioText.g:233:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatechartRoot"


    // $ANTLR start "ruleStatechartRoot"
    // InternalScenarioText.g:240:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:243:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // InternalScenarioText.g:244:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // InternalScenarioText.g:244:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // InternalScenarioText.g:244:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // InternalScenarioText.g:248:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // InternalScenarioText.g:249:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // InternalScenarioText.g:249:1: (lv_def_1_0= ruleStatechartSpecification )
            // InternalScenarioText.g:250:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_def_1_0=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatechartRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"org.yakindu.sct.model.stext.SText.StatechartSpecification");
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
    // $ANTLR end "ruleStatechartRoot"


    // $ANTLR start "entryRuleStateRoot"
    // InternalScenarioText.g:274:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // InternalScenarioText.g:275:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // InternalScenarioText.g:276:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateRoot"


    // $ANTLR start "ruleStateRoot"
    // InternalScenarioText.g:283:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:286:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // InternalScenarioText.g:287:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // InternalScenarioText.g:287:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // InternalScenarioText.g:287:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // InternalScenarioText.g:291:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // InternalScenarioText.g:292:1: (lv_def_1_0= ruleStateSpecification )
            {
            // InternalScenarioText.g:292:1: (lv_def_1_0= ruleStateSpecification )
            // InternalScenarioText.g:293:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_def_1_0=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"org.yakindu.sct.model.stext.SText.StateSpecification");
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
    // $ANTLR end "ruleStateRoot"


    // $ANTLR start "entryRuleTransitionRoot"
    // InternalScenarioText.g:317:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // InternalScenarioText.g:318:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // InternalScenarioText.g:319:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionRoot"


    // $ANTLR start "ruleTransitionRoot"
    // InternalScenarioText.g:326:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:329:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // InternalScenarioText.g:330:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // InternalScenarioText.g:330:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // InternalScenarioText.g:330:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // InternalScenarioText.g:334:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // InternalScenarioText.g:335:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // InternalScenarioText.g:335:1: (lv_def_1_0= ruleTransitionSpecification )
            // InternalScenarioText.g:336:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_def_1_0=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"org.yakindu.sct.model.stext.SText.TransitionSpecification");
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
    // $ANTLR end "ruleTransitionRoot"


    // $ANTLR start "entryRuleStatechartSpecification"
    // InternalScenarioText.g:362:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // InternalScenarioText.g:363:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // InternalScenarioText.g:364:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatechartSpecification"


    // $ANTLR start "ruleStatechartSpecification"
    // InternalScenarioText.g:371:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:374:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // InternalScenarioText.g:375:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // InternalScenarioText.g:375:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // InternalScenarioText.g:375:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // InternalScenarioText.g:375:2: ()
            // InternalScenarioText.g:376:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:381:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScenarioText.g:381:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // InternalScenarioText.g:385:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // InternalScenarioText.g:386:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // InternalScenarioText.g:386:1: (lv_namespace_2_0= ruleFQN )
                    // InternalScenarioText.g:387:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_12);
                    lv_namespace_2_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatechartSpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"namespace",
                              		lv_namespace_2_0, 
                              		"org.yakindu.sct.model.stext.SText.FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalScenarioText.g:403:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||(LA6_0>=24 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScenarioText.g:404:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // InternalScenarioText.g:404:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // InternalScenarioText.g:405:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_scopes_3_0=ruleStatechartScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatechartSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_3_0, 
            	              		"org.yakindu.sct.model.stext.SText.StatechartScope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleStateSpecification"
    // InternalScenarioText.g:429:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // InternalScenarioText.g:430:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // InternalScenarioText.g:431:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateSpecification"


    // $ANTLR start "ruleStateSpecification"
    // InternalScenarioText.g:438:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:441:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // InternalScenarioText.g:442:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // InternalScenarioText.g:442:1: ( (lv_scope_0_0= ruleStateScope ) )
            // InternalScenarioText.g:443:1: (lv_scope_0_0= ruleStateScope )
            {
            // InternalScenarioText.g:443:1: (lv_scope_0_0= ruleStateScope )
            // InternalScenarioText.g:444:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_scope_0_0=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"scope",
                      		lv_scope_0_0, 
                      		"com.yakindu.sct.domain.scenario.ScenarioText.StateScope");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleStateSpecification"


    // $ANTLR start "entryRuleTransitionSpecification"
    // InternalScenarioText.g:468:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // InternalScenarioText.g:469:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // InternalScenarioText.g:470:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionSpecification"


    // $ANTLR start "ruleTransitionSpecification"
    // InternalScenarioText.g:477:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:480:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // InternalScenarioText.g:481:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // InternalScenarioText.g:481:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // InternalScenarioText.g:482:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // InternalScenarioText.g:482:1: (lv_reaction_0_0= ruleTransitionReaction )
            // InternalScenarioText.g:483:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_reaction_0_0=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"reaction",
                      		lv_reaction_0_0, 
                      		"org.yakindu.sct.model.stext.SText.TransitionReaction");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTransitionSpecification"


    // $ANTLR start "entryRuleStatechartScope"
    // InternalScenarioText.g:509:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // InternalScenarioText.g:510:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // InternalScenarioText.g:511:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatechartScope"


    // $ANTLR start "ruleStatechartScope"
    // InternalScenarioText.g:518:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope | this_ImportScope_2= ruleImportScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;

        EObject this_ImportScope_2 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:521:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope | this_ImportScope_2= ruleImportScope ) )
            // InternalScenarioText.g:522:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope | this_ImportScope_2= ruleImportScope )
            {
            // InternalScenarioText.g:522:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope | this_ImportScope_2= ruleImportScope )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalScenarioText.g:523:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceScope_0=ruleInterfaceScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceScope_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:533:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_InternalScope_1=ruleInternalScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InternalScope_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:543:5: this_ImportScope_2= ruleImportScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getImportScopeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportScope_2=ruleImportScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImportScope_2; 
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
    // $ANTLR end "ruleStatechartScope"


    // $ANTLR start "entryRuleInterfaceScope"
    // InternalScenarioText.g:561:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // InternalScenarioText.g:562:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // InternalScenarioText.g:563:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceScope"


    // $ANTLR start "ruleInterfaceScope"
    // InternalScenarioText.g:570:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) ) )* ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;

        EObject lv_declarations_4_4 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:573:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) ) )* ) )
            // InternalScenarioText.g:574:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) ) )* )
            {
            // InternalScenarioText.g:574:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) ) )* )
            // InternalScenarioText.g:574:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) ) )*
            {
            // InternalScenarioText.g:574:2: ()
            // InternalScenarioText.g:575:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // InternalScenarioText.g:584:1: ( (lv_name_2_0= ruleXID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=21 && LA8_0<=22)||LA8_0==24||LA8_0==27||(LA8_0>=29 && LA8_0<=31)||LA8_0==34||(LA8_0>=45 && LA8_0<=46)||(LA8_0>=48 && LA8_0<=57)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalScenarioText.g:585:1: (lv_name_2_0= ruleXID )
                    {
                    // InternalScenarioText.g:585:1: (lv_name_2_0= ruleXID )
                    // InternalScenarioText.g:586:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_name_2_0=ruleXID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"org.yakindu.sct.model.stext.SText.XID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // InternalScenarioText.g:606:1: ( ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=27 && LA10_0<=29)||(LA10_0>=33 && LA10_0<=34)||(LA10_0>=55 && LA10_0<=57)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalScenarioText.g:607:1: ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) )
            	    {
            	    // InternalScenarioText.g:607:1: ( (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition ) )
            	    // InternalScenarioText.g:608:1: (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition )
            	    {
            	    // InternalScenarioText.g:608:1: (lv_declarations_4_1= ruleEventDefinition | lv_declarations_4_2= ruleVariableDefinition | lv_declarations_4_3= ruleTypeAliasDefinition | lv_declarations_4_4= ruleOperationDefinition )
            	    int alt9=4;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	    case 55:
            	    case 56:
            	    case 57:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 28:
            	    case 29:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // InternalScenarioText.g:609:3: lv_declarations_4_1= ruleEventDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDefinitionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_15);
            	            lv_declarations_4_1=ruleEventDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_1, 
            	                      		"org.yakindu.sct.model.stext.SText.EventDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScenarioText.g:624:8: lv_declarations_4_2= ruleVariableDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDefinitionParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_15);
            	            lv_declarations_4_2=ruleVariableDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_2, 
            	                      		"org.yakindu.sct.model.stext.SText.VariableDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScenarioText.g:639:8: lv_declarations_4_3= ruleTypeAliasDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsTypeAliasDefinitionParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_15);
            	            lv_declarations_4_3=ruleTypeAliasDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_3, 
            	                      		"org.yakindu.sct.model.stext.SText.TypeAliasDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalScenarioText.g:654:8: lv_declarations_4_4= ruleOperationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDefinitionParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_15);
            	            lv_declarations_4_4=ruleOperationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_4, 
            	                      		"org.yakindu.sct.model.stext.SText.OperationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // InternalScenarioText.g:680:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // InternalScenarioText.g:681:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // InternalScenarioText.g:682:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInternalScope"


    // $ANTLR start "ruleInternalScope"
    // InternalScenarioText.g:689:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) ) | ( (lv_reactions_4_0= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleInternalScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_declarations_3_1 = null;

        EObject lv_declarations_3_2 = null;

        EObject lv_declarations_3_3 = null;

        EObject lv_declarations_3_4 = null;

        EObject lv_reactions_4_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:692:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) ) | ( (lv_reactions_4_0= ruleLocalReaction ) ) )* ) )
            // InternalScenarioText.g:693:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) ) | ( (lv_reactions_4_0= ruleLocalReaction ) ) )* )
            {
            // InternalScenarioText.g:693:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) ) | ( (lv_reactions_4_0= ruleLocalReaction ) ) )* )
            // InternalScenarioText.g:693:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) ) | ( (lv_reactions_4_0= ruleLocalReaction ) ) )*
            {
            // InternalScenarioText.g:693:2: ()
            // InternalScenarioText.g:694:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // InternalScenarioText.g:707:1: ( ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) ) | ( (lv_reactions_4_0= ruleLocalReaction ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=29)||(LA12_0>=33 && LA12_0<=34)||(LA12_0>=55 && LA12_0<=57)) ) {
                    alt12=1;
                }
                else if ( (LA12_0==RULE_ID||LA12_0==43||(LA12_0>=48 && LA12_0<=51)||(LA12_0>=67 && LA12_0<=68)) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalScenarioText.g:707:2: ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) )
            	    {
            	    // InternalScenarioText.g:707:2: ( ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) ) )
            	    // InternalScenarioText.g:708:1: ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) )
            	    {
            	    // InternalScenarioText.g:708:1: ( (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition ) )
            	    // InternalScenarioText.g:709:1: (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition )
            	    {
            	    // InternalScenarioText.g:709:1: (lv_declarations_3_1= ruleEventDefinition | lv_declarations_3_2= ruleVariableDefinition | lv_declarations_3_3= ruleOperationDefinition | lv_declarations_3_4= ruleTypeAliasDefinition )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	    case 55:
            	    case 56:
            	    case 57:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 28:
            	    case 29:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalScenarioText.g:710:3: lv_declarations_3_1= ruleEventDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDefinitionParserRuleCall_3_0_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_16);
            	            lv_declarations_3_1=ruleEventDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_1, 
            	                      		"org.yakindu.sct.model.stext.SText.EventDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScenarioText.g:725:8: lv_declarations_3_2= ruleVariableDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDefinitionParserRuleCall_3_0_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_16);
            	            lv_declarations_3_2=ruleVariableDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_2, 
            	                      		"org.yakindu.sct.model.stext.SText.VariableDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScenarioText.g:740:8: lv_declarations_3_3= ruleOperationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDefinitionParserRuleCall_3_0_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_16);
            	            lv_declarations_3_3=ruleOperationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_3, 
            	                      		"org.yakindu.sct.model.stext.SText.OperationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalScenarioText.g:755:8: lv_declarations_3_4= ruleTypeAliasDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsTypeAliasDefinitionParserRuleCall_3_0_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_16);
            	            lv_declarations_3_4=ruleTypeAliasDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_4, 
            	                      		"org.yakindu.sct.model.stext.SText.TypeAliasDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalScenarioText.g:774:6: ( (lv_reactions_4_0= ruleLocalReaction ) )
            	    {
            	    // InternalScenarioText.g:774:6: ( (lv_reactions_4_0= ruleLocalReaction ) )
            	    // InternalScenarioText.g:775:1: (lv_reactions_4_0= ruleLocalReaction )
            	    {
            	    // InternalScenarioText.g:775:1: (lv_reactions_4_0= ruleLocalReaction )
            	    // InternalScenarioText.g:776:3: lv_reactions_4_0= ruleLocalReaction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInternalScopeAccess().getReactionsLocalReactionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_reactions_4_0=ruleLocalReaction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"reactions",
            	              		lv_reactions_4_0, 
            	              		"org.yakindu.sct.model.stext.SText.LocalReaction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleImportScope"
    // InternalScenarioText.g:800:1: entryRuleImportScope returns [EObject current=null] : iv_ruleImportScope= ruleImportScope EOF ;
    public final EObject entryRuleImportScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportScope = null;


        try {
            // InternalScenarioText.g:801:2: (iv_ruleImportScope= ruleImportScope EOF )
            // InternalScenarioText.g:802:2: iv_ruleImportScope= ruleImportScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportScope=ruleImportScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportScope"


    // $ANTLR start "ruleImportScope"
    // InternalScenarioText.g:809:1: ruleImportScope returns [EObject current=null] : ( () otherlv_1= 'import' otherlv_2= ':' ( ( ruleQID ) )* ) ;
    public final EObject ruleImportScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:812:28: ( ( () otherlv_1= 'import' otherlv_2= ':' ( ( ruleQID ) )* ) )
            // InternalScenarioText.g:813:1: ( () otherlv_1= 'import' otherlv_2= ':' ( ( ruleQID ) )* )
            {
            // InternalScenarioText.g:813:1: ( () otherlv_1= 'import' otherlv_2= ':' ( ( ruleQID ) )* )
            // InternalScenarioText.g:813:2: () otherlv_1= 'import' otherlv_2= ':' ( ( ruleQID ) )*
            {
            // InternalScenarioText.g:813:2: ()
            // InternalScenarioText.g:814:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImportScopeAccess().getImportScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportScopeAccess().getImportKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportScopeAccess().getColonKeyword_2());
                  
            }
            // InternalScenarioText.g:827:1: ( ( ruleQID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalScenarioText.g:828:1: ( ruleQID )
            	    {
            	    // InternalScenarioText.g:828:1: ( ruleQID )
            	    // InternalScenarioText.g:829:3: ruleQID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getImportScopeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImportScopeAccess().getImportsPackageCrossReference_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
            	    ruleQID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleImportScope"


    // $ANTLR start "entryRuleQID"
    // InternalScenarioText.g:850:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // InternalScenarioText.g:851:2: (iv_ruleQID= ruleQID EOF )
            // InternalScenarioText.g:852:2: iv_ruleQID= ruleQID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQID=ruleQID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // InternalScenarioText.g:859:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:862:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalScenarioText.g:863:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalScenarioText.g:863:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalScenarioText.g:863:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalScenarioText.g:870:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalScenarioText.g:871:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQID"


    // $ANTLR start "entryRuleEventDefinition"
    // InternalScenarioText.g:893:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // InternalScenarioText.g:894:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // InternalScenarioText.g:895:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventDefinition"


    // $ANTLR start "ruleEventDefinition"
    // InternalScenarioText.g:902:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:905:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )? ) )
            // InternalScenarioText.g:906:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )? )
            {
            // InternalScenarioText.g:906:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )? )
            // InternalScenarioText.g:906:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )?
            {
            // InternalScenarioText.g:906:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=55 && LA15_0<=57)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalScenarioText.g:907:1: (lv_direction_0_0= ruleDirection )
                    {
                    // InternalScenarioText.g:907:1: (lv_direction_0_0= ruleDirection )
                    // InternalScenarioText.g:908:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_direction_0_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_0_0, 
                              		"org.yakindu.sct.model.stext.SText.Direction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // InternalScenarioText.g:928:1: ( (lv_name_2_0= ruleXID ) )
            // InternalScenarioText.g:929:1: (lv_name_2_0= ruleXID )
            {
            // InternalScenarioText.g:929:1: (lv_name_2_0= ruleXID )
            // InternalScenarioText.g:930:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.yakindu.sct.model.stext.SText.XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:946:2: (otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalScenarioText.g:946:4: otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // InternalScenarioText.g:950:1: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )
                    // InternalScenarioText.g:951:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    {
                    // InternalScenarioText.g:951:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    // InternalScenarioText.g:952:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeSpecifierTypeSpecifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_typeSpecifier_4_0=ruleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_4_0, 
                              		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleEventDefinition"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalScenarioText.g:976:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalScenarioText.g:977:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalScenarioText.g:978:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalScenarioText.g:985:1: ruleVariableDefinition returns [EObject current=null] : ( () ( ( (lv_const_1_0= 'const' ) ) | otherlv_2= 'var' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_6_0= ruleXID ) ) otherlv_7= ':' ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) ) (otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token otherlv_2=null;
        Token lv_readonly_4_0=null;
        Token lv_external_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_typeSpecifier_8_0 = null;

        EObject lv_initialValue_10_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:988:28: ( ( () ( ( (lv_const_1_0= 'const' ) ) | otherlv_2= 'var' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_6_0= ruleXID ) ) otherlv_7= ':' ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) ) (otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) ) )? ) )
            // InternalScenarioText.g:989:1: ( () ( ( (lv_const_1_0= 'const' ) ) | otherlv_2= 'var' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_6_0= ruleXID ) ) otherlv_7= ':' ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) ) (otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) ) )? )
            {
            // InternalScenarioText.g:989:1: ( () ( ( (lv_const_1_0= 'const' ) ) | otherlv_2= 'var' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_6_0= ruleXID ) ) otherlv_7= ':' ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) ) (otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) ) )? )
            // InternalScenarioText.g:989:2: () ( ( (lv_const_1_0= 'const' ) ) | otherlv_2= 'var' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_6_0= ruleXID ) ) otherlv_7= ':' ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) ) (otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) ) )?
            {
            // InternalScenarioText.g:989:2: ()
            // InternalScenarioText.g:990:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:995:2: ( ( (lv_const_1_0= 'const' ) ) | otherlv_2= 'var' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
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
                    // InternalScenarioText.g:995:3: ( (lv_const_1_0= 'const' ) )
                    {
                    // InternalScenarioText.g:995:3: ( (lv_const_1_0= 'const' ) )
                    // InternalScenarioText.g:996:1: (lv_const_1_0= 'const' )
                    {
                    // InternalScenarioText.g:996:1: (lv_const_1_0= 'const' )
                    // InternalScenarioText.g:997:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,28,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDefinitionAccess().getConstConstKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:1011:7: otherlv_2= 'var'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // InternalScenarioText.g:1015:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) ) )
            // InternalScenarioText.g:1017:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) )
            {
            // InternalScenarioText.g:1017:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* ) )
            // InternalScenarioText.g:1018:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // InternalScenarioText.g:1021:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )* )
            // InternalScenarioText.g:1022:3: ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )*
            {
            // InternalScenarioText.g:1022:3: ( ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    int LA18_2 = input.LA(2);

                    if ( ( LA18_2 == RULE_ID || LA18_2 >= 21 && LA18_2 <= 22 || LA18_2 == 24 || LA18_2 == 27 || LA18_2 >= 29 && LA18_2 <= 31 || LA18_2 == 34 || LA18_2 >= 45 && LA18_2 <= 46 || LA18_2 >= 48 && LA18_2 <= 57 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==31) ) {
                    int LA18_3 = input.LA(2);

                    if ( ( LA18_3 == RULE_ID || LA18_3 >= 21 && LA18_3 <= 22 || LA18_3 == 24 || LA18_3 == 27 || LA18_3 >= 29 && LA18_3 <= 31 || LA18_3 == 34 || LA18_3 >= 45 && LA18_3 <= 46 || LA18_3 >= 48 && LA18_3 <= 57 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
                        alt18=2;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalScenarioText.g:1024:4: ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) )
            	    {
            	    // InternalScenarioText.g:1024:4: ({...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) ) )
            	    // InternalScenarioText.g:1025:5: {...}? => ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalScenarioText.g:1025:115: ( ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) ) )
            	    // InternalScenarioText.g:1026:6: ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // InternalScenarioText.g:1029:6: ({...}? => ( (lv_readonly_4_0= 'readonly' ) ) )
            	    // InternalScenarioText.g:1029:7: {...}? => ( (lv_readonly_4_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // InternalScenarioText.g:1029:16: ( (lv_readonly_4_0= 'readonly' ) )
            	    // InternalScenarioText.g:1030:1: (lv_readonly_4_0= 'readonly' )
            	    {
            	    // InternalScenarioText.g:1030:1: (lv_readonly_4_0= 'readonly' )
            	    // InternalScenarioText.g:1031:3: lv_readonly_4_0= 'readonly'
            	    {
            	    lv_readonly_4_0=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_readonly_4_0, grammarAccess.getVariableDefinitionAccess().getReadonlyReadonlyKeyword_2_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "readonly", true, "readonly");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalScenarioText.g:1051:4: ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) )
            	    {
            	    // InternalScenarioText.g:1051:4: ({...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) ) )
            	    // InternalScenarioText.g:1052:5: {...}? => ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalScenarioText.g:1052:115: ( ({...}? => ( (lv_external_5_0= 'external' ) ) ) )
            	    // InternalScenarioText.g:1053:6: ({...}? => ( (lv_external_5_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // InternalScenarioText.g:1056:6: ({...}? => ( (lv_external_5_0= 'external' ) ) )
            	    // InternalScenarioText.g:1056:7: {...}? => ( (lv_external_5_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // InternalScenarioText.g:1056:16: ( (lv_external_5_0= 'external' ) )
            	    // InternalScenarioText.g:1057:1: (lv_external_5_0= 'external' )
            	    {
            	    // InternalScenarioText.g:1057:1: (lv_external_5_0= 'external' )
            	    // InternalScenarioText.g:1058:3: lv_external_5_0= 'external'
            	    {
            	    lv_external_5_0=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_external_5_0, grammarAccess.getVariableDefinitionAccess().getExternalExternalKeyword_2_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "external", true, "external");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // InternalScenarioText.g:1085:2: ( (lv_name_6_0= ruleXID ) )
            // InternalScenarioText.g:1086:1: (lv_name_6_0= ruleXID )
            {
            // InternalScenarioText.g:1086:1: (lv_name_6_0= ruleXID )
            // InternalScenarioText.g:1087:3: lv_name_6_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_name_6_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"org.yakindu.sct.model.stext.SText.XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // InternalScenarioText.g:1107:1: ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )
            // InternalScenarioText.g:1108:1: (lv_typeSpecifier_8_0= ruleTypeSpecifier )
            {
            // InternalScenarioText.g:1108:1: (lv_typeSpecifier_8_0= ruleTypeSpecifier )
            // InternalScenarioText.g:1109:3: lv_typeSpecifier_8_0= ruleTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeSpecifierTypeSpecifierParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_21);
            lv_typeSpecifier_8_0=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpecifier",
                      		lv_typeSpecifier_8_0, 
                      		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:1125:2: (otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalScenarioText.g:1125:4: otherlv_9= '=' ( (lv_initialValue_10_0= ruleExpression ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // InternalScenarioText.g:1129:1: ( (lv_initialValue_10_0= ruleExpression ) )
                    // InternalScenarioText.g:1130:1: (lv_initialValue_10_0= ruleExpression )
                    {
                    // InternalScenarioText.g:1130:1: (lv_initialValue_10_0= ruleExpression )
                    // InternalScenarioText.g:1131:3: lv_initialValue_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_initialValue_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_10_0, 
                              		"org.yakindu.base.expressions.Expressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleTypeAliasDefinition"
    // InternalScenarioText.g:1155:1: entryRuleTypeAliasDefinition returns [EObject current=null] : iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF ;
    public final EObject entryRuleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAliasDefinition = null;


        try {
            // InternalScenarioText.g:1156:2: (iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF )
            // InternalScenarioText.g:1157:2: iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeAliasDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeAliasDefinition=ruleTypeAliasDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeAliasDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeAliasDefinition"


    // $ANTLR start "ruleTypeAliasDefinition"
    // InternalScenarioText.g:1164:1: ruleTypeAliasDefinition returns [EObject current=null] : ( () otherlv_1= 'alias' ( (lv_name_2_0= ruleXID ) ) otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) ) ;
    public final EObject ruleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1167:28: ( ( () otherlv_1= 'alias' ( (lv_name_2_0= ruleXID ) ) otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) ) )
            // InternalScenarioText.g:1168:1: ( () otherlv_1= 'alias' ( (lv_name_2_0= ruleXID ) ) otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )
            {
            // InternalScenarioText.g:1168:1: ( () otherlv_1= 'alias' ( (lv_name_2_0= ruleXID ) ) otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) ) )
            // InternalScenarioText.g:1168:2: () otherlv_1= 'alias' ( (lv_name_2_0= ruleXID ) ) otherlv_3= ':' ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )
            {
            // InternalScenarioText.g:1168:2: ()
            // InternalScenarioText.g:1169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTypeAliasDefinitionAccess().getTypeAliasDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeAliasDefinitionAccess().getAliasKeyword_1());
                  
            }
            // InternalScenarioText.g:1178:1: ( (lv_name_2_0= ruleXID ) )
            // InternalScenarioText.g:1179:1: (lv_name_2_0= ruleXID )
            {
            // InternalScenarioText.g:1179:1: (lv_name_2_0= ruleXID )
            // InternalScenarioText.g:1180:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeAliasDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.yakindu.sct.model.stext.SText.XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeAliasDefinitionAccess().getColonKeyword_3());
                  
            }
            // InternalScenarioText.g:1200:1: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )
            // InternalScenarioText.g:1201:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
            {
            // InternalScenarioText.g:1201:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
            // InternalScenarioText.g:1202:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getTypeSpecifierTypeSpecifierParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_typeSpecifier_4_0=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeAliasDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpecifier",
                      		lv_typeSpecifier_4_0, 
                      		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
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
    // $ANTLR end "ruleTypeAliasDefinition"


    // $ANTLR start "entryRuleOperationDefinition"
    // InternalScenarioText.g:1226:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // InternalScenarioText.g:1227:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // InternalScenarioText.g:1228:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationDefinition"


    // $ANTLR start "ruleOperationDefinition"
    // InternalScenarioText.g:1235:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) ) )? ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_typeSpecifier_9_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1238:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) ) )? ) )
            // InternalScenarioText.g:1239:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) ) )? )
            {
            // InternalScenarioText.g:1239:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) ) )? )
            // InternalScenarioText.g:1239:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) ) )?
            {
            // InternalScenarioText.g:1239:2: ()
            // InternalScenarioText.g:1240:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // InternalScenarioText.g:1249:1: ( (lv_name_2_0= ruleXID ) )
            // InternalScenarioText.g:1250:1: (lv_name_2_0= ruleXID )
            {
            // InternalScenarioText.g:1250:1: (lv_name_2_0= ruleXID )
            // InternalScenarioText.g:1251:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.yakindu.sct.model.stext.SText.XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalScenarioText.g:1271:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=21 && LA21_0<=22)||LA21_0==24||LA21_0==27||(LA21_0>=29 && LA21_0<=31)||LA21_0==34||(LA21_0>=45 && LA21_0<=46)||(LA21_0>=48 && LA21_0<=57)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalScenarioText.g:1271:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // InternalScenarioText.g:1271:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalScenarioText.g:1272:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalScenarioText.g:1272:1: (lv_parameters_4_0= ruleParameter )
                    // InternalScenarioText.g:1273:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"org.yakindu.sct.model.stext.SText.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:1289:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==36) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalScenarioText.g:1289:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // InternalScenarioText.g:1293:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalScenarioText.g:1294:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalScenarioText.g:1294:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalScenarioText.g:1295:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"org.yakindu.sct.model.stext.SText.Parameter");
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
                    break;

            }

            otherlv_7=(Token)match(input,37,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalScenarioText.g:1315:1: (otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalScenarioText.g:1315:3: otherlv_8= ':' ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // InternalScenarioText.g:1319:1: ( (lv_typeSpecifier_9_0= ruleTypeSpecifier ) )
                    // InternalScenarioText.g:1320:1: (lv_typeSpecifier_9_0= ruleTypeSpecifier )
                    {
                    // InternalScenarioText.g:1320:1: (lv_typeSpecifier_9_0= ruleTypeSpecifier )
                    // InternalScenarioText.g:1321:3: lv_typeSpecifier_9_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeSpecifierTypeSpecifierParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_typeSpecifier_9_0=ruleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_9_0, 
                              		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleOperationDefinition"


    // $ANTLR start "entryRuleTypeSpecifier"
    // InternalScenarioText.g:1345:1: entryRuleTypeSpecifier returns [EObject current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final EObject entryRuleTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecifier = null;


        try {
            // InternalScenarioText.g:1346:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalScenarioText.g:1347:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // InternalScenarioText.g:1354:1: ruleTypeSpecifier returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' ) )? ) ;
    public final EObject ruleTypeSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1357:28: ( ( ( ( ruleFQN ) ) (otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' ) )? ) )
            // InternalScenarioText.g:1358:1: ( ( ( ruleFQN ) ) (otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' ) )? )
            {
            // InternalScenarioText.g:1358:1: ( ( ( ruleFQN ) ) (otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' ) )? )
            // InternalScenarioText.g:1358:2: ( ( ruleFQN ) ) (otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' ) )?
            {
            // InternalScenarioText.g:1358:2: ( ( ruleFQN ) )
            // InternalScenarioText.g:1359:1: ( ruleFQN )
            {
            // InternalScenarioText.g:1359:1: ( ruleFQN )
            // InternalScenarioText.g:1360:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeSpecifierAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:1373:2: (otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalScenarioText.g:1373:4: otherlv_1= '<' ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeSpecifierAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalScenarioText.g:1377:1: ( ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>' )
                    // InternalScenarioText.g:1377:2: ( (lv_typeArguments_2_0= ruleTypeSpecifier ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )* otherlv_5= '>'
                    {
                    // InternalScenarioText.g:1377:2: ( (lv_typeArguments_2_0= ruleTypeSpecifier ) )
                    // InternalScenarioText.g:1378:1: (lv_typeArguments_2_0= ruleTypeSpecifier )
                    {
                    // InternalScenarioText.g:1378:1: (lv_typeArguments_2_0= ruleTypeSpecifier )
                    // InternalScenarioText.g:1379:3: lv_typeArguments_2_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecifierAccess().getTypeArgumentsTypeSpecifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_typeArguments_2_0=ruleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_2_0, 
                              		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:1395:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==36) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalScenarioText.g:1395:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleTypeSpecifier ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeSpecifierAccess().getCommaKeyword_1_1_1_0());
                    	          
                    	    }
                    	    // InternalScenarioText.g:1399:1: ( (lv_typeArguments_4_0= ruleTypeSpecifier ) )
                    	    // InternalScenarioText.g:1400:1: (lv_typeArguments_4_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalScenarioText.g:1400:1: (lv_typeArguments_4_0= ruleTypeSpecifier )
                    	    // InternalScenarioText.g:1401:3: lv_typeArguments_4_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeSpecifierAccess().getTypeArgumentsTypeSpecifierParserRuleCall_1_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_typeArguments_4_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeSpecifierRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_4_0, 
                    	              		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
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

                    otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypeSpecifierAccess().getGreaterThanSignKeyword_1_1_2());
                          
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
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleParameter"
    // InternalScenarioText.g:1429:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalScenarioText.g:1430:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalScenarioText.g:1431:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalScenarioText.g:1438:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) ( (lv_varArgs_1_0= '...' ) )? otherlv_2= ':' ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_varArgs_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_typeSpecifier_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1441:28: ( ( ( (lv_name_0_0= ruleXID ) ) ( (lv_varArgs_1_0= '...' ) )? otherlv_2= ':' ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ) )
            // InternalScenarioText.g:1442:1: ( ( (lv_name_0_0= ruleXID ) ) ( (lv_varArgs_1_0= '...' ) )? otherlv_2= ':' ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) )
            {
            // InternalScenarioText.g:1442:1: ( ( (lv_name_0_0= ruleXID ) ) ( (lv_varArgs_1_0= '...' ) )? otherlv_2= ':' ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) )
            // InternalScenarioText.g:1442:2: ( (lv_name_0_0= ruleXID ) ) ( (lv_varArgs_1_0= '...' ) )? otherlv_2= ':' ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )
            {
            // InternalScenarioText.g:1442:2: ( (lv_name_0_0= ruleXID ) )
            // InternalScenarioText.g:1443:1: (lv_name_0_0= ruleXID )
            {
            // InternalScenarioText.g:1443:1: (lv_name_0_0= ruleXID )
            // InternalScenarioText.g:1444:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_28);
            lv_name_0_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.yakindu.sct.model.stext.SText.XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:1460:2: ( (lv_varArgs_1_0= '...' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalScenarioText.g:1461:1: (lv_varArgs_1_0= '...' )
                    {
                    // InternalScenarioText.g:1461:1: (lv_varArgs_1_0= '...' )
                    // InternalScenarioText.g:1462:3: lv_varArgs_1_0= '...'
                    {
                    lv_varArgs_1_0=(Token)match(input,40,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_varArgs_1_0, grammarAccess.getParameterAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "varArgs", true, "...");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
                  
            }
            // InternalScenarioText.g:1479:1: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )
            // InternalScenarioText.g:1480:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
            {
            // InternalScenarioText.g:1480:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
            // InternalScenarioText.g:1481:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeSpecifierTypeSpecifierParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_typeSpecifier_3_0=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpecifier",
                      		lv_typeSpecifier_3_0, 
                      		"org.yakindu.sct.model.stext.SText.TypeSpecifier");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleLocalReaction"
    // InternalScenarioText.g:1507:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // InternalScenarioText.g:1508:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // InternalScenarioText.g:1509:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalReaction"


    // $ANTLR start "ruleLocalReaction"
    // InternalScenarioText.g:1516:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1519:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // InternalScenarioText.g:1520:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // InternalScenarioText.g:1520:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // InternalScenarioText.g:1520:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // InternalScenarioText.g:1520:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // InternalScenarioText.g:1521:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // InternalScenarioText.g:1521:1: (lv_trigger_0_0= ruleReactionTrigger )
            // InternalScenarioText.g:1522:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
            lv_trigger_0_0=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
              	        }
                     		set(
                     			current, 
                     			"trigger",
                      		lv_trigger_0_0, 
                      		"org.yakindu.sct.model.stext.SText.ReactionTrigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:1538:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // InternalScenarioText.g:1538:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // InternalScenarioText.g:1543:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // InternalScenarioText.g:1543:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,41,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // InternalScenarioText.g:1547:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // InternalScenarioText.g:1548:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // InternalScenarioText.g:1548:1: (lv_effect_2_0= ruleReactionEffect )
            // InternalScenarioText.g:1549:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_effect_2_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_2_0, 
                      		"org.yakindu.sct.model.stext.SText.ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


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
    // $ANTLR end "ruleLocalReaction"


    // $ANTLR start "entryRuleTransitionReaction"
    // InternalScenarioText.g:1573:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // InternalScenarioText.g:1574:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // InternalScenarioText.g:1575:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionReaction"


    // $ANTLR start "ruleTransitionReaction"
    // InternalScenarioText.g:1582:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1585:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // InternalScenarioText.g:1586:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // InternalScenarioText.g:1586:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // InternalScenarioText.g:1586:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // InternalScenarioText.g:1586:2: ()
            // InternalScenarioText.g:1587:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:1592:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==43||(LA26_0>=45 && LA26_0<=46)||(LA26_0>=48 && LA26_0<=51)||(LA26_0>=67 && LA26_0<=68)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalScenarioText.g:1593:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // InternalScenarioText.g:1593:1: (lv_trigger_1_0= ruleStextTrigger )
                    // InternalScenarioText.g:1594:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    lv_trigger_1_0=ruleStextTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_1_0, 
                              		"org.yakindu.sct.model.stext.SText.StextTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalScenarioText.g:1610:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalScenarioText.g:1610:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // InternalScenarioText.g:1614:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // InternalScenarioText.g:1615:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // InternalScenarioText.g:1615:1: (lv_effect_3_0= ruleReactionEffect )
                    // InternalScenarioText.g:1616:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_32);
                    lv_effect_3_0=ruleReactionEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_3_0, 
                              		"org.yakindu.sct.model.stext.SText.ReactionEffect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalScenarioText.g:1632:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalScenarioText.g:1632:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // InternalScenarioText.g:1636:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID||LA28_0==39) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalScenarioText.g:1637:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // InternalScenarioText.g:1637:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // InternalScenarioText.g:1638:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_properties_5_0=ruleTransitionProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_5_0, 
                    	              		"org.yakindu.sct.model.stext.SText.TransitionProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTransitionReaction"


    // $ANTLR start "entryRuleStextTrigger"
    // InternalScenarioText.g:1662:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // InternalScenarioText.g:1663:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // InternalScenarioText.g:1664:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStextTrigger"


    // $ANTLR start "ruleStextTrigger"
    // InternalScenarioText.g:1671:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1674:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // InternalScenarioText.g:1675:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // InternalScenarioText.g:1675:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==43||(LA30_0>=48 && LA30_0<=51)||(LA30_0>=67 && LA30_0<=68)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=45 && LA30_0<=46)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalScenarioText.g:1676:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ReactionTrigger_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReactionTrigger_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:1686:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_DefaultTrigger_1=ruleDefaultTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefaultTrigger_1; 
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
    // $ANTLR end "ruleStextTrigger"


    // $ANTLR start "entryRuleReactionTrigger"
    // InternalScenarioText.g:1702:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // InternalScenarioText.g:1703:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // InternalScenarioText.g:1704:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReactionTrigger"


    // $ANTLR start "ruleReactionTrigger"
    // InternalScenarioText.g:1711:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_triggers_1_0 = null;

        EObject lv_triggers_3_0 = null;

        EObject lv_guard_5_0 = null;

        EObject lv_guard_8_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1714:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' ) ) ) )
            // InternalScenarioText.g:1715:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' ) ) )
            {
            // InternalScenarioText.g:1715:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' ) ) )
            // InternalScenarioText.g:1715:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' ) )
            {
            // InternalScenarioText.g:1715:2: ()
            // InternalScenarioText.g:1716:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:1721:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||(LA33_0>=48 && LA33_0<=51)||(LA33_0>=67 && LA33_0<=68)) ) {
                alt33=1;
            }
            else if ( (LA33_0==43) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalScenarioText.g:1721:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? )
                    {
                    // InternalScenarioText.g:1721:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )? )
                    // InternalScenarioText.g:1721:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )?
                    {
                    // InternalScenarioText.g:1721:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // InternalScenarioText.g:1722:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // InternalScenarioText.g:1722:1: (lv_triggers_1_0= ruleEventSpec )
                    // InternalScenarioText.g:1723:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_34);
                    lv_triggers_1_0=ruleEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		add(
                             			current, 
                             			"triggers",
                              		lv_triggers_1_0, 
                              		"org.yakindu.sct.model.stext.SText.EventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:1739:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==36) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalScenarioText.g:1739:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // InternalScenarioText.g:1743:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // InternalScenarioText.g:1744:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // InternalScenarioText.g:1744:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // InternalScenarioText.g:1745:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_34);
                    	    lv_triggers_3_0=ruleEventSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"triggers",
                    	              		lv_triggers_3_0, 
                    	              		"org.yakindu.sct.model.stext.SText.EventSpec");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalScenarioText.g:1761:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==43) && (synpred2_InternalScenarioText())) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalScenarioText.g:1761:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guard_5_0= ruleGuard ) ) otherlv_6= ']'
                            {
                            // InternalScenarioText.g:1761:5: ( ( '[' )=>otherlv_4= '[' )
                            // InternalScenarioText.g:1761:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,43,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // InternalScenarioText.g:1766:2: ( (lv_guard_5_0= ruleGuard ) )
                            // InternalScenarioText.g:1767:1: (lv_guard_5_0= ruleGuard )
                            {
                            // InternalScenarioText.g:1767:1: (lv_guard_5_0= ruleGuard )
                            // InternalScenarioText.g:1768:3: lv_guard_5_0= ruleGuard
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardGuardParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_36);
                            lv_guard_5_0=ruleGuard();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"guard",
                                      		lv_guard_5_0, 
                                      		"org.yakindu.sct.model.stext.SText.Guard");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:1789:6: (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' )
                    {
                    // InternalScenarioText.g:1789:6: (otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']' )
                    // InternalScenarioText.g:1789:8: otherlv_7= '[' ( (lv_guard_8_0= ruleGuard ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // InternalScenarioText.g:1793:1: ( (lv_guard_8_0= ruleGuard ) )
                    // InternalScenarioText.g:1794:1: (lv_guard_8_0= ruleGuard )
                    {
                    // InternalScenarioText.g:1794:1: (lv_guard_8_0= ruleGuard )
                    // InternalScenarioText.g:1795:3: lv_guard_8_0= ruleGuard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardGuardParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
                    lv_guard_8_0=ruleGuard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_8_0, 
                              		"org.yakindu.sct.model.stext.SText.Guard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_1_2());
                          
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
    // $ANTLR end "ruleReactionTrigger"


    // $ANTLR start "entryRuleDefaultTrigger"
    // InternalScenarioText.g:1823:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // InternalScenarioText.g:1824:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // InternalScenarioText.g:1825:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultTrigger"


    // $ANTLR start "ruleDefaultTrigger"
    // InternalScenarioText.g:1832:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:1835:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // InternalScenarioText.g:1836:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // InternalScenarioText.g:1836:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // InternalScenarioText.g:1836:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // InternalScenarioText.g:1836:2: ()
            // InternalScenarioText.g:1837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:1842:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==46) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalScenarioText.g:1842:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:1847:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDefaultTriggerAccess().getElseKeyword_1_1());
                          
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
    // $ANTLR end "ruleDefaultTrigger"


    // $ANTLR start "entryRuleGuard"
    // InternalScenarioText.g:1859:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalScenarioText.g:1860:2: (iv_ruleGuard= ruleGuard EOF )
            // InternalScenarioText.g:1861:2: iv_ruleGuard= ruleGuard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuard; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalScenarioText.g:1868:1: ruleGuard returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1871:28: ( ( () ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalScenarioText.g:1872:1: ( () ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalScenarioText.g:1872:1: ( () ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalScenarioText.g:1872:2: () ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalScenarioText.g:1872:2: ()
            // InternalScenarioText.g:1873:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGuardAccess().getGuardAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:1878:2: ( (lv_expression_1_0= ruleExpression ) )
            // InternalScenarioText.g:1879:1: (lv_expression_1_0= ruleExpression )
            {
            // InternalScenarioText.g:1879:1: (lv_expression_1_0= ruleExpression )
            // InternalScenarioText.g:1880:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGuardAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGuardRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"org.yakindu.base.expressions.Expressions.Expression");
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleReactionEffect"
    // InternalScenarioText.g:1904:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // InternalScenarioText.g:1905:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // InternalScenarioText.g:1906:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReactionEffect"


    // $ANTLR start "ruleReactionEffect"
    // InternalScenarioText.g:1913:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:1916:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // InternalScenarioText.g:1917:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // InternalScenarioText.g:1917:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // InternalScenarioText.g:1917:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // InternalScenarioText.g:1917:2: ()
            // InternalScenarioText.g:1918:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:1923:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // InternalScenarioText.g:1924:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // InternalScenarioText.g:1924:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // InternalScenarioText.g:1925:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // InternalScenarioText.g:1925:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||LA35_0==35||(LA35_0>=53 && LA35_0<=54)||LA35_0==60||LA35_0==63||(LA35_0>=85 && LA35_0<=86)||LA35_0==89) ) {
                alt35=1;
            }
            else if ( (LA35_0==52) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalScenarioText.g:1926:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_37);
                    lv_actions_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_1_1, 
                              		"org.yakindu.base.expressions.Expressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:1941:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_37);
                    lv_actions_1_2=ruleEventRaisingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_1_2, 
                              		"org.yakindu.sct.model.stext.SText.EventRaisingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalScenarioText.g:1959:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47) && (synpred3_InternalScenarioText())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalScenarioText.g:1959:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // InternalScenarioText.g:1959:3: ( ( ';' )=>otherlv_2= ';' )
            	    // InternalScenarioText.g:1959:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,47,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:1964:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // InternalScenarioText.g:1965:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // InternalScenarioText.g:1965:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // InternalScenarioText.g:1966:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // InternalScenarioText.g:1966:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==35||(LA36_0>=53 && LA36_0<=54)||LA36_0==60||LA36_0==63||(LA36_0>=85 && LA36_0<=86)||LA36_0==89) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==52) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalScenarioText.g:1967:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_37);
            	            lv_actions_3_1=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"actions",
            	                      		lv_actions_3_1, 
            	                      		"org.yakindu.base.expressions.Expressions.Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScenarioText.g:1982:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_37);
            	            lv_actions_3_2=ruleEventRaisingExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"actions",
            	                      		lv_actions_3_2, 
            	                      		"org.yakindu.sct.model.stext.SText.EventRaisingExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleTransitionProperty"
    // InternalScenarioText.g:2008:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // InternalScenarioText.g:2009:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // InternalScenarioText.g:2010:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionProperty"


    // $ANTLR start "ruleTransitionProperty"
    // InternalScenarioText.g:2017:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2020:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // InternalScenarioText.g:2021:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // InternalScenarioText.g:2021:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalScenarioText.g:2022:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_EntryPointSpec_0=ruleEntryPointSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryPointSpec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:2032:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ExitPointSpec_1=ruleExitPointSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitPointSpec_1; 
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
    // $ANTLR end "ruleTransitionProperty"


    // $ANTLR start "entryRuleEntryPointSpec"
    // InternalScenarioText.g:2048:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // InternalScenarioText.g:2049:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // InternalScenarioText.g:2050:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryPointSpec"


    // $ANTLR start "ruleEntryPointSpec"
    // InternalScenarioText.g:2057:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2060:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // InternalScenarioText.g:2061:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // InternalScenarioText.g:2061:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // InternalScenarioText.g:2061:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // InternalScenarioText.g:2065:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // InternalScenarioText.g:2066:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // InternalScenarioText.g:2066:1: (lv_entrypoint_1_0= RULE_ID )
            // InternalScenarioText.g:2067:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_entrypoint_1_0, grammarAccess.getEntryPointSpecAccess().getEntrypointIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"entrypoint",
                      		lv_entrypoint_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // $ANTLR end "ruleEntryPointSpec"


    // $ANTLR start "entryRuleExitPointSpec"
    // InternalScenarioText.g:2091:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // InternalScenarioText.g:2092:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // InternalScenarioText.g:2093:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExitPointSpec"


    // $ANTLR start "ruleExitPointSpec"
    // InternalScenarioText.g:2100:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2103:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // InternalScenarioText.g:2104:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // InternalScenarioText.g:2104:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // InternalScenarioText.g:2104:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // InternalScenarioText.g:2104:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // InternalScenarioText.g:2105:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // InternalScenarioText.g:2105:1: (lv_exitpoint_0_0= RULE_ID )
            // InternalScenarioText.g:2106:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_exitpoint_0_0, grammarAccess.getExitPointSpecAccess().getExitpointIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"exitpoint",
                      		lv_exitpoint_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitPointSpecAccess().getGreaterThanSignKeyword_1());
                  
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
    // $ANTLR end "ruleExitPointSpec"


    // $ANTLR start "entryRuleEventSpec"
    // InternalScenarioText.g:2134:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // InternalScenarioText.g:2135:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // InternalScenarioText.g:2136:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventSpec"


    // $ANTLR start "ruleEventSpec"
    // InternalScenarioText.g:2143:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2146:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // InternalScenarioText.g:2147:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // InternalScenarioText.g:2147:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case 67:
            case 68:
                {
                alt39=2;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalScenarioText.g:2148:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_RegularEventSpec_0=ruleRegularEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegularEventSpec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:2158:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeEventSpec_1=ruleTimeEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeEventSpec_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:2168:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BuiltinEventSpec_2=ruleBuiltinEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltinEventSpec_2; 
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
    // $ANTLR end "ruleEventSpec"


    // $ANTLR start "entryRuleRegularEventSpec"
    // InternalScenarioText.g:2184:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // InternalScenarioText.g:2185:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // InternalScenarioText.g:2186:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegularEventSpec"


    // $ANTLR start "ruleRegularEventSpec"
    // InternalScenarioText.g:2193:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleSimpleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2196:28: ( ( (lv_event_0_0= ruleSimpleFeatureCall ) ) )
            // InternalScenarioText.g:2197:1: ( (lv_event_0_0= ruleSimpleFeatureCall ) )
            {
            // InternalScenarioText.g:2197:1: ( (lv_event_0_0= ruleSimpleFeatureCall ) )
            // InternalScenarioText.g:2198:1: (lv_event_0_0= ruleSimpleFeatureCall )
            {
            // InternalScenarioText.g:2198:1: (lv_event_0_0= ruleSimpleFeatureCall )
            // InternalScenarioText.g:2199:3: lv_event_0_0= ruleSimpleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventSimpleFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_event_0_0=ruleSimpleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRegularEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"org.yakindu.sct.model.stext.SText.SimpleFeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleRegularEventSpec"


    // $ANTLR start "entryRuleSimpleFeatureCall"
    // InternalScenarioText.g:2223:1: entryRuleSimpleFeatureCall returns [EObject current=null] : iv_ruleSimpleFeatureCall= ruleSimpleFeatureCall EOF ;
    public final EObject entryRuleSimpleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFeatureCall = null;


        try {
            // InternalScenarioText.g:2224:2: (iv_ruleSimpleFeatureCall= ruleSimpleFeatureCall EOF )
            // InternalScenarioText.g:2225:2: iv_ruleSimpleFeatureCall= ruleSimpleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleFeatureCall=ruleSimpleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleFeatureCall"


    // $ANTLR start "ruleSimpleFeatureCall"
    // InternalScenarioText.g:2232:1: ruleSimpleFeatureCall returns [EObject current=null] : (this_SimpleElementReferenceExpression_0= ruleSimpleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleSimpleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_operationCall_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_SimpleElementReferenceExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2235:28: ( (this_SimpleElementReferenceExpression_0= ruleSimpleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalScenarioText.g:2236:1: (this_SimpleElementReferenceExpression_0= ruleSimpleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalScenarioText.g:2236:1: (this_SimpleElementReferenceExpression_0= ruleSimpleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalScenarioText.g:2237:5: this_SimpleElementReferenceExpression_0= ruleSimpleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleFeatureCallAccess().getSimpleElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_18);
            this_SimpleElementReferenceExpression_0=ruleSimpleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SimpleElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:2245:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==26) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalScenarioText.g:2245:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalScenarioText.g:2245:2: ()
            	    // InternalScenarioText.g:2246:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // InternalScenarioText.g:2255:1: ( (otherlv_3= RULE_ID ) )
            	    // InternalScenarioText.g:2256:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalScenarioText.g:2256:1: (otherlv_3= RULE_ID )
            	    // InternalScenarioText.g:2257:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSimpleFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getSimpleFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:2268:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==35) && (synpred4_InternalScenarioText())) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalScenarioText.g:2268:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalScenarioText.g:2268:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // InternalScenarioText.g:2268:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // InternalScenarioText.g:2275:1: (lv_operationCall_4_0= '(' )
            	            // InternalScenarioText.g:2276:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operationCall_4_0, grammarAccess.getSimpleFeatureCallAccess().getOperationCallLeftParenthesisKeyword_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSimpleFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // InternalScenarioText.g:2289:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt41=2;
            	            int LA41_0 = input.LA(1);

            	            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==35||(LA41_0>=53 && LA41_0<=54)||LA41_0==60||LA41_0==63||(LA41_0>=85 && LA41_0<=86)||LA41_0==89) ) {
            	                alt41=1;
            	            }
            	            switch (alt41) {
            	                case 1 :
            	                    // InternalScenarioText.g:2289:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // InternalScenarioText.g:2289:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // InternalScenarioText.g:2290:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // InternalScenarioText.g:2290:1: (lv_args_5_0= ruleExpression )
            	                    // InternalScenarioText.g:2291:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getSimpleFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_25);
            	                    lv_args_5_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getSimpleFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"args",
            	                              		lv_args_5_0, 
            	                              		"org.yakindu.base.expressions.Expressions.Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // InternalScenarioText.g:2307:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop40:
            	                    do {
            	                        int alt40=2;
            	                        int LA40_0 = input.LA(1);

            	                        if ( (LA40_0==36) ) {
            	                            alt40=1;
            	                        }


            	                        switch (alt40) {
            	                    	case 1 :
            	                    	    // InternalScenarioText.g:2307:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,36,FOLLOW_22); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getSimpleFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // InternalScenarioText.g:2311:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // InternalScenarioText.g:2312:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // InternalScenarioText.g:2312:1: (lv_args_7_0= ruleExpression )
            	                    	    // InternalScenarioText.g:2313:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getSimpleFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_25);
            	                    	    lv_args_7_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getSimpleFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"args",
            	                    	              		lv_args_7_0, 
            	                    	              		"org.yakindu.base.expressions.Expressions.Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop40;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,37,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getSimpleFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleSimpleFeatureCall"


    // $ANTLR start "entryRuleSimpleElementReferenceExpression"
    // InternalScenarioText.g:2341:1: entryRuleSimpleElementReferenceExpression returns [EObject current=null] : iv_ruleSimpleElementReferenceExpression= ruleSimpleElementReferenceExpression EOF ;
    public final EObject entryRuleSimpleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElementReferenceExpression = null;


        try {
            // InternalScenarioText.g:2342:2: (iv_ruleSimpleElementReferenceExpression= ruleSimpleElementReferenceExpression EOF )
            // InternalScenarioText.g:2343:2: iv_ruleSimpleElementReferenceExpression= ruleSimpleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleElementReferenceExpression=ruleSimpleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleElementReferenceExpression"


    // $ANTLR start "ruleSimpleElementReferenceExpression"
    // InternalScenarioText.g:2350:1: ruleSimpleElementReferenceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleSimpleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operationCall_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2353:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )? ) )
            // InternalScenarioText.g:2354:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalScenarioText.g:2354:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )? )
            // InternalScenarioText.g:2354:2: ( (otherlv_0= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )?
            {
            // InternalScenarioText.g:2354:2: ( (otherlv_0= RULE_ID ) )
            // InternalScenarioText.g:2355:1: (otherlv_0= RULE_ID )
            {
            // InternalScenarioText.g:2355:1: (otherlv_0= RULE_ID )
            // InternalScenarioText.g:2356:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSimpleElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSimpleElementReferenceExpressionAccess().getReferenceEObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalScenarioText.g:2367:2: ( ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) && (synpred5_InternalScenarioText())) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalScenarioText.g:2367:3: ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) ) ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
                    {
                    // InternalScenarioText.g:2367:3: ( ( ( '(' ) )=> (lv_operationCall_1_0= '(' ) )
                    // InternalScenarioText.g:2367:4: ( ( '(' ) )=> (lv_operationCall_1_0= '(' )
                    {
                    // InternalScenarioText.g:2374:1: (lv_operationCall_1_0= '(' )
                    // InternalScenarioText.g:2375:3: lv_operationCall_1_0= '('
                    {
                    lv_operationCall_1_0=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operationCall_1_0, grammarAccess.getSimpleElementReferenceExpressionAccess().getOperationCallLeftParenthesisKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleElementReferenceExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "operationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:2388:2: ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||LA45_0==35||(LA45_0>=53 && LA45_0<=54)||LA45_0==60||LA45_0==63||(LA45_0>=85 && LA45_0<=86)||LA45_0==89) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalScenarioText.g:2388:3: ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                            {
                            // InternalScenarioText.g:2388:3: ( (lv_args_2_0= ruleExpression ) )
                            // InternalScenarioText.g:2389:1: (lv_args_2_0= ruleExpression )
                            {
                            // InternalScenarioText.g:2389:1: (lv_args_2_0= ruleExpression )
                            // InternalScenarioText.g:2390:3: lv_args_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_25);
                            lv_args_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimpleElementReferenceExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_2_0, 
                                      		"org.yakindu.base.expressions.Expressions.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalScenarioText.g:2406:2: (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==36) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // InternalScenarioText.g:2406:4: otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) )
                            	    {
                            	    otherlv_3=(Token)match(input,36,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getSimpleElementReferenceExpressionAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // InternalScenarioText.g:2410:1: ( (lv_args_4_0= ruleExpression ) )
                            	    // InternalScenarioText.g:2411:1: (lv_args_4_0= ruleExpression )
                            	    {
                            	    // InternalScenarioText.g:2411:1: (lv_args_4_0= ruleExpression )
                            	    // InternalScenarioText.g:2412:3: lv_args_4_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSimpleElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_25);
                            	    lv_args_4_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSimpleElementReferenceExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_4_0, 
                            	              		"org.yakindu.base.expressions.Expressions.Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSimpleElementReferenceExpressionAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleSimpleElementReferenceExpression"


    // $ANTLR start "entryRuleTimeEventSpec"
    // InternalScenarioText.g:2440:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // InternalScenarioText.g:2441:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // InternalScenarioText.g:2442:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeEventSpec"


    // $ANTLR start "ruleTimeEventSpec"
    // InternalScenarioText.g:2449:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2452:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // InternalScenarioText.g:2453:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // InternalScenarioText.g:2453:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // InternalScenarioText.g:2453:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // InternalScenarioText.g:2453:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // InternalScenarioText.g:2454:1: (lv_type_0_0= ruleTimeEventType )
            {
            // InternalScenarioText.g:2454:1: (lv_type_0_0= ruleTimeEventType )
            // InternalScenarioText.g:2455:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_22);
            lv_type_0_0=ruleTimeEventType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"org.yakindu.sct.model.stext.SText.TimeEventType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:2471:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // InternalScenarioText.g:2472:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // InternalScenarioText.g:2472:1: (lv_value_1_0= ruleConditionalExpression )
            // InternalScenarioText.g:2473:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_42);
            lv_value_1_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.yakindu.base.expressions.Expressions.ConditionalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:2489:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalScenarioText.g:2490:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalScenarioText.g:2490:1: (lv_unit_2_0= ruleTimeUnit )
            // InternalScenarioText.g:2491:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_2_0, 
                      		"org.yakindu.sct.model.stext.SText.TimeUnit");
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
    // $ANTLR end "ruleTimeEventSpec"


    // $ANTLR start "entryRuleBuiltinEventSpec"
    // InternalScenarioText.g:2515:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // InternalScenarioText.g:2516:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // InternalScenarioText.g:2517:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuiltinEventSpec"


    // $ANTLR start "ruleBuiltinEventSpec"
    // InternalScenarioText.g:2524:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2527:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // InternalScenarioText.g:2528:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // InternalScenarioText.g:2528:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt47=1;
                }
                break;
            case 49:
                {
                alt47=2;
                }
                break;
            case 50:
            case 51:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalScenarioText.g:2529:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_EntryEvent_0=ruleEntryEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryEvent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:2539:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ExitEvent_1=ruleExitEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitEvent_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:2549:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_AlwaysEvent_2=ruleAlwaysEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysEvent_2; 
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
    // $ANTLR end "ruleBuiltinEventSpec"


    // $ANTLR start "entryRuleEntryEvent"
    // InternalScenarioText.g:2565:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // InternalScenarioText.g:2566:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // InternalScenarioText.g:2567:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryEvent"


    // $ANTLR start "ruleEntryEvent"
    // InternalScenarioText.g:2574:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2577:28: ( ( () otherlv_1= 'entry' ) )
            // InternalScenarioText.g:2578:1: ( () otherlv_1= 'entry' )
            {
            // InternalScenarioText.g:2578:1: ( () otherlv_1= 'entry' )
            // InternalScenarioText.g:2578:2: () otherlv_1= 'entry'
            {
            // InternalScenarioText.g:2578:2: ()
            // InternalScenarioText.g:2579:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryEventAccess().getEntryKeyword_1());
                  
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
    // $ANTLR end "ruleEntryEvent"


    // $ANTLR start "entryRuleExitEvent"
    // InternalScenarioText.g:2596:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // InternalScenarioText.g:2597:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // InternalScenarioText.g:2598:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExitEvent"


    // $ANTLR start "ruleExitEvent"
    // InternalScenarioText.g:2605:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2608:28: ( ( () otherlv_1= 'exit' ) )
            // InternalScenarioText.g:2609:1: ( () otherlv_1= 'exit' )
            {
            // InternalScenarioText.g:2609:1: ( () otherlv_1= 'exit' )
            // InternalScenarioText.g:2609:2: () otherlv_1= 'exit'
            {
            // InternalScenarioText.g:2609:2: ()
            // InternalScenarioText.g:2610:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitEventAccess().getExitKeyword_1());
                  
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
    // $ANTLR end "ruleExitEvent"


    // $ANTLR start "entryRuleAlwaysEvent"
    // InternalScenarioText.g:2627:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // InternalScenarioText.g:2628:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // InternalScenarioText.g:2629:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlwaysEvent"


    // $ANTLR start "ruleAlwaysEvent"
    // InternalScenarioText.g:2636:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2639:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // InternalScenarioText.g:2640:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // InternalScenarioText.g:2640:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // InternalScenarioText.g:2640:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // InternalScenarioText.g:2640:2: ()
            // InternalScenarioText.g:2641:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:2646:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            else if ( (LA48_0==51) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalScenarioText.g:2646:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:2651:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAlwaysEventAccess().getOncycleKeyword_1_1());
                          
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
    // $ANTLR end "ruleAlwaysEvent"


    // $ANTLR start "entryRuleEventRaisingExpression"
    // InternalScenarioText.g:2663:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // InternalScenarioText.g:2664:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // InternalScenarioText.g:2665:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventRaisingExpression"


    // $ANTLR start "ruleEventRaisingExpression"
    // InternalScenarioText.g:2672:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2675:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // InternalScenarioText.g:2676:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // InternalScenarioText.g:2676:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // InternalScenarioText.g:2676:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // InternalScenarioText.g:2676:2: ()
            // InternalScenarioText.g:2677:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // InternalScenarioText.g:2686:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // InternalScenarioText.g:2687:1: (lv_event_2_0= ruleFeatureCall )
            {
            // InternalScenarioText.g:2687:1: (lv_event_2_0= ruleFeatureCall )
            // InternalScenarioText.g:2688:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_20);
            lv_event_2_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventRaisingExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_2_0, 
                      		"org.yakindu.base.expressions.Expressions.FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalScenarioText.g:2704:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalScenarioText.g:2704:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // InternalScenarioText.g:2708:1: ( (lv_value_4_0= ruleExpression ) )
                    // InternalScenarioText.g:2709:1: (lv_value_4_0= ruleExpression )
                    {
                    // InternalScenarioText.g:2709:1: (lv_value_4_0= ruleExpression )
                    // InternalScenarioText.g:2710:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventRaisingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"org.yakindu.base.expressions.Expressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleEventRaisingExpression"


    // $ANTLR start "entryRuleEventValueReferenceExpression"
    // InternalScenarioText.g:2734:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // InternalScenarioText.g:2735:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // InternalScenarioText.g:2736:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventValueReferenceExpression"


    // $ANTLR start "ruleEventValueReferenceExpression"
    // InternalScenarioText.g:2743:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2746:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // InternalScenarioText.g:2747:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // InternalScenarioText.g:2747:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // InternalScenarioText.g:2747:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // InternalScenarioText.g:2747:2: ()
            // InternalScenarioText.g:2748:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalScenarioText.g:2761:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // InternalScenarioText.g:2762:1: (lv_value_3_0= ruleFeatureCall )
            {
            // InternalScenarioText.g:2762:1: (lv_value_3_0= ruleFeatureCall )
            // InternalScenarioText.g:2763:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
            lv_value_3_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventValueReferenceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"org.yakindu.base.expressions.Expressions.FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEventValueReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleEventValueReferenceExpression"


    // $ANTLR start "entryRuleActiveStateReferenceExpression"
    // InternalScenarioText.g:2791:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // InternalScenarioText.g:2792:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // InternalScenarioText.g:2793:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActiveStateReferenceExpression"


    // $ANTLR start "ruleActiveStateReferenceExpression"
    // InternalScenarioText.g:2800:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2803:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalScenarioText.g:2804:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalScenarioText.g:2804:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalScenarioText.g:2804:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // InternalScenarioText.g:2804:2: ()
            // InternalScenarioText.g:2805:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalScenarioText.g:2818:1: ( ( ruleFQN ) )
            // InternalScenarioText.g:2819:1: ( ruleFQN )
            {
            // InternalScenarioText.g:2819:1: ( ruleFQN )
            // InternalScenarioText.g:2820:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getActiveStateReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleActiveStateReferenceExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalScenarioText.g:2845:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalScenarioText.g:2846:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalScenarioText.g:2847:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScenarioText.g:2854:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_EventValueReferenceExpression_3 = null;

        EObject this_ParenthesizedExpression_4 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:2857:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression ) )
            // InternalScenarioText.g:2858:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression )
            {
            // InternalScenarioText.g:2858:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
            case 60:
                {
                alt50=1;
                }
                break;
            case RULE_ID:
                {
                alt50=2;
                }
                break;
            case 54:
                {
                alt50=3;
                }
                break;
            case 53:
                {
                alt50=4;
                }
                break;
            case 35:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalScenarioText.g:2859:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveValueExpression_0=rulePrimitiveValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveValueExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:2869:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureCall_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FeatureCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:2879:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ActiveStateReferenceExpression_2=ruleActiveStateReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActiveStateReferenceExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:2889:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_EventValueReferenceExpression_3=ruleEventValueReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventValueReferenceExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalScenarioText.g:2899:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedExpression_4=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_4; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleXID"
    // InternalScenarioText.g:2915:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // InternalScenarioText.g:2916:2: (iv_ruleXID= ruleXID EOF )
            // InternalScenarioText.g:2917:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXID"


    // $ANTLR start "ruleXID"
    // InternalScenarioText.g:2924:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:2927:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // InternalScenarioText.g:2928:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // InternalScenarioText.g:2928:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt51=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case 21:
                {
                alt51=2;
                }
                break;
            case 22:
                {
                alt51=3;
                }
                break;
            case 24:
                {
                alt51=4;
                }
                break;
            case 27:
                {
                alt51=5;
                }
                break;
            case 55:
                {
                alt51=6;
                }
                break;
            case 56:
                {
                alt51=7;
                }
                break;
            case 57:
                {
                alt51=8;
                }
                break;
            case 29:
                {
                alt51=9;
                }
                break;
            case 30:
                {
                alt51=10;
                }
                break;
            case 31:
                {
                alt51=11;
                }
                break;
            case 34:
                {
                alt51=12;
                }
                break;
            case 45:
                {
                alt51=13;
                }
                break;
            case 46:
                {
                alt51=14;
                }
                break;
            case 48:
                {
                alt51=15;
                }
                break;
            case 49:
                {
                alt51=16;
                }
                break;
            case 50:
                {
                alt51=17;
                }
                break;
            case 51:
                {
                alt51=18;
                }
                break;
            case 52:
                {
                alt51=19;
                }
                break;
            case 53:
                {
                alt51=20;
                }
                break;
            case 54:
                {
                alt51=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalScenarioText.g:2928:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:2937:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:2944:2: kw= 'interface'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:2951:2: kw= 'internal'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalScenarioText.g:2958:2: kw= 'event'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalScenarioText.g:2965:2: kw= 'local'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalScenarioText.g:2972:2: kw= 'in'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalScenarioText.g:2979:2: kw= 'out'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalScenarioText.g:2986:2: kw= 'var'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalScenarioText.g:2993:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalScenarioText.g:3000:2: kw= 'external'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalScenarioText.g:3007:2: kw= 'operation'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalScenarioText.g:3014:2: kw= 'default'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalScenarioText.g:3021:2: kw= 'else'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // InternalScenarioText.g:3028:2: kw= 'entry'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // InternalScenarioText.g:3035:2: kw= 'exit'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // InternalScenarioText.g:3042:2: kw= 'always'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // InternalScenarioText.g:3049:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // InternalScenarioText.g:3056:2: kw= 'raise'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // InternalScenarioText.g:3063:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // InternalScenarioText.g:3070:2: kw= 'active'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getActiveKeyword_20()); 
                          
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
    // $ANTLR end "ruleXID"


    // $ANTLR start "entryRuleFQN"
    // InternalScenarioText.g:3083:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalScenarioText.g:3084:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalScenarioText.g:3085:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalScenarioText.g:3092:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3095:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // InternalScenarioText.g:3096:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // InternalScenarioText.g:3096:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // InternalScenarioText.g:3097:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_18);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3107:1: (kw= '.' this_XID_2= ruleXID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==26) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalScenarioText.g:3108:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_XID_2=ruleXID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_XID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleExpression"
    // InternalScenarioText.g:3132:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalScenarioText.g:3133:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalScenarioText.g:3134:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalScenarioText.g:3141:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3144:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // InternalScenarioText.g:3146:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_AssignmentExpression_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssignmentExpression_0; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalScenarioText.g:3162:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // InternalScenarioText.g:3163:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // InternalScenarioText.g:3164:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalScenarioText.g:3171:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3174:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // InternalScenarioText.g:3175:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // InternalScenarioText.g:3175:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // InternalScenarioText.g:3176:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_44);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3184:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==32||(LA53_0>=73 && LA53_0<=82)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalScenarioText.g:3184:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // InternalScenarioText.g:3184:2: ()
            	    // InternalScenarioText.g:3185:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:3190:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // InternalScenarioText.g:3191:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // InternalScenarioText.g:3191:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // InternalScenarioText.g:3192:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_operator_2_0=ruleAssignmentOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.yakindu.base.expressions.Expressions.AssignmentOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:3208:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // InternalScenarioText.g:3209:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // InternalScenarioText.g:3209:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // InternalScenarioText.g:3210:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_expression_3_0=ruleConditionalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"expression",
            	              		lv_expression_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.ConditionalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalScenarioText.g:3234:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalScenarioText.g:3235:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalScenarioText.g:3236:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalScenarioText.g:3243:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3246:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // InternalScenarioText.g:3247:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // InternalScenarioText.g:3247:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // InternalScenarioText.g:3248:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_45);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3256:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalScenarioText.g:3256:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // InternalScenarioText.g:3256:2: ()
                    // InternalScenarioText.g:3257:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // InternalScenarioText.g:3266:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // InternalScenarioText.g:3267:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // InternalScenarioText.g:3267:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // InternalScenarioText.g:3268:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_trueCase_3_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"trueCase",
                              		lv_trueCase_3_0, 
                              		"org.yakindu.base.expressions.Expressions.LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // InternalScenarioText.g:3288:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // InternalScenarioText.g:3289:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // InternalScenarioText.g:3289:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // InternalScenarioText.g:3290:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_falseCase_5_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"falseCase",
                              		lv_falseCase_5_0, 
                              		"org.yakindu.base.expressions.Expressions.LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalScenarioText.g:3314:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalScenarioText.g:3315:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalScenarioText.g:3316:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalScenarioText.g:3323:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3326:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalScenarioText.g:3327:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalScenarioText.g:3327:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalScenarioText.g:3328:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_46);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3336:1: ( () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==62) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalScenarioText.g:3336:2: () ruleLogicalOrOperator ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalScenarioText.g:3336:2: ()
            	    // InternalScenarioText.g:3337:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalOrOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_22);
            	    ruleLogicalOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalScenarioText.g:3350:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // InternalScenarioText.g:3351:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalScenarioText.g:3351:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // InternalScenarioText.g:3352:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_rightOperand_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.LogicalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalScenarioText.g:3376:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalScenarioText.g:3377:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalScenarioText.g:3378:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalScenarioText.g:3385:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3388:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // InternalScenarioText.g:3389:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // InternalScenarioText.g:3389:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // InternalScenarioText.g:3390:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_47);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3398:1: ( () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==61) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalScenarioText.g:3398:2: () ruleLogicalAndOperator ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // InternalScenarioText.g:3398:2: ()
            	    // InternalScenarioText.g:3399:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalAndOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_22);
            	    ruleLogicalAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalScenarioText.g:3412:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // InternalScenarioText.g:3413:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // InternalScenarioText.g:3413:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // InternalScenarioText.g:3414:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_rightOperand_3_0=ruleLogicalNotExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.LogicalNotExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // InternalScenarioText.g:3438:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // InternalScenarioText.g:3439:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // InternalScenarioText.g:3440:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalNotExpression"


    // $ANTLR start "ruleLogicalNotExpression"
    // InternalScenarioText.g:3447:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3450:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // InternalScenarioText.g:3451:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // InternalScenarioText.g:3451:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==35||(LA57_0>=53 && LA57_0<=54)||LA57_0==60||(LA57_0>=85 && LA57_0<=86)||LA57_0==89) ) {
                alt57=1;
            }
            else if ( (LA57_0==63) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalScenarioText.g:3452:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BitwiseXorExpression_0=ruleBitwiseXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitwiseXorExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:3461:6: ( () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // InternalScenarioText.g:3461:6: ( () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // InternalScenarioText.g:3461:7: () ruleLogicalNotOperator ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // InternalScenarioText.g:3461:7: ()
                    // InternalScenarioText.g:3462:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getLogicalNotOperatorParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_48);
                    ruleLogicalNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalScenarioText.g:3475:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // InternalScenarioText.g:3476:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // InternalScenarioText.g:3476:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // InternalScenarioText.g:3477:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleBitwiseXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"org.yakindu.base.expressions.Expressions.BitwiseXorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleLogicalNotExpression"


    // $ANTLR start "entryRuleBitwiseXorExpression"
    // InternalScenarioText.g:3501:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // InternalScenarioText.g:3502:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // InternalScenarioText.g:3503:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseXorExpression"


    // $ANTLR start "ruleBitwiseXorExpression"
    // InternalScenarioText.g:3510:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3513:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // InternalScenarioText.g:3514:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // InternalScenarioText.g:3514:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // InternalScenarioText.g:3515:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_49);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3523:1: ( () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==64) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalScenarioText.g:3523:2: () ruleBitwiseXOrOperator ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // InternalScenarioText.g:3523:2: ()
            	    // InternalScenarioText.g:3524:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXOrOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_48);
            	    ruleBitwiseXOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalScenarioText.g:3537:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // InternalScenarioText.g:3538:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // InternalScenarioText.g:3538:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // InternalScenarioText.g:3539:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_rightOperand_3_0=ruleBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.BitwiseOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalScenarioText.g:3563:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalScenarioText.g:3564:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalScenarioText.g:3565:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalScenarioText.g:3572:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3575:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // InternalScenarioText.g:3576:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // InternalScenarioText.g:3576:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // InternalScenarioText.g:3577:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_50);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3585:1: ( () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==65) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalScenarioText.g:3585:2: () ruleBitwiseOrOperator ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // InternalScenarioText.g:3585:2: ()
            	    // InternalScenarioText.g:3586:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_48);
            	    ruleBitwiseOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalScenarioText.g:3599:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // InternalScenarioText.g:3600:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // InternalScenarioText.g:3600:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // InternalScenarioText.g:3601:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_rightOperand_3_0=ruleBitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.BitwiseAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalScenarioText.g:3625:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalScenarioText.g:3626:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalScenarioText.g:3627:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalScenarioText.g:3634:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3637:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // InternalScenarioText.g:3638:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // InternalScenarioText.g:3638:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // InternalScenarioText.g:3639:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_51);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3647:1: ( () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==66) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalScenarioText.g:3647:2: () ruleBitwiseAndOperator ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // InternalScenarioText.g:3647:2: ()
            	    // InternalScenarioText.g:3648:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_48);
            	    ruleBitwiseAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalScenarioText.g:3661:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // InternalScenarioText.g:3662:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // InternalScenarioText.g:3662:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // InternalScenarioText.g:3663:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_rightOperand_3_0=ruleLogicalRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.LogicalRelationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // InternalScenarioText.g:3687:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // InternalScenarioText.g:3688:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // InternalScenarioText.g:3689:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalRelationExpression"


    // $ANTLR start "ruleLogicalRelationExpression"
    // InternalScenarioText.g:3696:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3699:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // InternalScenarioText.g:3700:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // InternalScenarioText.g:3700:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // InternalScenarioText.g:3701:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_52);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3709:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=38 && LA61_0<=39)||(LA61_0>=90 && LA61_0<=93)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalScenarioText.g:3709:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // InternalScenarioText.g:3709:2: ()
            	    // InternalScenarioText.g:3710:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:3715:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalScenarioText.g:3716:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalScenarioText.g:3716:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalScenarioText.g:3717:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.yakindu.base.expressions.Expressions.RelationalOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:3733:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // InternalScenarioText.g:3734:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // InternalScenarioText.g:3734:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // InternalScenarioText.g:3735:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_rightOperand_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.ShiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // InternalScenarioText.g:3759:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // InternalScenarioText.g:3760:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // InternalScenarioText.g:3761:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // InternalScenarioText.g:3768:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3771:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // InternalScenarioText.g:3772:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // InternalScenarioText.g:3772:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // InternalScenarioText.g:3773:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_53);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3781:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=83 && LA62_0<=84)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalScenarioText.g:3781:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // InternalScenarioText.g:3781:2: ()
            	    // InternalScenarioText.g:3782:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:3787:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // InternalScenarioText.g:3788:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // InternalScenarioText.g:3788:1: (lv_operator_2_0= ruleShiftOperator )
            	    // InternalScenarioText.g:3789:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_operator_2_0=ruleShiftOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.yakindu.base.expressions.Expressions.ShiftOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:3805:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // InternalScenarioText.g:3806:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // InternalScenarioText.g:3806:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // InternalScenarioText.g:3807:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_rightOperand_3_0=ruleNumericalAddSubtractExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.NumericalAddSubtractExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // InternalScenarioText.g:3831:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // InternalScenarioText.g:3832:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // InternalScenarioText.g:3833:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericalAddSubtractExpression"


    // $ANTLR start "ruleNumericalAddSubtractExpression"
    // InternalScenarioText.g:3840:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3843:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // InternalScenarioText.g:3844:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // InternalScenarioText.g:3844:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // InternalScenarioText.g:3845:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_54);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3853:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=85 && LA63_0<=86)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalScenarioText.g:3853:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // InternalScenarioText.g:3853:2: ()
            	    // InternalScenarioText.g:3854:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:3859:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalScenarioText.g:3860:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalScenarioText.g:3860:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalScenarioText.g:3861:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalAddSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.yakindu.base.expressions.Expressions.AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:3877:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // InternalScenarioText.g:3878:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // InternalScenarioText.g:3878:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // InternalScenarioText.g:3879:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_rightOperand_3_0=ruleNumericalMultiplyDivideExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalAddSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.NumericalMultiplyDivideExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // InternalScenarioText.g:3903:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // InternalScenarioText.g:3904:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // InternalScenarioText.g:3905:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericalMultiplyDivideExpression"


    // $ANTLR start "ruleNumericalMultiplyDivideExpression"
    // InternalScenarioText.g:3912:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3915:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // InternalScenarioText.g:3916:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // InternalScenarioText.g:3916:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // InternalScenarioText.g:3917:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_55);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:3925:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==41||(LA64_0>=87 && LA64_0<=88)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalScenarioText.g:3925:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // InternalScenarioText.g:3925:2: ()
            	    // InternalScenarioText.g:3926:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:3931:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalScenarioText.g:3932:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalScenarioText.g:3932:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalScenarioText.g:3933:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalMultiplyDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.yakindu.base.expressions.Expressions.MultiplicativeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:3949:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // InternalScenarioText.g:3950:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // InternalScenarioText.g:3950:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // InternalScenarioText.g:3951:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_rightOperand_3_0=ruleNumericalUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalMultiplyDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.yakindu.base.expressions.Expressions.NumericalUnaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // InternalScenarioText.g:3975:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // InternalScenarioText.g:3976:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // InternalScenarioText.g:3977:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericalUnaryExpression"


    // $ANTLR start "ruleNumericalUnaryExpression"
    // InternalScenarioText.g:3984:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_TypeCastExpression_0= ruleTypeCastExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TypeCastExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:3987:28: ( (this_TypeCastExpression_0= ruleTypeCastExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) ) ) ) )
            // InternalScenarioText.g:3988:1: (this_TypeCastExpression_0= ruleTypeCastExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) ) ) )
            {
            // InternalScenarioText.g:3988:1: (this_TypeCastExpression_0= ruleTypeCastExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_STRING)||LA65_0==35||(LA65_0>=53 && LA65_0<=54)||LA65_0==60) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=85 && LA65_0<=86)||LA65_0==89) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalScenarioText.g:3989:5: this_TypeCastExpression_0= ruleTypeCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getTypeCastExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeCastExpression_0=ruleTypeCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeCastExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:3998:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) ) )
                    {
                    // InternalScenarioText.g:3998:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) ) )
                    // InternalScenarioText.g:3998:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleTypeCastExpression ) )
                    {
                    // InternalScenarioText.g:3998:7: ()
                    // InternalScenarioText.g:3999:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalScenarioText.g:4004:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalScenarioText.g:4005:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalScenarioText.g:4005:1: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalScenarioText.g:4006:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_56);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericalUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"org.yakindu.base.expressions.Expressions.UnaryOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:4022:2: ( (lv_operand_3_0= ruleTypeCastExpression ) )
                    // InternalScenarioText.g:4023:1: (lv_operand_3_0= ruleTypeCastExpression )
                    {
                    // InternalScenarioText.g:4023:1: (lv_operand_3_0= ruleTypeCastExpression )
                    // InternalScenarioText.g:4024:3: lv_operand_3_0= ruleTypeCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandTypeCastExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleTypeCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericalUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"org.yakindu.base.expressions.Expressions.TypeCastExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleNumericalUnaryExpression"


    // $ANTLR start "entryRuleTypeCastExpression"
    // InternalScenarioText.g:4048:1: entryRuleTypeCastExpression returns [EObject current=null] : iv_ruleTypeCastExpression= ruleTypeCastExpression EOF ;
    public final EObject entryRuleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCastExpression = null;


        try {
            // InternalScenarioText.g:4049:2: (iv_ruleTypeCastExpression= ruleTypeCastExpression EOF )
            // InternalScenarioText.g:4050:2: iv_ruleTypeCastExpression= ruleTypeCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeCastExpression=ruleTypeCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeCastExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeCastExpression"


    // $ANTLR start "ruleTypeCastExpression"
    // InternalScenarioText.g:4057:1: ruleTypeCastExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= 'as' ) ( ( ruleQID ) ) )* ) ;
    public final EObject ruleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:4060:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= 'as' ) ( ( ruleQID ) ) )* ) )
            // InternalScenarioText.g:4061:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= 'as' ) ( ( ruleQID ) ) )* )
            {
            // InternalScenarioText.g:4061:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= 'as' ) ( ( ruleQID ) ) )* )
            // InternalScenarioText.g:4062:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= 'as' ) ( ( ruleQID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_57);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:4070:1: ( ( () otherlv_2= 'as' ) ( ( ruleQID ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==59) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalScenarioText.g:4070:2: ( () otherlv_2= 'as' ) ( ( ruleQID ) )
            	    {
            	    // InternalScenarioText.g:4070:2: ( () otherlv_2= 'as' )
            	    // InternalScenarioText.g:4070:3: () otherlv_2= 'as'
            	    {
            	    // InternalScenarioText.g:4070:3: ()
            	    // InternalScenarioText.g:4071:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionOperandAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeCastExpressionAccess().getAsKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // InternalScenarioText.g:4080:2: ( ( ruleQID ) )
            	    // InternalScenarioText.g:4081:1: ( ruleQID )
            	    {
            	    // InternalScenarioText.g:4081:1: ( ruleQID )
            	    // InternalScenarioText.g:4082:3: ruleQID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTypeCastExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getTypeTypeCrossReference_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_57);
            	    ruleQID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // $ANTLR end "ruleTypeCastExpression"


    // $ANTLR start "entryRulePrimitiveValueExpression"
    // InternalScenarioText.g:4103:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // InternalScenarioText.g:4104:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // InternalScenarioText.g:4105:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveValueExpression"


    // $ANTLR start "rulePrimitiveValueExpression"
    // InternalScenarioText.g:4112:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:4115:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // InternalScenarioText.g:4116:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // InternalScenarioText.g:4116:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // InternalScenarioText.g:4116:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // InternalScenarioText.g:4116:2: ()
            // InternalScenarioText.g:4117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4122:2: ( (lv_value_1_0= ruleLiteral ) )
            // InternalScenarioText.g:4123:1: (lv_value_1_0= ruleLiteral )
            {
            // InternalScenarioText.g:4123:1: (lv_value_1_0= ruleLiteral )
            // InternalScenarioText.g:4124:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.yakindu.base.expressions.Expressions.Literal");
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
    // $ANTLR end "rulePrimitiveValueExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalScenarioText.g:4148:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // InternalScenarioText.g:4149:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // InternalScenarioText.g:4150:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalScenarioText.g:4157:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )? )* ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_operationCall_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_arrayAccess_9_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_ElementReferenceExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;

        EObject lv_arraySelector_10_0 = null;

        EObject lv_arraySelector_13_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:4160:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )? )* ) )
            // InternalScenarioText.g:4161:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )? )* )
            {
            // InternalScenarioText.g:4161:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )? )* )
            // InternalScenarioText.g:4162:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_18);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalScenarioText.g:4170:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )? )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==26) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalScenarioText.g:4170:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )?
            	    {
            	    // InternalScenarioText.g:4170:2: ()
            	    // InternalScenarioText.g:4171:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // InternalScenarioText.g:4180:1: ( (otherlv_3= RULE_ID ) )
            	    // InternalScenarioText.g:4181:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalScenarioText.g:4181:1: (otherlv_3= RULE_ID )
            	    // InternalScenarioText.g:4182:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // InternalScenarioText.g:4193:2: ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )?
            	    int alt70=3;
            	    alt70 = dfa70.predict(input);
            	    switch (alt70) {
            	        case 1 :
            	            // InternalScenarioText.g:4193:3: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )
            	            {
            	            // InternalScenarioText.g:4193:3: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )
            	            // InternalScenarioText.g:4193:4: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalScenarioText.g:4193:4: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // InternalScenarioText.g:4193:5: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // InternalScenarioText.g:4200:1: (lv_operationCall_4_0= '(' )
            	            // InternalScenarioText.g:4201:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operationCall_4_0, grammarAccess.getFeatureCallAccess().getOperationCallLeftParenthesisKeyword_1_3_0_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // InternalScenarioText.g:4214:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt68=2;
            	            int LA68_0 = input.LA(1);

            	            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_STRING)||LA68_0==35||(LA68_0>=53 && LA68_0<=54)||LA68_0==60||LA68_0==63||(LA68_0>=85 && LA68_0<=86)||LA68_0==89) ) {
            	                alt68=1;
            	            }
            	            switch (alt68) {
            	                case 1 :
            	                    // InternalScenarioText.g:4214:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // InternalScenarioText.g:4214:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // InternalScenarioText.g:4215:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // InternalScenarioText.g:4215:1: (lv_args_5_0= ruleExpression )
            	                    // InternalScenarioText.g:4216:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_0_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_25);
            	                    lv_args_5_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"args",
            	                              		lv_args_5_0, 
            	                              		"org.yakindu.base.expressions.Expressions.Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // InternalScenarioText.g:4232:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop67:
            	                    do {
            	                        int alt67=2;
            	                        int LA67_0 = input.LA(1);

            	                        if ( (LA67_0==36) ) {
            	                            alt67=1;
            	                        }


            	                        switch (alt67) {
            	                    	case 1 :
            	                    	    // InternalScenarioText.g:4232:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,36,FOLLOW_22); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_0_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // InternalScenarioText.g:4236:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // InternalScenarioText.g:4237:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // InternalScenarioText.g:4237:1: (lv_args_7_0= ruleExpression )
            	                    	    // InternalScenarioText.g:4238:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_0_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_25);
            	                    	    lv_args_7_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"args",
            	                    	              		lv_args_7_0, 
            	                    	              		"org.yakindu.base.expressions.Expressions.Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop67;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,37,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_0_2());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalScenarioText.g:4259:6: ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* )
            	            {
            	            // InternalScenarioText.g:4259:6: ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* )
            	            // InternalScenarioText.g:4259:7: ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )*
            	            {
            	            // InternalScenarioText.g:4259:7: ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            	            // InternalScenarioText.g:4259:8: ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' )
            	            {
            	            // InternalScenarioText.g:4270:5: ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' )
            	            // InternalScenarioText.g:4270:6: ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']'
            	            {
            	            // InternalScenarioText.g:4270:6: ( (lv_arrayAccess_9_0= '[' ) )
            	            // InternalScenarioText.g:4271:1: (lv_arrayAccess_9_0= '[' )
            	            {
            	            // InternalScenarioText.g:4271:1: (lv_arrayAccess_9_0= '[' )
            	            // InternalScenarioText.g:4272:3: lv_arrayAccess_9_0= '['
            	            {
            	            lv_arrayAccess_9_0=(Token)match(input,43,FOLLOW_22); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_arrayAccess_9_0, grammarAccess.getFeatureCallAccess().getArrayAccessLeftSquareBracketKeyword_1_3_1_0_0_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "arrayAccess", true, "[");
            	              	    
            	            }

            	            }


            	            }

            	            // InternalScenarioText.g:4285:2: ( (lv_arraySelector_10_0= ruleExpression ) )
            	            // InternalScenarioText.g:4286:1: (lv_arraySelector_10_0= ruleExpression )
            	            {
            	            // InternalScenarioText.g:4286:1: (lv_arraySelector_10_0= ruleExpression )
            	            // InternalScenarioText.g:4287:3: lv_arraySelector_10_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArraySelectorExpressionParserRuleCall_1_3_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_36);
            	            lv_arraySelector_10_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"arraySelector",
            	                      		lv_arraySelector_10_0, 
            	                      		"org.yakindu.base.expressions.Expressions.Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            otherlv_11=(Token)match(input,44,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_11, grammarAccess.getFeatureCallAccess().getRightSquareBracketKeyword_1_3_1_0_0_2());
            	                  
            	            }

            	            }


            	            }

            	            // InternalScenarioText.g:4307:3: ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                alt69 = dfa69.predict(input);
            	                switch (alt69) {
            	            	case 1 :
            	            	    // InternalScenarioText.g:4307:4: ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' )
            	            	    {
            	            	    // InternalScenarioText.g:4313:5: (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' )
            	            	    // InternalScenarioText.g:4313:7: otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']'
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_22); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getFeatureCallAccess().getLeftSquareBracketKeyword_1_3_1_1_0_0());
            	            	          
            	            	    }
            	            	    // InternalScenarioText.g:4317:1: ( (lv_arraySelector_13_0= ruleExpression ) )
            	            	    // InternalScenarioText.g:4318:1: (lv_arraySelector_13_0= ruleExpression )
            	            	    {
            	            	    // InternalScenarioText.g:4318:1: (lv_arraySelector_13_0= ruleExpression )
            	            	    // InternalScenarioText.g:4319:3: lv_arraySelector_13_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArraySelectorExpressionParserRuleCall_1_3_1_1_0_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_36);
            	            	    lv_arraySelector_13_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"arraySelector",
            	            	              		lv_arraySelector_13_0, 
            	            	              		"org.yakindu.base.expressions.Expressions.Expression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }

            	            	    otherlv_14=(Token)match(input,44,FOLLOW_59); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_14, grammarAccess.getFeatureCallAccess().getRightSquareBracketKeyword_1_3_1_1_0_2());
            	            	          
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop69;
            	                }
            	            } while (true);


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // InternalScenarioText.g:4347:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalScenarioText.g:4348:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalScenarioText.g:4349:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // InternalScenarioText.g:4356:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )? ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_arrayAccess_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_arraySelector_8_0 = null;

        EObject lv_arraySelector_11_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:4359:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )? ) )
            // InternalScenarioText.g:4360:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )? )
            {
            // InternalScenarioText.g:4360:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )? )
            // InternalScenarioText.g:4360:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )?
            {
            // InternalScenarioText.g:4360:2: ()
            // InternalScenarioText.g:4361:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4366:2: ( (otherlv_1= RULE_ID ) )
            // InternalScenarioText.g:4367:1: (otherlv_1= RULE_ID )
            {
            // InternalScenarioText.g:4367:1: (otherlv_1= RULE_ID )
            // InternalScenarioText.g:4368:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalScenarioText.g:4379:2: ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )?
            int alt75=3;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalScenarioText.g:4379:3: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
                    {
                    // InternalScenarioText.g:4379:3: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
                    // InternalScenarioText.g:4379:4: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // InternalScenarioText.g:4379:4: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // InternalScenarioText.g:4379:5: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // InternalScenarioText.g:4386:1: (lv_operationCall_2_0= '(' )
                    // InternalScenarioText.g:4387:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operationCall_2_0, grammarAccess.getElementReferenceExpressionAccess().getOperationCallLeftParenthesisKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "operationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:4400:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_STRING)||LA73_0==35||(LA73_0>=53 && LA73_0<=54)||LA73_0==60||LA73_0==63||(LA73_0>=85 && LA73_0<=86)||LA73_0==89) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalScenarioText.g:4400:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // InternalScenarioText.g:4400:3: ( (lv_args_3_0= ruleExpression ) )
                            // InternalScenarioText.g:4401:1: (lv_args_3_0= ruleExpression )
                            {
                            // InternalScenarioText.g:4401:1: (lv_args_3_0= ruleExpression )
                            // InternalScenarioText.g:4402:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_25);
                            lv_args_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_3_0, 
                                      		"org.yakindu.base.expressions.Expressions.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalScenarioText.g:4418:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==36) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // InternalScenarioText.g:4418:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,36,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_0_1_1_0());
                            	          
                            	    }
                            	    // InternalScenarioText.g:4422:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // InternalScenarioText.g:4423:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // InternalScenarioText.g:4423:1: (lv_args_5_0= ruleExpression )
                            	    // InternalScenarioText.g:4424:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_25);
                            	    lv_args_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_5_0, 
                            	              		"org.yakindu.base.expressions.Expressions.Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop72;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getElementReferenceExpressionAccess().getRightParenthesisKeyword_2_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:4445:6: ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* )
                    {
                    // InternalScenarioText.g:4445:6: ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* )
                    // InternalScenarioText.g:4445:7: ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )*
                    {
                    // InternalScenarioText.g:4445:7: ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) )
                    // InternalScenarioText.g:4445:8: ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // InternalScenarioText.g:4456:5: ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // InternalScenarioText.g:4456:6: ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    // InternalScenarioText.g:4456:6: ( (lv_arrayAccess_7_0= '[' ) )
                    // InternalScenarioText.g:4457:1: (lv_arrayAccess_7_0= '[' )
                    {
                    // InternalScenarioText.g:4457:1: (lv_arrayAccess_7_0= '[' )
                    // InternalScenarioText.g:4458:3: lv_arrayAccess_7_0= '['
                    {
                    lv_arrayAccess_7_0=(Token)match(input,43,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_arrayAccess_7_0, grammarAccess.getElementReferenceExpressionAccess().getArrayAccessLeftSquareBracketKeyword_2_1_0_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "arrayAccess", true, "[");
                      	    
                    }

                    }


                    }

                    // InternalScenarioText.g:4471:2: ( (lv_arraySelector_8_0= ruleExpression ) )
                    // InternalScenarioText.g:4472:1: (lv_arraySelector_8_0= ruleExpression )
                    {
                    // InternalScenarioText.g:4472:1: (lv_arraySelector_8_0= ruleExpression )
                    // InternalScenarioText.g:4473:3: lv_arraySelector_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArraySelectorExpressionParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
                    lv_arraySelector_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"arraySelector",
                              		lv_arraySelector_8_0, 
                              		"org.yakindu.base.expressions.Expressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,44,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getElementReferenceExpressionAccess().getRightSquareBracketKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // InternalScenarioText.g:4493:3: ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )*
                    loop74:
                    do {
                        int alt74=2;
                        alt74 = dfa74.predict(input);
                        switch (alt74) {
                    	case 1 :
                    	    // InternalScenarioText.g:4493:4: ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' )
                    	    {
                    	    // InternalScenarioText.g:4499:5: (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' )
                    	    // InternalScenarioText.g:4499:7: otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']'
                    	    {
                    	    otherlv_10=(Token)match(input,43,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getElementReferenceExpressionAccess().getLeftSquareBracketKeyword_2_1_1_0_0());
                    	          
                    	    }
                    	    // InternalScenarioText.g:4503:1: ( (lv_arraySelector_11_0= ruleExpression ) )
                    	    // InternalScenarioText.g:4504:1: (lv_arraySelector_11_0= ruleExpression )
                    	    {
                    	    // InternalScenarioText.g:4504:1: (lv_arraySelector_11_0= ruleExpression )
                    	    // InternalScenarioText.g:4505:3: lv_arraySelector_11_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArraySelectorExpressionParserRuleCall_2_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_arraySelector_11_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arraySelector",
                    	              		lv_arraySelector_11_0, 
                    	              		"org.yakindu.base.expressions.Expressions.Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,44,FOLLOW_61); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getElementReferenceExpressionAccess().getRightSquareBracketKeyword_2_1_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


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
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // InternalScenarioText.g:4533:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // InternalScenarioText.g:4534:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // InternalScenarioText.g:4535:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // InternalScenarioText.g:4542:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:4545:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalScenarioText.g:4546:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalScenarioText.g:4546:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalScenarioText.g:4546:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalScenarioText.g:4546:2: ()
            // InternalScenarioText.g:4547:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalScenarioText.g:4556:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalScenarioText.g:4557:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalScenarioText.g:4557:1: (lv_expression_2_0= ruleExpression )
            // InternalScenarioText.g:4558:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"org.yakindu.base.expressions.Expressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalScenarioText.g:4586:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalScenarioText.g:4587:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalScenarioText.g:4588:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalScenarioText.g:4595:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_DoubleLiteral_3= ruleDoubleLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_StringLiteral_5= ruleStringLiteral | this_NullLiteral_6= ruleNullLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_DoubleLiteral_3 = null;

        EObject this_FloatLiteral_4 = null;

        EObject this_StringLiteral_5 = null;

        EObject this_NullLiteral_6 = null;


         enterRule(); 
            
        try {
            // InternalScenarioText.g:4598:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_DoubleLiteral_3= ruleDoubleLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_StringLiteral_5= ruleStringLiteral | this_NullLiteral_6= ruleNullLiteral ) )
            // InternalScenarioText.g:4599:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_DoubleLiteral_3= ruleDoubleLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_StringLiteral_5= ruleStringLiteral | this_NullLiteral_6= ruleNullLiteral )
            {
            // InternalScenarioText.g:4599:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_DoubleLiteral_3= ruleDoubleLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_StringLiteral_5= ruleStringLiteral | this_NullLiteral_6= ruleNullLiteral )
            int alt76=7;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt76=1;
                }
                break;
            case RULE_INT:
                {
                alt76=2;
                }
                break;
            case RULE_HEX:
                {
                alt76=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt76=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt76=5;
                }
                break;
            case RULE_STRING:
                {
                alt76=6;
                }
                break;
            case 60:
                {
                alt76=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalScenarioText.g:4600:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:4610:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:4620:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_HexLiteral_2=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HexLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:4630:5: this_DoubleLiteral_3= ruleDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getDoubleLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_DoubleLiteral_3=ruleDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalScenarioText.g:4640:5: this_FloatLiteral_4= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FloatLiteral_4=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalScenarioText.g:4650:5: this_StringLiteral_5= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_5=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalScenarioText.g:4660:5: this_NullLiteral_6= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_NullLiteral_6=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_6; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalScenarioText.g:4676:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalScenarioText.g:4677:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalScenarioText.g:4678:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalScenarioText.g:4685:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4688:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // InternalScenarioText.g:4689:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // InternalScenarioText.g:4689:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // InternalScenarioText.g:4689:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // InternalScenarioText.g:4689:2: ()
            // InternalScenarioText.g:4690:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4695:2: ( (lv_value_1_0= RULE_BOOL ) )
            // InternalScenarioText.g:4696:1: (lv_value_1_0= RULE_BOOL )
            {
            // InternalScenarioText.g:4696:1: (lv_value_1_0= RULE_BOOL )
            // InternalScenarioText.g:4697:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.yakindu.base.expressions.Expressions.BOOL");
              	    
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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalScenarioText.g:4721:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalScenarioText.g:4722:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalScenarioText.g:4723:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalScenarioText.g:4730:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4733:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalScenarioText.g:4734:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalScenarioText.g:4734:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalScenarioText.g:4734:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalScenarioText.g:4734:2: ()
            // InternalScenarioText.g:4735:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4740:2: ( (lv_value_1_0= RULE_INT ) )
            // InternalScenarioText.g:4741:1: (lv_value_1_0= RULE_INT )
            {
            // InternalScenarioText.g:4741:1: (lv_value_1_0= RULE_INT )
            // InternalScenarioText.g:4742:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalScenarioText.g:4766:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // InternalScenarioText.g:4767:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalScenarioText.g:4768:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalScenarioText.g:4775:1: ruleDoubleLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4778:28: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // InternalScenarioText.g:4779:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // InternalScenarioText.g:4779:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // InternalScenarioText.g:4779:2: () ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // InternalScenarioText.g:4779:2: ()
            // InternalScenarioText.g:4780:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDoubleLiteralAccess().getDoubleLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4785:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // InternalScenarioText.g:4786:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // InternalScenarioText.g:4786:1: (lv_value_1_0= RULE_DOUBLE )
            // InternalScenarioText.g:4787:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoubleLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.yakindu.base.expressions.Expressions.DOUBLE");
              	    
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
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalScenarioText.g:4811:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalScenarioText.g:4812:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalScenarioText.g:4813:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalScenarioText.g:4820:1: ruleFloatLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4823:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // InternalScenarioText.g:4824:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // InternalScenarioText.g:4824:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // InternalScenarioText.g:4824:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // InternalScenarioText.g:4824:2: ()
            // InternalScenarioText.g:4825:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFloatLiteralAccess().getFloatLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4830:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // InternalScenarioText.g:4831:1: (lv_value_1_0= RULE_FLOAT )
            {
            // InternalScenarioText.g:4831:1: (lv_value_1_0= RULE_FLOAT )
            // InternalScenarioText.g:4832:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.yakindu.base.expressions.Expressions.FLOAT");
              	    
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleHexLiteral"
    // InternalScenarioText.g:4856:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalScenarioText.g:4857:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalScenarioText.g:4858:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHexLiteral"


    // $ANTLR start "ruleHexLiteral"
    // InternalScenarioText.g:4865:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4868:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // InternalScenarioText.g:4869:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // InternalScenarioText.g:4869:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // InternalScenarioText.g:4869:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // InternalScenarioText.g:4869:2: ()
            // InternalScenarioText.g:4870:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4875:2: ( (lv_value_1_0= RULE_HEX ) )
            // InternalScenarioText.g:4876:1: (lv_value_1_0= RULE_HEX )
            {
            // InternalScenarioText.g:4876:1: (lv_value_1_0= RULE_HEX )
            // InternalScenarioText.g:4877:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getHexLiteralAccess().getValueHEXTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHexLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.yakindu.base.expressions.Expressions.HEX");
              	    
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
    // $ANTLR end "ruleHexLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalScenarioText.g:4901:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalScenarioText.g:4902:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalScenarioText.g:4903:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalScenarioText.g:4910:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4913:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalScenarioText.g:4914:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalScenarioText.g:4914:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalScenarioText.g:4914:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalScenarioText.g:4914:2: ()
            // InternalScenarioText.g:4915:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalScenarioText.g:4920:2: ( (lv_value_1_0= RULE_STRING ) )
            // InternalScenarioText.g:4921:1: (lv_value_1_0= RULE_STRING )
            {
            // InternalScenarioText.g:4921:1: (lv_value_1_0= RULE_STRING )
            // InternalScenarioText.g:4922:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // InternalScenarioText.g:4946:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // InternalScenarioText.g:4947:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // InternalScenarioText.g:4948:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // InternalScenarioText.g:4955:1: ruleNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4958:28: ( ( () otherlv_1= 'null' ) )
            // InternalScenarioText.g:4959:1: ( () otherlv_1= 'null' )
            {
            // InternalScenarioText.g:4959:1: ( () otherlv_1= 'null' )
            // InternalScenarioText.g:4959:2: () otherlv_1= 'null'
            {
            // InternalScenarioText.g:4959:2: ()
            // InternalScenarioText.g:4960:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleLogicalAndOperator"
    // InternalScenarioText.g:4977:1: entryRuleLogicalAndOperator returns [String current=null] : iv_ruleLogicalAndOperator= ruleLogicalAndOperator EOF ;
    public final String entryRuleLogicalAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalAndOperator = null;


        try {
            // InternalScenarioText.g:4978:2: (iv_ruleLogicalAndOperator= ruleLogicalAndOperator EOF )
            // InternalScenarioText.g:4979:2: iv_ruleLogicalAndOperator= ruleLogicalAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndOperator=ruleLogicalAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalScenarioText.g:4986:1: ruleLogicalAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleLogicalAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:4989:28: (kw= '&&' )
            // InternalScenarioText.g:4991:2: kw= '&&'
            {
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLogicalAndOperatorAccess().getAmpersandAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "entryRuleLogicalOrOperator"
    // InternalScenarioText.g:5004:1: entryRuleLogicalOrOperator returns [String current=null] : iv_ruleLogicalOrOperator= ruleLogicalOrOperator EOF ;
    public final String entryRuleLogicalOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOrOperator = null;


        try {
            // InternalScenarioText.g:5005:2: (iv_ruleLogicalOrOperator= ruleLogicalOrOperator EOF )
            // InternalScenarioText.g:5006:2: iv_ruleLogicalOrOperator= ruleLogicalOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrOperator=ruleLogicalOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalScenarioText.g:5013:1: ruleLogicalOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleLogicalOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:5016:28: (kw= '||' )
            // InternalScenarioText.g:5018:2: kw= '||'
            {
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLogicalOrOperatorAccess().getVerticalLineVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "entryRuleLogicalNotOperator"
    // InternalScenarioText.g:5031:1: entryRuleLogicalNotOperator returns [String current=null] : iv_ruleLogicalNotOperator= ruleLogicalNotOperator EOF ;
    public final String entryRuleLogicalNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalNotOperator = null;


        try {
            // InternalScenarioText.g:5032:2: (iv_ruleLogicalNotOperator= ruleLogicalNotOperator EOF )
            // InternalScenarioText.g:5033:2: iv_ruleLogicalNotOperator= ruleLogicalNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNotOperator=ruleLogicalNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalNotOperator"


    // $ANTLR start "ruleLogicalNotOperator"
    // InternalScenarioText.g:5040:1: ruleLogicalNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!' ;
    public final AntlrDatatypeRuleToken ruleLogicalNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:5043:28: (kw= '!' )
            // InternalScenarioText.g:5045:2: kw= '!'
            {
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLogicalNotOperatorAccess().getExclamationMarkKeyword()); 
                  
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
    // $ANTLR end "ruleLogicalNotOperator"


    // $ANTLR start "entryRuleBitwiseXOrOperator"
    // InternalScenarioText.g:5058:1: entryRuleBitwiseXOrOperator returns [String current=null] : iv_ruleBitwiseXOrOperator= ruleBitwiseXOrOperator EOF ;
    public final String entryRuleBitwiseXOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBitwiseXOrOperator = null;


        try {
            // InternalScenarioText.g:5059:2: (iv_ruleBitwiseXOrOperator= ruleBitwiseXOrOperator EOF )
            // InternalScenarioText.g:5060:2: iv_ruleBitwiseXOrOperator= ruleBitwiseXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseXOrOperator=ruleBitwiseXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXOrOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseXOrOperator"


    // $ANTLR start "ruleBitwiseXOrOperator"
    // InternalScenarioText.g:5067:1: ruleBitwiseXOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '^' ;
    public final AntlrDatatypeRuleToken ruleBitwiseXOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:5070:28: (kw= '^' )
            // InternalScenarioText.g:5072:2: kw= '^'
            {
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBitwiseXOrOperatorAccess().getCircumflexAccentKeyword()); 
                  
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
    // $ANTLR end "ruleBitwiseXOrOperator"


    // $ANTLR start "entryRuleBitwiseOrOperator"
    // InternalScenarioText.g:5085:1: entryRuleBitwiseOrOperator returns [String current=null] : iv_ruleBitwiseOrOperator= ruleBitwiseOrOperator EOF ;
    public final String entryRuleBitwiseOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBitwiseOrOperator = null;


        try {
            // InternalScenarioText.g:5086:2: (iv_ruleBitwiseOrOperator= ruleBitwiseOrOperator EOF )
            // InternalScenarioText.g:5087:2: iv_ruleBitwiseOrOperator= ruleBitwiseOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseOrOperator=ruleBitwiseOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalScenarioText.g:5094:1: ruleBitwiseOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleBitwiseOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:5097:28: (kw= '|' )
            // InternalScenarioText.g:5099:2: kw= '|'
            {
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBitwiseOrOperatorAccess().getVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "entryRuleBitwiseAndOperator"
    // InternalScenarioText.g:5112:1: entryRuleBitwiseAndOperator returns [String current=null] : iv_ruleBitwiseAndOperator= ruleBitwiseAndOperator EOF ;
    public final String entryRuleBitwiseAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBitwiseAndOperator = null;


        try {
            // InternalScenarioText.g:5113:2: (iv_ruleBitwiseAndOperator= ruleBitwiseAndOperator EOF )
            // InternalScenarioText.g:5114:2: iv_ruleBitwiseAndOperator= ruleBitwiseAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseAndOperator=ruleBitwiseAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseAndOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalScenarioText.g:5121:1: ruleBitwiseAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleBitwiseAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalScenarioText.g:5124:28: (kw= '&' )
            // InternalScenarioText.g:5126:2: kw= '&'
            {
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBitwiseAndOperatorAccess().getAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleDirection"
    // InternalScenarioText.g:5139:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5141:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // InternalScenarioText.g:5142:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalScenarioText.g:5142:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt77=1;
                }
                break;
            case 56:
                {
                alt77=2;
                }
                break;
            case 57:
                {
                alt77=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalScenarioText.g:5142:2: (enumLiteral_0= 'local' )
                    {
                    // InternalScenarioText.g:5142:2: (enumLiteral_0= 'local' )
                    // InternalScenarioText.g:5142:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5148:6: (enumLiteral_1= 'in' )
                    {
                    // InternalScenarioText.g:5148:6: (enumLiteral_1= 'in' )
                    // InternalScenarioText.g:5148:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5154:6: (enumLiteral_2= 'out' )
                    {
                    // InternalScenarioText.g:5154:6: (enumLiteral_2= 'out' )
                    // InternalScenarioText.g:5154:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTimeEventType"
    // InternalScenarioText.g:5164:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5166:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // InternalScenarioText.g:5167:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // InternalScenarioText.g:5167:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==67) ) {
                alt78=1;
            }
            else if ( (LA78_0==68) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalScenarioText.g:5167:2: (enumLiteral_0= 'after' )
                    {
                    // InternalScenarioText.g:5167:2: (enumLiteral_0= 'after' )
                    // InternalScenarioText.g:5167:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5173:6: (enumLiteral_1= 'every' )
                    {
                    // InternalScenarioText.g:5173:6: (enumLiteral_1= 'every' )
                    // InternalScenarioText.g:5173:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getEveryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeEventTypeAccess().getEveryEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleTimeEventType"


    // $ANTLR start "ruleTimeUnit"
    // InternalScenarioText.g:5183:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5185:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // InternalScenarioText.g:5186:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // InternalScenarioText.g:5186:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt79=1;
                }
                break;
            case 70:
                {
                alt79=2;
                }
                break;
            case 71:
                {
                alt79=3;
                }
                break;
            case 72:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalScenarioText.g:5186:2: (enumLiteral_0= 's' )
                    {
                    // InternalScenarioText.g:5186:2: (enumLiteral_0= 's' )
                    // InternalScenarioText.g:5186:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5192:6: (enumLiteral_1= 'ms' )
                    {
                    // InternalScenarioText.g:5192:6: (enumLiteral_1= 'ms' )
                    // InternalScenarioText.g:5192:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5198:6: (enumLiteral_2= 'us' )
                    {
                    // InternalScenarioText.g:5198:6: (enumLiteral_2= 'us' )
                    // InternalScenarioText.g:5198:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:5204:6: (enumLiteral_3= 'ns' )
                    {
                    // InternalScenarioText.g:5204:6: (enumLiteral_3= 'ns' )
                    // InternalScenarioText.g:5204:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getNanosecondEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getNanosecondEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleAssignmentOperator"
    // InternalScenarioText.g:5214:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
    public final Enumerator ruleAssignmentOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5216:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // InternalScenarioText.g:5217:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // InternalScenarioText.g:5217:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt80=11;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt80=1;
                }
                break;
            case 73:
                {
                alt80=2;
                }
                break;
            case 74:
                {
                alt80=3;
                }
                break;
            case 75:
                {
                alt80=4;
                }
                break;
            case 76:
                {
                alt80=5;
                }
                break;
            case 77:
                {
                alt80=6;
                }
                break;
            case 78:
                {
                alt80=7;
                }
                break;
            case 79:
                {
                alt80=8;
                }
                break;
            case 80:
                {
                alt80=9;
                }
                break;
            case 81:
                {
                alt80=10;
                }
                break;
            case 82:
                {
                alt80=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalScenarioText.g:5217:2: (enumLiteral_0= '=' )
                    {
                    // InternalScenarioText.g:5217:2: (enumLiteral_0= '=' )
                    // InternalScenarioText.g:5217:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5223:6: (enumLiteral_1= '*=' )
                    {
                    // InternalScenarioText.g:5223:6: (enumLiteral_1= '*=' )
                    // InternalScenarioText.g:5223:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5229:6: (enumLiteral_2= '/=' )
                    {
                    // InternalScenarioText.g:5229:6: (enumLiteral_2= '/=' )
                    // InternalScenarioText.g:5229:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:5235:6: (enumLiteral_3= '%=' )
                    {
                    // InternalScenarioText.g:5235:6: (enumLiteral_3= '%=' )
                    // InternalScenarioText.g:5235:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalScenarioText.g:5241:6: (enumLiteral_4= '+=' )
                    {
                    // InternalScenarioText.g:5241:6: (enumLiteral_4= '+=' )
                    // InternalScenarioText.g:5241:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalScenarioText.g:5247:6: (enumLiteral_5= '-=' )
                    {
                    // InternalScenarioText.g:5247:6: (enumLiteral_5= '-=' )
                    // InternalScenarioText.g:5247:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalScenarioText.g:5253:6: (enumLiteral_6= '<<=' )
                    {
                    // InternalScenarioText.g:5253:6: (enumLiteral_6= '<<=' )
                    // InternalScenarioText.g:5253:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalScenarioText.g:5259:6: (enumLiteral_7= '>>=' )
                    {
                    // InternalScenarioText.g:5259:6: (enumLiteral_7= '>>=' )
                    // InternalScenarioText.g:5259:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalScenarioText.g:5265:6: (enumLiteral_8= '&=' )
                    {
                    // InternalScenarioText.g:5265:6: (enumLiteral_8= '&=' )
                    // InternalScenarioText.g:5265:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalScenarioText.g:5271:6: (enumLiteral_9= '^=' )
                    {
                    // InternalScenarioText.g:5271:6: (enumLiteral_9= '^=' )
                    // InternalScenarioText.g:5271:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalScenarioText.g:5277:6: (enumLiteral_10= '|=' )
                    {
                    // InternalScenarioText.g:5277:6: (enumLiteral_10= '|=' )
                    // InternalScenarioText.g:5277:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getOrAssignEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOperatorAccess().getOrAssignEnumLiteralDeclaration_10()); 
                          
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
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "ruleShiftOperator"
    // InternalScenarioText.g:5287:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5289:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // InternalScenarioText.g:5290:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // InternalScenarioText.g:5290:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==83) ) {
                alt81=1;
            }
            else if ( (LA81_0==84) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalScenarioText.g:5290:2: (enumLiteral_0= '<<' )
                    {
                    // InternalScenarioText.g:5290:2: (enumLiteral_0= '<<' )
                    // InternalScenarioText.g:5290:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5296:6: (enumLiteral_1= '>>' )
                    {
                    // InternalScenarioText.g:5296:6: (enumLiteral_1= '>>' )
                    // InternalScenarioText.g:5296:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getShiftOperatorAccess().getRightEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleShiftOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalScenarioText.g:5306:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5308:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalScenarioText.g:5309:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalScenarioText.g:5309:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==85) ) {
                alt82=1;
            }
            else if ( (LA82_0==86) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalScenarioText.g:5309:2: (enumLiteral_0= '+' )
                    {
                    // InternalScenarioText.g:5309:2: (enumLiteral_0= '+' )
                    // InternalScenarioText.g:5309:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5315:6: (enumLiteral_1= '-' )
                    {
                    // InternalScenarioText.g:5315:6: (enumLiteral_1= '-' )
                    // InternalScenarioText.g:5315:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalScenarioText.g:5325:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5327:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalScenarioText.g:5328:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalScenarioText.g:5328:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt83=1;
                }
                break;
            case 41:
                {
                alt83=2;
                }
                break;
            case 88:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalScenarioText.g:5328:2: (enumLiteral_0= '*' )
                    {
                    // InternalScenarioText.g:5328:2: (enumLiteral_0= '*' )
                    // InternalScenarioText.g:5328:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5334:6: (enumLiteral_1= '/' )
                    {
                    // InternalScenarioText.g:5334:6: (enumLiteral_1= '/' )
                    // InternalScenarioText.g:5334:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5340:6: (enumLiteral_2= '%' )
                    {
                    // InternalScenarioText.g:5340:6: (enumLiteral_2= '%' )
                    // InternalScenarioText.g:5340:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getModEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getModEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalScenarioText.g:5350:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5352:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // InternalScenarioText.g:5353:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // InternalScenarioText.g:5353:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt84=1;
                }
                break;
            case 86:
                {
                alt84=2;
                }
                break;
            case 89:
                {
                alt84=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalScenarioText.g:5353:2: (enumLiteral_0= '+' )
                    {
                    // InternalScenarioText.g:5353:2: (enumLiteral_0= '+' )
                    // InternalScenarioText.g:5353:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5359:6: (enumLiteral_1= '-' )
                    {
                    // InternalScenarioText.g:5359:6: (enumLiteral_1= '-' )
                    // InternalScenarioText.g:5359:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5365:6: (enumLiteral_2= '~' )
                    {
                    // InternalScenarioText.g:5365:6: (enumLiteral_2= '~' )
                    // InternalScenarioText.g:5365:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getComplementEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getComplementEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalScenarioText.g:5375:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalScenarioText.g:5377:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // InternalScenarioText.g:5378:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalScenarioText.g:5378:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt85=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt85=1;
                }
                break;
            case 90:
                {
                alt85=2;
                }
                break;
            case 39:
                {
                alt85=3;
                }
                break;
            case 91:
                {
                alt85=4;
                }
                break;
            case 92:
                {
                alt85=5;
                }
                break;
            case 93:
                {
                alt85=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalScenarioText.g:5378:2: (enumLiteral_0= '<' )
                    {
                    // InternalScenarioText.g:5378:2: (enumLiteral_0= '<' )
                    // InternalScenarioText.g:5378:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5384:6: (enumLiteral_1= '<=' )
                    {
                    // InternalScenarioText.g:5384:6: (enumLiteral_1= '<=' )
                    // InternalScenarioText.g:5384:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5390:6: (enumLiteral_2= '>' )
                    {
                    // InternalScenarioText.g:5390:6: (enumLiteral_2= '>' )
                    // InternalScenarioText.g:5390:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:5396:6: (enumLiteral_3= '>=' )
                    {
                    // InternalScenarioText.g:5396:6: (enumLiteral_3= '>=' )
                    // InternalScenarioText.g:5396:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalScenarioText.g:5402:6: (enumLiteral_4= '==' )
                    {
                    // InternalScenarioText.g:5402:6: (enumLiteral_4= '==' )
                    // InternalScenarioText.g:5402:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalScenarioText.g:5408:6: (enumLiteral_5= '!=' )
                    {
                    // InternalScenarioText.g:5408:6: (enumLiteral_5= '!=' )
                    // InternalScenarioText.g:5408:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getNotEqualsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getNotEqualsEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleRelationalOperator"

    // $ANTLR start synpred2_InternalScenarioText
    public final void synpred2_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:1761:6: ( '[' )
        // InternalScenarioText.g:1761:8: '['
        {
        match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalScenarioText

    // $ANTLR start synpred3_InternalScenarioText
    public final void synpred3_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:1959:4: ( ';' )
        // InternalScenarioText.g:1959:6: ';'
        {
        match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalScenarioText

    // $ANTLR start synpred4_InternalScenarioText
    public final void synpred4_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:2268:4: ( ( '(' ) )
        // InternalScenarioText.g:2269:1: ( '(' )
        {
        // InternalScenarioText.g:2269:1: ( '(' )
        // InternalScenarioText.g:2270:2: '('
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalScenarioText

    // $ANTLR start synpred5_InternalScenarioText
    public final void synpred5_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:2367:4: ( ( '(' ) )
        // InternalScenarioText.g:2368:1: ( '(' )
        {
        // InternalScenarioText.g:2368:1: ( '(' )
        // InternalScenarioText.g:2369:2: '('
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalScenarioText

    // $ANTLR start synpred6_InternalScenarioText
    public final void synpred6_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:4193:5: ( ( '(' ) )
        // InternalScenarioText.g:4194:1: ( '(' )
        {
        // InternalScenarioText.g:4194:1: ( '(' )
        // InternalScenarioText.g:4195:2: '('
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalScenarioText

    // $ANTLR start synpred7_InternalScenarioText
    public final void synpred7_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:4259:8: ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )
        // InternalScenarioText.g:4259:9: ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' )
        {
        // InternalScenarioText.g:4259:9: ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' )
        // InternalScenarioText.g:4259:10: ( ( '[' ) ) ( ( ruleExpression ) ) ']'
        {
        // InternalScenarioText.g:4259:10: ( ( '[' ) )
        // InternalScenarioText.g:4260:1: ( '[' )
        {
        // InternalScenarioText.g:4260:1: ( '[' )
        // InternalScenarioText.g:4261:2: '['
        {
        match(input,43,FOLLOW_22); if (state.failed) return ;

        }


        }

        // InternalScenarioText.g:4265:2: ( ( ruleExpression ) )
        // InternalScenarioText.g:4266:1: ( ruleExpression )
        {
        // InternalScenarioText.g:4266:1: ( ruleExpression )
        // InternalScenarioText.g:4267:1: ruleExpression
        {
        pushFollow(FOLLOW_36);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalScenarioText

    // $ANTLR start synpred8_InternalScenarioText
    public final void synpred8_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:4307:4: ( ( '[' ( ( ruleExpression ) ) ']' ) )
        // InternalScenarioText.g:4307:5: ( '[' ( ( ruleExpression ) ) ']' )
        {
        // InternalScenarioText.g:4307:5: ( '[' ( ( ruleExpression ) ) ']' )
        // InternalScenarioText.g:4307:7: '[' ( ( ruleExpression ) ) ']'
        {
        match(input,43,FOLLOW_22); if (state.failed) return ;
        // InternalScenarioText.g:4308:1: ( ( ruleExpression ) )
        // InternalScenarioText.g:4309:1: ( ruleExpression )
        {
        // InternalScenarioText.g:4309:1: ( ruleExpression )
        // InternalScenarioText.g:4310:1: ruleExpression
        {
        pushFollow(FOLLOW_36);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalScenarioText

    // $ANTLR start synpred9_InternalScenarioText
    public final void synpred9_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:4379:5: ( ( '(' ) )
        // InternalScenarioText.g:4380:1: ( '(' )
        {
        // InternalScenarioText.g:4380:1: ( '(' )
        // InternalScenarioText.g:4381:2: '('
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalScenarioText

    // $ANTLR start synpred10_InternalScenarioText
    public final void synpred10_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:4445:8: ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )
        // InternalScenarioText.g:4445:9: ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' )
        {
        // InternalScenarioText.g:4445:9: ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' )
        // InternalScenarioText.g:4445:10: ( ( '[' ) ) ( ( ruleExpression ) ) ']'
        {
        // InternalScenarioText.g:4445:10: ( ( '[' ) )
        // InternalScenarioText.g:4446:1: ( '[' )
        {
        // InternalScenarioText.g:4446:1: ( '[' )
        // InternalScenarioText.g:4447:2: '['
        {
        match(input,43,FOLLOW_22); if (state.failed) return ;

        }


        }

        // InternalScenarioText.g:4451:2: ( ( ruleExpression ) )
        // InternalScenarioText.g:4452:1: ( ruleExpression )
        {
        // InternalScenarioText.g:4452:1: ( ruleExpression )
        // InternalScenarioText.g:4453:1: ruleExpression
        {
        pushFollow(FOLLOW_36);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalScenarioText

    // $ANTLR start synpred11_InternalScenarioText
    public final void synpred11_InternalScenarioText_fragment() throws RecognitionException {   
        // InternalScenarioText.g:4493:4: ( ( '[' ( ( ruleExpression ) ) ']' ) )
        // InternalScenarioText.g:4493:5: ( '[' ( ( ruleExpression ) ) ']' )
        {
        // InternalScenarioText.g:4493:5: ( '[' ( ( ruleExpression ) ) ']' )
        // InternalScenarioText.g:4493:7: '[' ( ( ruleExpression ) ) ']'
        {
        match(input,43,FOLLOW_22); if (state.failed) return ;
        // InternalScenarioText.g:4494:1: ( ( ruleExpression ) )
        // InternalScenarioText.g:4495:1: ( ruleExpression )
        {
        // InternalScenarioText.g:4495:1: ( ruleExpression )
        // InternalScenarioText.g:4496:1: ruleExpression
        {
        pushFollow(FOLLOW_36);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalScenarioText

    // Delegated rules

    public final boolean synpred6_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalScenarioText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalScenarioText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA70 dfa70 = new DFA70(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String dfa_1s = "\101\uffff";
    static final String dfa_2s = "\1\3\100\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\0\76\uffff";
    static final String dfa_4s = "\1\135\1\uffff\1\0\76\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\74\uffff\1\2";
    static final String dfa_6s = "\1\0\1\uffff\1\1\76\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\21\uffff\10\3\2\uffff\3\3\1\1\4\3\1\uffff\2\3\1\2\1\3\2\uffff\5\3\3\uffff\5\3\1\uffff\2\3\1\uffff\31\3\1\uffff\4\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4193:2: ( ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_9_0= '[' ) ) ( (lv_arraySelector_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_0 = input.LA(1);

                         
                        int index70_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA70_0==35) && (synpred6_InternalScenarioText())) {s = 1;}

                        else if ( (LA70_0==43) ) {s = 2;}

                        else if ( (LA70_0==EOF||LA70_0==RULE_ID||(LA70_0>=22 && LA70_0<=29)||(LA70_0>=32 && LA70_0<=34)||(LA70_0>=36 && LA70_0<=39)||(LA70_0>=41 && LA70_0<=42)||LA70_0==44||(LA70_0>=47 && LA70_0<=51)||(LA70_0>=55 && LA70_0<=59)||(LA70_0>=61 && LA70_0<=62)||(LA70_0>=64 && LA70_0<=88)||(LA70_0>=90 && LA70_0<=93)) ) {s = 3;}

                         
                        input.seek(index70_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScenarioText()) ) {s = 64;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\100\uffff";
    static final String dfa_9s = "\1\1\77\uffff";
    static final String dfa_10s = "\1\4\12\uffff\1\0\64\uffff";
    static final String dfa_11s = "\1\135\12\uffff\1\0\64\uffff";
    static final String dfa_12s = "\1\uffff\1\2\75\uffff\1\1";
    static final String dfa_13s = "\13\uffff\1\0\64\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\21\uffff\10\1\2\uffff\3\1\1\uffff\4\1\1\uffff\2\1\1\13\1\1\2\uffff\5\1\3\uffff\5\1\1\uffff\2\1\1\uffff\31\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 4307:3: ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_12= '[' ( (lv_arraySelector_13_0= ruleExpression ) ) otherlv_14= ']' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalScenarioText()) ) {s = 63;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4379:2: ( ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) | ( ( ( ( ( ( '[' ) ) ( ( ruleExpression ) ) ']' ) )=> ( ( (lv_arrayAccess_7_0= '[' ) ) ( (lv_arraySelector_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_0 = input.LA(1);

                         
                        int index75_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_0==35) && (synpred9_InternalScenarioText())) {s = 1;}

                        else if ( (LA75_0==43) ) {s = 2;}

                        else if ( (LA75_0==EOF||LA75_0==RULE_ID||(LA75_0>=22 && LA75_0<=29)||(LA75_0>=32 && LA75_0<=34)||(LA75_0>=36 && LA75_0<=39)||(LA75_0>=41 && LA75_0<=42)||LA75_0==44||(LA75_0>=47 && LA75_0<=51)||(LA75_0>=55 && LA75_0<=59)||(LA75_0>=61 && LA75_0<=62)||(LA75_0>=64 && LA75_0<=88)||(LA75_0>=90 && LA75_0<=93)) ) {s = 3;}

                         
                        input.seek(index75_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalScenarioText()) ) {s = 64;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\4\13\uffff\1\0\63\uffff";
    static final String dfa_16s = "\1\135\13\uffff\1\0\63\uffff";
    static final String dfa_17s = "\14\uffff\1\0\63\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\21\uffff\10\1\2\uffff\3\1\1\uffff\4\1\1\uffff\2\1\1\14\1\1\2\uffff\5\1\3\uffff\5\1\1\uffff\2\1\1\uffff\31\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_12;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 4493:3: ( ( ( '[' ( ( ruleExpression ) ) ']' ) )=> (otherlv_10= '[' ( (lv_arraySelector_11_0= ruleExpression ) ) otherlv_12= ']' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalScenarioText()) ) {s = 63;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000F080000008012L,0x0000000000000018L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000F080000000012L,0x0000000000000018L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000F080000008010L,0x0000000000000018L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000F6E0000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x03FF6004E9600010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x03FF6004E9E00010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0380000638000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x038F080638000012L,0x0000000000000018L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x90600008000007F0L,0x0000000002600000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x03FF6024E9600010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x90700008000007F0L,0x0000000002600000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000081000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000F000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000804000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x90600028000007F0L,0x0000000002600000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000002L,0x000000000007FE00L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x10600008000007F0L,0x0000000002600000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000C000000002L,0x000000003C000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x10600008000007F0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000080804000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000080004000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000080800000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000080000000002L});

}
