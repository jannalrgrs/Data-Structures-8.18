package DataStructures;
import java.util.Stack;

public class myApp {

	public static void main(String[] args) {
		// create a stack
		Stack <Integer> s = new Stack<Integer>();
		
		s.push(5); //add items
		s.push(15);
		s.push(1);
		
		
		System.out.println(s.pop()); //first element at the top will print out (1)
		//Enqueue and Dequeue enter and delist the items in a queue
	}

}
