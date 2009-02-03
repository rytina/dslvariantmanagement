/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.AnyTypeRef;
import adsl.Attribute;
import adsl.DataType;
import adsl.Operation;

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
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link adsl.impl.DataTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link adsl.impl.DataTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link adsl.impl.DataTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link adsl.impl.DataTypeImpl#isHasSupertype <em>Has Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends EObjectImpl implements DataType {
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected AnyTypeRef extends_;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * The default value of the '{@link #isHasSupertype() <em>Has Supertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSupertype()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_SUPERTYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasSupertype() <em>Has Supertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSupertype()
   * @generated
   * @ordered
   */
  protected boolean hasSupertype = HAS_SUPERTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.DATA_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.DATA_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes() {
    if (attributes == null) {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, AdslPackage.DATA_TYPE__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyTypeRef getExtends() {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(AnyTypeRef newExtends, NotificationChain msgs) {
    AnyTypeRef oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.DATA_TYPE__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(AnyTypeRef newExtends) {
    if (newExtends != extends_) {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.DATA_TYPE__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.DATA_TYPE__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.DATA_TYPE__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations() {
    if (operations == null) {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, AdslPackage.DATA_TYPE__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasSupertype() {
    return hasSupertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasSupertype(boolean newHasSupertype) {
    boolean oldHasSupertype = hasSupertype;
    hasSupertype = newHasSupertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.DATA_TYPE__HAS_SUPERTYPE, oldHasSupertype, hasSupertype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.DATA_TYPE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case AdslPackage.DATA_TYPE__EXTENDS:
        return basicSetExtends(null, msgs);
      case AdslPackage.DATA_TYPE__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case AdslPackage.DATA_TYPE__NAME:
        return getName();
      case AdslPackage.DATA_TYPE__ATTRIBUTES:
        return getAttributes();
      case AdslPackage.DATA_TYPE__EXTENDS:
        return getExtends();
      case AdslPackage.DATA_TYPE__OPERATIONS:
        return getOperations();
      case AdslPackage.DATA_TYPE__HAS_SUPERTYPE:
        return isHasSupertype() ? Boolean.TRUE : Boolean.FALSE;
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
      case AdslPackage.DATA_TYPE__NAME:
        setName((String)newValue);
        return;
      case AdslPackage.DATA_TYPE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case AdslPackage.DATA_TYPE__EXTENDS:
        setExtends((AnyTypeRef)newValue);
        return;
      case AdslPackage.DATA_TYPE__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case AdslPackage.DATA_TYPE__HAS_SUPERTYPE:
        setHasSupertype(((Boolean)newValue).booleanValue());
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
      case AdslPackage.DATA_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslPackage.DATA_TYPE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case AdslPackage.DATA_TYPE__EXTENDS:
        setExtends((AnyTypeRef)null);
        return;
      case AdslPackage.DATA_TYPE__OPERATIONS:
        getOperations().clear();
        return;
      case AdslPackage.DATA_TYPE__HAS_SUPERTYPE:
        setHasSupertype(HAS_SUPERTYPE_EDEFAULT);
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
      case AdslPackage.DATA_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslPackage.DATA_TYPE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case AdslPackage.DATA_TYPE__EXTENDS:
        return extends_ != null;
      case AdslPackage.DATA_TYPE__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case AdslPackage.DATA_TYPE__HAS_SUPERTYPE:
        return hasSupertype != HAS_SUPERTYPE_EDEFAULT;
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
    result.append(", hasSupertype: ");
    result.append(hasSupertype);
    result.append(')');
    return result.toString();
  }

} //DataTypeImpl
