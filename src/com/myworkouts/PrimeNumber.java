package com.myworkouts;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter the number to check for Prime Number : ");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		 int a = 0;
		for ( int i=2; i<(n/2); ++i)
		 {
			 if(n%i == 0)
			 {
				 a=1;
				 break;
			 }
		 }
		 if(a==0)
		 {
			 System.out.println("Its a Prime Number");
			 
		 }
		 else
		 {
			 System.out.println("Its not a Prime Number");
		 }
	}

}
