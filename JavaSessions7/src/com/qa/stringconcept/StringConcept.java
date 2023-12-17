package com.qa.stringconcept;
/*
 * String is non primitive data type because string size is not fixed
 * String is a collection of multiple characters
 * String is the sequence of characters
 * String is an array of characters char c[]={'a','b'}; string s=new string(c)
 * String is a class-->inside this class we have multiple methods
 * public final class String extends Object implements CharSequence,Serilizable,Comparable{}-->string class is final because to prevent inheritance
 * String is immutable or string object is immutable
 * to create string there are 3 classes: String,String Buffer and String Builder
 */
public class StringConcept {

	public static void main(String[] args) {

		String s = "hello world";
		String ss="";//empty string
		String sss=" ";//a single character(space character);
		String ssss=null;//point to null

		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println(s + a);
		System.out.println(s + a + b);
		System.out.println(a + b + s);

		System.out.println(s + (a + b));

		String p = "Test";
		String q = "Automation";

		System.out.println(p + " " + q);

		// ASCII Values:
		// a to z- 97 to 122
		// A to Z-65 to 90
		// 0 to 9-48 to 57
		// space is also a character -32
		// for every charcater there is ascii value in computer
		// we can concate two charcater and concentatio of charcater wil take place on
		// the basis of their ascii values
		char c1 = 'a';
		char c2 = 'b';

		System.out.println(c1 + c2);
	}

}
