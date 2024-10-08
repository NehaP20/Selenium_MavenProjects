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
	}

}
