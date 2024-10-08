package project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_SortingPage 
{
	WebDriver driver;
	@FindBy(id="s-result-sort-select")
	WebElement sortby;
	
	public void Sortby() throws InterruptedException
	{
		Select s1=new Select(sortby);
		s1.selectByVisibleText("Newest Arrivals");
		Thread.sleep(2000);
		s1.selectByIndex(3);
	}
	public Amazon_SortingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
