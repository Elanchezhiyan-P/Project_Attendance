package com.basic;

public class TertiaryOperator {
	public static void main (String[] args) {
		int a = 20;
		if (a >= 20) {
			System.out.println("equal");
		}
		else if (a < 20 ){
		    System.out.println("not equal");
		}
		else{
	 	    	System.out.println("Wrong entry");
	       }
	int c = a > 30 ? 100 : 20;
	System.out.println(c);
	
	}

}
