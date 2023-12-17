package com.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/namibia-vs-scotland-21st-match-group-2-1273732/full-scorecard");

//		List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='Matthew Cross']//parent::td//following-sibling::td[@class='text-left']//following-sibling::td"));
//	
//		System.out.println(scoreList.size());
//		
//		for (int i = 0; i < scoreList.size(); i++) {
//			System.out.println(scoreList.get(i).getText());
//		}
		getScoreList(driver, "Matthew Cross");
		getScoreList(driver, "Michael Leask");
	}

	public static void getScoreList(WebDriver driver, String playerName) {

		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='" + playerName
				+ "']//parent::td//following-sibling::td[@class='text-left']//following-sibling::td"));
		System.out.println("............" + playerName);
		System.out.println("Runs  " + "Balls    " + "Min     " + "4      " + "6  " + "SR  ");
		for (int i = 0; i < scoreList.size(); i++) {
			System.out.print(scoreList.get(i).getText() + "\t ");
		}
		System.out.println("");
		System.out.println("-----------");
		
		
	}

}
