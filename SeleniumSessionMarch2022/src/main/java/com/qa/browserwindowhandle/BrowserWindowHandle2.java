package com.qa.browserwindowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> ar = new ArrayList<String>(handles);

		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		String window=driver.getWindowHandle();
		
		System.out.println(window);
	}
}
