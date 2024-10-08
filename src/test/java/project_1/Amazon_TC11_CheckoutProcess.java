package project_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(project_1.Listener_Program.class)
public class Amazon_TC11_CheckoutProcess extends Launch_Quit_Browser
{
	@Test(retryAnalyzer = project_1.RetryAnalyzer_Program.class)
	public void Proceed_to_Buy() throws InterruptedException
	{
		Amazon_HomePage HomePage= new Amazon_HomePage(driver);
		HomePage.Signin_Direct();
		
		Amazon_LoginPage loginpage = new Amazon_LoginPage(driver);
		loginpage.UserLogin();
		
		Amazon_SearchResultPage srp=new Amazon_SearchResultPage(driver);
		srp.ClickOnSearch();
		
		Amazon_ProductDetailsPage PD = new Amazon_ProductDetailsPage(driver);
		PD.selectproduct();
		PD.move_control(driver);
		PD.Buynow();
		
		Amazon_CheckOutPage cp= new Amazon_CheckOutPage(driver);
		cp.CreditDetails();
		cp.Select_CODPaymentMode();
	}

}
