package testing_package;

import org.testng.annotations.Test;

public class Thirteenth {
	@Test
	public void and()
	{
		System.out.println("and");
	}
	@Test(priority=-1,invocationCount=10)
	public void bad()
	{
		System.out.println("at");
	}

}
