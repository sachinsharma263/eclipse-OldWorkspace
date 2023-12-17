package com.qa.methodoverloading;

public class MainMethodOverloading {

	public static void main(String[] args) {

		System.out.println("main method...");
	}

	public static void main(String args) {
		System.out.println("main method with string param" + args);
	}

	public static void main(int args) {
		System.out.println("main method with int param");
	}

}
