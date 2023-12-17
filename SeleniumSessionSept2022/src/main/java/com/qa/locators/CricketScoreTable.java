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

		// List<WebElement> list=driver.findElements(By.xpath("//span[text()='Mark
		// Watt']//ancestor::td//following-sibling::td[@class='ds-min-w-max
		// !ds-pl-[100px]']//following-sibling::td"));

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}

		printScoreList(getScoreList(driver, "Mark Watt"));
		printScoreList(getScoreList(driver, "Matthew Cross"));
		
		getWicketTaker(driver, "Mark Watt");
		getWicketTaker(driver, "Matthew Cross");
	}

	public static List<WebElement> getScoreList(WebDriver driver, String playerName) {

		System.out.println("Player Name: " + playerName);
		System.out.println("Runs" + "\t" + "Balls" + "\t" + "Min" + "\t" + "4s" + "\t" + "6s" + "\t" + "SR");
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='" + playerName
				+ "']//ancestor::td//following-sibling::td[@class='ds-min-w-max !ds-pl-[100px]']//following-sibling::td"));

		return list;

	}

	public static void getWicketTaker(WebDriver driver, String playerName) {
		WebElement element=driver.findElement(By.xpath(
				"//span[text()='Matthew Cross']//ancestor::td[@class='ds-w-0 ds-whitespace-nowrap ds-min-w-max']//following-sibling::td[@class='ds-min-w-max !ds-pl-[100px]']/span"));
	System.out.println("wicket taket for "+playerName+" is:"+element.getText());
	
	}

	public static void printScoreList(List<WebElement> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getText() + "\t");
		}
		System.out.println();
	}
}
