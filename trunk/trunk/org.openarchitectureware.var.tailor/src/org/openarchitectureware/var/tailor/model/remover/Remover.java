package org.openarchitectureware.var.tailor.model.remover;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openarchitectureware.util.stdlib.DynamicEcoreHelper;
import org.openarchitectureware.var.featureaccess.ConfigurationModelWrapper;
import org.openarchitectureware.var.featureaccess.ElementRemovalHelper;
import org.openarchitectureware.var.tailor.model.GrammarConstants;
import org.openarchitectureware.xtext.registry.CachingModelLoad;

public class Remover {
	
	public void remove( EObject architectureModel, ConfigurationModelWrapper fm ) {
		DynamicEcoreHelper h = new DynamicEcoreHelper(architectureModel.eClass().getEPackage());
		List<String> selectedFeatureNames = fm.findSelectedFeatureNames();
		Map<EObject, EObject> allFeatureClauses = findAllFeatureClausesAndTheirOwners(architectureModel);
		for (Iterator iterator  = allFeatureClauses.keySet().iterator(); iterator.hasNext();) {
			EObject featureClause = (EObject)iterator.next();
			String featureName = h.sget( featureClause , GrammarConstants.FEATURECLAUSE_FEATUREPROPERTY );
			if ( !selectedFeatureNames.contains(featureName) ) {
				EObject owner = (EObject)allFeatureClauses.get(featureClause);
				ElementRemovalHelper.removeElementFromBase( owner , architectureModel );
			}
		}
	}

	private Map<EObject, EObject> findAllFeatureClausesAndTheirOwners(EObject architectureModel) {
		DynamicEcoreHelper h = new DynamicEcoreHelper(architectureModel.eClass().getEPackage());
		Map<EObject, EObject> allFeatureClauses = new HashMap<EObject, EObject>();
		loadModel( architectureModel, allFeatureClauses );
		return allFeatureClauses;
	}

	private void loadModel(EObject model, Map<EObject, EObject> result) {
		for (Iterator iterator = EcoreUtil.getAllContents(model, true); iterator.hasNext();) {
			EObject o = (EObject) iterator.next();
			if ( o.eClass().getName().equals(GrammarConstants.FEATURECLAUSE_CLASSNAME)) {
				result.put( o, o.eContainer() );
			}
			if ( o.eClass().getName().endsWith(GrammarConstants.MODELIMPORT_CLASSNAME_SUFFIX)) {
				String importedUri = o.eGet( o.eClass().getEStructuralFeature(GrammarConstants.MODELIMPORT_URIPROPERTY) ).toString();
				List<EObject> theNextRoots = CachingModelLoad.load(importedUri, model, true);
				for (EObject r : theNextRoots) {
					loadModel(r, result);
				}
			}
		}
	}	
	
}
