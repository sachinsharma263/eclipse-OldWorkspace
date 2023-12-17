package com.qa.stringconcept;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "this is my first java code";// s is variable name of string type and we are performing all the
												// operations on s only

		System.out.println(s.length());
		int li = 0;
		int hi = s.length() - 1;
		int len = hi + 1;

		System.out.println("li-->" + 0 + "\n" + "hi-->" + (s.length() - 1) + "\n" + "length-->" + s.length());

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(3));

		String s1 = "Hello Selenium";
		String s2 = "Hello selenium";

		int a = 10;
		int b = 20;
		System.out.println(a == b);

		System.out.println(s1.equals(s2));// java is case sensitive language,S and s check case considerations
		System.out.println(s1.equalsIgnoreCase(s2));// ignoring case considerations

		String s3 = "    hello world      ";
		System.out.println(s3.trim());
		System.out.println(s3);

		System.out.println(s3.replace(" ", ""));

		String dob = "12-05-2022";
		System.out.println(dob.replace("-", "/"));
		System.out.println(dob);
		
		String s4="this is java";
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());

	}
}
