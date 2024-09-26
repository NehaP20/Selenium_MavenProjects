package SeleniumProject1.SeleniumP;

import org.testng.annotations.Test;

public class AmZ_TestCase1_HP extends AmZBrowser_LQ 
{
	@Test
	public void homepage() throws InterruptedException
	{
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage loginAmz = new Amz_LoginPage(driver);
		loginAmz.login_Amz();
		
		Amz_SearchResultPage srchng= new Amz_SearchResultPage(driver);
		srchng.search();
		
		Amz_ProductDescription product = new Amz_ProductDescription(driver);
		product.shoe_click();
	}

}
