package project_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(project_1.Listener_Program.class)
public class Amazon_TC8_Products_SortedBy extends Launch_Quit_Browser 
{
	@Test(retryAnalyzer = project_1.RetryAnalyzer_Program.class)
	public void sorting() throws InterruptedException
	{
		Amazon_SearchResultPage srp=new Amazon_SearchResultPage(driver);
		srp.ClickOnSearch();
		
		Amazon_SortingPage sp= new Amazon_SortingPage(driver);
		sp.Sortby();
	}

}
