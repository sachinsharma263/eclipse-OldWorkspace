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

		List<String> list = getAllOptionList(driver, month);
		System.out.println(list);

		printList(getAllOptionList(driver, year));

	}

	public static List<String> getAllOptionList(WebDriver driver, By locator) {
		Select s = new Select(driver.findElement(locator));
		List<WebElement> list = s.getOptions();

		List<String> al = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			al.add(text);
		}
		return al;
	}

	public static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
