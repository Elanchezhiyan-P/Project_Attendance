package com.myworkouts;

public class ReverseNumber {

	
	public void reverse(int n) {
	
		int result = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			result = result * 10 + rem;
		}
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		ReverseNumber r = new ReverseNumber();
		r.reverse(100);
		
		//r.reverse(10);
	}
}