package com.qa.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Java Script alert or pop up- coming due to java script code
 */
public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		Thread.sleep(3000);
		if (text.equals("Please enter a valid user name")) {
			alert.accept();
		} else {
			alert.dismiss();
		}
	}

}
