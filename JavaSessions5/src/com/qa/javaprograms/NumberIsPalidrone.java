package com.qa.javaprograms;

import java.util.Scanner;

public class NumberIsPalidrone {

	public static void main(String[] args) {

		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//int num = 121;
		int temp = num;

		int rev = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == temp) {
			System.out.println("Number is palidrone");
		} else {
			System.out.println("Number is not palidrone");
		}

	}

}
