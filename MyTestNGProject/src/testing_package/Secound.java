package testing_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Secound {
	
	@Test
	public static void addition()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
    