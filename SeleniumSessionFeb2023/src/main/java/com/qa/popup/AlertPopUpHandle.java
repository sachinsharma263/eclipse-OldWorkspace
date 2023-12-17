package com.qa.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Java Script alert or pop up- coming due to java script code
 * we cannot inspect javascript alert
 */
public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			alert.accept();

		} else {
			alert.dismiss();
		}

	}
}
