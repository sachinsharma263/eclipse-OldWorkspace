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

//		List<WebElement> list = driver.findElements(
//				By.xpath("//a[text()='Matthew Cross']//parent::td//following-sibling::td//following-sibling::td"));
		

		

		getScoreList(driver, "Matthew Cross");
		getWicketTaker(driver, "Matthew Cross");
		getScoreList(driver, "George Munsey");
		getWicketTaker(driver, "George Munsey");
		getScoreList(driver, "Michael Leask");

	}

	public static void getScoreList(WebDriver driver, String playerName) {
		List<WebElement> scoreList = driver.findElements(
				By.xpath("//a[text()='" + playerName + "']//parent::td[contains(@class,'batsman')]//following-sibling::td[@class='text-left']//following-sibling::td"));
		
		System.out.println("Player Name:"+playerName);
		System.out.println("RUNS" + "\t" + "BALLS" + "\t" + "MIN" + "\t" + "4s" + "\t" + "6s" + "\t" + "SR");
		for (int j = 0; j < scoreList.size(); j++) {
			System.out.print(scoreList.get(j).getText() + "\t");
		}
		System.out.println("\n");

	}
	public static void getWicketTaker(WebDriver driver,String playerName) {
		WebElement element=driver.findElement(By.xpath("//a[text()='Matthew Cross']//parent::td//following-sibling::td[@class='text-left']/span"));
		String text=element.getText();
		
		System.out.println("Wicket Taker for "+playerName+": "+text+"\n");
	}
}
