package com.qa.javaprograms;

import java.util.Scanner;

/*
 *  :
 * if num is divisble by 3: Fizz
 * if num is divisble by 5: Bizz
 * if num is divisble by 3 and 5: FizzBizz
 */
public class FizzBizzPuzzle {

	public static void main(String[] args) {

		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		scan.close();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("fizzbizz");
		}

		else if (num % 3 == 0) {
			System.out.println("fizz");
		} else if (num % 5 == 0) {
			System.out.println("bizz");
		}

	}
}
