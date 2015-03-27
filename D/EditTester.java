import java.util.Scanner;

/**
 * @author Pong and Will
 * 
 * The EditTesteter class is the test class for Part D where the 
 * while loop of the menu for users is run.  The scanner takes user
 * input and runs the EditManager class on commands the user wants.
 */
public class EditTester {

	/**
	 * The main method consists of the while loop of 
	 * homescreen with commands for the user to input what they want to do.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Type edit command");
		
		EditManager em = new EditManager();
		Scanner p= new Scanner(System.in);		
		String temp = p.nextLine();
		Scanner d= new Scanner(System.in);	
		String temp2;
		
		while (!temp.equals("quit") && !temp.equals("Quit")){
			if(temp.equals("undo")||temp.equals("Undo")){
				System.out.println("Undone " + em.undo());
				System.out.println("Type edit command");
			}
			else if(temp.equals("redo")||temp.equals("Redo")){
				System.out.println("Redo " + em.redo());
				System.out.println("Type edit command");
			}
			else{
				em.edit(temp);
				System.out.println("Type edit command");
				
			}
			temp2 = d.nextLine();
			temp = temp2;
		}
		
		System.out.println("You quit");	
		

	}

}
