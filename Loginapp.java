package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.flipkartHomepage;
import objectrepository.flipkartLoginpage;

public class Loginapp {
	
	
	WebDriver driver;
	@BeforeTest
  	public void startup(){
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test
	public void Login() {
	
		driver.get("https://www.flipkart.com/");
		flipkartLoginpage fp = new flipkartLoginpage(driver);
		
		fp.EmailId().sendKeys("7032321535");
		fp.Pwd().sendKeys("srirama1234");
		fp.Submit().click();
		flipkartHomepage fh = new flipkartHomepage(driver);
		fh.Search().click();
		fh.Search().sendKeys("samsung mobiles");
		fh.Click().click();
		String text=fh.Price().getText();
		System.out.println("price is:"+text);
		/*for (int i=0; i<fh.Values().size(); i++) {
			String name= fh.Values().get(i).getText();
			System.out.println("name is:"+name);
			break;
		}*/
		
	}

	public void demodata() throws IOException {
		// file input stream
		/*FileInputStream fis= new FileInputStream("C:\\work\\Book.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0; i<sheets; i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet= workbook.getSheetAt(i);
				
				//Iterating through row to get desired row
				Iterator<Row> rows= sheet.iterator();
				Row firstrow=rows.next();
				Row secondrow= rows.next();
				
				//Iterating through cell to get desired cell value
				Iterator<Cell> ce = secondrow.cellIterator();
				while (ce.hasNext()) {
					Cell value= ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("20000")) {
						// got desired value
						//Cell price= value;
						System.out.println("cell price is:"+value);
						
					}
				}
				
			}
			
			
			
		}*/
		//Assert.assertEquals(value, name);
		File file =    new File("C:\\work\\Book.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //Creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.getSheet("Sheet1");
        
        //Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(2);
        
        //Create a cell object to retreive cell at index 2
        XSSFCell cell=row2.getCell(2);
        System.out.println("cell is:"+cell);
		String result= System.out.println(text.compareTo(cell));
		
		sheet.getRow(1).getCell(2).setCellValue(text);
		sheet.getRow(1).getCell(3).setCellValue(result);
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		
		
	}
	@AfterTest
  	public void tearDown(){
        	driver.quit();
	}
}
