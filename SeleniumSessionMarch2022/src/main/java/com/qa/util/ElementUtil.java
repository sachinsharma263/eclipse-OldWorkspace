package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;
	WebDriverWait wait;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);

	}

	public WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);

		} catch (Exception e) {
			System.out.println("some error occured while the creating web element " + locator);
		}
		return element;
	}

	public WebElement getElement2(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public void doSendKeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);
	}

	public void doSendKeys2(By locator, String value) {
		getElement2(locator).sendKeys(value);
	}

	public void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	public boolean isDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

	public String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

	public String doGetTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void quit() {
		driver.quit();
	}

	public void presenceOfElementLocated(By locator) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
}
