package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase4 {
	@Test
	public void Scenerio4()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(a1).perform();
		WebElement a3 = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		a3.click();

	}

}
