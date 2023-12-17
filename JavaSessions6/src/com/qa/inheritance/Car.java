package com.qa.inheritance;

public class Car extends Vehicle {
	final int days=7;
	public static void test() {
		System.out.println("Car--test");
	}
	public  void start() {
		System.out.println("Car--start");
	}
	public void stop() {
		System.out.println("Car--stop");
	}
	public void tyreAirPressure() {
		System.out.println("Car--tyreAirPressure");
	}
}
