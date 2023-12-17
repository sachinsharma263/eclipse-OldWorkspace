package com.qa.seleniumsessions;

/*
 * How To Use HashMap In Selenium
 * maintain login credentials
 */
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.GenericMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) throws InterruptedException {

//		Map<String, String> userMap = new HashMap<String, String>();
//		userMap.put("admin", "admin@gmail.com_admin");
//		userMap.put("doctor", "doctor_doctor");
//		userMap.put("patient", "patient");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://app.hubspot.com");

		Thread.sleep(3000);
//		GenericMethods.doSendKeys(driver, By.id("username"), userMap.get("admin").split("_")[0]);
//		driver.findElement(By.id("password")).sendKeys(userMap.get("admin").split("_")[1]);

		doLogin(driver, getUserMap(), "admin");

	}

	public static Map<String, String> getUserMap() {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin@gmail.com_admin");
		userMap.put("doctor", "doctor_doctor");
		userMap.put("patient", "patient");

		return userMap;
	}

	public static void doLogin(WebDriver driver, Map<String, String> userMap, String userKey) {
		GenericMethods.doSendKeys(driver, By.id("username"), userMap.get(userKey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get(userKey).split("_")[1]);
	}

}
