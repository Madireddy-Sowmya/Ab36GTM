package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement d=driver.findElement(By.linkText("Mobiles"));
		Actions a1 = new Actions(driver);
		a1.contextClick(d).perform();
		//AFTER THIS WE CANNOT DO WITH KEYS FUNCTINALITY, THERE IS OTHER WAY WHICH WE WILL COVER IN FUTURE TOPICS

	}

}
