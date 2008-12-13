/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.xtextrelbuilder;


import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.openarchitectureware.var.pv.xtextrelbuilder.acquire.AcquireAdapterFactory;
import org.openarchitectureware.var.pv.xtextrelbuilder.acquire.FileRelationTargetEditorOpener;
import org.openarchitectureware.var.pv.xtextrelbuilder.acquire.TextfileAcquire;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.openarchitectureware.var.pv.xtextrelbuilder";

  private AcquireAdapterFactory         m_AdapterFactory = new AcquireAdapterFactory();

	// The shared instance
	private static Activator plugin;
	private FileChangedListener m_Listener = new FileChangedListener();
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
    Platform.getAdapterManager().registerAdapters(m_AdapterFactory, TextfileAcquire.class);
    Platform.getAdapterManager().registerAdapters(m_AdapterFactory, TextfileTarget.class);
	}

  public void register() {
    ResourcesPlugin.getWorkspace().addResourceChangeListener(m_Listener);
  }

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
    Platform.getAdapterManager().unregisterAdapters(m_AdapterFactory);
	  RelCache.getInstance().store();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(m_Listener);
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
