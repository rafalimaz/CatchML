/**
 */
package br.ufc.great.catchml.catchML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLPackage
 * @generated
 */
public interface CatchMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CatchMLFactory eINSTANCE = br.ufc.great.catchml.catchML.impl.CatchMLFactoryImpl.init();

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
   * Returns a new object of class '<em>Proposition Expression Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposition Expression Declaration</em>'.
   * @generated
   */
  PropositionExpressionDeclaration createPropositionExpressionDeclaration();

  /**
   * Returns a new object of class '<em>Proposition Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposition Declaration</em>'.
   * @generated
   */
  PropositionDeclaration createPropositionDeclaration();

  /**
   * Returns a new object of class '<em>Situation Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Situation Declaration</em>'.
   * @generated
   */
  SituationDeclaration createSituationDeclaration();

  /**
   * Returns a new object of class '<em>Semantic Constraint Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantic Constraint Declaration</em>'.
   * @generated
   */
  SemanticConstraintDeclaration createSemanticConstraintDeclaration();

  /**
   * Returns a new object of class '<em>Transition Constraint Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Constraint Declaration</em>'.
   * @generated
   */
  TransitionConstraintDeclaration createTransitionConstraintDeclaration();

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
  CatchMLPackage getCatchMLPackage();

} //CatchMLFactory
