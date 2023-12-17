package com.qa.seleniumsessions;

/*
 * How To Use HashMap In Selenium
 * maintain login credentials
 */
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {

		Map<String, String> user = new Hashtable<String, String>();
		user.put("admin", "admin_admin");
		user.put("patient", "tom@gmail.com_test@123");
		user.put("doctor", "peter@gmail.com_test@1234");

		System.out.println(user.get("admin"));

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://trcrm.com/login/en");

//		driver.findElement(By.id("_username")).sendKeys(user.get("admin").split("_")[0]);
//		driver.findElement(By.id("_password")).sendKeys(user.get("admin").split("_")[1]);

		// doLogin(driver, user, "admin");
		doLogin(driver, getUserMap(), "admin");

	}

	public static Map<String, String> getUserMap() {
		Map<String, String> user = new Hashtable<String, String>();
		user.put("admin", "admin_admin");
		user.put("patient", "tom@gmail.com_test@123");
		user.put("doctor", "peter@gmail.com_test@1234");

		return user;
	}

	public static void doLogin(WebDriver driver, Map<String, String> map, String user) {
		driver.findElement(By.id("_username")).sendKeys(map.get("admin").split("_")[0]);
		driver.findElement(By.id("_password")).sendKeys(map.get("admin").split("_")[1]);

	}
}
