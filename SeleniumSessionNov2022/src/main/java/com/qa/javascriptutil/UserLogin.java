package com.qa.javascriptutil;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * HashMap can be used in selenium script 
 * Requirement:maintain user data in Map- you dont maintain your username and password in property file,you can maintain as a map in script.
 */
public class UserLogin {

	public static void main(String[] args) {

		Map<String, String> userMap = new HashMap<String, String>();

		userMap.put("admin", "admin_admin");
		userMap.put("doctor", "doctor@123_doctor");
		userMap.put("patient", "patient@123_patient");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://trcrm.com/login/en");

//		driver.findElement(By.id("_username")).sendKeys(userMap.get("admin").split("_")[0]);
//		driver.findElement(By.id("_password")).sendKeys(userMap.get("admin").split("_")[1]);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();

		doLogin(driver, getMap(), "doctor");
		
	}

	public static Map<String, String> getMap() {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("doctor", "doctor@123_doctor");
		userMap.put("patient", "patient@123_patient");

		return userMap;

	}

	public static void doLogin(WebDriver driver, Map<String, String> map, String key) {
		driver.findElement(By.id("_username")).sendKeys(map.get(key).split("_")[0]);
		driver.findElement(By.id("_password")).sendKeys(map.get(key).split("_")[1]);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
