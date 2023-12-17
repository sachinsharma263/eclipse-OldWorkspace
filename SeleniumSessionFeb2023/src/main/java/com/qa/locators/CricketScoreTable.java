package com.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.GenericMethods;

public class CricketScoreTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/namibia-vs-scotland-21st-match-group-2-1273732/full-scorecard");

		printScoreList(getScoreList(driver, "Matthew Cross"));
		printScoreList(getScoreList(driver, "George Munsey"));
		getWicketTaker(driver, "Matthew Cross");
		getWicketTaker(driver, "George Munsey");
	}

	public static List<WebElement> getScoreList(WebDriver driver, String playerName) {
		System.out.println("Player Name: " + playerName);
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='" + playerName
				+ "']//ancestor::td//following-sibling::td[@class='ds-min-w-max !ds-pl-[100px]']//following-sibling::td"));

		return list;
	}

	public static void printScoreList(List<WebElement> list) {
		System.out.println("Runs" + "\t" + "Balls" + "\t" + "M" + "\t" + "4s" + "\t" + "6s" + "\t" + "SR");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getText() + "\t");
		}
		System.out.println();
	}

	public static void getWicketTaker(WebDriver driver, String playerName) {
		//String wikectTaker = driver.findElement(By.xpath("//span[text()='" + playerName
			//	+ "']//ancestor::td//following-sibling::td[@class='ds-min-w-max !ds-pl-[100px]']")).getText();

		String text=GenericMethods.doGetText(driver, By.xpath("//span[text()='" + playerName
				+ "']//ancestor::td//following-sibling::td[@class='ds-min-w-max !ds-pl-[100px]']"));
		System.out.println("Wicket taker for " + playerName + " is: " + text);
	}
}
