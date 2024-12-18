package seleniumlast;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//FileInputStream fis=new FileInputStream("C:\\Users\\sony\\eclipse-workspace\\SeleniumStarted\\testdata\\fatchingvalues345.xlsx");
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
	}

}
