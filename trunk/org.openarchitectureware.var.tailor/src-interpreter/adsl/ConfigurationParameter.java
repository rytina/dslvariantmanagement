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
 * A representation of the model object '<em><b>Configuration Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.ConfigurationParameter#getName <em>Name</em>}</li>
 *   <li>{@link adsl.ConfigurationParameter#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link adsl.ConfigurationParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getConfigurationParameter()
 * @model
 * @generated
 */
public interface ConfigurationParameter extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see adsl.AdslPackage#getConfigurationParameter_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.ConfigurationParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value Time</b></em>' attribute.
   * The literals are from the enumeration {@link adsl.ValueTimeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Time</em>' attribute.
   * @see adsl.ValueTimeEnum
   * @see #setValueTime(ValueTimeEnum)
   * @see adsl.AdslPackage#getConfigurationParameter_ValueTime()
   * @model unique="false" ordered="false"
   * @generated
   */
  ValueTimeEnum getValueTime();

  /**
   * Sets the value of the '{@link adsl.ConfigurationParameter#getValueTime <em>Value Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Time</em>' attribute.
   * @see adsl.ValueTimeEnum
   * @see #getValueTime()
   * @generated
   */
  void setValueTime(ValueTimeEnum value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link adsl.ConfigParamTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see adsl.ConfigParamTypeEnum
   * @see #setType(ConfigParamTypeEnum)
   * @see adsl.AdslPackage#getConfigurationParameter_Type()
   * @model unique="false" ordered="false"
   * @generated
   */
  ConfigParamTypeEnum getType();

  /**
   * Sets the value of the '{@link adsl.ConfigurationParameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see adsl.ConfigParamTypeEnum
   * @see #getType()
   * @generated
   */
  void setType(ConfigParamTypeEnum value);

} // ConfigurationParameter
