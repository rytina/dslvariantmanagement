/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder.acquire;


import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.openarchitectureware.var.pv.dotvrelbuilder.Config;

import com.ps.consul.eclipse.core.model.ModelConstants;
import com.ps.consul.eclipse.core.relinfo.IElementRelationClass;
import com.ps.consul.eclipse.core.relinfo.IElementRelationData;
import com.ps.consul.eclipse.core.relinfo.IElementRelationType;
import com.ps.consul.eclipse.ui.UiPlugin;
import com.ps.consul.eclipse.ui.images.ComposeImageManager;
import com.ps.consul.eclipse.ui.relinfo.IAcquireLabelProvider;

public class TextfileAcquireLabelProvider implements IAcquireLabelProvider {

  private ComposeImageManager CIM      = UiPlugin.getDefault().getImageManager();

  private String[][]          m_Labels = { { Config.EXTENSION, Config.LABEL } };

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.ui.relinfo.IAcquireLabelProvider#getImage(java.lang.Object)
   */
  public Image getImage(Object obj) {
    if (obj instanceof IElementRelationClass){
      return CIM.getImage(mapImageId(((IElementRelationClass)obj).getName()));
    }
    else if( obj instanceof IElementRelationType) {
      return CIM.getImage(ModelConstants.ELEMENT_FLAG_TYPE+"-"+ModelConstants.PART_CLASS+"-CCFMICON");
    }
    else if( obj instanceof IAdaptable ) {
      IWorkbenchAdapter adapter = (IWorkbenchAdapter) ((IAdaptable)obj).getAdapter(IWorkbenchAdapter.class);
      if( adapter != null ) {
        ImageDescriptor descriptor = adapter.getImageDescriptor(obj);
        return CIM.getImage(descriptor);
      }
    }
    else if(obj instanceof String) {
      return CIM.getImage(mapImageId((String)obj));
    }
    return null;
  }

  public String getText(Object obj) {
    if (obj instanceof IElementRelationData) {
      IElementRelationData rel = (IElementRelationData) obj;
      return mapText(rel.getName());
    }
    if (obj instanceof String) {
      return mapText((String) obj);
    }
    return "";
  }

  private String mapText(String name) {
    for (int i = 0; i < m_Labels.length; ++i) {
      if (m_Labels[i][0].equals(name) == true) {
        return m_Labels[i][1];
      }
    }
    return name;
  }

  public String mapImageId (String type) {
    return type + "-RelImage";
  }
}