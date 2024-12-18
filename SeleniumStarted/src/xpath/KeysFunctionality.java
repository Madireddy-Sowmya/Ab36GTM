package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement d=driver.findElement(By.id("fname"));
		d.sendKeys("myname");
		d.sendKeys(Keys.CONTROL+"a");
		d.sendKeys(Keys.CONTROL+"c");
		driver.get("https://grotechminds.com/registration/");
		WebElement g=driver.findElement(By.id("lname"));
		g.sendKeys(Keys.CONTROL+"v");
		

	}

}
