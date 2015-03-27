import java.util.Scanner;

/**
 * @author Pong and Will
 * 
 * The CapGainApp class is the test class for Part D where the 
 * while loop of the menu for users is run.  The scanner takes user
 * input and runs the CapGain class on commands the user wants.
 */
public class CapGainApp {

	/**
	 * The main method consists of the while loop of 
	 * homescreen with commands for the user to input what they want to do.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Stock Calculator!");
		CapGain cg = new CapGain();
		Scanner p= new Scanner(System.in);	
		int ans = 0;
//		Scanner d= new Scanner(System.in);	
//		String temp2;
		
		do{
			cg.mainMenuPrompt();
			ans = p.nextInt();
			if (ans==1){
				System.out.println("Input number of shares to buy: ");
				int numShares=p.nextInt();
				System.out.println("Input buying price of one share: ");
				double price=p.nextDouble();
				cg.buy(numShares,price);
			}
			else if (ans==2){
				System.out.println("Input number of shares to sell: ");
				int numShares=p.nextInt();
				System.out.println("Input selling price of one share: ");
				double price=p.nextDouble();
				cg.sell(numShares,price);
			}
			else if (ans==3){
				System.out.println("Your total capital gain is " + cg.getTotalCapGain());
			}
			else{
				System.out.println("Goodbye!");
			}
		} while (ans==1 || ans==2 ||ans==3);

	}

}