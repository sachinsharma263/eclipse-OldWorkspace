package com.qa.dropdownhandle;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelect2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		System.out.println(getAllOptionList(driver, day));
		System.out.println(getAllOptionList(driver, month));
		System.out.println(getAllOptionList(driver, year));

	}

	public static ArrayList<String> getAllOptionList(WebDriver driver, By locator) {
		Select select = new Select(getElement(driver, locator));
		List<WebElement> optionList = select.getOptions();

		ArrayList<String> al = new ArrayList<String>();
		System.out.println("total number of " + locator + ": " + optionList.size());
		for (int i = 0; i < optionList.size(); i++) {
			al.add(optionList.get(i).getText());
		}
		return al;
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("some error occured while creating the web element:" + locator);
		}

		return element;

	}

}
