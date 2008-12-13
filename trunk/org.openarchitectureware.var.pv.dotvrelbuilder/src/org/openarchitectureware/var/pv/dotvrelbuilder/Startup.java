/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder;
import org.eclipse.ui.IStartup;


public class Startup implements IStartup {

  public void earlyStartup() {
    Activator.getDefault().register();
  }

}
