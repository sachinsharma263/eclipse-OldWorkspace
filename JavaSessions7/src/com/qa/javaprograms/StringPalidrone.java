package com.qa.javaprograms;

import java.util.Scanner;

public class StringPalidrone {

	public static void main(String[] args) {
		
		System.out.print("Please enter a string:");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
//		String rev = "";
//		
//		char c[]=s.toCharArray();
//		
//		for (int i = c.length-1; i>=0; i--) {
//			rev=rev+c[i];
//		}
//		if(s.equals(rev))
//		System.out.println("string is palidrone");
//		else
//			System.out.println("string not is palidrone");
		
		stringIsPalidroneOrNot(s);
		
	}
	public static void stringIsPalidroneOrNot(String s) {
		
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))System.out.println("string is palidrone");
		else System.out.println("string is not palidrone");
	}
}
