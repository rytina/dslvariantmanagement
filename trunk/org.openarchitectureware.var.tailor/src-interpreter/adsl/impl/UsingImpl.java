/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.Using;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.UsingImpl#getPartialComponent <em>Partial Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsingImpl extends EObjectImpl implements Using {
  /**
   * The default value of the '{@link #getPartialComponent() <em>Partial Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartialComponent()
   * @generated
   * @ordered
   */
  protected static final String PARTIAL_COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartialComponent() <em>Partial Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartialComponent()
   * @generated
   * @ordered
   */
  protected String partialComponent = PARTIAL_COMPONENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.USING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPartialComponent() {
    return partialComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialComponent(String newPartialComponent) {
    String oldPartialComponent = partialComponent;
    partialComponent = newPartialComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.USING__PARTIAL_COMPONENT, oldPartialComponent, partialComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AdslPackage.USING__PARTIAL_COMPONENT:
        return getPartialComponent();
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
      case AdslPackage.USING__PARTIAL_COMPONENT:
        setPartialComponent((String)newValue);
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
      case AdslPackage.USING__PARTIAL_COMPONENT:
        setPartialComponent(PARTIAL_COMPONENT_EDEFAULT);
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
      case AdslPackage.USING__PARTIAL_COMPONENT:
        return PARTIAL_COMPONENT_EDEFAULT == null ? partialComponent != null : !PARTIAL_COMPONENT_EDEFAULT.equals(partialComponent);
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
    result.append(" (partialComponent: ");
    result.append(partialComponent);
    result.append(')');
    return result.toString();
  }

} //UsingImpl
