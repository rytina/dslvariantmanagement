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
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Connector#getTarget <em>Target</em>}</li>
 *   <li>{@link adsl.Connector#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(InstancePortPair)
   * @see adsl.AdslPackage#getConnector_Target()
   * @model containment="true" ordered="false"
   * @generated
   */
  InstancePortPair getTarget();

  /**
   * Sets the value of the '{@link adsl.Connector#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(InstancePortPair value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(InstancePortPair)
   * @see adsl.AdslPackage#getConnector_Source()
   * @model containment="true" ordered="false"
   * @generated
   */
  InstancePortPair getSource();

  /**
   * Sets the value of the '{@link adsl.Connector#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(InstancePortPair value);

} // Connector
