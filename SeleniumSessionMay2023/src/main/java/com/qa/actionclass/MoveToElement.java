package com.qa.actionclass;

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

		By content = By.className("menulink");
		By courses = By.linkText("COURSES");

//		WebElement contentElement = driver.findElement(By.className("menulink"));
//
//		Actions action = new Actions(driver);
//		action.clickAndHold(contentElement).build().perform();
//
//		WebElement CoursesElement = driver.findElement(By.linkText("COURSES"));
//
//		CoursesElement.click();
		doMoveToElement(driver, content);
		doActionClick(driver, courses);

	}

	public static void doMoveToElement(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(driver, locator)).build().perform();
	}

	public static void doActionClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(driver, locator)).build().perform();
	}
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
		element= driver.findElement(locator);
		return element;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
}
