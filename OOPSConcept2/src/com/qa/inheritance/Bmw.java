package com.qa.inheritance;

public class Bmw extends Car {//The type Bmw cannot subclass the final class Car

	@Override
	public void start() {
		System.out.println("Bmw--start");
	}

	public void sunRoof() {
		System.out.println("Bmw--sunRoof");
	}
	//@Override The method test() of type Bmw must override or implement a supertype method overriding for static method stricltly not allowed
	//reason?-where static method stored-common memory allocation,static is never part of object
	public static void test() {
		System.out.println("Bmw--test");
	}
//	public void start2() {
//		System.out.println("Car--start2");
//	}
	
	@Override
	public Car returnType() {
		Bmw b=new Bmw();
		Car c=new Car();
		Audi a=new Audi();
		return c;
	}
}
