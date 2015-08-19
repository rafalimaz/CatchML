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

import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ScopeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScopeDeclarationImpl#getHandlers <em>Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeDeclarationImpl extends MinimalEObjectImpl.Container implements ScopeDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<HandlerDeclaration> handlers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeDeclarationImpl()
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
    return MyDslPackage.Literals.SCOPE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SCOPE_DECLARATION__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SCOPE_DECLARATION__EXCEPTION, oldException, exception));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SCOPE_DECLARATION__EXCEPTION, oldException, exception));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HandlerDeclaration> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<HandlerDeclaration>(HandlerDeclaration.class, this, MyDslPackage.SCOPE_DECLARATION__HANDLERS);
    }
    return handlers;
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
      case MyDslPackage.SCOPE_DECLARATION__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.SCOPE_DECLARATION__NAME:
        return getName();
      case MyDslPackage.SCOPE_DECLARATION__EXCEPTION:
        if (resolve) return getException();
        return basicGetException();
      case MyDslPackage.SCOPE_DECLARATION__HANDLERS:
        return getHandlers();
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
      case MyDslPackage.SCOPE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.SCOPE_DECLARATION__EXCEPTION:
        setException((ExceptionDeclaration)newValue);
        return;
      case MyDslPackage.SCOPE_DECLARATION__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends HandlerDeclaration>)newValue);
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
      case MyDslPackage.SCOPE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.SCOPE_DECLARATION__EXCEPTION:
        setException((ExceptionDeclaration)null);
        return;
      case MyDslPackage.SCOPE_DECLARATION__HANDLERS:
        getHandlers().clear();
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
      case MyDslPackage.SCOPE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.SCOPE_DECLARATION__EXCEPTION:
        return exception != null;
      case MyDslPackage.SCOPE_DECLARATION__HANDLERS:
        return handlers != null && !handlers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ScopeDeclarationImpl
