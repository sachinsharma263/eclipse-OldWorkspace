package com.qa.wrapperclass;

public class DataConvert2 {

	public static void main(String[] args) {

		String s = "10";// pure numeric string
		System.out.println(s + 20);

		int n = Integer.parseInt(s);
		System.out.println(n + 20);
		
		String s4="10.5";
		System.out.println(Double.parseDouble(s4)+1);

		String s2 = "10A";
		// Integer.parseInt(s2); string should be pure numeric

		int i = 10;
		System.out.println(i + 20);
		String s3 = String.valueOf(10);
		System.out.println(10 + s3);
		
		boolean b=true;
		if (b) {
			
		}
//		if(String.valueOf(b))
//		{
//			
//		}
		
		
	}
}
