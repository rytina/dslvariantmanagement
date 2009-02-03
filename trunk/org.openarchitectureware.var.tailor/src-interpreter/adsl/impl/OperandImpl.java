/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import java.util.List;

import adsl.AdslPackage;
import adsl.Atom;
import adsl.Operand;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.OperandImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link adsl.impl.OperandImpl#isIsNot <em>Is Not</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperandImpl extends EObjectImpl implements Operand {
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Atom expression;

  /**
   * The default value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected boolean isNot = IS_NOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperandImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.OPERAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getExpression() {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Atom newExpression, NotificationChain msgs) {
    Atom oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.OPERAND__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Atom newExpression) {
    if (newExpression != expression) {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.OPERAND__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.OPERAND__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.OPERAND__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNot() {
    return isNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNot(boolean newIsNot) {
    boolean oldIsNot = isNot;
    isNot = newIsNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.OPERAND__IS_NOT, oldIsNot, isNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.OPERAND__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AdslPackage.OPERAND__EXPRESSION:
        return getExpression();
      case AdslPackage.OPERAND__IS_NOT:
        return isIsNot() ? Boolean.TRUE : Boolean.FALSE;
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AdslPackage.OPERAND__EXPRESSION:
        setExpression((Atom)newValue);
        return;
      case AdslPackage.OPERAND__IS_NOT:
        setIsNot(((Boolean)newValue).booleanValue());
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
  public void eUnset(int featureID) {
    switch (featureID) {
      case AdslPackage.OPERAND__EXPRESSION:
        setExpression((Atom)null);
        return;
      case AdslPackage.OPERAND__IS_NOT:
        setIsNot(IS_NOT_EDEFAULT);
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
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case AdslPackage.OPERAND__EXPRESSION:
        return expression != null;
      case AdslPackage.OPERAND__IS_NOT:
        return isNot != IS_NOT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isNot: ");
    result.append(isNot);
    result.append(')');
    return result.toString();
  }
  
  /** 
   * @author andy.rytina
   * @param selectedFeatureNames list of selected feature names
   * @return boolean result value of the evaluation 
   */
  @Override
  public boolean evaluate(List<String> selectedFeatureNames) {
    boolean evalResult = getExpression().evaluate(selectedFeatureNames);
    if( isIsNot() ) return !evalResult; 
    else return evalResult;
  }

} //OperandImpl
