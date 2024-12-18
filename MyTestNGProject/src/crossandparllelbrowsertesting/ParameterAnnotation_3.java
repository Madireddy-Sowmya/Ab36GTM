package crossandparllelbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation_3 {
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
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3F&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0 ");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("ap_email")).sendKeys("sowmyamadireddy91@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("M@the6666flash");
		driver.findElement(By.id("signInSubmit")).click();
	}

}
