package seleniumlast;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\sony\\Downloads\\datafile.xlsx");

		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String loingDetails = c1.getStringCellValue();
		System.out.println(loingDetails);
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String loingDetails2 = c2.getStringCellValue();
		System.out.println(loingDetails2);
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/?utm_source=adwords-brand&utm_medium=udemyads&utm_campaign=Brand-Udemy_la.EN_cc.INDIA_dev.&utm_term=_._ag_133043842301_._ad_595460368494_._de_c_._dm__._pl__._ti_kwd-296956216253_._li_9062164_._pd__._&utm_term=_._pd__._kw_udemy_._&matchtype=b&gad_source=1&gclid=EAIaIQobChMIm7TP2ur9hAMVHIVLBR39kQwcEAAYASAAEgKH-vD_BwE");
		WebElement l = driver.findElement(By.xpath("//span[.='Log in']"));
		l.click();
		//driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
