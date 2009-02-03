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
 * A representation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Using#getPartialComponent <em>Partial Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getUsing()
 * @model
 * @generated
 */
public interface Using extends EObject {
  /**
   * Returns the value of the '<em><b>Partial Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Component</em>' attribute.
   * @see #setPartialComponent(String)
   * @see adsl.AdslPackage#getUsing_PartialComponent()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getPartialComponent();

  /**
   * Sets the value of the '{@link adsl.Using#getPartialComponent <em>Partial Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Component</em>' attribute.
   * @see #getPartialComponent()
   * @generated
   */
  void setPartialComponent(String value);

} // Using
