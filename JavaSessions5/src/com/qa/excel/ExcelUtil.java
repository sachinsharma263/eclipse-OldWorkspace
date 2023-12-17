package com.qa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelUtil {

	public void getData() {
		try {
			FileInputStream fis=new FileInputStream(new File("./src/com/qa/excel/Test.xlsx"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
