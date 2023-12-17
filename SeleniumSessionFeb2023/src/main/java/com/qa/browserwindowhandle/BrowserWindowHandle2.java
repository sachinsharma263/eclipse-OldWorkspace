package com.qa.browserwindowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		System.out.println(driver.getTitle());

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();
		
		System.out.println(driver.getWindowHandle());

		Set<String> handles = driver.getWindowHandles();

		List<String> al = new ArrayList<String>(handles);// convert set to list

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		String parentWindow = al.get(0);
		String childWindow = al.get(1);
		
		driver.switchTo().window(al.get(1));
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getTitle());
	}

}
