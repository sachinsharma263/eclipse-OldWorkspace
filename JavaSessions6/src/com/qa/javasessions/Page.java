package com.qa.javasessions;

import java.util.ArrayList;

public class Page {

	String title;
	String url;
	int loadingTime;
	ArrayList<String> browser;

	public static void main(String[] args) {

		Page lp = new Page();
		lp.title = "login";
		lp.url = "http://login";
		lp.loadingTime = 5;

		Page hp = new Page();
		hp.title = "homepage";
		hp.url = "http://home";
		hp.loadingTime = 5;

		System.out.println(lp.title+"\t"+lp.browser);
		System.out.println(hp.title);

	}

}
