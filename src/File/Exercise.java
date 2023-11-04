package File;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Using Stack class
		        Stack<Integer> stack = new Stack<>();
		        stack.push(24);  
		        stack.push(5);
		        stack.push(11);
		        stack.push(36);
		        stack.push(65);
		        System.out.println("Stack : " + stack);

		        int removedElement=stack.pop();
		        System.out.println("Removed element: " + removedElement);
		        System.out.println("Stack elements after removal: " + stack);
		        
		        Iterator<Integer> iterator = stack.iterator();
		        while (iterator.hasNext()) {
		            Integer element = iterator.next();
		            System.out.print(iterator.next()+"");
		            }
		        

	}
}