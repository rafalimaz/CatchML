/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
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
      case MyDslPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseAbstractElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SYSTEM_DECLARATION:
      {
        SystemDeclaration systemDeclaration = (SystemDeclaration)theEObject;
        T result = caseSystemDeclaration(systemDeclaration);
        if (result == null) result = caseAbstractElement(systemDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPOSITION_TYPE:
      {
        PropositionType propositionType = (PropositionType)theEObject;
        T result = casePropositionType(propositionType);
        if (result == null) result = caseDeclaration(propositionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPOSITION_LIST:
      {
        PropositionList propositionList = (PropositionList)theEObject;
        T result = casePropositionList(propositionList);
        if (result == null) result = casePropositionType(propositionList);
        if (result == null) result = caseDeclaration(propositionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPOSITION_SINGLE:
      {
        PropositionSingle propositionSingle = (PropositionSingle)theEObject;
        T result = casePropositionSingle(propositionSingle);
        if (result == null) result = casePropositionType(propositionSingle);
        if (result == null) result = caseDeclaration(propositionSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPOSITION_DECLARATION:
      {
        PropositionDeclaration propositionDeclaration = (PropositionDeclaration)theEObject;
        T result = casePropositionDeclaration(propositionDeclaration);
        if (result == null) result = caseAbstractDeclaration(propositionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SITUATION_TYPE:
      {
        SituationType situationType = (SituationType)theEObject;
        T result = caseSituationType(situationType);
        if (result == null) result = caseDeclaration(situationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SITUATION_DECLARATION:
      {
        SituationDeclaration situationDeclaration = (SituationDeclaration)theEObject;
        T result = caseSituationDeclaration(situationDeclaration);
        if (result == null) result = caseAbstractDeclaration(situationDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SEMANTIC_CONSTRAINT_TYPE:
      {
        SemanticConstraintType semanticConstraintType = (SemanticConstraintType)theEObject;
        T result = caseSemanticConstraintType(semanticConstraintType);
        if (result == null) result = caseDeclaration(semanticConstraintType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SEMANTIC_CONSTRAINT_DECLARATION:
      {
        SemanticConstraintDeclaration semanticConstraintDeclaration = (SemanticConstraintDeclaration)theEObject;
        T result = caseSemanticConstraintDeclaration(semanticConstraintDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TRANSITION_CONSTRAINT_TYPE:
      {
        TransitionConstraintType transitionConstraintType = (TransitionConstraintType)theEObject;
        T result = caseTransitionConstraintType(transitionConstraintType);
        if (result == null) result = caseDeclaration(transitionConstraintType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TRANSITION_CONSTRAINT_DECLARATION:
      {
        TransitionConstraintDeclaration transitionConstraintDeclaration = (TransitionConstraintDeclaration)theEObject;
        T result = caseTransitionConstraintDeclaration(transitionConstraintDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXCEPTION_TYPE:
      {
        ExceptionType exceptionType = (ExceptionType)theEObject;
        T result = caseExceptionType(exceptionType);
        if (result == null) result = caseDeclaration(exceptionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXCEPTION_DECLARATION:
      {
        ExceptionDeclaration exceptionDeclaration = (ExceptionDeclaration)theEObject;
        T result = caseExceptionDeclaration(exceptionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ABSTRACT_DECLARATION:
      {
        AbstractDeclaration abstractDeclaration = (AbstractDeclaration)theEObject;
        T result = caseAbstractDeclaration(abstractDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SCOPE_TYPE:
      {
        ScopeType scopeType = (ScopeType)theEObject;
        T result = caseScopeType(scopeType);
        if (result == null) result = caseDeclaration(scopeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SCOPE_DECLARATION:
      {
        ScopeDeclaration scopeDeclaration = (ScopeDeclaration)theEObject;
        T result = caseScopeDeclaration(scopeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HANDLER_DECLARATION:
      {
        HandlerDeclaration handlerDeclaration = (HandlerDeclaration)theEObject;
        T result = caseHandlerDeclaration(handlerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ACTION_DECLARATION:
      {
        ActionDeclaration actionDeclaration = (ActionDeclaration)theEObject;
        T result = caseActionDeclaration(actionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPAGATION_DECLARATION:
      {
        PropagationDeclaration propagationDeclaration = (PropagationDeclaration)theEObject;
        T result = casePropagationDeclaration(propagationDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SIGNAL_DECLARATION:
      {
        SignalDeclaration signalDeclaration = (SignalDeclaration)theEObject;
        T result = caseSignalDeclaration(signalDeclaration);
        if (result == null) result = casePropagationDeclaration(signalDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RAISE_DECLARATION:
      {
        RaiseDeclaration raiseDeclaration = (RaiseDeclaration)theEObject;
        T result = caseRaiseDeclaration(raiseDeclaration);
        if (result == null) result = casePropagationDeclaration(raiseDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPERTY_TYPE:
      {
        PropertyType propertyType = (PropertyType)theEObject;
        T result = casePropertyType(propertyType);
        if (result == null) result = caseDeclaration(propertyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPERTY_DECLARATION:
      {
        PropertyDeclaration propertyDeclaration = (PropertyDeclaration)theEObject;
        T result = casePropertyDeclaration(propertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOGIC_EXPRESSION:
      {
        LogicExpression logicExpression = (LogicExpression)theEObject;
        T result = caseLogicExpression(logicExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OR_OP_EXPRESSION:
      {
        OrOpExpression orOpExpression = (OrOpExpression)theEObject;
        T result = caseOrOpExpression(orOpExpression);
        if (result == null) result = caseLogicExpression(orOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.AND_OP_EXPRESSION:
      {
        AndOpExpression andOpExpression = (AndOpExpression)theEObject;
        T result = caseAndOpExpression(andOpExpression);
        if (result == null) result = caseLogicExpression(andOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RELATIONAL_OP_EXPRESSION:
      {
        RelationalOpExpression relationalOpExpression = (RelationalOpExpression)theEObject;
        T result = caseRelationalOpExpression(relationalOpExpression);
        if (result == null) result = caseLogicExpression(relationalOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNARY_OP_EXPRESSION:
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
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
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
   * Returns the result of interpreting the object as an instance of '<em>Proposition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropositionType(PropositionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proposition List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropositionList(PropositionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proposition Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropositionSingle(PropositionSingle object)
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
   * Returns the result of interpreting the object as an instance of '<em>Situation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Situation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSituationType(SituationType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Semantic Constraint Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semantic Constraint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemanticConstraintType(SemanticConstraintType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Transition Constraint Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Constraint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionConstraintType(TransitionConstraintType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionType(ExceptionType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Scope Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopeType(ScopeType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Propagation Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Propagation Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropagationDeclaration(PropagationDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalDeclaration(SignalDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raise Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raise Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRaiseDeclaration(RaiseDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyType(PropertyType object)
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

} //MyDslSwitch
