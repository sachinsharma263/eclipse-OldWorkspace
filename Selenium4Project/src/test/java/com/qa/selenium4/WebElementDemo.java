package com.qa.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("http://google.com");

		WebElement searchBox = driver.findElement(By.name("q"));

		/*
		 * searchBox.sendKeys("selenium", Keys.ENTER);
		 * 
		 * driver.navigate().to("https://trytestingthis.netlify.app/");
		 * 
		 * List<WebElement> elementList = driver.findElements(By.tagName("select"));
		 * 
		 * for (WebElement element : elementList) {
		 * System.out.println(element.getText()); }
		 */

		System.out.println("tagname: " + searchBox.getTagName());

		System.out.println("get attribute: " + searchBox.getAttribute("title"));

		System.out.println("text: " + searchBox.getText());

		System.out.println("css: " + searchBox.getCssValue("font"));

		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

		System.out.println(checkbox1.isDisplayed() + "\n" + checkbox1.isEnabled() + "\n" + checkbox1.isSelected());

	}
}
