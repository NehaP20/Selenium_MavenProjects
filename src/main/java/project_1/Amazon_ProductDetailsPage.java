package project_1;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amazon_ProductDetailsPage 
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	WebElement watch_select;
	@FindBy(xpath="//i[contains(@class,'a-icon a-icon-star')]")
	WebElement rating_display;
	@FindBy(xpath="(//span[@class='a-price-whole'])[2]")
	WebElement price_display;
	@FindBy(id="add-to-cart-button")
	WebElement cart_button;
	
	public void selectproduct()
	{
		watch_select.click();
		//rating_display.isDisplayed();
		//price_display.isDisplayed();
		//Assert.assertTrue(price_display.isDisplayed(), "Price display is not visible on the page.");
        System.out.println("Price display status: " + price_display.isDisplayed());
        System.out.println("Customer Ratings display status: " + rating_display.isDisplayed());
	
	}
	public void move_control(WebDriver driver) throws InterruptedException
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentid=(String) i1.next();
		String childid=(String) i1.next();
		System.out.println("Parent Window ID: " + parentid);
        System.out.println("Child Window ID: " + childid);
		driver.switchTo().window(childid);
	}
	public void addingtocart()
	{
		try
		{
			cart_button.click();
			System.out.println("Product added to cart successfully.");
		} catch (NoSuchElementException e) {
            System.out.println("Add to Cart button not found: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("Failed to add product to cart: " + e.getMessage());
        }
	}
	public Amazon_ProductDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
