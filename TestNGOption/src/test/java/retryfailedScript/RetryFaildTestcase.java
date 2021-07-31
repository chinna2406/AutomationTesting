package retryfailedScript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFaildTestcase  implements IRetryAnalyzer{
	 int reTryCount=0;
	int maxRetry=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(reTryCount<maxRetry) {
			System.out.println(result.getName()+ " :Failed Test Method execute: "+(reTryCount+1));
			reTryCount++;
			return true;
		}
		return false;
	}

}
