/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.AnyTypeRef;
import adsl.FeatureClause;
import adsl.Operation;
import adsl.OperationParameter;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.OperationImpl#getFeatureClause <em>Feature Clause</em>}</li>
 *   <li>{@link adsl.impl.OperationImpl#getResultRef <em>Result Ref</em>}</li>
 *   <li>{@link adsl.impl.OperationImpl#isIsVoid <em>Is Void</em>}</li>
 *   <li>{@link adsl.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link adsl.impl.OperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
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
   * The cached value of the '{@link #getResultRef() <em>Result Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultRef()
   * @generated
   * @ordered
   */
  protected AnyTypeRef resultRef;

  /**
   * The default value of the '{@link #isIsVoid() <em>Is Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVoid()
   * @generated
   * @ordered
   */
  protected static final boolean IS_VOID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsVoid() <em>Is Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVoid()
   * @generated
   * @ordered
   */
  protected boolean isVoid = IS_VOID_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<OperationParameter> parameters;

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
  protected OperationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.OPERATION__FEATURE_CLAUSE, oldFeatureClause, newFeatureClause);
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
        msgs = ((InternalEObject)featureClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.OPERATION__FEATURE_CLAUSE, null, msgs);
      if (newFeatureClause != null)
        msgs = ((InternalEObject)newFeatureClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.OPERATION__FEATURE_CLAUSE, null, msgs);
      msgs = basicSetFeatureClause(newFeatureClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.OPERATION__FEATURE_CLAUSE, newFeatureClause, newFeatureClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyTypeRef getResultRef() {
    return resultRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultRef(AnyTypeRef newResultRef, NotificationChain msgs) {
    AnyTypeRef oldResultRef = resultRef;
    resultRef = newResultRef;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.OPERATION__RESULT_REF, oldResultRef, newResultRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultRef(AnyTypeRef newResultRef) {
    if (newResultRef != resultRef) {
      NotificationChain msgs = null;
      if (resultRef != null)
        msgs = ((InternalEObject)resultRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.OPERATION__RESULT_REF, null, msgs);
      if (newResultRef != null)
        msgs = ((InternalEObject)newResultRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.OPERATION__RESULT_REF, null, msgs);
      msgs = basicSetResultRef(newResultRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.OPERATION__RESULT_REF, newResultRef, newResultRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsVoid() {
    return isVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsVoid(boolean newIsVoid) {
    boolean oldIsVoid = isVoid;
    isVoid = newIsVoid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.OPERATION__IS_VOID, oldIsVoid, isVoid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationParameter> getParameters() {
    if (parameters == null) {
      parameters = new EObjectContainmentEList<OperationParameter>(OperationParameter.class, this, AdslPackage.OPERATION__PARAMETERS);
    }
    return parameters;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.OPERATION__FEATURE_CLAUSE:
        return basicSetFeatureClause(null, msgs);
      case AdslPackage.OPERATION__RESULT_REF:
        return basicSetResultRef(null, msgs);
      case AdslPackage.OPERATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case AdslPackage.OPERATION__FEATURE_CLAUSE:
        return getFeatureClause();
      case AdslPackage.OPERATION__RESULT_REF:
        return getResultRef();
      case AdslPackage.OPERATION__IS_VOID:
        return isIsVoid() ? Boolean.TRUE : Boolean.FALSE;
      case AdslPackage.OPERATION__PARAMETERS:
        return getParameters();
      case AdslPackage.OPERATION__NAME:
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
      case AdslPackage.OPERATION__FEATURE_CLAUSE:
        setFeatureClause((FeatureClause)newValue);
        return;
      case AdslPackage.OPERATION__RESULT_REF:
        setResultRef((AnyTypeRef)newValue);
        return;
      case AdslPackage.OPERATION__IS_VOID:
        setIsVoid(((Boolean)newValue).booleanValue());
        return;
      case AdslPackage.OPERATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends OperationParameter>)newValue);
        return;
      case AdslPackage.OPERATION__NAME:
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
      case AdslPackage.OPERATION__FEATURE_CLAUSE:
        setFeatureClause((FeatureClause)null);
        return;
      case AdslPackage.OPERATION__RESULT_REF:
        setResultRef((AnyTypeRef)null);
        return;
      case AdslPackage.OPERATION__IS_VOID:
        setIsVoid(IS_VOID_EDEFAULT);
        return;
      case AdslPackage.OPERATION__PARAMETERS:
        getParameters().clear();
        return;
      case AdslPackage.OPERATION__NAME:
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
      case AdslPackage.OPERATION__FEATURE_CLAUSE:
        return featureClause != null;
      case AdslPackage.OPERATION__RESULT_REF:
        return resultRef != null;
      case AdslPackage.OPERATION__IS_VOID:
        return isVoid != IS_VOID_EDEFAULT;
      case AdslPackage.OPERATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case AdslPackage.OPERATION__NAME:
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
    result.append(" (isVoid: ");
    result.append(isVoid);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
