/**
 */
package org.xtext.example.mydsl.myDsl;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainmodel()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractElement()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ImportImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SystemDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystemDeclaration()
   * @generated
   */
  int SYSTEM_DECLARATION = 3;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 4;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionTypeImpl <em>Proposition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropositionTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionType()
   * @generated
   */
  int PROPOSITION_TYPE = 5;

  /**
   * The number of structural features of the '<em>Proposition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionListImpl <em>Proposition List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropositionListImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionList()
   * @generated
   */
  int PROPOSITION_LIST = 6;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_LIST__HEAD = PROPOSITION_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_LIST__TAIL = PROPOSITION_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Proposition List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_LIST_FEATURE_COUNT = PROPOSITION_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionSingleImpl <em>Proposition Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropositionSingleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionSingle()
   * @generated
   */
  int PROPOSITION_SINGLE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_SINGLE__VALUE = PROPOSITION_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Proposition Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_SINGLE_FEATURE_COUNT = PROPOSITION_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AbstractDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractDeclaration()
   * @generated
   */
  int ABSTRACT_DECLARATION = 17;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionDeclarationImpl <em>Proposition Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropositionDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionDeclaration()
   * @generated
   */
  int PROPOSITION_DECLARATION = 8;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SituationTypeImpl <em>Situation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SituationTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSituationType()
   * @generated
   */
  int SITUATION_TYPE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_TYPE__VALUE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Situation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SituationDeclarationImpl <em>Situation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SituationDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSituationDeclaration()
   * @generated
   */
  int SITUATION_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_DECLARATION__NAME = ABSTRACT_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_DECLARATION__EXPRESSION = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Situation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SemanticConstraintTypeImpl <em>Semantic Constraint Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SemanticConstraintTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSemanticConstraintType()
   * @generated
   */
  int SEMANTIC_CONSTRAINT_TYPE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_TYPE__VALUE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Semantic Constraint Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SemanticConstraintDeclarationImpl <em>Semantic Constraint Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SemanticConstraintDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSemanticConstraintDeclaration()
   * @generated
   */
  int SEMANTIC_CONSTRAINT_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Semantic Constraint Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_CONSTRAINT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TransitionConstraintTypeImpl <em>Transition Constraint Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TransitionConstraintTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransitionConstraintType()
   * @generated
   */
  int TRANSITION_CONSTRAINT_TYPE = 13;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_TYPE__LABEL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_TYPE__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Constraint Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TransitionConstraintDeclarationImpl <em>Transition Constraint Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TransitionConstraintDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransitionConstraintDeclaration()
   * @generated
   */
  int TRANSITION_CONSTRAINT_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Transition Constraint Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CONSTRAINT_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExceptionTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExceptionType()
   * @generated
   */
  int EXCEPTION_TYPE = 15;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_TYPE__LABEL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_TYPE__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exception Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExceptionDeclarationImpl <em>Exception Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExceptionDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExceptionDeclaration()
   * @generated
   */
  int EXCEPTION_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Exception Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ScopeTypeImpl <em>Scope Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ScopeTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScopeType()
   * @generated
   */
  int SCOPE_TYPE = 18;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_TYPE__LABEL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_TYPE__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scope Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScopeDeclaration()
   * @generated
   */
  int SCOPE_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION__EXCEPTION = 1;

  /**
   * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION__HANDLERS = 2;

  /**
   * The number of structural features of the '<em>Scope Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl <em>Handler Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHandlerDeclaration()
   * @generated
   */
  int HANDLER_DECLARATION = 20;

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
   * The feature id for the '<em><b>Propagation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECLARATION__PROPAGATION = 2;

  /**
   * The number of structural features of the '<em>Handler Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionDeclaration()
   * @generated
   */
  int ACTION_DECLARATION = 21;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropagationDeclarationImpl <em>Propagation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropagationDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropagationDeclaration()
   * @generated
   */
  int PROPAGATION_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_DECLARATION__EXCEPTION = 0;

  /**
   * The number of structural features of the '<em>Propagation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SignalDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSignalDeclaration()
   * @generated
   */
  int SIGNAL_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__EXCEPTION = PROPAGATION_DECLARATION__EXCEPTION;

  /**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__SCOPE = PROPAGATION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Signal Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION_FEATURE_COUNT = PROPAGATION_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RaiseDeclarationImpl <em>Raise Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RaiseDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRaiseDeclaration()
   * @generated
   */
  int RAISE_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_DECLARATION__EXCEPTION = PROPAGATION_DECLARATION__EXCEPTION;

  /**
   * The number of structural features of the '<em>Raise Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_DECLARATION_FEATURE_COUNT = PROPAGATION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropertyTypeImpl <em>Property Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropertyTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropertyType()
   * @generated
   */
  int PROPERTY_TYPE = 25;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE__LABEL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PropertyDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl <em>Logic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLogicExpression()
   * @generated
   */
  int LOGIC_EXPRESSION = 27;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OrOpExpressionImpl <em>Or Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OrOpExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOrOpExpression()
   * @generated
   */
  int OR_OP_EXPRESSION = 28;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AndOpExpressionImpl <em>And Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AndOpExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAndOpExpression()
   * @generated
   */
  int AND_OP_EXPRESSION = 29;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RelationalOpExpressionImpl <em>Relational Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RelationalOpExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRelationalOpExpression()
   * @generated
   */
  int RELATIONAL_OP_EXPRESSION = 30;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UnaryOpExpressionImpl <em>Unary Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UnaryOpExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnaryOpExpression()
   * @generated
   */
  int UNARY_OP_EXPRESSION = 31;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR <em>MULTIPLEOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMULTIPLEOPERATOR()
   * @generated
   */
  int MULTIPLEOPERATOR = 32;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.BINARYOPERATOR <em>BINARYOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.BINARYOPERATOR
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBINARYOPERATOR()
   * @generated
   */
  int BINARYOPERATOR = 33;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR <em>TEMPORALOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTEMPORALOPERATOR()
   * @generated
   */
  int TEMPORALOPERATOR = 34;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR <em>TEMPUNTILOPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTEMPUNTILOPERATOR()
   * @generated
   */
  int TEMPUNTILOPERATOR = 35;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see org.xtext.example.mydsl.myDsl.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.SystemDeclaration
   * @generated
   */
  EClass getSystemDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.SystemDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.SystemDeclaration#getName()
   * @see #getSystemDeclaration()
   * @generated
   */
  EAttribute getSystemDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.SystemDeclaration#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.xtext.example.mydsl.myDsl.SystemDeclaration#getDeclarations()
   * @see #getSystemDeclaration()
   * @generated
   */
  EReference getSystemDeclaration_Declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropositionType <em>Proposition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionType
   * @generated
   */
  EClass getPropositionType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropositionList <em>Proposition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition List</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionList
   * @generated
   */
  EClass getPropositionList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.PropositionList#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionList#getHead()
   * @see #getPropositionList()
   * @generated
   */
  EReference getPropositionList_Head();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.PropositionList#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tail</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionList#getTail()
   * @see #getPropositionList()
   * @generated
   */
  EReference getPropositionList_Tail();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropositionSingle <em>Proposition Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition Single</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionSingle
   * @generated
   */
  EClass getPropositionSingle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.PropositionSingle#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionSingle#getValue()
   * @see #getPropositionSingle()
   * @generated
   */
  EReference getPropositionSingle_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropositionDeclaration <em>Proposition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropositionDeclaration
   * @generated
   */
  EClass getPropositionDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SituationType <em>Situation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situation Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.SituationType
   * @generated
   */
  EClass getSituationType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.SituationType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.SituationType#getValue()
   * @see #getSituationType()
   * @generated
   */
  EReference getSituationType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SituationDeclaration <em>Situation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situation Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.SituationDeclaration
   * @generated
   */
  EClass getSituationDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.SituationDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.SituationDeclaration#getExpression()
   * @see #getSituationDeclaration()
   * @generated
   */
  EReference getSituationDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintType <em>Semantic Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semantic Constraint Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintType
   * @generated
   */
  EClass getSemanticConstraintType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintType#getValue()
   * @see #getSemanticConstraintType()
   * @generated
   */
  EReference getSemanticConstraintType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration <em>Semantic Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semantic Constraint Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration
   * @generated
   */
  EClass getSemanticConstraintDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration#getName()
   * @see #getSemanticConstraintDeclaration()
   * @generated
   */
  EAttribute getSemanticConstraintDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration#getExpression()
   * @see #getSemanticConstraintDeclaration()
   * @generated
   */
  EReference getSemanticConstraintDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintType <em>Transition Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Constraint Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintType
   * @generated
   */
  EClass getTransitionConstraintType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintType#getLabel()
   * @see #getTransitionConstraintType()
   * @generated
   */
  EAttribute getTransitionConstraintType_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintType#getValue()
   * @see #getTransitionConstraintType()
   * @generated
   */
  EReference getTransitionConstraintType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration <em>Transition Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Constraint Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration
   * @generated
   */
  EClass getTransitionConstraintDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration#getName()
   * @see #getTransitionConstraintDeclaration()
   * @generated
   */
  EAttribute getTransitionConstraintDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration#getLeft()
   * @see #getTransitionConstraintDeclaration()
   * @generated
   */
  EReference getTransitionConstraintDeclaration_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration#getRight()
   * @see #getTransitionConstraintDeclaration()
   * @generated
   */
  EReference getTransitionConstraintDeclaration_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExceptionType <em>Exception Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionType
   * @generated
   */
  EClass getExceptionType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExceptionType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionType#getLabel()
   * @see #getExceptionType()
   * @generated
   */
  EAttribute getExceptionType_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExceptionType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionType#getValue()
   * @see #getExceptionType()
   * @generated
   */
  EReference getExceptionType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExceptionDeclaration <em>Exception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionDeclaration
   * @generated
   */
  EClass getExceptionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExceptionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionDeclaration#getName()
   * @see #getExceptionDeclaration()
   * @generated
   */
  EAttribute getExceptionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExceptionDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExceptionDeclaration#getExpression()
   * @see #getExceptionDeclaration()
   * @generated
   */
  EReference getExceptionDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.AbstractDeclaration
   * @generated
   */
  EClass getAbstractDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AbstractDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.AbstractDeclaration#getName()
   * @see #getAbstractDeclaration()
   * @generated
   */
  EAttribute getAbstractDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ScopeType <em>Scope Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeType
   * @generated
   */
  EClass getScopeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ScopeType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeType#getLabel()
   * @see #getScopeType()
   * @generated
   */
  EAttribute getScopeType_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ScopeType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeType#getValue()
   * @see #getScopeType()
   * @generated
   */
  EReference getScopeType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration <em>Scope Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeDeclaration
   * @generated
   */
  EClass getScopeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeDeclaration#getName()
   * @see #getScopeDeclaration()
   * @generated
   */
  EAttribute getScopeDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeDeclaration#getException()
   * @see #getScopeDeclaration()
   * @generated
   */
  EReference getScopeDeclaration_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getHandlers <em>Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Handlers</em>'.
   * @see org.xtext.example.mydsl.myDsl.ScopeDeclaration#getHandlers()
   * @see #getScopeDeclaration()
   * @generated
   */
  EReference getScopeDeclaration_Handlers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration <em>Handler Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.HandlerDeclaration
   * @generated
   */
  EClass getHandlerDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.HandlerDeclaration#getExpression()
   * @see #getHandlerDeclaration()
   * @generated
   */
  EReference getHandlerDeclaration_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.xtext.example.mydsl.myDsl.HandlerDeclaration#getActions()
   * @see #getHandlerDeclaration()
   * @generated
   */
  EReference getHandlerDeclaration_Actions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getPropagation <em>Propagation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Propagation</em>'.
   * @see org.xtext.example.mydsl.myDsl.HandlerDeclaration#getPropagation()
   * @see #getHandlerDeclaration()
   * @generated
   */
  EReference getHandlerDeclaration_Propagation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ActionDeclaration <em>Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionDeclaration
   * @generated
   */
  EClass getActionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ActionDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionDeclaration#getExpression()
   * @see #getActionDeclaration()
   * @generated
   */
  EReference getActionDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropagationDeclaration <em>Propagation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propagation Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropagationDeclaration
   * @generated
   */
  EClass getPropagationDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.PropagationDeclaration#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exception</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropagationDeclaration#getException()
   * @see #getPropagationDeclaration()
   * @generated
   */
  EReference getPropagationDeclaration_Exception();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.SignalDeclaration
   * @generated
   */
  EClass getSignalDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.SignalDeclaration#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scope</em>'.
   * @see org.xtext.example.mydsl.myDsl.SignalDeclaration#getScope()
   * @see #getSignalDeclaration()
   * @generated
   */
  EReference getSignalDeclaration_Scope();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RaiseDeclaration <em>Raise Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raise Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.RaiseDeclaration
   * @generated
   */
  EClass getRaiseDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropertyType
   * @generated
   */
  EClass getPropertyType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PropertyType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropertyType#getLabel()
   * @see #getPropertyType()
   * @generated
   */
  EAttribute getPropertyType_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.PropertyType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropertyType#getValue()
   * @see #getPropertyType()
   * @generated
   */
  EReference getPropertyType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PropertyDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropertyDeclaration#getName()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EAttribute getPropertyDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.PropertyDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.PropertyDeclaration#getExpression()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LogicExpression <em>Logic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression
   * @generated
   */
  EClass getLogicExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getExpr()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Expr();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getValue()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpBin <em>Op Bin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Bin</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getOpBin()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpBin();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getLeft()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getRight()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpMul <em>Op Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Mul</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getOpMul()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpMul();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getArgs()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Args();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpTemp <em>Op Temp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Temp</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getOpTemp()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpTemp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getTemporal <em>Temporal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Temporal</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getTemporal()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_Temporal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpTempUntil <em>Op Temp Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Temp Until</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getOpTempUntil()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_OpTempUntil();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getLeftExp <em>Left Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getLeftExp()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_LeftExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getRightExp <em>Right Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getRightExp()
   * @see #getLogicExpression()
   * @generated
   */
  EReference getLogicExpression_RightExp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression#getOp()
   * @see #getLogicExpression()
   * @generated
   */
  EAttribute getLogicExpression_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OrOpExpression <em>Or Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Op Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.OrOpExpression
   * @generated
   */
  EClass getOrOpExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AndOpExpression <em>And Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Op Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.AndOpExpression
   * @generated
   */
  EClass getAndOpExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RelationalOpExpression <em>Relational Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Op Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.RelationalOpExpression
   * @generated
   */
  EClass getRelationalOpExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.UnaryOpExpression <em>Unary Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Op Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnaryOpExpression
   * @generated
   */
  EClass getUnaryOpExpression();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR <em>MULTIPLEOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MULTIPLEOPERATOR</em>'.
   * @see org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR
   * @generated
   */
  EEnum getMULTIPLEOPERATOR();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.BINARYOPERATOR <em>BINARYOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BINARYOPERATOR</em>'.
   * @see org.xtext.example.mydsl.myDsl.BINARYOPERATOR
   * @generated
   */
  EEnum getBINARYOPERATOR();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR <em>TEMPORALOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TEMPORALOPERATOR</em>'.
   * @see org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR
   * @generated
   */
  EEnum getTEMPORALOPERATOR();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR <em>TEMPUNTILOPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TEMPUNTILOPERATOR</em>'.
   * @see org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR
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
  MyDslFactory getMyDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainmodel()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ImportImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SystemDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystemDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionTypeImpl <em>Proposition Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropositionTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionType()
     * @generated
     */
    EClass PROPOSITION_TYPE = eINSTANCE.getPropositionType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionListImpl <em>Proposition List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropositionListImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionList()
     * @generated
     */
    EClass PROPOSITION_LIST = eINSTANCE.getPropositionList();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSITION_LIST__HEAD = eINSTANCE.getPropositionList_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSITION_LIST__TAIL = eINSTANCE.getPropositionList_Tail();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionSingleImpl <em>Proposition Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropositionSingleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionSingle()
     * @generated
     */
    EClass PROPOSITION_SINGLE = eINSTANCE.getPropositionSingle();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSITION_SINGLE__VALUE = eINSTANCE.getPropositionSingle_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropositionDeclarationImpl <em>Proposition Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropositionDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropositionDeclaration()
     * @generated
     */
    EClass PROPOSITION_DECLARATION = eINSTANCE.getPropositionDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SituationTypeImpl <em>Situation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SituationTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSituationType()
     * @generated
     */
    EClass SITUATION_TYPE = eINSTANCE.getSituationType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITUATION_TYPE__VALUE = eINSTANCE.getSituationType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SituationDeclarationImpl <em>Situation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SituationDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSituationDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SemanticConstraintTypeImpl <em>Semantic Constraint Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SemanticConstraintTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSemanticConstraintType()
     * @generated
     */
    EClass SEMANTIC_CONSTRAINT_TYPE = eINSTANCE.getSemanticConstraintType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMANTIC_CONSTRAINT_TYPE__VALUE = eINSTANCE.getSemanticConstraintType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SemanticConstraintDeclarationImpl <em>Semantic Constraint Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SemanticConstraintDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSemanticConstraintDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TransitionConstraintTypeImpl <em>Transition Constraint Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TransitionConstraintTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransitionConstraintType()
     * @generated
     */
    EClass TRANSITION_CONSTRAINT_TYPE = eINSTANCE.getTransitionConstraintType();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_CONSTRAINT_TYPE__LABEL = eINSTANCE.getTransitionConstraintType_Label();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CONSTRAINT_TYPE__VALUE = eINSTANCE.getTransitionConstraintType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TransitionConstraintDeclarationImpl <em>Transition Constraint Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TransitionConstraintDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransitionConstraintDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExceptionTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExceptionType()
     * @generated
     */
    EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION_TYPE__LABEL = eINSTANCE.getExceptionType_Label();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_TYPE__VALUE = eINSTANCE.getExceptionType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExceptionDeclarationImpl <em>Exception Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExceptionDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExceptionDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AbstractDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ScopeTypeImpl <em>Scope Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ScopeTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScopeType()
     * @generated
     */
    EClass SCOPE_TYPE = eINSTANCE.getScopeType();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE_TYPE__LABEL = eINSTANCE.getScopeType_Label();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE_TYPE__VALUE = eINSTANCE.getScopeType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getScopeDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl <em>Handler Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHandlerDeclaration()
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
     * The meta object literal for the '<em><b>Propagation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_DECLARATION__PROPAGATION = eINSTANCE.getHandlerDeclaration_Propagation();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropagationDeclarationImpl <em>Propagation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropagationDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropagationDeclaration()
     * @generated
     */
    EClass PROPAGATION_DECLARATION = eINSTANCE.getPropagationDeclaration();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPAGATION_DECLARATION__EXCEPTION = eINSTANCE.getPropagationDeclaration_Exception();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SignalDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSignalDeclaration()
     * @generated
     */
    EClass SIGNAL_DECLARATION = eINSTANCE.getSignalDeclaration();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_DECLARATION__SCOPE = eINSTANCE.getSignalDeclaration_Scope();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RaiseDeclarationImpl <em>Raise Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RaiseDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRaiseDeclaration()
     * @generated
     */
    EClass RAISE_DECLARATION = eINSTANCE.getRaiseDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropertyTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropertyType()
     * @generated
     */
    EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_TYPE__LABEL = eINSTANCE.getPropertyType_Label();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PropertyDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPropertyDeclaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl <em>Logic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLogicExpression()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OrOpExpressionImpl <em>Or Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OrOpExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOrOpExpression()
     * @generated
     */
    EClass OR_OP_EXPRESSION = eINSTANCE.getOrOpExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AndOpExpressionImpl <em>And Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AndOpExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAndOpExpression()
     * @generated
     */
    EClass AND_OP_EXPRESSION = eINSTANCE.getAndOpExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RelationalOpExpressionImpl <em>Relational Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RelationalOpExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRelationalOpExpression()
     * @generated
     */
    EClass RELATIONAL_OP_EXPRESSION = eINSTANCE.getRelationalOpExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.UnaryOpExpressionImpl <em>Unary Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.UnaryOpExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnaryOpExpression()
     * @generated
     */
    EClass UNARY_OP_EXPRESSION = eINSTANCE.getUnaryOpExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR <em>MULTIPLEOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMULTIPLEOPERATOR()
     * @generated
     */
    EEnum MULTIPLEOPERATOR = eINSTANCE.getMULTIPLEOPERATOR();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.BINARYOPERATOR <em>BINARYOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.BINARYOPERATOR
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBINARYOPERATOR()
     * @generated
     */
    EEnum BINARYOPERATOR = eINSTANCE.getBINARYOPERATOR();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR <em>TEMPORALOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTEMPORALOPERATOR()
     * @generated
     */
    EEnum TEMPORALOPERATOR = eINSTANCE.getTEMPORALOPERATOR();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR <em>TEMPUNTILOPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTEMPUNTILOPERATOR()
     * @generated
     */
    EEnum TEMPUNTILOPERATOR = eINSTANCE.getTEMPUNTILOPERATOR();

  }

} //MyDslPackage
