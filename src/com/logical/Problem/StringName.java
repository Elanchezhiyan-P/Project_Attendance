package com.logical.Problem;

import java.util.Scanner;

public class StringName {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first input String : ");
		String input1 = s.next();
		System.out.print("Enter second input String : ");
		String input2 = s.next();
		System.out.print("Enter third input String : ");
		String input3 = s.next();
		
		
		
		String[] str1= divisionideString(input1);
		String[] str2 = divisionideString(input2);
		String[] str3 = divisionideString(input3);
		
		String in1 = str1[0] + str2[1] + str3[2];
		String in2 = str1[1] + str2[2] + str3[0];
		String in3 = str1[2] + str2[0] + str3[1];
		
		String f1=toggleString(in1);
		String f2=toggleString(in2);
		String f3=toggleString(in3);
		
		
		System.out.println("The output is : \n" + f1);
		System.out.println(f2);
		System.out.println(f3);
		
	}

	public static String[] divisionideString(String input) {
		int reminder = input.length() % 3;
		int division = input.length() / 3;
		String initial = null;
		String middle = null;
		String end = null;
		if (reminder == 1) {
			initial = input.substring(0, division);
			middle = input.substring(initial.length(), initial.length() + division + reminder);
			end = input.substring(initial.length() + middle.length(), input.length());
		}

		if (reminder == 2) {
			initial = input.substring(0, division + 1);
			middle = input.substring(initial.length(), initial.length() + division);
			end = input.substring(initial.length() + middle.length(), input.length());
		}
		if (reminder == 0) {
			initial = input.substring(0, division);
			middle = input.substring(initial.length(), initial.length() + division);
			end = input.substring(initial.length() + middle.length(), input.length());

		}
		return new String[] { initial, middle, end };
	}

	public static String toggleString(String str) {
		char[] c = str.toCharArray();
		String s=" ";
		for (int i = 0; i < c.length; i++) {
			if (Character.isLowerCase(c[i])) {
				s = s+Character.toUpperCase(c[i]);
			}
			if (Character.isUpperCase(c[i])) {
				s = s+Character.toLowerCase(c[i]);
			}
		}
		return s;
	}
}