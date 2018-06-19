package com.logical.Problem;

import java.util.Scanner;

public class WifiPin {
	public static void main(String[] args) {
		int sum = 0, sum1, num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three digit Room NO. : ");
		int roomNo = s.nextInt();
		System.out.println("Enter your Name : ");
		String name = s.next();
		int b = (roomNo / 10) / 10;
		char d = name.charAt(name.length() - 1);
		char[] e = { ')', '!', '@', '#', '$', '%', '^', '&', '*', '(' };
		int f = roomNo % 10;
		char g = e[f];
		num = ((roomNo % 10) + ((roomNo / 10) % 10) + ((roomNo / 100) % 10));
		if (num >= 10) {
			sum = ((num % 10) + (num / 10));
		} else {
			sum = num;
		}

		if (sum % 2 == 0) {
			sum1 = sum;
		} else if (sum > 1) {
			sum1 = sum - 1;
		} else {
			sum1 = sum + 1;
		}
		System.out.println("Wifi Password is : " + sum1 + g + d + b);
	}
}