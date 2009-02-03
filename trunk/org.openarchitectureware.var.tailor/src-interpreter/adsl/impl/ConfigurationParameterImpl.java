/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.ConfigParamTypeEnum;
import adsl.ConfigurationParameter;
import adsl.ValueTimeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.ConfigurationParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link adsl.impl.ConfigurationParameterImpl#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link adsl.impl.ConfigurationParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationParameterImpl extends EObjectImpl implements ConfigurationParameter {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValueTime() <em>Value Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueTime()
   * @generated
   * @ordered
   */
  protected static final ValueTimeEnum VALUE_TIME_EDEFAULT = ValueTimeEnum.NULL;

  /**
   * The cached value of the '{@link #getValueTime() <em>Value Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueTime()
   * @generated
   * @ordered
   */
  protected ValueTimeEnum valueTime = VALUE_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConfigParamTypeEnum TYPE_EDEFAULT = ConfigParamTypeEnum.NULL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConfigParamTypeEnum type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationParameterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.CONFIGURATION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.CONFIGURATION_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueTimeEnum getValueTime() {
    return valueTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueTime(ValueTimeEnum newValueTime) {
    ValueTimeEnum oldValueTime = valueTime;
    valueTime = newValueTime == null ? VALUE_TIME_EDEFAULT : newValueTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.CONFIGURATION_PARAMETER__VALUE_TIME, oldValueTime, valueTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigParamTypeEnum getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConfigParamTypeEnum newType) {
    ConfigParamTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.CONFIGURATION_PARAMETER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AdslPackage.CONFIGURATION_PARAMETER__NAME:
        return getName();
      case AdslPackage.CONFIGURATION_PARAMETER__VALUE_TIME:
        return getValueTime();
      case AdslPackage.CONFIGURATION_PARAMETER__TYPE:
        return getType();
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
      case AdslPackage.CONFIGURATION_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case AdslPackage.CONFIGURATION_PARAMETER__VALUE_TIME:
        setValueTime((ValueTimeEnum)newValue);
        return;
      case AdslPackage.CONFIGURATION_PARAMETER__TYPE:
        setType((ConfigParamTypeEnum)newValue);
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
      case AdslPackage.CONFIGURATION_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslPackage.CONFIGURATION_PARAMETER__VALUE_TIME:
        setValueTime(VALUE_TIME_EDEFAULT);
        return;
      case AdslPackage.CONFIGURATION_PARAMETER__TYPE:
        setType(TYPE_EDEFAULT);
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
      case AdslPackage.CONFIGURATION_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslPackage.CONFIGURATION_PARAMETER__VALUE_TIME:
        return valueTime != VALUE_TIME_EDEFAULT;
      case AdslPackage.CONFIGURATION_PARAMETER__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", valueTime: ");
    result.append(valueTime);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ConfigurationParameterImpl
