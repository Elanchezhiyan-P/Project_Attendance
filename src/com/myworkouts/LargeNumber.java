package com.myworkouts;

public class LargeNumber {
	public static int a[] = { 10, 324, 45, 90, 9808 };

	public static int largest() {
		int m = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}

	public static void main(String[] args) {
		System.out.println("Largest in given array is " + largest());
	}
}
