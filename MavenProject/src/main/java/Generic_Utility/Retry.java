package Generic_Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int count=0;
	int retryLimit=3;
	public boolean retry(ITestResult result) {
		return false;
		
	}

}
