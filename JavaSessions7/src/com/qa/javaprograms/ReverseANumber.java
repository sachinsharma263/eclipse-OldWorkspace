package com.qa.javaprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		int temp = n;

		int rem = 0;
		int rev = 0;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("reverse of number " + temp + " is " + rev);
	}

}
