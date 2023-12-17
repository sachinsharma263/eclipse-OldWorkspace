package com.qa.wrapperclass;

public class DataConvert {

	public static void main(String[] args) {
		
		//string to int conversion
		String s="100";
		System.out.println(s+20);
		
		int a=Integer.parseInt(s);//convert string value to numeric string value
		System.out.println(a+20);
		
		String s2="100A";
		//int b=Integer.parseInt(s2);// java.lang.NumberFormatException: For input string: "100A" -not a pure numeric string
		
		//string to double
		String s4="10.5";
		double d=Double.parseDouble(s4);
		System.out.println(d+20);
		
		
		//int to string
		String s3=String.valueOf(10);
		System.out.println(s3.length());
		
		int b=20;
		System.out.println(b+10);
		System.out.println(String.valueOf(b)+10);
		
		//boolean to string
		boolean bb=true;
		String s5=String.valueOf(bb);
		if (bb) {
			System.out.println("Pass");
		}
//		if (s5) {//Type mismatch: cannot convert from String to boolean
//			System.out.println("Pass");
//		}
		
		
	}
}
