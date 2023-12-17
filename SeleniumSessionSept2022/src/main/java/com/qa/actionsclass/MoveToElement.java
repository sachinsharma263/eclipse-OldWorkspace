package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		//WebElement content = driver.findElement(By.className("menulink"));

		/*
		 * Actions action=new Actions(driver);
		 * 
		 * action.moveToElement(content).build().perform();
		 */
		By content=By.className("menulink");
		By courses=By.linkText("COURSES");
		
		WebElement contentElement=getElement(driver, content);

		moveToElement(driver, contentElement);

		//driver.findElement(By.linkText("COURSES")).click();
		
		getElement(driver, courses).click();

	}

	public static void moveToElement(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public static WebElement getElement(WebDriver driver,By locator) {
		return driver.findElement(locator);
	}

}
