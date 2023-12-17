package com.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/namibia-vs-scotland-21st-match-group-2-1273732/full-scorecard");

		List<WebElement> list = driver.findElements(
				By.xpath("//a[text()='Matthew Cross']//ancestor::tr//td[@class='text-left']//following-sibling::td"));

		System.out.println("Runs" + "\t" + "Balls" + "\t" + "Min" + "\t" + "4s" + "\t" + "6s" + "\t" + "SR");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).getText() + "\t");
//		}
		getScoreList(driver, "Matthew Cross");
		getWicketTakerName(driver, "Matthew Cross");
		getScoreList(driver, "Michael Leask");
		getWicketTakerName(driver, "Michael Leask");

	}

	public static void getScoreList(WebDriver driver, String playerName) {
		List<WebElement> list = driver.findElements(By.xpath(
				"//a[text()='" + playerName + "']//ancestor::tr//td[@class='text-left']//following-sibling::td"));

		System.out.println(playerName + ":");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getText() + "\t");
		}
		System.out.println("\n");
	}

	public static void getWicketTakerName(WebDriver driver, String playerName) {
		String text = driver.findElement(By
				.xpath("//a[text()='" + playerName + "']//parent::td//following-sibling::td[@class='text-left']//span"))
				.getText();

		System.out.println("wicket taket name for " + playerName + ":" + text);
	}
}
