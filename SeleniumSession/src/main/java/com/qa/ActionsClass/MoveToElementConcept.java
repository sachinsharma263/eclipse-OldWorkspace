package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");

//		Actions action=new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.linkText("COURSES")).click();

		WebElement element = driver.findElement(By.className("menulink"));
		moveToElement(driver, element);
		driver.findElement(By.linkText("COURSES")).click();

	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}
