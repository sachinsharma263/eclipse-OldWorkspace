package com.qa.inheritance;

public  class Car extends Vehicle{

	public  void start() {
		System.out.println("car--start");
	}

	public void stop() {
		System.out.println("car--stop");
	}

	public void tyreAirPressure() {
		System.out.println("car-tyreairpressure");
	}
	public static void test() {
		System.out.println("car--test");
	}
}
