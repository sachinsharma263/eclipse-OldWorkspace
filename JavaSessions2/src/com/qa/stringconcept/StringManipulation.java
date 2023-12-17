package com.qa.stringconcept;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "this is my first java code";

		System.out.println(s.length());

		int li = 0;
		int len = s.length();
		int hi = len - 1;

		System.out.println("li is:" + li);
		System.out.println("len is:" + len);
		System.out.println("hi is:" + hi);

		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		// System.out.println(s.charAt(26));// java.lang.StringIndexOutOfBoundsException

		int a = 10;
		int b = 20;

		System.out.println(a == b);

		String s1 = "Hello Selenium";
		String s2 = "Hello selenium";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String h1 = "      hello world  ";
		System.out.println(h1.trim());

		System.out.println(h1);

		System.out.println(h1.replace(" ", ""));

		String dob = "04-04-1984";
		System.out.println(dob.replace("-", "/"));

		String s3 = "this is java";

		System.out.print((s3.toUpperCase()).toLowerCase()+"\t");
		System.out.println(s3);

	}
}
