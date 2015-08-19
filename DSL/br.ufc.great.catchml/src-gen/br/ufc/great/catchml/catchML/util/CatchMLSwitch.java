/**
 */
package br.ufc.great.catchml.catchML.util;

import br.ufc.great.catchml.catchML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLPackage
 * @generated
 */
public class CatchMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CatchMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatchMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CatchMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CatchMLPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.SYSTEM_DECLARATION:
      {
        SystemDeclaration systemDeclaration = (SystemDeclaration)theEObject;
        T result = caseSystemDeclaration(systemDeclaration);
        if (result == null) result = caseAbstractElement(systemDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.PROPOSITION_EXPRESSION_DECLARATION:
      {
        PropositionExpressionDeclaration propositionExpressionDeclaration = (PropositionExpressionDeclaration)theEObject;
        T result = casePropositionExpressionDeclaration(propositionExpressionDeclaration);
        if (result == null) result = caseDeclaration(propositionExpressionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.PROPOSITION_DECLARATION:
      {
        PropositionDeclaration propositionDeclaration = (PropositionDeclaration)theEObject;
        T result = casePropositionDeclaration(propositionDeclaration);
        if (result == null) result = caseAbstractDeclaration(propositionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.SITUATION_DECLARATION:
      {
        SituationDeclaration situationDeclaration = (SituationDeclaration)theEObject;
        T result = caseSituationDeclaration(situationDeclaration);
        if (result == null) result = caseDeclaration(situationDeclaration);
        if (result == null) result = caseAbstractDeclaration(situationDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.SEMANTIC_CONSTRAINT_DECLARATION:
      {
        SemanticConstraintDeclaration semanticConstraintDeclaration = (SemanticConstraintDeclaration)theEObject;
        T result = caseSemanticConstraintDeclaration(semanticConstraintDeclaration);
        if (result == null) result = caseDeclaration(semanticConstraintDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.TRANSITION_CONSTRAINT_DECLARATION:
      {
        TransitionConstraintDeclaration transitionConstraintDeclaration = (TransitionConstraintDeclaration)theEObject;
        T result = caseTransitionConstraintDeclaration(transitionConstraintDeclaration);
        if (result == null) result = caseDeclaration(transitionConstraintDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.EXCEPTION_DECLARATION:
      {
        ExceptionDeclaration exceptionDeclaration = (ExceptionDeclaration)theEObject;
        T result = caseExceptionDeclaration(exceptionDeclaration);
        if (result == null) result = caseDeclaration(exceptionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.ABSTRACT_DECLARATION:
      {
        AbstractDeclaration abstractDeclaration = (AbstractDeclaration)theEObject;
        T result = caseAbstractDeclaration(abstractDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.SCOPE_DECLARATION:
      {
        ScopeDeclaration scopeDeclaration = (ScopeDeclaration)theEObject;
        T result = caseScopeDeclaration(scopeDeclaration);
        if (result == null) result = caseDeclaration(scopeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.HANDLER_DECLARATION:
      {
        HandlerDeclaration handlerDeclaration = (HandlerDeclaration)theEObject;
        T result = caseHandlerDeclaration(handlerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.ACTION_DECLARATION:
      {
        ActionDeclaration actionDeclaration = (ActionDeclaration)theEObject;
        T result = caseActionDeclaration(actionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.PROPERTY_DECLARATION:
      {
        PropertyDeclaration propertyDeclaration = (PropertyDeclaration)theEObject;
        T result = casePropertyDeclaration(propertyDeclaration);
        if (result == null) result = caseDeclaration(propertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.LOGIC_EXPRESSION:
      {
        LogicExpression logicExpression = (LogicExpression)theEObject;
        T result = caseLogicExpression(logicExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.OR_OP_EXPRESSION:
      {
        OrOpExpression orOpExpression = (OrOpExpression)theEObject;
        T result = caseOrOpExpression(orOpExpression);
        if (result == null) result = caseLogicExpression(orOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.AND_OP_EXPRESSION:
      {
        AndOpExpression andOpExpression = (AndOpExpression)theEObject;
        T result = caseAndOpExpression(andOpExpression);
        if (result == null) result = caseLogicExpression(andOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.RELATIONAL_OP_EXPRESSION:
      {
        RelationalOpExpression relationalOpExpression = (RelationalOpExpression)theEObject;
        T result = caseRelationalOpExpression(relationalOpExpression);
        if (result == null) result = caseLogicExpression(relationalOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CatchMLPackage.UNARY_OP_EXPRESSION:
      {
        UnaryOpExpression unaryOpExpression = (UnaryOpExpression)theEObject;
        T result = caseUnaryOpExpression(unaryOpExpression);
        if (result == null) result = caseLogicExpression(unaryOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemDeclaration(SystemDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proposition Expression Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition Expression Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropositionExpressionDeclaration(PropositionExpressionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proposition Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropositionDeclaration(PropositionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Situation Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Situation Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSituationDeclaration(SituationDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semantic Constraint Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semantic Constraint Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemanticConstraintDeclaration(SemanticConstraintDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Constraint Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Constraint Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionConstraintDeclaration(TransitionConstraintDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionDeclaration(ExceptionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDeclaration(AbstractDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopeDeclaration(ScopeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Handler Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Handler Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHandlerDeclaration(HandlerDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDeclaration(ActionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDeclaration(PropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicExpression(LogicExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrOpExpression(OrOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndOpExpression(AndOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalOpExpression(RelationalOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryOpExpression(UnaryOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CatchMLSwitch
