/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SemanticConstraintType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSemanticConstraintType()
 * @model
 * @generated
 */
public interface SemanticConstraintType extends Declaration
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SemanticConstraintDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSemanticConstraintType_Value()
   * @model containment="true"
   * @generated
   */
  SemanticConstraintDeclaration getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SemanticConstraintType#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SemanticConstraintDeclaration value);

} // SemanticConstraintType
