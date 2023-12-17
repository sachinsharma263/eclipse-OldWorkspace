package com.qa.javasessions;

import java.util.Scanner;

/*
 * create a method which accepts 2 string
 * concat two string
 * add space in btw strings
 * return string
 */
public class StringConcat {

	public static void main(String[] args) {

		StringConcat obj = new StringConcat();
		/*
		 * String s=obj.concat2Strings("Rahul", "Arora"); System.out.println(s);
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter string 1:");
		String s1 = scan.nextLine();//nextLine() is capable of taking string as a input from console
		System.out.println("please enter string 2:");
		String s2 = scan.nextLine();
		System.out.println(obj.concat2Strings(s1, s2));
	}

	public String concat2Strings(String s1, String s2) {

		return s1 + " " + s2;
	}

}
