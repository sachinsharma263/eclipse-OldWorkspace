package com.qa.dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));

		Select s1 = new Select(driver.findElement(By.id("day")));
//		s1.selectByIndex(1);
//
//		Select s2 = new Select(month);
//		s2.selectByValue("4");
//
//		Select s3 = new Select(year);
//		s3.selectByVisibleText("2022");

		selectByIndex(driver, day, 1);
		selectByVisibleText(driver, month, "Apr");
		selectByOption(driver, year, "2022");

		System.out.println(s1.isMultiple());
	}

	public static void selectByIndex(WebDriver driver, By locator, int index) {
		Select s = new Select(getElement(driver, locator));
		s.selectByIndex(index);
	}

	public static void selectByVisibleText(WebDriver driver, By locator, String text) {
		Select s = new Select(getElement(driver, locator));
		s.selectByVisibleText(text);
	}

	public static void selectByOption(WebDriver driver, By locator, String val) {
		Select s = new Select(getElement(driver, locator));
		s.selectByValue(val);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

}
