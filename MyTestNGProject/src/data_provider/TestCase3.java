package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@DataProvider (name = "data2")
	public Object [] [] methodtostorevalue()
	{
		return new Object [] [] {{'S'},{'M'},{'A'},{'R'},{'E'},{'N'},{'M'}};
	}
	@Test(dataProvider="data2")
	public void scenerio1(char data)
	{
		System.out.println(data);
	}
	

}
