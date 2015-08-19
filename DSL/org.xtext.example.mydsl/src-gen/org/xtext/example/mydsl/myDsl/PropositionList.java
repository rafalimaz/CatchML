/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PropositionList#getHead <em>Head</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PropositionList#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropositionList()
 * @model
 * @generated
 */
public interface PropositionList extends PropositionType
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(PropositionDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropositionList_Head()
   * @model containment="true"
   * @generated
   */
  PropositionDeclaration getHead();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PropositionList#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(PropositionDeclaration value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.PropositionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPropositionList_Tail()
   * @model containment="true"
   * @generated
   */
  EList<PropositionDeclaration> getTail();

} // PropositionList
