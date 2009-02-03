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
 * A representation of the model object '<em><b>Partial Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adsl.PartialComponent#getComponents <em>Components</em>}</li>
 *   <li>{@link adsl.PartialComponent#getName <em>Name</em>}</li>
 *   <li>{@link adsl.PartialComponent#getUsings <em>Usings</em>}</li>
 *   <li>{@link adsl.PartialComponent#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link adsl.PartialComponent#getSubPartialComponents <em>Sub Partial Components</em>}</li>
 *   <li>{@link adsl.PartialComponent#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see adsl.AdslPackage#getPartialComponent()
 * @model
 * @generated
 */
public interface PartialComponent extends EObject {
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Module}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see adsl.AdslPackage#getPartialComponent_Components()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Module> getComponents();

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
   * @see adsl.AdslPackage#getPartialComponent_Name()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link adsl.PartialComponent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Using}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see adsl.AdslPackage#getPartialComponent_Usings()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Using> getUsings();

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link adsl.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see adsl.AdslPackage#getPartialComponent_Interfaces()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Interface> getInterfaces();

  /**
   * Returns the value of the '<em><b>Sub Partial Components</b></em>' containment reference list.
   * The list contents are of type {@link adsl.PartialComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Partial Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Partial Components</em>' containment reference list.
   * @see adsl.AdslPackage#getPartialComponent_SubPartialComponents()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<PartialComponent> getSubPartialComponents();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link adsl.ComplexType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see adsl.AdslPackage#getPartialComponent_Entities()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ComplexType> getEntities();

} // PartialComponent
