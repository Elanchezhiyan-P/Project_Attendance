package com.worksheet;

import com.basic.Car;

public class CarExample {
	public CarExample() {
		System.out.println("Cars");
	}
public void brake() {
	System.out.println("Brake in Car example");
}
public static void main (String[] args)
{
	Car car = new Car();
	
	car.setSpeed(100);
	CarExample CarExample = new CarExample();
	
	CarExample.aMethod(car);
	System.out.println("speed " + car.getSpeed());
	
}
public static void aMethod(Car car) {
car.setSpeed(300);	
}
}
	