package com.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		wait=new WebDriverWait(driver, AppConstants.DEFAULT_TIME);
		action=new Actions(driver);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		 element= driver.findElement(locator);
		return element;
		}
		catch (Exception e) {
			System.out.println("some exception occured while creating the web element "+locator);
			e.printStackTrace();
		}
		return element;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public Boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	public String doGetTitle() {
		return driver.getTitle();
	}
	public void doQuit() {
		driver.quit();
	}
	public List<WebElement> getList(By locator) {
		return driver.findElements(locator);
	}
	public void waitForPresenceOfElement(By locator) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	public void doActionClick(By locator) {
		action.click(getElement(locator)).build().perform();;
	}
	public void doActionSendKeys(By locator,String value) {
		action.sendKeys(getElement(locator),value).build().perform();
	}
	public void moveToElement(By locator) {
		action.moveToElement(getElement(locator)).build().perform();
	}
}
