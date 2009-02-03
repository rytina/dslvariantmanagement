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
 * A representation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.OperationParameter#getTyperef <em>Typeref</em>}</li>
 *   <li>{@link adsl.OperationParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getOperationParameter()
 * @model
 * @generated
 */
public interface OperationParameter extends EObject {
  /**
   * Returns the value of the '<em><b>Typeref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeref</em>' containment reference.
   * @see #setTyperef(AnyTypeRef)
   * @see adsl.AdslPackage#getOperationParameter_Typeref()
   * @model containment="true" ordered="false"
   * @generated
   */
  AnyTypeRef getTyperef();

  /**
   * Sets the value of the '{@link adsl.OperationParameter#getTyperef <em>Typeref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeref</em>' containment reference.
   * @see #getTyperef()
   * @generated
   */
  void setTyperef(AnyTypeRef value);

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
   * @see adsl.AdslPackage#getOperationParameter_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.OperationParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // OperationParameter
