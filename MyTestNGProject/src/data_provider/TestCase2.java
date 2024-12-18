package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {

	@DataProvider (name = "data2")
	public Object [] [] methodtostorevalue()
	{
		return new Object [] [] {{"Surya"},{"Manish"},{"Anjali"},{"Ramu"},{"Eeshan"},{"Nisha"},{"Monali"}};
	}
	@Test(dataProvider="data2")
	public void scenerio1(String data)
	{
		//System.out.println(data);
		String output = data.concat(" Student");
		System.out.println(output);
	}
	}
