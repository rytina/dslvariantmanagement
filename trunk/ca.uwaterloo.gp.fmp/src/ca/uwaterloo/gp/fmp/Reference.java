/**************************************************************************************
 * Copyright (c) 2005, 2006 Generative Software Development Lab, University of Waterloo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   1. Generative Software Development Lab, University of Waterloo,
 *      http://gp.uwaterloo.ca  - initial API and implementation
 **************************************************************************************/
package ca.uwaterloo.gp.fmp;


/**
 * @author Chang Hwan Peter Kim <chpkim@swen.uwaterloo.ca>, 
 *         Michal Antkiewicz <mantkiew@swen.uwaterloo.ca>
 * @model
 */
public interface Reference extends Clonable {
	/**
	 * @model opposite="references"
	 */
	Feature getFeature();
	/**
	 * Sets the value of the '{@link ca.uwaterloo.gp.fmp.Reference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

}
