package com.qa.javasessions;

public class AmazonWebPage {

	String title;
	String header;
	String footer;

	public AmazonWebPage(String header) {
		this.header = header;
	}

	public AmazonWebPage(String title, String header) {
		this.title = title;
		this.header = header;
	}

	public AmazonWebPage(String title, String header, String footer) {
		this.title = title;
		this.header = header;
		this.footer = footer;
	}
}
