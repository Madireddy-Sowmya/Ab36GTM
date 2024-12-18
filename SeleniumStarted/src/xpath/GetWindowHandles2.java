package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIzM6Bu_KghAMVQKRmAh33LA67EAAYASAAEgItEvD_BwE&gclsrc=aw.ds");
       // WebElement googlelink = driver.findElement(By.xpath("//span[.=\"Google\"]"));
       // WebElement googlelink = driver.findElement(By.xpath("//span[@class=icon-holder"]"));
      //span[@class="google-text"]
      //  googlelink.click();
        driver.manage().window().maximize();
        String Pid=driver.getWindowHandle();
        Set<String> Pcid=driver.getWindowHandles();
        System.out.println(Pid);
        System.out.println(Pcid);
        driver.close();
        
	}

}
