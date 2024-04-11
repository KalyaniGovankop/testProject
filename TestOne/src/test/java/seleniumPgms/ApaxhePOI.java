package seleniumPgms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApaxhePOI {

	public static void main(String[] args) throws Exception {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\120CD\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		
		// TODO Auto-generated method stub
		File file = new File("F:\\Kals New\\KalTechnologies.xlsx");   //creating a new file instance  
		FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(2);     //creating a Sheet object to retrieve object 
		System.out.println(sheet.getRow(0).getCell(0));
		
		XSSFSheet sheet1 = wb.getSheetAt(0);     //creating a Sheet object to retrieve object 
		System.out.println(sheet1.getRow(1).getCell(0));
		
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println(sheet.getRow(0).getLastCellNum());
		System.out.println(sheet.getRow(0).getRowNum());
		System.out.println(sheet.getRow(0).createCell(8));

	}

}
