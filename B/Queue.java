/**
 * @author Pong and Will
 *
 *Class definition for an array-based queue of doubles
 *
 *The fields include the index of the front and rear indices, along with max entries, array and size of array.
 *The methods include the enqueue and dequeue method along with the size checker.  Uses the FIFO method.
 */
public class Queue {
	private int f;
	private int r;
	private int max;
	private double[] numQ;
	private int size;
	
	/** 
	 * Constructor: indexes the rear and front index to array 0, along with setting max entries of numQ queue to 100
	 */
	public Queue(){
		f=0;
		r=0;
		numQ=new double[100];
		max=numQ.length;
	}
	
	/** 
	 * The enqueue method takes in a double and adds it to the end of the queue.  
	 * It will move the rear to the next index.
	 * 
	 * @param val
	 */
	public void enqueue(double val){
		if(size==max-1){
			System.out.print("Array full");
		}
		else{
			numQ[r]=val;
			r=(r+1)%max;
		}
	}
	
	/** 
	 * The dequeue method takes out the double at the front of the queue.  
	 * It will move the front index to the next array index.
	 * 
	 * @return double
	 */
	public double dequeue(){
		double t=numQ[f];
		f=(f+1)%max;
		return t;
	}
	
	/**
	 * Returns the size of the queue
	 * @return int
	 */
	public int size(){	//as usual we will have the size method
		return size;
	}
}
