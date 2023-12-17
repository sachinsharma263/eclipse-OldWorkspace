package com.qa.accessmodifier2;

import com.qa.accessmodifier.Car;

public class Truck {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.color);
		
		Truck t=new Truck();
		//System.out.println(t.type);
	}
}
