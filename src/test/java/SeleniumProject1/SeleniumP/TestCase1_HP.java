package SeleniumProject1.SeleniumP;

import org.testng.annotations.Test;

public class TestCase1_HP extends Launch_Quit_MP 
{
	@Test
	public void login_to_amazon() throws InterruptedException 
	{
	Flipkart_HomePage homepage = new Flipkart_HomePage(driver);
		homepage.loginhoverover(driver);
		homepage.signup();
	}

}
