package com.myworkouts;

public class ReverseString {
	public static void main(String[] args) {
		String input = "Elanchezhiyan";

		byte[] ReverseString = input.getBytes();

		byte[] result = new byte[ReverseString.length];

		for (int i = 0; i < ReverseString.length; i++)
		{
			
			result[i] = ReverseString[ReverseString.length - i - 1];
		}
		System.out.println(new String(result));
	}
}
