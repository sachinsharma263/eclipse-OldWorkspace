package com.qa.seleniumsessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * HashMap can be used in selenium script 
 * Requirement:maintain user data in Map
 * @author Dell
 *
 */
public class UserLogin2 {

	public static void main(String[] args) {

		HashMap<String, String> user = new HashMap<String, String>();
		user.put("admin", "admin_admin");
		user.put("doctor", "roger_roger123");
		user.put("patient", "patient_patient123");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://trcrm.com/login/en");

//		driver.findElement(By.id("_username")).sendKeys((user.get("admin").split("_"))[0]);
//		driver.findElement(By.id("_password")).sendKeys((user.get("admin").split("_"))[1]);

		//doLogin(driver, user, "admin");
		doLogin(driver, getUserMap(), "admin");
	}

	public static Map<String, String> getUserMap() {
		
		Map<String, String> user = new HashMap<String, String>();
		user.put("admin", "admin_admin");
		user.put("doctor", "roger_roger123");
		user.put("patient", "patient_patient123");
		
		return user;

	}

	public static void doLogin(WebDriver driver, Map<String, String> map, String user) {
		driver.findElement(By.id("_username")).sendKeys((map.get(user).split("_"))[0]);
		driver.findElement(By.id("_password")).sendKeys((map.get(user).split("_"))[1]);
	}
}
