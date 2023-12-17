package com.qa.javasessions;

public class AmazonWebTest {

	public static void main(String[] args) {

		AmazonWebPage awp = new AmazonWebPage();

		AmazonWebPage awpI = new AmazonWebPage("Amazon header", "Amazon title", "Amazon footer");
		AmazonWebPage awpG = new AmazonWebPage("Amazon header", "Amazon footer");
	}

}
