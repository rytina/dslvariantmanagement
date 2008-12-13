package org.openarchitectureware.var.tailor.model.weaver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openarchitectureware.util.stdlib.CloningExtensions;
import org.openarchitectureware.util.stdlib.DynamicEcoreHelper;
import org.openarchitectureware.var.featureaccess.ElementRemovalHelper;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.AbstractWorkflowComponent2;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;
import org.openarchitectureware.xtext.registry.CachingModelLoad;

public class Weaver {
	
	private DynamicEcoreHelper h;

	public void weave( EObject architectureModel ) {
		h = new DynamicEcoreHelper(architectureModel.eClass().getEPackage());
		List<EObject> pointcuts = findAllPointcuts(architectureModel);
		for (Iterator iterator = pointcuts.iterator(); iterator.hasNext();) {
			EObject pointcut  = (EObject) iterator.next();
			EObject aspectElement  = pointcut.eContainer();
			List<EObject> targets = resolveTargets( architectureModel, pointcut, aspectElement );
			for (EObject target : targets) {
				List<EStructuralFeature> structFeatures = aspectElement.eClass().getEAllStructuralFeatures();
				for (EStructuralFeature structuralFeature : structFeatures) {
					Object featureContents = aspectElement.eGet(structuralFeature);
					if ( featureContents instanceof Collection ) {
						List<EObject> oldContents = (List<EObject>)target.eGet(structuralFeature);
						List<EObject> featureContentsAsList = (List<EObject>)featureContents;
						for (EObject listElement : featureContentsAsList) {
							EObject cloned = (EObject)CloningExtensions.clone((EObject)listElement);
							oldContents.add(cloned);
						}
					} if (featureContents instanceof EObject) {
						EObject cloned = (EObject)CloningExtensions.clone((EObject)featureContents);
						target.eSet(structuralFeature, cloned);
					} else {
						if ( target.eGet(structuralFeature) == null ) target.eSet(structuralFeature, featureContents);
					}
				}
			}
			ElementRemovalHelper.removeElementFromBase(aspectElement, architectureModel);
		}
	}

	private List<EObject> resolveTargets(EObject architectureModel, EObject pointcut, EObject aspectElement) {
		List<EObject> result = new ArrayList<EObject>();
		loadModel(architectureModel, result);
		return resolveTargets(result, pointcut, aspectElement);
	}

	private void loadModel(EObject model, List<EObject> result) {
		for (Iterator iterator = EcoreUtil.getAllContents(model, true); iterator.hasNext();) {
			EObject o = (EObject) iterator.next();
			result.add( o );
			if ( o.eClass().getName().endsWith("Import")) {
				String importedUri = o.eGet( o.eClass().getEStructuralFeature("uri") ).toString();
				List<EObject> theNextRoots = CachingModelLoad.load(importedUri, model, true);
				for (EObject r : theNextRoots) {
					loadModel(r, result);
				}
			}
		}
	}

	public List<EObject> resolveTargets(Collection<EObject> allElements, EObject pointcut, EObject aspectElement) {
		h = new DynamicEcoreHelper(aspectElement.eClass().getEPackage());
		List<EObject> targets = new ArrayList<EObject>();
		List<EObject> candidates = findInstancesOf(allElements, aspectElement.eClass().getName());
		candidates.remove(aspectElement);
		Collection<EObject> matches = (Collection<EObject>)h.get(pointcut, "matches");
		for (EObject candidate : candidates) {
			String name = h.getName(candidate);
			for (Iterator iterator = matches.iterator(); iterator.hasNext();) {
				EObject match = (EObject) iterator.next();
				boolean keep = false;
				String matchClassName = match.eClass().getName();
				if ( matchClassName.equals("AllMatch") ) {
					keep = true;
				}
				if ( matchClassName.equals("ExactNameMatch") ) {
					String matchName = h.getName(match);
					if ( name.equals(matchName)) keep = true;
				}
				if ( matchClassName.equals("StartsWithNameMatch") ) {
					String matchName = h.getName(match);
					if ( name.startsWith(matchName)) keep = true;
				}
				if ( matchClassName.equals("EndsWithNameMatch") ) {
					String matchName = h.getName(match);
					if ( name.endsWith(matchName)) keep = true;
				}
				if ( matchClassName.equals("TagMatch") ) {
					String expectedTagName = h.getName(match);
					EObject tagClause = h.eget(candidate, "tags");
					if ( tagClause != null ) {
						List<EObject> candidateTags = (List<EObject>)h.get(tagClause, "tags");
						for (EObject candTag : candidateTags) {
							String candTagName = h.getName(candTag);
							if ( candTagName.equals(expectedTagName)) keep = true;
						}
					}
				}
				if ( keep ) targets.add(candidate);
			}
		}
		return targets;
	}

	private List<EObject> findAllPointcuts(EObject architectureModel) {
		return findInstancesOf(architectureModel, "Pointcut");
	}
	
	private List<EObject> findInstancesOf(EObject architectureModel, String className) {
		List<EObject> as = new ArrayList<EObject>();
		for (Iterator iterator = EcoreUtil.getAllContents(architectureModel, true); iterator.hasNext();) {
			EObject object = (EObject) iterator.next();
			if ( object.eClass().getName().equals(className) ) {
				as.add( object );
			}
		}
		return as;
	}	
	
	private List<EObject> findInstancesOf(Collection<EObject> all, String className) {
		List<EObject> as = new ArrayList<EObject>();
		for (Iterator iterator = all.iterator(); iterator.hasNext();) {
			EObject object = (EObject) iterator.next();
			if ( object.eClass().getName().equals(className) ) {
				as.add( object );
			}
		}
		return as;
	}	
	

}
