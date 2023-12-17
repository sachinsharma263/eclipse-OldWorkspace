package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * count total links on the page
 * get the text of each link
 * get the href url property for each link
 */
public class TagNameConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://app.hubspot.com/signup");
		 * 
		 * driver.findElement(By.linkText("Sign in")).click();
		 * 
		 * try { Thread.sleep(3000); } catch (Exception e) { // TODO: handle exception }
		 */

		driver.get("http://www.amazon.com");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		List<WebElement> imageList = driver.findElements(By.tagName("img"));

		System.out.println("total number of links on the web page: " + linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			//System.out.println(linkList.get(i).getText());

			String text = linkList.get(i).getText();

			if (!text.isEmpty()) {
				System.out.println(i + "--> " + text + "--> " + linkList.get(i).getAttribute("href"));
			}
		}

		/*
		 * System.out.println("total number of images on the web page: " +
		 * imageList.size());
		 * 
		 * for (int i = 0; i < imageList.size(); i++) { System.out.println(i + "--> " +
		 * imageList.get(i).getText() + "--> "+imageList.get(i).getAttribute("src")); }
		 */

	}

}
