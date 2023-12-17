package com.qa.locators;

import org.openqa.selenium.By;

/**
 * xpath is address of the web element but not an property
 * the moment we write  //input we are asking our engine to not start from beginning but start from middle having html tag as input
 * //input 1of3: target should be 1of1
 * @author Dell
 *
 */
public class Custom_Xpath1 {

	public static void main(String[] args) {
		
		//1. absolute xpath
		//html/body/div[1]/div[5]/span/a
		
		//absolute xpath start from beginning and traverse all the tags till reach that web element
		//todays our xpath is working but tomorrow there is no guarantee whether it will work or not.suppose one of the div changes our xpath changed
		// thats why we have to use relative xpath or custom xpath where we directly go to that element and check for some property
		
		//2. custom/relative xpath
		//htmltag[@id='test']
		//input[@id=''] comination of htmltag plus properties
		
		
		//<input id="username" type="email" tabindex="1" aria-labelledby="UIFormControl-label-2" class="form-control private-form__control login-email" value="">
		//above element having id so we can use By.id but i dnt want to use id locator, i want to use xpath
		// //input[@id='username']  //htmltag[@propertyname='value']
		// //input[@type='email']
		// //input[@type='email' and @id='username']-- 1 element
		// //input[@type='email' and @id]--1
		// //input[@type and @id] --3
		
		// //input[@id='password' and @class='form-control private-form__control login-password m-bottom-3']
		// (//input[contains(@id,'username') and @class='form-control private-form__control login-email' ])
		// //input[@type='submit' and @value='Login' and contains(@class,'btn btn-small')]
		
		// //i18n-string[text()]--1of10
		// //i18n-string[text()='Sign up']-- 1of1
		// //a//i18n-string[text()='Sign up']
		// //a/i18n-string[text()='Sign up']
		// //a[text()='Forgot Password?']
		
		// //input[@type='submit']
		// //input[@type='submit' and @value='Login']
		
		// //input[@class='form-control private-form__control login-email']
		// By.className("form-control private-form__control login-email']") -- this will not work because cascaded classes are not allowed with By.className
		//By.className("login-email") will work
		//By.xpath("//input[@class='form-control private-form__control login-email']");
	
		//css selector
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		
		// (//input[@type])[1]
		
		// (//input[@type])[position()] --1of3
		// (//input[@type])[position()=3]--1of1
		// (//input[@type])[last()]
		
		// //ul[@class='l-nav-list nav-main-menu']//li-- 1of46
		// //ul[@class='l-nav-list nav-main-menu']/li --1of8
		// //ul[@class='l-nav-list nav-main-menu']/li[contains(@class,'nav-main-item')]
		
		// //div-- 1of25
		// //div//input--1of3
		// //div/input--1of2
		
		// //input[@type='email']/..
	}
}
