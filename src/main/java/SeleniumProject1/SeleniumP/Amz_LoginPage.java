package SeleniumProject1.SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_LoginPage 
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
	public void login_Amz()
	{
		username.sendKeys("8668375440");
		continue_button.click();
																						password.sendKeys("@mazon2016");
		signin_button.click();
	}
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
