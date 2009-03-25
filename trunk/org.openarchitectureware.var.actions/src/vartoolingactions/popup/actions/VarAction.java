package vartoolingactions.popup.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.AbstractOperation;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;

import vartoolingactions.helper.Constants;

public class VarAction implements IObjectActionDelegate {
	
	public class VarActionOperation extends AbstractOperation {
		Shell shell;
		
		public VarActionOperation(Shell shell) {
			super("VarTooling Operation");
			this.shell = shell;
		}

		@Override
		public IStatus execute(IProgressMonitor monitor, IAdaptable info)
				throws ExecutionException {
			ISelection sel= part.getSite().getSelectionProvider().getSelection();
			
			if (sel instanceof ITreeSelection){
				ICompilationUnit compUnit = (ICompilationUnit) ((ITreeSelection) sel).getFirstElement();
				if (compUnit.getResource() instanceof IFile){
					IFile file = (IFile) compUnit.getResource(); 

					//move the file to the var-folder
					moveFile(file, compUnit);
				} 
				else {
					MessageDialog.openInformation(
							shell,
							"PackageExplorerSelectionAction Plug-in",
							"comp unit cannot be mapped: " + sel.toString() );
					
				}
			} else{
				MessageDialog.openInformation(
				shell,
				"PackageExplorerSelectionAction Plug-in",
				"cannot map selected element: " + sel.toString() );
			}
			return null;
		}

		@Override
		public IStatus redo(IProgressMonitor monitor, IAdaptable info)
				throws ExecutionException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IStatus undo(IProgressMonitor monitor, IAdaptable info)
				throws ExecutionException {
			

			return null;
		}

	}

	private Shell shell;
	private IWorkbenchPart part;
	private IWorkbench workbench;
	
	/**
	 * Constructor for Action1.
	 */
	public VarAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		part = targetPart;
		workbench = part.getSite().getWorkbenchWindow().getWorkbench();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {		
		IUndoableOperation operation = new VarActionOperation(shell); 
		
		IWorkbench workbench = part.getSite().getWorkbenchWindow().getWorkbench();
		IOperationHistory operationHistory = workbench.getOperationSupport().getOperationHistory();

		IUndoContext undoContext = workbench.getOperationSupport().getUndoContext();
		operation.addContext(undoContext);
		try {
			operationHistory.execute(operation, null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void moveFile(IFile file, ICompilationUnit compUnit) {
	
		
		String pkgName =  compUnit.getParent().getElementName();
		IFolder varFolder = file.getProject().getFolder( Constants.VAR_FOLDER );
		IPackageFragmentRoot fragRoot = compUnit.getJavaProject().getPackageFragmentRoot( varFolder );
		try {
			compUnit.getJavaProject().getResolvedClasspath(true);
		} catch (JavaModelException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			fragRoot.open(null);
			fragRoot.createPackageFragment(pkgName, false, null);
		} catch (JavaModelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		IPath pkgPath = varFolder.getFullPath().append( pkgName.replaceAll("\\.", "/") + "/" );

		
		IPath targetPath = pkgPath.append( file.getName() + ".v" );
		
		try {
			file.move(targetPath, false, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
