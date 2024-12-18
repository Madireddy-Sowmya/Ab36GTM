package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement category =driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(category);
		//s1.selectByValue("search-alias=nowstore");
		s1.selectByVisibleText("Books");
		//s1.selectByIndex(10);

	}

}
