package com.qa.javasessions;

/*
 *  :
 * if num is divisble by 3: Fizz
 * if num is divisble by 5: Bizz
 * if num is divisble by 3 and 5: FizzBizz
 */
public class FizzBizzPuzzle {

	public static void main(String[] args) {

		int num = 15;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBizz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Bizz");
		}

	}
}
