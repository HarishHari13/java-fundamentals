package File;

import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,product=1,p;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number: ");
		n = s.nextInt();
		while(n>0) {
			p=n%10;
			sum=sum+p;
			product=product*p;
			n=n/10;
		}
		if(sum==product)
			System.out.println("is a spy number");
		else
			System.out.println("not a spy number");
			
		}

	}


