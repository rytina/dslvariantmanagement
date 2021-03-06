package org.openarchitectureware.var.featureaccess.fmp;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.config.AttributeNotFound;
import org.eclipse.emf.mwe.core.config.FeatureNotFound;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openarchitectureware.var.featureaccess.AbstractFeatureAccessTest;
import org.openarchitectureware.var.featureaccess.TestData;
import org.openarchitectureware.var.featureaccess.TestHelper;

import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.Project;

public class FMPConfigurationModelWrapperTest extends AbstractFeatureAccessTest
		implements TestData {
	private FMPConfigurationModelWrapper wrapper;

	@Before
	public void setUp() throws Exception {
		wrapper = new FMPConfigurationModelWrapper();
		EObject root = TestHelper.getFmpModelData(fmpModelURI);
		Assert.assertNotNull(root);
		Assert.assertTrue(root instanceof Project);
		Project data = (Project) root;
		wrapper.setConfigurationData(data);
	}

	@Test
	public void testFindSelectedFeatureNames() {
		List<String> selectedFeatureNames = wrapper.findSelectedFeatureNames();
		TestHelper.checkIfFeaturesAreEqual(expectedSelectedFeatureNames,
				selectedFeatureNames);
	}
	
	@Test
	public void testFeatureExists() {
		Assert.assertTrue(wrapper.featureExists("Security"));
	}
	
	@Test
	public void testFeatureSelected() throws FeatureNotFound {
		Assert.assertTrue(wrapper.isFeatureSelected("Security"));
	}
	
	@Test
	public void testGetFeature() throws FeatureNotFound {
		Object securityFeature = wrapper.getFeature("Security");
		Assert.assertNotNull(securityFeature);
		Assert.assertTrue(securityFeature instanceof Feature);
		Feature security = (Feature) securityFeature;
		Assert.assertEquals("Security", security.getName());
	}
	
	@Test
	public void testGetAttributeValue() throws FeatureNotFound, AttributeNotFound {
		Object value = wrapper.getAttributeValue("Security", "name");
		Assert.assertNotNull(value);
		Assert.assertTrue(value instanceof String);
		String nameValue = (String) value;
		Assert.assertEquals("Security", nameValue);
	}
}
