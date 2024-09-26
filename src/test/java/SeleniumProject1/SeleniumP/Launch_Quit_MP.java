package SeleniumProject1.SeleniumP;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit_MP {
	ChromeDriver driver;
	@BeforeMethod
	public void launching() 
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void Quit() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
