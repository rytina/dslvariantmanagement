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
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Atom#getExpression <em>Expression</em>}</li>
 *   <li>{@link adsl.Atom#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends EObject {
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
   * @see adsl.AdslPackage#getAtom_Expression()
   * @model containment="true" ordered="false"
   * @generated
   */
  OrExpression getExpression();

  /**
   * Sets the value of the '{@link adsl.Atom#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(OrExpression value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see adsl.AdslPackage#getAtom_Feature()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link adsl.Atom#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /** 
   * @author andy.rytina
   * @param selectedFeatureNames list of selected feature names
   * @return boolean result value of the evaluation 
   */
  boolean evaluate(List<String> selectedFeatureNames);

} // Atom
