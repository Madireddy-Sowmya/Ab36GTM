package grouping_practice;

import org.testng.annotations.Test;

public class Group_Practice {
	
	@Test(groups= {"Smoke","System"})
	void testcase1()
	{
		System.out.println("1");
	}
	@Test(groups={"System"})
	void testcase2()
	{
		System.out.println("2");
	}
	@Test(groups= {"Smoke","System","Regression"})
	void testcase3()
	{
		System.out.println("3");
	}
	@Test(groups= {"Integration"})
	void testcase4()
	{
		System.out.println("4");
	}
	@Test(groups={"Smoke"})
	void testcase5()
	{
		System.out.println("5");
	}

}
