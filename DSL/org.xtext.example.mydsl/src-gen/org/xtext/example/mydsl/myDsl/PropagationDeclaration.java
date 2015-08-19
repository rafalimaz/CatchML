/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PropagationDeclaration#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropagationDeclaration()
 * @model
 * @generated
 */
public interface PropagationDeclaration extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropagationDeclaration_Exception()
   * @model
   * @generated
   */
  ExceptionDeclaration getException();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PropagationDeclaration#getException <em>Exception</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' reference.
   * @see #getException()
   * @generated
   */
  void setException(ExceptionDeclaration value);

} // PropagationDeclaration
