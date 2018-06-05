package com.worksheet;

public class ReverseNo {
	public void reverse(int n) {
		int result = 0;
		int rem;
		while (n > 0) 
		{
			rem = n % 10;
			
			result = result * 10 + rem;
			n = n / 10;
		}
			System.out.println(result);
	}

	public static void main(String[] args) {
		ReverseNo r = new ReverseNo();
		r.reverse(102);
	}

}
