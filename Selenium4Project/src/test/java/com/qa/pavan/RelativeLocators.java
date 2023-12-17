package com.qa.pavan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
	}

	@Test(description = "Test book 5 is left of book 6 and below book 1")
	public void test1() {

		WebElement book5=driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1")));
		
		System.out.println(book5.getAttribute("id")+"\n"+book5.getAttribute("href"));
	}
	@Test(description = "Test book 2 is right of book 1 and above book 6")
	public void test2() {

		WebElement book2=driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(By.id("pid1")).above(By.id("pid6")));
		
		System.out.println(book2.getAttribute("id")+"\n"+book2.getAttribute("href"));
	}
}
