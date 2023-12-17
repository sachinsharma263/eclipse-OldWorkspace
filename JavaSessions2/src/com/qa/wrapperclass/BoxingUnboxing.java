package com.qa.wrapperclass;

/**
 * Boxing-Boxing is the process of wrapping the primitive data type into objects using Wrapper Classes
 * Unboxing- process of unwrapping the objects of Wrapper Classes back to primitive data type
 * The automatic conversion is Autoboxing and AutoUnboxing So java programmer doesn't need to write the conversion code
 * @author Dell
 *
 */
public class BoxingUnboxing {

	public static void main(String[] args) {
		
		//Boxing
		int a=10;
		Integer i=Integer.valueOf(a);
		
		//Autoboxing
		int n=20;
		Integer i2=n;
		
		//unboxing
		int b=i.intValue();
		
		//autounboxing
		int c=i2;
		
		
		
		
		
	}
}
