package com.qa.pavan;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Features {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();

	}

	@Test
	public void takeWebELementSCreenshot() {

		File src = driver.findElement(By.id("username")).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("./target/screenshot/username.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void openNewTab() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);

		driver.get("https://app.hubspot.com/signup");

	}

	@Test
	public void openNewWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
	}

	/*
	 * In Selenium 4, new getRect() method which returns a Rectangle object, and
	 * then you can directly get height, width and X/Y co-ordinates of element.
	 */
	@Test
	public void location() {
		WebElement username = driver.findElement(By.id("username"));

		System.out.println("height: " + username.getRect().getHeight());
		System.out.println("weidth: " + username.getRect().getWidth());

		System.out.println("X location: " + username.getRect().getX());
		System.out.println("Y location: " + username.getRect().getY());

	}
}
