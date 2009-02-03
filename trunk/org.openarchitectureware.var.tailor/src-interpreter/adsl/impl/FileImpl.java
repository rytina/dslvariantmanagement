/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslPackage;
import adsl.Composition;
import adsl.FeatureModelImport;
import adsl.File;
import adsl.Import;
import adsl.PartialComponent;

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
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adsl.impl.FileImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link adsl.impl.FileImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link adsl.impl.FileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link adsl.impl.FileImpl#getPartialComponents <em>Partial Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends EObjectImpl implements File {
  /**
   * The cached value of the '{@link #getFeatureModel() <em>Feature Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureModel()
   * @generated
   * @ordered
   */
  protected FeatureModelImport featureModel;

  /**
   * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositions()
   * @generated
   * @ordered
   */
  protected EList<Composition> compositions;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getPartialComponents() <em>Partial Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartialComponents()
   * @generated
   * @ordered
   */
  protected EList<PartialComponent> partialComponents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AdslPackage.Literals.FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModelImport getFeatureModel() {
    return featureModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureModel(FeatureModelImport newFeatureModel, NotificationChain msgs) {
    FeatureModelImport oldFeatureModel = featureModel;
    featureModel = newFeatureModel;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslPackage.FILE__FEATURE_MODEL, oldFeatureModel, newFeatureModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureModel(FeatureModelImport newFeatureModel) {
    if (newFeatureModel != featureModel) {
      NotificationChain msgs = null;
      if (featureModel != null)
        msgs = ((InternalEObject)featureModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslPackage.FILE__FEATURE_MODEL, null, msgs);
      if (newFeatureModel != null)
        msgs = ((InternalEObject)newFeatureModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslPackage.FILE__FEATURE_MODEL, null, msgs);
      msgs = basicSetFeatureModel(newFeatureModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslPackage.FILE__FEATURE_MODEL, newFeatureModel, newFeatureModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Composition> getCompositions() {
    if (compositions == null) {
      compositions = new EObjectContainmentEList<Composition>(Composition.class, this, AdslPackage.FILE__COMPOSITIONS);
    }
    return compositions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports() {
    if (imports == null) {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AdslPackage.FILE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartialComponent> getPartialComponents() {
    if (partialComponents == null) {
      partialComponents = new EObjectContainmentEList<PartialComponent>(PartialComponent.class, this, AdslPackage.FILE__PARTIAL_COMPONENTS);
    }
    return partialComponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AdslPackage.FILE__FEATURE_MODEL:
        return basicSetFeatureModel(null, msgs);
      case AdslPackage.FILE__COMPOSITIONS:
        return ((InternalEList<?>)getCompositions()).basicRemove(otherEnd, msgs);
      case AdslPackage.FILE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AdslPackage.FILE__PARTIAL_COMPONENTS:
        return ((InternalEList<?>)getPartialComponents()).basicRemove(otherEnd, msgs);
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
      case AdslPackage.FILE__FEATURE_MODEL:
        return getFeatureModel();
      case AdslPackage.FILE__COMPOSITIONS:
        return getCompositions();
      case AdslPackage.FILE__IMPORTS:
        return getImports();
      case AdslPackage.FILE__PARTIAL_COMPONENTS:
        return getPartialComponents();
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
      case AdslPackage.FILE__FEATURE_MODEL:
        setFeatureModel((FeatureModelImport)newValue);
        return;
      case AdslPackage.FILE__COMPOSITIONS:
        getCompositions().clear();
        getCompositions().addAll((Collection<? extends Composition>)newValue);
        return;
      case AdslPackage.FILE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AdslPackage.FILE__PARTIAL_COMPONENTS:
        getPartialComponents().clear();
        getPartialComponents().addAll((Collection<? extends PartialComponent>)newValue);
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
      case AdslPackage.FILE__FEATURE_MODEL:
        setFeatureModel((FeatureModelImport)null);
        return;
      case AdslPackage.FILE__COMPOSITIONS:
        getCompositions().clear();
        return;
      case AdslPackage.FILE__IMPORTS:
        getImports().clear();
        return;
      case AdslPackage.FILE__PARTIAL_COMPONENTS:
        getPartialComponents().clear();
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
      case AdslPackage.FILE__FEATURE_MODEL:
        return featureModel != null;
      case AdslPackage.FILE__COMPOSITIONS:
        return compositions != null && !compositions.isEmpty();
      case AdslPackage.FILE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AdslPackage.FILE__PARTIAL_COMPONENTS:
        return partialComponents != null && !partialComponents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FileImpl
