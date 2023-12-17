package com.qa.javasessions;

public class AmazonWebPage {

	String header;
	String title;
	String footer;

	public AmazonWebPage(String header) {
		this.header = header;
	}

	public AmazonWebPage(String header, String title) {
		this.header = header;
		this.title = title;
	}

	public AmazonWebPage(String header, String title, String footer) {
		this.header = header;
		this.title = title;
		this.footer = footer;
	}

	public AmazonWebPage() {
		System.out.println("welcome to Amazon");
	}

}
