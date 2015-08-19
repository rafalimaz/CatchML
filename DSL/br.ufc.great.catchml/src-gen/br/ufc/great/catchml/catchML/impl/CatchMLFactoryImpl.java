/**
 */
package br.ufc.great.catchml.catchML.impl;

import br.ufc.great.catchml.catchML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatchMLFactoryImpl extends EFactoryImpl implements CatchMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CatchMLFactory init()
  {
    try
    {
      CatchMLFactory theCatchMLFactory = (CatchMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ufc.br/great/catchml/CatchML"); 
      if (theCatchMLFactory != null)
      {
        return theCatchMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CatchMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatchMLFactoryImpl()
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
      case CatchMLPackage.DOMAINMODEL: return createDomainmodel();
      case CatchMLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case CatchMLPackage.SYSTEM_DECLARATION: return createSystemDeclaration();
      case CatchMLPackage.DECLARATION: return createDeclaration();
      case CatchMLPackage.PROPOSITION_EXPRESSION_DECLARATION: return createPropositionExpressionDeclaration();
      case CatchMLPackage.PROPOSITION_DECLARATION: return createPropositionDeclaration();
      case CatchMLPackage.SITUATION_DECLARATION: return createSituationDeclaration();
      case CatchMLPackage.SEMANTIC_CONSTRAINT_DECLARATION: return createSemanticConstraintDeclaration();
      case CatchMLPackage.TRANSITION_CONSTRAINT_DECLARATION: return createTransitionConstraintDeclaration();
      case CatchMLPackage.EXCEPTION_DECLARATION: return createExceptionDeclaration();
      case CatchMLPackage.ABSTRACT_DECLARATION: return createAbstractDeclaration();
      case CatchMLPackage.SCOPE_DECLARATION: return createScopeDeclaration();
      case CatchMLPackage.HANDLER_DECLARATION: return createHandlerDeclaration();
      case CatchMLPackage.ACTION_DECLARATION: return createActionDeclaration();
      case CatchMLPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
      case CatchMLPackage.LOGIC_EXPRESSION: return createLogicExpression();
      case CatchMLPackage.OR_OP_EXPRESSION: return createOrOpExpression();
      case CatchMLPackage.AND_OP_EXPRESSION: return createAndOpExpression();
      case CatchMLPackage.RELATIONAL_OP_EXPRESSION: return createRelationalOpExpression();
      case CatchMLPackage.UNARY_OP_EXPRESSION: return createUnaryOpExpression();
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
      case CatchMLPackage.MULTIPLEOPERATOR:
        return createMULTIPLEOPERATORFromString(eDataType, initialValue);
      case CatchMLPackage.BINARYOPERATOR:
        return createBINARYOPERATORFromString(eDataType, initialValue);
      case CatchMLPackage.TEMPORALOPERATOR:
        return createTEMPORALOPERATORFromString(eDataType, initialValue);
      case CatchMLPackage.TEMPUNTILOPERATOR:
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
      case CatchMLPackage.MULTIPLEOPERATOR:
        return convertMULTIPLEOPERATORToString(eDataType, instanceValue);
      case CatchMLPackage.BINARYOPERATOR:
        return convertBINARYOPERATORToString(eDataType, instanceValue);
      case CatchMLPackage.TEMPORALOPERATOR:
        return convertTEMPORALOPERATORToString(eDataType, instanceValue);
      case CatchMLPackage.TEMPUNTILOPERATOR:
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
  public PropositionExpressionDeclaration createPropositionExpressionDeclaration()
  {
    PropositionExpressionDeclarationImpl propositionExpressionDeclaration = new PropositionExpressionDeclarationImpl();
    return propositionExpressionDeclaration;
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
  public CatchMLPackage getCatchMLPackage()
  {
    return (CatchMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CatchMLPackage getPackage()
  {
    return CatchMLPackage.eINSTANCE;
  }

} //CatchMLFactoryImpl
