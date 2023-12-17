package com.qa.seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * JavaScript alert- we need to switch to alert window first, compare text,
 * accept or dismiss alert JavaScript alert- we cant inspect JS alert, driver
 * findelement not work because this is from JS script
 * 
 * @author Dell
 *
 */
public class AlertPopUpHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		if (alert.getText().equals("Please enter a valid user name")) {
			System.out.println("correct message");
			alert.accept();
		} else {
			alert.dismiss();
		}
	}
}
