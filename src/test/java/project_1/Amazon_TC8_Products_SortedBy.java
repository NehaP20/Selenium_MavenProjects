package project_1;

import org.testng.annotations.Test;

public class Amazon_TC8_Products_SortedBy extends Launch_Quit_Browser 
{
	@Test
	public void sorting() throws InterruptedException
	{
		Amazon_SearchResultPage srp=new Amazon_SearchResultPage(driver);
		srp.ClickOnSearch();
		
		Amazon_SortingPage sp= new Amazon_SortingPage(driver);
		sp.Sortby();
	}

}
