package com.qa.datatypes;
/*Java is tightly coupled language where variable we are using,we have to provide data type
 * 
 * Data Type:
 * 1. what type of value the variable can store/type of data a variable can store
 * 2. How big value the variable can store/size of the data
 * 
 * a variable is a container which contains some value,variable can capture some memory in the RAM
 * types of variable:
 * 1.on the basis of value the variable can store and the size of value
 * 2. on the basis of scope(instance,static,local variables)
 * 
 */
public class DataTypes2 {
	
	byte b=128;//Type mismatch: cannot convert from int to byte
	short s=128;
	int i=1234567;
	
	int j=12345678901;//The literal 12345678901 of type int is out of range 
	//by default non decimal integer value is consider as int by JVM
	
	long k=12345678901L;

	int var=10.5;//Type mismatch: cannot convert from double to int
	long l=10000000000l;//The literal 10000000000 of type int is out of range 
	//suffix l is must otherwise compiler will treat it as integer
	
	float f2=10;//we can store non decimal integer value in float but it will be treated as 10.0
	
	float f=10.0f;//Type mismatch: cannot convert from double to float
	//suffix f is must otherwise will treat it as a double
	
	double d=10.5;
	
	char c='a';
	
	boolean b=false;
}
