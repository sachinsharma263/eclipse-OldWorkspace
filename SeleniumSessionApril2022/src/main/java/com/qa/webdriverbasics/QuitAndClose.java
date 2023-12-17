package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		// driver.quit();// Exception in thread "main"
		// org.openqa.selenium.NoSuchSessionException:
		// Session ID is null. Using WebDriver after calling quit()?

		driver.close();// Exception in thread "main" org.openqa.selenium.NoSuchSessionException:
						// invalid session id

		System.out.println(driver.getTitle());
	}

}
