package com.qa.javasessions;

public class AmazonWebTest {

	public static void main(String[] args) {

		AmazonWEbPage amz = new AmazonWEbPage();
		AmazonWEbPage amw2G = new AmazonWEbPage("Global shopping", "amazon global");
		AmazonWEbPage amw2I = new AmazonWEbPage("india shoping", "amazon india", "privacy policy");

		System.out.println(amw2I.title + "\t" + amw2I.header + "\t" + amw2I.footer);
		System.out.println(amw2G.title + "\t" + amw2G.header + "\t" + amw2G.footer);
	}
}
