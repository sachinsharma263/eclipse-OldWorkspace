package com.qa.javasessions;

import java.util.ArrayList;

public class Page {

	String title;
	String url;
	int loadingTime;
	
	ArrayList<String> browsers;

	public static void main(String[] args) {

		Page loginPage = new Page();
		loginPage.title = "Gmail login";
		loginPage.url = "http://www.gmail.com";
		loginPage.loadingTime = 5;

		Page homePage = new Page();
		homePage.title = "Gmail Home";
		homePage.url = "http://www.gmail.com/home";
		homePage.loadingTime = 10;

		System.out.println(loginPage.title);
		System.out.println(homePage.title);

	}
}
