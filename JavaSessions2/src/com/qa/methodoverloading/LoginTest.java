package com.qa.methodoverloading;

public class LoginTest {

	public static void main(String[] args) {

		Login l = new Login();
		l.login();
		l.login("username", "password");
		l.login(9999999l, "username");
	}
}
