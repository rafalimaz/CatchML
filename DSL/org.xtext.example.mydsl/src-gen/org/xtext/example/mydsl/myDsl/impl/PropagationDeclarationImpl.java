/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PropagationDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PropagationDeclarationImpl#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropagationDeclarationImpl extends MinimalEObjectImpl.Container implements PropagationDeclaration
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected ExceptionDeclaration exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropagationDeclarationImpl()
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
    return MyDslPackage.Literals.PROPAGATION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionDeclaration getException()
  {
    if (exception != null && exception.eIsProxy())
    {
      InternalEObject oldException = (InternalEObject)exception;
      exception = (ExceptionDeclaration)eResolveProxy(oldException);
      if (exception != oldException)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.PROPAGATION_DECLARATION__EXCEPTION, oldException, exception));
      }
    }
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionDeclaration basicGetException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException(ExceptionDeclaration newException)
  {
    ExceptionDeclaration oldException = exception;
    exception = newException;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROPAGATION_DECLARATION__EXCEPTION, oldException, exception));
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
      case MyDslPackage.PROPAGATION_DECLARATION__EXCEPTION:
        if (resolve) return getException();
        return basicGetException();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PROPAGATION_DECLARATION__EXCEPTION:
        setException((ExceptionDeclaration)newValue);
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
      case MyDslPackage.PROPAGATION_DECLARATION__EXCEPTION:
        setException((ExceptionDeclaration)null);
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
      case MyDslPackage.PROPAGATION_DECLARATION__EXCEPTION:
        return exception != null;
    }
    return super.eIsSet(featureID);
  }

} //PropagationDeclarationImpl
