/**
 * @author Pong and Will
 *
 *The Calc class is the main class of Part C which has the addIt, subtract, multiply, divide, splitter
 *and checkCalc methods.
 *
 *The class also contains the constructor and common methods for linked lists including size,
 *peek and isEmpty.
 */
public class Calc {
	
	Stack calcStack = new Stack();
	
	 /**
	    * Runs the addition operand by popping the 2 top numbers out of the stack
	    * and by pushing the final total after using the operand right into the stack
	    */
	public void addIt(){
		double a = Double.parseDouble(calcStack.pop());
		//System.out.println("add" + a);
		double b = Double.parseDouble(calcStack.pop());
		//System.out.println("add" + b);
		double tot = a + b;
		//System.out.println("addsum" + tot);
		calcStack.push(String.valueOf(tot));
	}
	

	 /**
	    * Runs the subtraction operand by popping the 2 top numbers out of the stack
	    * and by pushing the final total after using the operand right into the stack
	    */
	public void subtract(){
		double a= Double.parseDouble(calcStack.pop());
		//System.out.println("subtract" + a);
		double b= Double.parseDouble(calcStack.pop());
		//System.out.println("subtract" + b);
		double tot = a - b;
		//System.out.println("subsum" + tot);
		calcStack.push(String.valueOf(tot));
	}
	

	 /**
	    * Runs the multiplication operand by popping the 2 top numbers out of the stack
	    * and by pushing the final total after using the operand right into the stack
	    */
	public void multiply(){
		double a = Double.parseDouble(calcStack.pop());
		//System.out.println("mult" + a);
		double b = Double.parseDouble(calcStack.pop());
		//System.out.println("mult" + b);
		double tot = a * b;
		//System.out.println("multsum" + tot);
		calcStack.push(String.valueOf(tot));
	}
	

	 /**
	    * Runs the division operand by popping the 2 top numbers out of the stack
	    * and by pushing the final total after using the operand right into the stack
	    */
	public void divide(){
		double a = Double.parseDouble(calcStack.pop());
		//System.out.println("div" + a);
		double b = Double.parseDouble(calcStack.pop());
		//System.out.println("div" + b);
		double tot = b / a;	//had to switch b and a because when dividing in post fix the first number should be the divisor
		//System.out.println("divsum" + tot);
		calcStack.push(String.valueOf(tot));
	}
	

	 /**
	    * Splits the string by spaces and then puts those strings in an array in order to be run by the operands 
	    * 
	    * @param s
	    * @return String[]
	    */
	public String[] splitter(String s){
		String[] ret = s.split(" ", s.length());
//		for(int i = 0; i<ret.length;i++){
//			System.out.println(ret[i]);
//		}
		return ret;
	}
	
	 /**
	    * Goes through the array from the splitter method and figures out the different methods the program will have to run.
	    * 
	    * @param s
	    * @return String
	    */
	public String checkCalc(String[] s){
		for (int i=0; i<s.length; i++){
			//System.out.println("around and around");
//			if(Character.isDigit(s.charAt(i))){
//				calcStack.push(s.charAt(i));
//			}
			if (s[i].equals("+")){
				//System.out.println("add");
				addIt();
			}
			else if (s[i].equals("-")){
				//System.out.println("subtrac");
				subtract();
			}
			else if (s[i].equals("*")){
				//System.out.println("multi");
				multiply();
			}
			else if (s[i].equals("/")){
				//System.out.println("divid");
				divide();
			}
			else{
				//System.out.println("pushing" + s[i]);
				calcStack.push(s[i]);
			}
		}
		//System.out.println("hey! look!");
		//System.out.println(calcStack.peek());
		return calcStack.pop();	
	}	
	
}



