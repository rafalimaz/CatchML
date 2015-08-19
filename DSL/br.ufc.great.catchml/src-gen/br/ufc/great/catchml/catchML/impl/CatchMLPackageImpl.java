/**
 */
package br.ufc.great.catchml.catchML.impl;

import br.ufc.great.catchml.catchML.AbstractDeclaration;
import br.ufc.great.catchml.catchML.AbstractElement;
import br.ufc.great.catchml.catchML.ActionDeclaration;
import br.ufc.great.catchml.catchML.AndOpExpression;
import br.ufc.great.catchml.catchML.CatchMLFactory;
import br.ufc.great.catchml.catchML.CatchMLPackage;
import br.ufc.great.catchml.catchML.Declaration;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatchMLPackageImpl extends EPackageImpl implements CatchMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainmodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propositionExpressionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propositionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass situationDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semanticConstraintDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionConstraintDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass handlerDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multipleoperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryoperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum temporaloperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tempuntiloperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CatchMLPackageImpl()
  {
    super(eNS_URI, CatchMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CatchMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CatchMLPackage init()
  {
    if (isInited) return (CatchMLPackage)EPackage.Registry.INSTANCE.getEPackage(CatchMLPackage.eNS_URI);

    // Obtain or create and register package
    CatchMLPackageImpl theCatchMLPackage = (CatchMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CatchMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CatchMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCatchMLPackage.createPackageContents();

    // Initialize created meta-data
    theCatchMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCatchMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CatchMLPackage.eNS_URI, theCatchMLPackage);
    return theCatchMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainmodel()
  {
    return domainmodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainmodel_Elements()
  {
    return (EReference)domainmodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemDeclaration()
  {
    return systemDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemDeclaration_Name()
  {
    return (EAttribute)systemDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemDeclaration_Declarations()
  {
    return (EReference)systemDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropositionExpressionDeclaration()
  {
    return propositionExpressionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropositionExpressionDeclaration_Args()
  {
    return (EReference)propositionExpressionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropositionDeclaration()
  {
    return propositionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSituationDeclaration()
  {
    return situationDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSituationDeclaration_Expression()
  {
    return (EReference)situationDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSemanticConstraintDeclaration()
  {
    return semanticConstraintDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSemanticConstraintDeclaration_Name()
  {
    return (EAttribute)semanticConstraintDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSemanticConstraintDeclaration_Expression()
  {
    return (EReference)semanticConstraintDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionConstraintDeclaration()
  {
    return transitionConstraintDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionConstraintDeclaration_Name()
  {
    return (EAttribute)transitionConstraintDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionConstraintDeclaration_Left()
  {
    return (EReference)transitionConstraintDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionConstraintDeclaration_Right()
  {
    return (EReference)transitionConstraintDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionDeclaration()
  {
    return exceptionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptionDeclaration_Name()
  {
    return (EAttribute)exceptionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionDeclaration_Expression()
  {
    return (EReference)exceptionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDeclaration()
  {
    return abstractDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDeclaration_Name()
  {
    return (EAttribute)abstractDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScopeDeclaration()
  {
    return scopeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopeDeclaration_Name()
  {
    return (EAttribute)scopeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopeDeclaration_Exception()
  {
    return (EReference)scopeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopeDeclaration_Handlers()
  {
    return (EReference)scopeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHandlerDeclaration()
  {
    return handlerDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandlerDeclaration_Expression()
  {
    return (EReference)handlerDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandlerDeclaration_Actions()
  {
    return (EReference)handlerDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionDeclaration()
  {
    return actionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionDeclaration_Expression()
  {
    return (EReference)actionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDeclaration()
  {
    return propertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDeclaration_Name()
  {
    return (EAttribute)propertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDeclaration_Expression()
  {
    return (EReference)propertyDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicExpression()
  {
    return logicExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_Expr()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_Value()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicExpression_OpBin()
  {
    return (EAttribute)logicExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_Left()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_Right()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicExpression_OpMul()
  {
    return (EAttribute)logicExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_Args()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicExpression_OpTemp()
  {
    return (EAttribute)logicExpressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_Temporal()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicExpression_OpTempUntil()
  {
    return (EAttribute)logicExpressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_LeftExp()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpression_RightExp()
  {
    return (EReference)logicExpressionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicExpression_Op()
  {
    return (EAttribute)logicExpressionEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrOpExpression()
  {
    return orOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndOpExpression()
  {
    return andOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalOpExpression()
  {
    return relationalOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryOpExpression()
  {
    return unaryOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMULTIPLEOPERATOR()
  {
    return multipleoperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBINARYOPERATOR()
  {
    return binaryoperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTEMPORALOPERATOR()
  {
    return temporaloperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTEMPUNTILOPERATOR()
  {
    return tempuntiloperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatchMLFactory getCatchMLFactory()
  {
    return (CatchMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainmodelEClass = createEClass(DOMAINMODEL);
    createEReference(domainmodelEClass, DOMAINMODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

    systemDeclarationEClass = createEClass(SYSTEM_DECLARATION);
    createEAttribute(systemDeclarationEClass, SYSTEM_DECLARATION__NAME);
    createEReference(systemDeclarationEClass, SYSTEM_DECLARATION__DECLARATIONS);

    declarationEClass = createEClass(DECLARATION);

    propositionExpressionDeclarationEClass = createEClass(PROPOSITION_EXPRESSION_DECLARATION);
    createEReference(propositionExpressionDeclarationEClass, PROPOSITION_EXPRESSION_DECLARATION__ARGS);

    propositionDeclarationEClass = createEClass(PROPOSITION_DECLARATION);

    situationDeclarationEClass = createEClass(SITUATION_DECLARATION);
    createEReference(situationDeclarationEClass, SITUATION_DECLARATION__EXPRESSION);

    semanticConstraintDeclarationEClass = createEClass(SEMANTIC_CONSTRAINT_DECLARATION);
    createEAttribute(semanticConstraintDeclarationEClass, SEMANTIC_CONSTRAINT_DECLARATION__NAME);
    createEReference(semanticConstraintDeclarationEClass, SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION);

    transitionConstraintDeclarationEClass = createEClass(TRANSITION_CONSTRAINT_DECLARATION);
    createEAttribute(transitionConstraintDeclarationEClass, TRANSITION_CONSTRAINT_DECLARATION__NAME);
    createEReference(transitionConstraintDeclarationEClass, TRANSITION_CONSTRAINT_DECLARATION__LEFT);
    createEReference(transitionConstraintDeclarationEClass, TRANSITION_CONSTRAINT_DECLARATION__RIGHT);

    exceptionDeclarationEClass = createEClass(EXCEPTION_DECLARATION);
    createEAttribute(exceptionDeclarationEClass, EXCEPTION_DECLARATION__NAME);
    createEReference(exceptionDeclarationEClass, EXCEPTION_DECLARATION__EXPRESSION);

    abstractDeclarationEClass = createEClass(ABSTRACT_DECLARATION);
    createEAttribute(abstractDeclarationEClass, ABSTRACT_DECLARATION__NAME);

    scopeDeclarationEClass = createEClass(SCOPE_DECLARATION);
    createEAttribute(scopeDeclarationEClass, SCOPE_DECLARATION__NAME);
    createEReference(scopeDeclarationEClass, SCOPE_DECLARATION__EXCEPTION);
    createEReference(scopeDeclarationEClass, SCOPE_DECLARATION__HANDLERS);

    handlerDeclarationEClass = createEClass(HANDLER_DECLARATION);
    createEReference(handlerDeclarationEClass, HANDLER_DECLARATION__EXPRESSION);
    createEReference(handlerDeclarationEClass, HANDLER_DECLARATION__ACTIONS);

    actionDeclarationEClass = createEClass(ACTION_DECLARATION);
    createEReference(actionDeclarationEClass, ACTION_DECLARATION__EXPRESSION);

    propertyDeclarationEClass = createEClass(PROPERTY_DECLARATION);
    createEAttribute(propertyDeclarationEClass, PROPERTY_DECLARATION__NAME);
    createEReference(propertyDeclarationEClass, PROPERTY_DECLARATION__EXPRESSION);

    logicExpressionEClass = createEClass(LOGIC_EXPRESSION);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__EXPR);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__VALUE);
    createEAttribute(logicExpressionEClass, LOGIC_EXPRESSION__OP_BIN);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__LEFT);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__RIGHT);
    createEAttribute(logicExpressionEClass, LOGIC_EXPRESSION__OP_MUL);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__ARGS);
    createEAttribute(logicExpressionEClass, LOGIC_EXPRESSION__OP_TEMP);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__TEMPORAL);
    createEAttribute(logicExpressionEClass, LOGIC_EXPRESSION__OP_TEMP_UNTIL);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__LEFT_EXP);
    createEReference(logicExpressionEClass, LOGIC_EXPRESSION__RIGHT_EXP);
    createEAttribute(logicExpressionEClass, LOGIC_EXPRESSION__OP);

    orOpExpressionEClass = createEClass(OR_OP_EXPRESSION);

    andOpExpressionEClass = createEClass(AND_OP_EXPRESSION);

    relationalOpExpressionEClass = createEClass(RELATIONAL_OP_EXPRESSION);

    unaryOpExpressionEClass = createEClass(UNARY_OP_EXPRESSION);

    // Create enums
    multipleoperatorEEnum = createEEnum(MULTIPLEOPERATOR);
    binaryoperatorEEnum = createEEnum(BINARYOPERATOR);
    temporaloperatorEEnum = createEEnum(TEMPORALOPERATOR);
    tempuntiloperatorEEnum = createEEnum(TEMPUNTILOPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    systemDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    propositionExpressionDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    propositionDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    situationDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    situationDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    semanticConstraintDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    transitionConstraintDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    exceptionDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    scopeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    propertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    orOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());
    andOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());
    relationalOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());
    unaryOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(domainmodelEClass, Domainmodel.class, "Domainmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainmodel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemDeclarationEClass, SystemDeclaration.class, "SystemDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemDeclaration_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propositionExpressionDeclarationEClass, PropositionExpressionDeclaration.class, "PropositionExpressionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropositionExpressionDeclaration_Args(), this.getPropositionDeclaration(), null, "args", null, 0, -1, PropositionExpressionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propositionDeclarationEClass, PropositionDeclaration.class, "PropositionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(situationDeclarationEClass, SituationDeclaration.class, "SituationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSituationDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, SituationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semanticConstraintDeclarationEClass, SemanticConstraintDeclaration.class, "SemanticConstraintDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSemanticConstraintDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SemanticConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSemanticConstraintDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, SemanticConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionConstraintDeclarationEClass, TransitionConstraintDeclaration.class, "TransitionConstraintDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionConstraintDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransitionConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionConstraintDeclaration_Left(), this.getLogicExpression(), null, "left", null, 0, 1, TransitionConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionConstraintDeclaration_Right(), this.getLogicExpression(), null, "right", null, 0, 1, TransitionConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionDeclarationEClass, ExceptionDeclaration.class, "ExceptionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExceptionDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExceptionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExceptionDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, ExceptionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeclarationEClass, AbstractDeclaration.class, "AbstractDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeDeclarationEClass, ScopeDeclaration.class, "ScopeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScopeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeDeclaration_Exception(), this.getExceptionDeclaration(), null, "exception", null, 0, 1, ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeDeclaration_Handlers(), this.getHandlerDeclaration(), null, "handlers", null, 0, -1, ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(handlerDeclarationEClass, HandlerDeclaration.class, "HandlerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHandlerDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, HandlerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerDeclaration_Actions(), this.getActionDeclaration(), null, "actions", null, 0, -1, HandlerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionDeclarationEClass, ActionDeclaration.class, "ActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, ActionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDeclarationEClass, PropertyDeclaration.class, "PropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicExpressionEClass, LogicExpression.class, "LogicExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicExpression_Expr(), this.getLogicExpression(), null, "expr", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_Value(), this.getAbstractDeclaration(), null, "value", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicExpression_OpBin(), this.getBINARYOPERATOR(), "opBin", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_Left(), this.getLogicExpression(), null, "left", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_Right(), this.getLogicExpression(), null, "right", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicExpression_OpMul(), this.getMULTIPLEOPERATOR(), "opMul", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_Args(), this.getLogicExpression(), null, "args", null, 0, -1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicExpression_OpTemp(), this.getTEMPORALOPERATOR(), "opTemp", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_Temporal(), this.getLogicExpression(), null, "temporal", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicExpression_OpTempUntil(), this.getTEMPUNTILOPERATOR(), "opTempUntil", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_LeftExp(), this.getLogicExpression(), null, "leftExp", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpression_RightExp(), this.getLogicExpression(), null, "rightExp", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, LogicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orOpExpressionEClass, OrOpExpression.class, "OrOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andOpExpressionEClass, AndOpExpression.class, "AndOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationalOpExpressionEClass, RelationalOpExpression.class, "RelationalOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unaryOpExpressionEClass, UnaryOpExpression.class, "UnaryOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(multipleoperatorEEnum, br.ufc.great.catchml.catchML.MULTIPLEOPERATOR.class, "MULTIPLEOPERATOR");
    addEEnumLiteral(multipleoperatorEEnum, br.ufc.great.catchml.catchML.MULTIPLEOPERATOR.XOR);

    initEEnum(binaryoperatorEEnum, br.ufc.great.catchml.catchML.BINARYOPERATOR.class, "BINARYOPERATOR");
    addEEnumLiteral(binaryoperatorEEnum, br.ufc.great.catchml.catchML.BINARYOPERATOR.NOR);
    addEEnumLiteral(binaryoperatorEEnum, br.ufc.great.catchml.catchML.BINARYOPERATOR.NAND);

    initEEnum(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.class, "TEMPORALOPERATOR");
    addEEnumLiteral(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.EX);
    addEEnumLiteral(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.EG);
    addEEnumLiteral(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.EF);
    addEEnumLiteral(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.AX);
    addEEnumLiteral(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.AG);
    addEEnumLiteral(temporaloperatorEEnum, br.ufc.great.catchml.catchML.TEMPORALOPERATOR.AF);

    initEEnum(tempuntiloperatorEEnum, br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR.class, "TEMPUNTILOPERATOR");
    addEEnumLiteral(tempuntiloperatorEEnum, br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR.E);
    addEEnumLiteral(tempuntiloperatorEEnum, br.ufc.great.catchml.catchML.TEMPUNTILOPERATOR.A);

    // Create resource
    createResource(eNS_URI);
  }

} //CatchMLPackageImpl
