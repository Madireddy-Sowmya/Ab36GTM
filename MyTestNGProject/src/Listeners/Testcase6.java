package Listeners;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass_1.class)
public class Testcase6 {
	@Test
	public void Scenerio6()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("tshirt");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]")).click();
		String id=driver.getWindowHandle();
		Set<String> pid=driver.getWindowHandles();
		System.out.println(id);
		System.out.println(pid);
		/*Thread.sleep(3000);
		driver.close();*/
		Iterator<String> idl=pid.iterator();
		String parentid=idl.next();//1st id
		String childid1=idl.next();//1st child id
		System.out.println(parentid);
		System.out.println(childid1);
		driver.switchTo().window(childid1);//moving control from one id to another id
		driver.close();
	}

}
