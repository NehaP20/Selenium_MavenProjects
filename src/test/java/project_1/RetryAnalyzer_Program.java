package project_1;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryAnalyzer_Program implements IRetryAnalyzer
{
	int count=0;
	int retry_count=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<retry_count)
		{
			count++;
			return true;
		}
		return false;
	}
}
