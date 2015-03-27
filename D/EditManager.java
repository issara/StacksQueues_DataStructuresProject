/**
 * @author Pong and Will
 *
 *The EditManager class is the main class of Part D which has the push, undo and redo methods.
 */
public class EditManager{
	
	 /**
	    * Stacks for the undo and redo methods
	    */
	private Stack undoStack = new Stack();
	private Stack redoStack = new Stack();
	
	 /**
	    * Takes in the user edit command input and pushes it into a Stack
	    * Along with emptying the redo stack 
	    *
	    * @param s
	    * @return String command user input in
	    */
	public String edit(String s){
		undoStack.push(s);
		for (int i=0; i< redoStack.size();i++){
			redoStack.pop();
		}
		return s;
	}
	
	 /**
	    * Undoes the latest edit command the user inputs and goes 
	    * back to up to 10 undos.  
	    *
	    * @return String undone edit command
	    */
	public String undo(){	
		if (undoStack.isEmpty()){
			System.out.println("no more edit entry to undo");
			return null;	
		}
		DNode t = undoStack.pop();
		redoStack.push(t.stringy);
		return t.stringy; 
	}
	
	 /**
	    * Redoes the latest undo command the user inputs and goes 
	    * up to 10 redos as that is the limit for undos.
	    *
	    * @return String redone undo command
	    */
	public String redo(){
		if (redoStack.isEmpty()){
			System.out.println("no more redos available");
			return null;	
		}
		DNode t=redoStack.pop();
		return t.stringy;
	}

	
}