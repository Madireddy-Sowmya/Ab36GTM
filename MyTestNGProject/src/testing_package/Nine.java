package testing_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite; 
import org.testng.annotations.BeforeMethod;

public class Nine {
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuite");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("AfterClass");
	}
	@BeforeMethod
	public void bm()  
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod               
	public void am()
	{
		System.out.println("AfterMethod");
	}

}
