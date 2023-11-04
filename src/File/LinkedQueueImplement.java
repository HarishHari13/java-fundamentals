package File;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Node{
	protected int data;
	protected Node link;

public Node() {
	link=null;
	data=0;
}
public Node(int d,Node n) {
	data=d;
	link=n;
}
public void setLink(Node n) {
	link=n;
}
public void setData(int d) {
	data=d;
}
public Node getLink() {
	return link;
}
public int getData() {
	return data;
}
class linkedQueue{
	protected Node front,rear;
	public int size;
	public linkedQueue() {
		front=null;
		rear=null;
		size=0;
	}
	public boolean isEmpty() {
		return front==null;
	}
	public int getSize() {
		return size;
	}
	public void insert(int data) {
		Node nptr=new Node(data,null);
		if(rear==null) {
			front=nptr;
			rear=nptr;
		}
		else
		{
			rear.setLink(nptr);
			rear=rear.getLink();
		}
		size++;
	}
	public int remove() {
		if(isEmpty())
			throw new NoSuchElementException("underflow exception");
		Node ptr=front;
		front=ptr.getLink();
		if(front==null)
			rear=null;
		size--;
		return ptr.getData();
	}
	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException("underflow exception");
		return front.getData();
	}
	public void display() {
		System.out.print("\nQueue=");
		if(size==0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr=front;
		while(ptr !=rear.getLink()) {
			System.out.print(ptr.getData()+" ");
			ptr=ptr.getLink();
		}
		System.out.println();
	}
}
public class LinkedQueueImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
linkedQueue lq=new LinkedQueueImplement();
System.out.println("linked queue test\n");
char ch;
do
{
	System.out.println("\nqueue operations");
	System.out.println("1.insert");
	System.out.println("2.remove");
	System.out.println("3.peek");
	System.out.println("4.chexk empty");
	System.out.println("5.size");
	int choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.println("enter integer element to insert");
		lq.insert(s.nextInt());
		break;
	case 2:
		try {
			System.out.println("removed element ="+lq.remove());
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
			}
		break;
	case 3:
		try
		{
			System.out.println("peek element="+lq.peek());
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
		}
		break;
	case 4:
		System.out.println("empty status="+lq.isEmpty());
		break;
	case 5:
		System.out.println("size="+lq.getSize());
		break;
		default:
			System.out.println("wrong entry \n");
			break;
	}
	lq.display();
	System.out.println("\ndo you want to continue)type y or n)\n");
	ch=s.next().charAt(0);
}
while(ch=='Y'||ch=='y');
	}
}
}

