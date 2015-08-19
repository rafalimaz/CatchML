/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getException <em>Exception</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getHandlers <em>Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScopeDeclaration()
 * @model
 * @generated
 */
public interface ScopeDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScopeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' reference.
   * @see #setException(ExceptionDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScopeDeclaration_Exception()
   * @model
   * @generated
   */
  ExceptionDeclaration getException();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ScopeDeclaration#getException <em>Exception</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' reference.
   * @see #getException()
   * @generated
   */
  void setException(ExceptionDeclaration value);

  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.HandlerDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScopeDeclaration_Handlers()
   * @model containment="true"
   * @generated
   */
  EList<HandlerDeclaration> getHandlers();

} // ScopeDeclaration
