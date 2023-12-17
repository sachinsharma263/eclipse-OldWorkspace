package com.qa.javaprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		scan.close();
		int rem = 0;
		int rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
