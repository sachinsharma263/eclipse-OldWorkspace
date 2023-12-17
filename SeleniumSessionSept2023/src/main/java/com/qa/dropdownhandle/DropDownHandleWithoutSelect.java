package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.xpath("//select[@id='day']/option");
		By month = By.xpath("//select[@id='month']/option");
		By year = By.xpath("//select[@id='year']/option");

		printOptionList(getAllOptionsList(driver, day));
		printOptionList(getAllOptionsList(driver, month));
		printOptionList(getAllOptionsList(driver, year));

	}

	public static List<WebElement> getAllOptionsList(WebDriver driver, By locator) {
		List<WebElement> list = driver.findElements(locator);

		return list;
	}

	public static void printOptionList(List<WebElement> optionList) {
		System.out.println("total options: " + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			System.out.print(optionList.get(i).getText() + "\t");
		}
		System.out.println();
	}

}
