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
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.File#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link adsl.File#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link adsl.File#getImports <em>Imports</em>}</li>
 *   <li>{@link adsl.File#getPartialComponents <em>Partial Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
  /**
   * Returns the value of the '<em><b>Feature Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Model</em>' containment reference.
   * @see #setFeatureModel(FeatureModelImport)
   * @see adsl.AdslPackage#getFile_FeatureModel()
   * @model containment="true" ordered="false"
   * @generated
   */
  FeatureModelImport getFeatureModel();

  /**
   * Sets the value of the '{@link adsl.File#getFeatureModel <em>Feature Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Model</em>' containment reference.
   * @see #getFeatureModel()
   * @generated
   */
  void setFeatureModel(FeatureModelImport value);

  /**
   * Returns the value of the '<em><b>Compositions</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Composition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compositions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compositions</em>' containment reference list.
   * @see adsl.AdslPackage#getFile_Compositions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Composition> getCompositions();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see adsl.AdslPackage#getFile_Imports()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Partial Components</b></em>' containment reference list.
   * The list contents are of type {@link adsl.PartialComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Components</em>' containment reference list.
   * @see adsl.AdslPackage#getFile_PartialComponents()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<PartialComponent> getPartialComponents();

} // File
