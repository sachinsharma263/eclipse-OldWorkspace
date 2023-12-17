package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.xpath("//select[@id='day']/option");
		By month = By.xpath("//select[@id='month']/option");
		By year = By.xpath("//select[@id='year']/option");

		/*
		 * List<WebElement> dayList = driver.findElements(day);
		 * System.out.println("total day option " + dayList.size()); for (int i = 0; i <
		 * dayList.size(); i++) { System.out.println(dayList.get(i).getText()); }
		 */
		getOptionList(getElements(driver, day));
		getOptionList(getElements(driver, month));
		getOptionList(getElements(driver, year));
	}

	public static void getOptionList(List<WebElement> optionList) {

		System.out.println("total option " + optionList.size());
		for (int i = 0; i < optionList.size(); i++) {
			System.out.println(optionList.get(i).getText());
		}
	}

	public static List<WebElement> getElements(WebDriver driver, By locator) {
		List<WebElement> optionList = driver.findElements(locator);
		return optionList;
	}
}
