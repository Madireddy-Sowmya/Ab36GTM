package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-e60a6e6 e-con-full e-flex e-con e-child']"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(a1).perform();
		WebElement a3 = driver.findElement(By.xpath("(//div[@class='popup8'])[1]"));
		Thread.sleep(3000);
		a3.click();


	}

}
