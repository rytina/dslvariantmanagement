/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Operand#getExpression <em>Expression</em>}</li>
 *   <li>{@link adsl.Operand#isIsNot <em>Is Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends EObject {
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Atom)
   * @see adsl.AdslPackage#getOperand_Expression()
   * @model containment="true" ordered="false"
   * @generated
   */
  Atom getExpression();

  /**
   * Sets the value of the '{@link adsl.Operand#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Atom value);

  /**
   * Returns the value of the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Not</em>' attribute.
   * @see #setIsNot(boolean)
   * @see adsl.AdslPackage#getOperand_IsNot()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsNot();

  /**
   * Sets the value of the '{@link adsl.Operand#isIsNot <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Not</em>' attribute.
   * @see #isIsNot()
   * @generated
   */
  void setIsNot(boolean value);

  /** 
   * @author andy.rytina
   * @param selectedFeatureNames list of selected feature names
   * @return boolean result value of the evaluation 
   */
  boolean evaluate(List<String> selectedFeatureNames);

} // Operand
