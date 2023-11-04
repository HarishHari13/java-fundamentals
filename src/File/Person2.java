package File;

import java.util.Scanner;

public class Person2{
	private String name;
	private int age;
	private String country;
	
	public Person2(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the person's name: ");
        String name = s.nextLine();

        System.out.print("Enter the person's age: ");
        int age = s.nextInt();
        s.nextLine(); 

        System.out.print("Enter the person's country: ");
        String country = s.nextLine();

        
        Person2 person = new Person2(name, age, country);

        
        System.out.println("Name: ");
        System.out.println("Age: ");
        System.out.println("Country: ");

     
        s.close();
    }


}