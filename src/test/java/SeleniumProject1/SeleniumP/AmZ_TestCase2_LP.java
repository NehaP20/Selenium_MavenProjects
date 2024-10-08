package SeleniumProject1.SeleniumP;

import org.testng.annotations.Test;

public class AmZ_TestCase2_LP extends AmZBrowser_LQ
{
	@Test
	public void login_amz() throws InterruptedException
	{
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage loginAmz = new Amz_LoginPage(driver);
		loginAmz.login_Amz();
		
	}

}
