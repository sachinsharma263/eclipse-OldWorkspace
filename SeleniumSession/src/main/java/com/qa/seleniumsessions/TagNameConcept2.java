package com.qa.seleniumsessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 1.count total links on the page
 * 2. get the text of each links on the page without space
 * 3. get the href url property for each link
 * @author Dell
 *
 */
public class TagNameConcept2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		System.out.println("total Links on the page: "+linkList.size());
		
		for (int i = 0; i < linkList.size(); i++) {
			
			if(!linkList.get(i).getText().isEmpty())
			
			System.out.println(i+"-->"+linkList.get(i).getText()+"-->"+linkList.get(i).getAttribute("href"));
		}
	}
}
