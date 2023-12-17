package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(5000);
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		int totalLinks=linkList.size();
		
		System.out.println("Total links on the page: "+totalLinks);
		
		for (int i = 0; i < linkList.size(); i++) {
			String text=linkList.get(i).getText();
			System.out.println(text+"-->"+ linkList.get(i).getAttribute("href"));
		}
	}
}
