package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Another_Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 //driver.findElement(By.xpath("//span[.='✕']")).click();
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		 List<WebElement> auto=driver.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']/div"));
			/*here we had selected whole drop down table by inspecting on one element after the we will try to find in 
			html code which line is selecting whole drop down suggestion table and then we will write xpath for it*/
			int count = auto.size();
			System.out.println(count);
			auto.get(count-26).click();
			WebElement v=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
			v.click();//org.openqa.selenium.NoSuchElementException
			

	}

}
