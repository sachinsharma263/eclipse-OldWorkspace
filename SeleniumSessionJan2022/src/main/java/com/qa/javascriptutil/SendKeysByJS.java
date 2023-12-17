package com.qa.javascriptutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysByJS {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		jsUtil.sendKeysUsingJSWithId("username", "Test@gmail.com");

		jsUtil.sendKeysUsingJSWithId("password", "test@123");

		WebElement element = driver.findElement(By.xpath("//button[@id='loginBtn']"));

		Thread.sleep(3000);

		//driver.findElement(By.id("loginBtn")).click();
		
		 jsUtil.clickElementByJS(element);

	}

}
