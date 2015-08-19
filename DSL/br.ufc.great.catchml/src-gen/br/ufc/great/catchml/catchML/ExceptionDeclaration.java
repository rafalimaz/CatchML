/**
 */
package br.ufc.great.catchml.catchML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufc.great.catchml.catchML.ExceptionDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link br.ufc.great.catchml.catchML.ExceptionDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getExceptionDeclaration()
 * @model
 * @generated
 */
public interface ExceptionDeclaration extends Declaration
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
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getExceptionDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufc.great.catchml.catchML.ExceptionDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getExceptionDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  LogicExpression getExpression();

  /**
   * Sets the value of the '{@link br.ufc.great.catchml.catchML.ExceptionDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicExpression value);

} // ExceptionDeclaration
