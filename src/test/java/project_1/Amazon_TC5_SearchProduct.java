package project_1;

import org.testng.annotations.Test;

public class Amazon_TC5_SearchProduct extends Launch_Quit_Browser
{
	@Test
	public void SearchProduct_filters() throws InterruptedException
	{
		Amazon_HomePage HomePage= new Amazon_HomePage(driver);
		HomePage.Signin_Direct();
		
		Amazon_LoginPage loginpage = new Amazon_LoginPage(driver);
		loginpage.UserLogin();
		
		Amazon_SearchResultPage srp=new Amazon_SearchResultPage(driver);
		srp.ClickOnSearch();
		srp.Applyfilters();
		Thread.sleep(2000);

	}
	

}
