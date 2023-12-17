package com.qa.dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		 WebElement dayElement = driver.findElement(By.id("day"));
		 Select s1=new Select(dayElement);
		 
		 System.out.println(s1.isMultiple());

		// s1.selectByIndex(1);

		// WebElement month = driver.findElement(By.id("month"));
		// Select s2=new Select(month);

		// s2.selectByVisibleText("Jan");

		// WebElement year = driver.findElement(By.id("year"));
		// Select s3=new Select(year);

		// s3.selectByValue("2021");

		selectByIndex(driver, day, 1);
		selectByVisibleText(getElement(driver, month), "Jan");
		selectByValue(driver, year, "2021");
	}

	public static void selectByIndex(WebDriver driver, By locator, int index) {
		Select select = new Select(getElement(driver, locator));
		select.selectByIndex(index);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByValue(WebDriver driver, By locator, String value) {
		Select select = new Select(getElement(driver, locator));
		select.selectByValue(value);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

}
