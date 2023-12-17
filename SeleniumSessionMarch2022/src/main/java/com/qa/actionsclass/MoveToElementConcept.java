package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/course/");
		
		//WebElement contentMenu=driver.findElement(By.xpath("//li//a[@class='menulink']"));
		
		By contentMenue=By.xpath("//li//a[@class='menulink']");
		
		/*
		 * Actions actions=new Actions(driver);
		 * 
		 * actions.moveToElement(contentMenu).build().perform();
		 */
		
		moveToElement(driver, getElement(driver, contentMenue));
		driver.findElement(By.linkText("COURSES")).click();

	}
	
	public static void moveToElement(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	public static WebElement getElement(WebDriver driver,By locator) {
		return driver.findElement(locator);
	}

}
