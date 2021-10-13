package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static final String String = null;

	public static WebDriver driver;
	
	public static Actions a;
	
	public static Robot r;
	
	public static JavascriptExecutor js;
	
	public static Alert al = driver.switchTo().alert();
	
	public static Select se;
	
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public static void currentUrl() {
		
		driver.getCurrentUrl();

	}
	
	public static void currentTitle() {
		driver.getTitle();

	}
	
	public static void sendLetters(WebElement ele, String dis) {
		
		ele.sendKeys(dis);
		
	}
	
	public static void getWebText(WebElement ele) {
		 
		String text = ele.getText();
		System.out.println(text);

	}
	
	
	
	
	
	public static void clickBtn(WebElement ele) {
		
		ele.click();

	}
	
	public static void screenShot(String name) throws IOException {
		TakesScreenshot s = (TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\91893\\eclipse-workspace\\MavenPro\\img\\"+name+".png");
		FileUtils.copyDirectory(src,des);
		

	}
	
	public static void cursorPoint(WebElement ele) {
		
		a = new Actions(driver);
		
		a.moveToElement(ele).perform();	

	}
	
	public static void keyMethod() throws AWTException {
		r=new Robot();
		
		
		for (int i = 0; i < 3; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
			
		}
	
	public static void ent() {
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void sendScript(WebElement ele,String dis) {
	
		js=(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].setAtribute('value',"+dis+")", ele) ;
		
	}
	
	public static void scrollup(WebElement ele) {
		
		js.executeScript("argument[0].scrollIntoView(false)", ele);

	}
	
   public static void scrolldown(WebElement ele) {
		
		js.executeScript("argument[0].scrollIntoView(true)", ele);

	}
   
   public static void getAttribute(WebElement ele) {
		
		Object print = js.executeScript("return argument[0].getAttribute('value')", ele);
		
		String s = (String)print;
		System.out.println(s);

	}
   
   public static void setAttribute(WebElement ele) {
		
		Object print = js.executeScript("argument[0].setAttribute('style','background:red;border:12x sollidyellow')", ele);
		
		String s = (String)print;
		System.out.println(s);

	}
  
   
   public static void clickbutn(WebElement ele) {
	
	   js.executeScript("arguments[0].click", ele);

}
	
   public static void alertOk() {
	   
	al.accept();
	
}
   
   public static void alertcancel() {
	   
		al.dismiss();
		
	}
   
   public static void alertOk(String dis) {
	   
		al.sendKeys(dis);
		
	}
   
   public static void rightClick(WebElement ele) {
	   
		a.contextClick(ele).perform();
		
	}
   
   public static void leftClick(WebElement ele) {
	   
		a.doubleClick(ele).perform();
		
	}
   
   public static void dragdrop(WebElement src,WebElement dis) {
	   
		a.dragAndDrop(src, dis).perform();
		
	}

   public static void selctObj(WebElement ele) {
	
	   se = new Select(ele);

}
   
   
   public static void select(int num) {
	   
	   //se = new Select(ele);
	   
	   se.selectByIndex(num);
	   
	   
	   
}
   
 public static void selectVis( String s) {
	   
	   //se = new Select(ele);
	   
	   se.selectByVisibleText(s);
	   
	   
	   
}
 
 public static void selectval( String s) {
	   
	  // se = new Select(ele);
	   
	   se.selectByValue(s);
	   
	   
	   
}
 
 public static void deSelin(int num) {
	   
	   //se = new Select(ele);
	   
	   se.deselectByIndex(num);
	   
 }
	   
	   public static void deSelvis(String s) {
		   
		   //se = new Select(ele);
		   
		   se.deselectByVisibleText(s);
	   
	   
}
 
	   public static void deSelval(String s) {
		   
		   //se = new Select(ele);
		   
		   se.deselectByValue(s);
	
 }
	   
	   public static void deSelAll() {
		   
		   //se = new Select(ele);
		   
		   se.deselectAll();

	
 }
	   
	   public static void muilti() {
		   
		   //se = new Select(ele);
		   
		   se.isMultiple();
		   
}
	   
public static void getOp() {
		   
		   //se = new Select(ele);
		   
		   se.getOptions();
		   
}
	
public static void getAllOp() {
	   
	   //se = new Select(ele);
	   
	   se.getAllSelectedOptions();
	   
}

public static void getFirst() {
	   
	   //se = new Select(ele);
	   
	   se.getFirstSelectedOption();
	   
}

public static void windowhand() {
	
	String parentid = driver.getWindowHandle();
	System.out.println("Parent Id" +parentid);
	
	Set<String> childid = driver.getWindowHandles();
	System.out.println("Child Id" +childid);
	
	for (String ch: childid) {
		
		parentid.equals(ch);
		
		driver.switchTo().window(ch);
			
	}
	

}

public static void frame(WebElement ele) {
	
	driver.switchTo().frame(ele);
	

}

public static void parentFrame() {
	
	driver.switchTo().parentFrame();

	
}

public static void defaulFrame() {
	
	driver.switchTo().defaultContent();

	
}

public static  String excelParticularValue(String dis, int num,int dig,String des) throws IOException {
	
	
	File f =new File("C:\\Users\\91893\\eclipse-workspace\\MavenPro\\target\\Xcel\\"+dis+".xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet mysheet = wb.getSheet(des);
	
	Row row = mysheet.getRow(num);
	
	Cell cell = row.getCell(dig);
	
	int Type = cell.getCellType();
	String value ;
	if (Type==1) {
		
		 value = cell.getStringCellValue();
		
	}
	
	else if (DateUtil.isCellDateFormatted(cell)) {
		
		Date d = cell.getDateCellValue();
		 SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		 value = sim.format(d);
		 
		
	}
	
	else {
		double dbl = cell.getNumericCellValue();
		long l =(long)dbl;
		 value = String.valueOf(l);
		
	}
	return value;

}






	   
 }
	
	


