package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_Enabled_Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement a1 = driver.findElement(By.id("fname"));
		boolean ansofdis = a1.isDisplayed();
		System.out.println(ansofdis);
		boolean ansofena = a1.isEnabled();
		System.out.println(ansofena);
		WebElement checkbox = driver.findElement(By.id("male"));
		boolean ansofsel = checkbox.isSelected();
		System.out.println(ansofsel);
		
		
		

	}  

}
