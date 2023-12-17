package com.qa.javasessions;

public class NumberOfObjects {

	static int numberOfObjects;
	public NumberOfObjects()
	{
		numberOfObjects++;
	}
	
	public static void main(String[] args) {
		
		NumberOfObjects obj=new NumberOfObjects();
		NumberOfObjects obj2=new NumberOfObjects();
		NumberOfObjects obj3=new NumberOfObjects();
		NumberOfObjects obj4=new NumberOfObjects();
		NumberOfObjects obj5=new NumberOfObjects();
		NumberOfObjects obj6=new NumberOfObjects();
		
		System.out.println(numberOfObjects);
	}
}
