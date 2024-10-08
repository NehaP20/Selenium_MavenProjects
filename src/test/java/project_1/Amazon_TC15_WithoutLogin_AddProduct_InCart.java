package project_1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(project_1.Listener_Program.class)
public class Amazon_TC15_WithoutLogin_AddProduct_InCart extends Launch_Quit_Browser
{
	@Test(retryAnalyzer = project_1.RetryAnalyzer_Program.class)
	public void AddProduct_cart() throws InterruptedException
	{
	Amazon_SearchResultPage srp=new Amazon_SearchResultPage(driver);
	srp.ClickOnSearch();
	
	Amazon_ProductDetailsPage PD = new Amazon_ProductDetailsPage(driver);
	PD.selectproduct();
	PD.move_control(driver);
	PD.addingtocart();
	}

}
