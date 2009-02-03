/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.impl;

import adsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdslFactoryImpl extends EFactoryImpl implements AdslFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdslFactory init() {
    try {
      AdslFactory theAdslFactory = (AdslFactory)EPackage.Registry.INSTANCE.getEFactory("http://msg.com/ipot/adsl"); 
      if (theAdslFactory != null) {
        return theAdslFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case AdslPackage.FILE: return createFile();
      case AdslPackage.IMPORT: return createImport();
      case AdslPackage.PARTIAL_COMPONENT: return createPartialComponent();
      case AdslPackage.USING: return createUsing();
      case AdslPackage.MODULE: return createModule();
      case AdslPackage.PROVIDED_PORT: return createProvidedPort();
      case AdslPackage.REQUIRED_PORT: return createRequiredPort();
      case AdslPackage.INTERFACE: return createInterface();
      case AdslPackage.OPERATION: return createOperation();
      case AdslPackage.OPERATION_PARAMETER: return createOperationParameter();
      case AdslPackage.DATA_TYPE: return createDataType();
      case AdslPackage.COMPLEX_TYPE: return createComplexType();
      case AdslPackage.ATTRIBUTE_COMPLEX: return createAttributeComplex();
      case AdslPackage.ATTRIBUTE_PRIMITIVE: return createAttributePrimitive();
      case AdslPackage.SIMPLE_TYPE_REF: return createSimpleTypeRef();
      case AdslPackage.COLLECTION_TYPE_REF: return createCollectionTypeRef();
      case AdslPackage.COMPOSITION: return createComposition();
      case AdslPackage.INSTANCE: return createInstance();
      case AdslPackage.CONNECTOR: return createConnector();
      case AdslPackage.INSTANCE_PORT_PAIR: return createInstancePortPair();
      case AdslPackage.MODULE_CONFIGURATION: return createModuleConfiguration();
      case AdslPackage.CONFIGURATION_PARAMETER: return createConfigurationParameter();
      case AdslPackage.INSTANCE_CONFIGURATION: return createInstanceConfiguration();
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING: return createConfigurationParameterSetting();
      case AdslPackage.NUMERIC_CONFIGURATION_PARAMETER_VALUE: return createNumericConfigurationParameterValue();
      case AdslPackage.TEXT_CONFIGURATION_PARAMETER_VALUE: return createTextConfigurationParameterValue();
      case AdslPackage.BOOLEAN_CONFIGURATION_PARAMETER_VALUE: return createBooleanConfigurationParameterValue();
      case AdslPackage.TRUE_LITERAL: return createTrueLiteral();
      case AdslPackage.FALSE_LITERAL: return createFalseLiteral();
      case AdslPackage.FEATURE_AND_LIST: return createFeatureAndList();
      case AdslPackage.FEATURE_OR_LIST: return createFeatureOrList();
      case AdslPackage.FEATURE_EXPRESSION: return createFeatureExpression();
      case AdslPackage.FEATURE: return createFeature();
      case AdslPackage.OR_EXPRESSION: return createOrExpression();
      case AdslPackage.AND_EXPRESSION: return createAndExpression();
      case AdslPackage.OPERAND: return createOperand();
      case AdslPackage.ATOM: return createAtom();
      case AdslPackage.FEATURE_MODEL_IMPORT: return createFeatureModelImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case AdslPackage.PRIMITIVE_TYPE:
        return createPrimitiveTypeFromString(eDataType, initialValue);
      case AdslPackage.CONFIG_PARAM_TYPE_ENUM:
        return createConfigParamTypeEnumFromString(eDataType, initialValue);
      case AdslPackage.VALUE_TIME_ENUM:
        return createValueTimeEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case AdslPackage.PRIMITIVE_TYPE:
        return convertPrimitiveTypeToString(eDataType, instanceValue);
      case AdslPackage.CONFIG_PARAM_TYPE_ENUM:
        return convertConfigParamTypeEnumToString(eDataType, instanceValue);
      case AdslPackage.VALUE_TIME_ENUM:
        return convertValueTimeEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile() {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport() {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialComponent createPartialComponent() {
    PartialComponentImpl partialComponent = new PartialComponentImpl();
    return partialComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Using createUsing() {
    UsingImpl using = new UsingImpl();
    return using;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule() {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedPort createProvidedPort() {
    ProvidedPortImpl providedPort = new ProvidedPortImpl();
    return providedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredPort createRequiredPort() {
    RequiredPortImpl requiredPort = new RequiredPortImpl();
    return requiredPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface() {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation() {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationParameter createOperationParameter() {
    OperationParameterImpl operationParameter = new OperationParameterImpl();
    return operationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType() {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType createComplexType() {
    ComplexTypeImpl complexType = new ComplexTypeImpl();
    return complexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeComplex createAttributeComplex() {
    AttributeComplexImpl attributeComplex = new AttributeComplexImpl();
    return attributeComplex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePrimitive createAttributePrimitive() {
    AttributePrimitiveImpl attributePrimitive = new AttributePrimitiveImpl();
    return attributePrimitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleTypeRef createSimpleTypeRef() {
    SimpleTypeRefImpl simpleTypeRef = new SimpleTypeRefImpl();
    return simpleTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionTypeRef createCollectionTypeRef() {
    CollectionTypeRefImpl collectionTypeRef = new CollectionTypeRefImpl();
    return collectionTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Composition createComposition() {
    CompositionImpl composition = new CompositionImpl();
    return composition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance() {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector() {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstancePortPair createInstancePortPair() {
    InstancePortPairImpl instancePortPair = new InstancePortPairImpl();
    return instancePortPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleConfiguration createModuleConfiguration() {
    ModuleConfigurationImpl moduleConfiguration = new ModuleConfigurationImpl();
    return moduleConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParameter createConfigurationParameter() {
    ConfigurationParameterImpl configurationParameter = new ConfigurationParameterImpl();
    return configurationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceConfiguration createInstanceConfiguration() {
    InstanceConfigurationImpl instanceConfiguration = new InstanceConfigurationImpl();
    return instanceConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParameterSetting createConfigurationParameterSetting() {
    ConfigurationParameterSettingImpl configurationParameterSetting = new ConfigurationParameterSettingImpl();
    return configurationParameterSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericConfigurationParameterValue createNumericConfigurationParameterValue() {
    NumericConfigurationParameterValueImpl numericConfigurationParameterValue = new NumericConfigurationParameterValueImpl();
    return numericConfigurationParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextConfigurationParameterValue createTextConfigurationParameterValue() {
    TextConfigurationParameterValueImpl textConfigurationParameterValue = new TextConfigurationParameterValueImpl();
    return textConfigurationParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanConfigurationParameterValue createBooleanConfigurationParameterValue() {
    BooleanConfigurationParameterValueImpl booleanConfigurationParameterValue = new BooleanConfigurationParameterValueImpl();
    return booleanConfigurationParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrueLiteral createTrueLiteral() {
    TrueLiteralImpl trueLiteral = new TrueLiteralImpl();
    return trueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FalseLiteral createFalseLiteral() {
    FalseLiteralImpl falseLiteral = new FalseLiteralImpl();
    return falseLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureAndList createFeatureAndList() {
    FeatureAndListImpl featureAndList = new FeatureAndListImpl();
    return featureAndList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureOrList createFeatureOrList() {
    FeatureOrListImpl featureOrList = new FeatureOrListImpl();
    return featureOrList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureExpression createFeatureExpression() {
    FeatureExpressionImpl featureExpression = new FeatureExpressionImpl();
    return featureExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature() {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression() {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression() {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand createOperand() {
    OperandImpl operand = new OperandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom() {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModelImport createFeatureModelImport() {
    FeatureModelImportImpl featureModelImport = new FeatureModelImportImpl();
    return featureModelImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
    PrimitiveType result = PrimitiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigParamTypeEnum createConfigParamTypeEnumFromString(EDataType eDataType, String initialValue) {
    ConfigParamTypeEnum result = ConfigParamTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConfigParamTypeEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueTimeEnum createValueTimeEnumFromString(EDataType eDataType, String initialValue) {
    ValueTimeEnum result = ValueTimeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueTimeEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslPackage getAdslPackage() {
    return (AdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdslPackage getPackage() {
    return AdslPackage.eINSTANCE;
  }

} //AdslFactoryImpl
