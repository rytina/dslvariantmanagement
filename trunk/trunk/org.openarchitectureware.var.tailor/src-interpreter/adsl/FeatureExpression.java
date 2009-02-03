/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.FeatureExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getFeatureExpression()
 * @model
 * @generated
 */
public interface FeatureExpression extends FeatureClause {
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(OrExpression)
   * @see adsl.AdslPackage#getFeatureExpression_Expression()
   * @model containment="true" ordered="false"
   * @generated
   */
  OrExpression getExpression();

  /**
   * Sets the value of the '{@link adsl.FeatureExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(OrExpression value);

} // FeatureExpression
