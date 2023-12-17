package com.qa.javaprograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		//String s = "sachin";

		String rev = "";
		
		System.out.println("Plese enter a string:");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		scan.close();

		char c[] = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		//System.out.println(rev);
		
		reverseAString(s);
	}
	public static void reverseAString(String s) {
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
