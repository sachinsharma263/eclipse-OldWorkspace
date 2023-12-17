package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// driver.get("https://app.hubspot.com/login");

		driver.get("https://www.amazon.in");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		int totalLinks = linkList.size();

		System.out.println("total number of links on te page: " + totalLinks);

		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(i+"-->"+text + "-->" + linkList.get(i).getAttribute("href"));
			}
			
		}
	}

}
