package com.qa.seleniumsessions;

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

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		List<WebElement> linkList2=driver.findElements(By.tagName("img"));

		System.out.println("total number of links on the page: " + linkList.size());
		System.out.println("total number of images on the page: " + linkList2.size());

		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(i + "-->" + text + "-->" + linkList.get(i).getAttribute("href"));
			}

		}
		/*
		 * for (int i = 0; i < linkList2.size(); i++) {
		 * System.out.println(i+"-->"+linkList2.get(i).getAttribute("src")); }
		 */

	}
}
