/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.Instance;
import adsl.InstancePortPair;
import adsl.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Port Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.InstancePortPairImpl#getPort <em>Port</em>}</li>
 *   <li>{@link adsl.impl.InstancePortPairImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstancePortPairImpl extends EObjectImpl implements InstancePortPair {
  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance()
   * @generated
   * @ordered
   */
  protected Instance instance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstancePortPairImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.INSTANCE_PORT_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPort() {
    if (port != null && port.eIsProxy()) {
      InternalEObject oldPort = (InternalEObject)port;
      port = (Port)eResolveProxy(oldPort);
      if (port != oldPort) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdslPackage.INSTANCE_PORT_PAIR__PORT, oldPort, port));
      }
    }
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPort() {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(Port newPort) {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.INSTANCE_PORT_PAIR__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance getInstance() {
    if (instance != null && instance.eIsProxy()) {
      InternalEObject oldInstance = (InternalEObject)instance;
      instance = (Instance)eResolveProxy(oldInstance);
      if (instance != oldInstance) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdslPackage.INSTANCE_PORT_PAIR__INSTANCE, oldInstance, instance));
      }
    }
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetInstance() {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(Instance newInstance) {
    Instance oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.INSTANCE_PORT_PAIR__INSTANCE, oldInstance, instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AdslPackage.INSTANCE_PORT_PAIR__PORT:
        if (resolve) return getPort();
        return basicGetPort();
      case AdslPackage.INSTANCE_PORT_PAIR__INSTANCE:
        if (resolve) return getInstance();
        return basicGetInstance();
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
      case AdslPackage.INSTANCE_PORT_PAIR__PORT:
        setPort((Port)newValue);
        return;
      case AdslPackage.INSTANCE_PORT_PAIR__INSTANCE:
        setInstance((Instance)newValue);
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
      case AdslPackage.INSTANCE_PORT_PAIR__PORT:
        setPort((Port)null);
        return;
      case AdslPackage.INSTANCE_PORT_PAIR__INSTANCE:
        setInstance((Instance)null);
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
      case AdslPackage.INSTANCE_PORT_PAIR__PORT:
        return port != null;
      case AdslPackage.INSTANCE_PORT_PAIR__INSTANCE:
        return instance != null;
    }
    return super.eIsSet(featureID);
  }

} //InstancePortPairImpl
