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

//		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
//		List<WebElement> monthList=driver.findElements(By.xpath("//select[@id='month']/option"));
//		List<WebElement> yearList=driver.findElements(By.xpath("//select[@id='year']/option"));

//		getOptionList(dayList);
//		getOptionList(monthList);
//		getOptionList(yearList);

		By day = By.xpath("//select[@id='day']/option");
		By month = By.xpath("//select[@id='month']/option");
		By year = By.xpath("//select[@id='year']/option");

		getOptionList(getElements(driver, day));
		getOptionList(getElements(driver, month));
		getOptionList(getElements(driver, year));

	}

	public static void getOptionList(List<WebElement> optionList) {
		System.out.println("total options: " + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			System.out.println(i + "-->" + optionList.get(i).getText());
		}
	}

	public static List<WebElement> getElements(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

}
