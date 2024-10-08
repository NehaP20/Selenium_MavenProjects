package project_1;

import org.testng.annotations.Test;

public class Amazon_TC4_ManageProfile extends Launch_Quit_Browser
{
	@Test
	public void editprofile()
	{
		Amazon_HomePage HP= new Amazon_HomePage(driver);
		HP.Signin_Direct();
		
		Amazon_LoginPage loginpage = new Amazon_LoginPage(driver);
		loginpage.UserLogin();
	
		Amazon_HomePage hp= new Amazon_HomePage(driver);
		hp.A_L_EditProfile();
		
		Amazon_ManageProfilePage accpage=new Amazon_ManageProfilePage(driver);
		accpage.editProfile();
		accpage.VerifyProfileUpdated("Neha Satish Patil");
	
	}
}
