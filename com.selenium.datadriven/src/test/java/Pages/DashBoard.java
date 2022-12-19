package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashBoard
{

	WebDriver driver;
	
	public DashBoard(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	public void verifyHomeTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}
	
	
}
