package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.GenericMethods;

public class ExplictWaitConcept {

	public static void main(String[] args) {
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		By signInLink = By.linkText("Sign in");

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");
		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.presenceOfElementLocated(signInLink));

		waitForPresenceOfElementLocated(driver, signInLink, 10);
		driver.findElement(signInLink).click();

		waitForPresenceOfElementLocated(driver, username, 10);

		driver.findElement(username).sendKeys("test@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();

	}

	public static void waitForPresenceOfElementLocated(WebDriver driver, By locator, int time) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement waitForVisibiltyOFElement(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
		
		return GenericMethods.getElement(driver, locator);
	}

}
