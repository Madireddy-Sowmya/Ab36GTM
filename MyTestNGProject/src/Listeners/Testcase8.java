package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase8 {
	@Test
	public void Scenerio8()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=EAIaIQobChMIlvqa4PG7gwMVjKNmAh02JQwQEAAYASAAEgK6tfD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='google-text']")).click();
	}

}
