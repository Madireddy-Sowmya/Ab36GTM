package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sony/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement un =driver.findElement(By.xpath("(//input)[1]"));
		un.sendKeys("Sowmya");
		
		WebElement hint=driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("petname");
		
		WebElement mail=driver.findElement(By.xpath("(//input)[11]"));
		mail.click();


	}

}
