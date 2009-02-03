/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Parameter Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.ConfigurationParameterSetting#getValue <em>Value</em>}</li>
 *   <li>{@link adsl.ConfigurationParameterSetting#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getConfigurationParameterSetting()
 * @model
 * @generated
 */
public interface ConfigurationParameterSetting extends EObject {
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ConfigurationParameterValue)
   * @see adsl.AdslPackage#getConfigurationParameterSetting_Value()
   * @model containment="true" ordered="false"
   * @generated
   */
  ConfigurationParameterValue getValue();

  /**
   * Sets the value of the '{@link adsl.ConfigurationParameterSetting#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ConfigurationParameterValue value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(ConfigurationParameter)
   * @see adsl.AdslPackage#getConfigurationParameterSetting_Param()
   * @model ordered="false"
   * @generated
   */
  ConfigurationParameter getParam();

  /**
   * Sets the value of the '{@link adsl.ConfigurationParameterSetting#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(ConfigurationParameter value);

} // ConfigurationParameterSetting
