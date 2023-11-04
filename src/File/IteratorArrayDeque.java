package File;

import java.util.ArrayDeque;
import java.util.Iterator;

public class IteratorArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String>animals=new ArrayDeque<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("cow");
		animals.add("horse");
		animals.add("hen");
		animals.add("lion");
		animals.add("tiger");
		System.out.println("\nArrayDeque:");
		Iterator<String>iterate=animals.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}
		System.out.println("\nArrayDeque in reverse order:");
		Iterator<String>desIterate=animals.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(",");
		}
	}

}
