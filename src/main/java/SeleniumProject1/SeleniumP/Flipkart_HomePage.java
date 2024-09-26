package SeleniumProject1.SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_HomePage {
	WebDriver driver;
	
	@FindBy(linkText="Login")
	WebElement loginhoverover;
	
	@FindBy(linkText="Login")
	WebElement signup;
	
	public void loginhoverover(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(loginhoverover).perform();
	}
	
	public void signup() throws InterruptedException
	{
		Thread.sleep(4000);
		signup.click();
	}
	 
	public Flipkart_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
