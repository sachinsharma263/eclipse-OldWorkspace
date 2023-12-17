package com.qa.javasessions;

public class NullReference {

	String name;
	int age;

	public NullReference(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public NullReference() {

	}

	public static void main(String[] args) {

		NullReference obj;
		obj = new NullReference();

		System.out.println(obj);
		System.out.println(obj.hashCode());

		obj = null;

		System.out.println(obj);
		
		NullReference obj2 = null;
		//System.out.println(obj2.name);
		obj2=new NullReference("Neha",30);
		System.out.println(obj2.name+" "+obj2.age);
		
		obj2=null;
		
		System.out.println(obj2.name);
	}

}
