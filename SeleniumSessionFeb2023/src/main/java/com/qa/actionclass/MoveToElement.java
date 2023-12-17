package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		By contentMenu = By.className("menulink");
		By Courses = By.linkText("COURSES");

//		Actions action = new Actions(driver);
//
//		action.moveToElement(contentElement).build().perform();
//
	

		doMoveToElement(driver, contentMenu);
		
		doActionClick(driver, Courses);

	}

	public static void doMoveToElement(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(driver, locator)).build().perform();
	}

	public static void doActionClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(driver, locator)).build().perform();
	}
	public static WebElement getElement(WebDriver driver,By locator) {
		return driver.findElement(locator);
	}

}
