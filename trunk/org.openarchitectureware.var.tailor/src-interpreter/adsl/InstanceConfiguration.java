/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.InstanceConfiguration#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getInstanceConfiguration()
 * @model
 * @generated
 */
public interface InstanceConfiguration extends EObject {
  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
   * The list contents are of type {@link adsl.ConfigurationParameterSetting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference list.
   * @see adsl.AdslPackage#getInstanceConfiguration_Settings()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ConfigurationParameterSetting> getSettings();

} // InstanceConfiguration
