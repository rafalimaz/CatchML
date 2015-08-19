/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getPropagation <em>Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHandlerDeclaration()
 * @model
 * @generated
 */
public interface HandlerDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(LogicExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHandlerDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  LogicExpression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ActionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHandlerDeclaration_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionDeclaration> getActions();

  /**
   * Returns the value of the '<em><b>Propagation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propagation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propagation</em>' containment reference.
   * @see #setPropagation(PropagationDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHandlerDeclaration_Propagation()
   * @model containment="true"
   * @generated
   */
  PropagationDeclaration getPropagation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.HandlerDeclaration#getPropagation <em>Propagation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propagation</em>' containment reference.
   * @see #getPropagation()
   * @generated
   */
  void setPropagation(PropagationDeclaration value);

} // HandlerDeclaration
