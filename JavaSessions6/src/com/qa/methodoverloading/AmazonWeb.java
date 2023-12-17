package com.qa.methodoverloading;

/**
 * Real life example of method overloading is Amazon Web -search we can search-
 * default search without entering any details in search box enter product name
 * enter product name and price enter product name ,price and colour
 * 
 * e commerce
 * 
 * @author Dell
 *
 */
public class AmazonWeb {

	public void search() {
		System.out.println("Hi.. this is default search");
	}

	public void search(String name) {
		System.out.println("Hi.. this is search by name");
	}

	public void search(String name, String color) {
		System.out.println("Hi.. this is search by name and color");
	}

	public void search(String name, String color, int price) {
		System.out.println("Hi.. this is search by name,color and price");
	}

	public static void main(String[] args) {

		AmazonWeb aw = new AmazonWeb();
		aw.search();
		aw.search("Apple");
		aw.search("Apple", "white");
		aw.search("Apple", "white", 1000);
	}
}
