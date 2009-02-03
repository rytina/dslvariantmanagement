/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.ConfigurationParameter;
import adsl.ConfigurationParameterSetting;
import adsl.ConfigurationParameterValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Parameter Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.ConfigurationParameterSettingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link adsl.impl.ConfigurationParameterSettingImpl#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationParameterSettingImpl extends EObjectImpl implements ConfigurationParameterSetting {
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ConfigurationParameterValue value;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected ConfigurationParameter param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationParameterSettingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.CONFIGURATION_PARAMETER_SETTING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParameterValue getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ConfigurationParameterValue newValue, NotificationChain msgs) {
    ConfigurationParameterValue oldValue = value;
    value = newValue;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ConfigurationParameterValue newValue) {
    if (newValue != value) {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParameter getParam() {
    if (param != null && param.eIsProxy()) {
      InternalEObject oldParam = (InternalEObject)param;
      param = (ConfigurationParameter)eResolveProxy(oldParam);
      if (param != oldParam) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdslPackage.CONFIGURATION_PARAMETER_SETTING__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParameter basicGetParam() {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(ConfigurationParameter newParam) {
    ConfigurationParameter oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.CONFIGURATION_PARAMETER_SETTING__PARAM, oldParam, param));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE:
        return basicSetValue(null, msgs);
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
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE:
        return getValue();
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
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
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE:
        setValue((ConfigurationParameterValue)newValue);
        return;
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__PARAM:
        setParam((ConfigurationParameter)newValue);
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
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE:
        setValue((ConfigurationParameterValue)null);
        return;
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__PARAM:
        setParam((ConfigurationParameter)null);
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
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__VALUE:
        return value != null;
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING__PARAM:
        return param != null;
    }
    return super.eIsSet(featureID);
  }

} //ConfigurationParameterSettingImpl
