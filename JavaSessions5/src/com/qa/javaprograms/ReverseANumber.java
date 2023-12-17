package com.qa.javaprograms;

import java.util.Scanner;

/*
 * Program to Reverse a Number
 */
public class ReverseANumber {

	public static void main(String[] args) {

		System.out.println("Please enter number:");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int temp = num;
		scan.close();
		int n = 5664;
		int rev = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		System.out.println("reverse of number " + temp + " is: " + rev);

	}
}
