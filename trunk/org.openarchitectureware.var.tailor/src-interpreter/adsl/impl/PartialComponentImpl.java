/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.ComplexType;
import adsl.Interface;
import adsl.Module;
import adsl.PartialComponent;
import adsl.Using;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.PartialComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link adsl.impl.PartialComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link adsl.impl.PartialComponentImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link adsl.impl.PartialComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link adsl.impl.PartialComponentImpl#getSubPartialComponents <em>Sub Partial Components</em>}</li>
 *   <li>{@link adsl.impl.PartialComponentImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartialComponentImpl extends EObjectImpl implements PartialComponent {
  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Module> components;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsings()
   * @generated
   * @ordered
   */
  protected EList<Using> usings;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> interfaces;

  /**
   * The cached value of the '{@link #getSubPartialComponents() <em>Sub Partial Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPartialComponents()
   * @generated
   * @ordered
   */
  protected EList<PartialComponent> subPartialComponents;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<ComplexType> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartialComponentImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.PARTIAL_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module> getComponents() {
    if (components == null) {
      components = new EObjectContainmentEList<Module>(Module.class, this, AdslPackage.PARTIAL_COMPONENT__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.PARTIAL_COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Using> getUsings() {
    if (usings == null) {
      usings = new EObjectContainmentEList<Using>(Using.class, this, AdslPackage.PARTIAL_COMPONENT__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterfaces() {
    if (interfaces == null) {
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, AdslPackage.PARTIAL_COMPONENT__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartialComponent> getSubPartialComponents() {
    if (subPartialComponents == null) {
      subPartialComponents = new EObjectContainmentEList<PartialComponent>(PartialComponent.class, this, AdslPackage.PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS);
    }
    return subPartialComponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexType> getEntities() {
    if (entities == null) {
      entities = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, AdslPackage.PARTIAL_COMPONENT__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.PARTIAL_COMPONENT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case AdslPackage.PARTIAL_COMPONENT__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case AdslPackage.PARTIAL_COMPONENT__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case AdslPackage.PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS:
        return ((InternalEList<?>)getSubPartialComponents()).basicRemove(otherEnd, msgs);
      case AdslPackage.PARTIAL_COMPONENT__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AdslPackage.PARTIAL_COMPONENT__COMPONENTS:
        return getComponents();
      case AdslPackage.PARTIAL_COMPONENT__NAME:
        return getName();
      case AdslPackage.PARTIAL_COMPONENT__USINGS:
        return getUsings();
      case AdslPackage.PARTIAL_COMPONENT__INTERFACES:
        return getInterfaces();
      case AdslPackage.PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS:
        return getSubPartialComponents();
      case AdslPackage.PARTIAL_COMPONENT__ENTITIES:
        return getEntities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AdslPackage.PARTIAL_COMPONENT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Module>)newValue);
        return;
      case AdslPackage.PARTIAL_COMPONENT__NAME:
        setName((String)newValue);
        return;
      case AdslPackage.PARTIAL_COMPONENT__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using>)newValue);
        return;
      case AdslPackage.PARTIAL_COMPONENT__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
        return;
      case AdslPackage.PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS:
        getSubPartialComponents().clear();
        getSubPartialComponents().addAll((Collection<? extends PartialComponent>)newValue);
        return;
      case AdslPackage.PARTIAL_COMPONENT__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends ComplexType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case AdslPackage.PARTIAL_COMPONENT__COMPONENTS:
        getComponents().clear();
        return;
      case AdslPackage.PARTIAL_COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslPackage.PARTIAL_COMPONENT__USINGS:
        getUsings().clear();
        return;
      case AdslPackage.PARTIAL_COMPONENT__INTERFACES:
        getInterfaces().clear();
        return;
      case AdslPackage.PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS:
        getSubPartialComponents().clear();
        return;
      case AdslPackage.PARTIAL_COMPONENT__ENTITIES:
        getEntities().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case AdslPackage.PARTIAL_COMPONENT__COMPONENTS:
        return components != null && !components.isEmpty();
      case AdslPackage.PARTIAL_COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslPackage.PARTIAL_COMPONENT__USINGS:
        return usings != null && !usings.isEmpty();
      case AdslPackage.PARTIAL_COMPONENT__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case AdslPackage.PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS:
        return subPartialComponents != null && !subPartialComponents.isEmpty();
      case AdslPackage.PARTIAL_COMPONENT__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PartialComponentImpl
