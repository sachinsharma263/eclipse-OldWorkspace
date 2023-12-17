package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquerydropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome..driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(3000);

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']/ul//li/span[@class='comboTreeItemTitle']"));

//		for (int i = 0; i < choiceList.size(); i++) {
//			String text = choiceList.get(i).getText();
//			
//			System.out.println(text);

//			if (text.equalsIgnoreCase("choice 2 3")) {
//				choiceList.get(i).click();
//				break;
//			}

		//selectChoiceValues(driver, choiceList, "choice 2 3");
		
		//selectChoiceValues(driver, choiceList, "all");
		
		selectChoiceValues(driver, choiceList, "choice 2 3","choice 3","choice 6","choice 6 1");
	}
	// }

	public static void selectChoiceValues(WebDriver driver, List<WebElement> choiceLists, String... value) {

		if (value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceLists.size(); i++) {
				try {
				choiceLists.get(i).click();
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		else {
		for (int i = 0; i < choiceLists.size(); i++) {
			String text = choiceLists.get(i).getText();

			for (int j = 0; j < value.length; j++) {
				if (text.equalsIgnoreCase(value[j])) {
					choiceLists.get(i).click();
					break;
				}
			}
			
		}
	}
	}

}
