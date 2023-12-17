package com.qa.staticnnonstaticconcept;

public class StaticAndNonStaticConcept {

	String name = "Tom";
	static int age = 30;

	public static void main(String[] args) {

		//call non static
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.getDiscount();
		obj.getPrice();
		
		//call static
		System.out.println(age);
		//System.out.println(name);//Cannot make a static reference to the non-static field name
		getPrice();
		//getDiscount();
		
		//call by classname
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.getPrice();
		
	}

	public void getDiscount() {
		System.out.println("getDiscount");
	}

	static public void getPrice() {
		System.out.println("getPrice");
	}

}
