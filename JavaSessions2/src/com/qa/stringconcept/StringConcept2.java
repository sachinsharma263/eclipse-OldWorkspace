package com.qa.stringconcept;

public class StringConcept2 {

	public static void main(String[] args) {

		String s1 = "Rahul";
		String s2 = "Rahul";
		String s3 = "rahul";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());// hashcode gives address in human readable form

		System.out.println(s3.hashCode());

		s1 = "Rahul Arora";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.hashCode() + "\n" + s2.hashCode());

		// 2 way of creating string object by using new keyword
		String s4 = new String("Naveen");// 2 objects were created one in heap and other in scp, s4 string
											// variable/reference variable will point to object in heap, scp object wont
											// have string variable and eligible for gc
		String s5 = new String("Rahul");// 1 object created in heap, scp already have object with literal as Rahul

		System.out.println(10+3+s1+s2);
		
		String s6=new String("Deepak");
		s6.concat("java");
		
		System.out.println(s6);
		
		s6=s6.concat("java");
		System.out.println(s6);
	}
}
