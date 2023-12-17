package com.qa.javasessions;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		Person p1 = new Person("Naveen", 30);
		Person p2 = new Person("deepak", 37);
		Person p3 = new Person("swati", 38);

		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		System.out.println(p3.name + " " + p3.age);
		
		p2=p1;
		System.out.println("-----------");
		System.out.println(p2.name + " " + p2.age);
		
		
		
	}

}
