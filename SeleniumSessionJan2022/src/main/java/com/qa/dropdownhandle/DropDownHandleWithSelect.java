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

//		WebElement day=driver.findElement(By.id("day"));
//		WebElement month=driver.findElement(By.id("month"));
//		WebElement year=driver.findElement(By.id("year"));

//		Select s = new Select(day);
//		s.selectByIndex(1);
//
//		Select s2 = new Select(month);
//		s2.selectByVisibleText("Nov");
//
//		Select s3 = new Select(year);
//		s3.selectByValue("2021");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

//		selectByIndex(driver, day, 1);
//		selectByIndex(driver, month, 2);
//		selectByIndex(driver, year, 3);
//
//		selectByVisibleText(driver, day, "1");
//		selectByVisibleText(driver, month, "Nov");
//		selectByVisibleText(driver, year, "2005");

		selectByIndex(getElement(driver, day), 1);
		selectByIndex(getElement(driver, month), 2);
		selectByIndex(getElement(driver, year), 3);

	}

	public static void selectByIndex(WebDriver driver, By locator, int index) {
		Select s = new Select(getElement(driver, locator));
		s.selectByIndex(index);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static void selectByVisibleText(WebDriver driver, By locator, String text) {
		Select s = new Select(getElement(driver, locator));
		s.selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
}
