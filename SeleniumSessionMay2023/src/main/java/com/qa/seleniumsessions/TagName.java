package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * count total links on the page
 * get the text of each link
 * get the href property of each link
 */
public class TagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http:/amazon.in");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		List<WebElement> imageList = driver.findElements(By.tagName("img"));

		System.out.println("total number of links:" + linkList.size());
		System.out.println("total number of images:" + imageList.size());

		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			if (!text.isEmpty())
				System.out.println(i + "-->" + text + "-->" + linkList.get(i).getAttribute("href"));
		}
		System.out.println("--------------------");
		for (int i = 0; i < imageList.size(); i++) {
			String text = imageList.get(i).getText();

			System.out.println(i + "-->" + text + "-->" + imageList.get(i).getAttribute("src"));
		}
		driver.quit();

	}

}
