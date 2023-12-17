package com.qa.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutheticationPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		
		String username="admin";
		String password="admin";
		
		
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

}
}
