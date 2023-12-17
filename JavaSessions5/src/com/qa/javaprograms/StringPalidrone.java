package com.qa.javaprograms;

import java.util.Scanner;

public class StringPalidrone {

	public static void main(String[] args) {

		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string:");
		str = scan.nextLine();
		scan.close();

		stringIsPalidroneOrNot(str);
	}

	public static void stringIsPalidroneOrNot(String str) {

		String temp = str;
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		if (reverse.equals(temp)) {
			System.out.println("Number is palidrone");
		} else {
			System.out.println("Number is not palidrone");
		}
	}

}
