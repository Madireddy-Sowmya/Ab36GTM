package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase6 {
	
	@DataProvider (name = "registerme")
	public Object [] [] method123()
	{
		Object [] [] o1= new Object [2] [4];
		o1 [0] [0] = "sowmya";
		o1 [0] [1] = "madireddy";
		o1 [0] [2] = "sowmyamadireddy91@gmail.com";
		o1 [0] [3] = "167r1a0430";
		o1 [1] [0] = "Divya";
		o1 [1] [1] = "Madireddy";
		o1 [1] [2] = "sowmyamadireddy91@gmail.com";
		o1 [1] [3] = "167r1a0430";

		return o1;
	}
	@Test(dataProvider="registerme")
	public void scenerio1234(String fname, String lname, String email, String pwd )
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement d=driver.findElement(By.id("fname"));
	d.sendKeys(fname);
	WebElement e=driver.findElement(By.id("lname"));
	e.sendKeys(lname);
	WebElement f=driver.findElement(By.id("email"));
	f.sendKeys(email);
	WebElement g=driver.findElement(By.id("password"));
	g.sendKeys(pwd);
	}

}
