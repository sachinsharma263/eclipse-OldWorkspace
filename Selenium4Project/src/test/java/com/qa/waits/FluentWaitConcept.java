package com.qa.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);

		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5));
				//.ignoring(NoSuchElementException.class);
		
		WebElement element=fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Selenium2']")));
		
		element.click();
	}

}
