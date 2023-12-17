package com.qa.stringconcept;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s="this is my first java code";
		
		System.out.println(s.length());
		
		int li=0;
		int len=s.length();
		int hi=len-1;
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(25));
		
		String s1="Hello Selenium";
		String s2="Hello selenium";
		
		int a=10;
		int b=20;
		System.out.println(a==b);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3="          Hello world       ";
		System.out.println(s3.trim());
		
		System.out.println(s3.replace(" ", ""));
		
		String s4="20-01-2022";
		System.out.println(s4.replace("-", "/"));
		
		String s5="this is java";
		
		System.out.println(s5.toUpperCase());
		
		System.out.println(s5.toLowerCase());
		
		
	}
}
