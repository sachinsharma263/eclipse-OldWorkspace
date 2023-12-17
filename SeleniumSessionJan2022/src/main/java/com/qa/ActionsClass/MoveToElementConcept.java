package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		WebElement element = driver.findElement(By.className("menulink"));

//		Actions action=new Actions(driver);
//		
//		action.moveToElement(element).build().perform();

		moveToElement(driver, element);

		driver.findElement(By.linkText("COURSES")).click();//this line is independent, if i write inside generic method then it will be hardcoded
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
}
