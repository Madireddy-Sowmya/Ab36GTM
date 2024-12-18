package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		System.out.println("1");
		Thread.sleep(20000);
		WebElement a1 = driver.findElement(By.xpath("//div[@class=\"_1wE2Px\"]"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(a1).perform();
		//Thread.sleep(20000);
		//WebElement a3 = driver.findElement(By.xpath("(//a[@class='_3490ry'])[5]"));
		//Thread.sleep(20000);
		//a3.click();
		//Actions a4 = new Actions(driver);
		//a4.moveToElement(a3).perform();
		
		//WebElement a5 = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		//Thread.sleep(3000);
		//a5.click();
		//div[@class='_1ch8e_ _1mZ8pZ']

	}

}
