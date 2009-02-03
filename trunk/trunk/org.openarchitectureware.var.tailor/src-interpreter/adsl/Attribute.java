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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link adsl.Attribute#getFeatureClause <em>Feature Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends EObject {
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
   * @see adsl.AdslPackage#getAttribute_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see adsl.AdslPackage#getAttribute_FeatureClause()
   * @model containment="true" ordered="false"
   * @generated
   */
  FeatureClause getFeatureClause();

  /**
   * Sets the value of the '{@link adsl.Attribute#getFeatureClause <em>Feature Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Clause</em>' containment reference.
   * @see #getFeatureClause()
   * @generated
   */
  void setFeatureClause(FeatureClause value);

} // Attribute
