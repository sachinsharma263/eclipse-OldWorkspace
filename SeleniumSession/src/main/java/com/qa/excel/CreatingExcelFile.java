package com.qa.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {

	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook workBook=new XSSFWorkbook();
		
		XSSFSheet sheet=workBook.createSheet("second");
		
		XSSFRow row1=sheet.createRow(0);
		
		XSSFCell cell1=row1.createCell(0);
		XSSFCell cell2=row1.createCell(1);
		XSSFCell cell3=row1.createCell(2);
		
		cell1.setCellValue("Name");
		cell2.setCellValue("Email");
		cell3.setCellValue("Mobile");
		
		XSSFRow row2=sheet.createRow(1);
		XSSFCell cell4=row2.createCell(0);
		XSSFCell cell5=row2.createCell(1);
		XSSFCell cell6=row2.createCell(2);
		
		cell4.setCellValue("Naveen");
		cell5.setCellValue("naveen@gmail.com");
		cell6.setCellValue("9999999");
		
		XSSFRow row3=sheet.createRow(2);
		XSSFCell cell7=row3.createCell(0);
		XSSFCell cell8=row3.createCell(1);
		XSSFCell cell9=row3.createCell(2);
		
		cell7.setCellValue("Deepak");
		cell8.setCellValue("deepak@gmail.com");
		cell9.setCellValue("9999999");
		
		File f=new File("./excel/Test.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		workBook.write(fos);
		
		fos.close();
	}
	
}
