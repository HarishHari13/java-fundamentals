package File;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();

        
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.add("five");
        System.out.println("ArrayDeque: "+deque);
        deque.addFirst("red");
        deque.addLast("blue");
        System.out.println("ArrayDeque: "+deque);
        String peek=deque.peekFirst();
        System.out.println("peek element: "+peek);
        deque.pollFirst();
        deque.pollLast();
        System.out.println("ArrayDeque: "+deque);
	}

}
