package com.qa.newwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTabFeature {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://app.hubspot.com/login");

		System.out.println(driver.getTitle());

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();

		System.out.println("after switching title: " + driver.getTitle());

		driver.get("http://facebook.com");

		System.out.println(driver.getTitle());

		// driver.switchTo().defaultContent();
		

		driver.close();
		
		driver.switchTo().window(parentWindow);

		System.out.println(driver.getTitle());

	}
}
