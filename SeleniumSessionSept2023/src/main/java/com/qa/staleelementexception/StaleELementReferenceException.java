package com.qa.staleelementexception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * : How to Handle Stale Element Exception in Selenium with Java
 * When we are working on webelement of a webpage and then we navigate to some other page do work and return to previous page. If we try to use any elemenet
 * then selenium will throw StaleElementReferenceException because after navigating to other page the dom structure gets changed and webelement become stale.
 * or when the web page gets refreshed then also dom structure changed and in case try to use element then same exception will be thrown.
 * The workaround or remeidy for this is we have to re identfy or create the web element again and then use.
 * Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
 */
public class StaleELementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.pavantestingtools.com/");
		
		WebElement seleniumWJavaLink=driver.findElement(By.linkText("Selenium with Java"));
		
		seleniumWJavaLink.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		try {
			seleniumWJavaLink.click();
		}
		catch (Exception e) {
			 seleniumWJavaLink=driver.findElement(By.linkText("Selenium with Java"));
			 seleniumWJavaLink.click();
		}
		
	}}