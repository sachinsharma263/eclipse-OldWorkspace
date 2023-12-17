package com.qa.stringconcept;
/*
 * in java string is a class not a data type and can be instantiated like other classes
 * inside package java.lang
 * 2 different ways of creating string either by new keyword or without new keyword
 * anything inside double quotes is a string
 * string why class?because when java developers start developing the java,in any application the most frequent value used is string.so java developer thought
 * that we will encounter string value multiple times while creating an application so its better to provide string as a class with predefined methods/api so
 * that developer/user doesnt waste time in developing methods for string manipulation
 * 
 * string is immutable(anything that cannot change/update):once created cannot change,update or modify,each time we try updating a new string object created
 */
public class StringConcept2 {

	public static void main(String[] args) {
		
		String s="Rahul";//without new keyword still object created,this is special case
		//a new object get created inside scp
		//for better memory utilisation we have scp
		//whenever you tried creating string this way,JVM search whether string literal already exist in SCP or not and if not then create a new object
		//in SCP
		//reuse the object
		
		String s2="Rahul";//s and s2 are string variable
		
		if (s.equals(s2)) {
			System.out.println("equal");
		}
		System.out.println(s.hashCode()+"\n"+s2.hashCode());
		
		s2="Arora";
		
		System.out.println(s+"\n"+s2);
		System.out.println(s.hashCode()+"\n"+s2.hashCode());
		System.out.println(s+"\n"+s2);
		
		String s3=new String("way2automation");//there are chances that 2 objects gets created one in heap sure due to new keyword and another in SCP due
		//to string literal if not present in SCP
		String s4=new String("Rahul");//1 object created in heap,Rahul already exist in SCP so no new object in SCP

		// string concatenation-->way to combine two or more string into single string using + operator
		//string values can be concatenate with any other data type
		
		System.out.println(10 + 3 + s + s2);

		String s5 = new String("naveen");

		System.out.println(s5.hashCode());
		
		System.out.println(s5.concat("java").hashCode());
		
		s5=s5.concat("java2");
		
		System.out.println(s5.hashCode());
		
		//optimize memory utilisation->string is immutable
		
		String s6="way";
		String s7="2";
		String s8="automation";
		
		System.out.println(s6+s7+s8);
		//System.out.println(s6,s7,s8);
		
		System.out.println(s+10*15+s2);
		
		System.out.println(s6+(10+15)+s7+s8);
		
		//System.out.println(s-s2);
		
		
	}
	
	
}
