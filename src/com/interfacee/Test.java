package com.interfacee;

public class Test {
	public static void main(String[] args) { 
		Travel travelOne = new Car();
		Travel travelTwo = new Dog();

System.out.println(travelOne instanceof Car);
System.out.println(travelTwo instanceof Dog);
   }
}