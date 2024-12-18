package ddt;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotProgram {
	
	@Test
	public void testcase1() throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot ts1 = driver;
		File source=ts1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sony\\eclipse-workspace\\MyTestNGProject\\Screenshots\\Sowmya1.png");
		FileUtils.copyFile(source, destination);
	}

}
