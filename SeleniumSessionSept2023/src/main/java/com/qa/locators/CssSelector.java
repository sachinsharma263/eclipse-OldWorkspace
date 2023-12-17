 	package com.qa.locators;
/**
 * css is somewhat better than xpath,css is faster than xpath because xpath will traverse in DOM but css will always try to hit specific element
 * sometimes with ie xpath doesn't work so try to avoid xpath as much and used css but some complex web table we cant solve through css, xpath comes
 * in rescue in web table.Really complex dom where css is not helping then used xpath
 * totally depends upon application but preference given to css
 * dnt overlap css and xpath
 * 
 * 
 * @author Dell
 *
 */
public class CssSelector {

	public static void main(String[] args) {
		
		//1.id-->#
		//2. class--> .class
		
		//id
		//#username
		//input#username
		
		//class
		//.form-control.private-form__control.login-email
		//.login-email
		//input.login-email
		//input.form-control.private-form__control.login-email
		
		//#username.form-control.private-form__control.login-email
		//#username.login-email
		//.login-email#username
		
		//htmltag[prop='value']
		//input[type='email']
		//input[id='username']
		//input[id='username'][type='email']
		//input[id='username'][type]
		
		//contains the text -->*
		//input[id*='user']
		//input[id*='name']
		
		//starting with the text--^
		//input[id^='user']
		
		//ending with text-->$
		//input[id$='name']
		
		//parent and child relationship
		//div.private-form__input-wrapper input#username
		//ul.l-nav-list.nav-main-menu li.nav-main-item
		
		//commas in css
		//input#username,input#password
		
		//ul li:first-of-type //https://the-internet.herokuapp.com/
		//ul li:last-of-type
		//ul li:first-of-type a
		//ul li:nth-of-type(1)
		//ul li:nth-of-type(1) a
		//ul li:nth-of-type(2)+li
		
		
		
	}

}
