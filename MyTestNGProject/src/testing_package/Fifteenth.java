package testing_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Fifteenth {
	ChromeDriver dr;
	@BeforeMethod
	public void lunch() throws InterruptedException
	{
		dr = new ChromeDriver();
		dr.get("https://www.amazon.in");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void quit()
	{
		dr.quit();
	}

}
