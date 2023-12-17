package com.qa.calendrahandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Calendar Handling in Selenium WebDriver 
 * Write Generic Method for Calendar - Date Picker
 */
public class CalendarTest2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		

		driver.get("http://Google.com");
		driver.navigate().to("https://www.goibibo.com/");

		driver.findElement(By.xpath("((//div[@class='sc-gGCDDS eaLCwN fswFld ']/p[@class='sc-faUpoM clesLa fswWidgetTitle'])[1]"))
		.click();



		selectDate(driver, "4", "June", "2023");

	}

	public static void selectDate(WebDriver driver, String Date, String month, String year) {

		boolean isClicked=false;
		if (Integer.parseInt(Date) > 29 && month.equals("February")) {
			System.out.println("Date is incorrect: " + Date);
			return;
		}
		if (Integer.parseInt(Date) > 31) {
			System.out.println("Date is incorrect: " + Date);
			return;
		}
		String monthYearVal = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

		while (!(getMonthYear(monthYearVal)[0].equals(month) && getMonthYear(monthYearVal)[1].equals(year))) {

			monthYearVal = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
			if (!(getMonthYear(monthYearVal)[0].equals(month) && getMonthYear(monthYearVal)[1].equals(year))) {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				monthYearVal = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			} else {
				driver.findElement(By.xpath("(//p[text()='" + Date + "'])[2]")).click();
				isClicked=true;
				break;
			}
		}
		if (!isClicked) {
			driver.findElement(By.xpath("(//p[text()='" + Date + "'])[1]")).click();
		}
		

	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

}
