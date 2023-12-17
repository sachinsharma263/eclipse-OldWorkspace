package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysAndClickByActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

//		Actions action = new Actions(driver);
//		action.sendKeys(username, "test@gmail.com").build().perform();
//		action.sendKeys(password, "ddddddd").build().perform();
//		action.click(loginBtn).build().perform();
		
		doActionSendkeys(driver, username, "test@gmail.com");
		doActionSendkeys(driver, password, "ddddddd");
		doActionClick(driver, loginBtn);

	}
	
	public static void doActionSendkeys(WebDriver driver,WebElement element,String value) {
		Actions a=new Actions(driver);
		a.sendKeys(element, value).build().perform();
	}
	public static void doActionClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.click(element).build().perform();
	}

}
