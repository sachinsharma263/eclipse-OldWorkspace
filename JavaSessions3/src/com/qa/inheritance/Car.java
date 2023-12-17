package com.qa.inheritance;

public class Car extends Vehicle{

	//final keyword is used to prevent the overriding, Cannot override the final method
	//one use case:this start method be cannot override,no can change business logic/forcing everyone use this implementation/use same logic
	//final keyword is also use to prevent inheritance
	//if we declare a variable as final then variable become constant.
	
	
	
	public  void start() { 
		System.out.println("Car--start");
	}
	/*
	 * public final void start() { System.out.println("Car--start"); }
	 */

	public void stop() {
		System.out.println("Car--stop");
	}

	public void tyreAirpressure() {
		System.out.println("Car--tyreAirpressure");
	}

	public static void test() {
		System.out.println("Car--test");
	}
}
