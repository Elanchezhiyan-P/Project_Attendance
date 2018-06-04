package com.myworkouts;

public class Taxi extends Car{
	public Taxi() {
		System.out.println("fourth");
	}
	public Taxi (int i) {
		this();
	}
	@Override
	public void Color() {
		System.out.println("Fifth");
	}
	@Override
	public void Model() {
		System.out.println("Sixth");
	}
public static void main(String[] args) {
	Taxi taxi1 = new Taxi();
	taxi1.Color();
	taxi1.Model();
	
}
}
