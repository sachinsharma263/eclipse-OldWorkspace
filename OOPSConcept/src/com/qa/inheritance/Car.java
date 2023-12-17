package com.qa.inheritance;

public class Car extends Vehicle {

	final int days = 7;

	 void start() {
		// days=8;
		System.out.println("Car--start");

	}

	public void stop() {
		System.out.println("Car--stop");
	}

	public void tyreAirPressure() {
		System.out.println("Car--tyreAirPressure");
	}

	public static void test() {
		System.out.println("Car--test");
	}

	public Car a() {
		return new Car();
	}
}
