/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.util;

import adsl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see adsl.AdslPackage
 * @generated
 */
public class AdslSwitch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslSwitch() {
    if (modelPackage == null) {
      modelPackage = AdslPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage) {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case AdslPackage.FILE: {
        File file = (File)theEObject;
        T result = caseFile(file);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.IMPORT: {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.PARTIAL_COMPONENT: {
        PartialComponent partialComponent = (PartialComponent)theEObject;
        T result = casePartialComponent(partialComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.USING: {
        Using using = (Using)theEObject;
        T result = caseUsing(using);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.MODULE: {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.PORT: {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.PROVIDED_PORT: {
        ProvidedPort providedPort = (ProvidedPort)theEObject;
        T result = caseProvidedPort(providedPort);
        if (result == null) result = casePort(providedPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.REQUIRED_PORT: {
        RequiredPort requiredPort = (RequiredPort)theEObject;
        T result = caseRequiredPort(requiredPort);
        if (result == null) result = casePort(requiredPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.INTERFACE: {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.OPERATION: {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.OPERATION_PARAMETER: {
        OperationParameter operationParameter = (OperationParameter)theEObject;
        T result = caseOperationParameter(operationParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.DATA_TYPE: {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.COMPLEX_TYPE: {
        ComplexType complexType = (ComplexType)theEObject;
        T result = caseComplexType(complexType);
        if (result == null) result = caseDataType(complexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.ATTRIBUTE: {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.ATTRIBUTE_COMPLEX: {
        AttributeComplex attributeComplex = (AttributeComplex)theEObject;
        T result = caseAttributeComplex(attributeComplex);
        if (result == null) result = caseAttribute(attributeComplex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.ATTRIBUTE_PRIMITIVE: {
        AttributePrimitive attributePrimitive = (AttributePrimitive)theEObject;
        T result = caseAttributePrimitive(attributePrimitive);
        if (result == null) result = caseAttribute(attributePrimitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.ANY_TYPE_REF: {
        AnyTypeRef anyTypeRef = (AnyTypeRef)theEObject;
        T result = caseAnyTypeRef(anyTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.SIMPLE_TYPE_REF: {
        SimpleTypeRef simpleTypeRef = (SimpleTypeRef)theEObject;
        T result = caseSimpleTypeRef(simpleTypeRef);
        if (result == null) result = caseAnyTypeRef(simpleTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.COLLECTION_TYPE_REF: {
        CollectionTypeRef collectionTypeRef = (CollectionTypeRef)theEObject;
        T result = caseCollectionTypeRef(collectionTypeRef);
        if (result == null) result = caseAnyTypeRef(collectionTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.COMPOSITION: {
        Composition composition = (Composition)theEObject;
        T result = caseComposition(composition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.INSTANCE: {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.CONNECTOR: {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.INSTANCE_PORT_PAIR: {
        InstancePortPair instancePortPair = (InstancePortPair)theEObject;
        T result = caseInstancePortPair(instancePortPair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.MODULE_CONFIGURATION: {
        ModuleConfiguration moduleConfiguration = (ModuleConfiguration)theEObject;
        T result = caseModuleConfiguration(moduleConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.CONFIGURATION_PARAMETER: {
        ConfigurationParameter configurationParameter = (ConfigurationParameter)theEObject;
        T result = caseConfigurationParameter(configurationParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.INSTANCE_CONFIGURATION: {
        InstanceConfiguration instanceConfiguration = (InstanceConfiguration)theEObject;
        T result = caseInstanceConfiguration(instanceConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.CONFIGURATION_PARAMETER_SETTING: {
        ConfigurationParameterSetting configurationParameterSetting = (ConfigurationParameterSetting)theEObject;
        T result = caseConfigurationParameterSetting(configurationParameterSetting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.CONFIGURATION_PARAMETER_VALUE: {
        ConfigurationParameterValue configurationParameterValue = (ConfigurationParameterValue)theEObject;
        T result = caseConfigurationParameterValue(configurationParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.NUMERIC_CONFIGURATION_PARAMETER_VALUE: {
        NumericConfigurationParameterValue numericConfigurationParameterValue = (NumericConfigurationParameterValue)theEObject;
        T result = caseNumericConfigurationParameterValue(numericConfigurationParameterValue);
        if (result == null) result = caseConfigurationParameterValue(numericConfigurationParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.TEXT_CONFIGURATION_PARAMETER_VALUE: {
        TextConfigurationParameterValue textConfigurationParameterValue = (TextConfigurationParameterValue)theEObject;
        T result = caseTextConfigurationParameterValue(textConfigurationParameterValue);
        if (result == null) result = caseConfigurationParameterValue(textConfigurationParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.BOOLEAN_CONFIGURATION_PARAMETER_VALUE: {
        BooleanConfigurationParameterValue booleanConfigurationParameterValue = (BooleanConfigurationParameterValue)theEObject;
        T result = caseBooleanConfigurationParameterValue(booleanConfigurationParameterValue);
        if (result == null) result = caseConfigurationParameterValue(booleanConfigurationParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.BOOLEAN_LITERAL: {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.TRUE_LITERAL: {
        TrueLiteral trueLiteral = (TrueLiteral)theEObject;
        T result = caseTrueLiteral(trueLiteral);
        if (result == null) result = caseBooleanLiteral(trueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FALSE_LITERAL: {
        FalseLiteral falseLiteral = (FalseLiteral)theEObject;
        T result = caseFalseLiteral(falseLiteral);
        if (result == null) result = caseBooleanLiteral(falseLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FEATURE_CLAUSE: {
        FeatureClause featureClause = (FeatureClause)theEObject;
        T result = caseFeatureClause(featureClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FEATURE_AND_LIST: {
        FeatureAndList featureAndList = (FeatureAndList)theEObject;
        T result = caseFeatureAndList(featureAndList);
        if (result == null) result = caseFeatureClause(featureAndList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FEATURE_OR_LIST: {
        FeatureOrList featureOrList = (FeatureOrList)theEObject;
        T result = caseFeatureOrList(featureOrList);
        if (result == null) result = caseFeatureClause(featureOrList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FEATURE_EXPRESSION: {
        FeatureExpression featureExpression = (FeatureExpression)theEObject;
        T result = caseFeatureExpression(featureExpression);
        if (result == null) result = caseFeatureClause(featureExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FEATURE: {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = caseFeatureClause(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.OR_EXPRESSION: {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.AND_EXPRESSION: {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.OPERAND: {
        Operand operand = (Operand)theEObject;
        T result = caseOperand(operand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.ATOM: {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdslPackage.FEATURE_MODEL_IMPORT: {
        FeatureModelImport featureModelImport = (FeatureModelImport)theEObject;
        T result = caseFeatureModelImport(featureModelImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFile(File object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partial Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partial Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartialComponent(PartialComponent object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsing(Using object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedPort(ProvidedPort object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredPort(RequiredPort object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationParameter(OperationParameter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexType(ComplexType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Complex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Complex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeComplex(AttributeComplex object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributePrimitive(AttributePrimitive object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyTypeRef(AnyTypeRef object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleTypeRef(SimpleTypeRef object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionTypeRef(CollectionTypeRef object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComposition(Composition object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Port Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Port Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstancePortPair(InstancePortPair object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleConfiguration(ModuleConfiguration object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationParameter(ConfigurationParameter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceConfiguration(InstanceConfiguration object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Parameter Setting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Parameter Setting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationParameterSetting(ConfigurationParameterSetting object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationParameterValue(ConfigurationParameterValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Configuration Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericConfigurationParameterValue(NumericConfigurationParameterValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Configuration Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextConfigurationParameterValue(TextConfigurationParameterValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Configuration Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Configuration Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanConfigurationParameterValue(BooleanConfigurationParameterValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>True Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>True Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrueLiteral(TrueLiteral object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>False Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>False Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFalseLiteral(FalseLiteral object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureClause(FeatureClause object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature And List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature And List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureAndList(FeatureAndList object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Or List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Or List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureOrList(FeatureOrList object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureExpression(FeatureExpression object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperand(Operand object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Model Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Model Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureModelImport(FeatureModelImport object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object) {
    return null;
  }

} //AdslSwitch
