package selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com ");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("email")).sendKeys("sowmyamadireddy91@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("167r1a0430");
		driver.findElement(By.name("login")).click();

	}

}
