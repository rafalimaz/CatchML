/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.AbstractDeclaration;
import org.xtext.example.mydsl.myDsl.BINARYOPERATOR;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.MULTIPLEOPERATOR;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.TEMPORALOPERATOR;
import org.xtext.example.mydsl.myDsl.TEMPUNTILOPERATOR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getOpBin <em>Op Bin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getOpMul <em>Op Mul</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getOpTemp <em>Op Temp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getOpTempUntil <em>Op Temp Until</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getRightExp <em>Right Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LogicExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicExpressionImpl extends MinimalEObjectImpl.Container implements LogicExpression
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected LogicExpression expr;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AbstractDeclaration value;

  /**
   * The default value of the '{@link #getOpBin() <em>Op Bin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpBin()
   * @generated
   * @ordered
   */
  protected static final BINARYOPERATOR OP_BIN_EDEFAULT = BINARYOPERATOR.NOR;

  /**
   * The cached value of the '{@link #getOpBin() <em>Op Bin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpBin()
   * @generated
   * @ordered
   */
  protected BINARYOPERATOR opBin = OP_BIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LogicExpression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected LogicExpression right;

  /**
   * The default value of the '{@link #getOpMul() <em>Op Mul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpMul()
   * @generated
   * @ordered
   */
  protected static final MULTIPLEOPERATOR OP_MUL_EDEFAULT = MULTIPLEOPERATOR.XOR;

  /**
   * The cached value of the '{@link #getOpMul() <em>Op Mul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpMul()
   * @generated
   * @ordered
   */
  protected MULTIPLEOPERATOR opMul = OP_MUL_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<LogicExpression> args;

  /**
   * The default value of the '{@link #getOpTemp() <em>Op Temp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpTemp()
   * @generated
   * @ordered
   */
  protected static final TEMPORALOPERATOR OP_TEMP_EDEFAULT = TEMPORALOPERATOR.EX;

  /**
   * The cached value of the '{@link #getOpTemp() <em>Op Temp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpTemp()
   * @generated
   * @ordered
   */
  protected TEMPORALOPERATOR opTemp = OP_TEMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemporal()
   * @generated
   * @ordered
   */
  protected LogicExpression temporal;

  /**
   * The default value of the '{@link #getOpTempUntil() <em>Op Temp Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpTempUntil()
   * @generated
   * @ordered
   */
  protected static final TEMPUNTILOPERATOR OP_TEMP_UNTIL_EDEFAULT = TEMPUNTILOPERATOR.E;

  /**
   * The cached value of the '{@link #getOpTempUntil() <em>Op Temp Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpTempUntil()
   * @generated
   * @ordered
   */
  protected TEMPUNTILOPERATOR opTempUntil = OP_TEMP_UNTIL_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftExp() <em>Left Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExp()
   * @generated
   * @ordered
   */
  protected LogicExpression leftExp;

  /**
   * The cached value of the '{@link #getRightExp() <em>Right Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExp()
   * @generated
   * @ordered
   */
  protected LogicExpression rightExp;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.LOGIC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(LogicExpression newExpr, NotificationChain msgs)
  {
    LogicExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(LogicExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclaration getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (AbstractDeclaration)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.LOGIC_EXPRESSION__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclaration basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(AbstractDeclaration newValue)
  {
    AbstractDeclaration oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BINARYOPERATOR getOpBin()
  {
    return opBin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpBin(BINARYOPERATOR newOpBin)
  {
    BINARYOPERATOR oldOpBin = opBin;
    opBin = newOpBin == null ? OP_BIN_EDEFAULT : newOpBin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__OP_BIN, oldOpBin, opBin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LogicExpression newLeft, NotificationChain msgs)
  {
    LogicExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LogicExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(LogicExpression newRight, NotificationChain msgs)
  {
    LogicExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(LogicExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MULTIPLEOPERATOR getOpMul()
  {
    return opMul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpMul(MULTIPLEOPERATOR newOpMul)
  {
    MULTIPLEOPERATOR oldOpMul = opMul;
    opMul = newOpMul == null ? OP_MUL_EDEFAULT : newOpMul;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__OP_MUL, oldOpMul, opMul));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicExpression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<LogicExpression>(LogicExpression.class, this, MyDslPackage.LOGIC_EXPRESSION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TEMPORALOPERATOR getOpTemp()
  {
    return opTemp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpTemp(TEMPORALOPERATOR newOpTemp)
  {
    TEMPORALOPERATOR oldOpTemp = opTemp;
    opTemp = newOpTemp == null ? OP_TEMP_EDEFAULT : newOpTemp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__OP_TEMP, oldOpTemp, opTemp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getTemporal()
  {
    return temporal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemporal(LogicExpression newTemporal, NotificationChain msgs)
  {
    LogicExpression oldTemporal = temporal;
    temporal = newTemporal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__TEMPORAL, oldTemporal, newTemporal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemporal(LogicExpression newTemporal)
  {
    if (newTemporal != temporal)
    {
      NotificationChain msgs = null;
      if (temporal != null)
        msgs = ((InternalEObject)temporal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__TEMPORAL, null, msgs);
      if (newTemporal != null)
        msgs = ((InternalEObject)newTemporal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__TEMPORAL, null, msgs);
      msgs = basicSetTemporal(newTemporal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__TEMPORAL, newTemporal, newTemporal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TEMPUNTILOPERATOR getOpTempUntil()
  {
    return opTempUntil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpTempUntil(TEMPUNTILOPERATOR newOpTempUntil)
  {
    TEMPUNTILOPERATOR oldOpTempUntil = opTempUntil;
    opTempUntil = newOpTempUntil == null ? OP_TEMP_UNTIL_EDEFAULT : newOpTempUntil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__OP_TEMP_UNTIL, oldOpTempUntil, opTempUntil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getLeftExp()
  {
    return leftExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExp(LogicExpression newLeftExp, NotificationChain msgs)
  {
    LogicExpression oldLeftExp = leftExp;
    leftExp = newLeftExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP, oldLeftExp, newLeftExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExp(LogicExpression newLeftExp)
  {
    if (newLeftExp != leftExp)
    {
      NotificationChain msgs = null;
      if (leftExp != null)
        msgs = ((InternalEObject)leftExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP, null, msgs);
      if (newLeftExp != null)
        msgs = ((InternalEObject)newLeftExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP, null, msgs);
      msgs = basicSetLeftExp(newLeftExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP, newLeftExp, newLeftExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExpression getRightExp()
  {
    return rightExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExp(LogicExpression newRightExp, NotificationChain msgs)
  {
    LogicExpression oldRightExp = rightExp;
    rightExp = newRightExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP, oldRightExp, newRightExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExp(LogicExpression newRightExp)
  {
    if (newRightExp != rightExp)
    {
      NotificationChain msgs = null;
      if (rightExp != null)
        msgs = ((InternalEObject)rightExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP, null, msgs);
      if (newRightExp != null)
        msgs = ((InternalEObject)newRightExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP, null, msgs);
      msgs = basicSetRightExp(newRightExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP, newRightExp, newRightExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGIC_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.LOGIC_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case MyDslPackage.LOGIC_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case MyDslPackage.LOGIC_EXPRESSION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.LOGIC_EXPRESSION__TEMPORAL:
        return basicSetTemporal(null, msgs);
      case MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP:
        return basicSetLeftExp(null, msgs);
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP:
        return basicSetRightExp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.LOGIC_EXPRESSION__EXPR:
        return getExpr();
      case MyDslPackage.LOGIC_EXPRESSION__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case MyDslPackage.LOGIC_EXPRESSION__OP_BIN:
        return getOpBin();
      case MyDslPackage.LOGIC_EXPRESSION__LEFT:
        return getLeft();
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT:
        return getRight();
      case MyDslPackage.LOGIC_EXPRESSION__OP_MUL:
        return getOpMul();
      case MyDslPackage.LOGIC_EXPRESSION__ARGS:
        return getArgs();
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP:
        return getOpTemp();
      case MyDslPackage.LOGIC_EXPRESSION__TEMPORAL:
        return getTemporal();
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP_UNTIL:
        return getOpTempUntil();
      case MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP:
        return getLeftExp();
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP:
        return getRightExp();
      case MyDslPackage.LOGIC_EXPRESSION__OP:
        return getOp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.LOGIC_EXPRESSION__EXPR:
        setExpr((LogicExpression)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__VALUE:
        setValue((AbstractDeclaration)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_BIN:
        setOpBin((BINARYOPERATOR)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__LEFT:
        setLeft((LogicExpression)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT:
        setRight((LogicExpression)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_MUL:
        setOpMul((MULTIPLEOPERATOR)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends LogicExpression>)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP:
        setOpTemp((TEMPORALOPERATOR)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__TEMPORAL:
        setTemporal((LogicExpression)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP_UNTIL:
        setOpTempUntil((TEMPUNTILOPERATOR)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP:
        setLeftExp((LogicExpression)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP:
        setRightExp((LogicExpression)newValue);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP:
        setOp((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.LOGIC_EXPRESSION__EXPR:
        setExpr((LogicExpression)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__VALUE:
        setValue((AbstractDeclaration)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_BIN:
        setOpBin(OP_BIN_EDEFAULT);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__LEFT:
        setLeft((LogicExpression)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT:
        setRight((LogicExpression)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_MUL:
        setOpMul(OP_MUL_EDEFAULT);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__ARGS:
        getArgs().clear();
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP:
        setOpTemp(OP_TEMP_EDEFAULT);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__TEMPORAL:
        setTemporal((LogicExpression)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP_UNTIL:
        setOpTempUntil(OP_TEMP_UNTIL_EDEFAULT);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP:
        setLeftExp((LogicExpression)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP:
        setRightExp((LogicExpression)null);
        return;
      case MyDslPackage.LOGIC_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.LOGIC_EXPRESSION__EXPR:
        return expr != null;
      case MyDslPackage.LOGIC_EXPRESSION__VALUE:
        return value != null;
      case MyDslPackage.LOGIC_EXPRESSION__OP_BIN:
        return opBin != OP_BIN_EDEFAULT;
      case MyDslPackage.LOGIC_EXPRESSION__LEFT:
        return left != null;
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT:
        return right != null;
      case MyDslPackage.LOGIC_EXPRESSION__OP_MUL:
        return opMul != OP_MUL_EDEFAULT;
      case MyDslPackage.LOGIC_EXPRESSION__ARGS:
        return args != null && !args.isEmpty();
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP:
        return opTemp != OP_TEMP_EDEFAULT;
      case MyDslPackage.LOGIC_EXPRESSION__TEMPORAL:
        return temporal != null;
      case MyDslPackage.LOGIC_EXPRESSION__OP_TEMP_UNTIL:
        return opTempUntil != OP_TEMP_UNTIL_EDEFAULT;
      case MyDslPackage.LOGIC_EXPRESSION__LEFT_EXP:
        return leftExp != null;
      case MyDslPackage.LOGIC_EXPRESSION__RIGHT_EXP:
        return rightExp != null;
      case MyDslPackage.LOGIC_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (opBin: ");
    result.append(opBin);
    result.append(", opMul: ");
    result.append(opMul);
    result.append(", opTemp: ");
    result.append(opTemp);
    result.append(", opTempUntil: ");
    result.append(opTempUntil);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //LogicExpressionImpl
