package com.qa.javasessions;

public class AmazonWebTest {

	public static void main(String ar[]) {

		AmazonWebPage awp = new AmazonWebPage("amzon");
		AmazonWebPage awG = new AmazonWebPage("Global shopping", "amazon global");
		AmazonWebPage awI = new AmazonWebPage("India shopping", "amazon india", "privacy policy");

		System.out.println(awG.footer + " " + awG.header + " " + awG.title);
		System.out.println(awI.footer + " " + awI.header + " " + awI.title);
	}
}
