/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyDslSwitch<Adapter> modelSwitch =
    new MyDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseSystemDeclaration(SystemDeclaration object)
      {
        return createSystemDeclarationAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter casePropositionType(PropositionType object)
      {
        return createPropositionTypeAdapter();
      }
      @Override
      public Adapter casePropositionList(PropositionList object)
      {
        return createPropositionListAdapter();
      }
      @Override
      public Adapter casePropositionSingle(PropositionSingle object)
      {
        return createPropositionSingleAdapter();
      }
      @Override
      public Adapter casePropositionDeclaration(PropositionDeclaration object)
      {
        return createPropositionDeclarationAdapter();
      }
      @Override
      public Adapter caseSituationType(SituationType object)
      {
        return createSituationTypeAdapter();
      }
      @Override
      public Adapter caseSituationDeclaration(SituationDeclaration object)
      {
        return createSituationDeclarationAdapter();
      }
      @Override
      public Adapter caseSemanticConstraintType(SemanticConstraintType object)
      {
        return createSemanticConstraintTypeAdapter();
      }
      @Override
      public Adapter caseSemanticConstraintDeclaration(SemanticConstraintDeclaration object)
      {
        return createSemanticConstraintDeclarationAdapter();
      }
      @Override
      public Adapter caseTransitionConstraintType(TransitionConstraintType object)
      {
        return createTransitionConstraintTypeAdapter();
      }
      @Override
      public Adapter caseTransitionConstraintDeclaration(TransitionConstraintDeclaration object)
      {
        return createTransitionConstraintDeclarationAdapter();
      }
      @Override
      public Adapter caseExceptionType(ExceptionType object)
      {
        return createExceptionTypeAdapter();
      }
      @Override
      public Adapter caseExceptionDeclaration(ExceptionDeclaration object)
      {
        return createExceptionDeclarationAdapter();
      }
      @Override
      public Adapter caseAbstractDeclaration(AbstractDeclaration object)
      {
        return createAbstractDeclarationAdapter();
      }
      @Override
      public Adapter caseScopeType(ScopeType object)
      {
        return createScopeTypeAdapter();
      }
      @Override
      public Adapter caseScopeDeclaration(ScopeDeclaration object)
      {
        return createScopeDeclarationAdapter();
      }
      @Override
      public Adapter caseHandlerDeclaration(HandlerDeclaration object)
      {
        return createHandlerDeclarationAdapter();
      }
      @Override
      public Adapter caseActionDeclaration(ActionDeclaration object)
      {
        return createActionDeclarationAdapter();
      }
      @Override
      public Adapter casePropagationDeclaration(PropagationDeclaration object)
      {
        return createPropagationDeclarationAdapter();
      }
      @Override
      public Adapter caseSignalDeclaration(SignalDeclaration object)
      {
        return createSignalDeclarationAdapter();
      }
      @Override
      public Adapter caseRaiseDeclaration(RaiseDeclaration object)
      {
        return createRaiseDeclarationAdapter();
      }
      @Override
      public Adapter casePropertyType(PropertyType object)
      {
        return createPropertyTypeAdapter();
      }
      @Override
      public Adapter casePropertyDeclaration(PropertyDeclaration object)
      {
        return createPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseLogicExpression(LogicExpression object)
      {
        return createLogicExpressionAdapter();
      }
      @Override
      public Adapter caseOrOpExpression(OrOpExpression object)
      {
        return createOrOpExpressionAdapter();
      }
      @Override
      public Adapter caseAndOpExpression(AndOpExpression object)
      {
        return createAndOpExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalOpExpression(RelationalOpExpression object)
      {
        return createRelationalOpExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryOpExpression(UnaryOpExpression object)
      {
        return createUnaryOpExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.SystemDeclaration
   * @generated
   */
  public Adapter createSystemDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropositionType <em>Proposition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropositionType
   * @generated
   */
  public Adapter createPropositionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropositionList <em>Proposition List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropositionList
   * @generated
   */
  public Adapter createPropositionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropositionSingle <em>Proposition Single</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropositionSingle
   * @generated
   */
  public Adapter createPropositionSingleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropositionDeclaration <em>Proposition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropositionDeclaration
   * @generated
   */
  public Adapter createPropositionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.SituationType <em>Situation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.SituationType
   * @generated
   */
  public Adapter createSituationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.SituationDeclaration <em>Situation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.SituationDeclaration
   * @generated
   */
  public Adapter createSituationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintType <em>Semantic Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintType
   * @generated
   */
  public Adapter createSemanticConstraintTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration <em>Semantic Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration
   * @generated
   */
  public Adapter createSemanticConstraintDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintType <em>Transition Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintType
   * @generated
   */
  public Adapter createTransitionConstraintTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration <em>Transition Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration
   * @generated
   */
  public Adapter createTransitionConstraintDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.ExceptionType <em>Exception Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.ExceptionType
   * @generated
   */
  public Adapter createExceptionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.ExceptionDeclaration <em>Exception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.ExceptionDeclaration
   * @generated
   */
  public Adapter createExceptionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.AbstractDeclaration
   * @generated
   */
  public Adapter createAbstractDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.ScopeType <em>Scope Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.ScopeType
   * @generated
   */
  public Adapter createScopeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration <em>Scope Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.ScopeDeclaration
   * @generated
   */
  public Adapter createScopeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration <em>Handler Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.HandlerDeclaration
   * @generated
   */
  public Adapter createHandlerDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.ActionDeclaration <em>Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.ActionDeclaration
   * @generated
   */
  public Adapter createActionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropagationDeclaration <em>Propagation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropagationDeclaration
   * @generated
   */
  public Adapter createPropagationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.SignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.SignalDeclaration
   * @generated
   */
  public Adapter createSignalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.RaiseDeclaration <em>Raise Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.RaiseDeclaration
   * @generated
   */
  public Adapter createRaiseDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropertyType
   * @generated
   */
  public Adapter createPropertyTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.LogicExpression <em>Logic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.LogicExpression
   * @generated
   */
  public Adapter createLogicExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.OrOpExpression <em>Or Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.OrOpExpression
   * @generated
   */
  public Adapter createOrOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.AndOpExpression <em>And Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.AndOpExpression
   * @generated
   */
  public Adapter createAndOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.RelationalOpExpression <em>Relational Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.RelationalOpExpression
   * @generated
   */
  public Adapter createRelationalOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.UnaryOpExpression <em>Unary Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.UnaryOpExpression
   * @generated
   */
  public Adapter createUnaryOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyDslAdapterFactory
