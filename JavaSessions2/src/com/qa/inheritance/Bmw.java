package com.qa.inheritance;

import javax.xml.stream.events.StartDocument;

public class Bmw extends Car{

	@Override
	public void start()
	{
		System.out.println("bmw--start");
	}
	public void sunRoof()
	{
		System.out.println("bmw--sunroof");
	}
	
	public static void test() {
		System.out.println("bmw--test");
	}
	
}
