package com.Xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskQues1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\91893\\eclipse-workspace\\MavenPro\\target\\Xcel\\Book2.xlsx");
		
	    FileInputStream fis = new FileInputStream(f);
	    
	    Workbook wb = new XSSFWorkbook(fis);
	    
	    Sheet s = wb.getSheet("Details");
	    

	    int row = s.getPhysicalNumberOfRows();
	    System.out.println(row);
	    
	    
	    
//	    int cell = row.getPhysicalNumberOfCells();
//	    System.out.println(cell);

	    
		
	}
	
	

}
