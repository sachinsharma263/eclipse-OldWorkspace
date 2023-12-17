package com.qa.datatypes;
/**
 * multi line comment
 * @author Dell -machine name displayed
 * java will ignore these lines 
 */
public class DataTypes {

	public static void main(String[] args) {
		//data types- single line comment	java will ignore comment
		// type of data 
		//in any programming language first you have to understand what are the type of data available
		//it can be a numeric data 
		//it can be string data
		//Data types are divided into two groups: at top level
		//primitive data type
							//Integer:byte short int long
							//floating point: float double
							//character:char
		                   //Boolean :boolean
		//Non-primitive data types
								//String Arrays and classes
		
		//1. byte
		//size 1 byte =8 bits
		//range -128to 127
		
		byte b=10;
		byte b1=-4;
		//byte b2=-129;
		//byte b2=128;
		b=4;
		System.out.println(b);
		
		//2. short
		//size 2 byte=16 bits
		//range -32768 to 32767
		
		short s=10;
		//short s1=-32769;
		//short s2=32768;
		
		//3. int
		//size 4bytes=32 bits
		//range -2^31to 2^31-1
		int i=4;
		int p=0;
		int q=10000;
		int sum=p+q;
		
		//4. long
		//size 8bytes=64bits
		//range -2^63to2^63-1
		
		long l=10000000;
		//real life example population of india
		//distance bt earth and sun
		//distance btw earth and moon
		
		//5. float-decimal number
		//size 4 bytes=32 bits
		float f=12.43f;
		float f1=(float)4.4;
		
		System.out.println(f+f1);
		
		float f2=100f;
		System.out.println(f2);
		
		//6. double
		//size 8bytes=64 bits
		double d=12.4;
		double d1=f;
		
		//7. char
		//2 byte=16bits
		//character can be numeric character ,alphabetic character special character also
		//single quotes and single value
		char c='d';
		char c1='1';
		//char c2='dd';
		//char c3='10';
		char c4='$';
		char gender='m';
		char executionFlag='y';
		
		System.out.println(gender);
		
		//8. Boolean
		//size 1 bit
		boolean b4=true;
		boolean isActive=true;
		boolean isUSCitizen=false;
		
		System.out.println(b4);
		isActive=false;
		System.out.println(isActive);
		
		
	}
	
}
