package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@DataProvider(name = "data1")
	public Object [][] dataforstringfunction ()
	{
		return  new Object[] [] {{16},{20},{30}};
	}
	@Test(dataProvider="data1")
	public void scenerio1(int data)
	{
		 // System.out.println(data);
		  int sum = data+100;
		  System.out.println(sum);
	}

}


