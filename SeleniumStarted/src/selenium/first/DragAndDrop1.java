package selenium.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//old
		//driver.manage().timeouts().implicitlyWait(0, null);
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.id("drag11"));
		WebElement drop=driver.findElement(By.id("div2"));
		Thread.sleep(1000);
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();                              
		WebElement drag1=driver.findElement(By.id("drag11"));
		WebElement drop1=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[12]"));
		Thread.sleep(1000);
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(drag1,drop1).perform();
		WebElement drag2=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[10]"));
		WebElement drop2=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[7]"));
		Thread.sleep(1000);
		Actions a3 = new Actions(driver);
		a3.dragAndDrop(drag2,drop2).perform();
		/*WebElement drag3=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[11]"));
		WebElement drop3=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[7]"));
		Thread.sleep(1000);
		Actions a4 = new Actions(driver);
		a4.dragAndDrop(drag3,drop3).perform();*/




	}

}
