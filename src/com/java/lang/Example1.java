package com.java.lang;

public class Example1 {
	public static void main(String[] args) {
		String str = "hi guys    this is a string";

System.out.println("Length of the String: " + str.length());

System.out.println("Length of String without spaces: " + str.replace(" ", "").length());
	}

}
