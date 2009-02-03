/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.OrExpression#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getOrExpression()
 * @model
 * @generated
 */
public interface OrExpression extends EObject {
  /**
   * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
   * The list contents are of type {@link adsl.AndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' containment reference list.
   * @see adsl.AdslPackage#getOrExpression_Operands()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<AndExpression> getOperands();
  
  /**
   * @author andy.rytina
   * @param selectedFeatureNames list of selected feature names
   * @return returns a boolean result of the evaluation
   */
  boolean evaluate(List<String> selectedFeatureNames);

} // OrExpression
