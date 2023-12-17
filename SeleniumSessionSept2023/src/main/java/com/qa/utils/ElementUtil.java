package com.qa.utils;

import java.time.Duration;

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
		wait = new WebDriverWait(driver, Duration.ofSeconds(AppConstants.DEFAULT_TIME_OUT));
		jsUtil = new JavaScriptUtil(driver);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("some exception occured while creating the web element: " + locator);
		}
		return element;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public boolean doIsDisplayed(By locator) {
		
		
		return getElement(locator).isDisplayed();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();

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

	public WebElement waitForPresenceOfElementLocated(By locator) {
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
