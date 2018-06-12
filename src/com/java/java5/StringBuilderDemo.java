package com.java.java5;

public class StringBuilderDemo {


	   public static void main(String[] args) {
	  
	      StringBuilder str = new StringBuilder("tutorials ");
	      System.out.println("string = " + str);
	    
	      
	      str.append("point");
	      
	      
	      System.out.println("After append = " + str);

	      str = new StringBuilder("1234 ");
	      System.out.println("string = " + str);
	      
	       
	      str.append("!#$%");
	      
	      
	      System.out.println("After append = " + str);
	   }
	} 