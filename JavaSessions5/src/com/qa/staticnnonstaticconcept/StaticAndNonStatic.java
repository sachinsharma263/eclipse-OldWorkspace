package com.qa.staticnnonstaticconcept;

public class StaticAndNonStatic {

	String name = "Tom";
	static int age = 30;

	public void getDiscount() {
		System.out.println("getDiscount");
	}

	public static void getPice() {
		System.out.println("getPice");
	}

	public static void main(String ar[]) {

		StaticAndNonStatic obj;
		obj = new StaticAndNonStatic();

		System.out.println(obj.name);
		System.out.println(obj.age);

		obj.getDiscount();
		obj.getPice();

		System.out.println(age);
		getPice();
		
		System.out.println(StaticAndNonStatic.age);
		StaticAndNonStatic.getPice();

		// System.out.println(name);
		// getDiscount();
	}
}
