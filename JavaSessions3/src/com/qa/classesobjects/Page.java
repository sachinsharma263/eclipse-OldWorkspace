package com.qa.classesobjects;

import java.util.List;
/*
 * business logic is written inside a method	
 * ctrl+o-complete blueprint of the class
 */
public class Page {

	String title;
	String url;
	int loadingTime;
	
	List<String> browsers;

	public static void main(String[] args) {

		Page loginPage = new Page();
		loginPage.title = "Gmail Login";
		loginPage.url = "http://www.gmail.com";
		loginPage.loadingTime = 2;

		Page homePage = new Page();
		homePage.title = "Gmail";
		homePage.url = "";
		homePage.loadingTime = 2;
		
		System.out.println(loginPage.browsers);
	}
}
