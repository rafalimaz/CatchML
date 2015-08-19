/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.AbstractDeclaration;
import org.xtext.example.mydsl.myDsl.AbstractElement;
import org.xtext.example.mydsl.myDsl.ActionDeclaration;
import org.xtext.example.mydsl.myDsl.AndOpExpression;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.Domainmodel;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.ExceptionType;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.Import;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OrOpExpression;
import org.xtext.example.mydsl.myDsl.PropagationDeclaration;
import org.xtext.example.mydsl.myDsl.PropertyDeclaration;
import org.xtext.example.mydsl.myDsl.PropertyType;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionList;
import org.xtext.example.mydsl.myDsl.PropositionSingle;
import org.xtext.example.mydsl.myDsl.PropositionType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
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
  private EClass importEClass = null;

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
  private EClass propositionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propositionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propositionSingleEClass = null;

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
  private EClass situationTypeEClass = null;

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
  private EClass semanticConstraintTypeEClass = null;

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
  private EClass transitionConstraintTypeEClass = null;

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
  private EClass exceptionTypeEClass = null;

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
  private EClass scopeTypeEClass = null;

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
  private EClass propagationDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass raiseDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyTypeEClass = null;

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
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
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
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
  public EClass getPropositionType()
  {
    return propositionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropositionList()
  {
    return propositionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropositionList_Head()
  {
    return (EReference)propositionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropositionList_Tail()
  {
    return (EReference)propositionListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropositionSingle()
  {
    return propositionSingleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropositionSingle_Value()
  {
    return (EReference)propositionSingleEClass.getEStructuralFeatures().get(0);
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
  public EClass getSituationType()
  {
    return situationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSituationType_Value()
  {
    return (EReference)situationTypeEClass.getEStructuralFeatures().get(0);
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
  public EClass getSemanticConstraintType()
  {
    return semanticConstraintTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSemanticConstraintType_Value()
  {
    return (EReference)semanticConstraintTypeEClass.getEStructuralFeatures().get(0);
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
  public EClass getTransitionConstraintType()
  {
    return transitionConstraintTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionConstraintType_Label()
  {
    return (EAttribute)transitionConstraintTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionConstraintType_Value()
  {
    return (EReference)transitionConstraintTypeEClass.getEStructuralFeatures().get(1);
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
  public EClass getExceptionType()
  {
    return exceptionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptionType_Label()
  {
    return (EAttribute)exceptionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionType_Value()
  {
    return (EReference)exceptionTypeEClass.getEStructuralFeatures().get(1);
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
  public EClass getScopeType()
  {
    return scopeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopeType_Label()
  {
    return (EAttribute)scopeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopeType_Value()
  {
    return (EReference)scopeTypeEClass.getEStructuralFeatures().get(1);
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
  public EReference getHandlerDeclaration_Propagation()
  {
    return (EReference)handlerDeclarationEClass.getEStructuralFeatures().get(2);
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
  public EClass getPropagationDeclaration()
  {
    return propagationDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropagationDeclaration_Exception()
  {
    return (EReference)propagationDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalDeclaration()
  {
    return signalDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalDeclaration_Scope()
  {
    return (EReference)signalDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRaiseDeclaration()
  {
    return raiseDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyType()
  {
    return propertyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyType_Label()
  {
    return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyType_Value()
  {
    return (EReference)propertyTypeEClass.getEStructuralFeatures().get(1);
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
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
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

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    systemDeclarationEClass = createEClass(SYSTEM_DECLARATION);
    createEAttribute(systemDeclarationEClass, SYSTEM_DECLARATION__NAME);
    createEReference(systemDeclarationEClass, SYSTEM_DECLARATION__DECLARATIONS);

    declarationEClass = createEClass(DECLARATION);

    propositionTypeEClass = createEClass(PROPOSITION_TYPE);

    propositionListEClass = createEClass(PROPOSITION_LIST);
    createEReference(propositionListEClass, PROPOSITION_LIST__HEAD);
    createEReference(propositionListEClass, PROPOSITION_LIST__TAIL);

    propositionSingleEClass = createEClass(PROPOSITION_SINGLE);
    createEReference(propositionSingleEClass, PROPOSITION_SINGLE__VALUE);

    propositionDeclarationEClass = createEClass(PROPOSITION_DECLARATION);

    situationTypeEClass = createEClass(SITUATION_TYPE);
    createEReference(situationTypeEClass, SITUATION_TYPE__VALUE);

    situationDeclarationEClass = createEClass(SITUATION_DECLARATION);
    createEReference(situationDeclarationEClass, SITUATION_DECLARATION__EXPRESSION);

    semanticConstraintTypeEClass = createEClass(SEMANTIC_CONSTRAINT_TYPE);
    createEReference(semanticConstraintTypeEClass, SEMANTIC_CONSTRAINT_TYPE__VALUE);

    semanticConstraintDeclarationEClass = createEClass(SEMANTIC_CONSTRAINT_DECLARATION);
    createEAttribute(semanticConstraintDeclarationEClass, SEMANTIC_CONSTRAINT_DECLARATION__NAME);
    createEReference(semanticConstraintDeclarationEClass, SEMANTIC_CONSTRAINT_DECLARATION__EXPRESSION);

    transitionConstraintTypeEClass = createEClass(TRANSITION_CONSTRAINT_TYPE);
    createEAttribute(transitionConstraintTypeEClass, TRANSITION_CONSTRAINT_TYPE__LABEL);
    createEReference(transitionConstraintTypeEClass, TRANSITION_CONSTRAINT_TYPE__VALUE);

    transitionConstraintDeclarationEClass = createEClass(TRANSITION_CONSTRAINT_DECLARATION);
    createEAttribute(transitionConstraintDeclarationEClass, TRANSITION_CONSTRAINT_DECLARATION__NAME);
    createEReference(transitionConstraintDeclarationEClass, TRANSITION_CONSTRAINT_DECLARATION__LEFT);
    createEReference(transitionConstraintDeclarationEClass, TRANSITION_CONSTRAINT_DECLARATION__RIGHT);

    exceptionTypeEClass = createEClass(EXCEPTION_TYPE);
    createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__LABEL);
    createEReference(exceptionTypeEClass, EXCEPTION_TYPE__VALUE);

    exceptionDeclarationEClass = createEClass(EXCEPTION_DECLARATION);
    createEAttribute(exceptionDeclarationEClass, EXCEPTION_DECLARATION__NAME);
    createEReference(exceptionDeclarationEClass, EXCEPTION_DECLARATION__EXPRESSION);

    abstractDeclarationEClass = createEClass(ABSTRACT_DECLARATION);
    createEAttribute(abstractDeclarationEClass, ABSTRACT_DECLARATION__NAME);

    scopeTypeEClass = createEClass(SCOPE_TYPE);
    createEAttribute(scopeTypeEClass, SCOPE_TYPE__LABEL);
    createEReference(scopeTypeEClass, SCOPE_TYPE__VALUE);

    scopeDeclarationEClass = createEClass(SCOPE_DECLARATION);
    createEAttribute(scopeDeclarationEClass, SCOPE_DECLARATION__NAME);
    createEReference(scopeDeclarationEClass, SCOPE_DECLARATION__EXCEPTION);
    createEReference(scopeDeclarationEClass, SCOPE_DECLARATION__HANDLERS);

    handlerDeclarationEClass = createEClass(HANDLER_DECLARATION);
    createEReference(handlerDeclarationEClass, HANDLER_DECLARATION__EXPRESSION);
    createEReference(handlerDeclarationEClass, HANDLER_DECLARATION__ACTIONS);
    createEReference(handlerDeclarationEClass, HANDLER_DECLARATION__PROPAGATION);

    actionDeclarationEClass = createEClass(ACTION_DECLARATION);
    createEReference(actionDeclarationEClass, ACTION_DECLARATION__EXPRESSION);

    propagationDeclarationEClass = createEClass(PROPAGATION_DECLARATION);
    createEReference(propagationDeclarationEClass, PROPAGATION_DECLARATION__EXCEPTION);

    signalDeclarationEClass = createEClass(SIGNAL_DECLARATION);
    createEReference(signalDeclarationEClass, SIGNAL_DECLARATION__SCOPE);

    raiseDeclarationEClass = createEClass(RAISE_DECLARATION);

    propertyTypeEClass = createEClass(PROPERTY_TYPE);
    createEAttribute(propertyTypeEClass, PROPERTY_TYPE__LABEL);
    createEReference(propertyTypeEClass, PROPERTY_TYPE__VALUE);

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
    importEClass.getESuperTypes().add(this.getAbstractElement());
    systemDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    propositionTypeEClass.getESuperTypes().add(this.getDeclaration());
    propositionListEClass.getESuperTypes().add(this.getPropositionType());
    propositionSingleEClass.getESuperTypes().add(this.getPropositionType());
    propositionDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    situationTypeEClass.getESuperTypes().add(this.getDeclaration());
    situationDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
    semanticConstraintTypeEClass.getESuperTypes().add(this.getDeclaration());
    transitionConstraintTypeEClass.getESuperTypes().add(this.getDeclaration());
    exceptionTypeEClass.getESuperTypes().add(this.getDeclaration());
    scopeTypeEClass.getESuperTypes().add(this.getDeclaration());
    signalDeclarationEClass.getESuperTypes().add(this.getPropagationDeclaration());
    raiseDeclarationEClass.getESuperTypes().add(this.getPropagationDeclaration());
    propertyTypeEClass.getESuperTypes().add(this.getDeclaration());
    orOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());
    andOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());
    relationalOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());
    unaryOpExpressionEClass.getESuperTypes().add(this.getLogicExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(domainmodelEClass, Domainmodel.class, "Domainmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainmodel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemDeclarationEClass, SystemDeclaration.class, "SystemDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemDeclaration_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propositionTypeEClass, PropositionType.class, "PropositionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propositionListEClass, PropositionList.class, "PropositionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropositionList_Head(), this.getPropositionDeclaration(), null, "head", null, 0, 1, PropositionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropositionList_Tail(), this.getPropositionDeclaration(), null, "tail", null, 0, -1, PropositionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propositionSingleEClass, PropositionSingle.class, "PropositionSingle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropositionSingle_Value(), this.getPropositionDeclaration(), null, "value", null, 0, 1, PropositionSingle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propositionDeclarationEClass, PropositionDeclaration.class, "PropositionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(situationTypeEClass, SituationType.class, "SituationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSituationType_Value(), this.getSituationDeclaration(), null, "value", null, 0, 1, SituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(situationDeclarationEClass, SituationDeclaration.class, "SituationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSituationDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, SituationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semanticConstraintTypeEClass, SemanticConstraintType.class, "SemanticConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSemanticConstraintType_Value(), this.getSemanticConstraintDeclaration(), null, "value", null, 0, 1, SemanticConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semanticConstraintDeclarationEClass, SemanticConstraintDeclaration.class, "SemanticConstraintDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSemanticConstraintDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SemanticConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSemanticConstraintDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, SemanticConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionConstraintTypeEClass, TransitionConstraintType.class, "TransitionConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionConstraintType_Label(), ecorePackage.getEString(), "label", null, 0, 1, TransitionConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionConstraintType_Value(), this.getTransitionConstraintDeclaration(), null, "value", null, 0, 1, TransitionConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionConstraintDeclarationEClass, TransitionConstraintDeclaration.class, "TransitionConstraintDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionConstraintDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransitionConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionConstraintDeclaration_Left(), this.getLogicExpression(), null, "left", null, 0, 1, TransitionConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionConstraintDeclaration_Right(), this.getLogicExpression(), null, "right", null, 0, 1, TransitionConstraintDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionTypeEClass, ExceptionType.class, "ExceptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExceptionType_Label(), ecorePackage.getEString(), "label", null, 0, 1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExceptionType_Value(), this.getExceptionDeclaration(), null, "value", null, 0, 1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionDeclarationEClass, ExceptionDeclaration.class, "ExceptionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExceptionDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExceptionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExceptionDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, ExceptionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeclarationEClass, AbstractDeclaration.class, "AbstractDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeTypeEClass, ScopeType.class, "ScopeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScopeType_Label(), ecorePackage.getEString(), "label", null, 0, 1, ScopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeType_Value(), this.getScopeDeclaration(), null, "value", null, 0, 1, ScopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeDeclarationEClass, ScopeDeclaration.class, "ScopeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScopeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeDeclaration_Exception(), this.getExceptionDeclaration(), null, "exception", null, 0, 1, ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopeDeclaration_Handlers(), this.getHandlerDeclaration(), null, "handlers", null, 0, -1, ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(handlerDeclarationEClass, HandlerDeclaration.class, "HandlerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHandlerDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, HandlerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerDeclaration_Actions(), this.getActionDeclaration(), null, "actions", null, 0, -1, HandlerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerDeclaration_Propagation(), this.getPropagationDeclaration(), null, "propagation", null, 0, 1, HandlerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionDeclarationEClass, ActionDeclaration.class, "ActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionDeclaration_Expression(), this.getLogicExpression(), null, "expression", null, 0, 1, ActionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propagationDeclarationEClass, PropagationDeclaration.class, "PropagationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropagationDeclaration_Exception(), this.getExceptionDeclaration(), null, "exception", null, 0, 1, PropagationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalDeclarationEClass, SignalDeclaration.class, "SignalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalDeclaration_Scope(), this.getScopeDeclaration(), null, "scope", null, 0, 1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(raiseDeclarationEClass, RaiseDeclaration.class, "RaiseDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyType_Label(), ecorePackage.getEString(), "label", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyType_Value(), this.getPropertyDeclaration(), null, "value", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEEnum(multipleoperatorEEnum, org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR.class, "MULTIPLEOPERATOR");
    addEEnumLiteral(multipleoperatorEEnum, org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR.XOR);

    initEEnum(binaryoperatorEEnum, org.xtext.example.mydsl.myDsl.BINARYOPERATOR.class, "BINARYOPERATOR");
    addEEnumLiteral(binaryoperatorEEnum, org.xtext.example.mydsl.myDsl.BINARYOPERATOR.NOR);
    addEEnumLiteral(binaryoperatorEEnum, org.xtext.example.mydsl.myDsl.BINARYOPERATOR.NAND);

    initEEnum(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.class, "TEMPORALOPERATOR");
    addEEnumLiteral(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.EX);
    addEEnumLiteral(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.EG);
    addEEnumLiteral(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.EF);
    addEEnumLiteral(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.AX);
    addEEnumLiteral(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.AG);
    addEEnumLiteral(temporaloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR.AF);

    initEEnum(tempuntiloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR.class, "TEMPUNTILOPERATOR");
    addEEnumLiteral(tempuntiloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR.E);
    addEEnumLiteral(tempuntiloperatorEEnum, org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR.A);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
