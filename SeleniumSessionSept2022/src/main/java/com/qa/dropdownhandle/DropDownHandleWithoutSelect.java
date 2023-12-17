package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		By day = By.xpath("//select[@id='day']/option");
		By month = By.xpath("//select[@id='month']/option");
		By year = By.xpath("//select[@id='year']/option");

		printAllOptions(getAllOptionsList(day, driver));
		printAllOptions(getAllOptionsList(month, driver));
		printAllOptions(getAllOptionsList(year, driver));

	}

	public static List<WebElement> getAllOptionsList(By locator, WebDriver driver) {

		List<WebElement> optionList = driver.findElements(locator);

		return optionList;
	}

	public static void printAllOptions(List<WebElement> optionList) {
		System.out.println("total options are: " + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			System.out.println(optionList.get(i).getText());
		}
	}

}
