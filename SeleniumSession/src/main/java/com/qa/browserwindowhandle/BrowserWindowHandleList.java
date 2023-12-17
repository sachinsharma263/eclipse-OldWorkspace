package com.qa.browserwindowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		
		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> handles2=new ArrayList<String>(handles);
		
		System.out.println(handles2.size());
		
		for (int i = 0; i < handles2.size(); i++) {
			System.out.println(handles2.get(i));
		}
	}
}
