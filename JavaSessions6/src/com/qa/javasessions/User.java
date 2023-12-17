package com.qa.javasessions;

public class User {

	String name;
	int age;
	long phoneNumber;
	String address;
	char gender;
	boolean isActive;

	public User() {

	}

	public User(String name, int age, long phoneNumber, String address, char gender) {

		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.gender=gender;
		
	}
	

	public User(String name, int age, long phoneNumber, String address, char gender, boolean isActive) {
	
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.isActive = isActive;
	}

	private User(String name) {
		super();
		this.name = name;
	}

	public static void main(String ar[]) {
		User u1 = new User();
		u1.name = "naveen";
		u1.age = 32;

		User u2 = new User("");

		
		User obj = new User("naveen",32,999999999,"delhi",'m');
		User obj2 = new User("mukesh",32,999999999,"pune",'m',true);
		
		System.out.println(obj.name+" "+obj.age+" "+obj.phoneNumber+" "+obj.address+" "+obj.isActive);
		System.out.println(obj2.name+" "+obj2.age+" "+obj2.phoneNumber+" "+obj2.address+" "+obj2.isActive);

	}

}
