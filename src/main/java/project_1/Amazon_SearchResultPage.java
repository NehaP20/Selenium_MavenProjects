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
	@FindBy(xpath="(//span[.='Casio'])[15]")
	WebElement brands_checkbox;
	@FindBy(xpath="//span[.='Digital']")
	WebElement display_checkbox;
	@FindBy(xpath="(//span[.='Rose Gold'])[1]")
	WebElement material_checkbox;
	@FindBy(partialLinkText="Women's Watches")
	WebElement category;
	
	public void ClickOnSearch()
	{
		SearchBox.sendKeys("watches" + Keys.ENTER);
	}
	public void Applyfilters() throws InterruptedException
	{
		deliveryday_checkbox.click();
		//brands_checkbox.click();
		display_checkbox.click();
		//material_checkbox.click();
		Thread.sleep(2000);
		category.click();
	}
	
	/*public void RangePrice()
	{
		Point p1=Pricerange.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(40,0)");
	}*/
	
    
	public Amazon_SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
