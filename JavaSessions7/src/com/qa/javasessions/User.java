package com.qa.javasessions;

public class User {

	String name;
	int age;
	long phnNumber;
	String address;
	char gender;
	boolean isActive;

	public User() {

		System.out.println("0 param cost");
	}

	public User(int a) {

		System.out.println("1 param cost");
	}

	public User(String name, int age, long phnNumber, String address, char gender, boolean isActive) {

		this.name = name;
		this.age = age;
		this.phnNumber = phnNumber;
		this.address = address;
		this.gender = gender;
		this.isActive = isActive;

	}

	public User(String name, int age, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		User u = new User();
		u.name = "naveen";
		u.age = 30;
		u.phnNumber = 9999999999l;
		u.address = "delhi";
		u.gender = 'm';
		u.isActive = true;

		User u2 = new User("naveen", 30, 99999999l, "delhi", 'm', true);
		System.out.println(
				u2.name + " " + u2.age + " " + u2.phnNumber + " " + u2.address + " " + u2.gender + " " + u2.isActive);

		User u3 = new User("mukesh", 30, 99999999l, "delhi", 'm', true);

		new User(" ", 32, ' ', false);
	}
}
