package com.RediffLogin;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDFDemo {

	public static void main(String[] args) {
		
			
		try {
		FileInputStream fis = new FileInputStream("Test Data/Test Data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("LoginData");
		
		XSSFRow row1 = ws.getRow(1);
		//XSSFCell cell1 = row1.getCell(0);
		//XSSFCell cell2 = row1.getCell(1);

		
		int noOfRows = ws.getLastRowNum() - ws.getFirstRowNum();
		int noOfCols = row1.getLastCellNum();
		
		for(int j=1; j<=noOfRows; j++) {	
		
			for(int i=0; i<noOfCols;i++) {
		
			System.out.println(ws.getRow(j).getCell(i));
		}
		}
		
		}catch(Exception e) {
			System.out.println(e);
	
		
	}
	}
}
