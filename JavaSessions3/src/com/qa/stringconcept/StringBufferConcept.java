package com.qa.stringconcept;

public class StringBufferConcept {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
	
		System.out.println(sb.capacity());
		
		sb.append("hello");
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		
		sb.append("deepak javaa");
		System.out.println(sb.capacity());//old capacity*2+2
		System.out.println(sb.hashCode());
		
		System.out.println(sb.length());
		
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		
		sb.append("hi");
		System.out.println(sb);
		
		System.out.println(sb.substring(1));
		
		System.out.println(sb);
		System.out.println(sb.delete(1, 3));
		
		System.out.println(sb);
		
		System.out.println(sb.deleteCharAt(1));
		
		System.out.println(sb.indexOf("h"));
		
		System.out.println(sb.insert(1, "d"));
		
		System.out.println(sb.replace(1, 3, "r"));
		
		System.out.println(sb.reverse());
		
		
		System.out.println(sb.subSequence(1, 3));
		
		sb.setCharAt(1, 'd');
		
		
		
		
	
		
		
	}

}
