/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl.util;

import adsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see adsl.AdslPackage
 * @generated
 */
public class AdslAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = AdslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdslSwitch<Adapter> modelSwitch =
    new AdslSwitch<Adapter>() {
      @Override
      public Adapter caseFile(File object) {
        return createFileAdapter();
      }
      @Override
      public Adapter caseImport(Import object) {
        return createImportAdapter();
      }
      @Override
      public Adapter casePartialComponent(PartialComponent object) {
        return createPartialComponentAdapter();
      }
      @Override
      public Adapter caseUsing(Using object) {
        return createUsingAdapter();
      }
      @Override
      public Adapter caseModule(Module object) {
        return createModuleAdapter();
      }
      @Override
      public Adapter casePort(Port object) {
        return createPortAdapter();
      }
      @Override
      public Adapter caseProvidedPort(ProvidedPort object) {
        return createProvidedPortAdapter();
      }
      @Override
      public Adapter caseRequiredPort(RequiredPort object) {
        return createRequiredPortAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object) {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object) {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseOperationParameter(OperationParameter object) {
        return createOperationParameterAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object) {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseComplexType(ComplexType object) {
        return createComplexTypeAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object) {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeComplex(AttributeComplex object) {
        return createAttributeComplexAdapter();
      }
      @Override
      public Adapter caseAttributePrimitive(AttributePrimitive object) {
        return createAttributePrimitiveAdapter();
      }
      @Override
      public Adapter caseAnyTypeRef(AnyTypeRef object) {
        return createAnyTypeRefAdapter();
      }
      @Override
      public Adapter caseSimpleTypeRef(SimpleTypeRef object) {
        return createSimpleTypeRefAdapter();
      }
      @Override
      public Adapter caseCollectionTypeRef(CollectionTypeRef object) {
        return createCollectionTypeRefAdapter();
      }
      @Override
      public Adapter caseComposition(Composition object) {
        return createCompositionAdapter();
      }
      @Override
      public Adapter caseInstance(Instance object) {
        return createInstanceAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object) {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseInstancePortPair(InstancePortPair object) {
        return createInstancePortPairAdapter();
      }
      @Override
      public Adapter caseModuleConfiguration(ModuleConfiguration object) {
        return createModuleConfigurationAdapter();
      }
      @Override
      public Adapter caseConfigurationParameter(ConfigurationParameter object) {
        return createConfigurationParameterAdapter();
      }
      @Override
      public Adapter caseInstanceConfiguration(InstanceConfiguration object) {
        return createInstanceConfigurationAdapter();
      }
      @Override
      public Adapter caseConfigurationParameterSetting(ConfigurationParameterSetting object) {
        return createConfigurationParameterSettingAdapter();
      }
      @Override
      public Adapter caseConfigurationParameterValue(ConfigurationParameterValue object) {
        return createConfigurationParameterValueAdapter();
      }
      @Override
      public Adapter caseNumericConfigurationParameterValue(NumericConfigurationParameterValue object) {
        return createNumericConfigurationParameterValueAdapter();
      }
      @Override
      public Adapter caseTextConfigurationParameterValue(TextConfigurationParameterValue object) {
        return createTextConfigurationParameterValueAdapter();
      }
      @Override
      public Adapter caseBooleanConfigurationParameterValue(BooleanConfigurationParameterValue object) {
        return createBooleanConfigurationParameterValueAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object) {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseTrueLiteral(TrueLiteral object) {
        return createTrueLiteralAdapter();
      }
      @Override
      public Adapter caseFalseLiteral(FalseLiteral object) {
        return createFalseLiteralAdapter();
      }
      @Override
      public Adapter caseFeatureClause(FeatureClause object) {
        return createFeatureClauseAdapter();
      }
      @Override
      public Adapter caseFeatureAndList(FeatureAndList object) {
        return createFeatureAndListAdapter();
      }
      @Override
      public Adapter caseFeatureOrList(FeatureOrList object) {
        return createFeatureOrListAdapter();
      }
      @Override
      public Adapter caseFeatureExpression(FeatureExpression object) {
        return createFeatureExpressionAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object) {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object) {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object) {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseOperand(Operand object) {
        return createOperandAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object) {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseFeatureModelImport(FeatureModelImport object) {
        return createFeatureModelImportAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link adsl.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.File
   * @generated
   */
  public Adapter createFileAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Import
   * @generated
   */
  public Adapter createImportAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.PartialComponent <em>Partial Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.PartialComponent
   * @generated
   */
  public Adapter createPartialComponentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Using
   * @generated
   */
  public Adapter createUsingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Module
   * @generated
   */
  public Adapter createModuleAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Port
   * @generated
   */
  public Adapter createPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.ProvidedPort
   * @generated
   */
  public Adapter createProvidedPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.RequiredPort
   * @generated
   */
  public Adapter createRequiredPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Operation
   * @generated
   */
  public Adapter createOperationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.OperationParameter <em>Operation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.OperationParameter
   * @generated
   */
  public Adapter createOperationParameterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.ComplexType
   * @generated
   */
  public Adapter createComplexTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.AttributeComplex <em>Attribute Complex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.AttributeComplex
   * @generated
   */
  public Adapter createAttributeComplexAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.AttributePrimitive <em>Attribute Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.AttributePrimitive
   * @generated
   */
  public Adapter createAttributePrimitiveAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.AnyTypeRef <em>Any Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.AnyTypeRef
   * @generated
   */
  public Adapter createAnyTypeRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.SimpleTypeRef <em>Simple Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.SimpleTypeRef
   * @generated
   */
  public Adapter createSimpleTypeRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.CollectionTypeRef <em>Collection Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.CollectionTypeRef
   * @generated
   */
  public Adapter createCollectionTypeRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Composition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Composition
   * @generated
   */
  public Adapter createCompositionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Instance
   * @generated
   */
  public Adapter createInstanceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Connector
   * @generated
   */
  public Adapter createConnectorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.InstancePortPair <em>Instance Port Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.InstancePortPair
   * @generated
   */
  public Adapter createInstancePortPairAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.ModuleConfiguration <em>Module Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.ModuleConfiguration
   * @generated
   */
  public Adapter createModuleConfigurationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.ConfigurationParameter <em>Configuration Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.ConfigurationParameter
   * @generated
   */
  public Adapter createConfigurationParameterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.InstanceConfiguration <em>Instance Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.InstanceConfiguration
   * @generated
   */
  public Adapter createInstanceConfigurationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.ConfigurationParameterSetting <em>Configuration Parameter Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.ConfigurationParameterSetting
   * @generated
   */
  public Adapter createConfigurationParameterSettingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.ConfigurationParameterValue <em>Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.ConfigurationParameterValue
   * @generated
   */
  public Adapter createConfigurationParameterValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.NumericConfigurationParameterValue <em>Numeric Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.NumericConfigurationParameterValue
   * @generated
   */
  public Adapter createNumericConfigurationParameterValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.TextConfigurationParameterValue <em>Text Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.TextConfigurationParameterValue
   * @generated
   */
  public Adapter createTextConfigurationParameterValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.BooleanConfigurationParameterValue <em>Boolean Configuration Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.BooleanConfigurationParameterValue
   * @generated
   */
  public Adapter createBooleanConfigurationParameterValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.TrueLiteral <em>True Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.TrueLiteral
   * @generated
   */
  public Adapter createTrueLiteralAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.FalseLiteral <em>False Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.FalseLiteral
   * @generated
   */
  public Adapter createFalseLiteralAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.FeatureClause <em>Feature Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.FeatureClause
   * @generated
   */
  public Adapter createFeatureClauseAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.FeatureAndList <em>Feature And List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.FeatureAndList
   * @generated
   */
  public Adapter createFeatureAndListAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.FeatureOrList <em>Feature Or List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.FeatureOrList
   * @generated
   */
  public Adapter createFeatureOrListAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.FeatureExpression <em>Feature Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.FeatureExpression
   * @generated
   */
  public Adapter createFeatureExpressionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Operand
   * @generated
   */
  public Adapter createOperandAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.Atom
   * @generated
   */
  public Adapter createAtomAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adsl.FeatureModelImport <em>Feature Model Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adsl.FeatureModelImport
   * @generated
   */
  public Adapter createFeatureModelImportAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //AdslAdapterFactory
