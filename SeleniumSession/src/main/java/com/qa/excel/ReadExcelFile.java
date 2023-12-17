package com.qa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws InvalidFormatException {

		File f = new File("./excel/Test.xlsx");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Workbook workBook = null;
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = workBook.getSheet("second");

		int rowCount = sheet.getLastRowNum();

		// int cell=sheet.getLastCellNum();

		// int cell=sheet.getRow(1).getLastCellNum();
		int cell = sheet.getRow(2).getLastCellNum();
		// int cell=sheet.getRow(2).getLastCellNum();

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {

			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(sheet.getRow(i).getCell(j) + "\t");
			}
			System.out.println("\n");
		}

	}

}
