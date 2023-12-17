package com.qa.browserwindowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> itr = handles.iterator();

		String parentWindow = itr.next();

		String childtWindow = itr.next();

		System.out.println(driver.getTitle());

		driver.switchTo().window(childtWindow);

		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());// org.openqa.selenium.NoSuchWindowException: no such window: target window already closed
	}

}
