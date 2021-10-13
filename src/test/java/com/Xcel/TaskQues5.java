package com.Xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TaskQues5 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
//		File f =new File("C:\\Users\\91893\\eclipse-workspace\\MavenPro\\target\\Xcel\\Book3.xlsx");
//		
//		FileInputStream fis = new FileInputStream(f);
//		
//		Workbook wb = new XSSFWorkbook(fis);
//		
//		Sheet mysheet = wb.getSheet("hoteldetail");
//		
//		Row row = mysheet.getRow(0);
//		
//		Cell cell = row.getCell(0);
//		
//		System.out.println(cell);
		
		launchBrowser();
		
		launchUrl("http://adactinhotelapp.com/");
		
		WebElement we = driver.findElement(By.id("username"));
		
		sendLetters(we,excelParticularValue("Book3", 1, 0, "Sheet1") );
		
		WebElement clk = driver.findElement(By.xpath("//input[@name='login']"));
		clickBtn(clk);
		
		
	
	}

	
	

}
