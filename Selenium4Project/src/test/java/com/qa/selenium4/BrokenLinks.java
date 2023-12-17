package com.qa.selenium4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.com");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println("total no of links one the page: " + list.size());

		List<String> urlList = new ArrayList<String>();

		for (WebElement element : list) {
			String url = element.getAttribute("href");
			if (!(url == null)) {

				urlList.add(url);

				// checkBrokenLink(url);
			}
		}
		Long stTime = System.currentTimeMillis();
		 urlList.parallelStream().forEach(e -> checkBrokenLink(e));

	
//		for (String url : urlList) {
//			checkBrokenLink(url);
//		}
		Long endTime = System.currentTimeMillis();

		System.out.println("time taken:" + (endTime - stTime));
	}

	public static void checkBrokenLink(String linkUrl) {

		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();

			if (httpUrlConnection.getResponseCode() >= 400) {
				System.out.println(linkUrl + "-->" + httpUrlConnection.getResponseMessage() + " is a broken llink");
			} else {
				System.out.println(linkUrl + "-->" + httpUrlConnection.getResponseMessage());
			}
		} catch (Exception e) {
			System.out.println("some exception occured: " + linkUrl);
			System.out.println(e.getMessage());
		}

	}
}
