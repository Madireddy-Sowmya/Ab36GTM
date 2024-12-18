package testing_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Five {
	@BeforeMethod
	public  void and()
	{
		System.out.println("BM");
	}
	@Test
	public void or()
	{
		System.out.println("or");
	} 
	@Test
	public void not()
	{
		System.out.println("not");
	}
	@AfterMethod
	public void in()
	{
		System.out.println("AM");
	}

}
