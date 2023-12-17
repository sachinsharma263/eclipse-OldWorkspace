package com.qa.javasessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
/*
 * Requirement: count total links on the page
 * get the text of each link
 * get the href property for each link
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		/*
		 * WebElement e1 = driver.findElement(By.tagName("a"));
		 * System.out.println(e1+" "+e1.getAttribute("href"));
		 */

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		List<WebElement> linkList2=driver.findElements(By.tagName("img"));

		System.out.println("total number of links on the page: " + linkList.size());
		System.out.println("total number of images on the page: " + linkList2.size());

		for (int i = 0; i < linkList.size(); i++) {

			String text = linkList.get(i).getText();
			//System.out.println(i + "-->" + text + "-->" + linkList2.get(i).getAttribute("src"));
			if (!text.isEmpty())
				System.out.println(i + "-->" + text + "-->" + linkList.get(i).getAttribute("href"));
		}

	}}

