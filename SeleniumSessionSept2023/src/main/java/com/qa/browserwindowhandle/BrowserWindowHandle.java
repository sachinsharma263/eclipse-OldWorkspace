package com.qa.browserwindowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		System.out.println(driver.getTitle());

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		System.out.println(driver.getTitle());

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> itr = handles.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();

		System.out.println(parentWindow + "\n" + childWindow);

		driver.switchTo().window(childWindow);

		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getTitle());

	}

}
