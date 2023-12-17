package com.qa.accessmodifier;

public class Car {

	public String color="Red";
	private int price=10;
	
	String name="Honda";
	protected String type="sedan";
	
	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.color);
		System.out.println(c.price);
		
		System.out.println(c.name);
		System.out.println(c.type);
	}
}
