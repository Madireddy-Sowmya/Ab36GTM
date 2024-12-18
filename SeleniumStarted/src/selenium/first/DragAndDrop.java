package selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.id("drag11"));
		WebElement drop=driver.findElement(By.id("div2"));
		Thread.sleep(1000);
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();

		

	}

}
