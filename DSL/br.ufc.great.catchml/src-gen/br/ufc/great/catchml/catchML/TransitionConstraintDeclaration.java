/**
 */
package br.ufc.great.catchml.catchML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Constraint Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getLeft <em>Left</em>}</li>
 *   <li>{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getTransitionConstraintDeclaration()
 * @model
 * @generated
 */
public interface TransitionConstraintDeclaration extends Declaration
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
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getTransitionConstraintDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicExpression)
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getTransitionConstraintDeclaration_Left()
   * @model containment="true"
   * @generated
   */
  LogicExpression getLeft();

  /**
   * Sets the value of the '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LogicExpression)
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getTransitionConstraintDeclaration_Right()
   * @model containment="true"
   * @generated
   */
  LogicExpression getRight();

  /**
   * Sets the value of the '{@link br.ufc.great.catchml.catchML.TransitionConstraintDeclaration#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LogicExpression value);

} // TransitionConstraintDeclaration
