package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase9 {
	@Test
	public void Scenerio9()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement  gmaillink = driver.findElement(By.linkText("Gmail"));
		gmaillink.click();
	}

}
