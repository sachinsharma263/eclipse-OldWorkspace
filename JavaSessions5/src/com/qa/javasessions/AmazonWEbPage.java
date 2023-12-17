package com.qa.javasessions;

public class AmazonWEbPage {

	String title;
	String header;
	String footer;

	public AmazonWEbPage(String title, String header, String footer) {
		this.title = title;
		this.header = header;
		this.footer = footer;
	}

	public AmazonWEbPage(String title, String header) {
		this.title = title;
		this.header = header;

	}

	public AmazonWEbPage(String title) {
		this.title = title;

	}

	public AmazonWEbPage() {
		// TODO Auto-generated constructor stub
	}

}
