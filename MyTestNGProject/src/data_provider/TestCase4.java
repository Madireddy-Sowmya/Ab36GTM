package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

public class TestCase4 {
	
	@DataProvider (name = "Login")
	public Object [] [] method123()
	{
		Object [] [] o1= new Object [2] [2];
		o1 [0] [0] = "sowmyamadireddy91@gmail.com";
		o1 [0] [1] = "M@the6666flash";
		o1 [1] [0] = "sowmyamadireddy92@gmail.com";
		o1 [1] [1] = "Anusha77";
		
		return o1;
	}
	@Test(dataProvider="Login")
	public void scenerio123(String un, String pwd)
	{

			// TODO Auto-generated method stub
			ChromeDriver driver= new ChromeDriver(); 
			driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3F&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0 ");
			driver.manage().window().maximize(); 
			driver.findElement(By.id("ap_email")).sendKeys(un);
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys(pwd);
			driver.findElement(By.id("signInSubmit")).click();




	}
	

}
