/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder.acquire;


import org.eclipse.core.runtime.IAdapterFactory;
import org.openarchitectureware.var.pv.dotvrelbuilder.TextfileTarget;

import com.ps.consul.eclipse.core.model.IRelationTarget;
import com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire;
import com.ps.consul.eclipse.ui.relinfo.IAcquireLabelProvider;
import com.ps.consul.eclipse.ui.relinfo.IRelationTargetLabelProvider;
import com.ps.consul.eclipse.ui.relinfo.ITargetEditorOpener;
import com.ps.consul.eclipse.ui.viewer.IToolTipLabelProvider;

/**
 * @author dave
 */
public class AcquireAdapterFactory implements IAdapterFactory {

  private static FileRelationToolTipLabelProvider m_ToolTipProv = new FileRelationToolTipLabelProvider();
  
  private static Class[] ADAPTERS = new Class[] { 
    IAcquireLabelProvider.class, 
    ITargetEditorOpener.class, 
    IRelationTargetLabelProvider.class,
    IToolTipLabelProvider.class
  };

  /**
   * 
   */
  public AcquireAdapterFactory() {
    super();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
   *      java.lang.Class)
   */
  public Object getAdapter(Object adaptableObject, Class adapterType) {
    Object result = null;
    if (adaptableObject instanceof IElementRelationAcquire && adapterType == IAcquireLabelProvider.class) {
      result = getLabelProvider(adaptableObject);
    }
    if (adaptableObject instanceof IRelationTarget) {
      if( adapterType == ITargetEditorOpener.class) {
        result = getTargetEditorOpener(adaptableObject);
      }
      else if( adapterType == IRelationTargetLabelProvider.class) {
        result = getRelationTargetLabelProvider(adaptableObject);
      }
      else if( adapterType == IToolTipLabelProvider.class) {
        result = getRelationTargetToolTipLabelProvider(adaptableObject);
      }
    }
    return result;
  }

  private Object getRelationTargetToolTipLabelProvider(Object target) {
    if (target instanceof TextfileTarget) {
      return m_ToolTipProv;
    }
    return null;
  }

  /**
   * @param adaptableObject
   * @return
   */
  private Object getTargetEditorOpener(Object target) {
    if (target instanceof TextfileTarget) {
      return new FileRelationTargetEditorOpener();
    }
    return null;
  }

  /**
   * @param adaptableObject
   * @return
   */
  private Object getLabelProvider(Object acquire) {
    if (acquire instanceof TextfileAcquire) {
      return new TextfileAcquireLabelProvider();
    }
    return null;
  }

  private Object getRelationTargetLabelProvider(Object target) {
    if (target instanceof TextfileTarget) {
      return new FileRelationTargetLabelProvider();
    }
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
   */
  public Class[] getAdapterList() {
    return ADAPTERS;
  }

}
