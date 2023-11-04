package File;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<Integer>numbers=new ArrayDeque<>();
numbers.offer(1);
numbers.offerLast(2);
numbers.offerFirst(3);
System.out.println("Deque:"+numbers);
int firstElement=numbers.peekFirst();
System.out.println("First element:"+firstElement);
int lastElement=numbers.peekLast();
System.out.println("Last element:"+lastElement);
int removedNumber1=numbers.pollFirst();
System.out.println("Removed first element:"+removedNumber1);
int removedNumber2=numbers.pollLast();
System.out.println("Removed last element:"+removedNumber2);
System.out.println("updated deque:"+numbers);
	}

}
