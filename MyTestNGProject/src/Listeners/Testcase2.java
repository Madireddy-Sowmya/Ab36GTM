package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase2 {
	@Test
	public void Scenerio2()
	{
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement  mobilelink = driver.findElement(By.linkText("Mobiles"));
	mobilelink.click();
	}
	

}
