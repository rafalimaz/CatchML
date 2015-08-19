/**
 */
package br.ufc.great.catchml.catchML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition Expression Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufc.great.catchml.catchML.PropositionExpressionDeclaration#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getPropositionExpressionDeclaration()
 * @model
 * @generated
 */
public interface PropositionExpressionDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link br.ufc.great.catchml.catchML.PropositionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see br.ufc.great.catchml.catchML.CatchMLPackage#getPropositionExpressionDeclaration_Args()
   * @model containment="true"
   * @generated
   */
  EList<PropositionDeclaration> getArgs();

} // PropositionExpressionDeclaration
