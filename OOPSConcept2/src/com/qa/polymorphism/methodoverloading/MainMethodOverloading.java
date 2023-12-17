package com.qa.polymorphism.methodoverloading;

/*
 * can we overload main method?
 * yes we can overload main method
 */
public class MainMethodOverloading {

//	public static void main(String[] args) {// java/jvm will always search for-public static void main(String[] args)
//											// i.e
//											// one method with name as main which is public
//		// static void and one array parameter of string type
//
//		System.out.println("main method...with string array parameter");
//	}

	public static void main(String args) {
		System.out.println("main method with string param" + args);
	}

	public static void main(String args, String a) {
		System.out.println("main method with 2 string param" + args + " " + a);
	}

	public static void main(int[] args) {
		System.out.println("main method with int array parameter");
	}
}
