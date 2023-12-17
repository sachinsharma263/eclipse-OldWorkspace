package com.qa.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
/*
 * Java Script Alert-pop up: an alert coming due to java script
 * how to handle?
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		if (text.equals("Please enter a valid user name")) {
			alert.accept();
		} else {
			alert.dismiss();
		}
	}

}
