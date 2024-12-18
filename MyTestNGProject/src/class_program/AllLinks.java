package class_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> list_links =driver.findElements(By.tagName("a"));
		int count = list_links.size();
		System.out.println(count);
	/*	for(int i=0;i<count;i++)
		{
			WebElement link = list_links.get(i);
			String url = link.getText();
			System.out.println(url);
		}*/
		for(int i=0;i<count;i++)
		{
			WebElement link = list_links.get(i);
			String url = link.getAttribute("href");
			//if(url == null) {
			System.out.println(url);
			//}
		}
		
		

	}

}
