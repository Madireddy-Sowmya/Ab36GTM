package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getWindowHandle());

	}

}
