package xpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gwhs_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("tshirt");
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
        
        /*Thread.sleep(3000);
        driver.close();  */  


	}

}
 