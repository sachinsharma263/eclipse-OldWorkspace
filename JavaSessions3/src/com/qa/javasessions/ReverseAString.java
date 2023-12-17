package com.qa.javasessions;
/*
 * Program to Reverse a String
 */
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("Please enter some string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// String s = "madam";

		int len = s.length();

		String reverse = "";

		for (int i = len - 1; i >= 0; i--)
			reverse = reverse + s.charAt(i);
		System.out.println(reverse);

	}
}
