/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.AnyTypeRef;
import adsl.AttributeComplex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.AttributeComplexImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link adsl.impl.AttributeComplexImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link adsl.impl.AttributeComplexImpl#getTyperef <em>Typeref</em>}</li>
 *   <li>{@link adsl.impl.AttributeComplexImpl#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeComplexImpl extends AttributeImpl implements AttributeComplex {
  /**
   * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsComposite()
   * @generated
   * @ordered
   */
  protected static final boolean IS_COMPOSITE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsComposite()
   * @generated
   * @ordered
   */
  protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReference()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReference()
   * @generated
   * @ordered
   */
  protected boolean isReference = IS_REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTyperef() <em>Typeref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyperef()
   * @generated
   * @ordered
   */
  protected AnyTypeRef typeref;

  /**
   * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected boolean isRequired = IS_REQUIRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeComplexImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.ATTRIBUTE_COMPLEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsComposite() {
    return isComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsComposite(boolean newIsComposite) {
    boolean oldIsComposite = isComposite;
    isComposite = newIsComposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.ATTRIBUTE_COMPLEX__IS_COMPOSITE, oldIsComposite, isComposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsReference() {
    return isReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReference(boolean newIsReference) {
    boolean oldIsReference = isReference;
    isReference = newIsReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.ATTRIBUTE_COMPLEX__IS_REFERENCE, oldIsReference, isReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyTypeRef getTyperef() {
    return typeref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTyperef(AnyTypeRef newTyperef, NotificationChain msgs) {
    AnyTypeRef oldTyperef = typeref;
    typeref = newTyperef;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF, oldTyperef, newTyperef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyperef(AnyTypeRef newTyperef) {
    if (newTyperef != typeref) {
      NotificationChain msgs = null;
      if (typeref != null)
        msgs = ((InternalEObject)typeref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF, null, msgs);
      if (newTyperef != null)
        msgs = ((InternalEObject)newTyperef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF, null, msgs);
      msgs = basicSetTyperef(newTyperef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF, newTyperef, newTyperef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsRequired() {
    return isRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRequired(boolean newIsRequired) {
    boolean oldIsRequired = isRequired;
    isRequired = newIsRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.ATTRIBUTE_COMPLEX__IS_REQUIRED, oldIsRequired, isRequired));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF:
        return basicSetTyperef(null, msgs);
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
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_COMPOSITE:
        return isIsComposite() ? Boolean.TRUE : Boolean.FALSE;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REFERENCE:
        return isIsReference() ? Boolean.TRUE : Boolean.FALSE;
      case AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF:
        return getTyperef();
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REQUIRED:
        return isIsRequired() ? Boolean.TRUE : Boolean.FALSE;
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
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_COMPOSITE:
        setIsComposite(((Boolean)newValue).booleanValue());
        return;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REFERENCE:
        setIsReference(((Boolean)newValue).booleanValue());
        return;
      case AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF:
        setTyperef((AnyTypeRef)newValue);
        return;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REQUIRED:
        setIsRequired(((Boolean)newValue).booleanValue());
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
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_COMPOSITE:
        setIsComposite(IS_COMPOSITE_EDEFAULT);
        return;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REFERENCE:
        setIsReference(IS_REFERENCE_EDEFAULT);
        return;
      case AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF:
        setTyperef((AnyTypeRef)null);
        return;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REQUIRED:
        setIsRequired(IS_REQUIRED_EDEFAULT);
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
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_COMPOSITE:
        return isComposite != IS_COMPOSITE_EDEFAULT;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REFERENCE:
        return isReference != IS_REFERENCE_EDEFAULT;
      case AdslPackage.ATTRIBUTE_COMPLEX__TYPEREF:
        return typeref != null;
      case AdslPackage.ATTRIBUTE_COMPLEX__IS_REQUIRED:
        return isRequired != IS_REQUIRED_EDEFAULT;
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
    result.append(" (isComposite: ");
    result.append(isComposite);
    result.append(", isReference: ");
    result.append(isReference);
    result.append(", isRequired: ");
    result.append(isRequired);
    result.append(')');
    return result.toString();
  }

} //AttributeComplexImpl
