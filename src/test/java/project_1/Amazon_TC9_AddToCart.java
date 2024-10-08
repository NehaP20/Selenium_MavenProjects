package project_1;

import org.testng.annotations.Test;

public class Amazon_TC9_AddToCart extends Launch_Quit_Browser
{
	@Test
	public void cart() throws InterruptedException
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
		PD.addingtocart();
		
		Amazon_AddtoCartPage cart = new Amazon_AddtoCartPage(driver);
		cart.Add_toCart();
		
	
		
	}
	
}
