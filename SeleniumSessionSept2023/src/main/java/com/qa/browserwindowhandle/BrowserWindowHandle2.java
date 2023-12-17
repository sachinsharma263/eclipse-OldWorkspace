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
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> list= new ArrayList<String>(handles);
		
		System.out.println(list.get(0)+"\n"+list.get(1));
	}

}
