package com.qa.staticnonstaticconcept;

public class StaticAndNonStatic {

	String name="Naveen";
	static int age=30;
	
	public void getDiscount() {
		System.out.println("getDiscount");
	}
	public static void getPrice() {
		System.out.println("getPrice");
	}
	
	public static void main(String[] args) {
		
		StaticAndNonStatic obj =new StaticAndNonStatic();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.getDiscount();
		obj.getPrice();
		
		//call static
		System.out.println(age);
		getPrice();
		
		//System.out.println(name);
		//getDiscount();
		
		System.out.println(StaticAndNonStatic.age);
		StaticAndNonStatic.getPrice();
		
		//System.out.println(StaticAndNonStatic.getPrice());
	}
}
