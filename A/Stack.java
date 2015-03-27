/** 
 * @author Pong and Will
 * 
 * Class definition for a singly linked list stack of characters.
 * The Stack class consists of Nodes that will be used in the BracketMatcher class.
 * It uses the LIFO method.
 */

public class Stack{ 
	
	/* Note: these fields are public so that they can be directly accessed
	 * from outside this class. */

	public Node head; 
	public int size;	
	
	/**
	 * Constructor: creates a head and sets it to null, also sets the starting size of the stack at 0 
	 */
	public Stack(){ //constructor	
		 head= null;
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
	public char peek(){
		return head.ch;
	}
	
	 /**
	    * Pushes the character into the stack if it is a bracket
	    *
	    * @param c
	    */
	public void push(char c){
		Node v= new Node(c, head);
		head = v; 
		size++;
	}
	
	 /**
	    * Pops the character if the brackets corresponds and returns the popped character
	    *
	    * @return Node
	    */
	public Node pop(){	
		if (isEmpty()) return null;	
		Node t = head;
		head = head.next;	
		size--;
		return t; 
		
	}

	

}
