package com.qa.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * Java Script alert or pop up- coming due to java script code
 */
public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		System.out.println(text);
		
		Thread.sleep(3000);

		if (text.equals("Please enter a valid user name")) {
			alert.accept();
		} else {
			alert.dismiss();
		}
	}

}
