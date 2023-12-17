package com.qa.wrapperclass;

public class WrapperClassConcept {

	public static void main(String[] args) {

		/**
		 * Data Conversion- String to int
		 */
		String s = "10";
		int n = Integer.parseInt(s);

		/**
		 * Data Conversion- String to double
		 */
		String s2 = "10.10";
		Double d = Double.parseDouble(s2);

		/**
		 * Data Conversation- String to boolean
		 */
		String s3 = "true";
		// if(s3) {}
		boolean b = Boolean.parseBoolean(s3);

		/**
		 * Data Conversation- int to String
		 */
		int a = 10;
		String s4 = String.valueOf(a);

		/**
		 * double to String
		 */
		double d2 = 43.243;
		String s5 = String.valueOf(d2);

		if (b) {
		}
		// if(String.valueOf(b)) {}

		// boolean b2=String.valueOf(b);

		/**
		 * String to int- but we dont have pure numeric String "10A" is not pure numeric
		 * string, "10" is pure numeric string
		 */
		String s6 = "10A";
		Integer.parseInt(s6);// java.lang.NumberFormatException

	}
}
