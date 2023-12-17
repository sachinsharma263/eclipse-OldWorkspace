package com.qa.stringconcept;

public class StringBuilderConcept {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Naveen");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("java");
		System.out.println(sb.length());
		
		System.out.println(sb);
		
	}
}
