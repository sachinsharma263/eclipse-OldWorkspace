package com.qa.staticanonstaticconcept;

public class StaticAndNonStaticConcept {

	String name = "Tom";
	static int age = 30;

	public static void main(String[] args) {

		// call non static
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		System.out.println(obj.age);

		obj.getPrice();
		obj.getDiscount();

		// call static within class
		System.out.println(age);
		getDiscount();

		// call static by classname
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.getDiscount();

//StaticAndNonStaticConcept.name;
//StaticAndNonStaticConcept.getPrice();
	}

	public void getPrice() {
		System.out.println("getPrice");
	}

	public static void getDiscount() {
		System.out.println("getDiscount");
	}

}
