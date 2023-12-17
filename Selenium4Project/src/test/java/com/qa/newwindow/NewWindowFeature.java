package com.qa.newwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowFeature {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://app.hubspot.com/login");

		System.out.println(driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(handles);
		
		//List<String> al=new ArrayList<String>(driver.getWindowHandles());
		
		String parentWindow = list.get(0);
		String childWindow = list.get(1);

		System.out.println("after switching title: " + driver.getTitle());
  
		driver.get("http://facebook.com");

		System.out.println(driver.getTitle());

		 //driver.switchTo().defaultContent();
		

		driver.close();
		
		driver.switchTo().window(parentWindow);
		//driver.switchTo().window(list.get(0));

		System.out.println(driver.getTitle());

	}
}
