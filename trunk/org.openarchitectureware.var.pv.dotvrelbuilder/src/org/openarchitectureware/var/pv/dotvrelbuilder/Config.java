package org.openarchitectureware.var.pv.dotvrelbuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;



import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.openarchitectureware.var.dotvbuilder.DotVBuilder;
import org.openarchitectureware.var.dotvbuilder.PreferenceConstants;

public class Config {

	public static final String EXTENSION = "v";
	public static final String CACHE_ID = "dotv";
	public static final String ACQUIRE_ID = "v.file";
	public static final String LABEL = ".v-file Targets";
	
	public static List<String> findFeatureDependenciesInLine( IFile file, String line ) {
		List<String> features = new ArrayList<String>();
		List l = null;
		l = findInLineBySymbol( file, line, DotVBuilder.getValue(file, PreferenceConstants.FEATURE_BEGIN) );
		if ( l != null ) features.addAll(l);
		l = findInLineBySymbol( file, line, DotVBuilder.getValue(file, PreferenceConstants.JOINPOINT_SECTION_BEGIN) );
		if ( l != null ) features.addAll(l);
		l = findInLineBySymbol( file, line, DotVBuilder.getValue(file, PreferenceConstants.ADVICE_SECTION_BEGIN) );
		if ( l != null ) features.addAll(split(l));
		return features;
	}

	private static List<String> split(List<String> l) {
		List<String> result = new ArrayList<String>();
		for (String s : l) {
			String[] pair = s.split(":");
			if (pair.length == 2 ) { 
				if ( pair[0].equals("before") || 
				     pair[0].equals("after") ||
					 pair[0].equals("instead") ) result.add(pair[1]);
			}
		}
		return result;
	}

	public static List<String> findInLineBySymbol( IFile file, String line, String symbol ) {
		int fp = line.indexOf(symbol);
		if ( fp >= 0 ) {
			List<String> features = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(line, " \n\t");
			while (st.hasMoreTokens() ) {
				String token = st.nextToken();
				if ( token.trim().equals(symbol) ) {
					if ( st.hasMoreTokens() ) features.add( st.nextToken().trim() );
				}
			}
			return features;
		} else return null;
	}

	public static String getCompleteFileDependency(IFile file) {
		String fn = file.getName();
		int hashPos = fn.indexOf('#'); 
		if ( hashPos >= 0 ) {
			return fn.substring(hashPos+1, fn.indexOf('.', hashPos) );
		}
		return null;
	}
	
	
}
