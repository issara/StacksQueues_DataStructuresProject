/**
 * 
 */

/**
 * @author Pong and Will
 * 
 * The BracketMatcher class consists of methods that interact with the stack of brackets.  
 * There are methods that check to see if the brackets are opening or closing brackets,
 * along with a method to check whether the bracket type corresponds.  Finally the checkBrackets
 * method makes sure that the stack is empty or not so it can tell the user if and where the error is.
 */
public class BracketMatcher {
	private final char[] OBRACKETS = {'(','[','{','<'};
	private final char[] CBRACKETS = {')',']','}','>'};
	private int checkersize = 0;
	
	
	/**
	 * This method checks to see if the character is an opening bracket.
	 * 
	 * @param c
	 * @return boolean
	 */
	public boolean isOpeningBracket(char c){
		for (int i=0; i<OBRACKETS.length-1; i++){
			if(c==OBRACKETS[i]){
				return true;
			}
		}
		return false;
	}

	/**
	 * This method checks to see if the character is an closing bracket.
	 * 
	 * @param c
	 * @return boolean
	 */
	public boolean isClosingBracket(char c){
		for (int i=0; i<CBRACKETS.length-1; i++){
			if(c==CBRACKETS[i]){
				return true;
			}
		}
		return false;
	}
	/**
	 * This method checks to see whether the opening and closing bracket types match.
	 * 
	 * @param open
	 * @param close
	 * @return boolean
	 */
	public boolean corresponds(char open, char close){
		for (int i=0; i<OBRACKETS.length-1; i++){
			if(open==OBRACKETS[i]&&close==CBRACKETS[i]){
				return true;
			}
		}
		return false;
	}
	//If there is an extra closing bracket the code will not check for that, but can do that in a stack? 
	//Or do we need 2 stacks?
	
	public int checkersize(){	
		return checkersize;
	}
	
	/**
	 * This method checks to see whether the brackets are in order and whether they are out of place.
	 * If there is inconsistency int he brackets it will return the position of the error.
	 * 
	 * @param s
	 * @return String
	 */
	public String checkBrackets(String s){
		Stack stacky = new Stack();
		for(int i=0; i<s.length(); i++){
				if(isOpeningBracket(s.charAt(i))){
					stacky.push(s.charAt(i));
					checkersize++;
				}
				else if(isClosingBracket(s.charAt(i))){
					if(i==0){checkersize--;}
					if(checkersize<0){
						return ("Error " + s.charAt(i) + " at position 0 " + "\nunmatched (indexed starting at 0)");
					}
					else if(corresponds(stacky.peek(),s.charAt(i))){
						stacky.pop();
					}
					else{
						return ("Error " + s.charAt(i) + " at position " + i + "\nunmatched (indexed starting at 0)");
					}
				}
				else{
					System.out.println("There are extra closing bracket(s)");
				}
				
		}
		if(stacky.size()==0){
			return "matched";
		}
		else{
			return "unmatched";
		}
	}

}
