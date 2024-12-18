package xpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWHS_Ngmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=EAIaIQobChMIlvqa4PG7gwMVjKNmAh02JQwQEAAYASAAEgK6tfD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='google-text']")).click();


	}

}
