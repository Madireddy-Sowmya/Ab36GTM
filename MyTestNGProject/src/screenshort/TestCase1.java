package screenshort;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 extends Launch_Quit {
	
	@Test
	public void s1()
	{
		System.out.println("TestCase1");
		Reporter.log("Test Case");
	}

}
