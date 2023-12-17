package com.qa.dropdownhandle;

import java.util.List;

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
		 * Select s1 = new Select(day); s1.selectByIndex(0);
		 * 
		 * Select s2 = new Select(month); s2.selectByVisibleText("Apr");
		 * 
		 * Select s3 = new Select(year); s3.selectByValue("2021");
		 */

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		/*
		 * selectByIndex(driver, day, 1); selectByIndex(driver, month, 3);
		 * selectByIndex(driver, year, 4)
		 */;

		selectByVisibleText(driver, day, "5");
		selectByVisibleText(driver, month, "Apr");
		selectByVisibleText(driver, year, "2021");

		selectByValue(driver, day, "1");

		Select s = new Select(driver.findElement(By.id("day")));
		System.out.println(s.isMultiple());
	}

		/*
		 * List<WebElement> dayList=s.getOptions(); System.out.println(dayList.size());
		 * for (int i = 0; i < dayList.size(); i++) {
		 * System.out.println(dayList.get(i).getText()); }
		 */

	

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

		Select select = new Select(getElement(driver, locator));
		select.selectByValue(value);
	}

}
