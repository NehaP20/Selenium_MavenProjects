package project_1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(project_1.Listener_Program.class)
public class Amazon_TC14_RatingsToLastProducts extends Launch_Quit_Browser
{
	@Test(retryAnalyzer = project_1.RetryAnalyzer_Program.class)
	public void rating()
	{
		Amazon_HomePage HomePage= new Amazon_HomePage(driver);
		HomePage.Signin_Direct();
		
		Amazon_LoginPage loginpage = new Amazon_LoginPage(driver);
																					loginpage.UserLogin("7030541173", "amazon.prime");
		Amazon_RatingPage ratings = new Amazon_RatingPage (driver);
		ratings.Rating_Product();
	
	}

}
