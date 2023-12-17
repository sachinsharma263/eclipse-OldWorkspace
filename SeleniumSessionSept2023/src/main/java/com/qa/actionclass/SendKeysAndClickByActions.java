package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysAndClickByActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		By emailId = By.id("username");
		By passwordBy = By.id("password");
		By loginBtn = By.id("loginBtn");

		WebElement loginButton = driver.findElement(loginBtn);

		Actions action = new Actions(driver);

		action.sendKeys(driver.findElement(emailId), "test@gmail.com").build().perform();
		action.sendKeys(driver.findElement(passwordBy), "test@123").build().perform();

		action.click(loginButton).build().perform();

	}

}
