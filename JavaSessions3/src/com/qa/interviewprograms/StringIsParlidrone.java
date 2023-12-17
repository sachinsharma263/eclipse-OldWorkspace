package com.qa.interviewprograms;

import java.util.Scanner;

public class StringIsParlidrone {

	public StringIsParlidrone() {}
	
	
	public static void main(String[] args) {

		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		if (s.equals(reverse)) {
			System.out.println("String is parlidrone");
		} else {
			System.out.println("String is not parlidrone");
		}
	}

}
