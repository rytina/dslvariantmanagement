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
 * A representation of the model object '<em><b>Module Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.ModuleConfiguration#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getModuleConfiguration()
 * @model
 * @generated
 */
public interface ModuleConfiguration extends EObject {
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link adsl.ConfigurationParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see adsl.AdslPackage#getModuleConfiguration_Params()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ConfigurationParameter> getParams();

} // ModuleConfiguration
