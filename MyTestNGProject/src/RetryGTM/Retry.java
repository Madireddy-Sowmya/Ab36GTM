package RetryGTM;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
    int retrytimes=1;
    int count=0;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retrytimes)
		{
			count++;
			return true;//retry the test case
		}
		
		return false;//don't retry the test case
	}

}
