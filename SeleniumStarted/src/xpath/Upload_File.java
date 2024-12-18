package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement resumeoption =driver.findElement(By.id("Resume"));
		resumeoption.sendKeys("C:\\Users\\sony\\Downloads\\Tirumala Tirupati Devasthanams(Official Booking Po_231229_134553.pdf");

	}

}
