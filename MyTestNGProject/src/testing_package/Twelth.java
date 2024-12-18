package testing_package;

import org.testng.annotations.Test;

public class Twelth {
	@Test
	public void at()
	{
		System.out.println("at");
	}
	@Test(invocationCount=10)
	public void bt()
	{
		System.out.println("bt");
	}
	

}
