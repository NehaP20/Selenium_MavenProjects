package project_1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amazon_SearchResultPage 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	@FindBy(partialLinkText="Get It by Tomorrow")
	WebElement deliveryday_checkbox;
	@FindBy(xpath="//span[.='Premium Brands']")
	WebElement brands_checkbox;
	@FindBy(xpath="//span[.='Medium (20 - 39 cm)']")
	WebElement bagWidth_checkbox;
	@FindBy(xpath="(//span[.='Leather'])[1]")
	WebElement material_checkbox;
	@FindBy(partialLinkText="Women's Top-Handle Bags")
	WebElement category;
	
	public void ClickOnSearch()
	{
		SearchBox.sendKeys("Handbags" + Keys.ENTER);
	}
	public void Applyfilters() throws InterruptedException
	{
		deliveryday_checkbox.click();
		//brands_checkbox.click();
		//bagWidth_checkbox.click();
		//material_checkbox.click();
		Thread.sleep(2000);
		category.click();
	}
	public Amazon_SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
