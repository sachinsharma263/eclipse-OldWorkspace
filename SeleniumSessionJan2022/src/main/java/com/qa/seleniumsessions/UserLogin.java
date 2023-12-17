package com.qa.seleniumsessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * HashMap can be used in selenium script 
 * Requirement:maintain user data in Map
 */
public class UserLogin {

	public static void main(String[] args) {

//		Map<String, String> userData = new HashMap<String, String>();
//
//		userData.put("admin", "admin_admin");
//		userData.put("doctor", "roger_ind");
//		userData.put("patient", "patient_patient");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://trcrm.com/login/en");

//		driver.findElement(By.id("_username")).sendKeys((userData.get("admin").split("_"))[0]);
//		driver.findElement(By.id("_password")).sendKeys((userData.get("admin").split("_"))[1]);
		
		doLogin(driver, getMap(), "admin");
	}

	public static Map<String, String> getMap() {
		Map<String, String> userData = new HashMap<String, String>();
		userData.put("admin", "admin_admin");
		userData.put("doctor", "roger_ind");
		userData.put("patient", "patient_patient");
		return userData;
	}

	public static void doLogin(WebDriver driver,Map<String, String> map,String user) {
		driver.findElement(By.id("_username")).sendKeys((map.get(user).split("_"))[0]);
		driver.findElement(By.id("_password")).sendKeys((map.get(user).split("_"))[1]);
	}
}
