package com.qa.inheritance;

public class Test {

	public static void main(String[] args) {
		
		final int days=10;
		//days=20;
		
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.tyreAirPressure();
		b.sunRoof();
		
		System.out.println("-----------------");
	
	
		Car c=new Car();
		c.start();
		c.stop();
		c.tyreAirPressure();
		
		System.out.println("-------------------");
	
		//top/up casting
		Car c1=new Bmw();//child class object can be referred by parent class reference variable
		c1.start();
		c1.stop();
		c1.tyreAirPressure();
		//c1.sunRoof();
		
		//down casting
//		Bmw b2=(Bmw) new Car();//java.lang.ClassCastException
//		b2.sunRoof();
		
		System.out.println("---------------------");
		Vehicle v=new Bmw();
		v.engine();
		
	}
}
