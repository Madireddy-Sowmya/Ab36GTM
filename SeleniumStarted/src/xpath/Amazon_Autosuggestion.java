package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Mobile");
		Thread.sleep(2000);
		List<WebElement> auto= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		 int countofautosuggestion = auto.size();
		 //System.out.println(countofautosuggestion);
		 auto.get(countofautosuggestion-11).click();

	}
     
}
