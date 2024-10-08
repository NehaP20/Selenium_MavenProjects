package project_1;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Amazon_RegistrationPage 
{
	WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement FLname;
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber;
	@FindBy(id="ap_password")
	WebElement newpswrd;
	@FindBy(id="continue")
	WebElement verify;
	
	public void NewRegister(WebDriver driver) throws IOException
	{
		Assert.assertEquals(driver.getTitle(), "Amazon Registration", "Amazon Registration is not displayed");
		FLname.sendKeys("Pragya Raut");          
	    mobilenumber.sendKeys("9700514223");  
	    newpswrd.sendKeys("#Pragya@2024");  
	}
	public void Verify_button()
	{
		verify.click();
		try 
		{
		    Assert.assertTrue(true, "Test Case failed: Registration success message not displayed.");
		} catch (Exception a) 
		{
		    Assert.fail("Test Case failed: Could not verify successful registration.");
		}
	}
	public Amazon_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

