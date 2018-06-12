package com.myworkouts;

import java.util.Scanner;

public class GetInput {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number");
		int b = a.nextInt();
		int c = a.nextInt();
		int sum = b + c;
		int d = b * (c + 10);
		System.out.println("The sum 0f two given number is : " + sum + " " + d);

	}
}