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

		/*
		 * WebElement day = driver.findElement(By.id("day")); WebElement month =
		 * driver.findElement(By.id("month")); WebElement year =
		 * driver.findElement(By.id("year"));
		 * 
		 * Select s1 = new Select(day); s1.selectByIndex(1);
		 * 
		 * Select s2 = new Select(month); s2.selectByVisibleText("Nov");
		 * 
		 * Select s3 = new Select(year); s3.selectByValue("2021");
		 */

		Select s1 = new Select(driver.findElement(By.id("day")));
		System.out.println(s1.isMultiple());

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		selectByIndex(driver, day, 1);
		selectByVisibleText(driver, month, "Nov");
		selectByValue(driver, year, "2021");

	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static void selectByIndex(WebDriver driver, By locator, int index) {
		WebElement element = getElement(driver, locator);
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByVisibleText(WebDriver driver, By locator, String value) {
		WebElement element = getElement(driver, locator);
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void selectByValue(WebDriver driver, By locator, String value) {
		Select s = new Select(getElement(driver, locator));
		s.selectByValue("2021");
	}

}
