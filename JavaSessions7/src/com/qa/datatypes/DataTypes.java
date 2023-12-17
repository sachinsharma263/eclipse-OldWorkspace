 package com.qa.datatypes;

public class DataTypes {

	public static void main(String[] args) {

		//in any programming language first we have to understand what all data type are available
		// Data Types: type of data a variable can store
		// Data Types : 2 types at top level
		// Primitive Data Type: defined by the programming language
		    //in java we have 8 primitive data types
			// Integer type/family(non decimal integer value):byte,short,int,long
			// Floating type(decimal value): float,double
			//Character:char
			//Boolean:boolean
		// Non primitive Data Types:defined by the programmer
		    //in this the data type of variable is the class whose object it is going to refer
		    // Test t=new Test()--> Test is the data type of t
			  //String,Array,ArrayList, class
		
		

		// 1. byte
		// size: 1byte =8 bits
		// range:-128 to 127
		byte b = 10;// b variable b is declared and initialized memory allocation
		byte b1 = 0;
		byte b2 = -20;
		byte b3 = -128;
		byte b4 = 127;
		// byte b5=128;
		System.out.println(b);
		
		byte b5=0;
		byte b6=0;
		byte b7=34+93;
		

		// 2. short
		// size: 2 byte=16 bits
		// range: -32768 to 32767
		short s = 10;
		short s1 = 32767;

		// 3. int
		// size:4 bytes =32 bits
		// range: -2^31 to 2^31-1
		int x = 10;
		int y = 10000;
		int c = x + y;
		System.out.println(c);

		// 4. long
		// size: 8 bytes=64 bits
		// range: -2^63to 2^63-1
		long l = 1000000;
		long l2=10000000000l;
  
		// 5. float
		// size:4 bytes=32 bits

		float f = 12.33f;
		System.out.println(f);
		float f2 = (float) 34.33;
		float f3 = 10;

		// 6. double
		// size:8 bytes=64 bits
		double d = 10;
		System.out.println(d);

		// 7. char
		// size:2 bytes=16 bits
		char c1 = 'a';
		char c2 = '1';
		char c3 = '$';

		char gender = 'm';
		char exceutionFlag = 'y';

		// 8. Boolean:true and false
		// size:aprox 1 bits
		//not defined in java,at runtime JVM decide what size of memory to be assign and also depend on version of JVM 
		boolean bb = true;
		boolean bb2 = false;

		boolean IsActive = true;
		boolean isUsCitizen = false;
		boolean isVisible = false;

	}

}
