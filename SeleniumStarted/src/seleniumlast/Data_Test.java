package seleniumlast;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\sony\\Downloads\\datafile1.xlsx");
		Workbook w1= WorkbookFactory.create(fis);
		String un = w1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
		//String pwd = w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(pwd);
		String pp = NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue());
		System.out.println(pp);
		
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com ");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pp);
		//driver.findElement(By.name("login")).click();


	}

}
