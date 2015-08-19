/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ActionDeclaration;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PropagationDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HandlerDeclarationImpl#getPropagation <em>Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerDeclarationImpl extends MinimalEObjectImpl.Container implements HandlerDeclaration
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected LogicExpression expression;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<ActionDeclaration> actions;

  /**
   * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagation()
   * @generated
   * @ordered
   */
  protected PropagationDeclaration propagation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HandlerDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.HANDLER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(LogicExpression newExpression, NotificationChain msgs)
  {
    LogicExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.HANDLER_DECLARATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(LogicExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.HANDLER_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.HANDLER_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HANDLER_DECLARATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionDeclaration> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<ActionDeclaration>(ActionDeclaration.class, this, MyDslPackage.HANDLER_DECLARATION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropagationDeclaration getPropagation()
  {
    return propagation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropagation(PropagationDeclaration newPropagation, NotificationChain msgs)
  {
    PropagationDeclaration oldPropagation = propagation;
    propagation = newPropagation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.HANDLER_DECLARATION__PROPAGATION, oldPropagation, newPropagation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropagation(PropagationDeclaration newPropagation)
  {
    if (newPropagation != propagation)
    {
      NotificationChain msgs = null;
      if (propagation != null)
        msgs = ((InternalEObject)propagation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.HANDLER_DECLARATION__PROPAGATION, null, msgs);
      if (newPropagation != null)
        msgs = ((InternalEObject)newPropagation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.HANDLER_DECLARATION__PROPAGATION, null, msgs);
      msgs = basicSetPropagation(newPropagation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HANDLER_DECLARATION__PROPAGATION, newPropagation, newPropagation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.HANDLER_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.HANDLER_DECLARATION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case MyDslPackage.HANDLER_DECLARATION__PROPAGATION:
        return basicSetPropagation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.HANDLER_DECLARATION__EXPRESSION:
        return getExpression();
      case MyDslPackage.HANDLER_DECLARATION__ACTIONS:
        return getActions();
      case MyDslPackage.HANDLER_DECLARATION__PROPAGATION:
        return getPropagation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.HANDLER_DECLARATION__EXPRESSION:
        setExpression((LogicExpression)newValue);
        return;
      case MyDslPackage.HANDLER_DECLARATION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends ActionDeclaration>)newValue);
        return;
      case MyDslPackage.HANDLER_DECLARATION__PROPAGATION:
        setPropagation((PropagationDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.HANDLER_DECLARATION__EXPRESSION:
        setExpression((LogicExpression)null);
        return;
      case MyDslPackage.HANDLER_DECLARATION__ACTIONS:
        getActions().clear();
        return;
      case MyDslPackage.HANDLER_DECLARATION__PROPAGATION:
        setPropagation((PropagationDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.HANDLER_DECLARATION__EXPRESSION:
        return expression != null;
      case MyDslPackage.HANDLER_DECLARATION__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MyDslPackage.HANDLER_DECLARATION__PROPAGATION:
        return propagation != null;
    }
    return super.eIsSet(featureID);
  }

} //HandlerDeclarationImpl
