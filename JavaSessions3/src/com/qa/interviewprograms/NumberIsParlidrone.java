package com.qa.interviewprograms;

import java.util.Scanner;

final class NumberIsParlidrone {

	public NumberIsParlidrone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int rev = 0;
		int rem = 0;
		int temp = n;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Number is parlidrone");
		} else {
			System.out.println("Number is not parlidrone");
		}
	}

}
