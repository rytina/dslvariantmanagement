/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.xtextrelbuilder.acquire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import org.eclipse.core.resources.IFile;
import org.openarchitectureware.var.pv.xtextrelbuilder.TextfileTarget;

import com.ps.consul.eclipse.ui.viewer.IToolTipLabelProvider;

public class FileRelationToolTipLabelProvider implements IToolTipLabelProvider {

  private static int DELTA = 5;
  
  public String getText(Object obj) {
    String result = "File Relation Tool Tip";
    if( obj instanceof TextfileTarget ) {
      TextfileTarget ftarget = (TextfileTarget) obj;
      try {
        result  = ftarget.getFile().getLocation().toOSString() + "\n\n";
        result += readLines(ftarget.getFile(),Math.max(ftarget.getLine()-DELTA,0),
            ftarget.getLine()+DELTA);
      } catch (Exception e) { /* empty tip on failure */ }
    }
    return result;
  }

  private String readLines (IFile file, int start,int end) throws IOException {
    StringBuffer res = new StringBuffer();
    FileReader fr = new FileReader(file.getLocation().toOSString());
    BufferedReader br = new BufferedReader(fr);
    String line = br.readLine();
    for( int i=1; i<=end && line != null; ++i ) {
      if( i>= start && i<=end ) {
        res.append(line);
        res.append("\n");
      }
      line = br.readLine();
    }
    return res.toString();
  }
  
}
