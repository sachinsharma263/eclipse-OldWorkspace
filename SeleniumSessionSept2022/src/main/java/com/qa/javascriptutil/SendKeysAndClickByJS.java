package com.qa.javascriptutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.GenericMethods;

public class SendKeysAndClickByJS {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		GenericMethods.doClick(driver, By.linkText("Sign in"));
		
		Thread.sleep(3000);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		jsUtil.sendKeysUsingJSWithId("username", "test@gmail.com");
		jsUtil.sendKeysUsingJSWithId("password", "test@123");
		
		jsUtil.clickElementByJS(GenericMethods.getElement(driver, By.id("loginBtn")));
		
		/*
		 * Actions action=new Actions(driver);
		 * action.click(GenericMethods.getElement(driver,
		 * By.id("loginBtn"))).build().perform();
		 */

	}

}
