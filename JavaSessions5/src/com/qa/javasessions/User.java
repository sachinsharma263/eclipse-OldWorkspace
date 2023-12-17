package com.qa.javasessions;

public class User {

	String name;
	int age;
	long phnNumber;
	String address;
	char gender;
	boolean isActive;

	public User() {
		System.out.println("0 param const ");
	}

	public User(String name) {
		this.name = name;
		System.out.println("1 param const ");
	}

	public User(String name, int age, long phnNumber, String address, char gender, boolean isActive) {

		this.name = name;
		this.age = age;
		this.phnNumber = phnNumber;
		this.address = address;
		this.gender = gender;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		User user1 = new User();
		user1.name = "naveen";
		user1.age = 30;
		user1.phnNumber = 99999999;
		user1.address = "banglore";
		user1.gender = 'm';
		user1.isActive = true;

		User user2 = new User("");
		user2.name = "mukesh";

		User user3 = new User("naveen", 30, 9999999999l, "banglore", 'm', true);
		User user4 = new User("mukesh", 32, 9999999999l, "banglore", 'm', true);

		System.out.println(user3.name + "\t" + user3.age + "\t" + user3.phnNumber + "\t" + user3.address + "\t"
				+ user3.gender + "\t" + user3.isActive);
		System.out.println(user4.name + "\t" + user4.age + "\t" + user4.phnNumber + "\t" + user4.address + "\t"
				+ user4.gender + "\t" + user4.isActive);


	}
}
