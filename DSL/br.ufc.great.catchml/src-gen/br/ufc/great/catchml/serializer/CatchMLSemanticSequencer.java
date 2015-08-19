package br.ufc.great.catchml.serializer;

import br.ufc.great.catchml.catchML.ActionDeclaration;
import br.ufc.great.catchml.catchML.AndOpExpression;
import br.ufc.great.catchml.catchML.CatchMLPackage;
import br.ufc.great.catchml.catchML.Domainmodel;
import br.ufc.great.catchml.catchML.ExceptionDeclaration;
import br.ufc.great.catchml.catchML.HandlerDeclaration;
import br.ufc.great.catchml.catchML.LogicExpression;
import br.ufc.great.catchml.catchML.OrOpExpression;
import br.ufc.great.catchml.catchML.PropertyDeclaration;
import br.ufc.great.catchml.catchML.PropositionDeclaration;
import br.ufc.great.catchml.catchML.PropositionExpressionDeclaration;
import br.ufc.great.catchml.catchML.RelationalOpExpression;
import br.ufc.great.catchml.catchML.ScopeDeclaration;
import br.ufc.great.catchml.catchML.SemanticConstraintDeclaration;
import br.ufc.great.catchml.catchML.SituationDeclaration;
import br.ufc.great.catchml.catchML.SystemDeclaration;
import br.ufc.great.catchml.catchML.TransitionConstraintDeclaration;
import br.ufc.great.catchml.catchML.UnaryOpExpression;
import br.ufc.great.catchml.services.CatchMLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CatchMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CatchMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CatchMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CatchMLPackage.ACTION_DECLARATION:
				if(context == grammarAccess.getActionDeclarationRule()) {
					sequence_ActionDeclaration(context, (ActionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.AND_OP_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLogicExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0()) {
					sequence_AndExpression(context, (AndOpExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTemporalAndExpressionRule() ||
				   context == grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalLogicExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0()) {
					sequence_TemporalAndExpression(context, (AndOpExpression) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.EXCEPTION_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExceptionDeclarationRule()) {
					sequence_ExceptionDeclaration(context, (ExceptionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.HANDLER_DECLARATION:
				if(context == grammarAccess.getHandlerDeclarationRule()) {
					sequence_HandlerDeclaration(context, (HandlerDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.LOGIC_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLogicExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (LogicExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTemporalAdditiveExpressionRule() ||
				   context == grammarAccess.getTemporalAndExpressionRule() ||
				   context == grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalLogicExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalPrimaryExpressionRule() ||
				   context == grammarAccess.getTemporalRelationalExpressionRule() ||
				   context == grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()) {
					sequence_TemporalPrimaryExpression(context, (LogicExpression) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.OR_OP_EXPRESSION:
				if(context == grammarAccess.getLogicExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0()) {
					sequence_OrExpression(context, (OrOpExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTemporalLogicExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0()) {
					sequence_TemporalOrExpression(context, (OrOpExpression) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.PROPERTY_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getPropertyDeclarationRule()) {
					sequence_PropertyDeclaration(context, (PropertyDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.PROPOSITION_DECLARATION:
				if(context == grammarAccess.getAbstractDeclarationRule() ||
				   context == grammarAccess.getPropositionDeclarationRule()) {
					sequence_PropositionDeclaration(context, (PropositionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.PROPOSITION_EXPRESSION_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getPropositionExpressionDeclarationRule()) {
					sequence_PropositionExpressionDeclaration(context, (PropositionExpressionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.RELATIONAL_OP_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLogicExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()) {
					sequence_RelationalExpression(context, (RelationalOpExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTemporalAndExpressionRule() ||
				   context == grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalLogicExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalRelationalExpressionRule() ||
				   context == grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()) {
					sequence_TemporalRelationalExpression(context, (RelationalOpExpression) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.SCOPE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getScopeDeclarationRule()) {
					sequence_ScopeDeclaration(context, (ScopeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.SEMANTIC_CONSTRAINT_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getSemanticConstraintDeclarationRule()) {
					sequence_SemanticConstraintDeclaration(context, (SemanticConstraintDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.SITUATION_DECLARATION:
				if(context == grammarAccess.getAbstractDeclarationRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getSituationDeclarationRule()) {
					sequence_SituationDeclaration(context, (SituationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.SYSTEM_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSystemDeclarationRule()) {
					sequence_SystemDeclaration(context, (SystemDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.TRANSITION_CONSTRAINT_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getTransitionConstraintDeclarationRule()) {
					sequence_TransitionConstraintDeclaration(context, (TransitionConstraintDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CatchMLPackage.UNARY_OP_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getLogicExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()) {
					sequence_AdditiveExpression(context, (UnaryOpExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTemporalAdditiveExpressionRule() ||
				   context == grammarAccess.getTemporalAndExpressionRule() ||
				   context == grammarAccess.getTemporalAndExpressionAccess().getAndOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalLogicExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionRule() ||
				   context == grammarAccess.getTemporalOrExpressionAccess().getOrOpExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTemporalRelationalExpressionRule() ||
				   context == grammarAccess.getTemporalRelationalExpressionAccess().getRelationalOpExpressionLeftAction_1_0()) {
					sequence_TemporalAdditiveExpression(context, (UnaryOpExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     expression=LogicExpression
	 */
	protected void sequence_ActionDeclaration(EObject context, ActionDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.ACTION_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.ACTION_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op='!' expr=PrimaryExpression)
	 */
	protected void sequence_AdditiveExpression(EObject context, UnaryOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndExpression_AndOpExpression_1_0 op='&&' right=RelationalExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_Domainmodel(EObject context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=LogicExpression)
	 */
	protected void sequence_ExceptionDeclaration(EObject context, ExceptionDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.EXCEPTION_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.EXCEPTION_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.EXCEPTION_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.EXCEPTION_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExceptionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=LogicExpression actions+=ActionDeclaration+)
	 */
	protected void sequence_HandlerDeclaration(EObject context, HandlerDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrExpression_OrOpExpression_1_0 op='||' right=AndExpression)
	 */
	protected void sequence_OrExpression(EObject context, OrOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr=LogicExpression | 
	 *         value=[AbstractDeclaration|ID] | 
	 *         (opBin=BINARYOPERATOR left=LogicExpression right=LogicExpression) | 
	 *         (opMul=MULTIPLEOPERATOR args+=LogicExpression args+=LogicExpression+)
	 *     )
	 */
	protected void sequence_PrimaryExpression(EObject context, LogicExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=TemporalLogicExpression)
	 */
	protected void sequence_PropertyDeclaration(EObject context, PropertyDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.PROPERTY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.PROPERTY_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.PROPERTY_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.PROPERTY_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyDeclarationAccess().getExpressionTemporalLogicExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PropositionDeclaration(EObject context, PropositionDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.ABSTRACT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.ABSTRACT_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropositionDeclarationAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (args+=PropositionDeclaration args+=PropositionDeclaration*)
	 */
	protected void sequence_PropositionExpressionDeclaration(EObject context, PropositionExpressionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=RelationalExpression_RelationalOpExpression_1_0 (op='->' | op='<->') right=AdditiveExpression)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID exception=[ExceptionDeclaration|ID] handlers+=HandlerDeclaration+)
	 */
	protected void sequence_ScopeDeclaration(EObject context, ScopeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=LogicExpression)
	 */
	protected void sequence_SemanticConstraintDeclaration(EObject context, SemanticConstraintDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSemanticConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=LogicExpression)
	 */
	protected void sequence_SituationDeclaration(EObject context, SituationDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.ABSTRACT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.ABSTRACT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.SITUATION_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.SITUATION_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSituationDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSituationDeclarationAccess().getExpressionLogicExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_SystemDeclaration(EObject context, SystemDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op='!' expr=TemporalPrimaryExpression)
	 */
	protected void sequence_TemporalAdditiveExpression(EObject context, UnaryOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TemporalAndExpression_AndOpExpression_1_0 op='&&' right=TemporalRelationalExpression)
	 */
	protected void sequence_TemporalAndExpression(EObject context, AndOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TemporalOrExpression_OrOpExpression_1_0 op='||' right=TemporalAndExpression)
	 */
	protected void sequence_TemporalOrExpression(EObject context, OrOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr=TemporalLogicExpression | 
	 *         value=[AbstractDeclaration|ID] | 
	 *         (opTemp=TEMPORALOPERATOR temporal=TemporalLogicExpression) | 
	 *         (opTempUntil=TEMPUNTILOPERATOR leftExp=TemporalLogicExpression rightExp=TemporalLogicExpression) | 
	 *         (opBin=BINARYOPERATOR left=LogicExpression right=LogicExpression) | 
	 *         (opMul=MULTIPLEOPERATOR args+=LogicExpression args+=LogicExpression+)
	 *     )
	 */
	protected void sequence_TemporalPrimaryExpression(EObject context, LogicExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TemporalRelationalExpression_RelationalOpExpression_1_0 (op='->' | op='<->') right=TemporalAdditiveExpression)
	 */
	protected void sequence_TemporalRelationalExpression(EObject context, RelationalOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID left=LogicExpression right=LogicExpression)
	 */
	protected void sequence_TransitionConstraintDeclaration(EObject context, TransitionConstraintDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, CatchMLPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatchMLPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionConstraintDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftLogicExpressionParserRuleCall_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTransitionConstraintDeclarationAccess().getRightLogicExpressionParserRuleCall_6_0(), semanticObject.getRight());
		feeder.finish();
	}
}
