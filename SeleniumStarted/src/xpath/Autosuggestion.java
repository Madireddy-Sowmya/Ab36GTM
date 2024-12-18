package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement s1= driver.findElement(By.name("q"));
		s1.sendKeys("India");
		Thread.sleep(2000);
		 List<WebElement> auto= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		 int countofautosuggestion = auto.size();
		 //System.out.println(countofautosuggestion);
		 auto.get(0).click();
		 //auto.get(countofautosuggestion-10).click();
		

	}

}
