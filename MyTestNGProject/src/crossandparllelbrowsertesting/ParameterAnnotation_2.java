package crossandparllelbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation_2 {
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
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement  mobilelink = driver.findElement(By.linkText("Mobiles"));
		mobilelink.click();
	}

}
