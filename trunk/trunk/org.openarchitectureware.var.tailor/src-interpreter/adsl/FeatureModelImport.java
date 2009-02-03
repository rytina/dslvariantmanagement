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
 * A representation of the model object '<em><b>Feature Model Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.FeatureModelImport#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getFeatureModelImport()
 * @model
 * @generated
 */
public interface FeatureModelImport extends EObject {
  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see adsl.AdslPackage#getFeatureModelImport_Uri()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link adsl.FeatureModelImport#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // FeatureModelImport
