package com.qa.javasessions;
/*
 * print/println: overloaded method
 */
public class PrintConsole {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		double d1 = 10.10;
		double d2 = 10.10;
		System.out.println(a);
		System.out.println(10);
		System.out.println(a + b);

		System.out.println("the value of a:" + a);
		System.out.println("the value of a and b:" + a + b);
		System.out.println("the value of a and b:" + (a + b));

		System.out.println(d1 + d2);
		System.out.println(a + b + d1 + d2);

		System.out.print("schin" + "\n");
		System.out.println("bhawna" + "\t" + "sharma");

	}

}
