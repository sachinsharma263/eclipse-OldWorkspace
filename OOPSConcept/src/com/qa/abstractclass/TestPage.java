/**
 * 
 */
package com.qa.abstractclass;

/**
 * @author Dell
 *
 */
public class TestPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.header();
		lp.footer();
		lp.privacyPolicy();
		
		//new Page(); //Cannot instantiate the type Page
		lp.a=10;
		System.out.println(lp.a);
	}

}
