package com.qa.locators;

public class Custom_Xpath2 {

	public static void main(String[] args) {
		
		//text()
		// //h1[text()='Delight made easy']
		// //a[text()=' FREE TRIALS']
	
	
		//contains()-- useful for dynamic property
		//input[contains(@id,'username')]--1
		// //input[contains(@id,'')]--3
		// ////i18n-string[contains(text(),'Sign up')]
		// //i18n-stri
		// //*[contains(@type,'submit') and contains(@id,'loginBtn')]
		// //i18n-string[contains(text(),'Remember me')]
		
		// //i18n-string[text()='Sign up']
		// //button[contains(@type,'submit')]
		// //button[contains(@type,'submit') and @id='loginBtn']
		
		// //input[starts-with(@id,'user')]
		
		//xpath axis
		// input-group
		// //div[@class='input-group']/input--2
		// //div[@class='input-group']//input--3
		// //div[@class='input-group']//following::input[@type='text']
		// //div[@class='input-group']//following::input[contains(@class,'form') and @type='text'] 
		// (//div[@class='input-group']//following::input)[1]
		// (//div[@class='input-group']//following::input)[position()=1]
		// //ul[@class='l-nav-list nav-main-menu']//following::li[contains(@class,'nav-main-item')]
		// //div[@class='input-group']//ancestor::div[@class='container']
	}
}
