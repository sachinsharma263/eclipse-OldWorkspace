package com.qa.selenium4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.opencart.com/");

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.linkText("Linkedin")).click();
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		System.out.println(hList.size());

		if (switchToRightWindow(driver, "Facebook", hList)) {
			System.out.println("inside switchToRightWindow");
			System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());
		}
		switchToParentWindow(driver, parentWindow);
		System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());

		closeAllWindows(driver, hList, parentWindow);
		
		switchToParentWindow(driver, parentWindow);
		System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());

	}

	public static boolean switchToRightWindow(WebDriver driver, String title, List<String> hList) {

		for (String e : hList) {
			System.out.println("inside for");
			driver = driver.switchTo().window(e);
			System.out.println("after driver");
			if (driver.getTitle().contains(title)) {
				System.out.println("you are on right widow");
				return true;
			}
		}
		return false;
	}

	public static void switchToParentWindow(WebDriver driver, String parentWindow) {
		driver.switchTo().window(parentWindow);
	}

	public static void closeAllWindows(WebDriver driver, List<String> list, String parentWindow) {
		for (String e : list) {
			if (!e.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(e).close();
			}
		}
	}
}
