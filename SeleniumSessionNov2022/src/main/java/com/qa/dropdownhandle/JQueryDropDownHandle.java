package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome..driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']/ul//li/span[@class='comboTreeItemTitle']"));

		/*
		 * for (int i = 0; i < choiceList.size(); i++) {
		 * System.out.println(choiceList.get(i).getText()); } for (int i = 0; i <
		 * choiceList.size(); i++) { if
		 * (choiceList.get(i).getText().equalsIgnoreCase("choice 2 1"))
		 * 
		 * {
		 * 
		 * choiceList.get(i).click(); break; } }
		 */

		/*
		 * selectChoiceValues(choiceList, "choice 2 1"); selectChoiceValues(choiceList,
		 * "choice 6 1");
		 */
		selectChoiceValues2(choiceList, "all");
		// selectChoiceValues2(choiceList, "choice 1", "choice 2 1", "choice 6");

	}

	public static void selectChoiceValues(List<WebElement> choiceList, String choice) {
		for (int i = 0; i < choiceList.size(); i++) {
			if (choiceList.get(i).getText().equalsIgnoreCase(choice)) {
				choiceList.get(i).click();
				break;

			}

		}
	}

	public static void selectChoiceValues2(List<WebElement> choiceList, String... choice) {

		if (choice[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				try {
					choiceList.get(i).click();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		} else {
			for (int i = 0; i < choice.length; i++) {
				for (int j = 0; j < choiceList.size(); j++) {
					if (choice[i].equalsIgnoreCase(choiceList.get(j).getText())) {
						choiceList.get(j).click();
						break;
					}
				}
			}
		}
	}

}
