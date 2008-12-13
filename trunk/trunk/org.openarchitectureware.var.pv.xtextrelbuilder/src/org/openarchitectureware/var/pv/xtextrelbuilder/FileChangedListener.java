/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.xtextrelbuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;


public class FileChangedListener implements IResourceChangeListener {

	public void resourceChanged(IResourceChangeEvent event) {
	  IResourceDelta delta = event.getDelta();
    processResources(delta);
	}

  private void processResources(IResourceDelta delta) {
    IResource resource = delta.getResource();
	  if( resource != null && resource instanceof IFile ) {
	    IFile file = (IFile)resource;
	    processFile(file,delta.getKind());
	  }
	  else {
	    IResourceDelta[] childs = delta.getAffectedChildren();
	    for( int i=0; i<childs.length; ++i ) {
	      processResources(childs[i]);
	    }
	  }
  }

  private void processFile(IFile file, int kind) {
    if( kind == IResourceDelta.ADDED || kind == IResourceDelta.CHANGED ) {
      if( Config.EXTENSION.equals(file.getFileExtension()) == true ) {
        String[] segs = file.getProjectRelativePath().segments();
        if( segs[0].equals("bin") == false ) {
          try {
            System.out.println(file);
            parse(file);
          } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    }
  }

  private void parse(IFile file) throws XmlPullParserException, IOException, CoreException {
	  RelCache.getInstance().clear(file);
	  BufferedReader br = new BufferedReader( new InputStreamReader( file.getContents() ) );
	  int lineNo = 0;
	  while ( br.ready() ) {
		  lineNo++;
		  String line = br.readLine();
		  List<String> featuresInThatLine = Config.findFeatureDependenciesInLine(line);
		  if ( featuresInThatLine != null ) {
			  for (String featureName : featuresInThatLine) {
				  RelCache.getInstance().add(featureName,new ElementMapEntry(file,lineNo));
			  }
		  }
	  }
	  br.close();
  }
  
  /*
  private void somethingElse(IFile file) throws XmlPullParserException, IOException, CoreException {
    XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
    XmlPullParser parser = factory.newPullParser();
    parser.setInput(file.getContents(),null);
    int event = parser.next();
    while( event != XmlPullParser.END_DOCUMENT) {
      if( event == XmlPullParser.START_TAG ) {
        String tag = parser.getName();
        if( tag.equals("feature") == true ) {
          String feature = parser.getAttributeValue("","isSelected");
          int linenr = parser.getLineNumber();
          System.out.println("Feature: " + feature);
          RelCache.getInstance().add(feature,new ElementMapEntry(file,linenr));
        }
      }
      event = parser.next();
    }

  }
  */

}
