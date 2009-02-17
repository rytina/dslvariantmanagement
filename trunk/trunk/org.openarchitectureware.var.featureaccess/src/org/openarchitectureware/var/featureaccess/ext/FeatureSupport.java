package org.openarchitectureware.var.featureaccess.ext;

import java.util.List;

import org.openarchitectureware.var.featureaccess.ConfigurationModelWrapper;
import org.openarchitectureware.var.featureaccess.FeatureAccessFactory;
import org.openarchitectureware.var.featureaccess.FeatureModelWrapper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

public class FeatureSupport {

	private static final String PLATFORM_RESOURCE = "platform:/resource/";
	private static FeatureModelWrapper featureModelWrapper;
	private static ConfigurationModelWrapper configModelWrapper;

	public static List getAllFeatures(String featureModelUri) {
		if ( featureModelUri.toLowerCase().startsWith(PLATFORM_RESOURCE)) {
			featureModelUri = featureModelUri.substring(PLATFORM_RESOURCE.length());
		}
		if ( featureModelWrapper == null ) {
			featureModelWrapper = FeatureAccessFactory.getFeatureModelWrapper(featureModelUri);
			featureModelWrapper.loadFeatureData(featureModelUri);
		} 
		if ( !featureModelWrapper.getCurrentResourceUri().equals(featureModelUri) ) {
			featureModelWrapper.loadFeatureData(featureModelUri);
		}
		return featureModelWrapper.findAllFeatureNames();
	}

	public static void setConfigurationModelWrapper( ConfigurationModelWrapper w ) {
		configModelWrapper = w;
	}
	
	public static boolean isFeatureSelected( String featureName ) {
		return configModelWrapper.findSelectedFeatureNames().contains(featureName);
	}
		
}
