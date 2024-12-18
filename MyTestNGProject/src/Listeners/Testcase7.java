package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase7 {
	@Test
	public void Scenerio7()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement a1=driver.findElement(By.linkText("Gmail"));
		Actions a2 = new Actions(driver);
		a2.doubleClick(a1).perform();

	}

}
