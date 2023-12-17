package com.qa.date;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Getting & Formatting the Date/Time in Java
 */
public class DateConcept {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy hh:mm a");
		String dateVal=dateFormat.format(date);
		
		System.out.println(dateVal);
		
		systemCurrentTime();
		differenceTime();
	}
	public static void systemCurrentTime() {
		System.out.println(System.currentTimeMillis());
	}
	public static void differenceTime() {
		long startTime=System.currentTimeMillis();
		
		try {
		Thread.sleep(1);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		long endTime=System.currentTimeMillis();
		
		System.out.println("difference in time:"+ (endTime-startTime));
	
		
	
	}

}
