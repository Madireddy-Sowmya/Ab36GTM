package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Amazon_Search_Tshirt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement t=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				t.sendKeys("tshirt");
				Thread.sleep(3000);
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		/*here we had selected whole drop down table by inspecting on one element after the we will try to find in 
		html code which line is selecting whole drop down suggestion table and then we will write xpath for it*/
		int count = auto.size();
		System.out.println(count);
		auto.get(count-1).click();
				


	}

}
