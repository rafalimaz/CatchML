/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/mydsl/MyDsl"); 
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.DOMAINMODEL: return createDomainmodel();
      case MyDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case MyDslPackage.IMPORT: return createImport();
      case MyDslPackage.SYSTEM_DECLARATION: return createSystemDeclaration();
      case MyDslPackage.DECLARATION: return createDeclaration();
      case MyDslPackage.PROPOSITION_TYPE: return createPropositionType();
      case MyDslPackage.PROPOSITION_LIST: return createPropositionList();
      case MyDslPackage.PROPOSITION_SINGLE: return createPropositionSingle();
      case MyDslPackage.PROPOSITION_DECLARATION: return createPropositionDeclaration();
      case MyDslPackage.SITUATION_TYPE: return createSituationType();
      case MyDslPackage.SITUATION_DECLARATION: return createSituationDeclaration();
      case MyDslPackage.SEMANTIC_CONSTRAINT_TYPE: return createSemanticConstraintType();
      case MyDslPackage.SEMANTIC_CONSTRAINT_DECLARATION: return createSemanticConstraintDeclaration();
      case MyDslPackage.TRANSITION_CONSTRAINT_TYPE: return createTransitionConstraintType();
      case MyDslPackage.TRANSITION_CONSTRAINT_DECLARATION: return createTransitionConstraintDeclaration();
      case MyDslPackage.EXCEPTION_TYPE: return createExceptionType();
      case MyDslPackage.EXCEPTION_DECLARATION: return createExceptionDeclaration();
      case MyDslPackage.ABSTRACT_DECLARATION: return createAbstractDeclaration();
      case MyDslPackage.SCOPE_TYPE: return createScopeType();
      case MyDslPackage.SCOPE_DECLARATION: return createScopeDeclaration();
      case MyDslPackage.HANDLER_DECLARATION: return createHandlerDeclaration();
      case MyDslPackage.ACTION_DECLARATION: return createActionDeclaration();
      case MyDslPackage.PROPAGATION_DECLARATION: return createPropagationDeclaration();
      case MyDslPackage.SIGNAL_DECLARATION: return createSignalDeclaration();
      case MyDslPackage.RAISE_DECLARATION: return createRaiseDeclaration();
      case MyDslPackage.PROPERTY_TYPE: return createPropertyType();
      case MyDslPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
      case MyDslPackage.LOGIC_EXPRESSION: return createLogicExpression();
      case MyDslPackage.OR_OP_EXPRESSION: return createOrOpExpression();
      case MyDslPackage.AND_OP_EXPRESSION: return createAndOpExpression();
      case MyDslPackage.RELATIONAL_OP_EXPRESSION: return createRelationalOpExpression();
      case MyDslPackage.UNARY_OP_EXPRESSION: return createUnaryOpExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.MULTIPLEOPERATOR:
        return createMULTIPLEOPERATORFromString(eDataType, initialValue);
      case MyDslPackage.BINARYOPERATOR:
        return createBINARYOPERATORFromString(eDataType, initialValue);
      case MyDslPackage.TEMPORALOPERATOR:
        return createTEMPORALOPERATORFromString(eDataType, initialValue);
      case MyDslPackage.TEMPUNTILOPERATOR:
        return createTEMPUNTILOPERATORFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.MULTIPLEOPERATOR:
        return convertMULTIPLEOPERATORToString(eDataType, instanceValue);
      case MyDslPackage.BINARYOPERATOR:
        return convertBINARYOPERATORToString(eDataType, instanceValue);
      case MyDslPackage.TEMPORALOPERATOR:
        return convertTEMPORALOPERATORToString(eDataType, instanceValue);
      case MyDslPackage.TEMPUNTILOPERATOR:
        return convertTEMPUNTILOPERATORToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDeclaration createSystemDeclaration()
  {
    SystemDeclarationImpl systemDeclaration = new SystemDeclarationImpl();
    return systemDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropositionType createPropositionType()
  {
    PropositionTypeImpl propositionType = new PropositionTypeImpl();
    return propositionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropositionList createPropositionList()
  {
    PropositionListImpl propositionList = new PropositionListImpl();
    return propositionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropositionSingle createPropositionSingle()
  {
    PropositionSingleImpl propositionSingle = new PropositionSingleImpl();
    return propositionSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropositionDeclaration createPropositionDeclaration()
  {
    PropositionDeclarationImpl propositionDeclaration = new PropositionDeclarationImpl();
    return propositionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SituationType createSituationType()
  {
    SituationTypeImpl situationType = new SituationTypeImpl();
    return situationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SituationDeclaration createSituationDeclaration()
  {
    SituationDeclarationImpl situationDeclaration = new SituationDeclarationImpl();
    return situationDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemanticConstraintType createSemanticConstraintType()
  {
    SemanticConstraintTypeImpl semanticConstraintType = new SemanticConstraintTypeImpl();
    return semanticConstraintType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemanticConstraintDeclaration createSemanticConstraintDeclaration()
  {
    SemanticConstraintDeclarationImpl semanticConstraintDeclaration = new SemanticConstraintDeclarationImpl();
    return semanticConstraintDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionConstraintType createTransitionConstraintType()
  {
    TransitionConstraintTypeImpl transitionConstraintType = new TransitionConstraintTypeImpl();
    return transitionConstraintType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionConstraintDeclaration createTransitionConstraintDeclaration()
  {
    TransitionConstraintDeclarationImpl transitionConstraintDeclaration = new TransitionConstraintDeclarationImpl();
    return transitionConstraintDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionType createExceptionType()
  {
    ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
    return exceptionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionDeclaration createExceptionDeclaration()
  {
    ExceptionDeclarationImpl exceptionDeclaration = new ExceptionDeclarationImpl();
    return exceptionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclaration createAbstractDeclaration()
  {
    AbstractDeclarationImpl abstractDeclaration = new AbstractDeclarationImpl();
    return abstractDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeType createScopeType()
  {
    ScopeTypeImpl scopeType = new ScopeTypeImpl();
    return scopeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDeclaration createScopeDeclaration()
  {
    ScopeDeclarationImpl scopeDeclaration = new ScopeDeclarationImpl();
    return scopeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandlerDeclaration createHandlerDeclaration()
  {
    HandlerDeclarationImpl handlerDeclaration = new HandlerDeclarationImpl();
    return handlerDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDeclaration createActionDeclaration()
  {
    ActionDeclarationImpl actionDeclaration = new ActionDeclarationImpl();
    return actionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropagationDeclaration createPropagationDeclaration()
  {
    PropagationDeclarationImpl propagationDeclaration = new PropagationDeclarationImpl();
    return propagationDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalDeclaration createSignalDeclaration()
  {
    SignalDeclarationImpl signalDeclaration = new SignalDeclarationImpl();
    return signalDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaiseDeclaration createRaiseDeclaration()
  {
    RaiseDeclarationImpl raiseDeclaration = new RaiseDeclarationImpl();
    return raiseDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyType createPropertyType()
  {
    PropertyTypeImpl propertyType = new PropertyTypeImpl();
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDeclaration createPropertyDeclaration()
  {
    PropertyDeclarationImpl propertyDeclaration = new PropertyDeclarationImpl();
    return propertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression createLogicExpression()
  {
    LogicExpressionImpl logicExpression = new LogicExpressionImpl();
    return logicExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrOpExpression createOrOpExpression()
  {
    OrOpExpressionImpl orOpExpression = new OrOpExpressionImpl();
    return orOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndOpExpression createAndOpExpression()
  {
    AndOpExpressionImpl andOpExpression = new AndOpExpressionImpl();
    return andOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOpExpression createRelationalOpExpression()
  {
    RelationalOpExpressionImpl relationalOpExpression = new RelationalOpExpressionImpl();
    return relationalOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOpExpression createUnaryOpExpression()
  {
    UnaryOpExpressionImpl unaryOpExpression = new UnaryOpExpressionImpl();
    return unaryOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MULTIPLEOPERATOR createMULTIPLEOPERATORFromString(EDataType eDataType, String initialValue)
  {
    MULTIPLEOPERATOR result = MULTIPLEOPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMULTIPLEOPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BINARYOPERATOR createBINARYOPERATORFromString(EDataType eDataType, String initialValue)
  {
    BINARYOPERATOR result = BINARYOPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBINARYOPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TEMPORALOPERATOR createTEMPORALOPERATORFromString(EDataType eDataType, String initialValue)
  {
    TEMPORALOPERATOR result = TEMPORALOPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTEMPORALOPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TEMPUNTILOPERATOR createTEMPUNTILOPERATORFromString(EDataType eDataType, String initialValue)
  {
    TEMPUNTILOPERATOR result = TEMPUNTILOPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTEMPUNTILOPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
