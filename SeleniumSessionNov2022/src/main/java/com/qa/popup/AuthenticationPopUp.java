package com.qa.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String username = "admin";
		String password = "admin";

		// driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("http://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
	}

}
