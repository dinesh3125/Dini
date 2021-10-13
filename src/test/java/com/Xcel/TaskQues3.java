package com.Xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskQues3 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\91893\\eclipse-workspace\\MavenPro\\target\\Xcel\\Book2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("Details");
				
		Row r = s.createRow(11);
		
			
	    Cell c = r.createCell(0);
		
	    c.setCellValue("Riya");		
		FileOutputStream fos=new FileOutputStream(f);
	
		wb.write(fos);
		
		System.out.println("done");
	
	
		
		
		
		
	}

}
