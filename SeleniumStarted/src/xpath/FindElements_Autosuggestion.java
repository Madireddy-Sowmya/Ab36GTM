package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("shoe");
		Thread.sleep(5000);
		List<WebElement> auto= driver.findElements(By.xpath("//form/ul/li"));
		int count = auto.size();
		 System.out.println(count);
		auto.get(0).click();
		 //auto.get(count-1).click();


	}

}
