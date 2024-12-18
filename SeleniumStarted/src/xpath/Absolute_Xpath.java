package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sony/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement un =driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("Sowmya");
		
		WebElement hint=driver.findElement(By.xpath("/html/body/input[2]"));
		hint.sendKeys("petname");
		
		WebElement mail=driver.findElement(By.xpath("/html/body/input[5]"));
		mail.click();
		
		WebElement pass=driver.findElement(By.xpath("/html/body/input[3]"));
		pass.sendKeys("M@the6666flash");
		
		WebElement fname=driver.findElement(By.name("fname"));
		fname.sendKeys("sowmya");
		
		WebElement submit =driver.findElement(By.xpath("/html/body/input[6]"));
		submit.click();
		
		WebElement ib=driver.findElement(By.id("123"));
		ib.click();
		
		WebElement ig=driver.findElement(By.name("name2")); 
		ig.click();
		
		WebElement ibaby=driver.findElement(By.id("321"));
		ibaby.click();
		
		WebElement submit1 =driver.findElement(By.xpath("/html/body/input[10]"));
		submit1.click();
		WebElement c =driver.findElement(By.xpath("/html/body/input[12]"));
		c.click();
		WebElement b =driver.findElement(By.xpath("/html/body/input[13]"));
		b.click();
		WebElement sup =driver.findElement(By.xpath("/html/body/input[14]"));
		sup.click();

	}

}
