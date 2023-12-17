package com.qa.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutheticationPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		String userName = "admin";
		String passWord = "admin";

		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		driver.get("https://" + userName + ":" + passWord + "@the-internet.herokuapp.com/basic_auth");

	}
}
