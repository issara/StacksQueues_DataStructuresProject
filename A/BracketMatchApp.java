import java.util.Scanner;

/**
 * 
 */

/**
 * @author Pong and Will
 * 
 * The class consists of the code that will be tested to see if the BracketMatcher works.
 */
public class BracketMatchApp {

	/**
	 * The main method consists of the the main prompt for the user to choose whether
	 * to check brackets or quit the program.  If the user chooses to "go" the user can 
	 * check brackets to see whether they will match or not.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner p= new Scanner(System.in);
		Scanner t= new Scanner(System.in);
		System.out.println("If you'd like to quit, type \"quit\"\nOtherwise type \"go\"");
		String temp = t.nextLine();
		while (!temp.equals("quit") && !temp.equals("Quit")){
			if(temp.equals("go") || temp.equals("Go")){
				System.out.println("Enter the string of brackets you would like to check: ");
				String stringy = p.nextLine();
				BracketMatcher matchy = new BracketMatcher();
				System.out.println(matchy.checkBrackets(stringy) + "\n");
			}
			else{
				System.out.println("Not a valid input, please follow the instructions below");
			}
			System.out.println("If you'd like to quit, type \"quit\"\nOtherwise type \"go\"");
			temp = t.nextLine();
		}
		
		System.out.println("You quit");	
		
	}

}
