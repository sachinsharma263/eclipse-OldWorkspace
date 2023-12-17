package com.qa.stringconcept;

public class StringBufferConcept  {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		sb.append("Naveen");
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Java");
		System.out.println(sb);
		System.out.println(sb.length());

		System.out.println(sb.charAt(1));

		sb.deleteCharAt(0);
		System.out.println(sb);

		sb.delete(0, 2);
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer("Naveen");
		System.out.println(sb2.capacity());
		sb2.append("12345678901234567");
		System.out.println(sb2.capacity());
		
		
		StringBuffer sb3=sb;
		System.out.println(sb3);
		System.out.println(sb.equals(sb3));
		
		System.out.println(sb.indexOf("e"));
		System.out.println(sb.lastIndexOf("e"));
		
		System.out.println(sb);
		sb.replace(0, 3, "m");
		System.out.println(sb);
		
		System.out.println(sb.subSequence(0, 3));
		System.out.println(sb.substring(0, 3));
		System.out.println(sb);

	}
}
