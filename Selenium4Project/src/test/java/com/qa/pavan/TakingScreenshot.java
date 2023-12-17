package com.qa.pavan;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(description = "screenshot of a complete page")
	public void screenshotOfaPage() {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./target/screenshot/nop.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "screenshot of section of page")
	public void screenshotOfSectionOfPage() {

		WebElement pageSection = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src = pageSection.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./target/screenshot/nop2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "screenshot of a web element")
	public void screenshotOfAnElement() {

		WebElement logoElement = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		highlightELement(driver, logoElement);
		File src = logoElement.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./target/screenshot/nop3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public void highlightELement(WebDriver driver, WebElement element) {
		JavascriptExecutor jsUtil = (JavascriptExecutor) driver;
		jsUtil.executeScript("arguments[0].style.border='2px solid red'", element);
	}
}
