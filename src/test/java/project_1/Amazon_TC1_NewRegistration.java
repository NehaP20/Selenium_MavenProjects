package project_1;
import org.testng.annotations.Test;
import java.io.IOException;
public class Amazon_TC1_NewRegistration extends Launch_Quit_Browser
{
	@Test
	public void Registration() throws IOException
	{
		Amazon_HomePage homepage= new Amazon_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.NewCustomer();
		
		Amazon_RegistrationPage RegPage = new Amazon_RegistrationPage(driver);
		RegPage.NewRegister(driver);
		RegPage.Verify_button();
	}
}
