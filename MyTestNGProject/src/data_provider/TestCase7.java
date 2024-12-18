package data_provider;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase7 {
	//we should do this program in Testcase model because here we are playing with one parameter
	
	@DataProvider (name = "searchme")
	public Object [] [] method1234()
	{
		Object [] [] o1= new Object [10] [1];
		o1 [0] [0] = "shirt";
		o1 [1] [0] = "shoe";
		o1 [2] [0] = "sun glasses";
		o1 [3] [0] = "hair brush";
		o1 [4] [0] = "nail paint";
		o1 [5] [0] = "mobiles";
		o1 [6] [0] = "laptop";
		o1 [7] [0] = "ear buds";
		o1 [8] [0] = "hand bag";
		o1 [9] [0] = "chair";

		return o1;
	}
	@Test(dataProvider="searchme")
	public void scenerio12345(String name) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER); 
		driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]")).click();
		String Pid=driver.getWindowHandle();
        Set<String> Pcid=driver.getWindowHandles();
        System.out.println(Pid);
        System.out.println(Pcid); 
        Iterator<String> id1 = Pcid.iterator();
        String partentid = id1.next();
        String childid = id1.next();
        System.out.println(partentid);
        System.out.println(childid);
        driver.switchTo().window(childid);//moving your control from one id to another id
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(3000);
      WebElement delete= driver.findElement(By.className("ewc-delete-icon"));
        delete.click();
       
	}

	

	

}
