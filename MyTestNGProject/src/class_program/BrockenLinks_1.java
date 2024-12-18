package class_program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLinks_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> list_links =driver.findElements(By.tagName("a"));
		int count = list_links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = list_links.get(i);
			String url = link.getAttribute("href");
			System.out.println(url);
			verify_the_link(url);//call here with parameter
		}

	}
	static void verify_the_link(String eachurl) throws IOException
	//we can make verify the link parameterized for taking each url
	{
		try
		{
		URL ul = new URL(eachurl);
		HttpURLConnection w1 =(HttpURLConnection) ul.openConnection();/*return type URLConnection this
		 URLConnection does not have the method with the help of which i can identify 
		 the status code of each that hasbeen hit that is why we have to upcaste this 
		 to the http URLConnection why we have to upcast means because it gives me lot
		  of options like getresponcecode with it referance veriable i can connect to 
		  the remote server */
		w1.connect();
		if(w1.getResponseCode()==200)
		{
			System.out.println("URL is valid"+ w1.getResponseCode()+ w1.getResponseMessage());
		}
		else
		{
			System.out.println("URL is Invalid"+ w1.getResponseCode()+ w1.getResponseMessage());
		}
		}
		catch(MalformedURLException a1)
		{
			System.out.println("I have handled this because some href's have null");
		}
	}

}
