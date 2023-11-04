package File;

import java.util.Scanner;

public class Constructor1 {
	int emp_id,salary;
	String emp_name;
	Constructor1(){ //default constructor - no parameters inside the constructor method
		emp_id = 1;
		emp_name = "Hema";
		salary = 20000;
		}
	Constructor1(int id,String name,int sal){
		emp_id = id;
		emp_name = name;
		salary = sal;
	
	}
	void display() {
		System.out.println("employee details: ");
		System.out.println("emp_id: "+emp_id);
		System.out.println("emp_name: "+emp_name);
		System.out.println("salary: "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int id,salary;String name;
		System.out.print("employee id: ");
		id = s.nextInt();
		System.out.print("employee name: ");
		name = s.next();
		System.out.print("salary: ");
		salary = s.nextInt();
		Constructor1 obj = new Constructor1();
		obj.display();
		Constructor1 obj1 = new Constructor1(2,"vinod",25000);
		obj1.display();
		Constructor1 obj2 = new Constructor1(id,name,salary);
		obj2.display();

	}

}
