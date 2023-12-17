package com.qa.dropdownhandle;

import java.util.ArrayList;
import java.util.Iterator;
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

		/*
		 * WebElement day=driver.findElement(By.id("day"));
		 * 
		 * Select s=new Select(day);
		 * 
		 * List<WebElement> dayList=s.getOptions(); System.out.println(dayList.size());
		 */
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		/*
		 * List<WebElement> dayList = getOptionList(driver, day); for (int i = 0; i <
		 * dayList.size(); i++) { System.out.println(dayList.get(i).getText());
		 * 
		 * }
		 */
		/*
		 * getOptionList2(driver, day); getOptionList2(driver, month);
		 * getOptionList2(driver, year);
		 */

		// System.out.println(getOptionList(driver, day));
		System.out.println(getOptionList2(driver, day));
		System.out.println(getOptionList2(driver, month));
		System.out.println(getOptionList2(driver, year));
	}

	public static List<WebElement> getOptionList(WebDriver driver, By locator) {
		Select s = new Select(getElement(driver, locator));
		List<WebElement> optionList = s.getOptions();
		return optionList;
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static ArrayList<String> getOptionList2(WebDriver driver, By locator) {
		Select s = new Select(getElement(driver, locator));
		List<WebElement> optionList = s.getOptions();
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("total options: " + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			// System.out.println(optionList.get(i).getText());
			String text = optionList.get(i).getText();
			list.add(text);
		}
		return list;
	}

}
