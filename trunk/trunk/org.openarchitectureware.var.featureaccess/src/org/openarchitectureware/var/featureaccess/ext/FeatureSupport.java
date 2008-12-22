package org.openarchitectureware.var.featureaccess.ext;

import java.util.List;

import org.openarchitectureware.var.featureaccess.FeatureAccessFactory;
import org.openarchitectureware.var.featureaccess.FeatureModelWrapper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

public class FeatureSupport {

	private static final String PLATFORM_RESOURCE = "platform:/resource/";
	private static FeatureModelWrapper wrapper;

	public static List getAllFeatures(String featureModelUri) {
		if ( featureModelUri.toLowerCase().startsWith(PLATFORM_RESOURCE)) {
			featureModelUri = featureModelUri.substring(PLATFORM_RESOURCE.length());
		}
		if ( wrapper == null ) {
			wrapper = FeatureAccessFactory.getFeatureModelWrapper(featureModelUri);
			wrapper.loadFeatureData(featureModelUri);
		} 
		if ( !wrapper.getCurrentResourceUri().equals(featureModelUri) ) {
			wrapper.loadFeatureData(featureModelUri);
		}
		return wrapper.findAllFeatureNames();
	}
	
}
