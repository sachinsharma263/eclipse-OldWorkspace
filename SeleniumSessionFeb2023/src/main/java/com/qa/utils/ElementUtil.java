package com.qa.utils;

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
	JavaScriptUtil jsUtil;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		jsUtil = new JavaScriptUtil(driver);
	}

	/**
	 * This method is used to create the web element on the basis of By locator
	 * 
	 * @param locator
	 * @return element
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			jsUtil.flash(element);
			return element;
		} catch (Exception e) {
			System.out.println(
					"some exception occured while creating the web element: " + locator + "\n" + e.getMessage());
		}
		return element;
	}

	/**
	 * This method is used to click one the web element
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}

	/**
	 * This method is used to get the text of element
	 * @param locator
	 * @return
	 */
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	/**
	 * This method is used to verify whether element is displayed or not
	 * @param locator
	 * @return
	 */
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	/**
	 * This method is used to get the title of the page
	 * @return
	 */
	public String doGetTitle() {
		return driver.getTitle();
	}

	/**
	 * This method is used to pass the value
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
/**
 * This method is used to close the browser
 */
	public void doQuit() {
		driver.quit();
	}

	public void doActionSendKeys(By locator, String value) {
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionClick(By locator) {
		action.click(getElement(locator)).build().perform();
	}

	public void doMoveToElement(By locator) {
		action.moveToElement(getElement(locator)).build().perform();
	}

	public void waitForPresenceOfElementedLocated(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public String waitForTitlePresent(String title) {
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
}
