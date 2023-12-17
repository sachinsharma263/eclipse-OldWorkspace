package com.qa.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		String username = "admin";
		String password = "admin";
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	}

}
