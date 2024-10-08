package project_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(project_1.Listener_Program.class)
public class Amazon_TC3_LoginFails extends Launch_Quit_Browser
{
	@Test
	public void LoginFail_Case()
	{
		Amazon_HomePage HomePage= new Amazon_HomePage(driver);
		HomePage.Signin_Direct();
		
		Amazon_LoginPage loginpage=new Amazon_LoginPage(driver);
		loginpage.LoginFail_Email();
		loginpage.LoginFail_Pwd();
		
		
	}

}
