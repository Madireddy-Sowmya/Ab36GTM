   package selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tag_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com");
		WebElement text = driver.findElement(By.tagName("textarea"));
		text.sendKeys("Bangalore");
		text.sendKeys(Keys.ENTER);
		

	}

}
