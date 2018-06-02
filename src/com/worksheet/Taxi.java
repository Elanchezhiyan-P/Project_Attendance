package com.worksheet;

public class Taxi extends CarExample {
	public Taxi()
	{
		System.out.println("Taxi cars");
	}
	public Taxi(int i) {
		this();
		System.out.println("Taxi cars of cars");
	}
	@Override
	public void brake()
	{
		System.out.println("Brake in taxi");
	}
	public static void main(String[] args) {
		Taxi taxi1 = new Taxi(10);
		taxi1.brake();
	} 
}
