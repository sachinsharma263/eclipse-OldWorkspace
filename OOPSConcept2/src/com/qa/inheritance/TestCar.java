package com.qa.inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		final int i=10;
//		i=20;//The final local variable i cannot be assigned. It must be blank and not using a compound assignment

		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.tyreAirPressure();

		b.sunRoof();

		b.engine();
		
		//b.theftSafety();

		System.out.println("--------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.tyreAirPressure();
		// c.sunRoof(); //The method sunRoof() is undefined for the type Car

		c.engine();

		System.out.println("-------------");

		// up casting or top casting
		Car c1 = new Bmw();
		c1.start();
		c1.stop();
		c1.tyreAirPressure();
		// c.sunRoof();//The method sunRoof() is undefined for the type Car

		// down casting-not allowed in java
//		Bmw bb =(Bmw) new Car();/java.lang.ClassCastException: com.qa.inheritance.Car cannot be cast to com.qa.inheritance.Bmw
		// we are destroying the object-destroying the state of the object
		// bb.start();

		System.out.println("--------------");

		Vehicle v = new Bmw();
		v.engine();

		Vehicle vv = new Car();
		vv.engine();
		
		System.out.println("--------------");
		
		Car c2=new Audi();
		c2.start();
		c2.stop();
		c2.tyreAirPressure();
		//c2.theftSafety();

	}

}
