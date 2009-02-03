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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Module#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link adsl.Module#getFeatureClause <em>Feature Clause</em>}</li>
 *   <li>{@link adsl.Module#getPorts <em>Ports</em>}</li>
 *   <li>{@link adsl.Module#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(ModuleConfiguration)
   * @see adsl.AdslPackage#getModule_Configuration()
   * @model containment="true" ordered="false"
   * @generated
   */
  ModuleConfiguration getConfiguration();

  /**
   * Sets the value of the '{@link adsl.Module#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(ModuleConfiguration value);

  /**
   * Returns the value of the '<em><b>Feature Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Clause</em>' containment reference.
   * @see #setFeatureClause(FeatureClause)
   * @see adsl.AdslPackage#getModule_FeatureClause()
   * @model containment="true" ordered="false"
   * @generated
   */
  FeatureClause getFeatureClause();

  /**
   * Sets the value of the '{@link adsl.Module#getFeatureClause <em>Feature Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Clause</em>' containment reference.
   * @see #getFeatureClause()
   * @generated
   */
  void setFeatureClause(FeatureClause value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see adsl.AdslPackage#getModule_Ports()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Port> getPorts();

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
   * @see adsl.AdslPackage#getModule_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Module
