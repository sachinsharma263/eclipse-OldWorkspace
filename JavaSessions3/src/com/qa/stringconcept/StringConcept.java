package com.qa.stringconcept;
/*
 * String is non primitive data type because string size is not fixed
 * String is a collection of multiple characters
 * String is an array of characters char c[]={'a','b'}; string s=new string(c)
 * String is a class-->inside this class we have muliple methods
 * public final class String extends Object implements CharSequence,Serilixable,Comparable{}-->string class is final
 * String is immutable
 * 
 * to create string there are 3 classes-->string,string buffer and string builder
 * Why String Object Is Immutable?
 * Person 1-->String city 1="Delhi";
 * Person 2-->String city 2="Delhi";
 * ...
 * Person 1000->String city 3="Delhi";
 * 
 * suppose Person 3 shifted to banglore so he updated city as banglore,if string is mutuable then in case Person updated city as banglore then for all person 
 * city updated to banglore
 * String is immutable so in case any person updated city original object wont change,new object city created
 */
public class StringConcept  {

	public static void main(String[] args) {

		String s = "Hello world";

		int a = 10;
		int b = 20;

		System.out.println(a + b);

		System.out.println(a + s);

		System.out.println(s + a + b);

		System.out.println(s + (a + b));

		String p = "Test";
		String q = "Automation";

		System.out.println(p + q);

		System.out.println(p + " " + q);

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1 + c2);

		char c3 = 'A';
		char c4 = 'B';
		System.out.println(c3 + c4);
		// atoz- 97 to 122
		// AtoZ-65 to 90
		// 0to9-48 to 57
	}
}
