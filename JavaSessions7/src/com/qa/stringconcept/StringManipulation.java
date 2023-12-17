package com.qa.stringconcept;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "this is my first java code";

		int len = s.length(); // String method/api- length()charAt()

		System.out.println("length of string is: " + len);
		int li = 0;
		int hi = len - 1;

		char c = s.charAt(0);
		System.out.println(c);
		System.out.println(s.charAt(4) + "\n" + s.charAt(5));

		// System.out.println(s.charAt(26));//
		// java.lang.StringIndexOutOfBoundsException: String index out of range: 26

		String s2 = "Hello Selenium";
		String s3 = "Hello selenium";// java is case sensitive language S and s both are different

		// string comparison- non primitive
		int a = 10;
		int b = 20;

		System.out.println(a == b);

		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));

		String s4 = "       Hello world";
		System.out.println(s4.trim());
		System.out.println(s4.replace(" ", ""));

		String dob = "04/03/2023";
		System.out.println(dob.replace("/", "-"));

		String s5 = "this is Java";
		System.out.println(s5.toUpperCase() + "\n" + s5.toLowerCase());

	}

}
