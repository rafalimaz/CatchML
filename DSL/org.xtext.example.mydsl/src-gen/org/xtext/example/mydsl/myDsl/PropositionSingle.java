/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PropositionSingle#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropositionSingle()
 * @model
 * @generated
 */
public interface PropositionSingle extends PropositionType
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
   * @see #setValue(PropositionDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropositionSingle_Value()
   * @model containment="true"
   * @generated
   */
  PropositionDeclaration getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PropositionSingle#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PropositionDeclaration value);

} // PropositionSingle
