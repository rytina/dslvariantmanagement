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
 * A representation of the model object '<em><b>Instance Port Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.InstancePortPair#getPort <em>Port</em>}</li>
 *   <li>{@link adsl.InstancePortPair#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getInstancePortPair()
 * @model
 * @generated
 */
public interface InstancePortPair extends EObject {
  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(Port)
   * @see adsl.AdslPackage#getInstancePortPair_Port()
   * @model ordered="false"
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link adsl.InstancePortPair#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

  /**
   * Returns the value of the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' reference.
   * @see #setInstance(Instance)
   * @see adsl.AdslPackage#getInstancePortPair_Instance()
   * @model ordered="false"
   * @generated
   */
  Instance getInstance();

  /**
   * Sets the value of the '{@link adsl.InstancePortPair#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(Instance value);

} // InstancePortPair
