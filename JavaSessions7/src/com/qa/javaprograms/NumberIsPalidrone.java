package com.qa.javaprograms;

import java.util.Scanner;

public class NumberIsPalidrone {

	public static void main(String[] args) {

		System.out.println("Please ente a number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = n;

		int rem = 0;
		int rev = 0;

		while (n != 0) {

			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("number is palidrone");
		} else {
			System.out.println("number is not palidrone");
		}
	}

}
