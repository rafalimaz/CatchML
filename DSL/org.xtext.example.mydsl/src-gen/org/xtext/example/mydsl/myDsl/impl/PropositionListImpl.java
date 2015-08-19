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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposition List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PropositionListImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PropositionListImpl#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropositionListImpl extends PropositionTypeImpl implements PropositionList
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected PropositionDeclaration head;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<PropositionDeclaration> tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropositionListImpl()
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
    return MyDslPackage.Literals.PROPOSITION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropositionDeclaration getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(PropositionDeclaration newHead, NotificationChain msgs)
  {
    PropositionDeclaration oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROPOSITION_LIST__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(PropositionDeclaration newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROPOSITION_LIST__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROPOSITION_LIST__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROPOSITION_LIST__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropositionDeclaration> getTail()
  {
    if (tail == null)
    {
      tail = new EObjectContainmentEList<PropositionDeclaration>(PropositionDeclaration.class, this, MyDslPackage.PROPOSITION_LIST__TAIL);
    }
    return tail;
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
      case MyDslPackage.PROPOSITION_LIST__HEAD:
        return basicSetHead(null, msgs);
      case MyDslPackage.PROPOSITION_LIST__TAIL:
        return ((InternalEList<?>)getTail()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PROPOSITION_LIST__HEAD:
        return getHead();
      case MyDslPackage.PROPOSITION_LIST__TAIL:
        return getTail();
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
      case MyDslPackage.PROPOSITION_LIST__HEAD:
        setHead((PropositionDeclaration)newValue);
        return;
      case MyDslPackage.PROPOSITION_LIST__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends PropositionDeclaration>)newValue);
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
      case MyDslPackage.PROPOSITION_LIST__HEAD:
        setHead((PropositionDeclaration)null);
        return;
      case MyDslPackage.PROPOSITION_LIST__TAIL:
        getTail().clear();
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
      case MyDslPackage.PROPOSITION_LIST__HEAD:
        return head != null;
      case MyDslPackage.PROPOSITION_LIST__TAIL:
        return tail != null && !tail.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropositionListImpl
