/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpBin <em>Op Bin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpMul <em>Op Mul</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpTemp <em>Op Temp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpTempUntil <em>Op Temp Until</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getRightExp <em>Right Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression()
 * @model
 * @generated
 */
public interface LogicExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(LogicExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Expr()
   * @model containment="true"
   * @generated
   */
  LogicExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(AbstractDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Value()
   * @model
   * @generated
   */
  AbstractDeclaration getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AbstractDeclaration value);

  /**
   * Returns the value of the '<em><b>Op Bin</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.BINARYOPERATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Bin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Bin</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.BINARYOPERATOR
   * @see #setOpBin(BINARYOPERATOR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_OpBin()
   * @model
   * @generated
   */
  BINARYOPERATOR getOpBin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpBin <em>Op Bin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Bin</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.BINARYOPERATOR
   * @see #getOpBin()
   * @generated
   */
  void setOpBin(BINARYOPERATOR value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Left()
   * @model containment="true"
   * @generated
   */
  LogicExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getLeft <em>Left</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Right()
   * @model containment="true"
   * @generated
   */
  LogicExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Op Mul</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Mul</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Mul</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR
   * @see #setOpMul(MULTIPLEOPERATOR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_OpMul()
   * @model
   * @generated
   */
  MULTIPLEOPERATOR getOpMul();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpMul <em>Op Mul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Mul</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR
   * @see #getOpMul()
   * @generated
   */
  void setOpMul(MULTIPLEOPERATOR value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.LogicExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<LogicExpression> getArgs();

  /**
   * Returns the value of the '<em><b>Op Temp</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Temp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Temp</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR
   * @see #setOpTemp(TEMPORALOPERATOR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_OpTemp()
   * @model
   * @generated
   */
  TEMPORALOPERATOR getOpTemp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpTemp <em>Op Temp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Temp</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR
   * @see #getOpTemp()
   * @generated
   */
  void setOpTemp(TEMPORALOPERATOR value);

  /**
   * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temporal</em>' containment reference.
   * @see #setTemporal(LogicExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Temporal()
   * @model containment="true"
   * @generated
   */
  LogicExpression getTemporal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getTemporal <em>Temporal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temporal</em>' containment reference.
   * @see #getTemporal()
   * @generated
   */
  void setTemporal(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Op Temp Until</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Temp Until</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Temp Until</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR
   * @see #setOpTempUntil(TEMPUNTILOPERATOR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_OpTempUntil()
   * @model
   * @generated
   */
  TEMPUNTILOPERATOR getOpTempUntil();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOpTempUntil <em>Op Temp Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Temp Until</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR
   * @see #getOpTempUntil()
   * @generated
   */
  void setOpTempUntil(TEMPUNTILOPERATOR value);

  /**
   * Returns the value of the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Exp</em>' containment reference.
   * @see #setLeftExp(LogicExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_LeftExp()
   * @model containment="true"
   * @generated
   */
  LogicExpression getLeftExp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getLeftExp <em>Left Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Exp</em>' containment reference.
   * @see #getLeftExp()
   * @generated
   */
  void setLeftExp(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Exp</em>' containment reference.
   * @see #setRightExp(LogicExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_RightExp()
   * @model containment="true"
   * @generated
   */
  LogicExpression getRightExp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getRightExp <em>Right Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Exp</em>' containment reference.
   * @see #getRightExp()
   * @generated
   */
  void setRightExp(LogicExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLogicExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LogicExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // LogicExpression
