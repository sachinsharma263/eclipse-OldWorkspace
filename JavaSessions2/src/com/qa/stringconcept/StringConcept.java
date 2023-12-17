package com.qa.stringconcept;

public class StringConcept {

	public static void main(String[] args) {
		
		String s="Hello world";
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		System.out.println(a+s);//execution start from left to right: int+string=string concetation will take place
		System.out.println(a+b+s);
		
		System.out.println(s+a+b);
		System.out.println(s+(a+b));
		
		String p="Test";
		String q="Automation";
		System.out.println(p+" "+q);
		
		//65-90-->A-Z
		//a-z-->97-122
		//0-9-->48-57
		char c1='a';//Character concetation will take place on the basis of ASCII values of character
		char c2='b';
		
		System.out.println(c1+c2);
	}
}
