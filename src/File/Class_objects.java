package File;

import java.util.Scanner;

public class Class_objects {
	static int id;
	static String name;
	static int m1,m2,m3;

	static void display(int id,String name,int m1,int m2,int m3) {
		float total,average;
		total = m1+m2+m3;
		average = total/3;
		System.out.println("student details");
		System.out.println("student id: "+id);
		System.out.println("student name: "+name);
		System.out.println("mark1: "+m1);
		System.out.println("mark2: "+m2);
		System.out.println("mark3: "+m3);
		System.out.println("total: "+total);
		System.out.println("average: "+average);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the student id: ");
		id = s.nextInt();
		System.out.print("enter the student name: ");
		name = s.next();
		System.out.print("mark1: ");
		m1 = s.nextInt();
		System.out.print("mark2: ");
		m2 = s.nextInt();
		System.out.print("mark3: ");
		m3 = s.nextInt();
		display(id,name,m1,m2,m3);
		s.close();
		
		
		
		

	}

}
