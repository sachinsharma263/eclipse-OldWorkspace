package com.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/namibia-vs-scotland-21st-match-group-2-1273732/full-scorecard");

//		List<WebElement> list = driver.findElements(By.xpath(
//				"//span[text()='Matthew Cross']//ancestor::td[@class='ds-min-w-max']//following-sibling::td//following-sibling::td"));

		// System.out.println("Runs" + "\t" + "Balls+" + "\t" + "Min" + "\t" + "4s" +
		// "\t" + "6s" + "\t" + "SR");

//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).getText() + "\t");
//		}

		getScoreList(driver, "Matthew Cross");
		getWicketTaker(driver, "Matthew Cross");
		getScoreList(driver, "Michael Leask");
		getWicketTaker(driver, "Michael Leask");

	}

	public static void getScoreList(WebDriver driver, String playerName) {
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='" + playerName
				+ "']//ancestor::td[@class='ds-min-w-max']//following-sibling::td//following-sibling::td"));

		System.out.println("Player: " + playerName);
		System.out.println("Runs" + "\t" + "Balls" + "\t" + "Min" + "\t" + "4s" + "\t" + "6s" + "\t" + "SR");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getText() + "\t");
		}
		System.out.println("\n");
	}

	public static void getWicketTaker(WebDriver driver, String playerName) {
		String text = driver.findElement(By.xpath(
				"//span[text()='" + playerName + "']//ancestor::td//following-sibling::td[@class='ds-min-w-max']/span"))
				.getText();

		System.out.println("wicket taker for " + playerName + " :" + text);

	}
}
