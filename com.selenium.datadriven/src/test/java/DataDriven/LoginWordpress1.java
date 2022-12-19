package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.DashBoard;
import Pages.LoginPage;

public class LoginWordpress1 
{
	
	WebDriver driver;
	

	@Test(dataProvider="wordpress")
	public void verifyLogins(String username,String password)
	{
		
	  driver=BrowserFactory.getBrowser(driver, "chrome");
		
	  
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  
	  LoginPage login= PageFactory.initElements(driver, LoginPage.class);
	  
	  login.login_Wordpress(username, password);
	
	  DashBoard dash=PageFactory.initElements(driver, DashBoard.class);
	
	  dash.verifyHomeTitle();
	
	  BrowserFactory.closeBrowser(driver);

	
	}
	
	
	
	@DataProvider(name="wordpress")
	public Object[][] loginData()
	{
		
		System.out.println("Data Generation started");
		
		int rows=DataProviderFactory.getExcel().getRows(0);
		
		Object [][]arr=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			arr[i][0]=DataProviderFactory.getExcel().getStringData(0, i, 0);
			arr[i][1]=DataProviderFactory.getExcel().getStringData(0, i, 1);
		}
	
		
		System.out.println("Data Generation ended");
		
		return arr;
		
	}
	
	
}
