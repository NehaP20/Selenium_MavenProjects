package project_1;

import org.testng.annotations.Test;

public class Amazon_TC2_LoginSuccessful extends Launch_Quit_Browser
{
	@Test
	public void NewUserLogin()
	{
		Amazon_HomePage HomePage= new Amazon_HomePage(driver);
		HomePage.Signin_Direct();
		
		Amazon_LoginPage loginpage = new Amazon_LoginPage(driver);
		loginpage.UserLogin();
	}

}
