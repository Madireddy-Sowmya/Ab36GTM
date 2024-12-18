package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase11 {
ChromeDriver driver;
	public void quit() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		TakesScreenshot ts1 = driver;
		File source=ts1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sony\\eclipse-workspace\\MyTestNGProject\\FailedScreenshots\\Sow"+Math.random()+".png");
		FileUtils.copyFile(source, destination);
	}

}
