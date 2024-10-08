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
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[3]")
	WebElement Stick;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement Wishlist;
	@FindBy(linkText = "View Your List")
	WebElement Viewlist;
	public void product_click()
	{
		Stick.click();
	}
	public void move_control(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentid=(String) i1.next();
		String childid=(String) i1.next();
		System.out.println(parentid);
        System.out.println(childid);
		driver.switchTo().window(childid);
	}
	public void add_to_wishlist()
	{
		Wishlist.click();
		Viewlist.click();
	}
	public Amz_ProductDescription(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
