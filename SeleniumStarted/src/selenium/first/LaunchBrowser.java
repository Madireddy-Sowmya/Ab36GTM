package selenium.first;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com ");
		driver.manage().window().maximize(); 
		driver.manage().window().minimize(); 
		Thread.sleep(3000);
		//driver.close();
		driver.quit();  

	}

}
