import java.util.Scanner;

/**
 * @author Pong and Will
 *
 */
public class CalcTest {

	/**
	 * This is a test method for the Calc class and the while loop for the homescreen of the
	 * program if placed in this main method, along with the scanner.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner p= new Scanner(System.in);
		Scanner t= new Scanner(System.in);
		System.out.println("If you'd like to quit, type \"quit\"\nOtherwise type \"go\"");
		String temp = t.nextLine();
		while (!temp.equals("quit") && !temp.equals("Quit")){
			System.out.println("Enter the postfix calculation you'd like to perform,\nwith each entity separated by a space: ");
			String s = p.nextLine();
			String trial = (s);
			Calc lets = new Calc();
			String[] n = lets.splitter(trial);
			System.out.println(lets.checkCalc(n));
			System.out.println("If you'd like to quit, type \"quit\"\nOtherwise type \"go\"");
			temp = t.nextLine();
		}
		
		System.out.println("You quit");	
		
	}

}

//Come up with all postfix situations we tried in class

 
