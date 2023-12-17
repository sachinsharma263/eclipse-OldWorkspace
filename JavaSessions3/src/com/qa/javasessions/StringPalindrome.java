package com.qa.javasessions;

/*
 * Program to Check String is Palindrome or not
 */
public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="121";
		
		String reverse="";
		
		for (int i = s.length()-1; i >=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		if (s.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		
	}
}
