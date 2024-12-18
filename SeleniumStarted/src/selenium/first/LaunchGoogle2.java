package selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchGoogle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement serachtextfield = driver.findElement(By.name("q"));
		serachtextfield.sendKeys("India");
		serachtextfield.sendKeys(Keys.ENTER);

	}

}
