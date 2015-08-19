/**
 */
package br.ufc.great.catchml.catchML.util;

import br.ufc.great.catchml.catchML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLPackage
 * @generated
 */
public class CatchMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CatchMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatchMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CatchMLPackage.eINSTANCE;
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
  protected CatchMLSwitch<Adapter> modelSwitch =
    new CatchMLSwitch<Adapter>()
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
      public Adapter casePropositionExpressionDeclaration(PropositionExpressionDeclaration object)
      {
        return createPropositionExpressionDeclarationAdapter();
      }
      @Override
      public Adapter casePropositionDeclaration(PropositionDeclaration object)
      {
        return createPropositionDeclarationAdapter();
      }
      @Override
      public Adapter caseSituationDeclaration(SituationDeclaration object)
      {
        return createSituationDeclarationAdapter();
      }
      @Override
      public Adapter caseSemanticConstraintDeclaration(SemanticConstraintDeclaration object)
      {
        return createSemanticConstraintDeclarationAdapter();
      }
      @Override
      public Adapter caseTransitionConstraintDeclaration(TransitionConstraintDeclaration object)
      {
        return createTransitionConstraintDeclarationAdapter();
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
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.SystemDeclaration
   * @generated
   */
  public Adapter createSystemDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.PropositionExpressionDeclaration <em>Proposition Expression Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.PropositionExpressionDeclaration
   * @generated
   */
  public Adapter createPropositionExpressionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.PropositionDeclaration <em>Proposition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.PropositionDeclaration
   * @generated
   */
  public Adapter createPropositionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.SituationDeclaration <em>Situation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.SituationDeclaration
   * @generated
   */
  public Adapter createSituationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.SemanticConstraintDeclaration <em>Semantic Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.SemanticConstraintDeclaration
   * @generated
   */
  public Adapter createSemanticConstraintDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration <em>Transition Constraint Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.TransitionConstraintDeclaration
   * @generated
   */
  public Adapter createTransitionConstraintDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.ExceptionDeclaration <em>Exception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.ExceptionDeclaration
   * @generated
   */
  public Adapter createExceptionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.AbstractDeclaration
   * @generated
   */
  public Adapter createAbstractDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.ScopeDeclaration <em>Scope Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.ScopeDeclaration
   * @generated
   */
  public Adapter createScopeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.HandlerDeclaration <em>Handler Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.HandlerDeclaration
   * @generated
   */
  public Adapter createHandlerDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.ActionDeclaration <em>Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.ActionDeclaration
   * @generated
   */
  public Adapter createActionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.LogicExpression <em>Logic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.LogicExpression
   * @generated
   */
  public Adapter createLogicExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.OrOpExpression <em>Or Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.OrOpExpression
   * @generated
   */
  public Adapter createOrOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.AndOpExpression <em>And Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.AndOpExpression
   * @generated
   */
  public Adapter createAndOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.RelationalOpExpression <em>Relational Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.RelationalOpExpression
   * @generated
   */
  public Adapter createRelationalOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufc.great.catchml.catchML.UnaryOpExpression <em>Unary Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufc.great.catchml.catchML.UnaryOpExpression
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

} //CatchMLAdapterFactory
