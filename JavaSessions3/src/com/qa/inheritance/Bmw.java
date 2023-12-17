package com.qa.inheritance;

public class Bmw extends Car {
	//if Car is final class:The type Bmw cannot subclass the final class Car

	@Override
	public void start() {
		System.out.println("Bmw--start");
	}

	public void sunRoof() {
		System.out.println("Bmw--sunRoof");
	}
	//@Override static method cannot be override, this method is separate method of bmw
	//static method is not a part of object,it stored in common memory area,if static method override then it is a part of object
	public static void test() {
		System.out.println("Bmw--test");
	}
}
