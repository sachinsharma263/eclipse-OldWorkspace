package com.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	WebDriver driver;
	ElementUtil util;

	public DropDownUtil(WebDriver driver) {
		this.driver = driver;
		util = new ElementUtil(driver);
	}

	/**
	 * This method is used to select the value from drop down on the basis of given
	 * index
	 * 
	 * @param locator
	 * @param index
	 */
	public void selectValueFromDropDownByIndex(By locator, int index) {
		Select s = new Select(util.getElement(locator));
		s.selectByIndex(index);
	}

	/**
	 * This method is used to select the value from drop down on the basis of given
	 * text
	 * 
	 * @param locator
	 * @param text
	 */
	public void selectValueFromDropDownByText(By locator, String text) {
		Select s = new Select(util.getElement(locator));
		s.selectByVisibleText(text);
	}

	/**
	 * This method is used to select the value from drop down on the basis of given
	 * Value
	 * 
	 * @param locator
	 * @param value
	 */
	public void selectValueFromDropDownByValue(By locator, String value) {
		Select s = new Select(util.getElement(locator));
		s.selectByValue(value);

	}

	/**
	 * This method is used to get all the values from drop down
	 * 
	 * @param locator
	 * @return ar
	 */
	public List<String> getDropDownValues(By locator) {
		Select s = new Select(util.getElement(locator));
		List<WebElement> dropList = s.getOptions();
		System.out.println("total number of values in drop down: " + dropList.size());

		List<String> ar = new ArrayList<String>();
		for (int i = 0; i < dropList.size(); i++) {
			ar.add(dropList.get(i).getText());
		}
		return ar;
	}

	/**
	 * This method is used to select the values from drop down without select class
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public void selectValueFromDropDownWithoutSelect(WebDriver driver, By locator, String value) {
		List<WebElement> dropList = driver.findElements(locator);
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			if (text.equalsIgnoreCase(value)) {
				dropList.get(i).click();
				break;
			}
		}

	}
}
