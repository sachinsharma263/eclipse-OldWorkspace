package com.qa.dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import com.github.dockerjava.api.model.SELContext;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		/*
		 * WebElement day = driver.findElement(By.id("day")); WebElement month =
		 * driver.findElement(By.id("month")); WebElement year =
		 * driver.findElement(By.id("year"));
		 */

		/*
		 * Select s = new Select(day); Select s2 = new Select(month); Select s3 = new
		 * Select(year);
		 */

		/*
		 * s.selectByIndex(1); s2.selectByValue("2"); s3.selectByVisibleText("2021");
		 */

		selectByIndex(driver, day, 2);
		selectByVisibleText(driver, month, "Feb");
		selectByValue(driver, year, "2021");
		
		Select s=new Select(driver.findElement(By.id("day")));
		System.out.println(s.isMultiple());

	}

	public static void selectByIndex(WebDriver driver, By locator, int index) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static void selectByVisibleText(WebDriver driver, By locator, String value) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);

		select.selectByVisibleText(value);
	}

	public static void selectByValue(WebDriver driver, By locator, String value) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);

		select.selectByValue(value);
	}

}
