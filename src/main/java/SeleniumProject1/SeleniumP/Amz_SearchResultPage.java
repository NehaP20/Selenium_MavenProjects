package SeleniumProject1.SeleniumP;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_SearchResultPage 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchproduct;
	public void search()
	{
		searchproduct.sendKeys("Fire TV" + Keys.ENTER);
		
	}
	public Amz_SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
