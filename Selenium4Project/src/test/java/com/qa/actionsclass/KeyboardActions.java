package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://google.com");

		WebElement searchBox = driver.findElement(By.name("q"));
//
//		searchBox.sendKeys("selenium", Keys.ENTER);
//
		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();

		action.keyDown(Keys.SHIFT).sendKeys(searchBox, "selenium").keyUp(Keys.SHIFT).sendKeys("selenium"+Keys.ENTER).build()
				.perform();

	}
}
