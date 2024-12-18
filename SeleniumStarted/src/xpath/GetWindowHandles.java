package xpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("1");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=EAIaIQobChMIlvqa4PG7gwMVjKNmAh02JQwQEAAYASAAEgK6tfD_BwE&gclsrc=aw.ds");
		Thread.sleep(3000);
		WebElement googlelink=driver.findElement(By.xpath("//span[.=\"Google\"]"));
		googlelink.click();
		//driver.manage().window().maximize();
		String parentid=driver.getWindowHandle();
		Set<String> parentandchildid= driver.getWindowHandles();
		System.out.println(parentid);
		System.out.println(parentandchildid);
		Iterator<String> idl= parentandchildid.iterator();
		String pid=idl.next();
		String childid=idl.next();
		System.out.println(pid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement otherid=driver.findElement(By.id("identifierId"));
		otherid.sendKeys("sowmyamadireddy91@gmail.com");
		Thread.sleep(3000);
		driver.quit();

		



	}

}
