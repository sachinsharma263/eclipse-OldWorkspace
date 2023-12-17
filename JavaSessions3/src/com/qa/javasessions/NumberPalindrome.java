package com.qa.javasessions;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		System.out.println("enter the number :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int temp = num;
		int rem = 0;
		int rev = 0;
		while (num != 0) {

			rem = num % 10;

			rev = rev * 10 + rem;

			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("number is palindrone");
		} else {
			System.out.println("number is not palindrone");
		}
	}
}
