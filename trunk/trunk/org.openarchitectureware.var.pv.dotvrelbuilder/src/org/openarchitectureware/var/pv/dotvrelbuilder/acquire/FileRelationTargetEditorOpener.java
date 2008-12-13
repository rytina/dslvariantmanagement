/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder.acquire;


import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;
import org.openarchitectureware.var.pv.dotvrelbuilder.TextfileTarget;

import com.ps.consul.eclipse.ui.relinfo.ITargetEditorOpener;

public class FileRelationTargetEditorOpener implements ITargetEditorOpener {

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.ui.relinfo.ITargetEditorOpener#openEditor(java.lang.Object)
   */
  public void openEditor(Object target) {
    if (target == null || !(target instanceof TextfileTarget)) return;
    TextfileTarget fileTarget = (TextfileTarget) target;
    IFile file = fileTarget.getFile();
    if (file == null) return;

    IWorkbenchPage page = getActivePage();
    IEditorDescriptor editorDescriptor = getEditorDescriptor(file);
    FileEditorInput input = new FileEditorInput(file);

    if (page != null && !page.getActiveEditor().getEditorInput().equals(input) && input != null && editorDescriptor != null) {
      try {
        IEditorPart part = page.openEditor(input, editorDescriptor.getId());
        if (part instanceof AbstractDecoratedTextEditor) {
          AbstractDecoratedTextEditor te = (AbstractDecoratedTextEditor) part;
          IDocument document = te.getDocumentProvider().getDocument(te.getEditorInput());
          try {
            int start = document.getLineOffset(fileTarget.getLine() - 1);
            te.selectAndReveal(start, 0);
          }
          catch (BadLocationException x) {
            x.printStackTrace();
          }
        }
      }
      catch (PartInitException e) {
        e.printStackTrace();
      }
    }

  }

  private IWorkbenchPage getActivePage() {
    IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    if (workbenchWindow == null) return null;
    return workbenchWindow.getActivePage();
  }

  private IEditorDescriptor getEditorDescriptor(IFile file) {
    IEditorRegistry editorRegistry = PlatformUI.getWorkbench().getEditorRegistry();
    if (editorRegistry == null) return null;

    IEditorDescriptor editorDescriptor = editorRegistry.getDefaultEditor("." + file.getFileExtension());
    if (editorDescriptor == null) editorDescriptor = editorRegistry.findEditor(EditorsUI.DEFAULT_TEXT_EDITOR_ID);
    return editorDescriptor;
  }
}