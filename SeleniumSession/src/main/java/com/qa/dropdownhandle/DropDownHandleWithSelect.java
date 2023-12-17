package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select1 = new Select(day);
//		//select1.selectByVisibleText("4");
//		select1.selectByIndex(5);
//		select1.selectByValue("6");
//		
//		Select select2=new Select(month);
//		select2.selectByVisibleText("Nov");
//		
//		Select select3=new Select(year);
//		select3.selectByVisibleText("2000");

		selectByVisibleText(day, "4");
		selectByVisibleText(month, "Jun");
		selectByVisibleText(year, "1984");

		selectByIndex(day, 5);
		System.out.println(select1.isMultiple());

//		List<WebElement> dayList = select1.getOptions();
//		System.out.println(dayList.size());
//
//		for (int i = 0; i < dayList.size(); i++) {
//			System.out.println(i + "-->" + dayList.get(i).getText());
//		}

		List<WebElement> dayList = getAllOptionList(day);
		List<WebElement> monthList = getAllOptionList(month);
		List<WebElement> yearList = getAllOptionList(year);
		printOptionsList(dayList);
		printOptionsList(monthList);

	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static List<WebElement> getAllOptionList(WebElement element) {
		Select select = new Select(element);
		return select.getOptions();
	}

	public static void printOptionsList(List<WebElement> list) {
//		System.out.println("Size of list: " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}
}
