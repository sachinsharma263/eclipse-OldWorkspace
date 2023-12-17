package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	WebDriver driver;
	

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
		
	}

	public WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some error occured while creating the web element: " + locator);
		}
		return element;
	}

	public void doSendKeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);
	}

	public void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	public String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

	public boolean isDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

	public void doQuit() {
		driver.quit();
	}
	
}
