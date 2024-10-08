package project_1;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_CheckOutPage 
{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement card_button;
	@FindBy(linkText="Enter card details")
	WebElement card_details;
	@FindBy(name="ApxSecureIframe")
	WebElement payment_frame;
	@FindBy(name="addCreditCardNumber")
	WebElement enter_cardnumber;
	@FindBy(name="ppw-accountHolderName")
	WebElement enter_acntholdername;
	@FindBy(name="ppw-expirationDate_month")
	WebElement exp_month;
	@FindBy(name="ppw-expirationDate_year")
	WebElement exp_year;
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement enter_button;
	@FindBy(name="ppw-widgetEvent:CancelAddCreditCardEvent")
	WebElement cancel_button;
	@FindBy(xpath="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']")
	WebElement paymode_COD;
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	WebElement Usethis_PayMode;

	
	public void CreditDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(card_button)).click();; // fasting moving to the next process
		//card_button.click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(card_details)).click();;
		//card_details.click();
		driver.switchTo().frame(payment_frame);
		enter_cardnumber.sendKeys("5241670123456789");
		enter_acntholdername.clear();
		enter_acntholdername.sendKeys("Ramesh M Bhatt");
		Select s1= new Select(exp_month);
		s1.selectByIndex(6);
		Select s2= new Select(exp_year);
		s2.selectByIndex(5);
		enter_button.click();
		//Thread.sleep(2000);
		cancel_button.click();
		driver.switchTo().defaultContent();
	}
	public void Select_CODPaymentMode()
	{
		
		//paymode_COD.click();
		//Usethis_PayMode.click();
		try 
		{
            wait.until(ExpectedConditions.elementToBeClickable(paymode_COD)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Usethis_PayMode)).click();
        } 
		catch (NoSuchElementException e) 
		{
            System.out.println("Error occurred while selecting COD payment: " + e.getMessage());
        }
		
	}
	
	public Amazon_CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

}
