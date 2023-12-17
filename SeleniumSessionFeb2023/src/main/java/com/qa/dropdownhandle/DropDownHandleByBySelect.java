package com.qa.dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleByBySelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		Select s = new Select(getElement(driver, day));
//
//		s.selectByIndex(0);

		// WebElement month = driver.findElement(By.id("month"));
//		Select s2 = new Select(month);
//
//		s2.selectByValue("1");

//		Select s3 = new Select(driver.findElement(By.id("year")));
//		s3.selectByVisibleText("2022");

		selectByIndex(driver, day, 1);
		selectByValue(driver, month, "1");
		selectByVisibleText(driver, year, "2022");

		System.out.println(s.isMultiple());
	}

	public static void selectByIndex(WebDriver driver, By locator, int index) {
		Select s = new Select(getElement(driver, locator));
		s.selectByIndex(index);
	}

	public static void selectByVisibleText(WebDriver driver, By locator, String text) {
		Select s = new Select(getElement(driver, locator));
		s.selectByVisibleText(text);
	}

	public static void selectByValue(WebDriver driver, By locator, String value) {
		Select s = new Select(getElement(driver, locator));
		s.selectByValue(value);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

}
