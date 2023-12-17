package com.qa.methodoverloading;
/**
 * main method can be overloaded
 * @author Dell
 *
 */
public class MainMethodOverloading {

	public static void main(String[] args) 
	/**
	 * signature of main method should be exactly like this- public static void main(String[] args)
	 * JVM will search for method whose name is main with one array parameter of type string 
	 */
	{
		System.out.println("main method...");
		main("main(String args)");
	}

	public static void main(String args) {
		System.out.println("main method with string param"+ args);
	}

	public static void main(int args) {
		System.out.println("main method with int param");
	}

	public static int main(String[] args, boolean active) {
		System.out.println("main method with string array and boolean");
		return 1;
	}
}
