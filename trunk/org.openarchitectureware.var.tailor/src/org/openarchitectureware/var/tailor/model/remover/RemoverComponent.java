package org.openarchitectureware.var.tailor.model.remover;


import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.util.stdlib.DynamicEcoreHelper;
import org.openarchitectureware.var.featureaccess.ConfigurationModelWrapper;
import org.openarchitectureware.var.featureaccess.FeatureDependentComponent;
import org.openarchitectureware.var.featureaccess.FeatureModelWrapper;
import org.openarchitectureware.var.featureaccess.ext.FeatureSupport;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.WorkflowInterruptedException;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class RemoverComponent extends FeatureDependentComponent {
	
	private String architectureModelSlot;
	

	public void setArchitectureModelSlot( String slotname ) {
		architectureModelSlot = slotname;
	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
		super.checkConfigurationInternal(issues);
		if ( architectureModelSlot == null ) issues.addError("architectureModelSlot not specified");
	}
	
	@Override
	public String getLogMessage() {
		return "removing variable elements from "+architectureModelSlot+" using feature model "+configurationModelSlot;
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		EObject architectureModel = (EObject)ctx.get(architectureModelSlot);
		if ( architectureModel == null )  {
			issues.addError("no contents found in slot "+architectureModelSlot);
			return;
		}
		
		ConfigurationModelWrapper configurationWrapper = getConfigurationModel(ctx, issues);
		if ( configurationWrapper == null ) throw new WorkflowInterruptedException("no configurationWrapper defined!");
		FeatureSupport.setConfigurationModelWrapper(configurationWrapper);
		DynamicEcoreHelper h = new DynamicEcoreHelper(architectureModel.eClass().getEPackage());
		FeatureSupport.setDynamicEcoreHelper(h);

		Remover r = new Remover();
		r.remove( architectureModel, configurationWrapper );
	}
	

}
