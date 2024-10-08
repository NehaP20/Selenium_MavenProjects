package project_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Amazon_ManageProfilePage 
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='ya-card-cell'])[2]")
	WebElement editprofile;
	@FindBy(partialLinkText="Edit")
	WebElement editing;
	@FindBy(id="ap_customer_name")
	WebElement editname;
	@FindBy(id="cnep_1C_submit_button")
	WebElement savechanges;
	@FindBy(id="NAME_SUBTITLE")
    WebElement profileNameDisplay;
	
	public void editProfile()
	{
		editprofile.click();
		editing.click();
		editname.clear();
		editname.sendKeys("Neha Satish Patil");
		savechanges.click();
	}
	public void VerifyProfileUpdated(String expectedName)
	{
		String actualName=profileNameDisplay.getText();
		Assert.assertEquals(actualName, expectedName, "Profile name update failed!");
	}
	public Amazon_ManageProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
