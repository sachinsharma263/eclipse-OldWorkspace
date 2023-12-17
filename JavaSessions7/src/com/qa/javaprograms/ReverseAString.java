package com.qa.javaprograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("Please enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String rev = "";

		char c[] = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		// System.out.println(rev);

		reverseAString2(s);
	}

	public static void reverseAString(String s) {

		char c[] = s.toCharArray();
		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
	}

	public static void reverseAString2(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
