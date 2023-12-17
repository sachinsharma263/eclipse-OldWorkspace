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

		System.out.println(driver.getTitle());

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		System.out.println(driver.getTitle());

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> itr = handles.iterator();

		String parentWindowId = itr.next();

		String childWindowId = itr.next();

		System.out.println("parent window id: " + parentWindowId + "\n" + "child window id: " + childWindowId);

		driver.switchTo().window(childWindowId);

		System.out.println(driver.getTitle());

		System.out.println(driver.getWindowHandle());

		driver.close();
		 driver.switchTo().window(parentWindowId);

		System.out.println(driver.getTitle());

		System.out.println(driver.getWindowHandle());

	}
}
