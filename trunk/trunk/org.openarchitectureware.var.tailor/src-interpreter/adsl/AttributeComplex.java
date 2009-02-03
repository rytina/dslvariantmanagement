/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.AttributeComplex#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link adsl.AttributeComplex#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link adsl.AttributeComplex#getTyperef <em>Typeref</em>}</li>
 *   <li>{@link adsl.AttributeComplex#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getAttributeComplex()
 * @model
 * @generated
 */
public interface AttributeComplex extends Attribute {
  /**
   * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Composite</em>' attribute.
   * @see #setIsComposite(boolean)
   * @see adsl.AdslPackage#getAttributeComplex_IsComposite()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsComposite();

  /**
   * Sets the value of the '{@link adsl.AttributeComplex#isIsComposite <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Composite</em>' attribute.
   * @see #isIsComposite()
   * @generated
   */
  void setIsComposite(boolean value);

  /**
   * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Reference</em>' attribute.
   * @see #setIsReference(boolean)
   * @see adsl.AdslPackage#getAttributeComplex_IsReference()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsReference();

  /**
   * Sets the value of the '{@link adsl.AttributeComplex#isIsReference <em>Is Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Reference</em>' attribute.
   * @see #isIsReference()
   * @generated
   */
  void setIsReference(boolean value);

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
   * @see adsl.AdslPackage#getAttributeComplex_Typeref()
   * @model containment="true" ordered="false"
   * @generated
   */
  AnyTypeRef getTyperef();

  /**
   * Sets the value of the '{@link adsl.AttributeComplex#getTyperef <em>Typeref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeref</em>' containment reference.
   * @see #getTyperef()
   * @generated
   */
  void setTyperef(AnyTypeRef value);

  /**
   * Returns the value of the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Required</em>' attribute.
   * @see #setIsRequired(boolean)
   * @see adsl.AdslPackage#getAttributeComplex_IsRequired()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsRequired();

  /**
   * Sets the value of the '{@link adsl.AttributeComplex#isIsRequired <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Required</em>' attribute.
   * @see #isIsRequired()
   * @generated
   */
  void setIsRequired(boolean value);

} // AttributeComplex
