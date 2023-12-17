package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		By contentMenu = By.className("menulink");
		By Courses = By.linkText("COURSES");

		// WebElement contentElement=driver.findElement(contentMenu);

		// Actions action=new Actions(driver);
		// action.moveToElement(contentElement).build().perform();

		// WebElement coursesElement=driver.findElement(Courses);
		// coursesElement.click();

		doMoveToElement(driver, contentMenu);
		getElement(driver, Courses).click();

	}

	public static void doMoveToElement(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(driver, locator)).build().perform();

	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

}
