package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_AutomateMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement d=driver.findElement(By.id("fname"));
		d.sendKeys("Sowmya");
		WebElement e=driver.findElement(By.id("lname"));
		e.sendKeys("Pillarisetti");
		WebElement f=driver.findElement(By.id("Username"));
		f.sendKeys("smadire");
		WebElement g=driver.findElement(By.id("password"));
		g.sendKeys("M@the6666flash");
		WebElement h=driver.findElement(By.id("FeMale"));
		h.click();
		WebElement i=driver.findElement(By.id("Skills"));
		Select s1 = new Select(i);
		s1.selectByIndex(1);
		WebElement j=driver.findElement(By.id("Country"));
		Select s2 = new Select(j);
		s2.selectByIndex(8);
		WebElement k=driver.findElement(By.id("technicalskills"));
		Select s3 = new Select(k);
		s3.selectByIndex(1);
		WebElement l=driver.findElement(By.id("w3review"));
		l.sendKeys("plotn:7899,flat no:G1,sita residency,pani nagar,Hyderabad,telangana");
		WebElement m=driver.findElement(By.id("Address"));
		m.sendKeys("plotn:7899,flat no:G1,sita residency,pani nagar,Hyderabad,telangana");
		WebElement n=driver.findElement(By.id("Pincode"));
		n.sendKeys("500090");
		WebElement o=driver.findElement(By.id("Relegion"));
		Select s4 = new Select(o);
		s4.selectByIndex(1);
		WebElement p=driver.findElement(By.id("Agree"));
		p.click();
		WebElement resumeoption =driver.findElement(By.id("Resume"));
		resumeoption.sendKeys("C:\\Users\\sony\\Downloads\\Tirumala Tirupati Devasthanams(Official Booking Po_231229_134553.pdf");


	}

}
