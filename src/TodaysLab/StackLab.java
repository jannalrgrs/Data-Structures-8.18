package TodaysLab;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackLab {

	public static void main(String[] args) {
	Scanner scan1 = new Scanner(System.in);
	Stack <Integer> s = new Stack <Integer>();
	String input = "";
	int result = 0;
	
	
	System.out.println("Enter input: ");
	input = scan1.nextLine();
	
	for (int i = 0; i<input.length(); i++) {
		char in = input.charAt(i);
		int a = Character.getNumericValue(in);
	//System.out.println(in);

			if (Character.isDigit(input.charAt(i))) {
				s.push(a);
                //System.out.println(input.charAt(i) + " is a number");
			
                //x = s.push(x);  
                //System.out.println(s.pop());
			
				//System.out.print(s.pop());
		}
			else if (!(Character.isDigit(input.charAt(i)))) {
				int x = s.pop();
				int y = s.pop();
				
				switch (in) {
				
				case '+': //addition
					result = getAddition(s, result, in, x, y);
					break;
					
				case '-':
					result = getSubtraction(s, x, y);
					break;
					
				case '/': 
					result = getDivision(s, x, y);
					break;
				
				case '*':
					result = getMultiplication(s, x, y);
					break;
					
				}
				
				System.out.println(result);
				//s.push(result);
				
			}
		
		}

}

	private static int getMultiplication(Stack<Integer> s, int x, int y) {
		int result;
		result = x*y;
		//System.out.println(result);
		s.push(result);
		return result;
	}

	private static int getDivision(Stack<Integer> s, int x, int y) {
		int result;
		result = y/x;
		//System.out.println(result);
		s.push(result);
		return result;
	}

	private static int getSubtraction(Stack<Integer> s, int x, int y) {
		int result;
		result = y-x;
		//System.out.println(result);
		s.push(result);
		return result;
	}

	private static int getAddition(Stack<Integer> s, int result, char in, int x, int y) {
		if(in == '+')
		
		result =  x+y;	
		//System.out.println(result);
		s.push(result);
		return result;
	}
}