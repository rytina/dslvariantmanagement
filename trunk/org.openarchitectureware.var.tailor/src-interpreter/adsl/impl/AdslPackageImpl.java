/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.AdslFactory;
import adsl.AdslPackage;
import adsl.AndExpression;
import adsl.AnyTypeRef;
import adsl.Atom;
import adsl.Attribute;
import adsl.AttributeComplex;
import adsl.AttributePrimitive;
import adsl.BooleanConfigurationParameterValue;
import adsl.BooleanLiteral;
import adsl.CollectionTypeRef;
import adsl.ComplexType;
import adsl.Composition;
import adsl.ConfigParamTypeEnum;
import adsl.ConfigurationParameter;
import adsl.ConfigurationParameterSetting;
import adsl.ConfigurationParameterValue;
import adsl.Connector;
import adsl.DataType;
import adsl.FalseLiteral;
import adsl.Feature;
import adsl.FeatureAndList;
import adsl.FeatureClause;
import adsl.FeatureExpression;
import adsl.FeatureModelImport;
import adsl.FeatureOrList;
import adsl.File;
import adsl.Import;
import adsl.Instance;
import adsl.InstanceConfiguration;
import adsl.InstancePortPair;
import adsl.Interface;
import adsl.Module;
import adsl.ModuleConfiguration;
import adsl.NumericConfigurationParameterValue;
import adsl.Operand;
import adsl.Operation;
import adsl.OperationParameter;
import adsl.OrExpression;
import adsl.PartialComponent;
import adsl.Port;
import adsl.PrimitiveType;
import adsl.ProvidedPort;
import adsl.RequiredPort;
import adsl.SimpleTypeRef;
import adsl.TextConfigurationParameterValue;
import adsl.TrueLiteral;
import adsl.Using;
import adsl.ValueTimeEnum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdslPackageImpl extends EPackageImpl implements AdslPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partialComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providedPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeComplexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributePrimitiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instancePortPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationParameterSettingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericConfigurationParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textConfigurationParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanConfigurationParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass falseLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureAndListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureOrListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureModelImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum primitiveTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum configParamTypeEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum valueTimeEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see adsl.AdslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AdslPackageImpl() {
    super(eNS_URI, AdslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AdslPackage init() {
    if (isInited) return (AdslPackage)EPackage.Registry.INSTANCE.getEPackage(AdslPackage.eNS_URI);

    // Obtain or create and register package
    AdslPackageImpl theAdslPackage = (AdslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AdslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AdslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAdslPackage.createPackageContents();

    // Initialize created meta-data
    theAdslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAdslPackage.freeze();

    return theAdslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile() {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_FeatureModel() {
    return (EReference)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Compositions() {
    return (EReference)fileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Imports() {
    return (EReference)fileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_PartialComponents() {
    return (EReference)fileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport() {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Uri() {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartialComponent() {
    return partialComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialComponent_Components() {
    return (EReference)partialComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartialComponent_Name() {
    return (EAttribute)partialComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialComponent_Usings() {
    return (EReference)partialComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialComponent_Interfaces() {
    return (EReference)partialComponentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialComponent_SubPartialComponents() {
    return (EReference)partialComponentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialComponent_Entities() {
    return (EReference)partialComponentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsing() {
    return usingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsing_PartialComponent() {
    return (EAttribute)usingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule() {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Configuration() {
    return (EReference)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_FeatureClause() {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Ports() {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name() {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort() {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Name() {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_IsToMany() {
    return (EAttribute)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_Interface() {
    return (EReference)portEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_IsMandatory() {
    return (EAttribute)portEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvidedPort() {
    return providedPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredPort() {
    return requiredPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface() {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Name() {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Operations() {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation() {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_FeatureClause() {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_ResultRef() {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_IsVoid() {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Parameters() {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name() {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationParameter() {
    return operationParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationParameter_Typeref() {
    return (EReference)operationParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationParameter_Name() {
    return (EAttribute)operationParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType() {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_Name() {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Attributes() {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Extends() {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Operations() {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_HasSupertype() {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexType() {
    return complexTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute() {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_FeatureClause() {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeComplex() {
    return attributeComplexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeComplex_IsComposite() {
    return (EAttribute)attributeComplexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeComplex_IsReference() {
    return (EAttribute)attributeComplexEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeComplex_Typeref() {
    return (EReference)attributeComplexEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeComplex_IsRequired() {
    return (EAttribute)attributeComplexEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributePrimitive() {
    return attributePrimitiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributePrimitive_Type() {
    return (EAttribute)attributePrimitiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyTypeRef() {
    return anyTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnyTypeRef_Type() {
    return (EReference)anyTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleTypeRef() {
    return simpleTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionTypeRef() {
    return collectionTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComposition() {
    return compositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComposition_Instances() {
    return (EReference)compositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComposition_Connectors() {
    return (EReference)compositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComposition_Name() {
    return (EAttribute)compositionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance() {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Configuration() {
    return (EReference)instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_Name() {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Type() {
    return (EReference)instanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnector() {
    return connectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Target() {
    return (EReference)connectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Source() {
    return (EReference)connectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstancePortPair() {
    return instancePortPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstancePortPair_Port() {
    return (EReference)instancePortPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstancePortPair_Instance() {
    return (EReference)instancePortPairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleConfiguration() {
    return moduleConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleConfiguration_Params() {
    return (EReference)moduleConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationParameter() {
    return configurationParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigurationParameter_Name() {
    return (EAttribute)configurationParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigurationParameter_ValueTime() {
    return (EAttribute)configurationParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigurationParameter_Type() {
    return (EAttribute)configurationParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceConfiguration() {
    return instanceConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceConfiguration_Settings() {
    return (EReference)instanceConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationParameterSetting() {
    return configurationParameterSettingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationParameterSetting_Value() {
    return (EReference)configurationParameterSettingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurationParameterSetting_Param() {
    return (EReference)configurationParameterSettingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationParameterValue() {
    return configurationParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericConfigurationParameterValue() {
    return numericConfigurationParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericConfigurationParameterValue_Value() {
    return (EAttribute)numericConfigurationParameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextConfigurationParameterValue() {
    return textConfigurationParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextConfigurationParameterValue_Value() {
    return (EAttribute)textConfigurationParameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanConfigurationParameterValue() {
    return booleanConfigurationParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanConfigurationParameterValue_Value() {
    return (EReference)booleanConfigurationParameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral() {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrueLiteral() {
    return trueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFalseLiteral() {
    return falseLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureClause() {
    return featureClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureAndList() {
    return featureAndListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureAndList_FeatureList() {
    return (EAttribute)featureAndListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureOrList() {
    return featureOrListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureOrList_FeatureList() {
    return (EAttribute)featureOrListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureExpression() {
    return featureExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureExpression_Expression() {
    return (EReference)featureExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature() {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Feature() {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression() {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpression_Operands() {
    return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression() {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Operands() {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperand() {
    return operandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperand_Expression() {
    return (EReference)operandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperand_IsNot() {
    return (EAttribute)operandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom() {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_Expression() {
    return (EReference)atomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtom_Feature() {
    return (EAttribute)atomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureModelImport() {
    return featureModelImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureModelImport_Uri() {
    return (EAttribute)featureModelImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPrimitiveType() {
    return primitiveTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConfigParamTypeEnum() {
    return configParamTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValueTimeEnum() {
    return valueTimeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslFactory getAdslFactory() {
    return (AdslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fileEClass = createEClass(FILE);
    createEReference(fileEClass, FILE__FEATURE_MODEL);
    createEReference(fileEClass, FILE__COMPOSITIONS);
    createEReference(fileEClass, FILE__IMPORTS);
    createEReference(fileEClass, FILE__PARTIAL_COMPONENTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__URI);

    partialComponentEClass = createEClass(PARTIAL_COMPONENT);
    createEReference(partialComponentEClass, PARTIAL_COMPONENT__COMPONENTS);
    createEAttribute(partialComponentEClass, PARTIAL_COMPONENT__NAME);
    createEReference(partialComponentEClass, PARTIAL_COMPONENT__USINGS);
    createEReference(partialComponentEClass, PARTIAL_COMPONENT__INTERFACES);
    createEReference(partialComponentEClass, PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS);
    createEReference(partialComponentEClass, PARTIAL_COMPONENT__ENTITIES);

    usingEClass = createEClass(USING);
    createEAttribute(usingEClass, USING__PARTIAL_COMPONENT);

    moduleEClass = createEClass(MODULE);
    createEReference(moduleEClass, MODULE__CONFIGURATION);
    createEReference(moduleEClass, MODULE__FEATURE_CLAUSE);
    createEReference(moduleEClass, MODULE__PORTS);
    createEAttribute(moduleEClass, MODULE__NAME);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__NAME);
    createEAttribute(portEClass, PORT__IS_TO_MANY);
    createEReference(portEClass, PORT__INTERFACE);
    createEAttribute(portEClass, PORT__IS_MANDATORY);

    providedPortEClass = createEClass(PROVIDED_PORT);

    requiredPortEClass = createEClass(REQUIRED_PORT);

    interfaceEClass = createEClass(INTERFACE);
    createEAttribute(interfaceEClass, INTERFACE__NAME);
    createEReference(interfaceEClass, INTERFACE__OPERATIONS);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__FEATURE_CLAUSE);
    createEReference(operationEClass, OPERATION__RESULT_REF);
    createEAttribute(operationEClass, OPERATION__IS_VOID);
    createEReference(operationEClass, OPERATION__PARAMETERS);
    createEAttribute(operationEClass, OPERATION__NAME);

    operationParameterEClass = createEClass(OPERATION_PARAMETER);
    createEReference(operationParameterEClass, OPERATION_PARAMETER__TYPEREF);
    createEAttribute(operationParameterEClass, OPERATION_PARAMETER__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__NAME);
    createEReference(dataTypeEClass, DATA_TYPE__ATTRIBUTES);
    createEReference(dataTypeEClass, DATA_TYPE__EXTENDS);
    createEReference(dataTypeEClass, DATA_TYPE__OPERATIONS);
    createEAttribute(dataTypeEClass, DATA_TYPE__HAS_SUPERTYPE);

    complexTypeEClass = createEClass(COMPLEX_TYPE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEReference(attributeEClass, ATTRIBUTE__FEATURE_CLAUSE);

    attributeComplexEClass = createEClass(ATTRIBUTE_COMPLEX);
    createEAttribute(attributeComplexEClass, ATTRIBUTE_COMPLEX__IS_COMPOSITE);
    createEAttribute(attributeComplexEClass, ATTRIBUTE_COMPLEX__IS_REFERENCE);
    createEReference(attributeComplexEClass, ATTRIBUTE_COMPLEX__TYPEREF);
    createEAttribute(attributeComplexEClass, ATTRIBUTE_COMPLEX__IS_REQUIRED);

    attributePrimitiveEClass = createEClass(ATTRIBUTE_PRIMITIVE);
    createEAttribute(attributePrimitiveEClass, ATTRIBUTE_PRIMITIVE__TYPE);

    anyTypeRefEClass = createEClass(ANY_TYPE_REF);
    createEReference(anyTypeRefEClass, ANY_TYPE_REF__TYPE);

    simpleTypeRefEClass = createEClass(SIMPLE_TYPE_REF);

    collectionTypeRefEClass = createEClass(COLLECTION_TYPE_REF);

    compositionEClass = createEClass(COMPOSITION);
    createEReference(compositionEClass, COMPOSITION__INSTANCES);
    createEReference(compositionEClass, COMPOSITION__CONNECTORS);
    createEAttribute(compositionEClass, COMPOSITION__NAME);

    instanceEClass = createEClass(INSTANCE);
    createEReference(instanceEClass, INSTANCE__CONFIGURATION);
    createEAttribute(instanceEClass, INSTANCE__NAME);
    createEReference(instanceEClass, INSTANCE__TYPE);

    connectorEClass = createEClass(CONNECTOR);
    createEReference(connectorEClass, CONNECTOR__TARGET);
    createEReference(connectorEClass, CONNECTOR__SOURCE);

    instancePortPairEClass = createEClass(INSTANCE_PORT_PAIR);
    createEReference(instancePortPairEClass, INSTANCE_PORT_PAIR__PORT);
    createEReference(instancePortPairEClass, INSTANCE_PORT_PAIR__INSTANCE);

    moduleConfigurationEClass = createEClass(MODULE_CONFIGURATION);
    createEReference(moduleConfigurationEClass, MODULE_CONFIGURATION__PARAMS);

    configurationParameterEClass = createEClass(CONFIGURATION_PARAMETER);
    createEAttribute(configurationParameterEClass, CONFIGURATION_PARAMETER__NAME);
    createEAttribute(configurationParameterEClass, CONFIGURATION_PARAMETER__VALUE_TIME);
    createEAttribute(configurationParameterEClass, CONFIGURATION_PARAMETER__TYPE);

    instanceConfigurationEClass = createEClass(INSTANCE_CONFIGURATION);
    createEReference(instanceConfigurationEClass, INSTANCE_CONFIGURATION__SETTINGS);

    configurationParameterSettingEClass = createEClass(CONFIGURATION_PARAMETER_SETTING);
    createEReference(configurationParameterSettingEClass, CONFIGURATION_PARAMETER_SETTING__VALUE);
    createEReference(configurationParameterSettingEClass, CONFIGURATION_PARAMETER_SETTING__PARAM);

    configurationParameterValueEClass = createEClass(CONFIGURATION_PARAMETER_VALUE);

    numericConfigurationParameterValueEClass = createEClass(NUMERIC_CONFIGURATION_PARAMETER_VALUE);
    createEAttribute(numericConfigurationParameterValueEClass, NUMERIC_CONFIGURATION_PARAMETER_VALUE__VALUE);

    textConfigurationParameterValueEClass = createEClass(TEXT_CONFIGURATION_PARAMETER_VALUE);
    createEAttribute(textConfigurationParameterValueEClass, TEXT_CONFIGURATION_PARAMETER_VALUE__VALUE);

    booleanConfigurationParameterValueEClass = createEClass(BOOLEAN_CONFIGURATION_PARAMETER_VALUE);
    createEReference(booleanConfigurationParameterValueEClass, BOOLEAN_CONFIGURATION_PARAMETER_VALUE__VALUE);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);

    trueLiteralEClass = createEClass(TRUE_LITERAL);

    falseLiteralEClass = createEClass(FALSE_LITERAL);

    featureClauseEClass = createEClass(FEATURE_CLAUSE);

    featureAndListEClass = createEClass(FEATURE_AND_LIST);
    createEAttribute(featureAndListEClass, FEATURE_AND_LIST__FEATURE_LIST);

    featureOrListEClass = createEClass(FEATURE_OR_LIST);
    createEAttribute(featureOrListEClass, FEATURE_OR_LIST__FEATURE_LIST);

    featureExpressionEClass = createEClass(FEATURE_EXPRESSION);
    createEReference(featureExpressionEClass, FEATURE_EXPRESSION__EXPRESSION);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__FEATURE);

    orExpressionEClass = createEClass(OR_EXPRESSION);
    createEReference(orExpressionEClass, OR_EXPRESSION__OPERANDS);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEReference(andExpressionEClass, AND_EXPRESSION__OPERANDS);

    operandEClass = createEClass(OPERAND);
    createEReference(operandEClass, OPERAND__EXPRESSION);
    createEAttribute(operandEClass, OPERAND__IS_NOT);

    atomEClass = createEClass(ATOM);
    createEReference(atomEClass, ATOM__EXPRESSION);
    createEAttribute(atomEClass, ATOM__FEATURE);

    featureModelImportEClass = createEClass(FEATURE_MODEL_IMPORT);
    createEAttribute(featureModelImportEClass, FEATURE_MODEL_IMPORT__URI);

    // Create enums
    primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
    configParamTypeEnumEEnum = createEEnum(CONFIG_PARAM_TYPE_ENUM);
    valueTimeEnumEEnum = createEEnum(VALUE_TIME_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    providedPortEClass.getESuperTypes().add(this.getPort());
    requiredPortEClass.getESuperTypes().add(this.getPort());
    complexTypeEClass.getESuperTypes().add(this.getDataType());
    attributeComplexEClass.getESuperTypes().add(this.getAttribute());
    attributePrimitiveEClass.getESuperTypes().add(this.getAttribute());
    simpleTypeRefEClass.getESuperTypes().add(this.getAnyTypeRef());
    collectionTypeRefEClass.getESuperTypes().add(this.getAnyTypeRef());
    numericConfigurationParameterValueEClass.getESuperTypes().add(this.getConfigurationParameterValue());
    textConfigurationParameterValueEClass.getESuperTypes().add(this.getConfigurationParameterValue());
    booleanConfigurationParameterValueEClass.getESuperTypes().add(this.getConfigurationParameterValue());
    trueLiteralEClass.getESuperTypes().add(this.getBooleanLiteral());
    falseLiteralEClass.getESuperTypes().add(this.getBooleanLiteral());
    featureAndListEClass.getESuperTypes().add(this.getFeatureClause());
    featureOrListEClass.getESuperTypes().add(this.getFeatureClause());
    featureExpressionEClass.getESuperTypes().add(this.getFeatureClause());
    featureEClass.getESuperTypes().add(this.getFeatureClause());

    // Initialize classes and features; add operations and parameters
    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFile_FeatureModel(), this.getFeatureModelImport(), null, "featureModel", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getFile_Compositions(), this.getComposition(), null, "compositions", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getFile_Imports(), this.getImport(), null, "imports", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getFile_PartialComponents(), this.getPartialComponent(), null, "partialComponents", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(partialComponentEClass, PartialComponent.class, "PartialComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPartialComponent_Components(), this.getModule(), null, "components", null, 0, -1, PartialComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getPartialComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartialComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPartialComponent_Usings(), this.getUsing(), null, "usings", null, 0, -1, PartialComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPartialComponent_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, PartialComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPartialComponent_SubPartialComponents(), this.getPartialComponent(), null, "subPartialComponents", null, 0, -1, PartialComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPartialComponent_Entities(), this.getComplexType(), null, "entities", null, 0, -1, PartialComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(usingEClass, Using.class, "Using", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUsing_PartialComponent(), ecorePackage.getEString(), "partialComponent", null, 0, 1, Using.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModule_Configuration(), this.getModuleConfiguration(), null, "configuration", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getModule_FeatureClause(), this.getFeatureClause(), null, "featureClause", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getModule_Ports(), this.getPort(), null, "ports", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getPort_IsToMany(), ecorePackage.getEBoolean(), "isToMany", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPort_Interface(), this.getInterface(), null, "interface", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getPort_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(providedPortEClass, ProvidedPort.class, "ProvidedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requiredPortEClass, RequiredPort.class, "RequiredPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInterface_Operations(), this.getOperation(), null, "operations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_FeatureClause(), this.getFeatureClause(), null, "featureClause", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOperation_ResultRef(), this.getAnyTypeRef(), null, "resultRef", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_IsVoid(), ecorePackage.getEBoolean(), "isVoid", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOperation_Parameters(), this.getOperationParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(operationParameterEClass, OperationParameter.class, "OperationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationParameter_Typeref(), this.getAnyTypeRef(), null, "typeref", null, 0, 1, OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperationParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataType_Extends(), this.getAnyTypeRef(), null, "extends", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataType_Operations(), this.getOperation(), null, "operations", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getDataType_HasSupertype(), ecorePackage.getEBoolean(), "hasSupertype", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAttribute_FeatureClause(), this.getFeatureClause(), null, "featureClause", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(attributeComplexEClass, AttributeComplex.class, "AttributeComplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeComplex_IsComposite(), ecorePackage.getEBoolean(), "isComposite", null, 0, 1, AttributeComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAttributeComplex_IsReference(), ecorePackage.getEBoolean(), "isReference", null, 0, 1, AttributeComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAttributeComplex_Typeref(), this.getAnyTypeRef(), null, "typeref", null, 0, 1, AttributeComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAttributeComplex_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, AttributeComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(attributePrimitiveEClass, AttributePrimitive.class, "AttributePrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributePrimitive_Type(), this.getPrimitiveType(), "type", null, 0, 1, AttributePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(anyTypeRefEClass, AnyTypeRef.class, "AnyTypeRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnyTypeRef_Type(), this.getDataType(), null, "type", null, 0, 1, AnyTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(simpleTypeRefEClass, SimpleTypeRef.class, "SimpleTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionTypeRefEClass, CollectionTypeRef.class, "CollectionTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComposition_Instances(), this.getInstance(), null, "instances", null, 0, -1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getComposition_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getComposition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstance_Configuration(), this.getInstanceConfiguration(), null, "configuration", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInstance_Type(), this.getModule(), null, "type", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnector_Target(), this.getInstancePortPair(), null, "target", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getConnector_Source(), this.getInstancePortPair(), null, "source", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(instancePortPairEClass, InstancePortPair.class, "InstancePortPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstancePortPair_Port(), this.getPort(), null, "port", null, 0, 1, InstancePortPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInstancePortPair_Instance(), this.getInstance(), null, "instance", null, 0, 1, InstancePortPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(moduleConfigurationEClass, ModuleConfiguration.class, "ModuleConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleConfiguration_Params(), this.getConfigurationParameter(), null, "params", null, 0, -1, ModuleConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(configurationParameterEClass, ConfigurationParameter.class, "ConfigurationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigurationParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigurationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getConfigurationParameter_ValueTime(), this.getValueTimeEnum(), "valueTime", null, 0, 1, ConfigurationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getConfigurationParameter_Type(), this.getConfigParamTypeEnum(), "type", null, 0, 1, ConfigurationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(instanceConfigurationEClass, InstanceConfiguration.class, "InstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceConfiguration_Settings(), this.getConfigurationParameterSetting(), null, "settings", null, 0, -1, InstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(configurationParameterSettingEClass, ConfigurationParameterSetting.class, "ConfigurationParameterSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigurationParameterSetting_Value(), this.getConfigurationParameterValue(), null, "value", null, 0, 1, ConfigurationParameterSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getConfigurationParameterSetting_Param(), this.getConfigurationParameter(), null, "param", null, 0, 1, ConfigurationParameterSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(configurationParameterValueEClass, ConfigurationParameterValue.class, "ConfigurationParameterValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericConfigurationParameterValueEClass, NumericConfigurationParameterValue.class, "NumericConfigurationParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericConfigurationParameterValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NumericConfigurationParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(textConfigurationParameterValueEClass, TextConfigurationParameterValue.class, "TextConfigurationParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextConfigurationParameterValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextConfigurationParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(booleanConfigurationParameterValueEClass, BooleanConfigurationParameterValue.class, "BooleanConfigurationParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanConfigurationParameterValue_Value(), this.getBooleanLiteral(), null, "value", null, 0, 1, BooleanConfigurationParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trueLiteralEClass, TrueLiteral.class, "TrueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(falseLiteralEClass, FalseLiteral.class, "FalseLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureClauseEClass, FeatureClause.class, "FeatureClause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureAndListEClass, FeatureAndList.class, "FeatureAndList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatureAndList_FeatureList(), ecorePackage.getEString(), "featureList", null, 0, -1, FeatureAndList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(featureOrListEClass, FeatureOrList.class, "FeatureOrList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatureOrList_FeatureList(), ecorePackage.getEString(), "featureList", null, 0, -1, FeatureOrList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(featureExpressionEClass, FeatureExpression.class, "FeatureExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureExpression_Expression(), this.getOrExpression(), null, "expression", null, 0, 1, FeatureExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpression_Operands(), this.getAndExpression(), null, "operands", null, 0, -1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpression_Operands(), this.getOperand(), null, "operands", null, 0, -1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(operandEClass, Operand.class, "Operand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperand_Expression(), this.getAtom(), null, "expression", null, 0, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperand_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtom_Expression(), this.getOrExpression(), null, "expression", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAtom_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(featureModelImportEClass, FeatureModelImport.class, "FeatureModelImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatureModelImport_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, FeatureModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NULL);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INT);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.CHAR);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.SHORT);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DATE);
    addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);

    initEEnum(configParamTypeEnumEEnum, ConfigParamTypeEnum.class, "ConfigParamTypeEnum");
    addEEnumLiteral(configParamTypeEnumEEnum, ConfigParamTypeEnum.NULL);
    addEEnumLiteral(configParamTypeEnumEEnum, ConfigParamTypeEnum.NUMBER);
    addEEnumLiteral(configParamTypeEnumEEnum, ConfigParamTypeEnum.TEXT);
    addEEnumLiteral(configParamTypeEnumEEnum, ConfigParamTypeEnum.BOOL);

    initEEnum(valueTimeEnumEEnum, ValueTimeEnum.class, "ValueTimeEnum");
    addEEnumLiteral(valueTimeEnumEEnum, ValueTimeEnum.NULL);
    addEEnumLiteral(valueTimeEnumEEnum, ValueTimeEnum.NEVER);
    addEEnumLiteral(valueTimeEnumEEnum, ValueTimeEnum.INSTANCEDEFINITION);
    addEEnumLiteral(valueTimeEnumEEnum, ValueTimeEnum.DEPLOYMENT);
    addEEnumLiteral(valueTimeEnumEEnum, ValueTimeEnum.STARTUP);

    // Create resource
    createResource(eNS_URI);
  }

} //AdslPackageImpl
