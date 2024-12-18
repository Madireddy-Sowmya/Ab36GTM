package crossandparllelbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation_1 {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void browserlaunch(String nameofbrowser)
	{
		if(nameofbrowser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(nameofbrowser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		if(nameofbrowser.equals("Ie"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.facebook.com ");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("email")).sendKeys("sowmyamadireddy91@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("167r1a0430");
		driver.findElement(By.name("login")).click();
	}

}
