package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.myDsl.ActionDeclaration;
import org.xtext.example.mydsl.myDsl.AndOpExpression;
import org.xtext.example.mydsl.myDsl.Domainmodel;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.ExceptionType;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.Import;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OrOpExpression;
import org.xtext.example.mydsl.myDsl.PropertyDeclaration;
import org.xtext.example.mydsl.myDsl.PropertyType;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionList;
import org.xtext.example.mydsl.myDsl.PropositionSingle;
import org.xtext.example.mydsl.myDsl.RaiseDeclaration;
import org.xtext.example.mydsl.myDsl.RelationalOpExpression;
import org.xtext.example.mydsl.myDsl.ScopeDeclaration;
import org.xtext.example.mydsl.myDsl.ScopeType;
import org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.SemanticConstraintType;
import org.xtext.example.mydsl.myDsl.SignalDeclaration;
import org.xtext.example.mydsl.myDsl.SituationDeclaration;
import org.xtext.example.mydsl.myDsl.SituationType;
import org.xtext.example.mydsl.myDsl.SystemDeclaration;
import org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.TransitionConstraintType;
import org.xtext.example.mydsl.myDsl.UnaryOpExpression;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ACTION_DECLARATION:
				if(context == grammarAccess.getActionDeclarationRule()) {
					sequence_ActionDeclaration(context, (ActionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.AND_OP_EXPRESSION:
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
			case MyDslPackage.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXCEPTION_DECLARATION:
				if(context == grammarAccess.getExceptionDeclarationRule()) {
					sequence_ExceptionDeclaration(context, (ExceptionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXCEPTION_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getExceptionTypeRule()) {
					sequence_ExceptionType(context, (ExceptionType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.HANDLER_DECLARATION:
				if(context == grammarAccess.getHandlerDeclarationRule()) {
					sequence_HandlerDeclaration(context, (HandlerDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.IMPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LOGIC_EXPRESSION:
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
			case MyDslPackage.OR_OP_EXPRESSION:
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
			case MyDslPackage.PROPERTY_DECLARATION:
				if(context == grammarAccess.getPropertyDeclarationRule()) {
					sequence_PropertyDeclaration(context, (PropertyDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PROPERTY_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getPropertyTypeRule()) {
					sequence_PropertyType(context, (PropertyType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PROPOSITION_DECLARATION:
				if(context == grammarAccess.getAbstractDeclarationRule() ||
				   context == grammarAccess.getPropositionDeclarationRule()) {
					sequence_PropositionDeclaration(context, (PropositionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PROPOSITION_LIST:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getPropositionListRule() ||
				   context == grammarAccess.getPropositionTypeRule()) {
					sequence_PropositionList(context, (PropositionList) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PROPOSITION_SINGLE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getPropositionSingleRule() ||
				   context == grammarAccess.getPropositionTypeRule()) {
					sequence_PropositionSingle(context, (PropositionSingle) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RAISE_DECLARATION:
				if(context == grammarAccess.getPropagationDeclarationRule() ||
				   context == grammarAccess.getRaiseDeclarationRule()) {
					sequence_RaiseDeclaration(context, (RaiseDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RELATIONAL_OP_EXPRESSION:
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
			case MyDslPackage.SCOPE_DECLARATION:
				if(context == grammarAccess.getScopeDeclarationRule()) {
					sequence_ScopeDeclaration(context, (ScopeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SCOPE_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getScopeTypeRule()) {
					sequence_ScopeType(context, (ScopeType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SEMANTIC_CONSTRAINT_DECLARATION:
				if(context == grammarAccess.getSemanticConstraintDeclarationRule()) {
					sequence_SemanticConstraintDeclaration(context, (SemanticConstraintDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SEMANTIC_CONSTRAINT_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getSemanticConstraintTypeRule()) {
					sequence_SemanticConstraintType(context, (SemanticConstraintType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SIGNAL_DECLARATION:
				if(context == grammarAccess.getPropagationDeclarationRule() ||
				   context == grammarAccess.getSignalDeclarationRule()) {
					sequence_SignalDeclaration(context, (SignalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SITUATION_DECLARATION:
				if(context == grammarAccess.getAbstractDeclarationRule() ||
				   context == grammarAccess.getSituationDeclarationRule()) {
					sequence_SituationDeclaration(context, (SituationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SITUATION_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getSituationTypeRule()) {
					sequence_SituationType(context, (SituationType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SYSTEM_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSystemDeclarationRule()) {
					sequence_SystemDeclaration(context, (SystemDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.TRANSITION_CONSTRAINT_DECLARATION:
				if(context == grammarAccess.getTransitionConstraintDeclarationRule()) {
					sequence_TransitionConstraintDeclaration(context, (TransitionConstraintDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.TRANSITION_CONSTRAINT_TYPE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getTransitionConstraintTypeRule()) {
					sequence_TransitionConstraintType(context, (TransitionConstraintType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.UNARY_OP_EXPRESSION:
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
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION_DECLARATION__EXPRESSION));
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
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXCEPTION_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXCEPTION_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXCEPTION_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXCEPTION_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExceptionDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label='exception' value=ExceptionDeclaration)
	 */
	protected void sequence_ExceptionType(EObject context, ExceptionType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXCEPTION_TYPE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXCEPTION_TYPE__LABEL));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXCEPTION_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXCEPTION_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExceptionTypeAccess().getLabelExceptionKeyword_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getExceptionTypeAccess().getValueExceptionDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=LogicExpression actions+=ActionDeclaration+ propagation=PropagationDeclaration?)
	 */
	protected void sequence_HandlerDeclaration(EObject context, HandlerDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
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
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPERTY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPERTY_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPERTY_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPERTY_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyDeclarationAccess().getExpressionTemporalLogicExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label='spec' value=PropertyDeclaration)
	 */
	protected void sequence_PropertyType(EObject context, PropertyType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPERTY_TYPE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPERTY_TYPE__LABEL));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPERTY_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPERTY_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyTypeAccess().getLabelSpecKeyword_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getPropertyTypeAccess().getValuePropertyDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PropositionDeclaration(EObject context, PropositionDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ABSTRACT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ABSTRACT_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropositionDeclarationAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=PropositionDeclaration tail+=PropositionDeclaration+)
	 */
	protected void sequence_PropositionList(EObject context, PropositionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=PropositionDeclaration
	 */
	protected void sequence_PropositionSingle(EObject context, PropositionSingle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPOSITION_SINGLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPOSITION_SINGLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropositionSingleAccess().getValuePropositionDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exception=[ExceptionDeclaration|ID]
	 */
	protected void sequence_RaiseDeclaration(EObject context, RaiseDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPAGATION_DECLARATION__EXCEPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPAGATION_DECLARATION__EXCEPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRaiseDeclarationAccess().getExceptionExceptionDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getException());
		feeder.finish();
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
	 *     (label='scope' value=ScopeDeclaration)
	 */
	protected void sequence_ScopeType(EObject context, ScopeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SCOPE_TYPE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SCOPE_TYPE__LABEL));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SCOPE_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SCOPE_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScopeTypeAccess().getLabelScopeKeyword_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getScopeTypeAccess().getValueScopeDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=LogicExpression)
	 */
	protected void sequence_SemanticConstraintDeclaration(EObject context, SemanticConstraintDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSemanticConstraintDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SemanticConstraintDeclaration
	 */
	protected void sequence_SemanticConstraintType(EObject context, SemanticConstraintType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SEMANTIC_CONSTRAINT_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SEMANTIC_CONSTRAINT_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSemanticConstraintTypeAccess().getValueSemanticConstraintDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exception=[ExceptionDeclaration|ID] scope=[ScopeDeclaration|ID])
	 */
	protected void sequence_SignalDeclaration(EObject context, SignalDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROPAGATION_DECLARATION__EXCEPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROPAGATION_DECLARATION__EXCEPTION));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIGNAL_DECLARATION__SCOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIGNAL_DECLARATION__SCOPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSignalDeclarationAccess().getExceptionExceptionDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getException());
		feeder.accept(grammarAccess.getSignalDeclarationAccess().getScopeScopeDeclarationIDTerminalRuleCall_5_0_1(), semanticObject.getScope());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=LogicExpression)
	 */
	protected void sequence_SituationDeclaration(EObject context, SituationDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ABSTRACT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ABSTRACT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SITUATION_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SITUATION_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSituationDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSituationDeclarationAccess().getExpressionLogicExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SituationDeclaration
	 */
	protected void sequence_SituationType(EObject context, SituationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SITUATION_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SITUATION_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSituationTypeAccess().getValueSituationDeclarationParserRuleCall_1_0(), semanticObject.getValue());
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
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_DECLARATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionConstraintDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftLogicExpressionParserRuleCall_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTransitionConstraintDeclarationAccess().getRightLogicExpressionParserRuleCall_5_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label='tconstraint' value=TransitionConstraintDeclaration)
	 */
	protected void sequence_TransitionConstraintType(EObject context, TransitionConstraintType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_TYPE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_TYPE__LABEL));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TRANSITION_CONSTRAINT_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionConstraintTypeAccess().getLabelTconstraintKeyword_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getTransitionConstraintTypeAccess().getValueTransitionConstraintDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
