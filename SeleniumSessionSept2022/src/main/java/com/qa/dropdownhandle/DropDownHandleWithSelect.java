package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");
		/*
		 * WebElement day = driver.findElement(By.id("day")); WebElement month =
		 * driver.findElement(By.id("month")); WebElement year =
		 * driver.findElement(By.id("year"));
		 */

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		WebElement dayElement = driver.findElement(day);
		Select s = new Select(dayElement);
		System.out.println(s.isMultiple());

		/*
		 * List<WebElement> list = s.getOptions(); System.out.println(list.size());
		 * 
		 * for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i).getText()); }
		 */

		/*
		 * Select select = new Select(day); Select select2 = new Select(month); Select
		 * select3 = new Select(year);
		 * 
		 * select.selectByIndex(0); select2.selectByVisibleText("Nov");
		 * select3.selectByValue("2021");
		 */

		/*
		 * selectDropDownValueByIndex(day, 0); // selectDropDownValueByIndex(month, 4);
		 * selectDropDownValueByVisibleText(month, "Nov");
		 * //selectDropDownValueByIndex(year, 115); selectDropDownByValue(year, "2021");
		 */

		selectDropDownValueByIndex(getElement(driver, day), 0);
		selectDropDownValueByVisibleText(driver, month, "Nov");
		selectDropDownByValue(getElement(driver, year), "2021");
		
		
		List<WebElement> optionList=getAllOption(getElement(driver, day));
		System.out.println("total option: "+optionList.size());
		for(int i=0;i<optionList.size();i++)
		{
			System.out.println(i+"-->"+optionList.get(i).getText());
		}

	}

	public static WebElement getElement(WebDriver driver, By locator) {

		WebElement element = null;
		try {

			return driver.findElement(locator);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

	public static void selectDropDownValueByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectDropDownValueByVisibleText(WebDriver driver, By locator, String value) {
		Select select = new Select(getElement(driver, locator));
		select.selectByVisibleText(value);
	}

	public static void selectDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static List<WebElement> getAllOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionList = select.getOptions();
		
		return optionList;
	}
}
