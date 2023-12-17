package com.qa.browserwindowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserWindowHandle2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");

		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(handles);

		System.out.println(list.size());
		
		String parentWindowId=list.get(0);
		String childWindowId=list.get(1);

		System.out.println(parentWindowId+"\n"+childWindowId);
	}

}
