package com.qa.inheritance;

public class TestCar {

	public static void main(String[] args) {

		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.tyreAirPressure();

		System.out.println("----------");

		b.start();// Overridden method
		b.stop();// inherited method
		b.tyreAirPressure();// inherited method
		b.sunRoof();// special method of Bmw
		b.engine();

		
		
		System.out.println("----------");

		// Car class object
		Car c = new Car();
		c.start();
		c.stop();
		c.tyreAirPressure();
		c.engine();
		//c.days=8;
		
		System.out.println("----------");
		//top/up casting
		//where child class object can be refered by parent class refernce variable
		Car obj=new Bmw();
		obj.start();
		obj.stop();
		obj.tyreAirPressure();
		//obj cant access sunRoof() because sunRoof( is a special method of Bmw,only refernce of Bmw type can access)
		
		//down casting is not allowed in java
		//Bmw b2=(Bmw) new Car();//java.lang.ClassCastException  destroying the state of an object 
		//b2.start();
		
		obj.engine();
		System.out.println("----------");
		Vehicle obj2=new Bmw();
		obj2.engine();
		
		Vehicle v=new Vehicle();
		v.engine();

	}

}
