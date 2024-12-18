package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase3 {
	@Test
	public void scenerio3()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement d=driver.findElement(By.id("fname"));
		d.sendKeys("myname");
		WebElement i=driver.findElement(By.id("Skills"));
		//i.click();
		i.sendKeys(Keys.ARROW_DOWN);
		i.sendKeys(Keys.ENTER);
	}

}
