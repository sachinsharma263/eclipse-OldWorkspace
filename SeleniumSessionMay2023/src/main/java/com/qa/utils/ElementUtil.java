package com.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.javascriptutil.JavaScriptUtil;

public class ElementUtil {

	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	JavaScriptUtil jsUtil;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		wait = new WebDriverWait(driver, AppConstants.DEFAULT_TIME_OUT);
		jsUtil = new JavaScriptUtil(driver);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;

		try {
			element = driver.findElement(locator);
			jsUtil.flash(element);
			return element;
		} catch (Exception e) {
			System.out.println("some exception occured while creating the web element: " + locator);
		}
		return element;
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String doGetTitle() {
		return driver.getTitle();
	}

	public void doActionSendKeys(By locator, String value) {
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionClick(By locator) {
		action.click(getElement(locator)).build().perform();
	}

	public void doActionMoveToElement(By locator) {
		action.moveToElement(getElement(locator)).build().perform();
	}

	public WebElement waitForPresenceOfElementcated(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		return getElement(locator);
	}

	public void waitForVisibiltyOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

	public String waitForTitle(String title) {
		wait.until(ExpectedConditions.titleIs(title));

		return driver.getTitle();
	}

	public void doQuit() {
		driver.quit();
	}
}
