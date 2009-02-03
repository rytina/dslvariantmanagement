/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.AttributePrimitive#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getAttributePrimitive()
 * @model
 * @generated
 */
public interface AttributePrimitive extends Attribute {
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link adsl.PrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see adsl.PrimitiveType
   * @see #setType(PrimitiveType)
   * @see adsl.AdslPackage#getAttributePrimitive_Type()
   * @model unique="false" ordered="false"
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link adsl.AttributePrimitive#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see adsl.PrimitiveType
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

} // AttributePrimitive
