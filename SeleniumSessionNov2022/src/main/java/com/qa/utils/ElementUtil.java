package com.qa.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;
	Actions action;
	WebDriverWait wait;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		wait = new WebDriverWait(driver, AppConstants.DEFAULT_TIME);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("some error occured while creating the web element: " + locator);
		}
		return element;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public Boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String doGetTitle() {
		return driver.getTitle();
	}

	public void doActionClick(By locator) {
		action.click(getElement(locator)).build().perform();
	}

	public void doActionSendKeys(By locator, String value) {
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public void doMoveToElement(By locator) {
		action.moveToElement(getElement(locator)).build().perform();
	}

	public void waitForPresenceOfElementLocated(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void waitForVisibilityOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

	public List<WebElement> getListOfElement(By locator) {
		return driver.findElements(locator);
	}

	public void doQuit() {
		driver.quit();
	}
}
