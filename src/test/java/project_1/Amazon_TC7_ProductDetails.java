package project_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(project_1.Listener_Program.class)
public class Amazon_TC7_ProductDetails extends Launch_Quit_Browser
{
	@Test(retryAnalyzer = project_1.RetryAnalyzer_Program.class)
	public void ProductDescription() throws InterruptedException
	{
		Amazon_SearchResultPage srp=new Amazon_SearchResultPage(driver);
		srp.ClickOnSearch();
		
		Amazon_ProductDetailsPage PD = new Amazon_ProductDetailsPage(driver);
		PD.selectproduct();
		PD.move_control(driver);
	
	}

}
