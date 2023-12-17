package com.qa.methodoverloading;

/**
 * main method can be overloaded
 * 
 * @author Dell
 *
 */
public class MainMethodOverloading {

	public static void main(String[] a) {
		/**
		 * signature of main method should be exactly like this- public static void
		 * main(String[] args) JVM will search for method whose name is main with one
		 * array parameter of type string
		 */
		System.out.println("main method......");
	}

	public static void main(int a) {
		System.out.println("main method..." + a);
	}

	public static void main(String a) {
		System.out.println("main method..." + a);
	}
	public static int main(String[] args,boolean active) {
		System.out.println("main method with string array and boolean");
		return 1;
	}
}
