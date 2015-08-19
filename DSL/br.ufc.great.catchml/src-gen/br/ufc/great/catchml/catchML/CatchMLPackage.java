/**
 */
package br.ufc.great.catchml.catchML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLFactory
 * @model kind="package"
 * @generated
 */
public interface CatchMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "catchML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufc.br/great/catchml/CatchML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "catchML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CatchMLPackage eINSTANCE = br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl.init();

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.DomainmodelImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.AbstractElementImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.SystemDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getSystemDeclaration()
   * @generated
   */
  int SYSTEM_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION__DECLARATIONS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>System Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.DeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 3;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.PropositionExpressionDeclarationImpl <em>Proposition Expression Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.PropositionExpressionDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getPropositionExpressionDeclaration()
   * @generated
   */
  int PROPOSITION_EXPRESSION_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_EXPRESSION_DECLARATION__ARGS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Proposition Expression Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_EXPRESSION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.AbstractDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getAbstractDeclaration()
   * @generated
   */
  int ABSTRACT_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.PropositionDeclarationImpl <em>Proposition Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.PropositionDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getPropositionDeclaration()
   * @generated
   */
  int PROPOSITION_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_DECLARATION__NAME = ABSTRACT_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Proposition Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.SituationDeclarationImpl <em>Situation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.SituationDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getSituationDeclaration()
   * @generated
   */
  int SITUATION_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_DECLARATION__EXPRESSION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Situation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.SemanticConstraintDeclarationImpl <em>Semantic Constraint Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.SemanticConstraintDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getSemanticConstraintDeclaration()
   * @generated
   */
  int SEMANTIC_CONSTRAINT_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Semantic Constraint Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.TransitionConstraintDeclarationImpl <em>Transition Constraint Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.TransitionConstraintDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getTransitionConstraintDeclaration()
   * @generated
   */
  int TRANSITION_CONSTRAINT_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION__LEFT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION__RIGHT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Transition Constraint Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.ExceptionDeclarationImpl <em>Exception Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.ExceptionDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getExceptionDeclaration()
   * @generated
   */
  int EXCEPTION_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION__EXPRESSION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exception Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.ScopeDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getScopeDeclaration()
   * @generated
   */
  int SCOPE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION__EXCEPTION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION__HANDLERS = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Scope Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.HandlerDeclarationImpl <em>Handler Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.HandlerDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getHandlerDeclaration()
   * @generated
   */
  int HANDLER_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECLARATION__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECLARATION__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Handler Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.ActionDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getActionDeclaration()
   * @generated
   */
  int ACTION_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.PropertyDeclarationImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__EXPRESSION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.LogicExpressionImpl <em>Logic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.LogicExpressionImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getLogicExpression()
   * @generated
   */
  int LOGIC_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__VALUE = 1;

  /**
   * The feature id for the '<em><b>Op Bin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__OP_BIN = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__LEFT = 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__RIGHT = 4;

  /**
   * The feature id for the '<em><b>Op Mul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__OP_MUL = 5;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__ARGS = 6;

  /**
   * The feature id for the '<em><b>Op Temp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__OP_TEMP = 7;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__TEMPORAL = 8;

  /**
   * The feature id for the '<em><b>Op Temp Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__OP_TEMP_UNTIL = 9;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__LEFT_EXP = 10;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__RIGHT_EXP = 11;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION__OP = 12;

  /**
   * The number of structural features of the '<em>Logic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSION_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.OrOpExpressionImpl <em>Or Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.OrOpExpressionImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getOrOpExpression()
   * @generated
   */
  int OR_OP_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__EXPR = LOGIC_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__VALUE = LOGIC_EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Op Bin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__OP_BIN = LOGIC_EXPRESSION__OP_BIN;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__LEFT = LOGIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__RIGHT = LOGIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Op Mul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__OP_MUL = LOGIC_EXPRESSION__OP_MUL;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__ARGS = LOGIC_EXPRESSION__ARGS;

  /**
   * The feature id for the '<em><b>Op Temp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__OP_TEMP = LOGIC_EXPRESSION__OP_TEMP;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__TEMPORAL = LOGIC_EXPRESSION__TEMPORAL;

  /**
   * The feature id for the '<em><b>Op Temp Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__OP_TEMP_UNTIL = LOGIC_EXPRESSION__OP_TEMP_UNTIL;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__LEFT_EXP = LOGIC_EXPRESSION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__RIGHT_EXP = LOGIC_EXPRESSION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION__OP = LOGIC_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>Or Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OP_EXPRESSION_FEATURE_COUNT = LOGIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.AndOpExpressionImpl <em>And Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.AndOpExpressionImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getAndOpExpression()
   * @generated
   */
  int AND_OP_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__EXPR = LOGIC_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__VALUE = LOGIC_EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Op Bin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__OP_BIN = LOGIC_EXPRESSION__OP_BIN;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__LEFT = LOGIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__RIGHT = LOGIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Op Mul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__OP_MUL = LOGIC_EXPRESSION__OP_MUL;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__ARGS = LOGIC_EXPRESSION__ARGS;

  /**
   * The feature id for the '<em><b>Op Temp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__OP_TEMP = LOGIC_EXPRESSION__OP_TEMP;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__TEMPORAL = LOGIC_EXPRESSION__TEMPORAL;

  /**
   * The feature id for the '<em><b>Op Temp Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__OP_TEMP_UNTIL = LOGIC_EXPRESSION__OP_TEMP_UNTIL;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__LEFT_EXP = LOGIC_EXPRESSION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__RIGHT_EXP = LOGIC_EXPRESSION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION__OP = LOGIC_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>And Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_EXPRESSION_FEATURE_COUNT = LOGIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.RelationalOpExpressionImpl <em>Relational Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.RelationalOpExpressionImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getRelationalOpExpression()
   * @generated
   */
  int RELATIONAL_OP_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__EXPR = LOGIC_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__VALUE = LOGIC_EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Op Bin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__OP_BIN = LOGIC_EXPRESSION__OP_BIN;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__LEFT = LOGIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__RIGHT = LOGIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Op Mul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__OP_MUL = LOGIC_EXPRESSION__OP_MUL;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__ARGS = LOGIC_EXPRESSION__ARGS;

  /**
   * The feature id for the '<em><b>Op Temp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__OP_TEMP = LOGIC_EXPRESSION__OP_TEMP;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__TEMPORAL = LOGIC_EXPRESSION__TEMPORAL;

  /**
   * The feature id for the '<em><b>Op Temp Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__OP_TEMP_UNTIL = LOGIC_EXPRESSION__OP_TEMP_UNTIL;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__LEFT_EXP = LOGIC_EXPRESSION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__RIGHT_EXP = LOGIC_EXPRESSION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION__OP = LOGIC_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>Relational Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OP_EXPRESSION_FEATURE_COUNT = LOGIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.impl.UnaryOpExpressionImpl <em>Unary Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.impl.UnaryOpExpressionImpl
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getUnaryOpExpression()
   * @generated
   */
  int UNARY_OP_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__EXPR = LOGIC_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__VALUE = LOGIC_EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Op Bin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__OP_BIN = LOGIC_EXPRESSION__OP_BIN;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__LEFT = LOGIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__RIGHT = LOGIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Op Mul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__OP_MUL = LOGIC_EXPRESSION__OP_MUL;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__ARGS = LOGIC_EXPRESSION__ARGS;

  /**
   * The feature id for the '<em><b>Op Temp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__OP_TEMP = LOGIC_EXPRESSION__OP_TEMP;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__TEMPORAL = LOGIC_EXPRESSION__TEMPORAL;

  /**
   * The feature id for the '<em><b>Op Temp Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__OP_TEMP_UNTIL = LOGIC_EXPRESSION__OP_TEMP_UNTIL;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__LEFT_EXP = LOGIC_EXPRESSION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__RIGHT_EXP = LOGIC_EXPRESSION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__OP = LOGIC_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>Unary Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION_FEATURE_COUNT = LOGIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.MULTIPLEOPERATOR <em>MULTIPLEOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.MULTIPLEOPERATOR
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getMULTIPLEOPERATOR()
   * @generated
   */
  int MULTIPLEOPERATOR = 20;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.BINARYOPERATOR <em>BINARYOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.BINARYOPERATOR
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getBINARYOPERATOR()
   * @generated
   */
  int BINARYOPERATOR = 21;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.TEMPORALOPERATOR <em>TEMPORALOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.TEMPORALOPERATOR
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getTEMPORALOPERATOR()
   * @generated
   */
  int TEMPORALOPERATOR = 22;

  /**
   * The meta object id for the '{@link br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR <em>TEMPUNTILOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR
   * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getTEMPUNTILOPERATOR()
   * @generated
   */
  int TEMPUNTILOPERATOR = 23;


  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see br.ufc.great.catchml.catchML.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufc.great.catchml.catchML.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see br.ufc.great.catchml.catchML.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see br.ufc.great.catchml.catchML.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.SystemDeclaration
   * @generated
   */
  EClass getSystemDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.SystemDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.SystemDeclaration#getName()
   * @see #getSystemDeclaration()
   * @generated
   */
  EAttribute getSystemDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufc.great.catchml.catchML.SystemDeclaration#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see br.ufc.great.catchml.catchML.SystemDeclaration#getDeclarations()
   * @see #getSystemDeclaration()
   * @generated
   */
  EReference getSystemDeclaration_Declarations();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.PropositionExpressionDeclaration <em>Proposition Expression Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition Expression Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.PropositionExpressionDeclaration
   * @generated
   */
  EClass getPropositionExpressionDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufc.great.catchml.catchML.PropositionExpressionDeclaration#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see br.ufc.great.catchml.catchML.PropositionExpressionDeclaration#getArgs()
   * @see #getPropositionExpressionDeclaration()
   * @generated
   */
  EReference getPropositionExpressionDeclaration_Args();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.PropositionDeclaration <em>Proposition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.PropositionDeclaration
   * @generated
   */
  EClass getPropositionDeclaration();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.SituationDeclaration <em>Situation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situation Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.SituationDeclaration
   * @generated
   */
  EClass getSituationDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.SituationDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see br.ufc.great.catchml.catchML.SituationDeclaration#getExpression()
   * @see #getSituationDeclaration()
   * @generated
   */
  EReference getSituationDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.SemanticConstraintDeclaration <em>Semantic Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semantic Constraint Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.SemanticConstraintDeclaration
   * @generated
   */
  EClass getSemanticConstraintDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.SemanticConstraintDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.SemanticConstraintDeclaration#getName()
   * @see #getSemanticConstraintDeclaration()
   * @generated
   */
  EAttribute getSemanticConstraintDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.SemanticConstraintDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see br.ufc.great.catchml.catchML.SemanticConstraintDeclaration#getExpression()
   * @see #getSemanticConstraintDeclaration()
   * @generated
   */
  EReference getSemanticConstraintDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration <em>Transition Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Constraint Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.TransitionConstraintDeclaration
   * @generated
   */
  EClass getTransitionConstraintDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getName()
   * @see #getTransitionConstraintDeclaration()
   * @generated
   */
  EAttribute getTransitionConstraintDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getLeft()
   * @see #getTransitionConstraintDeclaration()
   * @generated
   */
  EReference getTransitionConstraintDeclaration_Left();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getRight()
   * @see #getTransitionConstraintDeclaration()
   * @generated
   */
  EReference getTransitionConstraintDeclaration_Right();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.ExceptionDeclaration <em>Exception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.ExceptionDeclaration
   * @generated
   */
  EClass getExceptionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.ExceptionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.ExceptionDeclaration#getName()
   * @see #getExceptionDeclaration()
   * @generated
   */
  EAttribute getExceptionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.ExceptionDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see br.ufc.great.catchml.catchML.ExceptionDeclaration#getExpression()
   * @see #getExceptionDeclaration()
   * @generated
   */
  EReference getExceptionDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.AbstractDeclaration
   * @generated
   */
  EClass getAbstractDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.AbstractDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.AbstractDeclaration#getName()
   * @see #getAbstractDeclaration()
   * @generated
   */
  EAttribute getAbstractDeclaration_Name();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.ScopeDeclaration <em>Scope Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.ScopeDeclaration
   * @generated
   */
  EClass getScopeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.ScopeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.ScopeDeclaration#getName()
   * @see #getScopeDeclaration()
   * @generated
   */
  EAttribute getScopeDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link br.ufc.great.catchml.catchML.ScopeDeclaration#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exception</em>'.
   * @see br.ufc.great.catchml.catchML.ScopeDeclaration#getException()
   * @see #getScopeDeclaration()
   * @generated
   */
  EReference getScopeDeclaration_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufc.great.catchml.catchML.ScopeDeclaration#getHandlers <em>Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Handlers</em>'.
   * @see br.ufc.great.catchml.catchML.ScopeDeclaration#getHandlers()
   * @see #getScopeDeclaration()
   * @generated
   */
  EReference getScopeDeclaration_Handlers();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.HandlerDeclaration <em>Handler Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.HandlerDeclaration
   * @generated
   */
  EClass getHandlerDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.HandlerDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see br.ufc.great.catchml.catchML.HandlerDeclaration#getExpression()
   * @see #getHandlerDeclaration()
   * @generated
   */
  EReference getHandlerDeclaration_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufc.great.catchml.catchML.HandlerDeclaration#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see br.ufc.great.catchml.catchML.HandlerDeclaration#getActions()
   * @see #getHandlerDeclaration()
   * @generated
   */
  EReference getHandlerDeclaration_Actions();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.ActionDeclaration <em>Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.ActionDeclaration
   * @generated
   */
  EClass getActionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.ActionDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see br.ufc.great.catchml.catchML.ActionDeclaration#getExpression()
   * @see #getActionDeclaration()
   * @generated
   */
  EReference getActionDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see br.ufc.great.catchml.catchML.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.PropertyDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufc.great.catchml.catchML.PropertyDeclaration#getName()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EAttribute getPropertyDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.PropertyDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see br.ufc.great.catchml.catchML.PropertyDeclaration#getExpression()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.LogicExpression <em>Logic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Expression</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression
   * @generated
   */
  EClass getLogicExpression();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getExpr()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Expr();

  /**
   * Returns the meta object for the reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getValue()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.LogicExpression#getOpBin <em>Op Bin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Bin</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getOpBin()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpBin();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getLeft()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getRight()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.LogicExpression#getOpMul <em>Op Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Mul</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getOpMul()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpMul();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufc.great.catchml.catchML.LogicExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getArgs()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Args();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.LogicExpression#getOpTemp <em>Op Temp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Temp</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getOpTemp()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpTemp();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getTemporal <em>Temporal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Temporal</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getTemporal()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Temporal();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.LogicExpression#getOpTempUntil <em>Op Temp Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Temp Until</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getOpTempUntil()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpTempUntil();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getLeftExp <em>Left Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Exp</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getLeftExp()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_LeftExp();

  /**
   * Returns the meta object for the containment reference '{@link br.ufc.great.catchml.catchML.LogicExpression#getRightExp <em>Right Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Exp</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getRightExp()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_RightExp();

  /**
   * Returns the meta object for the attribute '{@link br.ufc.great.catchml.catchML.LogicExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see br.ufc.great.catchml.catchML.LogicExpression#getOp()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_Op();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.OrOpExpression <em>Or Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Op Expression</em>'.
   * @see br.ufc.great.catchml.catchML.OrOpExpression
   * @generated
   */
  EClass getOrOpExpression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.AndOpExpression <em>And Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Op Expression</em>'.
   * @see br.ufc.great.catchml.catchML.AndOpExpression
   * @generated
   */
  EClass getAndOpExpression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.RelationalOpExpression <em>Relational Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Op Expression</em>'.
   * @see br.ufc.great.catchml.catchML.RelationalOpExpression
   * @generated
   */
  EClass getRelationalOpExpression();

  /**
   * Returns the meta object for class '{@link br.ufc.great.catchml.catchML.UnaryOpExpression <em>Unary Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Op Expression</em>'.
   * @see br.ufc.great.catchml.catchML.UnaryOpExpression
   * @generated
   */
  EClass getUnaryOpExpression();

  /**
   * Returns the meta object for enum '{@link br.ufc.great.catchml.catchML.MULTIPLEOPERATOR <em>MULTIPLEOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MULTIPLEOPERATOR</em>'.
   * @see br.ufc.great.catchml.catchML.MULTIPLEOPERATOR
   * @generated
   */
  EEnum getMULTIPLEOPERATOR();

  /**
   * Returns the meta object for enum '{@link br.ufc.great.catchml.catchML.BINARYOPERATOR <em>BINARYOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BINARYOPERATOR</em>'.
   * @see br.ufc.great.catchml.catchML.BINARYOPERATOR
   * @generated
   */
  EEnum getBINARYOPERATOR();

  /**
   * Returns the meta object for enum '{@link br.ufc.great.catchml.catchML.TEMPORALOPERATOR <em>TEMPORALOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TEMPORALOPERATOR</em>'.
   * @see br.ufc.great.catchml.catchML.TEMPORALOPERATOR
   * @generated
   */
  EEnum getTEMPORALOPERATOR();

  /**
   * Returns the meta object for enum '{@link br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR <em>TEMPUNTILOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TEMPUNTILOPERATOR</em>'.
   * @see br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR
   * @generated
   */
  EEnum getTEMPUNTILOPERATOR();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CatchMLFactory getCatchMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.DomainmodelImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.AbstractElementImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.SystemDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getSystemDeclaration()
     * @generated
     */
    EClass SYSTEM_DECLARATION = eINSTANCE.getSystemDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_DECLARATION__NAME = eINSTANCE.getSystemDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_DECLARATION__DECLARATIONS = eINSTANCE.getSystemDeclaration_Declarations();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.DeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.PropositionExpressionDeclarationImpl <em>Proposition Expression Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.PropositionExpressionDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getPropositionExpressionDeclaration()
     * @generated
     */
    EClass PROPOSITION_EXPRESSION_DECLARATION = eINSTANCE.getPropositionExpressionDeclaration();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSITION_EXPRESSION_DECLARATION__ARGS = eINSTANCE.getPropositionExpressionDeclaration_Args();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.PropositionDeclarationImpl <em>Proposition Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.PropositionDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getPropositionDeclaration()
     * @generated
     */
    EClass PROPOSITION_DECLARATION = eINSTANCE.getPropositionDeclaration();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.SituationDeclarationImpl <em>Situation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.SituationDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getSituationDeclaration()
     * @generated
     */
    EClass SITUATION_DECLARATION = eINSTANCE.getSituationDeclaration();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITUATION_DECLARATION__EXPRESSION = eINSTANCE.getSituationDeclaration_Expression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.SemanticConstraintDeclarationImpl <em>Semantic Constraint Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.SemanticConstraintDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getSemanticConstraintDeclaration()
     * @generated
     */
    EClass SEMANTIC_CONSTRAINT_DECLARATION = eINSTANCE.getSemanticConstraintDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMANTIC_CONSTRAINT_DECLARATION__NAME = eINSTANCE.getSemanticConstraintDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION = eINSTANCE.getSemanticConstraintDeclaration_Expression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.TransitionConstraintDeclarationImpl <em>Transition Constraint Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.TransitionConstraintDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getTransitionConstraintDeclaration()
     * @generated
     */
    EClass TRANSITION_CONSTRAINT_DECLARATION = eINSTANCE.getTransitionConstraintDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_CONSTRAINT_DECLARATION__NAME = eINSTANCE.getTransitionConstraintDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CONSTRAINT_DECLARATION__LEFT = eINSTANCE.getTransitionConstraintDeclaration_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CONSTRAINT_DECLARATION__RIGHT = eINSTANCE.getTransitionConstraintDeclaration_Right();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.ExceptionDeclarationImpl <em>Exception Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.ExceptionDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getExceptionDeclaration()
     * @generated
     */
    EClass EXCEPTION_DECLARATION = eINSTANCE.getExceptionDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION_DECLARATION__NAME = eINSTANCE.getExceptionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_DECLARATION__EXPRESSION = eINSTANCE.getExceptionDeclaration_Expression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.AbstractDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getAbstractDeclaration()
     * @generated
     */
    EClass ABSTRACT_DECLARATION = eINSTANCE.getAbstractDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DECLARATION__NAME = eINSTANCE.getAbstractDeclaration_Name();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.ScopeDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getScopeDeclaration()
     * @generated
     */
    EClass SCOPE_DECLARATION = eINSTANCE.getScopeDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE_DECLARATION__NAME = eINSTANCE.getScopeDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE_DECLARATION__EXCEPTION = eINSTANCE.getScopeDeclaration_Exception();

    /**
     * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE_DECLARATION__HANDLERS = eINSTANCE.getScopeDeclaration_Handlers();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.HandlerDeclarationImpl <em>Handler Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.HandlerDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getHandlerDeclaration()
     * @generated
     */
    EClass HANDLER_DECLARATION = eINSTANCE.getHandlerDeclaration();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_DECLARATION__EXPRESSION = eINSTANCE.getHandlerDeclaration_Expression();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_DECLARATION__ACTIONS = eINSTANCE.getHandlerDeclaration_Actions();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.ActionDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getActionDeclaration()
     * @generated
     */
    EClass ACTION_DECLARATION = eINSTANCE.getActionDeclaration();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_DECLARATION__EXPRESSION = eINSTANCE.getActionDeclaration_Expression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.PropertyDeclarationImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getPropertyDeclaration()
     * @generated
     */
    EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DECLARATION__NAME = eINSTANCE.getPropertyDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DECLARATION__EXPRESSION = eINSTANCE.getPropertyDeclaration_Expression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.LogicExpressionImpl <em>Logic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.LogicExpressionImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getLogicExpression()
     * @generated
     */
    EClass LOGIC_EXPRESSION = eINSTANCE.getLogicExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__EXPR = eINSTANCE.getLogicExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__VALUE = eINSTANCE.getLogicExpression_Value();

    /**
     * The meta object literal for the '<em><b>Op Bin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSION__OP_BIN = eINSTANCE.getLogicExpression_OpBin();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__LEFT = eINSTANCE.getLogicExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__RIGHT = eINSTANCE.getLogicExpression_Right();

    /**
     * The meta object literal for the '<em><b>Op Mul</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSION__OP_MUL = eINSTANCE.getLogicExpression_OpMul();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__ARGS = eINSTANCE.getLogicExpression_Args();

    /**
     * The meta object literal for the '<em><b>Op Temp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSION__OP_TEMP = eINSTANCE.getLogicExpression_OpTemp();

    /**
     * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__TEMPORAL = eINSTANCE.getLogicExpression_Temporal();

    /**
     * The meta object literal for the '<em><b>Op Temp Until</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSION__OP_TEMP_UNTIL = eINSTANCE.getLogicExpression_OpTempUntil();

    /**
     * The meta object literal for the '<em><b>Left Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__LEFT_EXP = eINSTANCE.getLogicExpression_LeftExp();

    /**
     * The meta object literal for the '<em><b>Right Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSION__RIGHT_EXP = eINSTANCE.getLogicExpression_RightExp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSION__OP = eINSTANCE.getLogicExpression_Op();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.OrOpExpressionImpl <em>Or Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.OrOpExpressionImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getOrOpExpression()
     * @generated
     */
    EClass OR_OP_EXPRESSION = eINSTANCE.getOrOpExpression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.AndOpExpressionImpl <em>And Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.AndOpExpressionImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getAndOpExpression()
     * @generated
     */
    EClass AND_OP_EXPRESSION = eINSTANCE.getAndOpExpression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.RelationalOpExpressionImpl <em>Relational Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.RelationalOpExpressionImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getRelationalOpExpression()
     * @generated
     */
    EClass RELATIONAL_OP_EXPRESSION = eINSTANCE.getRelationalOpExpression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.impl.UnaryOpExpressionImpl <em>Unary Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.impl.UnaryOpExpressionImpl
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getUnaryOpExpression()
     * @generated
     */
    EClass UNARY_OP_EXPRESSION = eINSTANCE.getUnaryOpExpression();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.MULTIPLEOPERATOR <em>MULTIPLEOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.MULTIPLEOPERATOR
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getMULTIPLEOPERATOR()
     * @generated
     */
    EEnum MULTIPLEOPERATOR = eINSTANCE.getMULTIPLEOPERATOR();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.BINARYOPERATOR <em>BINARYOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.BINARYOPERATOR
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getBINARYOPERATOR()
     * @generated
     */
    EEnum BINARYOPERATOR = eINSTANCE.getBINARYOPERATOR();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.TEMPORALOPERATOR <em>TEMPORALOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.TEMPORALOPERATOR
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getTEMPORALOPERATOR()
     * @generated
     */
    EEnum TEMPORALOPERATOR = eINSTANCE.getTEMPORALOPERATOR();

    /**
     * The meta object literal for the '{@link br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR <em>TEMPUNTILOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR
     * @see br.ufc.great.catchml.catchML.impl.CatchMLPackageImpl#getTEMPUNTILOPERATOR()
     * @generated
     */
    EEnum TEMPUNTILOPERATOR = eINSTANCE.getTEMPUNTILOPERATOR();

  }

} //CatchMLPackage
