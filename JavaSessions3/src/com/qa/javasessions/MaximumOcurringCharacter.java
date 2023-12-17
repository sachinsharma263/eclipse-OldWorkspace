package com.qa.javasessions;

/*
 * Program to find Maximum Occurring Character in String by using ASCII value
 */
public class MaximumOcurringCharacter {

	public static void main(String[] args) {

		String s = "aabbcccdddd de";
		String s2 = "this is my first java";
		s2 = s2.replace(" ", "");

		int array[] = new int[127];

		for (int i = 0; i < s2.length(); i++) {
			array[s2.charAt(i)] = array[s2.charAt(i)] + 1;
		}

		int max = -1;
		char c = ' ';
		for (int i = 0; i < s2.length(); i++) {
			if (max < array[s2.charAt(i)]) {
				max = array[s2.charAt(i)];
				c = s2.charAt(i);
			}
		}
		System.out.println("Maximum occurence character is: " + c + " " + max + " times");
	}

}
