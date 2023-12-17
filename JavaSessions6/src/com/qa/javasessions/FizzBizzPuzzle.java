package com.qa.javasessions;

import java.util.Scanner;

/*
 *  :
 * if num is divisble by 3: Fizz
 * if num is divisble by 5: Bizz
 * if num is divisble by 3 and 5: FizzBizz
 */
public class FizzBizzPuzzle {

	public static void main(String[] args) {

		System.out.println("enter the number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBizz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Bizz");
		}

	}
}
