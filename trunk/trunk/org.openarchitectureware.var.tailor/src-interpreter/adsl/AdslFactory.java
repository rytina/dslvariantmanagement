/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see adsl.AdslPackage
 * @generated
 */
public interface AdslFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdslFactory eINSTANCE = adsl.impl.AdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Partial Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Partial Component</em>'.
   * @generated
   */
  PartialComponent createPartialComponent();

  /**
   * Returns a new object of class '<em>Using</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using</em>'.
   * @generated
   */
  Using createUsing();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Provided Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Port</em>'.
   * @generated
   */
  ProvidedPort createProvidedPort();

  /**
   * Returns a new object of class '<em>Required Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Port</em>'.
   * @generated
   */
  RequiredPort createRequiredPort();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Operation Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Parameter</em>'.
   * @generated
   */
  OperationParameter createOperationParameter();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type</em>'.
   * @generated
   */
  ComplexType createComplexType();

  /**
   * Returns a new object of class '<em>Attribute Complex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Complex</em>'.
   * @generated
   */
  AttributeComplex createAttributeComplex();

  /**
   * Returns a new object of class '<em>Attribute Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Primitive</em>'.
   * @generated
   */
  AttributePrimitive createAttributePrimitive();

  /**
   * Returns a new object of class '<em>Simple Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type Ref</em>'.
   * @generated
   */
  SimpleTypeRef createSimpleTypeRef();

  /**
   * Returns a new object of class '<em>Collection Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Type Ref</em>'.
   * @generated
   */
  CollectionTypeRef createCollectionTypeRef();

  /**
   * Returns a new object of class '<em>Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition</em>'.
   * @generated
   */
  Composition createComposition();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>Instance Port Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Port Pair</em>'.
   * @generated
   */
  InstancePortPair createInstancePortPair();

  /**
   * Returns a new object of class '<em>Module Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Configuration</em>'.
   * @generated
   */
  ModuleConfiguration createModuleConfiguration();

  /**
   * Returns a new object of class '<em>Configuration Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Parameter</em>'.
   * @generated
   */
  ConfigurationParameter createConfigurationParameter();

  /**
   * Returns a new object of class '<em>Instance Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Configuration</em>'.
   * @generated
   */
  InstanceConfiguration createInstanceConfiguration();

  /**
   * Returns a new object of class '<em>Configuration Parameter Setting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Parameter Setting</em>'.
   * @generated
   */
  ConfigurationParameterSetting createConfigurationParameterSetting();

  /**
   * Returns a new object of class '<em>Numeric Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Configuration Parameter Value</em>'.
   * @generated
   */
  NumericConfigurationParameterValue createNumericConfigurationParameterValue();

  /**
   * Returns a new object of class '<em>Text Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Configuration Parameter Value</em>'.
   * @generated
   */
  TextConfigurationParameterValue createTextConfigurationParameterValue();

  /**
   * Returns a new object of class '<em>Boolean Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Configuration Parameter Value</em>'.
   * @generated
   */
  BooleanConfigurationParameterValue createBooleanConfigurationParameterValue();

  /**
   * Returns a new object of class '<em>True Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>True Literal</em>'.
   * @generated
   */
  TrueLiteral createTrueLiteral();

  /**
   * Returns a new object of class '<em>False Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>False Literal</em>'.
   * @generated
   */
  FalseLiteral createFalseLiteral();

  /**
   * Returns a new object of class '<em>Feature And List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature And List</em>'.
   * @generated
   */
  FeatureAndList createFeatureAndList();

  /**
   * Returns a new object of class '<em>Feature Or List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Or List</em>'.
   * @generated
   */
  FeatureOrList createFeatureOrList();

  /**
   * Returns a new object of class '<em>Feature Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Expression</em>'.
   * @generated
   */
  FeatureExpression createFeatureExpression();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operand</em>'.
   * @generated
   */
  Operand createOperand();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Feature Model Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Model Import</em>'.
   * @generated
   */
  FeatureModelImport createFeatureModelImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdslPackage getAdslPackage();

} //AdslFactory
