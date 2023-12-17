package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome..driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(3000);

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']/ul//li/span[@class='comboTreeItemTitle']"));

		/*
		 * for (int i = 0; i < choiceList.size(); i++) {
		 * System.out.println(choiceList.get(i).getText()); }
		 */
		
		/*
		 * selectChoiceValues(choiceList, "choice 1"); selectChoiceValues(choiceList,
		 * "choice 2 1");
		 */
		
		selectChoiceValues2(choiceList, "choice 1","choice 2","choice 6");
		//selectChoiceValues2(choiceList, "all");
		
		

	}

	public static void selectChoiceValues(List<WebElement> choiceList, String value) {

		for (int i = 0; i < choiceList.size(); i++) {
			if (choiceList.get(i).getText().equalsIgnoreCase(value)) {
				choiceList.get(i).click();
				break;
			}
		}
	}
	public static void selectChoiceValues2(List<WebElement> choiceList,String... values) {
		if (values[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
			try {
				choiceList.get(i).click();
				} catch (Exception e) {
				// TODO: handle exception
			}}
		}
		else {
			for (int i = 0; i < values.length; i++) {
				for (int j = 0; j < choiceList.size(); j++) {
					if (values[i].equalsIgnoreCase(choiceList.get(j).getText())) {
						choiceList.get(j).click();
						break;
					}
				}
			}
		}
	}

}
