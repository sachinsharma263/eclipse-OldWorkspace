package com.qa.accessmodifier;

public class TestModifier {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.color);
		//System.out.println(c.price);
		
		System.out.println(c.name);
		System.out.println(c.type);
	}
}
