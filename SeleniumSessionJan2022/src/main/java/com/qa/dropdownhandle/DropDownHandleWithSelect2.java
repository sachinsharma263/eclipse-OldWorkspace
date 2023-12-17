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

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select s = new Select(day);
		s.selectByIndex(1);

		Select s2 = new Select(month);
		s2.selectByVisibleText("Nov");

		Select s3 = new Select(year);
		s3.selectByValue("2021");

		s.isMultiple();

//		List<WebElement> list=s.getOptions();
//		
//		System.out.println("total option: "+list.size());
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i+"-->"+list.get(i).getText());
//		}

		List<String> dayList = getOptionList(day);
//		for (int i = 0; i < dayList.size(); i++) {
//			System.out.println(i + "-->" + dayList.get(i));
//		}
//
//		System.out.println(getOptionList(month));
		
		getOptionList2(month);
	}

	public static ArrayList<String> getOptionList(WebElement element) {
		Select s = new Select(element);
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> optionList = s.getOptions();

		for (int i = 0; i < optionList.size(); i++) {
			ar.add(optionList.get(i).getText());
		}
		return ar;
	}
	public static void getOptionList2(WebElement element) {
		Select s = new Select(element);
		
		List<WebElement> optionList = s.getOptions();
//		System.out.println(optionList);

		ArrayList<String> ar=new ArrayList<String>();
		for (int i = 0; i < optionList.size(); i++) {
			ar.add(optionList.get(i).getText());
			System.out.println("adding"+i+"-->"+ar+"added");
		}
		System.out.println("-----------------");
		System.out.println(ar);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
