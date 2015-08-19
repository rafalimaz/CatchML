/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>System Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Declaration</em>'.
   * @generated
   */
  SystemDeclaration createSystemDeclaration();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Proposition Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposition Type</em>'.
   * @generated
   */
  PropositionType createPropositionType();

  /**
   * Returns a new object of class '<em>Proposition List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposition List</em>'.
   * @generated
   */
  PropositionList createPropositionList();

  /**
   * Returns a new object of class '<em>Proposition Single</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposition Single</em>'.
   * @generated
   */
  PropositionSingle createPropositionSingle();

  /**
   * Returns a new object of class '<em>Proposition Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposition Declaration</em>'.
   * @generated
   */
  PropositionDeclaration createPropositionDeclaration();

  /**
   * Returns a new object of class '<em>Situation Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Situation Type</em>'.
   * @generated
   */
  SituationType createSituationType();

  /**
   * Returns a new object of class '<em>Situation Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Situation Declaration</em>'.
   * @generated
   */
  SituationDeclaration createSituationDeclaration();

  /**
   * Returns a new object of class '<em>Semantic Constraint Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantic Constraint Type</em>'.
   * @generated
   */
  SemanticConstraintType createSemanticConstraintType();

  /**
   * Returns a new object of class '<em>Semantic Constraint Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantic Constraint Declaration</em>'.
   * @generated
   */
  SemanticConstraintDeclaration createSemanticConstraintDeclaration();

  /**
   * Returns a new object of class '<em>Transition Constraint Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Constraint Type</em>'.
   * @generated
   */
  TransitionConstraintType createTransitionConstraintType();

  /**
   * Returns a new object of class '<em>Transition Constraint Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Constraint Declaration</em>'.
   * @generated
   */
  TransitionConstraintDeclaration createTransitionConstraintDeclaration();

  /**
   * Returns a new object of class '<em>Exception Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Type</em>'.
   * @generated
   */
  ExceptionType createExceptionType();

  /**
   * Returns a new object of class '<em>Exception Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Declaration</em>'.
   * @generated
   */
  ExceptionDeclaration createExceptionDeclaration();

  /**
   * Returns a new object of class '<em>Abstract Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Declaration</em>'.
   * @generated
   */
  AbstractDeclaration createAbstractDeclaration();

  /**
   * Returns a new object of class '<em>Scope Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope Type</em>'.
   * @generated
   */
  ScopeType createScopeType();

  /**
   * Returns a new object of class '<em>Scope Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope Declaration</em>'.
   * @generated
   */
  ScopeDeclaration createScopeDeclaration();

  /**
   * Returns a new object of class '<em>Handler Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Handler Declaration</em>'.
   * @generated
   */
  HandlerDeclaration createHandlerDeclaration();

  /**
   * Returns a new object of class '<em>Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Declaration</em>'.
   * @generated
   */
  ActionDeclaration createActionDeclaration();

  /**
   * Returns a new object of class '<em>Propagation Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Propagation Declaration</em>'.
   * @generated
   */
  PropagationDeclaration createPropagationDeclaration();

  /**
   * Returns a new object of class '<em>Signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Declaration</em>'.
   * @generated
   */
  SignalDeclaration createSignalDeclaration();

  /**
   * Returns a new object of class '<em>Raise Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raise Declaration</em>'.
   * @generated
   */
  RaiseDeclaration createRaiseDeclaration();

  /**
   * Returns a new object of class '<em>Property Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Type</em>'.
   * @generated
   */
  PropertyType createPropertyType();

  /**
   * Returns a new object of class '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Declaration</em>'.
   * @generated
   */
  PropertyDeclaration createPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Logic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logic Expression</em>'.
   * @generated
   */
  LogicExpression createLogicExpression();

  /**
   * Returns a new object of class '<em>Or Op Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Op Expression</em>'.
   * @generated
   */
  OrOpExpression createOrOpExpression();

  /**
   * Returns a new object of class '<em>And Op Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Op Expression</em>'.
   * @generated
   */
  AndOpExpression createAndOpExpression();

  /**
   * Returns a new object of class '<em>Relational Op Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational Op Expression</em>'.
   * @generated
   */
  RelationalOpExpression createRelationalOpExpression();

  /**
   * Returns a new object of class '<em>Unary Op Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Op Expression</em>'.
   * @generated
   */
  UnaryOpExpression createUnaryOpExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
