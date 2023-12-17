package com.qa.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String username = "admin";
		String password = "admin";

		driver.get("http://" + username + ":" + password + "@"+"the-internet.herokuapp.com/basic_auth");

	}

}
