package com.qa.accessmodifier2;

import com.qa.accessmodifier.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.type);
		
		Audi a=new Audi();
		System.out.println(a.type);
		
	}
}
