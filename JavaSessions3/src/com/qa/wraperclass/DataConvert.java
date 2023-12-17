package com.qa.wraperclass;
/*
 * DataConversion-wraper class- this concept is very important for selenium especially in web automation whenever you want to convert string to int or int to string
 * 
 */
public class DataConvert {

	public static void main(String[] args) {

		// 1. string to int
		String s = "10";

		System.out.println(s + 10);// string concetation

		int n = Integer.parseInt(s);// convert string to int: pure numeric string to int

		System.out.println(n + 10);// 2 int values:airtmatic operation

		// string is not a proper number
		//String s2 = "10a";// under double quotes is a string but when we tried converting it,it will throw
							// numberformatexception because s2 is not a proper numeric string

		//int i = Integer.parseInt(s2);// java.lang.NumberFormatException
		
		//2. string to double
		String ss="10.1";//pure double string
		System.out.println(ss+1);
		double d=Double.parseDouble(ss);
		System.out.println(d+1);
		
		//3. int to string
		int p=10;
		System.out.println(p+10);
		String s3=String.valueOf(p);//"10"
		
		System.out.println(s3+10);

		//4. boolean to string
		boolean b=true;
		if (b) {
			
		}
		
		
		/*
		 * if (String.valueOf(b)) {
		 * 
		 * }
		 */
		
		
		 
	}
}
