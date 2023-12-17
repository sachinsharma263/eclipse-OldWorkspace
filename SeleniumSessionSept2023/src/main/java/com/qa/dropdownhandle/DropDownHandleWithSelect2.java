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
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		System.out.println(getAllOptionList(day));

		List<String> list = getAllOptionList(month);
		System.out.println(list);

		printList(getAllOptionList(year));

	}

	public static List<String> getAllOptionList(WebElement element) {
		Select s = new Select(element);
		List<WebElement> optionList = s.getOptions();

		System.out.println("total options: " + optionList.size());

		List<String> ar = new ArrayList<String>();

		for (int i = 0; i < optionList.size(); i++) {
			ar.add(optionList.get(i).getText());
		}
		return ar;
	}

	public static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
