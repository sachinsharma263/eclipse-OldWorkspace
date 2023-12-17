package com.qa.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitConcept {

	public static void main(String[] args) {

		WebDriver driver;

		By emailId = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		By SignIn = By.linkText("Sign in");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.id("hs-eu-decline-button")).click();

		driver.findElement(SignIn).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(emailId));

		waitForPresenceOfElementLocated(driver, emailId, 10);

		driver.findElement(emailId).sendKeys("test@gmail.com");
		driver.findElement(password).sendKeys("test@123");

		getElement(driver, loginBtn).click();

	}

	public static void waitForPresenceOfElementLocated(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public static WebElement waitForVisibilityOfElement(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(getElement(driver, locator)));

		return driver.findElement(locator);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);

	}

}
