package class_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> id =driver.findElements(By.tagName("div"));
		int count = id.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement id_get = id.get(i);
			String url = id_get.getAttribute("id");
			System.out.println(url);
		}
		

	}

}
