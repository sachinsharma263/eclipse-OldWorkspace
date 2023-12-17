package com.qa.interviewprograms;

import java.util.Scanner;

class ReverseAString {

	public ReverseAString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.print("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse of string " + s + " is: " + reverse);
	}

}
