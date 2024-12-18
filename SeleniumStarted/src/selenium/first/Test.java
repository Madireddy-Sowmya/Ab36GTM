package selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement c_service = driver.findElement(By.partialLinkText("Customer"));
		c_service.click();
		

	}

}
