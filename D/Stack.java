/** 
 * @author Pong and Will
 * 
 * Class definition for a singly linked list stack of characters.
 * The Stack class consists of DNodes that will be used in the EditManager class.
 * It uses the FIFO method.
 * The class also contains the constructor and common methods for linked lists including size,
 * peek and isEmpty.
 */

public class Stack{ 
	
	/* Note: these fields are public so that they can be directly accessed
	 * from outside this class. */

	public DNode header; 
	public DNode trailer;
	public int size;	
	
	/**
	 * Constructor: creates a head and sets it to null, also sets the starting size of the stack at 0 
	 */
	public Stack(){ //constructor	
		 header = new DNode (null, null, null);		//The header and the trailer sentinel nodes in double linked lists 
		 trailer = new DNode (header, null, null);	//are dummy nodes so they will have no object values in them
		 header.next = trailer;	//Since they are dummy nodes they will originally be set to be linked to each other
		 //trailer.prev = header;	//since they are doubly linked lists we need to link the trailer's prev node back to the header too
		 size= 0;
	}
	
	/**
	 * Returns the size of the stack
	 * @return int
	 */
	public int size(){	
		return size;
	}

	 /**
	    * Checks and returns true if the stack is empty
	    *
	    * @return boolean
	    */
	public boolean isEmpty() { 
		return size==0;	
	}
	
	 /**
	    * Returns the top value of the stack
	    *
	    * @return char
	    */
	public String peek(){
		return header.stringy;
	}
	
	 /**
	    * Pushes the new edit string into the queue
	    *
	    * @param String user edit commands
	    */
	public void push(String s){
		if (size>9){
			trailer.prev=trailer.prev.prev;
			trailer.prev.next=trailer;
			DNode v= new DNode(header, s, header.next);
			header.next = v; 
			header.next.next.prev = v;

		}
		else{
			DNode v= new DNode(header, s, header.next);
			header.next = v; 
			header.next.next.prev = v;
			size++;
		}
		//System.out.println(header.next.stringy);
		
	}
	
	 /**
	    * Pops the nodes of the stack until it is empty
	    *
	    * @return Node
	    */
	public DNode pop(){	
		if (isEmpty()) return null;	
		DNode t = header.next;
		header.next = header.next.next;	
		header.next.prev=header;
		size--;
		return t; 
		
	}

	

}
