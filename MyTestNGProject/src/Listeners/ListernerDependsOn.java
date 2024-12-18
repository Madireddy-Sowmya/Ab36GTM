package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListernerDependsOn {
	WebDriver d1;
	@Test
	public void login()
	{
		d1= new ChromeDriver();
		d1.get("https://www.google.com");
		d1.manage().window().maximize();
		d1.findElement(By.name("q")).sendKeys("India");
		Assert.assertEquals(d1.getTitle(), "Google");//expected you should go and type your own
		//but actual should come from some method
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}

}
