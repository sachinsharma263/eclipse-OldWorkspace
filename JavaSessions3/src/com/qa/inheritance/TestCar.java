package com.qa.inheritance;

public class TestCar {

	public static void main(String[] args) {

		final int days=7;
		//days=10;
		
		Bmw bmw = new Bmw();
		bmw.start();
		bmw.stop();
		bmw.tyreAirpressure();
		bmw.engine();
		
		
		
		bmw.sunRoof(); 
		
		System.out.println("-------------");
		
		Car car=new Car();
		car.start();
		car.stop();
		car.tyreAirpressure();
		car.engine();
	
		
		System.out.println("-------------");
		//Top casting/upcasting :btw parent and child
		Car obj=new Bmw();//child class object can be refered by parent class refernce variable 
		
		obj.start();
		obj.stop();
		obj.tyreAirpressure();
		
//		Bmw b=(Bmw) new Car();// java.lang.ClassCastException we are destroying state of object,destroying the object
		
		//top casting: btw Grand parent and grand child
		Vehicle v=new Bmw();
		v.engine();
	}

}
