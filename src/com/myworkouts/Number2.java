package com.myworkouts;

public class Number2 {
	public static void main(String[] args) {
		for (int r = 0; r < 10; r++) {

			for (int s = 1; s <= (20 - r); s++) {
				System.out.println(" ");
			}
			for (int t = 0; t < r; t++) {
				System.out.println("*");
			}
		}
	}
}
