package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		WebElement contentMenue = driver.findElement(By.className("menulink"));

//		Actions action = new Actions(driver);
//
//		action.moveToElement(contentMenue).build().perform();

		doMoveToElement(driver, contentMenue);

		driver.findElement(By.linkText("COURSES")).click();

	}

	public static void doMoveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
}
