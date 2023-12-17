package com.qa.staticanonstaticconcept;

/**
 * Practical use of static in real life- wheels=4 in Car class can be static
 * because all cars are 4 wheels
 * 
 * @author Dell
 *
 */
public class Car {

	String name;
	String color;
	int price;

	static int wheels = 4;//wheels common property for all objects
	/**
	 * int wheels;
	 * c1.wheels=4
	 * c2.wheels=4  
	 * bad practice
	 * @param args
	 */

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "Bmw";
		c1.color = "blue";
		c1.price = 10;

		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "white";
		c2.price = 20;

	}
}
