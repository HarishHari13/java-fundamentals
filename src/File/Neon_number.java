package File;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,p;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number: ");
		n=s.nextInt();
		int square = n*n;
		while(square!=0) {
			 p = square%10;
			sum = sum+p;
			square = square/10;
		}
		if(n==sum)
			System.out.println("is a neon number");
		else
			System.out.println("not a neon number");
		}
		

	}


