package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * find the total links count on a page 
 * get the text of each link
 *  get the href url property for each link
 * 
 * @author Dell
 *
 */
public class TagNameConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		List<WebElement> linkList2=driver.findElements(By.tagName("img"));

		System.out.println("Total links on the page is: " + linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			//System.out.println(i+"-->"+linkList2.get(i).getText()+"-->"+linkList2.get(i).getAttribute("src"));
		
			String text=linkList.get(i).getText();
			if(! text.isEmpty())
			{
				System.out.println(i+"-->"+linkList.get(i).getText()+"-->"+linkList.get(i).getAttribute("href"));
			}
		
		}

	}
}
