package RetryGTM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Senario1 {  
	@Test(retryAnalyzer=RetryGTM.Retry.class)
	public void LoginFB() throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
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
	//Thread.sleep(3000);
	//driver.quit();
	Thread.sleep(3000);
    WebElement delete= driver.findElement(By.className("ewc-delete-ico"));
      delete.click();
     
	}
}
