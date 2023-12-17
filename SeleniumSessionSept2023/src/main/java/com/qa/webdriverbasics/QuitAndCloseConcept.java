package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * difference btw quit and close with respect to session id
 * quit()- org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
 * close()-org.openqa.selenium.NoSuchSessionException: invalid session id
 *  
 * getting NoSuchSessionException but with different method
 *  
 * difference through theory
 * quit()-in case of quit entire web browser will be closed
 * close()-in case of close only the web page having driver control will be closed
 *  
 * so what is the outcome?
 * outcome is never used webdriver after calling quit or close
 */
public class QuitAndCloseConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		 driver.quit();
		//driver.close();

		System.out.println(driver.getTitle());
	}
}


