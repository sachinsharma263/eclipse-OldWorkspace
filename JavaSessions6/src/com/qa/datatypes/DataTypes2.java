package com.qa.datatypes;

/*
 * java is a tightly coupled language where variable you are creating you have to provide specific data type to the variable
 * 
 * byte,short,int,long
 * float,double
 * char
 * boolean
 */
public class DataTypes2 {

	public static void main(String[] args) {

		int a = 10;// a,DataTypes2 are called identifier,
		// int b = 10.5;// Type mismatch: cannot convert from double to int
		long l = 10000000000l;

		float f = 10.5f;

		// byte bb=-129;//Type mismatch: cannot convert from int to byte

		short s = 129;

		// int n=12345678901;//The literal 12345678901 of type int is out of range,in
		// java any non decimal value is treated as int by jvm

		long m = 12345678901l;// add suffix l otherwise compiler will treat this as integer

		// String s=10;
		// int var="";/Type mismatch: cannot convert from String to int

		float ff = 10;// you can store a non decimal integer value to double or float variable but when
						// the value get stored ultimately converted into decimal
		
		System.out.println(ff);
		
//		float fff=10.5;/Type mismatch: cannot convert from double to float
		
		float fff=10.5f;
		
		double d=10;
		
		System.out.println(d);
		
		//char c="";//Type mismatch: cannot convert from String to char
		
		char c=100;
		
		System.out.println(c);

	}
}
