package com.qa.waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * so far we worked with pageLoadTimeout and scriptTimeout- these waits were not dealing with the web element but next 3 waits like implicitlyWait, ExplictWait
 *  and FluentWait deals with the web element.
 *  pageLoadTimeout-Sets the amount of time to wait for a page load to complete before throwing an error.
 *  scriptTimeout-Sets the amount of time to wait for an asynchronous script to finish execution before throwing an error. 
 *  
 *  implicitlyWait- is global wait, once use will be applied for all the elements while finding/identifying elements. it will increase script time. we can nullify 
 *  this wait. one should avoid implictwait and use explictwait, policy frequency is 500ms.
 *  ExplictWait- is applied in the form of webdriverwait where we can check for some condition for some specific time like present of element.
 *  FluentWait- similar to explictwait but we can customize this wait or have some more features like customize polling frequency.
 *  
 */
public class TimeOutInterfaceWaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

		Timeouts timeOut=driver.manage().timeouts();
		timeOut.pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://app.hubspot.com/login");
	}
}
