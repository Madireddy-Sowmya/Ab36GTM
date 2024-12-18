package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class If_Disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sony/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.id("121"));
		boolean ans = a1.isSelected();
		System.out.println(ans);          

	}

}
