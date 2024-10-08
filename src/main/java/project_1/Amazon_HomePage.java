package project_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amazon_HomePage 
{
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1") // HoverOver to Accounts&list
	WebElement accountsandlist;
	@FindBy(linkText= "Start here.") // CLick on Start here for new registration
	WebElement StartHere;
	@FindBy(partialLinkText="Sign in")
	WebElement DirectSignin;
	
	public void accountandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsandlist).perform(); // syntax of HoverOver
	}
	public void NewCustomer()
	{
		StartHere.click();;
	}
	public void Signin_Direct()
	{
		DirectSignin.click();
	}
	public void A_L_EditProfile()
	{
		accountsandlist.click();
	}
	
	public Amazon_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
