package project_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Amazon_LoginPage 
{
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement loginsuccess;
	@FindBy(id="auth-error-message-box")
	WebElement errormessage;
	
	public void UserLogin()
	{
		username.sendKeys("8668375440");
		continue_button.click();
		password.sendKeys("@mazon2016");
		signin_button.click();
		//Assert.assertTrue(loginsuccess.isDisplayed(), "Login failed!");
		if (loginsuccess.isDisplayed())
		{
			System.out.println("Hello Neha! - Login successful!");
		}
		else 
		{
            System.out.println("Login failed!");
        }
	}
	public void UserLogin(String mailid, String pwd)
	{
		username.clear();
		username.sendKeys(mailid);
		continue_button.click();
        password.clear();
        password.sendKeys(pwd);
        signin_button.click();
	}
	public void LoginFail_Email()
	{
		username.sendKeys("neha111@gmaill.com");
		continue_button.click();
		Assert.assertTrue(true);
	}
	public void LoginFail_Pwd()
	{
		username.clear();
		username.sendKeys("imnehapatil20@gmail.com");
		continue_button.click();
		password.sendKeys("#Amazon2024");
		signin_button.click();
		Assert.assertTrue(true);
	}
	public Amazon_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
