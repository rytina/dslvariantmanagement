/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder;


import org.eclipse.core.resources.IFile;
import org.openarchitectureware.var.pv.dotvrelbuilder.Config;

public class ElementMapEntry {

  private IFile m_File;
  private int   m_Line = 0;

  public ElementMapEntry(IFile file, int line) {
    m_File = file;
    m_Line = line;
  }

  public IFile getFile() {
    return m_File;
  }

  public int getLine() {
    return m_Line;
  }

  public TextfileTarget getTarget() {
    return new TextfileTarget(getFile(), getLine());
  }
  
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof ElementMapEntry) {
      ElementMapEntry entry = (ElementMapEntry) obj;
      if (((entry.getFile() == null && getFile() == null) || entry.getFile().equals(getFile())) && entry.getLine() == getLine()) {
        return true;
      }
    }
    return super.equals(obj);
  }

  public int hashCode() {
    if (getFile() == null) return getLine();
    String hashString = Config.EXTENSION+".ElementMapEntry";
    return hashString.hashCode() + getFile().hashCode() + getLine();
  }
}
