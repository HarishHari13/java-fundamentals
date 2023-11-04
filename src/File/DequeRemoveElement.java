package File;

import java.util.ArrayDeque;

public class DequeRemoveElement {

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
System.out.println("ArrayDeque:"+animals);
String element=animals.remove();
System.out.println("Removed Element:"+element);
System.out.println("New ArrayDeque:"+animals);
animals.remove("cow");
System.out.println("New ArrayDeque:"+animals);
String firstElement=animals.removeFirst();
System.out.println("Removed First element:"+firstElement);
String lastElement=animals.removeLast();
System.out.println("Removed last element:"+lastElement);
System.out.println("New ArrayDeque:"+animals);
animals.clear();
System.out.println("New ArrayDeque:"+animals);
	}

}
