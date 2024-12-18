package Listeners;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass_1.class)
public class Testcase1 {
	@Test
	public void scenerio1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		driver.navigate().back(); 
		driver.navigate().forward();
	}
	

}
