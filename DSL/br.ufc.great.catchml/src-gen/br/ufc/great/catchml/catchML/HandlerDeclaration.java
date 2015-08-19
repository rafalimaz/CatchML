/**
 */
package br.ufc.great.catchml.catchML;

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
 *   <li>{@link br.ufc.great.catchml.catchML.HandlerDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link br.ufc.great.catchml.catchML.HandlerDeclaration#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getHandlerDeclaration()
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
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getHandlerDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  LogicExpression getExpression();

  /**
   * Sets the value of the '{@link br.ufc.great.catchml.catchML.HandlerDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufc.great.catchml.catchML.ActionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getHandlerDeclaration_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionDeclaration> getActions();

} // HandlerDeclaration
