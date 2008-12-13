/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.xtextrelbuilder.acquire;


import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.openarchitectureware.var.pv.xtextrelbuilder.TextfileTarget;

import com.ps.consul.eclipse.ui.UiPlugin;
import com.ps.consul.eclipse.ui.images.ComposeImageManager;
import com.ps.consul.eclipse.ui.relinfo.IRelationTargetLabelProvider;

public class FileRelationTargetLabelProvider implements IRelationTargetLabelProvider {

  private ComposeImageManager CIM = UiPlugin.getDefault().getImageManager();

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.ui.relinfo.IAcquireLabelProvider#getImage(java.lang.Object)
   */
  public Image getImage(Object obj) {
    if (obj instanceof TextfileTarget) {
      TextfileTarget target = (TextfileTarget) obj;
      IWorkbenchAdapter adapter = (IWorkbenchAdapter) ((IAdaptable) target.getFile()).getAdapter(IWorkbenchAdapter.class);
      if (adapter != null) {
        ImageDescriptor descriptor = adapter.getImageDescriptor(target.getFile());
        return CIM.getImage(descriptor);
      }
    }
    return null;
  }

  public String getText(Object obj) {
    if (obj instanceof TextfileTarget) {
      TextfileTarget target = (TextfileTarget) obj;
      return target.getFile().getName() + " - Line: " + target.getLine();
    }
    return "";
  }
}