package com.qa.calendrahandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Calendar Handling in Selenium WebDriver 
 * Write Generic Method for Calendar - Date Picker
 */
public class CalendraTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));

		selectDate(driver, "1", "November", "2023");

	}

	public static void selectDate(WebDriver driver, String Date, String month, String year) {
		if (Integer.parseInt(Date)>29&& month.equalsIgnoreCase("February")) {
			System.out.println("Date is incorrect: " + Date);
			return;
		}
		if (Integer.parseInt(Date)>31) {
			System.out.println("Date is incorrect: " + Date);
			return;
		}
		String monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

		while (!(monthYearVal.split(" ")[0].equals(month) && monthYearVal.split(" ")[1].equals(year))) {
			new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		driver.findElement(By.xpath("//a[text()='" + Date + "']")).click();
	}

}
