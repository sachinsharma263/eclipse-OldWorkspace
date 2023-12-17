package com.qa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileConcept {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\eclipse-workspace\\SeleniumSession\\com\\qa\\util\\filename.txt");
		File f2 = new File("D:\\eclipse-workspace\\SeleniumSession\\com\\qa\\util\\filename.xlsx");
//		if (f.createNewFile()) {
//	        System.out.println("File created: " + f.getName());
//	      } 

		System.out.println(f.exists());
		System.out.println(f.canWrite());
		System.out.println("File created: " + f.getName());

		f.createNewFile();

		String s = "tata";
		char c[] = s.toCharArray();
		FileOutputStream fos = new FileOutputStream(f, true);
		for (int i = 0; i < c.length; i++) {
			fos.write(c[i]);
			
		}

		fos.close();
		System.out.println(f.length());
		int i;
		FileInputStream fis=new FileInputStream(f);
//		do {
//			i=fis.read();
//			if (i!=-1) {
//				System.out.print("fis"+(char)i);
//			}
//		} while (i!=-1);
		

	
		Scanner scan=new Scanner(fis);
		while (scan.hasNext()) {
			System.out.println("Scanner"+scan.next());
		}
	}

}
