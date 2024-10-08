package SeleniumProject1.SeleniumP;

import org.testng.annotations.Test;

public class AmZ_TestCase3_SR extends AmZBrowser_LQ 
{
	@Test
	public void searching() throws InterruptedException
	{
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage loginAmz = new Amz_LoginPage(driver);
		loginAmz.login_Amz();
		
		Amz_SearchResultPage srchng= new Amz_SearchResultPage(driver);
		srchng.search();

	}

}
