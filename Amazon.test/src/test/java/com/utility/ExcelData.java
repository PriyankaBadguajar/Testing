
package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pages.BaseClass;

public class ExcelData extends BaseClass {
	XSSFWorkbook wb;
	public ExcelData()  {
		
		File src= new File("./Testdata/LoginCredential.xlsx");
		try {
			FileInputStream file= new FileInputStream(src);
			wb= new XSSFWorkbook(file);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
	public String getStringData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(0).getCell(0).getStringCellValue();
	}
	
	public String getStringData(String sheetname,int row,int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	public String getNumericData(String sheetname,int row,int column)
	{
		
		 long userid = (long) wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
		// System.out.println(username);
		 return String.valueOf(userid);
	}
	
}

