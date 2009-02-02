package org.openarchitectureware.var.pv.relbuilderadsl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ps.consul.eclipse.relationsbuilder.IIndexer;
import com.ps.consul.eclipse.relationsbuilder.ITargetCache;

public class AdslFileIndexer implements IIndexer {
 
	public static final String FEATURECONSTANT = "feature";
	
	@Override
	public void scan(IFile file, ITargetCache cache) throws CoreException {
		InputStream i = null;
		try {
			i = file.getContents();
			BufferedReader br = new BufferedReader(new InputStreamReader(i));
			int lineCount = 0;
			while (br.ready()) {
				lineCount++;
				String l = br.readLine();
				parseLine(l, lineCount, file, cache);
			}
			br.close();
		} catch ( IOException ex ) {
			Status s = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, ex.getMessage(), ex);
			CoreException coreException = new CoreException(s);
			throw coreException;
		} finally {
			try {
				i.close();
			} catch (IOException ignore) {
			}
		}
	}

	private void parseLine(String l, int lineNo, IFile file, ITargetCache cache) {
		StringTokenizer st = new StringTokenizer(l, " \t;");
		while (st.hasMoreElements()) {
			String token = (String) st.nextToken();
			if ( token.equals(FEATURECONSTANT)) {
				if ( st.hasMoreTokens() ) {
					String featureName = st.nextToken();
					cache.add(featureName, file, lineNo);
				}
			}
		}
		
	}

	
	
}
