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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.Operation#getFeatureClause <em>Feature Clause</em>}</li>
 *   <li>{@link adsl.Operation#getResultRef <em>Result Ref</em>}</li>
 *   <li>{@link adsl.Operation#isIsVoid <em>Is Void</em>}</li>
 *   <li>{@link adsl.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link adsl.Operation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
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
   * @see adsl.AdslPackage#getOperation_FeatureClause()
   * @model containment="true" ordered="false"
   * @generated
   */
  FeatureClause getFeatureClause();

  /**
   * Sets the value of the '{@link adsl.Operation#getFeatureClause <em>Feature Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Clause</em>' containment reference.
   * @see #getFeatureClause()
   * @generated
   */
  void setFeatureClause(FeatureClause value);

  /**
   * Returns the value of the '<em><b>Result Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Ref</em>' containment reference.
   * @see #setResultRef(AnyTypeRef)
   * @see adsl.AdslPackage#getOperation_ResultRef()
   * @model containment="true" ordered="false"
   * @generated
   */
  AnyTypeRef getResultRef();

  /**
   * Sets the value of the '{@link adsl.Operation#getResultRef <em>Result Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Ref</em>' containment reference.
   * @see #getResultRef()
   * @generated
   */
  void setResultRef(AnyTypeRef value);

  /**
   * Returns the value of the '<em><b>Is Void</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Void</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Void</em>' attribute.
   * @see #setIsVoid(boolean)
   * @see adsl.AdslPackage#getOperation_IsVoid()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsVoid();

  /**
   * Sets the value of the '{@link adsl.Operation#isIsVoid <em>Is Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Void</em>' attribute.
   * @see #isIsVoid()
   * @generated
   */
  void setIsVoid(boolean value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link adsl.OperationParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see adsl.AdslPackage#getOperation_Parameters()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<OperationParameter> getParameters();

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
   * @see adsl.AdslPackage#getOperation_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Operation
