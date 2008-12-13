package org.openarchitectureware.var.featureaccess.dummy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



import org.eclipse.mwe.emf.StandaloneSetup;
import org.openarchitectureware.var.featureaccess.FileCreator;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.AbstractWorkflowComponent2;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class DummyConfigurationModelLoader extends AbstractWorkflowComponent2 {

	private String configDataUri;
	private String outputslot;

	public void setUri( String uri ) {
		this.configDataUri = uri;
	}
	
	public void setOutputSlot( String slot ) {
		this.outputslot = slot;
	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
		if ( configDataUri == null ) {
			issues.addError("uri not set");
		}
		if ( outputslot == null ) {
			issues.addError("outputSlot not set");
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		try {
			List<String> data = new ArrayList<String>();
			BufferedReader br = new BufferedReader( new InputStreamReader(FileCreator.getFileContents(configDataUri)) );
			while ( br.ready() ) {
				data.add( br.readLine() );
			}
			br.close();
			ctx.set(outputslot, data);
		} catch ( Exception ex ) {
			issues.addError("error loading config data: "+ex.getMessage());
		}
	}

}
