package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement d=driver.findElement(By.id("APjFqb"));
		d.sendKeys("India");
		//i.click();
		
		for(int i=0;i<=6;i++)
		{
			Thread.sleep(3000);
		  d.sendKeys(Keys.ARROW_DOWN);
		}
		d.click();


	}

}
