package com.qa.javasessions;

import java.util.Scanner;

/*
 * wap to add 2 integer values and print the output
 * functionality:addition 
 * prerequestic:2 int values
 * step1:add the 2 values
 * step2:store the output into a variable
 * step3:print the final value
 * 
 * Passing hard coded values-->big no-->at runtime i should be able to pass the values-->at runtime i should decide on what 2 values i should perform 
 * addition operation-->at run time we should able to add values through console
 * Scanner class and its methods-->in order to take input from console we have to use Scanner class
 * 
 */
public class Addition {
	/**
	 * JVM triggers main method only
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Addition obj = new Addition();

		Scanner scan = new Scanner(System.in);//take input from console or system
		System.out.println("enter enter first value:");
		int a = scan.nextInt();//next and nextline--string
		System.out.println("enter enter second value:");
		int b = scan.nextInt();
//		System.out.println("enter enter third decimal value:");
//		float c = scan.nextFloat();
//		double d = scan.nextDouble();
		scan.close();

		int sum = obj.addTwoValues(a, b);
		System.out.println("sum of two numbers is:" + sum);
	}

	/**
	 * this method add two non decimal integer value
	 * 
	 * @param a
	 * @param b
	 * @return return sum of two int values
	 */
	public int addTwoValues(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
