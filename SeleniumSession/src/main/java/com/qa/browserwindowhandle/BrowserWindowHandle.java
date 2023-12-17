package com.qa.browserwindowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		System.out.println(driver.getTitle());

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> itr = handles.iterator();

//		while (itr.hasNext()) {
//			String string = (String) itr.next();
//			System.out.println(string);
//		}

		String parentWindowId = itr.next();
		String childWindowId = itr.next();

		System.out.println(driver.getTitle());

		driver.switchTo().window(childWindowId);

		System.out.println(driver.getTitle());
		
		driver.close();

		driver.switchTo().window(parentWindowId);
		
		driver.quit();

		System.out.println(driver.getTitle());

	}
}
