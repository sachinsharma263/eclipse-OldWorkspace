package com.qa.staticnonstaticconcept;

public class StaticAndNonStatic {

	String name;
	static int age;
	public static void main(String[] args) {
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.getDiscount();
		obj.getPrice();
		
		//call static
		System.out.println(age);
		//System.out.println(name);
		getPrice();
		//getDiscount();
		
		//call by class name
		System.out.println(StaticAndNonStatic.age);
		StaticAndNonStatic.getPrice();
		
		//StaticAndNonStatic.getDiscount();
	}
	public void getDiscount() {
		System.out.println("getDiscount");
	}
	public static void getPrice() {
		System.out.println("getPrice");
	}

}
