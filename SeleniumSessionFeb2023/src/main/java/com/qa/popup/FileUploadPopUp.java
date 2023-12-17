package com.qa.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");

		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Dell\\Pictures\\2.png");

	}

}
