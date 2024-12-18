package xpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
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
        //Thread.sleep(3000);
        //driver.close();   
        Iterator<String> id1 = Pcid.iterator();
        String partentid = id1.next();
        String childid = id1.next();
        System.out.println(partentid);
        System.out.println(childid);
        driver.switchTo().window(childid);
        Thread.sleep(3000);
        driver.close();  
        
        

	}

}
