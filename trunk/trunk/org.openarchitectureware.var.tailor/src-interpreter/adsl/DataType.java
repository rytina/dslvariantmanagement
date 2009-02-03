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
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.DataType#getName <em>Name</em>}</li>
 *   <li>{@link adsl.DataType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link adsl.DataType#getExtends <em>Extends</em>}</li>
 *   <li>{@link adsl.DataType#getOperations <em>Operations</em>}</li>
 *   <li>{@link adsl.DataType#isHasSupertype <em>Has Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
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
   * @see adsl.AdslPackage#getDataType_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.DataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see adsl.AdslPackage#getDataType_Attributes()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(AnyTypeRef)
   * @see adsl.AdslPackage#getDataType_Extends()
   * @model containment="true" ordered="false"
   * @generated
   */
  AnyTypeRef getExtends();

  /**
   * Sets the value of the '{@link adsl.DataType#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(AnyTypeRef value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see adsl.AdslPackage#getDataType_Operations()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>Has Supertype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Supertype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Supertype</em>' attribute.
   * @see #setHasSupertype(boolean)
   * @see adsl.AdslPackage#getDataType_HasSupertype()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isHasSupertype();

  /**
   * Sets the value of the '{@link adsl.DataType#isHasSupertype <em>Has Supertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Supertype</em>' attribute.
   * @see #isHasSupertype()
   * @generated
   */
  void setHasSupertype(boolean value);

} // DataType
