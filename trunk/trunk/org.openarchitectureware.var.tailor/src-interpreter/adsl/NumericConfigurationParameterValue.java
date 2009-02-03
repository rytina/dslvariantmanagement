/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Configuration Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.NumericConfigurationParameterValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getNumericConfigurationParameterValue()
 * @model
 * @generated
 */
public interface NumericConfigurationParameterValue extends ConfigurationParameterValue {
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see adsl.AdslPackage#getNumericConfigurationParameterValue_Value()
   * @model unique="false" ordered="false"
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link adsl.NumericConfigurationParameterValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // NumericConfigurationParameterValue
