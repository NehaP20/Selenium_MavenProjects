package project_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Amazon_AddtoCartPage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@id='sw-gtc']")
	WebElement GotoCart;
	@FindBy(name="quantity")
	WebElement qty_add;
	@FindBy(xpath = "(//input[@value='Delete'])[3]")
	WebElement dlt_Button;
	public void Add_toCart()
	{
		GotoCart.click();
		
	}
	public void Quantities() throws InterruptedException
	{
		Select s2= new Select(qty_add);
		Thread.sleep(2000);
		s2.selectByIndex(5);
	}
	public void Removing_items() throws InterruptedException
	{
		dlt_Button.click(); 
		Thread.sleep(2000);
	}
	
	public Amazon_AddtoCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
