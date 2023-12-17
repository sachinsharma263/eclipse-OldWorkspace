package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		List<WebElement> list = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//			if (list.get(i).getText().equals("choice 2")) {
//				list.get(i).click();
//			}
//		}

//		selectChoiceValues(list, "choice 2 1");
//		selectChoiceValues(list, "choice 6");

		// selectChoiceValues2(list, "choice 2", "choice 2 1", "choice 6");

		selectChoiceValues2(list, "all");

	}

	public static void selectChoiceValues(List<WebElement> list, String choice) {
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			if (text.equals(choice)) {
				list.get(i).click();
				break;
			}
		}
	}

	public static void selectChoiceValues2(List<WebElement> list, String... choice) {

		if (choice[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < list.size(); i++) {
				try {
				list.get(i).click();
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		} else {
			for (int i = 0; i < choice.length; i++) {
				for (int j = 0; j < list.size(); j++) {
					if (choice[i].equalsIgnoreCase(list.get(j).getText())) {

						list.get(j).click();
					}
				}
			}
		}

	}

}
