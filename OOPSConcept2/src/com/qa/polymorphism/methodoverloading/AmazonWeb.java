package com.qa.polymorphism.methodoverloading;

/**
 * Real life example of method overloading for e commerce point of view is
 * Amazon Web -search we can search- default search without entering any details
 * in search box enter product name enter product name and price enter product
 * name ,price and colour
 * 
 * @author Dell
 *
 */
public class AmazonWeb {

	public void search() {
		System.out.println("Hi.. this is default search");
	}

	public void search(String productName) {
		System.out.println("Hi.. this is search by name");
	}

	public void search(String productName, String color) {
		System.out.println("Hi.. this is search by name and color");
	}

	public void serach(String productName, String color, int price) {
		System.out.println("Hi..this is search by name,color and price");
	}

	public static void main(String[] args) {

		AmazonWeb aw = new AmazonWeb();
		aw.search();
		aw.search("Apple");
		aw.search("Apple", "white");
		aw.serach("Apple", "white", 1000);
	}
}
