package testing_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Seven {
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("bs");
	}
	@Test
	public void addition()
	{
		System.out.println("a");
	}
	@Test
	public void substraction()
	{
		System.out.println("s");
	}
	@Test
	public void copy()
	{
		System.out.println("c");
	}
	@AfterMethod
	public void amm()
	{
		System.out.println("amm");	
	}

}
