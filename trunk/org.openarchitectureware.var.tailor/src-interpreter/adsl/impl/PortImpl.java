/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.Interface;
import adsl.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link adsl.impl.PortImpl#isIsToMany <em>Is To Many</em>}</li>
 *   <li>{@link adsl.impl.PortImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link adsl.impl.PortImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortImpl extends EObjectImpl implements Port {
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
   * The default value of the '{@link #isIsToMany() <em>Is To Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsToMany()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TO_MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsToMany() <em>Is To Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsToMany()
   * @generated
   * @ordered
   */
  protected boolean isToMany = IS_TO_MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected Interface interface_;

  /**
   * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMandatory()
   * @generated
   * @ordered
   */
  protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.PORT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.PORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsToMany() {
    return isToMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsToMany(boolean newIsToMany) {
    boolean oldIsToMany = isToMany;
    isToMany = newIsToMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.PORT__IS_TO_MANY, oldIsToMany, isToMany));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterface() {
    if (interface_ != null && interface_.eIsProxy()) {
      InternalEObject oldInterface = (InternalEObject)interface_;
      interface_ = (Interface)eResolveProxy(oldInterface);
      if (interface_ != oldInterface) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdslPackage.PORT__INTERFACE, oldInterface, interface_));
      }
    }
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInterface() {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(Interface newInterface) {
    Interface oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.PORT__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsMandatory() {
    return isMandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsMandatory(boolean newIsMandatory) {
    boolean oldIsMandatory = isMandatory;
    isMandatory = newIsMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.PORT__IS_MANDATORY, oldIsMandatory, isMandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AdslPackage.PORT__NAME:
        return getName();
      case AdslPackage.PORT__IS_TO_MANY:
        return isIsToMany() ? Boolean.TRUE : Boolean.FALSE;
      case AdslPackage.PORT__INTERFACE:
        if (resolve) return getInterface();
        return basicGetInterface();
      case AdslPackage.PORT__IS_MANDATORY:
        return isIsMandatory() ? Boolean.TRUE : Boolean.FALSE;
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AdslPackage.PORT__NAME:
        setName((String)newValue);
        return;
      case AdslPackage.PORT__IS_TO_MANY:
        setIsToMany(((Boolean)newValue).booleanValue());
        return;
      case AdslPackage.PORT__INTERFACE:
        setInterface((Interface)newValue);
        return;
      case AdslPackage.PORT__IS_MANDATORY:
        setIsMandatory(((Boolean)newValue).booleanValue());
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
      case AdslPackage.PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslPackage.PORT__IS_TO_MANY:
        setIsToMany(IS_TO_MANY_EDEFAULT);
        return;
      case AdslPackage.PORT__INTERFACE:
        setInterface((Interface)null);
        return;
      case AdslPackage.PORT__IS_MANDATORY:
        setIsMandatory(IS_MANDATORY_EDEFAULT);
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
      case AdslPackage.PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslPackage.PORT__IS_TO_MANY:
        return isToMany != IS_TO_MANY_EDEFAULT;
      case AdslPackage.PORT__INTERFACE:
        return interface_ != null;
      case AdslPackage.PORT__IS_MANDATORY:
        return isMandatory != IS_MANDATORY_EDEFAULT;
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
    result.append(", isToMany: ");
    result.append(isToMany);
    result.append(", isMandatory: ");
    result.append(isMandatory);
    result.append(')');
    return result.toString();
  }

} //PortImpl
