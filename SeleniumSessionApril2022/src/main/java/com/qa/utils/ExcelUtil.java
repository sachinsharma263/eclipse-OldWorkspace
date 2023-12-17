package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		getData();
	}

	public static Object[][] getData() throws InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(new File(AppConstants.SHEET_PATH));

		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(AppConstants.SHEET_NAME);

		Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		
		/*
		 * for (int i = 0; i < data.length; i++) { for (int j = 0; j < data[i].length;
		 * j++) { System.out.print(data[i][j]+"\t"); } System.out.println("\n"); }
		 */

		return data;
	}
}
