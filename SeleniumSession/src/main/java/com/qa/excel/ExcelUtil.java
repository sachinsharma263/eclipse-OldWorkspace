package com.qa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.constants.AppConstant;

public class ExcelUtil {

	public static void main(String[] args) {
		getData(AppConstant.TESTDATA_SHEET_NAME);
	}

	public static Object[][] getData(String sheetName) {

		Object data[][] = null;
		File f = new File(AppConstant.TESTDATA_SHEET_PATH);

		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			Workbook workBook = WorkbookFactory.create(fis);

			Sheet sheet = workBook.getSheet(sheetName);

			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			//System.out.println(sheet.getLastRowNum() + " " + sheet.getRow(0).getLastCellNum());

			int totalRows = sheet.getLastRowNum();
			//System.out.println(totalRows);
			for (int i = 0; i < totalRows; i++) { // i=0 i<3
				for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {// j=0 j<3
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					//System.out.print(data[i][j] + "\t");
				}
				//System.out.println("\n");
			}
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
