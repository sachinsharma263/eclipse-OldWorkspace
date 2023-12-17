package com.qa.javaprograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("Please enter a string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		// String s = "sachin";
		String rev = "";

		char c[] = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		// System.out.println(rev);
		revsereAString(s);
	}

	public static void revsereAString(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

	}
}
