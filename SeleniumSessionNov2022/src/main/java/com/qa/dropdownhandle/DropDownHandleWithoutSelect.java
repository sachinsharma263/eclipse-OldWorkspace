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

		printAllOptions(getAlOptionList(driver, day));
		printAllOptions(getAlOptionList(driver, month));
		printAllOptions(getAlOptionList(driver, year));

	}

	public static List<WebElement> getAlOptionList(WebDriver driver, By locator) {
		List<WebElement> optionList = driver.findElements(locator);

		return optionList;
	}

	public static void printAllOptions(List<WebElement> list) {
		System.out.println("total options are: "+list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}

}
