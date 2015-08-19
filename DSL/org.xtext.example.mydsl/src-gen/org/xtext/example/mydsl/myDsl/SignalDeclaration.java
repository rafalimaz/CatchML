/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SignalDeclaration#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSignalDeclaration()
 * @model
 * @generated
 */
public interface SignalDeclaration extends PropagationDeclaration
{
  /**
   * Returns the value of the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' reference.
   * @see #setScope(ScopeDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSignalDeclaration_Scope()
   * @model
   * @generated
   */
  ScopeDeclaration getScope();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SignalDeclaration#getScope <em>Scope</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' reference.
   * @see #getScope()
   * @generated
   */
  void setScope(ScopeDeclaration value);

} // SignalDeclaration
