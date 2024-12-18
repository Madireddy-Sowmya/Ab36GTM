package testing_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Six {
	@BeforeSuite
	public void be()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void at()
	{
		System.out.println("AfterTest");
	}
	@Test
	public void method1()
	{
		System.out.println("Test");
	}
	@Test
	public void zt()
	{
		System.out.println("zt");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("BeforeClass");
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
