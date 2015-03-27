/** 
 * Class definition for a Node of a singly linked list of characters
 */
public class Node {

	/* Note: these fields are public so that they can be directly accessed
	 * from outside this class.  For example, if v is a Node object, 
	 * then v.entry and v.next can be used to access these fields. */
	 
	public char ch;			//
	public Node next;		//refers to the next node in the list
	
	/**
	 * Constructor: creates a node with the given entry and next Node. 
	 * @param c
	 * @param n
	 */
	public Node(char c, Node n) { //Constructs the node that will be used for singly linked lists
		ch = c; //in each node there will consist of a character 
		next = n;	//and it will also consist of a pointer node
	}
	
}