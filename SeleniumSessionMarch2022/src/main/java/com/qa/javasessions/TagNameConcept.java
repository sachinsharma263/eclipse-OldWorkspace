package com.qa.javasessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * requirement: find total links on the page
 * get the text of each link
 * get the href property of each link
 */
public class TagNameConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://amazon.com");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		List<WebElement> list2=driver.findElements(By.tagName("img"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			//System.out.println(i + "-->" + list2.get(i).getText() + "-->" + list2.get(i).getAttribute("src"));
			if (!text.isEmpty())
				System.out.println(i + "-->" + list.get(i).getText() + "-->" + list.get(i).getAttribute("href"));
		}
	}
	}

