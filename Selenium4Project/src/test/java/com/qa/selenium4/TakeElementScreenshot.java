package com.qa.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeElementScreenshot {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://app.hubspot.com/login");

		By username = By.id("username");
		By pass = By.id("password");

		WebElement email = driver.findElement(username);
		WebElement password = driver.findElement(pass);

		takeElementScreenshot(email, "email");
		takeElementScreenshot(password, "password");

	}

	public static void takeElementScreenshot(WebElement element, String fileName) {
		File src = element.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("./target/screenshots" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
