/*
* generated by Xtext
*/
package org.eclipse.xtext.demo.archdsl.language.outline;

import org.eclipse.xtext.demo.archdsl.language.adsl.File;
import org.eclipse.xtext.ui.common.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.common.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

/**
 * customization of the default outline structure
 * 
 */
public class AdslTransformer extends AbstractDeclarativeSemanticModelTransformer {
  
  public ContentOutlineNode createNode(
    File semanticNode, ContentOutlineNode parentNode) {
    return super.HIDDEN_NODE; 
  }
	
}
