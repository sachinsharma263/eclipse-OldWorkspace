package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.GenericMethods;

public class ExplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		By signInLink = By.linkText("Sign in");

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://app.hubspot.com/signup");

		GenericMethods.getElement(driver, signInLink).click();

		//wait.until(ExpectedConditions.presenceOfElementLocated(username));
		// wait.until(ExpectedConditions.visibilityOf(GenericMethods.getElement(driver,
		// username)));
		
		waitForPresenceOfElementLocated(driver, username, 10);

		driver.findElement(username).sendKeys("test@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();

	}

	public static void waitForPresenceOfElementLocated(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}
	public static WebElement waitForVisibiltyOFElement(WebDriver driver,By locator,int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(GenericMethods.getElement(driver, locator)));
		
		return GenericMethods.getElement(driver, locator);
	}

}