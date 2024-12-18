package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location_Cordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement a2=driver.findElement(By.linkText("India"));
		Point xandy= a2.getLocation();
		int x= xandy.getX();
		int y= xandy.getY();
		System.out.println(x);
		System.out.println(y);

	}

}
