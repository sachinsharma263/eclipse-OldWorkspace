package com.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreTable2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/sri-lanka-in-australia-2021-22-1263459/australia-vs-sri-lanka-4th-t20i-1263474/full-scorecard");

		// (By.xpath("//a[text()='Pathum
		// Nissanka']//parent::td//following-sibling::td/span")).getText();

		// "//a[text()='Rohit
		// Sharma']//parent::td//following-sibling::td[@class='text-left']//following-sibling::td"));

		getScoreCard(driver, "Pathum Nissanka");
		getWicketTaker(driver, "Pathum Nissanka");
		getScoreCard(driver, "Danushka Gunathilaka");
		getWicketTaker(driver, "Danushka Gunathilaka");
	}

	public static void getScoreCard(WebDriver driver, String name) {
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='" + name
				+ "']//parent::td//following-sibling::td[@class='text-left']//following-sibling::td"));

		System.out.println("Player: " + name + "\n" + "RUN" + "\t" + "BALLS" + "\t" + "MIN" + "\t" + "4s" + "\t" + "6s"
				+ "\t" + "SR");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getText() + "\t");
		}
		System.out.println("\n");

	}

	public static void getWicketTaker(WebDriver driver, String name) {
		String text = driver
				.findElement(By.xpath(
						"//a[text()='" + name + "']//parent::td//following-sibling::td[@class='text-left']/span"))
				.getText();

		System.out.print("wicket taker" + name + " by:" + text+"\n");
	}

}
