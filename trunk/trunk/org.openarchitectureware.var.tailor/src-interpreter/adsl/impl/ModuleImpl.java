/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.FeatureClause;
import adsl.Module;
import adsl.ModuleConfiguration;
import adsl.Port;

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
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.ModuleImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link adsl.impl.ModuleImpl#getFeatureClause <em>Feature Clause</em>}</li>
 *   <li>{@link adsl.impl.ModuleImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link adsl.impl.ModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
  /**
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected ModuleConfiguration configuration;

  /**
   * The cached value of the '{@link #getFeatureClause() <em>Feature Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureClause()
   * @generated
   * @ordered
   */
  protected FeatureClause featureClause;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfiguration(ModuleConfiguration newConfiguration, NotificationChain msgs) {
    ModuleConfiguration oldConfiguration = configuration;
    configuration = newConfiguration;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.MODULE__CONFIGURATION, oldConfiguration, newConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfiguration(ModuleConfiguration newConfiguration) {
    if (newConfiguration != configuration) {
      NotificationChain msgs = null;
      if (configuration != null)
        msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.MODULE__CONFIGURATION, null, msgs);
      if (newConfiguration != null)
        msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.MODULE__CONFIGURATION, null, msgs);
      msgs = basicSetConfiguration(newConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.MODULE__CONFIGURATION, newConfiguration, newConfiguration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureClause getFeatureClause() {
    return featureClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureClause(FeatureClause newFeatureClause, NotificationChain msgs) {
    FeatureClause oldFeatureClause = featureClause;
    featureClause = newFeatureClause;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.MODULE__FEATURE_CLAUSE, oldFeatureClause, newFeatureClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureClause(FeatureClause newFeatureClause) {
    if (newFeatureClause != featureClause) {
      NotificationChain msgs = null;
      if (featureClause != null)
        msgs = ((InternalEObject)featureClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.MODULE__FEATURE_CLAUSE, null, msgs);
      if (newFeatureClause != null)
        msgs = ((InternalEObject)newFeatureClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.MODULE__FEATURE_CLAUSE, null, msgs);
      msgs = basicSetFeatureClause(newFeatureClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.MODULE__FEATURE_CLAUSE, newFeatureClause, newFeatureClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getPorts() {
    if (ports == null) {
      ports = new EObjectContainmentEList<Port>(Port.class, this, AdslPackage.MODULE__PORTS);
    }
    return ports;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.MODULE__CONFIGURATION:
        return basicSetConfiguration(null, msgs);
      case AdslPackage.MODULE__FEATURE_CLAUSE:
        return basicSetFeatureClause(null, msgs);
      case AdslPackage.MODULE__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
      case AdslPackage.MODULE__CONFIGURATION:
        return getConfiguration();
      case AdslPackage.MODULE__FEATURE_CLAUSE:
        return getFeatureClause();
      case AdslPackage.MODULE__PORTS:
        return getPorts();
      case AdslPackage.MODULE__NAME:
        return getName();
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
      case AdslPackage.MODULE__CONFIGURATION:
        setConfiguration((ModuleConfiguration)newValue);
        return;
      case AdslPackage.MODULE__FEATURE_CLAUSE:
        setFeatureClause((FeatureClause)newValue);
        return;
      case AdslPackage.MODULE__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case AdslPackage.MODULE__NAME:
        setName((String)newValue);
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
      case AdslPackage.MODULE__CONFIGURATION:
        setConfiguration((ModuleConfiguration)null);
        return;
      case AdslPackage.MODULE__FEATURE_CLAUSE:
        setFeatureClause((FeatureClause)null);
        return;
      case AdslPackage.MODULE__PORTS:
        getPorts().clear();
        return;
      case AdslPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
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
      case AdslPackage.MODULE__CONFIGURATION:
        return configuration != null;
      case AdslPackage.MODULE__FEATURE_CLAUSE:
        return featureClause != null;
      case AdslPackage.MODULE__PORTS:
        return ports != null && !ports.isEmpty();
      case AdslPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ModuleImpl
