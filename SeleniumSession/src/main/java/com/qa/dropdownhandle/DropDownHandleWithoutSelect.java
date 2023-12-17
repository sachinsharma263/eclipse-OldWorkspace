package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {
		
		//select[@id='day']/option
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		
		List<WebElement> dayList=driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> monthList=driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> yearList=driver.findElements(By.xpath("//select[@id='year']/option"));
		
//		System.out.println("Total Day List: "+dayList.size());
//		
//		for (int i = 0; i < dayList.size(); i++) {
//			System.out.println(dayList.get(i).getText());
//		}
		
		getOptionList(dayList);
		getOptionList(monthList);
		getOptionList(yearList);
	}
	public static void getOptionList(List<WebElement> list) {
		System.out.println("Total Option List:"+ list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}
}
