package com.qa.javaprograms;

import java.util.Scanner;

public class StringPalidrone {

	public static void main(String[] args) {

		System.out.print("Please enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		stringIsPalidroneOrNot(s);

	}

	public static void stringIsPalidroneOrNot(String str) {

		String temp = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(temp)) {
			System.out.println("string is palidrone");
		} else {
			System.out.println("string is not palidrone");
		}
	}

}
