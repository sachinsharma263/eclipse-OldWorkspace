package com.qa.javaprograms;

import java.util.Scanner;

public class FaboniciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Please enter number:");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		System.out.print(a + " " + b+" ");
		for (int i = 0; i < count; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;

		}
	}

}
