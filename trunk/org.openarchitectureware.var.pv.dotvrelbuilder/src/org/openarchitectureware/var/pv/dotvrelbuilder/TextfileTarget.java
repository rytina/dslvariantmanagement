/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;

import com.ps.consul.eclipse.core.internal.model.gen.data.Target;
import com.ps.consul.eclipse.core.model.IConsulModel;
import com.ps.xml.ID;


public class TextfileTarget extends Target {

  private IFile m_File;
  private int   m_Line;

  /*
   * 
   */
  public TextfileTarget(IFile file, int line) {
    m_File = file;
    m_Line = line;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRelationTarget#getTarget()
   */
  public String getTarget() {
    return m_File.getFullPath() + " Line: " + m_Line;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRestrictedItem#getID()
   */
  public ID getID() {
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRelationTarget#isLocal()
   */
  public boolean isLocal() {
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRelationTarget#getModelPart()
   */
  public String getModelPart() {
    return m_File.getFullPath().removeLastSegments(1).toString();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRelationTarget#getElementPart()
   */
  public String getElementPart() {
    return m_File.getName() + " Line: " + m_Line;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRestrictedItem#hasRestrictions()
   */
  public boolean hasRestrictions() {
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRestrictedItem#getRestrictionID()
   */
  public ID getRestrictionID() {
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRestrictedItem#hasModel()
   */
  public boolean hasModel() {
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.model.IRestrictedItem#getModel()
   */
  public IConsulModel getModel() {
    return null;
  }

  /**
   * Gets the file of this target
   * 
   * @return The file of this target
   */
  public IFile getFile() {
    return m_File;
  }

  /**
   * Gets the line where the target points to, in its file.
   * 
   * @return The line number
   */
  public int getLine() {
    return m_Line;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object other) {
    if (other instanceof TextfileTarget && other != null) {
      TextfileTarget target = (TextfileTarget) other;
      return getFile().equals(target.getFile()) && getLine() == target.getLine();
    }
    return super.equals(other);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  public int hashCode() {
    return getFile().hashCode() + getLine();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
   */
  public Object getAdapter(Class adapter) {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  public Map getCache () {
    return new HashMap();
  }
}