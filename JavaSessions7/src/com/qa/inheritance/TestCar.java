package com.qa.inheritance;

public class TestCar {

	public static void main(String[] args) {

		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.tyreAirPressure();

		b.engine();

		b.sunRoof();
		System.out.println("-------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.tyreAirPressure();
		// c.sunRoof();

		c.engine();

		System.out.println("-------------");

		Car c2 = new Bmw();// top/up casting-child class object can be refered by parent class reference
							// variable or parent interface refernce variable.

		c2.start();
		c2.stop();
		c2.tyreAirPressure();
		// c2.sunRoof();
		c2.engine();

		System.out.println("-------------");
		try {
			Bmw b2 = (Bmw) new Car();// Type mismatch: cannot convert from Car to Bmw. in java down casting is not
										// allowed compiler wont allow but in case we
			// type cast then compiler will get confuse it pass it but at runtime java/jvm
			// wil throw class cast exception
			b2.sunRoof();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-------------");
		Vehicle v = new Car();
		v.engine();

		System.out.println("-------------");
		Vehicle v2 = new Bmw();
		v2.engine();

		System.out.println("-------------");
		Car c3 = new Audi();
		c3.engine();
		c3.start();
		c3.stop();
		c3.tyreAirPressure();
		// c3.theftSafety()
		System.out.println("-------------");
		Audi a = new Audi();
		a.theftSafety();
		a.engine();
		a.start();
		System.out.println("-------------");
		System.out.println(b.days);
		System.out.println(c.days);
		System.out.println(c2.days);

		// c.days=8;
	}

}
