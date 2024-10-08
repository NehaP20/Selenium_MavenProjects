package project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_RatingPage 
{
	WebDriver driver;
	@FindBy(partialLinkText="& Orders")
	WebElement orders;
	@FindBy(id="a-autoid-13")
	WebElement product_review;
	@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
	WebElement rate_5star;
	@FindBy(id="scarface-review-title-label")
	WebElement headline;
	@FindBy(id="scarface-review-text-card-title")
	WebElement write_review;
	@FindBy(xpath="//button[@value='Submit']")
	WebElement submitButton;
	@FindBy(xpath="(//span[.='Review submitted - Thank you!'])[2]")
	WebElement submitMessage_alert;

	public void Rating_Product()
	{
		orders.click();
		product_review.click();
		rate_5star.click();
		headline.clear();
		headline.sendKeys("FormalShoes");
		write_review.clear();
		write_review.sendKeys("Thank you for such comfortable shoes.");
		submitButton.click();
		Assert.assertEquals(submitMessage_alert.isDisplayed(), true, "Review Submitted Message is not displayed");
		//System.out.println("Review Submitted Message status: " + submitMessage_alert.isDisplayed());
	}
	public Amazon_RatingPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
