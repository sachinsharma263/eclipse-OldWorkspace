package com.qa.javasessions;
/*
 * print/println: overloaded method inside PrintStream class inside java.io package
 * every programming language have print statemenet like cout in c++,printf in c,print in python,SOP in java
 * SOP will print on the console
 */
public class PrintConsole {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		double d1=10.5;
		double d2=10.5;
		
		
		System.out.println(a);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(10);
		System.out.println('c');
		System.out.println("naveen");
		System.out.println(10.5);
		
		System.out.println("the value of a is: "+a);
		System.out.println("the sum of a and b is: "+a+b);
		
		System.out.println("the sum of a and b is: "+(+a+b));
		
		System.out.println(d1+d2);
		
		System.out.print("deepak"+"\n");
		System.out.print("naveen"+"\t");
		System.out.println("swati");
		
		System.out.println();//this will generate a new line
		
		
	}
}
