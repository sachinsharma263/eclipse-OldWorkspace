package com.qa.javasessions;

import java.util.ArrayList;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		System.out.println(obj.getTrainername());
		System.out.println(obj.getTotalDays());

		String ar[] = obj.getStudent();
		System.out.println("hash code for ar[]"+ ar.hashCode());
		System.out.println(ar.length);

		for (String string : ar) {
			System.out.println(string);
		}

		System.out.println(obj.add(5, 5));

		obj.printTrainerName("naveen");

		int marks = obj.getStudentMarks("naveen");
		System.out.println(marks);

		System.out.println(obj.launchBrowser("chrome"));

		ArrayList<String> list = obj.getPageLinks("login");
		System.out.println(list.size() + "\n" + list);
	}

	// 1. no input and no return
	// void function
	public void test()// 0 param
	{
		System.out.println("test method");
	}

	// 2. no input but some return
	public String getTrainername() {
		return "naveen";
	}

	public int getTotalDays() {
		{
			return 7;
		}
	}

	public String[] getStudent() {
		String studentName[] = new String[3];
		studentName[0] = "naveen";
		studentName[1] = "rahul";
		studentName[2] = "swati";
		
		System.out.println("hash code for studentName[]"+ studentName.hashCode());

		return studentName;
	}

	// 3. some input and some return
	public int add(int a, int b) {
		return a + b;
	}

	// 4. some input and no return
	public void printTrainerName(String name) {
		System.out.println(name);
	}

	/*
	 * create a function pass one param as string:studentName return int:the marks
	 * of the student
	 */

	public int getStudentMarks(String studentName) {
		int marks = 0;
		if (studentName.equals("rahul")) {
			marks = 90;
		} else if (studentName.equals("naveen")) {
			marks = 95;
		} else if (studentName.equals("swati")) {
			marks = 80;
		} else {
			System.out.println(studentName + " not found");
		}
		return marks;
	}

	public int getStudentMarks2(String studentName) {

		if (studentName.equals("naveen")) {
			return 90;
		} else if (studentName.equals("rahul")) {
			return 85;
		} else {
			System.out.println(studentName + " not found");
		}
		return -1;
	}

	/*
	 * create a function:take browser launch the browser on the basis of browser
	 * return void
	 */
	public String launchBrowser(String browserName) {
		String plugin = null;
		if (browserName.equals("chrome")) {
			System.out.println("chrome launched");
			plugin = "chrome";
		} else if (browserName.equals("firefox")) {
			System.out.println("firefox launched");
			plugin = "firefox";
		} else {
			System.out.println(browserName + " not found");
		}

		return plugin;
	}

	/*
	 * create a function:getPageLinks pass one parameter: pageName return:list of
	 * links on the page
	 */
	public ArrayList<String> getPageLinks(String pageName) {
		ArrayList<String> list = new ArrayList<String>();
		if (pageName.equals("login")) {
			list.add("forgot password");
			list.add("signup");
			list.add("reset password");

		} else if (pageName.equals("homePage")) {
			list.add("user profile");
			list.add("logout");
			list.add("contacts");

		} else if (pageName.equals("productPage")) {
			list.add("description");
			list.add("price");
			list.add("seller");
		} else {
			System.out.println(pageName + " not found");
		}

		return list;
	}
}
