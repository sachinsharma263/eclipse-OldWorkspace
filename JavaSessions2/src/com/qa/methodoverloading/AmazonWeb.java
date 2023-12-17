package com.qa.methodoverloading;

/**
 * Real life example of method overloading is Amazon Web -serach we can search-
 * default search without entering any details in search box enter product name
 * enter product name and price enter product name ,price and colour
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

	public void search(String name, int price) {
		System.out.println("Hi.. this is search by name and price");
	}

	public void search(String name, int price, String colour) {
		System.out.println("Hi.. this is search by name ,price and colour");
	}
	public static void main(String[] args) {
		AmazonWeb aw=new AmazonWeb();
		aw.search();
		aw.search("Apple");
		aw.search("Apple", 2000);
		aw.search("Apple", 2000, "black");
	}
}
