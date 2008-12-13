package org.openarchitectureware.var.pv.xtextrelbuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Config {

	public static final String EXTENSION = "adsl";
	public static final String CACHE_ID = "adslfiles";
	public static final String ACQUIRE_ID = "adsl.file";
	public static final String LABEL = "ADSL Targets";
	
	public static List<String> findFeatureDependenciesInLine( String line ) {
		int fp = line.indexOf("feature");
		if ( fp >= 0 ) {
			List<String> features = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(line, " \n\t");
			while (st.hasMoreTokens() ) {
				String token = st.nextToken();
				if ( token.trim().equals("feature") ) {
					if ( st.hasMoreTokens() ) features.add( st.nextToken().trim() );
				}
			}
			return features;
		} else return null;
	}
	
	
}
