package File;

import java.util.Scanner;

public class Accounts {
	static int acc_id;
	static int contact;
	static float deposit_amount;
	static String acc_name;
	static String address;
	
	static void display(int acc_id,String acc_name,int contact,String address,float deposit_amount) {
		System.out.println("account details");
		System.out.println("acc_id: "+acc_id);
		System.out.println("acc_name: "+acc_name);
		System.out.println("contact: "+contact);
		System.out.println("address: "+address);
		System.out.printf("deposit_amount: %.2f ",deposit_amount);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter acc_id: ");
		acc_id = s.nextInt();
		System.out.print("enter acc_name: ");
		acc_name = s.next();
		System.out.print("enter contact: ");
		contact = s.nextInt();
		System.out.print("enter address: ");
		address = s.next();
		System.out.print("enter amount: ");
		deposit_amount = s.nextInt();
		display(acc_id,acc_name,contact,address,deposit_amount);
		s.close();
		
				

	}

}
