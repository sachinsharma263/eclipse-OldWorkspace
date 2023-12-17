package com.qa.interviewprograms;

import java.util.Scanner;

/*
 * MaximumOccurenceOfCharacter in a string by using ASCII value
 */
public class MaximumOccurenceOfCharacter {

	public MaximumOccurenceOfCharacter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("Please enter string:");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		//String s = "aabbccc    ";
		s=s.replace(" ", "");

		int array[] = new int[127];

		char c[] = s.toCharArray();

		int max = -1;
		char maxChar = ' ';

		for (char value : c) {
			array[value] = array[value] + 1;
		}
		for (char value : c) {
			if (max < array[value]) {
				max = array[value];
				maxChar = value;

			}
		}
		System.out.println("maximum character occurence is:" + " " + maxChar + " by " + max + " times");
	}

}
