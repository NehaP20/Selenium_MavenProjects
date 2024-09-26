package SeleniumProject1.SeleniumP;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ProductDescription 
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]")
	WebElement shoe;
	
	/*Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();
	String parentid=(String) i1.next();
	String childid=(String) i1.next();*/
	
	public void shoe_click()
	{
		shoe.click();
	}
	public Amz_ProductDescription(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
