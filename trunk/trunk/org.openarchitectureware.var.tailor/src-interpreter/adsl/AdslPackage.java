/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see adsl.AdslFactory
 * @model kind="package"
 * @generated
 */
public interface AdslPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "adsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://msg.com/ipot/adsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdslPackage eINSTANCE = adsl.impl.AdslPackageImpl.init();

  /**
   * The meta object id for the '{@link adsl.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FileImpl
   * @see adsl.impl.AdslPackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Feature Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__FEATURE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Compositions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__COMPOSITIONS = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Partial Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__PARTIAL_COMPONENTS = 3;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link adsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ImportImpl
   * @see adsl.impl.AdslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.PartialComponentImpl <em>Partial Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.PartialComponentImpl
   * @see adsl.impl.AdslPackageImpl#getPartialComponent()
   * @generated
   */
  int PARTIAL_COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT__COMPONENTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT__USINGS = 2;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT__INTERFACES = 3;

  /**
   * The feature id for the '<em><b>Sub Partial Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS = 4;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT__ENTITIES = 5;

  /**
   * The number of structural features of the '<em>Partial Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_COMPONENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link adsl.impl.UsingImpl <em>Using</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.UsingImpl
   * @see adsl.impl.AdslPackageImpl#getUsing()
   * @generated
   */
  int USING = 3;

  /**
   * The feature id for the '<em><b>Partial Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING__PARTIAL_COMPONENT = 0;

  /**
   * The number of structural features of the '<em>Using</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ModuleImpl
   * @see adsl.impl.AdslPackageImpl#getModule()
   * @generated
   */
  int MODULE = 4;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Feature Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FEATURE_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PORTS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 3;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link adsl.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.PortImpl
   * @see adsl.impl.AdslPackageImpl#getPort()
   * @generated
   */
  int PORT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__IS_TO_MANY = 1;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__INTERFACE = 2;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__IS_MANDATORY = 3;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link adsl.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ProvidedPortImpl
   * @see adsl.impl.AdslPackageImpl#getProvidedPort()
   * @generated
   */
  int PROVIDED_PORT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__IS_TO_MANY = PORT__IS_TO_MANY;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__INTERFACE = PORT__INTERFACE;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__IS_MANDATORY = PORT__IS_MANDATORY;

  /**
   * The number of structural features of the '<em>Provided Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.RequiredPortImpl <em>Required Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.RequiredPortImpl
   * @see adsl.impl.AdslPackageImpl#getRequiredPort()
   * @generated
   */
  int REQUIRED_PORT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__IS_TO_MANY = PORT__IS_TO_MANY;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__INTERFACE = PORT__INTERFACE;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__IS_MANDATORY = PORT__IS_MANDATORY;

  /**
   * The number of structural features of the '<em>Required Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.InterfaceImpl
   * @see adsl.impl.AdslPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.OperationImpl
   * @see adsl.impl.AdslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 9;

  /**
   * The feature id for the '<em><b>Feature Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__FEATURE_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Result Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RESULT_REF = 1;

  /**
   * The feature id for the '<em><b>Is Void</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_VOID = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 4;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link adsl.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.OperationParameterImpl
   * @see adsl.impl.AdslPackageImpl#getOperationParameter()
   * @generated
   */
  int OPERATION_PARAMETER = 10;

  /**
   * The feature id for the '<em><b>Typeref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PARAMETER__TYPEREF = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Operation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.DataTypeImpl
   * @see adsl.impl.AdslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__EXTENDS = 2;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__OPERATIONS = 3;

  /**
   * The feature id for the '<em><b>Has Supertype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__HAS_SUPERTYPE = 4;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link adsl.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ComplexTypeImpl
   * @see adsl.impl.AdslPackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__ATTRIBUTES = DATA_TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__EXTENDS = DATA_TYPE__EXTENDS;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__OPERATIONS = DATA_TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Has Supertype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__HAS_SUPERTYPE = DATA_TYPE__HAS_SUPERTYPE;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.AttributeImpl
   * @see adsl.impl.AdslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Feature Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__FEATURE_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.AttributeComplexImpl <em>Attribute Complex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.AttributeComplexImpl
   * @see adsl.impl.AdslPackageImpl#getAttributeComplex()
   * @generated
   */
  int ATTRIBUTE_COMPLEX = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Feature Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX__FEATURE_CLAUSE = ATTRIBUTE__FEATURE_CLAUSE;

  /**
   * The feature id for the '<em><b>Is Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX__IS_COMPOSITE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX__IS_REFERENCE = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Typeref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX__TYPEREF = ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX__IS_REQUIRED = ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attribute Complex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPLEX_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link adsl.impl.AttributePrimitiveImpl <em>Attribute Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.AttributePrimitiveImpl
   * @see adsl.impl.AdslPackageImpl#getAttributePrimitive()
   * @generated
   */
  int ATTRIBUTE_PRIMITIVE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PRIMITIVE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Feature Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PRIMITIVE__FEATURE_CLAUSE = ATTRIBUTE__FEATURE_CLAUSE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PRIMITIVE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PRIMITIVE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.AnyTypeRefImpl <em>Any Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.AnyTypeRefImpl
   * @see adsl.impl.AdslPackageImpl#getAnyTypeRef()
   * @generated
   */
  int ANY_TYPE_REF = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TYPE_REF__TYPE = 0;

  /**
   * The number of structural features of the '<em>Any Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TYPE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.SimpleTypeRefImpl <em>Simple Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.SimpleTypeRefImpl
   * @see adsl.impl.AdslPackageImpl#getSimpleTypeRef()
   * @generated
   */
  int SIMPLE_TYPE_REF = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_REF__TYPE = ANY_TYPE_REF__TYPE;

  /**
   * The number of structural features of the '<em>Simple Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_REF_FEATURE_COUNT = ANY_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.CollectionTypeRefImpl <em>Collection Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.CollectionTypeRefImpl
   * @see adsl.impl.AdslPackageImpl#getCollectionTypeRef()
   * @generated
   */
  int COLLECTION_TYPE_REF = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_REF__TYPE = ANY_TYPE_REF__TYPE;

  /**
   * The number of structural features of the '<em>Collection Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_REF_FEATURE_COUNT = ANY_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.CompositionImpl <em>Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.CompositionImpl
   * @see adsl.impl.AdslPackageImpl#getComposition()
   * @generated
   */
  int COMPOSITION = 19;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION__INSTANCES = 0;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION__CONNECTORS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION__NAME = 2;

  /**
   * The number of structural features of the '<em>Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link adsl.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.InstanceImpl
   * @see adsl.impl.AdslPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 20;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link adsl.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ConnectorImpl
   * @see adsl.impl.AdslPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 21;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__TARGET = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__SOURCE = 1;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.InstancePortPairImpl <em>Instance Port Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.InstancePortPairImpl
   * @see adsl.impl.AdslPackageImpl#getInstancePortPair()
   * @generated
   */
  int INSTANCE_PORT_PAIR = 22;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PORT_PAIR__PORT = 0;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PORT_PAIR__INSTANCE = 1;

  /**
   * The number of structural features of the '<em>Instance Port Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PORT_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.ModuleConfigurationImpl <em>Module Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ModuleConfigurationImpl
   * @see adsl.impl.AdslPackageImpl#getModuleConfiguration()
   * @generated
   */
  int MODULE_CONFIGURATION = 23;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_CONFIGURATION__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Module Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_CONFIGURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.ConfigurationParameterImpl <em>Configuration Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ConfigurationParameterImpl
   * @see adsl.impl.AdslPackageImpl#getConfigurationParameter()
   * @generated
   */
  int CONFIGURATION_PARAMETER = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER__VALUE_TIME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER__TYPE = 2;

  /**
   * The number of structural features of the '<em>Configuration Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link adsl.impl.InstanceConfigurationImpl <em>Instance Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.InstanceConfigurationImpl
   * @see adsl.impl.AdslPackageImpl#getInstanceConfiguration()
   * @generated
   */
  int INSTANCE_CONFIGURATION = 25;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CONFIGURATION__SETTINGS = 0;

  /**
   * The number of structural features of the '<em>Instance Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CONFIGURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.ConfigurationParameterSettingImpl <em>Configuration Parameter Setting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ConfigurationParameterSettingImpl
   * @see adsl.impl.AdslPackageImpl#getConfigurationParameterSetting()
   * @generated
   */
  int CONFIGURATION_PARAMETER_SETTING = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER_SETTING__VALUE = 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER_SETTING__PARAM = 1;

  /**
   * The number of structural features of the '<em>Configuration Parameter Setting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER_SETTING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.ConfigurationParameterValueImpl <em>Configuration Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.ConfigurationParameterValueImpl
   * @see adsl.impl.AdslPackageImpl#getConfigurationParameterValue()
   * @generated
   */
  int CONFIGURATION_PARAMETER_VALUE = 27;

  /**
   * The number of structural features of the '<em>Configuration Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link adsl.impl.NumericConfigurationParameterValueImpl <em>Numeric Configuration Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.NumericConfigurationParameterValueImpl
   * @see adsl.impl.AdslPackageImpl#getNumericConfigurationParameterValue()
   * @generated
   */
  int NUMERIC_CONFIGURATION_PARAMETER_VALUE = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_CONFIGURATION_PARAMETER_VALUE__VALUE = CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Configuration Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT = CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.TextConfigurationParameterValueImpl <em>Text Configuration Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.TextConfigurationParameterValueImpl
   * @see adsl.impl.AdslPackageImpl#getTextConfigurationParameterValue()
   * @generated
   */
  int TEXT_CONFIGURATION_PARAMETER_VALUE = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONFIGURATION_PARAMETER_VALUE__VALUE = CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Configuration Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT = CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.BooleanConfigurationParameterValueImpl <em>Boolean Configuration Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.BooleanConfigurationParameterValueImpl
   * @see adsl.impl.AdslPackageImpl#getBooleanConfigurationParameterValue()
   * @generated
   */
  int BOOLEAN_CONFIGURATION_PARAMETER_VALUE = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONFIGURATION_PARAMETER_VALUE__VALUE = CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Configuration Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT = CONFIGURATION_PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.BooleanLiteralImpl
   * @see adsl.impl.AdslPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 31;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link adsl.impl.TrueLiteralImpl <em>True Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.TrueLiteralImpl
   * @see adsl.impl.AdslPackageImpl#getTrueLiteral()
   * @generated
   */
  int TRUE_LITERAL = 32;

  /**
   * The number of structural features of the '<em>True Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_LITERAL_FEATURE_COUNT = BOOLEAN_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.FalseLiteralImpl <em>False Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FalseLiteralImpl
   * @see adsl.impl.AdslPackageImpl#getFalseLiteral()
   * @generated
   */
  int FALSE_LITERAL = 33;

  /**
   * The number of structural features of the '<em>False Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE_LITERAL_FEATURE_COUNT = BOOLEAN_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link adsl.impl.FeatureClauseImpl <em>Feature Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FeatureClauseImpl
   * @see adsl.impl.AdslPackageImpl#getFeatureClause()
   * @generated
   */
  int FEATURE_CLAUSE = 34;

  /**
   * The number of structural features of the '<em>Feature Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link adsl.impl.FeatureAndListImpl <em>Feature And List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FeatureAndListImpl
   * @see adsl.impl.AdslPackageImpl#getFeatureAndList()
   * @generated
   */
  int FEATURE_AND_LIST = 35;

  /**
   * The feature id for the '<em><b>Feature List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_AND_LIST__FEATURE_LIST = FEATURE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature And List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_AND_LIST_FEATURE_COUNT = FEATURE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.FeatureOrListImpl <em>Feature Or List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FeatureOrListImpl
   * @see adsl.impl.AdslPackageImpl#getFeatureOrList()
   * @generated
   */
  int FEATURE_OR_LIST = 36;

  /**
   * The feature id for the '<em><b>Feature List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_LIST__FEATURE_LIST = FEATURE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Or List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_LIST_FEATURE_COUNT = FEATURE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.FeatureExpressionImpl <em>Feature Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FeatureExpressionImpl
   * @see adsl.impl.AdslPackageImpl#getFeatureExpression()
   * @generated
   */
  int FEATURE_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPRESSION__EXPRESSION = FEATURE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPRESSION_FEATURE_COUNT = FEATURE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FeatureImpl
   * @see adsl.impl.AdslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 38;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE = FEATURE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = FEATURE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link adsl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.OrExpressionImpl
   * @see adsl.impl.AdslPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OPERANDS = 0;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.AndExpressionImpl
   * @see adsl.impl.AdslPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OPERANDS = 0;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.OperandImpl
   * @see adsl.impl.AdslPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 41;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__IS_NOT = 1;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.AtomImpl
   * @see adsl.impl.AdslPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 42;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link adsl.impl.FeatureModelImportImpl <em>Feature Model Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.impl.FeatureModelImportImpl
   * @see adsl.impl.AdslPackageImpl#getFeatureModelImport()
   * @generated
   */
  int FEATURE_MODEL_IMPORT = 43;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_IMPORT__URI = 0;

  /**
   * The number of structural features of the '<em>Feature Model Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link adsl.PrimitiveType <em>Primitive Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.PrimitiveType
   * @see adsl.impl.AdslPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 44;

  /**
   * The meta object id for the '{@link adsl.ConfigParamTypeEnum <em>Config Param Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.ConfigParamTypeEnum
   * @see adsl.impl.AdslPackageImpl#getConfigParamTypeEnum()
   * @generated
   */
  int CONFIG_PARAM_TYPE_ENUM = 45;

  /**
   * The meta object id for the '{@link adsl.ValueTimeEnum <em>Value Time Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see adsl.ValueTimeEnum
   * @see adsl.impl.AdslPackageImpl#getValueTimeEnum()
   * @generated
   */
  int VALUE_TIME_ENUM = 46;


  /**
   * Returns the meta object for class '{@link adsl.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see adsl.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference '{@link adsl.File#getFeatureModel <em>Feature Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Model</em>'.
   * @see adsl.File#getFeatureModel()
   * @see #getFile()
   * @generated
   */
  EReference getFile_FeatureModel();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.File#getCompositions <em>Compositions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Compositions</em>'.
   * @see adsl.File#getCompositions()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Compositions();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.File#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see adsl.File#getImports()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.File#getPartialComponents <em>Partial Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Partial Components</em>'.
   * @see adsl.File#getPartialComponents()
   * @see #getFile()
   * @generated
   */
  EReference getFile_PartialComponents();

  /**
   * Returns the meta object for class '{@link adsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see adsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link adsl.Import#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see adsl.Import#getUri()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Uri();

  /**
   * Returns the meta object for class '{@link adsl.PartialComponent <em>Partial Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Component</em>'.
   * @see adsl.PartialComponent
   * @generated
   */
  EClass getPartialComponent();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.PartialComponent#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see adsl.PartialComponent#getComponents()
   * @see #getPartialComponent()
   * @generated
   */
  EReference getPartialComponent_Components();

  /**
   * Returns the meta object for the attribute '{@link adsl.PartialComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.PartialComponent#getName()
   * @see #getPartialComponent()
   * @generated
   */
  EAttribute getPartialComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.PartialComponent#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see adsl.PartialComponent#getUsings()
   * @see #getPartialComponent()
   * @generated
   */
  EReference getPartialComponent_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.PartialComponent#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see adsl.PartialComponent#getInterfaces()
   * @see #getPartialComponent()
   * @generated
   */
  EReference getPartialComponent_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.PartialComponent#getSubPartialComponents <em>Sub Partial Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Partial Components</em>'.
   * @see adsl.PartialComponent#getSubPartialComponents()
   * @see #getPartialComponent()
   * @generated
   */
  EReference getPartialComponent_SubPartialComponents();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.PartialComponent#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see adsl.PartialComponent#getEntities()
   * @see #getPartialComponent()
   * @generated
   */
  EReference getPartialComponent_Entities();

  /**
   * Returns the meta object for class '{@link adsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using</em>'.
   * @see adsl.Using
   * @generated
   */
  EClass getUsing();

  /**
   * Returns the meta object for the attribute '{@link adsl.Using#getPartialComponent <em>Partial Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Component</em>'.
   * @see adsl.Using#getPartialComponent()
   * @see #getUsing()
   * @generated
   */
  EAttribute getUsing_PartialComponent();

  /**
   * Returns the meta object for class '{@link adsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see adsl.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Module#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see adsl.Module#getConfiguration()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Configuration();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Module#getFeatureClause <em>Feature Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Clause</em>'.
   * @see adsl.Module#getFeatureClause()
   * @see #getModule()
   * @generated
   */
  EReference getModule_FeatureClause();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.Module#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see adsl.Module#getPorts()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Ports();

  /**
   * Returns the meta object for the attribute '{@link adsl.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for class '{@link adsl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see adsl.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link adsl.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the attribute '{@link adsl.Port#isIsToMany <em>Is To Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is To Many</em>'.
   * @see adsl.Port#isIsToMany()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_IsToMany();

  /**
   * Returns the meta object for the reference '{@link adsl.Port#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see adsl.Port#getInterface()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Interface();

  /**
   * Returns the meta object for the attribute '{@link adsl.Port#isIsMandatory <em>Is Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Mandatory</em>'.
   * @see adsl.Port#isIsMandatory()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_IsMandatory();

  /**
   * Returns the meta object for class '{@link adsl.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Port</em>'.
   * @see adsl.ProvidedPort
   * @generated
   */
  EClass getProvidedPort();

  /**
   * Returns the meta object for class '{@link adsl.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Port</em>'.
   * @see adsl.RequiredPort
   * @generated
   */
  EClass getRequiredPort();

  /**
   * Returns the meta object for class '{@link adsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see adsl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link adsl.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.Interface#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see adsl.Interface#getOperations()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Operations();

  /**
   * Returns the meta object for class '{@link adsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see adsl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Operation#getFeatureClause <em>Feature Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Clause</em>'.
   * @see adsl.Operation#getFeatureClause()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_FeatureClause();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Operation#getResultRef <em>Result Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Ref</em>'.
   * @see adsl.Operation#getResultRef()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_ResultRef();

  /**
   * Returns the meta object for the attribute '{@link adsl.Operation#isIsVoid <em>Is Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Void</em>'.
   * @see adsl.Operation#isIsVoid()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_IsVoid();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see adsl.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameters();

  /**
   * Returns the meta object for the attribute '{@link adsl.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for class '{@link adsl.OperationParameter <em>Operation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Parameter</em>'.
   * @see adsl.OperationParameter
   * @generated
   */
  EClass getOperationParameter();

  /**
   * Returns the meta object for the containment reference '{@link adsl.OperationParameter#getTyperef <em>Typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeref</em>'.
   * @see adsl.OperationParameter#getTyperef()
   * @see #getOperationParameter()
   * @generated
   */
  EReference getOperationParameter_Typeref();

  /**
   * Returns the meta object for the attribute '{@link adsl.OperationParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.OperationParameter#getName()
   * @see #getOperationParameter()
   * @generated
   */
  EAttribute getOperationParameter_Name();

  /**
   * Returns the meta object for class '{@link adsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see adsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link adsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.DataType#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see adsl.DataType#getAttributes()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link adsl.DataType#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see adsl.DataType#getExtends()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.DataType#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see adsl.DataType#getOperations()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Operations();

  /**
   * Returns the meta object for the attribute '{@link adsl.DataType#isHasSupertype <em>Has Supertype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Supertype</em>'.
   * @see adsl.DataType#isHasSupertype()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_HasSupertype();

  /**
   * Returns the meta object for class '{@link adsl.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see adsl.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for class '{@link adsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see adsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link adsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Attribute#getFeatureClause <em>Feature Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Clause</em>'.
   * @see adsl.Attribute#getFeatureClause()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_FeatureClause();

  /**
   * Returns the meta object for class '{@link adsl.AttributeComplex <em>Attribute Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Complex</em>'.
   * @see adsl.AttributeComplex
   * @generated
   */
  EClass getAttributeComplex();

  /**
   * Returns the meta object for the attribute '{@link adsl.AttributeComplex#isIsComposite <em>Is Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Composite</em>'.
   * @see adsl.AttributeComplex#isIsComposite()
   * @see #getAttributeComplex()
   * @generated
   */
  EAttribute getAttributeComplex_IsComposite();

  /**
   * Returns the meta object for the attribute '{@link adsl.AttributeComplex#isIsReference <em>Is Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Reference</em>'.
   * @see adsl.AttributeComplex#isIsReference()
   * @see #getAttributeComplex()
   * @generated
   */
  EAttribute getAttributeComplex_IsReference();

  /**
   * Returns the meta object for the containment reference '{@link adsl.AttributeComplex#getTyperef <em>Typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeref</em>'.
   * @see adsl.AttributeComplex#getTyperef()
   * @see #getAttributeComplex()
   * @generated
   */
  EReference getAttributeComplex_Typeref();

  /**
   * Returns the meta object for the attribute '{@link adsl.AttributeComplex#isIsRequired <em>Is Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Required</em>'.
   * @see adsl.AttributeComplex#isIsRequired()
   * @see #getAttributeComplex()
   * @generated
   */
  EAttribute getAttributeComplex_IsRequired();

  /**
   * Returns the meta object for class '{@link adsl.AttributePrimitive <em>Attribute Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Primitive</em>'.
   * @see adsl.AttributePrimitive
   * @generated
   */
  EClass getAttributePrimitive();

  /**
   * Returns the meta object for the attribute '{@link adsl.AttributePrimitive#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see adsl.AttributePrimitive#getType()
   * @see #getAttributePrimitive()
   * @generated
   */
  EAttribute getAttributePrimitive_Type();

  /**
   * Returns the meta object for class '{@link adsl.AnyTypeRef <em>Any Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Type Ref</em>'.
   * @see adsl.AnyTypeRef
   * @generated
   */
  EClass getAnyTypeRef();

  /**
   * Returns the meta object for the reference '{@link adsl.AnyTypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see adsl.AnyTypeRef#getType()
   * @see #getAnyTypeRef()
   * @generated
   */
  EReference getAnyTypeRef_Type();

  /**
   * Returns the meta object for class '{@link adsl.SimpleTypeRef <em>Simple Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type Ref</em>'.
   * @see adsl.SimpleTypeRef
   * @generated
   */
  EClass getSimpleTypeRef();

  /**
   * Returns the meta object for class '{@link adsl.CollectionTypeRef <em>Collection Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type Ref</em>'.
   * @see adsl.CollectionTypeRef
   * @generated
   */
  EClass getCollectionTypeRef();

  /**
   * Returns the meta object for class '{@link adsl.Composition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition</em>'.
   * @see adsl.Composition
   * @generated
   */
  EClass getComposition();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.Composition#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see adsl.Composition#getInstances()
   * @see #getComposition()
   * @generated
   */
  EReference getComposition_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.Composition#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see adsl.Composition#getConnectors()
   * @see #getComposition()
   * @generated
   */
  EReference getComposition_Connectors();

  /**
   * Returns the meta object for the attribute '{@link adsl.Composition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Composition#getName()
   * @see #getComposition()
   * @generated
   */
  EAttribute getComposition_Name();

  /**
   * Returns the meta object for class '{@link adsl.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see adsl.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Instance#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see adsl.Instance#getConfiguration()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Configuration();

  /**
   * Returns the meta object for the attribute '{@link adsl.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the reference '{@link adsl.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see adsl.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Type();

  /**
   * Returns the meta object for class '{@link adsl.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see adsl.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Connector#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see adsl.Connector#getTarget()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Target();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Connector#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see adsl.Connector#getSource()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Source();

  /**
   * Returns the meta object for class '{@link adsl.InstancePortPair <em>Instance Port Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Port Pair</em>'.
   * @see adsl.InstancePortPair
   * @generated
   */
  EClass getInstancePortPair();

  /**
   * Returns the meta object for the reference '{@link adsl.InstancePortPair#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see adsl.InstancePortPair#getPort()
   * @see #getInstancePortPair()
   * @generated
   */
  EReference getInstancePortPair_Port();

  /**
   * Returns the meta object for the reference '{@link adsl.InstancePortPair#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see adsl.InstancePortPair#getInstance()
   * @see #getInstancePortPair()
   * @generated
   */
  EReference getInstancePortPair_Instance();

  /**
   * Returns the meta object for class '{@link adsl.ModuleConfiguration <em>Module Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Configuration</em>'.
   * @see adsl.ModuleConfiguration
   * @generated
   */
  EClass getModuleConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.ModuleConfiguration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see adsl.ModuleConfiguration#getParams()
   * @see #getModuleConfiguration()
   * @generated
   */
  EReference getModuleConfiguration_Params();

  /**
   * Returns the meta object for class '{@link adsl.ConfigurationParameter <em>Configuration Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Parameter</em>'.
   * @see adsl.ConfigurationParameter
   * @generated
   */
  EClass getConfigurationParameter();

  /**
   * Returns the meta object for the attribute '{@link adsl.ConfigurationParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see adsl.ConfigurationParameter#getName()
   * @see #getConfigurationParameter()
   * @generated
   */
  EAttribute getConfigurationParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link adsl.ConfigurationParameter#getValueTime <em>Value Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Time</em>'.
   * @see adsl.ConfigurationParameter#getValueTime()
   * @see #getConfigurationParameter()
   * @generated
   */
  EAttribute getConfigurationParameter_ValueTime();

  /**
   * Returns the meta object for the attribute '{@link adsl.ConfigurationParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see adsl.ConfigurationParameter#getType()
   * @see #getConfigurationParameter()
   * @generated
   */
  EAttribute getConfigurationParameter_Type();

  /**
   * Returns the meta object for class '{@link adsl.InstanceConfiguration <em>Instance Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Configuration</em>'.
   * @see adsl.InstanceConfiguration
   * @generated
   */
  EClass getInstanceConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.InstanceConfiguration#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Settings</em>'.
   * @see adsl.InstanceConfiguration#getSettings()
   * @see #getInstanceConfiguration()
   * @generated
   */
  EReference getInstanceConfiguration_Settings();

  /**
   * Returns the meta object for class '{@link adsl.ConfigurationParameterSetting <em>Configuration Parameter Setting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Parameter Setting</em>'.
   * @see adsl.ConfigurationParameterSetting
   * @generated
   */
  EClass getConfigurationParameterSetting();

  /**
   * Returns the meta object for the containment reference '{@link adsl.ConfigurationParameterSetting#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see adsl.ConfigurationParameterSetting#getValue()
   * @see #getConfigurationParameterSetting()
   * @generated
   */
  EReference getConfigurationParameterSetting_Value();

  /**
   * Returns the meta object for the reference '{@link adsl.ConfigurationParameterSetting#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see adsl.ConfigurationParameterSetting#getParam()
   * @see #getConfigurationParameterSetting()
   * @generated
   */
  EReference getConfigurationParameterSetting_Param();

  /**
   * Returns the meta object for class '{@link adsl.ConfigurationParameterValue <em>Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Parameter Value</em>'.
   * @see adsl.ConfigurationParameterValue
   * @generated
   */
  EClass getConfigurationParameterValue();

  /**
   * Returns the meta object for class '{@link adsl.NumericConfigurationParameterValue <em>Numeric Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Configuration Parameter Value</em>'.
   * @see adsl.NumericConfigurationParameterValue
   * @generated
   */
  EClass getNumericConfigurationParameterValue();

  /**
   * Returns the meta object for the attribute '{@link adsl.NumericConfigurationParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see adsl.NumericConfigurationParameterValue#getValue()
   * @see #getNumericConfigurationParameterValue()
   * @generated
   */
  EAttribute getNumericConfigurationParameterValue_Value();

  /**
   * Returns the meta object for class '{@link adsl.TextConfigurationParameterValue <em>Text Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Configuration Parameter Value</em>'.
   * @see adsl.TextConfigurationParameterValue
   * @generated
   */
  EClass getTextConfigurationParameterValue();

  /**
   * Returns the meta object for the attribute '{@link adsl.TextConfigurationParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see adsl.TextConfigurationParameterValue#getValue()
   * @see #getTextConfigurationParameterValue()
   * @generated
   */
  EAttribute getTextConfigurationParameterValue_Value();

  /**
   * Returns the meta object for class '{@link adsl.BooleanConfigurationParameterValue <em>Boolean Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Configuration Parameter Value</em>'.
   * @see adsl.BooleanConfigurationParameterValue
   * @generated
   */
  EClass getBooleanConfigurationParameterValue();

  /**
   * Returns the meta object for the containment reference '{@link adsl.BooleanConfigurationParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see adsl.BooleanConfigurationParameterValue#getValue()
   * @see #getBooleanConfigurationParameterValue()
   * @generated
   */
  EReference getBooleanConfigurationParameterValue_Value();

  /**
   * Returns the meta object for class '{@link adsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see adsl.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for class '{@link adsl.TrueLiteral <em>True Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True Literal</em>'.
   * @see adsl.TrueLiteral
   * @generated
   */
  EClass getTrueLiteral();

  /**
   * Returns the meta object for class '{@link adsl.FalseLiteral <em>False Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>False Literal</em>'.
   * @see adsl.FalseLiteral
   * @generated
   */
  EClass getFalseLiteral();

  /**
   * Returns the meta object for class '{@link adsl.FeatureClause <em>Feature Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Clause</em>'.
   * @see adsl.FeatureClause
   * @generated
   */
  EClass getFeatureClause();

  /**
   * Returns the meta object for class '{@link adsl.FeatureAndList <em>Feature And List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature And List</em>'.
   * @see adsl.FeatureAndList
   * @generated
   */
  EClass getFeatureAndList();

  /**
   * Returns the meta object for the attribute list '{@link adsl.FeatureAndList#getFeatureList <em>Feature List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Feature List</em>'.
   * @see adsl.FeatureAndList#getFeatureList()
   * @see #getFeatureAndList()
   * @generated
   */
  EAttribute getFeatureAndList_FeatureList();

  /**
   * Returns the meta object for class '{@link adsl.FeatureOrList <em>Feature Or List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Or List</em>'.
   * @see adsl.FeatureOrList
   * @generated
   */
  EClass getFeatureOrList();

  /**
   * Returns the meta object for the attribute list '{@link adsl.FeatureOrList#getFeatureList <em>Feature List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Feature List</em>'.
   * @see adsl.FeatureOrList#getFeatureList()
   * @see #getFeatureOrList()
   * @generated
   */
  EAttribute getFeatureOrList_FeatureList();

  /**
   * Returns the meta object for class '{@link adsl.FeatureExpression <em>Feature Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Expression</em>'.
   * @see adsl.FeatureExpression
   * @generated
   */
  EClass getFeatureExpression();

  /**
   * Returns the meta object for the containment reference '{@link adsl.FeatureExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see adsl.FeatureExpression#getExpression()
   * @see #getFeatureExpression()
   * @generated
   */
  EReference getFeatureExpression_Expression();

  /**
   * Returns the meta object for class '{@link adsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see adsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link adsl.Feature#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see adsl.Feature#getFeature()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Feature();

  /**
   * Returns the meta object for class '{@link adsl.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see adsl.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.OrExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see adsl.OrExpression#getOperands()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Operands();

  /**
   * Returns the meta object for class '{@link adsl.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see adsl.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link adsl.AndExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see adsl.AndExpression#getOperands()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Operands();

  /**
   * Returns the meta object for class '{@link adsl.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see adsl.Operand
   * @generated
   */
  EClass getOperand();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Operand#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see adsl.Operand#getExpression()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Expression();

  /**
   * Returns the meta object for the attribute '{@link adsl.Operand#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see adsl.Operand#isIsNot()
   * @see #getOperand()
   * @generated
   */
  EAttribute getOperand_IsNot();

  /**
   * Returns the meta object for class '{@link adsl.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see adsl.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the containment reference '{@link adsl.Atom#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see adsl.Atom#getExpression()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Expression();

  /**
   * Returns the meta object for the attribute '{@link adsl.Atom#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see adsl.Atom#getFeature()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Feature();

  /**
   * Returns the meta object for class '{@link adsl.FeatureModelImport <em>Feature Model Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Model Import</em>'.
   * @see adsl.FeatureModelImport
   * @generated
   */
  EClass getFeatureModelImport();

  /**
   * Returns the meta object for the attribute '{@link adsl.FeatureModelImport#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see adsl.FeatureModelImport#getUri()
   * @see #getFeatureModelImport()
   * @generated
   */
  EAttribute getFeatureModelImport_Uri();

  /**
   * Returns the meta object for enum '{@link adsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Type</em>'.
   * @see adsl.PrimitiveType
   * @generated
   */
  EEnum getPrimitiveType();

  /**
   * Returns the meta object for enum '{@link adsl.ConfigParamTypeEnum <em>Config Param Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Config Param Type Enum</em>'.
   * @see adsl.ConfigParamTypeEnum
   * @generated
   */
  EEnum getConfigParamTypeEnum();

  /**
   * Returns the meta object for enum '{@link adsl.ValueTimeEnum <em>Value Time Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Time Enum</em>'.
   * @see adsl.ValueTimeEnum
   * @generated
   */
  EEnum getValueTimeEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdslFactory getAdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link adsl.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FileImpl
     * @see adsl.impl.AdslPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Feature Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__FEATURE_MODEL = eINSTANCE.getFile_FeatureModel();

    /**
     * The meta object literal for the '<em><b>Compositions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__COMPOSITIONS = eINSTANCE.getFile_Compositions();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__IMPORTS = eINSTANCE.getFile_Imports();

    /**
     * The meta object literal for the '<em><b>Partial Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__PARTIAL_COMPONENTS = eINSTANCE.getFile_PartialComponents();

    /**
     * The meta object literal for the '{@link adsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ImportImpl
     * @see adsl.impl.AdslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__URI = eINSTANCE.getImport_Uri();

    /**
     * The meta object literal for the '{@link adsl.impl.PartialComponentImpl <em>Partial Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.PartialComponentImpl
     * @see adsl.impl.AdslPackageImpl#getPartialComponent()
     * @generated
     */
    EClass PARTIAL_COMPONENT = eINSTANCE.getPartialComponent();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_COMPONENT__COMPONENTS = eINSTANCE.getPartialComponent_Components();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTIAL_COMPONENT__NAME = eINSTANCE.getPartialComponent_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_COMPONENT__USINGS = eINSTANCE.getPartialComponent_Usings();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_COMPONENT__INTERFACES = eINSTANCE.getPartialComponent_Interfaces();

    /**
     * The meta object literal for the '<em><b>Sub Partial Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_COMPONENT__SUB_PARTIAL_COMPONENTS = eINSTANCE.getPartialComponent_SubPartialComponents();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_COMPONENT__ENTITIES = eINSTANCE.getPartialComponent_Entities();

    /**
     * The meta object literal for the '{@link adsl.impl.UsingImpl <em>Using</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.UsingImpl
     * @see adsl.impl.AdslPackageImpl#getUsing()
     * @generated
     */
    EClass USING = eINSTANCE.getUsing();

    /**
     * The meta object literal for the '<em><b>Partial Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USING__PARTIAL_COMPONENT = eINSTANCE.getUsing_PartialComponent();

    /**
     * The meta object literal for the '{@link adsl.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ModuleImpl
     * @see adsl.impl.AdslPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__CONFIGURATION = eINSTANCE.getModule_Configuration();

    /**
     * The meta object literal for the '<em><b>Feature Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FEATURE_CLAUSE = eINSTANCE.getModule_FeatureClause();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PORTS = eINSTANCE.getModule_Ports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '{@link adsl.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.PortImpl
     * @see adsl.impl.AdslPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Is To Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__IS_TO_MANY = eINSTANCE.getPort_IsToMany();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__INTERFACE = eINSTANCE.getPort_Interface();

    /**
     * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__IS_MANDATORY = eINSTANCE.getPort_IsMandatory();

    /**
     * The meta object literal for the '{@link adsl.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ProvidedPortImpl
     * @see adsl.impl.AdslPackageImpl#getProvidedPort()
     * @generated
     */
    EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

    /**
     * The meta object literal for the '{@link adsl.impl.RequiredPortImpl <em>Required Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.RequiredPortImpl
     * @see adsl.impl.AdslPackageImpl#getRequiredPort()
     * @generated
     */
    EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

    /**
     * The meta object literal for the '{@link adsl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.InterfaceImpl
     * @see adsl.impl.AdslPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

    /**
     * The meta object literal for the '{@link adsl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.OperationImpl
     * @see adsl.impl.AdslPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Feature Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__FEATURE_CLAUSE = eINSTANCE.getOperation_FeatureClause();

    /**
     * The meta object literal for the '<em><b>Result Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RESULT_REF = eINSTANCE.getOperation_ResultRef();

    /**
     * The meta object literal for the '<em><b>Is Void</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__IS_VOID = eINSTANCE.getOperation_IsVoid();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '{@link adsl.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.OperationParameterImpl
     * @see adsl.impl.AdslPackageImpl#getOperationParameter()
     * @generated
     */
    EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

    /**
     * The meta object literal for the '<em><b>Typeref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_PARAMETER__TYPEREF = eINSTANCE.getOperationParameter_Typeref();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_PARAMETER__NAME = eINSTANCE.getOperationParameter_Name();

    /**
     * The meta object literal for the '{@link adsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.DataTypeImpl
     * @see adsl.impl.AdslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__ATTRIBUTES = eINSTANCE.getDataType_Attributes();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__EXTENDS = eINSTANCE.getDataType_Extends();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__OPERATIONS = eINSTANCE.getDataType_Operations();

    /**
     * The meta object literal for the '<em><b>Has Supertype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__HAS_SUPERTYPE = eINSTANCE.getDataType_HasSupertype();

    /**
     * The meta object literal for the '{@link adsl.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ComplexTypeImpl
     * @see adsl.impl.AdslPackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '{@link adsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.AttributeImpl
     * @see adsl.impl.AdslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Feature Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__FEATURE_CLAUSE = eINSTANCE.getAttribute_FeatureClause();

    /**
     * The meta object literal for the '{@link adsl.impl.AttributeComplexImpl <em>Attribute Complex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.AttributeComplexImpl
     * @see adsl.impl.AdslPackageImpl#getAttributeComplex()
     * @generated
     */
    EClass ATTRIBUTE_COMPLEX = eINSTANCE.getAttributeComplex();

    /**
     * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_COMPLEX__IS_COMPOSITE = eINSTANCE.getAttributeComplex_IsComposite();

    /**
     * The meta object literal for the '<em><b>Is Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_COMPLEX__IS_REFERENCE = eINSTANCE.getAttributeComplex_IsReference();

    /**
     * The meta object literal for the '<em><b>Typeref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_COMPLEX__TYPEREF = eINSTANCE.getAttributeComplex_Typeref();

    /**
     * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_COMPLEX__IS_REQUIRED = eINSTANCE.getAttributeComplex_IsRequired();

    /**
     * The meta object literal for the '{@link adsl.impl.AttributePrimitiveImpl <em>Attribute Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.AttributePrimitiveImpl
     * @see adsl.impl.AdslPackageImpl#getAttributePrimitive()
     * @generated
     */
    EClass ATTRIBUTE_PRIMITIVE = eINSTANCE.getAttributePrimitive();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PRIMITIVE__TYPE = eINSTANCE.getAttributePrimitive_Type();

    /**
     * The meta object literal for the '{@link adsl.impl.AnyTypeRefImpl <em>Any Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.AnyTypeRefImpl
     * @see adsl.impl.AdslPackageImpl#getAnyTypeRef()
     * @generated
     */
    EClass ANY_TYPE_REF = eINSTANCE.getAnyTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANY_TYPE_REF__TYPE = eINSTANCE.getAnyTypeRef_Type();

    /**
     * The meta object literal for the '{@link adsl.impl.SimpleTypeRefImpl <em>Simple Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.SimpleTypeRefImpl
     * @see adsl.impl.AdslPackageImpl#getSimpleTypeRef()
     * @generated
     */
    EClass SIMPLE_TYPE_REF = eINSTANCE.getSimpleTypeRef();

    /**
     * The meta object literal for the '{@link adsl.impl.CollectionTypeRefImpl <em>Collection Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.CollectionTypeRefImpl
     * @see adsl.impl.AdslPackageImpl#getCollectionTypeRef()
     * @generated
     */
    EClass COLLECTION_TYPE_REF = eINSTANCE.getCollectionTypeRef();

    /**
     * The meta object literal for the '{@link adsl.impl.CompositionImpl <em>Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.CompositionImpl
     * @see adsl.impl.AdslPackageImpl#getComposition()
     * @generated
     */
    EClass COMPOSITION = eINSTANCE.getComposition();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION__INSTANCES = eINSTANCE.getComposition_Instances();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION__CONNECTORS = eINSTANCE.getComposition_Connectors();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITION__NAME = eINSTANCE.getComposition_Name();

    /**
     * The meta object literal for the '{@link adsl.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.InstanceImpl
     * @see adsl.impl.AdslPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__CONFIGURATION = eINSTANCE.getInstance_Configuration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

    /**
     * The meta object literal for the '{@link adsl.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ConnectorImpl
     * @see adsl.impl.AdslPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

    /**
     * The meta object literal for the '{@link adsl.impl.InstancePortPairImpl <em>Instance Port Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.InstancePortPairImpl
     * @see adsl.impl.AdslPackageImpl#getInstancePortPair()
     * @generated
     */
    EClass INSTANCE_PORT_PAIR = eINSTANCE.getInstancePortPair();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_PORT_PAIR__PORT = eINSTANCE.getInstancePortPair_Port();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_PORT_PAIR__INSTANCE = eINSTANCE.getInstancePortPair_Instance();

    /**
     * The meta object literal for the '{@link adsl.impl.ModuleConfigurationImpl <em>Module Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ModuleConfigurationImpl
     * @see adsl.impl.AdslPackageImpl#getModuleConfiguration()
     * @generated
     */
    EClass MODULE_CONFIGURATION = eINSTANCE.getModuleConfiguration();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_CONFIGURATION__PARAMS = eINSTANCE.getModuleConfiguration_Params();

    /**
     * The meta object literal for the '{@link adsl.impl.ConfigurationParameterImpl <em>Configuration Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ConfigurationParameterImpl
     * @see adsl.impl.AdslPackageImpl#getConfigurationParameter()
     * @generated
     */
    EClass CONFIGURATION_PARAMETER = eINSTANCE.getConfigurationParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION_PARAMETER__NAME = eINSTANCE.getConfigurationParameter_Name();

    /**
     * The meta object literal for the '<em><b>Value Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION_PARAMETER__VALUE_TIME = eINSTANCE.getConfigurationParameter_ValueTime();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION_PARAMETER__TYPE = eINSTANCE.getConfigurationParameter_Type();

    /**
     * The meta object literal for the '{@link adsl.impl.InstanceConfigurationImpl <em>Instance Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.InstanceConfigurationImpl
     * @see adsl.impl.AdslPackageImpl#getInstanceConfiguration()
     * @generated
     */
    EClass INSTANCE_CONFIGURATION = eINSTANCE.getInstanceConfiguration();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_CONFIGURATION__SETTINGS = eINSTANCE.getInstanceConfiguration_Settings();

    /**
     * The meta object literal for the '{@link adsl.impl.ConfigurationParameterSettingImpl <em>Configuration Parameter Setting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ConfigurationParameterSettingImpl
     * @see adsl.impl.AdslPackageImpl#getConfigurationParameterSetting()
     * @generated
     */
    EClass CONFIGURATION_PARAMETER_SETTING = eINSTANCE.getConfigurationParameterSetting();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_PARAMETER_SETTING__VALUE = eINSTANCE.getConfigurationParameterSetting_Value();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_PARAMETER_SETTING__PARAM = eINSTANCE.getConfigurationParameterSetting_Param();

    /**
     * The meta object literal for the '{@link adsl.impl.ConfigurationParameterValueImpl <em>Configuration Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.ConfigurationParameterValueImpl
     * @see adsl.impl.AdslPackageImpl#getConfigurationParameterValue()
     * @generated
     */
    EClass CONFIGURATION_PARAMETER_VALUE = eINSTANCE.getConfigurationParameterValue();

    /**
     * The meta object literal for the '{@link adsl.impl.NumericConfigurationParameterValueImpl <em>Numeric Configuration Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.NumericConfigurationParameterValueImpl
     * @see adsl.impl.AdslPackageImpl#getNumericConfigurationParameterValue()
     * @generated
     */
    EClass NUMERIC_CONFIGURATION_PARAMETER_VALUE = eINSTANCE.getNumericConfigurationParameterValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_CONFIGURATION_PARAMETER_VALUE__VALUE = eINSTANCE.getNumericConfigurationParameterValue_Value();

    /**
     * The meta object literal for the '{@link adsl.impl.TextConfigurationParameterValueImpl <em>Text Configuration Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.TextConfigurationParameterValueImpl
     * @see adsl.impl.AdslPackageImpl#getTextConfigurationParameterValue()
     * @generated
     */
    EClass TEXT_CONFIGURATION_PARAMETER_VALUE = eINSTANCE.getTextConfigurationParameterValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_CONFIGURATION_PARAMETER_VALUE__VALUE = eINSTANCE.getTextConfigurationParameterValue_Value();

    /**
     * The meta object literal for the '{@link adsl.impl.BooleanConfigurationParameterValueImpl <em>Boolean Configuration Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.BooleanConfigurationParameterValueImpl
     * @see adsl.impl.AdslPackageImpl#getBooleanConfigurationParameterValue()
     * @generated
     */
    EClass BOOLEAN_CONFIGURATION_PARAMETER_VALUE = eINSTANCE.getBooleanConfigurationParameterValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONFIGURATION_PARAMETER_VALUE__VALUE = eINSTANCE.getBooleanConfigurationParameterValue_Value();

    /**
     * The meta object literal for the '{@link adsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.BooleanLiteralImpl
     * @see adsl.impl.AdslPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '{@link adsl.impl.TrueLiteralImpl <em>True Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.TrueLiteralImpl
     * @see adsl.impl.AdslPackageImpl#getTrueLiteral()
     * @generated
     */
    EClass TRUE_LITERAL = eINSTANCE.getTrueLiteral();

    /**
     * The meta object literal for the '{@link adsl.impl.FalseLiteralImpl <em>False Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FalseLiteralImpl
     * @see adsl.impl.AdslPackageImpl#getFalseLiteral()
     * @generated
     */
    EClass FALSE_LITERAL = eINSTANCE.getFalseLiteral();

    /**
     * The meta object literal for the '{@link adsl.impl.FeatureClauseImpl <em>Feature Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FeatureClauseImpl
     * @see adsl.impl.AdslPackageImpl#getFeatureClause()
     * @generated
     */
    EClass FEATURE_CLAUSE = eINSTANCE.getFeatureClause();

    /**
     * The meta object literal for the '{@link adsl.impl.FeatureAndListImpl <em>Feature And List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FeatureAndListImpl
     * @see adsl.impl.AdslPackageImpl#getFeatureAndList()
     * @generated
     */
    EClass FEATURE_AND_LIST = eINSTANCE.getFeatureAndList();

    /**
     * The meta object literal for the '<em><b>Feature List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_AND_LIST__FEATURE_LIST = eINSTANCE.getFeatureAndList_FeatureList();

    /**
     * The meta object literal for the '{@link adsl.impl.FeatureOrListImpl <em>Feature Or List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FeatureOrListImpl
     * @see adsl.impl.AdslPackageImpl#getFeatureOrList()
     * @generated
     */
    EClass FEATURE_OR_LIST = eINSTANCE.getFeatureOrList();

    /**
     * The meta object literal for the '<em><b>Feature List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_OR_LIST__FEATURE_LIST = eINSTANCE.getFeatureOrList_FeatureList();

    /**
     * The meta object literal for the '{@link adsl.impl.FeatureExpressionImpl <em>Feature Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FeatureExpressionImpl
     * @see adsl.impl.AdslPackageImpl#getFeatureExpression()
     * @generated
     */
    EClass FEATURE_EXPRESSION = eINSTANCE.getFeatureExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_EXPRESSION__EXPRESSION = eINSTANCE.getFeatureExpression_Expression();

    /**
     * The meta object literal for the '{@link adsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FeatureImpl
     * @see adsl.impl.AdslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__FEATURE = eINSTANCE.getFeature_Feature();

    /**
     * The meta object literal for the '{@link adsl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.OrExpressionImpl
     * @see adsl.impl.AdslPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__OPERANDS = eINSTANCE.getOrExpression_Operands();

    /**
     * The meta object literal for the '{@link adsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.AndExpressionImpl
     * @see adsl.impl.AdslPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__OPERANDS = eINSTANCE.getAndExpression_Operands();

    /**
     * The meta object literal for the '{@link adsl.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.OperandImpl
     * @see adsl.impl.AdslPackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__EXPRESSION = eINSTANCE.getOperand_Expression();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERAND__IS_NOT = eINSTANCE.getOperand_IsNot();

    /**
     * The meta object literal for the '{@link adsl.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.AtomImpl
     * @see adsl.impl.AdslPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__EXPRESSION = eINSTANCE.getAtom_Expression();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__FEATURE = eINSTANCE.getAtom_Feature();

    /**
     * The meta object literal for the '{@link adsl.impl.FeatureModelImportImpl <em>Feature Model Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.impl.FeatureModelImportImpl
     * @see adsl.impl.AdslPackageImpl#getFeatureModelImport()
     * @generated
     */
    EClass FEATURE_MODEL_IMPORT = eINSTANCE.getFeatureModelImport();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MODEL_IMPORT__URI = eINSTANCE.getFeatureModelImport_Uri();

    /**
     * The meta object literal for the '{@link adsl.PrimitiveType <em>Primitive Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.PrimitiveType
     * @see adsl.impl.AdslPackageImpl#getPrimitiveType()
     * @generated
     */
    EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link adsl.ConfigParamTypeEnum <em>Config Param Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.ConfigParamTypeEnum
     * @see adsl.impl.AdslPackageImpl#getConfigParamTypeEnum()
     * @generated
     */
    EEnum CONFIG_PARAM_TYPE_ENUM = eINSTANCE.getConfigParamTypeEnum();

    /**
     * The meta object literal for the '{@link adsl.ValueTimeEnum <em>Value Time Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adsl.ValueTimeEnum
     * @see adsl.impl.AdslPackageImpl#getValueTimeEnum()
     * @generated
     */
    EEnum VALUE_TIME_ENUM = eINSTANCE.getValueTimeEnum();

  }

} //AdslPackage
