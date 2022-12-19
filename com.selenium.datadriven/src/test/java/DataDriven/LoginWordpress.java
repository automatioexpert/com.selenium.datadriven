package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Pages.DashBoard;
import Pages.LoginPage;

public class LoginWordpress 
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
		
		Object [][]arr=new Object[2][2];
		arr[0][0]="admin";
		arr[0][1]="demo123";
		arr[1][0]="admin1";
		arr[1][1]="demo124";
		
		System.out.println("Data Generation ended");
		
		return arr;
		
	}
	
	
}
