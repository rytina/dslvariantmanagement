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
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Instance#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link adsl.Instance#getName <em>Name</em>}</li>
 *   <li>{@link adsl.Instance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(InstanceConfiguration)
   * @see adsl.AdslPackage#getInstance_Configuration()
   * @model containment="true" ordered="false"
   * @generated
   */
  InstanceConfiguration getConfiguration();

  /**
   * Sets the value of the '{@link adsl.Instance#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(InstanceConfiguration value);

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
   * @see adsl.AdslPackage#getInstance_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.Instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Module)
   * @see adsl.AdslPackage#getInstance_Type()
   * @model ordered="false"
   * @generated
   */
  Module getType();

  /**
   * Sets the value of the '{@link adsl.Instance#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Module value);

} // Instance
