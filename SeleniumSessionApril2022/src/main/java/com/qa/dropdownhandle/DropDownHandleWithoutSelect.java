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

		/*
		 * List<WebElement> dayList =
		 * driver.findElements(By.xpath("//select[@id='day']/option")); List<WebElement>
		 * monthList = driver.findElements(By.xpath("//select[@id='month']/option"));
		 * List<WebElement> yearList =
		 * driver.findElements(By.xpath("//select[@id='year']/option"));
		 */

		// System.out.println(dayList.size());

		/*
		 * for (int i = 0; i < dayList.size(); i++) {
		 * System.out.print(dayList.get(i).getText() + "\t"); }
		 */

		printOptionsList(getAllOptionsList(driver, day));
		printOptionsList(getAllOptionsList(driver, month));
		printOptionsList(getAllOptionsList(driver, year));

	}

	public static List<WebElement> getAllOptionsList(WebDriver driver, By locator) {
		List<WebElement> optionsList = driver.findElements(locator);

		return optionsList;
	}

	public static void printOptionsList(List<WebElement> optionsList) {
		System.out.println("total option list: " + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
	}

}
