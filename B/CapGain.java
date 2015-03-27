/**
 * @author Pong and Will
 *
 *The CapGain class is the main class of Part B which has the mainMenuPrompt, buy, sell and getTotalCapGain methods.
 *The program is able to calculate price and quantity of shares bought and sold along with 
 *calculating the total capital gain for the user.
 */
public class CapGain {
	
	 /**
	    * the TotalCapitalGain variable and the sharesHeld queue are to two main instances in this class.
	    */
	private double totCapGain;
	Queue sharesHeld = new Queue();
	
	 /**
	    * Sets up the mainMenuPrompt for the user
	    */
	public void mainMenuPrompt(){
		System.out.println("Please input number of desired menu option ");
		System.out.println("1. Buy\n2. Sell\n3. Total Capital Gain So Far\n4. Quit");
	}
	
	 /**
	    * Add the number of shares bought and the price of the shares into the queue
	    *
	    * @param numShares
	    * @param price
	    */
	public void buy(int numShares, double price){
		for(int i=0; i<=numShares; i++){
			sharesHeld.enqueue(price);
			
		}
	}
	
	 /**
	    * Take out number of shares sold and the price of the shares out of the queue
	    *
	    * @param numShares
	    * @param price
	    */
	public void sell(int numShares, double price){
		for(int i=0; i<numShares; i++){
			double t = sharesHeld.dequeue();
			totCapGain = totCapGain + (price - t);
		}
	}
	
	 /**
	    * Calculate the total capital gain by returning the value that has been used as
	    * a counter type variable throughout the class.
	    *
	    * @return totCapGain
	    */
	public double getTotalCapGain(){
		return totCapGain;
	}
}
