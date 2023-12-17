package com.qa.accessmodifier;

public class Bmw extends Car{

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.color);
		System.out.println(c.name);
		System.out.println(c.type);
		
		Bmw b=new Bmw();
		System.out.println(b.name);
	}
}
