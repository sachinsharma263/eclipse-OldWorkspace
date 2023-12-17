package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.GenericMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWaitConcept {
	public static void main(String[] args) {

		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		By SignIn = By.linkText("Sign in");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.id("hs-eu-decline-button")).click();
		
		

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(SignIn));

		driver.findElement(SignIn).click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(email));
		waitForPresenceOfElementLocated(driver, email, 10);

		driver.findElement(email).sendKeys("test@gmail.com");
	}

	public static void waitForPresenceOfElementLocated(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement waitForVisibilityOfElementLocated(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(GenericMethods.getElement(driver, locator)));

		return driver.findElement(locator);
	}

}
