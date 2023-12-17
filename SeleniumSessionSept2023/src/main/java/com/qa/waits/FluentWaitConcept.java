package com.qa.waits;

import java.time.Duration;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		 By emailId = By.id("username2");
		By password = By.id("password");
		By loginBtn = By.xpath("");

		By signIn = By.linkText("Sign in");

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.id("hs-eu-decline-button")).click();

		driver.findElement(signIn).click();
//
//		Wait<WebDriver> wait = new FluentWait<>(driver)
//
//				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5))
//				.ignoring(org.openqa.selenium.NoSuchElementException.class);
//
//		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//
//			@Override
//			public WebElement apply(WebDriver driver) {
//
//				// return driver.findElement(By.id("username"));
//				return driver.findElement(emailId);
//			}
//		});

		// driver.findElement(emailId).sendKeys("test@gmail.com");
		// element.sendKeys("test");
		
		waitForElementWithFluentWait(driver, emailId);
		
		driver.findElement(emailId).sendKeys("test");

	}

	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		System.out.println("Before 1...");
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				System.out.println("Before 2...");
				return driver.findElement(locator);
				
			}
		});	System.out.println("Before 3...");
		return element;

	}

}
