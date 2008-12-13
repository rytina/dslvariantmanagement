package org.openarchitectureware.var.featureaccess.pv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.util.stdlib.DynamicEcoreHelper;
import org.openarchitectureware.var.featureaccess.ConfigurationModelWrapper;
import org.openarchitectureware.var.featureaccess.FeatureModelWrapper;

public class PVConfigurationModelWrapper extends ConfigurationModelWrapper {

	
	public List<String> findSelectedFeatureNames() {
		EObject pvfeatureConf = (EObject)configuration;
		DynamicEcoreHelper h = new DynamicEcoreHelper(pvfeatureConf.eClass().getEPackage());
		List<String> selectedFeatureNames = new ArrayList();		
		for (Iterator iterator = pvfeatureConf.eAllContents(); iterator.hasNext();) {
			EObject o = (EObject) iterator.next();
			if ( o.eClass().getName().equals("Feature")) {
				String featureName = h.getName(o);
				boolean isSelected = (Boolean)h.get(o, "selected");
				if ( isSelected ) selectedFeatureNames.add(featureName);
			}
		}
		return selectedFeatureNames;
	}
	
}
