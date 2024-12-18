package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyFunctionality2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement d=driver.findElement(By.id("fname"));
		d.sendKeys("myname");
		WebElement i=driver.findElement(By.id("Skills"));
		//i.click();
		i.sendKeys(Keys.ARROW_DOWN);
		i.sendKeys(Keys.ENTER);

	}

}
