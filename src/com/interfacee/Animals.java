package com.interfacee;

public abstract class Animals implements Travel {

}

class Dog extends Animals {
	@Override
	public int getSpeed() {
		return 0;
	}
}

class Cat extends Animals {
	@Override
	public int getSpeed() {
		return 0;
	}
}

class Rabbit extends Animals {
	@Override
	public int getSpeed() {
		return 0;
	}
}