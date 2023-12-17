package com.qa.javasessions;

public class TypeOfMethod {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		System.out.println(b);
		TypeOfMethod.b = 40;
		System.out.println(TypeOfMethod.b);

		TypeOfMethod obj = new TypeOfMethod();
		System.out.println(obj.a);

		subtract();
		obj.multiply();
		
		
	}

	public void add() {

		TypeOfMethod.subtract();
		multiply();
	}

	public static void subtract() {

		System.out.println("subtract");
		TypeOfMethod obj = new TypeOfMethod();
		obj.multiply();
		
		
	}

	public void multiply() {

	}

}
