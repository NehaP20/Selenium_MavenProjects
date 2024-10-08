package project_1;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amazon_AddtoCartPage 
{
	WebDriver driver;
	@FindBy(xpath="(//span[.=' Skip '])[3]")
	WebElement skipButton;
	@FindBy(partialLinkText="     Go to Cart")
	WebElement GotoCart;
	public void Add_toCart()
	{
		skipButton.click();
		try {
		GotoCart.click();
		}
		catch(StaleElementReferenceException a)
		{
			
		}
	}
	public void Quantities()
	{
		
	}
	public void Removing_items()
	{
		
	}
	
	public Amazon_AddtoCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
