package com.worksheet;

import com.basic.Car;

public class CarExample {
public static void main (String[] args)
{
	Car car = new Car();
	
	car.setSpeed(100);
	CarExample carexample = new CarExample();
	
	CarExample.aMethod(car);
	System.out.println("speed " + car.getSpeed());
	
}
public static void aMethod(Car car) {
car.setSpeed(300);	
}
}